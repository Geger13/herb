package com.example.herbal.presentation.screen.scan

import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.view.CameraController
import androidx.camera.view.LifecycleCameraController
import androidx.compose.foundation.Image
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toFile
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.herbal.R
import com.example.herbal.presentation.navigation.Screen


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

    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        uri?.let { viewModel.selectedImageUri(it) }
    }

    Column(modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(0.85f).fillMaxWidth()) {
            if (selectedImageUri != null) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = rememberAsyncImagePainter(model = selectedImageUri),
                    contentDescription = null
                )
            } else {
                CameraPreview(controller = controller, modifier = Modifier.fillMaxSize())
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = null,
                            tint = Color.Red,
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
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            }
        }

        CameraBottomMenu(
            modifier = Modifier.weight(0.15f),
            launcher = launcher,
            selectedImageUri = selectedImageUri,
            navController = navController,
            viewModel = viewModel,
            applicationContext = context
        )

        when (val state = scanState) {
            is ScanState.Idle -> {}
            is ScanState.LoadingIdentifyPlantName -> {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularProgressIndicator(modifier = Modifier.size(48.dp))
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Sedang mengenali nama tanaman...", fontSize = 18.sp)
                }
            }

            is ScanState.ScanResult -> {
                val result = state
                // Langsung arahkan ke Informasi screen dengan parameter state
                LaunchedEffect(result) {
                    navController.currentBackStackEntry?.savedStateHandle?.set("scanResult", result)
                    navController.navigate(Screen.Informasi.route)
                }
            }

            is ScanState.Error -> {
                Toast.makeText(context, state.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

@Composable
fun CameraBottomMenu(
    modifier: Modifier,
    launcher: ManagedActivityResultLauncher<String, Uri?>,
    selectedImageUri: Uri?,
    navController: NavHostController,
    viewModel: ScanViewModel,
    applicationContext: Context
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_galleryblack),
                contentDescription = null,
                modifier = Modifier
                    .size(45.dp)
                    .clickable { launcher.launch("image/*") }
            )
            Text("Gallery", fontSize = 16.sp)
        }

        Image(
            painter = painterResource(
                id = if (selectedImageUri != null) R.drawable.ic_checkcircle else R.drawable.ic_scan2
            ),
            contentDescription = null,
            modifier = Modifier
                .size(68.dp)
                .clickable {
                    selectedImageUri?.toFile()?.let { file ->
                        viewModel.scanPlant(file)
                    }
                }
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_instruksi),
                contentDescription = null,
                modifier = Modifier
                    .size(45.dp)
                    .clickable { navController.navigate(Screen.Instruksi.route) }
            )
            Text("Instruksi", fontSize = 16.sp)
        }
    }
}



