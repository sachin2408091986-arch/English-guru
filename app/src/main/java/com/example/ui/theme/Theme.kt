package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val LightColorScheme = lightColorScheme(
    primary = GuruCobaltPrimary,
    onPrimary = Color.White,
    primaryContainer = GuruCobaltContainer,
    onPrimaryContainer = GuruOnCobaltContainer,
    secondary = GuruEmeraldSecondary,
    onSecondary = Color.White,
    secondaryContainer = GuruEmeraldContainer,
    onSecondaryContainer = GuruOnEmeraldContainer,
    tertiary = GuruAmberTertiary,
    onTertiary = Color.White,
    tertiaryContainer = GuruAmberContainer,
    onTertiaryContainer = GuruOnAmberContainer,
    background = GuruLightBackground,
    onBackground = GuruLightOnSurface,
    surface = GuruLightSurface,
    onSurface = GuruLightOnSurface,
    surfaceVariant = GuruLightSurfaceVariant,
    onSurfaceVariant = GuruLightOnSurfaceVariant,
    outline = GuruLightOutline
)

private val DarkColorScheme = darkColorScheme(
    primary = GuruCobaltPrimaryDark,
    onPrimary = Color(0xFF041C52),
    primaryContainer = GuruCobaltContainerDark,
    onPrimaryContainer = GuruOnCobaltContainerDark,
    secondary = GuruEmeraldSecondaryDark,
    onSecondary = Color(0xFF00382B),
    secondaryContainer = GuruEmeraldContainerDark,
    onSecondaryContainer = GuruOnEmeraldContainerDark,
    tertiary = GuruAmberTertiaryDark,
    onTertiary = Color(0xFF422700),
    tertiaryContainer = GuruAmberContainerDark,
    onTertiaryContainer = GuruOnAmberContainerDark,
    background = GuruDarkBackground,
    onBackground = GuruDarkOnSurface,
    surface = GuruDarkSurface,
    onSurface = GuruDarkOnSurface,
    surfaceVariant = GuruDarkSurfaceVariant,
    onSurfaceVariant = GuruDarkOnSurfaceVariant,
    outline = GuruDarkOutline
)

private val GuruShapes = Shapes(
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(18.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(30.dp)
)

@Composable
fun EnglishGuruTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = EnglishGuruTypography,
        shapes = GuruShapes,
        content = content
    )
}
