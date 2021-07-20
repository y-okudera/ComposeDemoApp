package jp.yuoku.composedemoapp.presentation.app_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import jp.yuoku.composedemoapp.presentation.home.HomeScreen
import jp.yuoku.composedemoapp.presentation.profile.ProfileScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
        composable(route = NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(route = NavigationItem.Profile.route) {
            ProfileScreen()
        }
    }
}