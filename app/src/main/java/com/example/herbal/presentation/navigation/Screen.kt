package com.example.herbal.presentation.navigation

sealed class Screen (val route : String) {
    data object Menu : Screen("menu")
    data object Tanaman : Screen("tanaman")
    data object Scan : Screen("scan")
    data object Informasi : Screen("informasi")
    data object Instruksi : Screen("instruksi")
}