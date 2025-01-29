package com.warrcodes.jampack.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.warrcodes.jampack.ui.screens.EventDetailScreen
import com.warrcodes.jampack.ui.screens.HomeScreen
import com.warrcodes.jampack.ui.screens.SavedEventsScreen

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screen.Home.route) { HomeScreen(navController) }
            composable(Screen.Events.route) { EventDetailScreen(navController) }
            composable(Screen.SavedEvents.route) { SavedEventsScreen(navController) }
        }
    }
}