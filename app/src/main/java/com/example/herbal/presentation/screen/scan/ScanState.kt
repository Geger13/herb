package com.example.herbal.presentation.screen.scan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class ScanState {
    object Idle : ScanState()
    object LoadingIdentifyPlantName : ScanState()
    data class Success(val result: ScanResult) : ScanState()
    data class Error(val message: String) : ScanState()
}
@Parcelize
data class ScanResult(
    val plantId: String,
    val plantName: String,
    val desc: String,
    val imageResId: Int
) : Parcelable