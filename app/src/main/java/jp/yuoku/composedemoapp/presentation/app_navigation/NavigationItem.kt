package jp.yuoku.composedemoapp.presentation.app_navigation

import jp.yuoku.composedemoapp.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}