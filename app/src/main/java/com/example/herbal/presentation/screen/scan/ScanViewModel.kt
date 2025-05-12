package com.example.herbal.presentation.screen.scan

import android.app.Application
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.compose.foundation.layout.height
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.herbal.data.datastore.myHerbData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.tensorflow.lite.Interpreter
import java.io.File
import java.io.FileInputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel


class ScanViewModel(application: Application) : AndroidViewModel(application) {

    private val context = application.applicationContext

    private val _selectedImageUri = MutableStateFlow<Uri?>(null)
    val selectedImageUri: StateFlow<Uri?> = _selectedImageUri

    private val _scanState = MutableStateFlow<ScanState>(ScanState.Idle)
    val scanState: StateFlow<ScanState> = _scanState

    private lateinit var tflite: Interpreter

    init {
        try {
            val modelBuffer = loadModelFile("plant_model.tflite")
            tflite = org.tensorflow.lite.Interpreter(modelBuffer)
        } catch (e: Exception) {
            _scanState.value = ScanState.Error("Gagal memuat model: ${e.message}")
        }
    }

    fun selectedImageUri(uri: Uri) {
        _selectedImageUri.value = uri
    }

    fun scanPlant(imageFile: File) {
        viewModelScope.launch {
            try {
                _scanState.value = ScanState.LoadingIdentifyPlantName

                val bitmap = BitmapFactory.decodeFile(imageFile.absolutePath)
                val resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true)
                val inputBuffer = convertBitmapToByteBuffer(resizedBitmap)
                val output = Array(1) { FloatArray(myHerbData.size) }

                tflite.run(inputBuffer, output)

                val predictedIndex = output[0].indices.maxByOrNull { output[0][it] } ?: -1
                val herb = myHerbData.getOrNull(predictedIndex)

                if (herb != null) {
                    _scanState.value = ScanState.ScanResult(
                        plantName = herb.name,
                        desc = herb.desc,
                        imageResId = herb.image
                    )
                } else {
                    _scanState.value = ScanState.Error("Tanaman tidak dikenali.")
                }

            } catch (e: Exception) {
                _scanState.value = ScanState.Error("Terjadi kesalahan saat scan: ${e.message}")
            }
        }
    }

    private fun loadModelFile(modelName: String): MappedByteBuffer {
        val assetFileDescriptor = context.assets.openFd(modelName)
        val fileInputStream = FileInputStream(assetFileDescriptor.fileDescriptor)
        val fileChannel = fileInputStream.channel
        return fileChannel.map(
            FileChannel.MapMode.READ_ONLY,
            assetFileDescriptor.startOffset,
            assetFileDescriptor.declaredLength
        )
    }

    private fun convertBitmapToByteBuffer(bitmap: Bitmap): ByteBuffer {
        val inputSize = 224 // Ukuran input yang sesuai dengan model
        val inputBuffer = ByteBuffer.allocateDirect(4 * inputSize * inputSize * 3)
        inputBuffer.order(ByteOrder.nativeOrder())

        val intValues = IntArray(inputSize * inputSize)
        bitmap.getPixels(intValues, 0, bitmap.width, 0, 0, bitmap.width, bitmap.height)

        for (pixelValue in intValues) {
            val r = (pixelValue shr 16 and 0xFF) / 255.0f
            val g = (pixelValue shr 8 and 0xFF) / 255.0f
            val b = (pixelValue and 0xFF) / 255.0f

            inputBuffer.putFloat(r)
            inputBuffer.putFloat(g)
            inputBuffer.putFloat(b)
        }

        return inputBuffer
    }
}



