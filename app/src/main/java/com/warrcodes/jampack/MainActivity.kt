package com.warrcodes.jampack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.warrcodes.jampack.navigation.MainScreen
import com.warrcodes.jampack.ui.theme.JampackTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JampackTheme {
                val navController = rememberNavController()
                MainScreen(navController = navController)
            }
        }
    }
}