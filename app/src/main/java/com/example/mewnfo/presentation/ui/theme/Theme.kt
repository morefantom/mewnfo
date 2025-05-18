package com.example.mewnfo.presentation.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
fun MewnfoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    // Setting it to false by default to ensure custom theme is applied.
    // You can make it true if you want to support Material You dynamic colors.
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> MewnfoDarkColorScheme
        else -> MewnfoLightColorScheme
    }

    // This part handles the system bars (status bar, navigation bar)
    val view = LocalView.current
    if (!view.isInEditMode) { // isInEditMode check is for previews
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb() // Example: set status bar to primary
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            // You can also set navigationBarColor and isAppearanceLightNavigationBars
            // window.navigationBarColor = colorScheme.surface.toArgb() // Example
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = MewnfoTypography,
        shapes = MewnfoShapes, // If you defined MewnfoShapes
        content = content
    )
}

private val MewnfoDarkColorScheme = darkColorScheme(
    primary = MewnfoPrimaryDark,       // Or generate from a seed: Purple80
    secondary = MewnfoSecondaryDark,   // Or generate from a seed: PurpleGrey80
    tertiary = MewnfoTertiaryDark,     // Or generate from a seed: Pink80
    background = MewnfoBackgroundDark,
    surface = MewnfoSurfaceDark,
    onPrimary = MewnfoOnPrimary, // Assuming White for both themes on this primary
    onSecondary = MewnfoOnSecondary, // Assuming Black for both themes on this secondary
    onTertiary = MewnfoOnTertiary,
    onBackground = MewnfoOnBackground, // Adjust if OnBackground changes for dark
    onSurface = MewnfoOnSurface,     // Adjust if OnSurface changes for dark
    error = MewnfoError, // Often the same for light/dark
    onError = MewnfoOnError // Often the same
    // You can define all other colors like:
    // primaryContainer, onPrimaryContainer, secondaryContainer, onSecondaryContainer,
    // tertiaryContainer, onTertiaryContainer, errorContainer, onErrorContainer,
    // surfaceVariant, onSurfaceVariant, outline, outlineVariant, scrim, inverseSurface,
    // inverseOnSurface, inversePrimary
)

private val MewnfoLightColorScheme = lightColorScheme(
    primary = MewnfoPrimary,
    secondary = MewnfoSecondary,
    tertiary = MewnfoTertiary,
    background = MewnfoBackground,
    surface = MewnfoSurface,
    onPrimary = MewnfoOnPrimary,
    onSecondary = MewnfoOnSecondary,
    onTertiary = MewnfoOnTertiary,
    onBackground = MewnfoOnBackground,
    onSurface = MewnfoOnSurface,
    error = MewnfoError,
    onError = MewnfoOnError
    // Define other colors as needed
)