package com.example.herbal.presentation.screen.mainmenu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.herbal.data.theme.SurfaceBase


@Composable
fun MainMenu (
    modifier: Modifier,
    navController: NavController,
    mainMenuViewModel: MainMenuViewModel
){
    Column (modifier = Modifier.background(SurfaceBase)){
        Spacer(modifier = Modifier.height(4.dp))

        Column (modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)){

        }
    }

}