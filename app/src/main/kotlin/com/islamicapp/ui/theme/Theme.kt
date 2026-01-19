package com.islamicapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = IslamicGreen,
    onPrimary = Color.White,
    secondary = IslamicGold,
    onSecondary = Color.White,
    background = Color(0xFFFBFDF9),
    surface = Color.White,
    onSurface = Color(0xFF191C1A)
)

private val DarkColorScheme = darkColorScheme(
    primary = IslamicGreenLight,
    onPrimary = IslamicGreenDark,
    secondary = IslamicGoldLight,
    onSecondary = IslamicGreenDark,
    background = Color(0xFF191C1A),
    surface = Color(0xFF2E312F),
    onSurface = Color(0xFFE1E3DF)
)

@Composable
fun IslamicPrayerAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
