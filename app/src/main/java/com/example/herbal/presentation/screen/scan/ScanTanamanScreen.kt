package com.example.herbal.presentation.screen.scan

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.view.CameraController
import androidx.camera.view.LifecycleCameraController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cameraswitch
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.herbal.R
import com.example.herbal.presentation.navigation.Screen
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionStatus
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun RequestPermissions(
    onPermissionsGranted: @Composable () -> Unit
) {
    val context = LocalContext.current

    val storagePermission = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        android.Manifest.permission.READ_MEDIA_IMAGES
    } else {
        android.Manifest.permission.READ_EXTERNAL_STORAGE
    }

    val permissionsToRequest = listOf(
        android.Manifest.permission.CAMERA,
        storagePermission
    )

    val permissionsState = rememberMultiplePermissionsState(
        permissions = permissionsToRequest
    )

    LaunchedEffect(Unit) {
        if (!permissionsState.allPermissionsGranted) {
            permissionsState.launchMultiplePermissionRequest()
        }
    }

    if (permissionsState.allPermissionsGranted) {
        onPermissionsGranted()
    } else {
        val permanentlyDenied = permissionsState.permissions.any { permission ->
            val currentStatus = permission.status
            currentStatus is PermissionStatus.Denied && !currentStatus.shouldShowRationale
        }

        Box(
            Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = if (permanentlyDenied) {
                        "Izin kamera dan galeri telah ditolak secara permanen. Mohon aktifkan secara manual di pengaturan aplikasi untuk menggunakan fitur ini."
                    } else {
                        "Aplikasi ini membutuhkan izin Kamera dan Akses Galeri untuk memindai tanaman. Mohon berikan izin untuk melanjutkan."
                    },
                    textAlign = TextAlign.Center,
                )

                Button(onClick = {
                    permissionsState.launchMultiplePermissionRequest()
                }) {
                    Text(if (permanentlyDenied) "Coba Minta Lagi" else "Berikan Izin")
                }

                if (permanentlyDenied) {
                    Button(onClick = {
                        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                        val uri = Uri.fromParts("package", context.packageName, null)
                        intent.data = uri
                        context.startActivity(intent)
                    }) {
                        Text("Buka Pengaturan Aplikasi")
                    }
                }
            }
        }
    }
}


@Composable
fun ScanTanamanScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    viewModel: ScanViewModel
) {
    val context = LocalContext.current
    val selectedImageUri by viewModel.selectedImageUri.collectAsState()
    val scanState by viewModel.scanState.collectAsState()

    val controller = remember {
        LifecycleCameraController(context).apply {
            setEnabledUseCases(CameraController.IMAGE_CAPTURE)
        }
    }

    val galleryLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        uri?.let { viewModel.setSelectedImageUri(it) }
    }

    RequestPermissions(
        onPermissionsGranted = {
            ScanContent(
                modifier = modifier,
                navController = navController,
                viewModel = viewModel,
                context = context,
                controller = controller,
                galleryLauncher = galleryLauncher,
                selectedImageUri = selectedImageUri,
                scanState = scanState
            )
        }
    )

    LaunchedEffect(scanState) {
        when (val state = scanState) {
            is ScanState.Success -> {
                val result = state.result
                Toast.makeText(context, "Tanaman Dikenali: ${result.plantName}", Toast.LENGTH_SHORT).show()
                navController.navigate(Screen.Informasi.route + "/${result.plantId}") {
                    popUpTo(Screen.Informasi.route) { inclusive = true }
                }
                viewModel.resetScanState() // Reset state setelah navigasi
            }
            is ScanState.Error -> {
                Toast.makeText(context, state.message, Toast.LENGTH_LONG).show()
                viewModel.resetScanState() // Reset state setelah error
            }
            else -> {

            }
        }
    }
}

