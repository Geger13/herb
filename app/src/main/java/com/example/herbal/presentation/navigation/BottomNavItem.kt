package com.example.herbal.presentation.navigation

import com.example.herbal.R

data class BottomNavItem (
    val title : String,
    val icon : Int,
    val route : String

)

var bottomNavItem = listOf(
    BottomNavItem(
        title = "Home",
        icon = R.drawable.ic_home,
        route = "home"
    ),
    BottomNavItem(
        title = "Tanaman",
        icon = R.drawable.ic_plant,
        route = "tanaman"
    )
)