package com.example.herbal.presentation.screen.mainmenu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.data.theme.SecondaryBase
import com.example.herbal.presentation.components.BannerCard
import com.example.herbal.presentation.components.MenuCard
import com.example.herbal.presentation.navigation.Screen

@Composable
fun MainMenu(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    mainMenuViewModel: MainMenuViewModel = hiltViewModel()
) {
    val herbList by mainMenuViewModel.allPlants.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        BannerCard(modifier = Modifier, navController)
        Spacer(modifier = Modifier.height(16.dp))
        InformationHeader(navController = navController)
        Spacer(modifier = Modifier.height(16.dp))
        HerbListContent(
            herbList = herbList,
            navController = navController,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )
    }
}

@Composable
fun InformationHeader(navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Informasi Tanaman Herbal",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Pelajari lebih lanjut tentang tanaman herbal",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight.Normal,
                )
            )
        }
        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.Tanaman.createRoute(""))
                }
                .padding(start = 15.dp),
            text = "Lihat semua",
            color = SecondaryBase,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
            ),
        )
    }
}

@Composable
fun HerbListContent(
    herbList: List<MyHerbData>,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(herbList, key = { it.id }) { herb ->
            MenuCard(
                modifier = Modifier.clickable {
                    navController.navigate(Screen.Informasi.createRoute(herb.id))
                },
                title = herb.name,
                image = herb.image
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}