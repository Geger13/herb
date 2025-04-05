package com.example.herbal.presentation.screen.mainmenu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.herbal.data.datastore.FilterData
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.data.theme.SecondaryBase
import com.example.herbal.data.theme.SurfaceBase
import com.example.herbal.presentation.components.BannerCard
import com.example.herbal.presentation.components.FilterButton
import com.example.herbal.presentation.components.MenuCard
import com.example.herbal.presentation.navigation.Screen
import com.example.herbal.presentation.screen.information.InformationViewModel


@Composable
fun MainMenu(
    modifier: Modifier,
    navController: NavHostController,
    mainMenuViewModel: MainMenuViewModel,
    informationViewModel: InformationViewModel
) {
    val herbList by informationViewModel.informationByCategory.collectAsState()
    val searchQuery by informationViewModel.searchQuery.collectAsState()
    val filterState by mainMenuViewModel.filters.collectAsState()
    val selectedCategory by mainMenuViewModel.selectedCategory.collectAsState()

    Column(modifier = Modifier.background(SurfaceBase)) {
        Spacer(modifier = Modifier.height(4.dp))

        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)) {
            BannerCard(modifier = Modifier, navController)
            Spacer(modifier = Modifier.height(16.dp))

            InformationHeader(navController = navController)
            Spacer(modifier = Modifier.height(8.dp))


            Spacer(modifier = Modifier.height(16.dp))


            Spacer(modifier = Modifier.height(8.dp))

            HerbListContent(herbList, navController)
        }
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
            modifier = Modifier.clickable {
                navController.navigate(Screen.Informasi.route)
            },
            text = "Lihat semua",
            color = SecondaryBase,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
            )
        )
    }
}




@Composable
fun HerbListContent(
    herbList: List<MyHerbData>,
    navController: NavHostController
) {
    LazyColumn {
        items(herbList.size) { index ->
            val herb = herbList[index]
            MenuCard(
                modifier = Modifier.clickable {
                    navController.navigate(Screen.Informasi.route + "/${herb.id}")
                },
                title = herb.name,
                image = herb.image
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainMenu() {
    val navController = rememberNavController()
    val dummyViewModel = remember { MainMenuViewModel() }
    val infoViewModel = remember { InformationViewModel() }

    MainMenu(
        modifier = Modifier,
        navController = navController,
        mainMenuViewModel = dummyViewModel,
        informationViewModel = infoViewModel
    )
}
