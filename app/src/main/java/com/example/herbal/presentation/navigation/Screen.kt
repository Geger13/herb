package com.example.herbal.presentation.navigation

sealed class Screen(val route: String) {
    data object Menu : Screen("menu")
    data object Scan : Screen("scan")
    data object Informasi : Screen("informasi") {
        fun createRoute(herbId: String) = "informasi/$herbId"
    }
    data object Instruksi : Screen("instruksi")
    data object Tanaman : Screen("tanaman") {
        fun createRoute(query: String) = "tanaman?query=$query"
    }
}