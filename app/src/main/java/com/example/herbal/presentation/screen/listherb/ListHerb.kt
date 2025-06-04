package com.example.herbal.presentation.screen.listherb

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.presentation.components.InformationCard
import com.example.herbal.presentation.navigation.Screen

val SurfaceBase = Color.White

@Composable
fun ListHerb(
    navController: NavHostController,
    listHerbViewModel: ListHerbViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    val herbList by listHerbViewModel.herbList.collectAsState()
    val query by listHerbViewModel.query.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(SurfaceBase)
            .padding(horizontal = 16.dp)
    ) {
        if (herbList.isEmpty() && query.isNotEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Tidak ada hasil pencarian untuk \"$query\"",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )
            }
        } else {
            ListHerbComp(herbList, navController)
        }
    }
}

@Composable
fun ListHerbComp (
    herbList: List<MyHerbData>,
    navController: NavHostController
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(herbList, key = { it.id }) { herb ->
            InformationCard(
                modifier = Modifier.clickable {
                    navController.navigate(Screen.Informasi.createRoute(herb.id))
                },
                title = herb.name,
                image = herb.image,
                desc = herb.desc
            )
        }
    }
}