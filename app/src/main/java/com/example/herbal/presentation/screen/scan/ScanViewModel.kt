package com.example.herbal.presentation.screen.scan

import android.app.Application
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.herbal.data.datastore.myHerbData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.tensorflow.lite.Interpreter
import java.io.File
import java.io.FileInputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel

class ScanViewModel(
    application: Application,
) : AndroidViewModel(application) {

    private val context = application.applicationContext

    private val _selectedImageUri = MutableStateFlow<Uri?>(null)
    val selectedImageUri: StateFlow<Uri?> = _selectedImageUri.asStateFlow()

    private val _scanState = MutableStateFlow<ScanState>(ScanState.Idle)
    val scanState: StateFlow<ScanState> = _scanState.asStateFlow()

    private var tflite: Interpreter? = null

    init {
        viewModelScope.launch {
            try {
                val modelBuffer = loadModelFile("plant_model.tflite")
                tflite = Interpreter(modelBuffer)
            } catch (e: Exception) {
                Log.e("ScanViewModel", "Gagal memuat model", e)
                _scanState.value = ScanState.Error("Gagal memuat model: ${e.message}")
            }
        }
    }

    fun setSelectedImageUri(uri: Uri?) {
        _selectedImageUri.value = uri
        if (uri == null) {
            _scanState.value = ScanState.Idle
        }
    }

    fun scanPlant(imageFile: File) {
        val currentInterpreter = tflite
        if (currentInterpreter == null) {
            _scanState.value = ScanState.Error("Model belum siap atau gagal dimuat.")
            return
        }

        viewModelScope.launch {
            val startTime = System.currentTimeMillis()

            try {
                _scanState.value = ScanState.LoadingIdentifyPlantName

                val bitmap = BitmapFactory.decodeFile(imageFile.absolutePath)
                if (bitmap == null) {
                    _scanState.value = ScanState.Error("Gagal memuat gambar dari file.")
                    return@launch
                }

                val resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true)
                val inputBuffer = convertBitmapToByteBuffer(resizedBitmap)
                val output = Array(1) { FloatArray(25) }

                currentInterpreter.run(inputBuffer, output)

                val detectionTime = System.currentTimeMillis() - startTime
                Log.d("ScanPerformance", "Waktu yang dibutuhkan untuk deteksi: ${detectionTime} ms")

                Log.d("ScanDebug", "Model output: ${output[0].contentToString()}")

                val predictedIndex = output[0].indices.maxByOrNull { output[0][it] } ?: -1
                val confidence = if (predictedIndex != -1) output[0][predictedIndex] else -1.0f

                Log.d("Predict", "Index: $predictedIndex, Confidence: $confidence")

                val confidenceThreshold = 0.7f

                if (predictedIndex != -1 && confidence >= confidenceThreshold) {
                    val herb = myHerbData.getOrNull(predictedIndex)

                    if (herb != null) {
                        val result = ScanResult(
                            plantId = herb.id,
                            plantName = herb.name,
                            desc = herb.desc,
                            imageResId = herb.image
                        )
                        _scanState.value = ScanState.Success(result)
                        Log.d("Predict", "Terdeteksi - Index: $predictedIndex, Confidence: ${confidence * 100}%")
                    } else {
                        Log.w("ScanViewModel", "Index prediksi ($predictedIndex) ditemukan tapi tidak ada di myHerbData.")
                        _scanState.value = ScanState.Error("Tanaman tidak dikenali (Data tidak ditemukan).")
                    }
                } else {
                    Log.d("Predict", "Tidak Terdeteksi (Confidence: ${confidence * 100}%)")
                    _scanState.value = ScanState.Error("Tanaman tidak dapat dikenali (Kepercayaan rendah).")
                }

            } catch (e: Exception) {
                Log.e("ScanViewModel", "Terjadi kesalahan saat scan", e)
                _scanState.value = ScanState.Error("Terjadi kesalahan saat scan: ${e.message}")
            } finally {
                imageFile.delete()
            }
        }
    }

    fun resetScanState() {
        _scanState.value = ScanState.Idle
    }

    private fun loadModelFile(modelName: String): MappedByteBuffer {
        val assetFileDescriptor = context.assets.openFd(modelName)
        return FileInputStream(assetFileDescriptor.fileDescriptor).use { inputStream ->
            val fileChannel = inputStream.channel
            fileChannel.map(
                FileChannel.MapMode.READ_ONLY,
                assetFileDescriptor.startOffset,
                assetFileDescriptor.declaredLength
            )
        }
    }

    private fun convertBitmapToByteBuffer(bitmap: Bitmap): ByteBuffer {
        val inputSize = 224
        val byteBuffer = ByteBuffer.allocateDirect(4 * inputSize * inputSize * 3)
        byteBuffer.order(ByteOrder.nativeOrder())

        val intValues = IntArray(inputSize * inputSize)
        bitmap.getPixels(intValues, 0, bitmap.width, 0, 0, bitmap.width, bitmap.height)

        byteBuffer.rewind()
        for (pixelValue in intValues) {
            byteBuffer.putFloat(((pixelValue shr 16) and 0xFF) / 255.0f)
            byteBuffer.putFloat(((pixelValue shr 8) and 0xFF) / 255.0f)
            byteBuffer.putFloat((pixelValue and 0xFF) / 255.0f)
        }
        byteBuffer.rewind()
        return byteBuffer
    }

    override fun onCleared() {
        super.onCleared()
        tflite?.close()
        tflite = null
    }
}