package com.example.herbal.presentation.screen.scan

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.herbal.data.datastore.myHerbData
import com.example.herbal.presentation.screen.information.HerbInformation

@Composable
fun MyHerbScreen(herbId: String) {
    val herb = myHerbData.find { it.id == herbId }

    herb?.let {
        HerbInformation(herbData = it)
    } ?: run {
        Text(
            text = "Data tidak ditemukan",
            fontSize = 18.sp,
            modifier = Modifier.padding(16.dp)
        )
    }
}
