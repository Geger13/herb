package com.example.herbal.presentation.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.herbal.presentation.screen.information.HerbInformation
import com.example.herbal.presentation.screen.information.InformationViewModel
import com.example.herbal.presentation.screen.instruction.Instruction
import com.example.herbal.presentation.screen.listherb.ListHerb
import com.example.herbal.presentation.screen.listherb.ListHerbViewModel
import com.example.herbal.presentation.screen.mainmenu.MainMenu
import com.example.herbal.presentation.screen.mainmenu.MainMenuViewModel
import com.example.herbal.presentation.screen.scan.ScanTanamanScreen
import com.example.herbal.presentation.screen.scan.ScanViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier) {

    NavHost(navController = navController, startDestination = Screen.Menu.route) {

        composable(route = Screen.Menu.route) {
            val informationViewModel: InformationViewModel = hiltViewModel()
            MainMenu(
                modifier = modifier,
                navController = navController,
                mainMenuViewModel = MainMenuViewModel(),
                informationViewModel,
            )
        }

        composable(route = Screen.Tanaman.route) {
            val listHerbViewModel: ListHerbViewModel = hiltViewModel()
            ListHerb(
                navController = navController,
                listHerbViewModel
            )
        }

        composable(
            route = Screen.Informasi.route + "/{herbId}",
            arguments = listOf(navArgument("herbId") { type = NavType.StringType })
        ) { backStackEntry ->
            val herbId = backStackEntry.arguments?.getString("herbId") ?: ""
            val informationViewModel: InformationViewModel = hiltViewModel()
            val herbData = informationViewModel.getHerbById(herbId)

            herbData?.let {
                HerbInformation(modifier = modifier, herbData = it)
            }
        }

        composable(route = Screen.Instruksi.route) {
            Instruction(
                modifier = modifier,
                navController = navController
            )
        }

        // Jika kamu ingin mengaktifkan scan kembali nanti:
         composable(route = Screen.Scan.route) {
             val scanViewModel: ScanViewModel = hiltViewModel()
             ScanTanamanScreen(
                 modifier = modifier,
                 navController = navController,
                 viewModel = scanViewModel
             )
         }
    }
}

