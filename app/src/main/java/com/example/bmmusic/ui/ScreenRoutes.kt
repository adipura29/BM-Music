package com.example.bmmusic.ui

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Search : Screen("search")
    object Profile : Screen("profile")
    // Add more screens as needed
}
