package com.example.herbal.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.herbal.data.theme.Neutral60
import com.example.herbal.data.theme.PrimaryBase
import com.example.herbal.presentation.navigation.Screen
import com.example.herbal.presentation.navigation.bottomNavItem

@Composable
fun BottomBarComponent(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomAppBar(
        modifier = Modifier
            .height(70.dp),
        containerColor = Color(0xFFE7F8E3)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            val homeItem = bottomNavItem[0]
            val isHomeSelected = currentDestination?.route == homeItem.route

            Spacer(modifier = Modifier.weight(1f))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .wrapContentSize()
                    .clickable(
                        onClick = {
                            if (currentDestination?.route != homeItem.route) {
                                navController.navigate(homeItem.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        }
                    )
                    .padding(vertical = 4.dp)
            ) {
                IconButton(
                    onClick = {
                        if (currentDestination?.route != homeItem.route) {
                            navController.navigate(homeItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    }
                ) {
                    Icon(
                        modifier = Modifier.size(28.dp),
                        tint = if (isHomeSelected) PrimaryBase else Neutral60,
                        painter = painterResource(id = homeItem.icon),
                        contentDescription = homeItem.title
                    )
                }
                Text(
                    fontSize = 14.sp,
                    text = homeItem.title,
                    color = if (isHomeSelected) PrimaryBase else Neutral60
                )
            }

            Spacer(modifier = Modifier.weight(4f))

            val tanamanItem = bottomNavItem[1]
            val tanamanRouteTemplate = Screen.Tanaman.route + "?query={query}"
            val isTanamanSelected = currentDestination?.route == tanamanRouteTemplate

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .wrapContentSize()
                    .clickable(
                        onClick = {
                            if (currentDestination?.route != tanamanRouteTemplate) {
                                navController.navigate(Screen.Tanaman.createRoute("")) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        }
                    )
                    .padding(vertical = 4.dp)
            ) {
                IconButton(
                    onClick = {
                        if (currentDestination?.route != tanamanRouteTemplate) {
                            navController.navigate(Screen.Tanaman.createRoute("")) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    }
                ) {
                    Icon(
                        modifier = Modifier.size(28.dp),
                        tint = if (isTanamanSelected) PrimaryBase else Neutral60,
                        painter = painterResource(id = tanamanItem.icon),
                        contentDescription = tanamanItem.title
                    )
                }
                Text(
                    fontSize = 14.sp,
                    text = tanamanItem.title,
                    color = if (isTanamanSelected) PrimaryBase else Neutral60
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
