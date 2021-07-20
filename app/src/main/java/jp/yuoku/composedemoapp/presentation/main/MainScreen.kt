package jp.yuoku.composedemoapp.presentation.main

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import jp.yuoku.composedemoapp.presentation.app_navigation.AppNavigation
import jp.yuoku.composedemoapp.presentation.bottom_navigation_bar.BottomNavigationBar
import jp.yuoku.composedemoapp.presentation.top_bar.TopBar

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar(navController) }
    ) {
        AppNavigation(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
