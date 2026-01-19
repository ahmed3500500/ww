package com.islamicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.islamicapp.ui.screens.*
import com.islamicapp.ui.theme.IslamicPrayerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IslamicPrayerAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IslamicPrayerApp()
                }
            }
        }
    }
}

@Composable
fun IslamicPrayerApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("prayer_times") {
            PrayerTimesScreen(navController)
        }
        composable("quran") {
            QuranScreen(navController)
        }
        composable("tasbih") {
            TasbihScreen(navController)
        }
        composable("azkar") {
            AzkarScreen(navController)
        }
        composable("qibla") {
            QiblaScreen(navController)
        }
        composable("names") {
            NamesScreen(navController)
        }
        composable("settings") {
            SettingsScreen(navController)
        }
    }
}
