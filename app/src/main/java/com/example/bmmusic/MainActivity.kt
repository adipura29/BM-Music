package com.example.bmmusic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bmmusic.data.songsList
import com.example.bmmusic.ui.BottomNavigationBar
import com.example.bmmusic.ui.screens.HomeScreen
import com.example.bmmusic.ui.theme.MusicStreamingAppTheme
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicStreamingAppTheme {
                // Create a NavController
                val navController = rememberNavController()

                // Use NavHost to handle navigation
                NavHost(navController = navController, startDestination = "splash_screen") {
                    composable("splash_screen") {
                        SplashScreen(navController = navController)
                    }
                    composable("main_screen") {
                        Scaffold(bottomBar = {
                            BottomNavigationBar()
                        }) {16.dp
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun SplashScreen(navController: NavController) {
    // Use a Box to center the logo
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        // Replace "logo" with the filename of your logo (without the extension)
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .size(257.dp, 257.dp)
                .clip(MaterialTheme.shapes.medium)
                )
    }

    // Use LaunchedEffect to navigate to the main screen after a delay
    LaunchedEffect(key1 = true) {
        delay(2000)     // Delay of 2 seconds
        navController.navigate("main_screen") {
            popUpTo("splash_screen") { inclusive = true }
        }
    }
}

