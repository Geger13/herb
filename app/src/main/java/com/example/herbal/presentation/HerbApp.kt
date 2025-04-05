package com.example.herbal.presentation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.herbal.R
import com.example.herbal.data.theme.ContentWhite
import com.example.herbal.data.theme.PrimaryBase
import com.example.herbal.presentation.components.BottomBarComponent
import com.example.herbal.presentation.components.TopBarComponent
import com.example.herbal.presentation.components.TopBarComponentHasilScan
import com.example.herbal.presentation.components.TopBarComponentHome
import com.example.herbal.presentation.navigation.Screen

//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun HerbApp() {
//    val navController = rememberNavController()
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentDestination = navBackStackEntry?.destination?.route
//
//    Scaffold(
//        floatingActionButton = {
//            if (currentDestination !in listOf(
//                    Screen.Menu.route,
//                    Screen.Informasi.route + "/{herbId}",
//                    Screen.Scan.route,
//                    Screen.Instruksi.route,
//                )
//            ) {
//                Box {
//                    FloatingActionButton(
//                        onClick = { navController.navigate(Screen.Scan.route) },
//                        containerColor = PrimaryBase,
//                        shape = CircleShape,
//                        modifier = Modifier
//                            .size(60.dp)
//                            .align(Alignment.Center)
//                            .offset(y = 60.dp)
//                    ) {
//                        Icon(
//                            modifier = Modifier
//                                .width(30.dp)
//                                .height(30.dp),
//                            tint = ContentWhite,
//                            painter = painterResource(id = R.drawable.ic_scan),
//                            contentDescription = null,
//                        )
//                    }
//                }
//            }
//        },
//        floatingActionButtonPosition = FabPosition.Center,
//        bottomBar = {
//            if (currentDestination !in listOf(
//                    Screen.Menu.route,
//                    Screen.Informasi.route + "/{herbId}",
//                    Screen.Scan.route,
//                    Screen.Instruksi.route,
//                )
//            ) {
//                BottomBarComponent(navController)
//            }
//        },
//        topBar = {
//            when (currentDestination) {
//                Screen.Menu.route -> TopBarComponentHome(name = "Pengguna", navController = navController)
//                Screen.Informasi.route + "/{informationId}" -> TopBarComponent(
//                    title = "Detail Informasi",
//                    navController = navController
//                )
//                Screen.Scan.route + "/{scanResult}" -> TopBarComponentHasilScan(
//                    title = "Hasil Scan Tanaman",
//                    navController = navController
//                )
//
//            }
//        }
//    )
//    { paddingValues ->
//        NavGraph(navController = navController, modifier = Modifier.padding(paddingValues), context = LocalContext.current)
//    }
//}

