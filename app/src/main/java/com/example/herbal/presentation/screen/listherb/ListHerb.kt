package com.example.herbal.presentation.screen.listherb

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.data.datastore.myHerbData
import com.example.herbal.data.theme.SurfaceBase
import com.example.herbal.presentation.components.InformationCard
import com.example.herbal.presentation.navigation.Screen
import com.example.herbal.presentation.screen.information.InformationViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun ListHerb(
    navController: NavHostController,
    informationViewModel: ListHerbViewModel
) {
    val herbList by informationViewModel.herbList.collectAsState()

    Column(modifier = Modifier.background(SurfaceBase)) {
        Spacer(modifier = Modifier.height(4.dp))

        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)) {

            Spacer(modifier = Modifier.height(16.dp))

            ListHerbComp(herbList, navController)
        }
    }
}

@Composable
fun ListHerbComp (
    herbList: List<MyHerbData>,
    navController: NavHostController
) {
    LazyColumn {
        items(herbList.size) { index ->
            val herb = herbList[index]
            InformationCard(
                modifier = Modifier.clickable {
                    navController.navigate(Screen.Informasi.route + "/${herb.id}")
                },
                title = herb.name,
                image = herb.image,
                desc = herb.desc
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewListHerb() {
    val navController = rememberNavController()

    val mockViewModel = object : ListHerbViewModel() {
        override val herbList: StateFlow<List<MyHerbData>> = MutableStateFlow(myHerbData)
    }

    ListHerb(
        navController = navController,
        informationViewModel = mockViewModel // Use the mock ViewModel here
    )
}