@Composable
fun ScanContent(
    modifier: Modifier,
    navController: NavHostController,
    viewModel: ScanViewModel,
    context: Context,
    controller: LifecycleCameraController,
    galleryLauncher: ManagedActivityResultLauncher<String, Uri?>,
    selectedImageUri: Uri?,
    scanState: ScanState
) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(0.85f).fillMaxWidth()) {
                if (selectedImageUri != null) {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = rememberAsyncImagePainter(model = selectedImageUri),
                        contentDescription = "Gambar Terpilih",
                        contentScale = ContentScale.Crop
                    )
                    IconButton(
                        onClick = { viewModel.setSelectedImageUri(null) },
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(16.dp)
                            .background(Color.Black.copy(alpha = 0.5f), shape = androidx.compose.foundation.shape.CircleShape)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Batal",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                } else {
                    CameraPreview(controller = controller, modifier = Modifier.fillMaxSize())

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.TopCenter) // Pindahkan ke atas
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Tutup",
                                tint = Color.White,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        IconButton(onClick = {
                            controller.cameraSelector =
                                if (controller.cameraSelector == CameraSelector.DEFAULT_BACK_CAMERA)
                                    CameraSelector.DEFAULT_FRONT_CAMERA
                                else
                                    CameraSelector.DEFAULT_BACK_CAMERA
                        }) {
                            Icon(
                                imageVector = Icons.Default.Cameraswitch,
                                contentDescription = "Ganti Kamera",
                                tint = Color.White,
                                modifier = Modifier.size(28.dp)
                            )
                        }
                    }
                }
            }

            CameraBottomMenu(
                modifier = Modifier.weight(0.15f),
                galleryLauncher = galleryLauncher,
                selectedImageUri = selectedImageUri,
                navController = navController,
                viewModel = viewModel,
                controller = controller,
                context = context,
                isLoading = scanState is ScanState.LoadingIdentifyPlantName
            )
        }

        if (scanState is ScanState.LoadingIdentifyPlantName) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f)),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    CircularProgressIndicator(modifier = Modifier.size(48.dp), color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Sedang mengenali nama tanaman...", fontSize = 18.sp, color = Color.White)
                }
            }
        }
    }
}


@Composable
fun CameraBottomMenu(
    modifier: Modifier,
    galleryLauncher: ManagedActivityResultLauncher<String, Uri?>,
    selectedImageUri: Uri?,
    navController: NavHostController,
    viewModel: ScanViewModel,
    controller: LifecycleCameraController,
    context: Context,
    isLoading: Boolean
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_galleryblack), // Pastikan drawable ini ada
                contentDescription = "Gallery",
                modifier = Modifier
                    .size(45.dp)
                    .clickable(enabled = !isLoading) {
                        galleryLauncher.launch("image/*")
                    }
            )
            Text("Gallery", fontSize = 16.sp)
        }

        Image(
            painter = painterResource(
                id = if (selectedImageUri != null) R.drawable.ic_checkcircle else R.drawable.ic_scan2 // Pastikan drawable ini ada
            ),
            contentDescription = if (selectedImageUri != null) "Identifikasi" else "Ambil Gambar",
            modifier = Modifier
                .size(68.dp)
                .clickable(enabled = !isLoading) {
                    if (selectedImageUri == null) {
                        takePicture(context, controller) { uri ->
                            viewModel.setSelectedImageUri(uri)
                        }
                    } else {
                        copyUriToFile(context, selectedImageUri)?.let { file ->
                            viewModel.scanPlant(file)
                        } ?: Toast
                            .makeText(context, "Gagal memproses gambar.", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_instruksi), // Pastikan drawable ini ada
                contentDescription = "Instruksi",
                modifier = Modifier
                    .size(45.dp)
                    .clickable(enabled = !isLoading) {
                        navController.navigate(Screen.Instruksi.route) // Pastikan route ini ada
                    }
            )
            Text("Instruksi", fontSize = 16.sp)
        }
    }
}

fun takePicture(
    context: Context,
    controller: LifecycleCameraController,
    onImageCaptured: (Uri) -> Unit
) {
    val photoFile = File(
        context.cacheDir,
        "camera_image_${System.currentTimeMillis()}.jpg"
    )
    val outputOptions = ImageCapture.OutputFileOptions.Builder(photoFile).build()

    controller.takePicture(
        outputOptions,
        ContextCompat.getMainExecutor(context),
        object : ImageCapture.OnImageSavedCallback {
            override fun onImageSaved(outputFileResults: ImageCapture.OutputFileResults) {
                outputFileResults.savedUri?.let {
                    onImageCaptured(it)
                } ?: Toast.makeText(context, "Gagal menyimpan gambar.", Toast.LENGTH_SHORT).show()
            }

            override fun onError(exception: ImageCaptureException) {
                Toast.makeText(context, "Gagal mengambil gambar: ${exception.message}", Toast.LENGTH_SHORT).show()
                Log.e("Camera", "Gagal mengambil gambar", exception)
            }
        }
    )
}

fun copyUriToFile(context: Context, uri: Uri): File? {
    var inputStream: InputStream? = null
    var outputStream: OutputStream? = null
    return try {
        inputStream = context.contentResolver.openInputStream(uri)
        if (inputStream == null) return null

        val file = File(context.cacheDir, "temp_image_${System.currentTimeMillis()}.jpg")
        outputStream = FileOutputStream(file)

        inputStream.copyTo(outputStream)
        file
    } catch (e: IOException) {
        Log.e("CopyUri", "Gagal menyalin URI ke File", e)
        null
    } finally {
        try {
            inputStream?.close()
            outputStream?.close()
        } catch (e: IOException) {
            Log.e("CopyUri", "Gagal menutup stream", e)
        }
    }
}

