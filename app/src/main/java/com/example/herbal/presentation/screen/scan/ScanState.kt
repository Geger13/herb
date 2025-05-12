package com.example.herbal.presentation.screen.scan

sealed class ScanState {
    object Idle : ScanState()
    object LoadingIdentifyPlantName : ScanState()
    data class ScanResult(
        val plantName: String,
        val desc: String,
        val imageResId: Int
    ) : ScanState()
    data class Error(val message: String) : ScanState()
}



