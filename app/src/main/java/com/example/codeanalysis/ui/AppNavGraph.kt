package com.example.codeanalysis.ui

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

val LocalNavController = staticCompositionLocalOf<NavHostController> {
    error("Not NavHostController provided")
}

@Composable
fun LocalNavProvider(
    navController: NavHostController = rememberNavController(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalNavController provides navController) {
        content()
    }
}

object AppDestination {
    const val MAIN = "main"
    const val SPEECH = "speech"
}

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    LocalNavProvider(navController = navController) {
        NavHost(
            navController = LocalNavController.current,
            startDestination = AppDestination.MAIN,
            enterTransition = { slideInHorizontally { it } },
            // exitTransition = { ExitTransition.None },
            exitTransition = { slideOutHorizontally { -it } },
            // popEnterTransition = { EnterTransition.None },
            popEnterTransition = { slideInHorizontally { -it } },
            popExitTransition = { slideOutHorizontally { it } },
        ) {
            composable(AppDestination.MAIN) {
                MainScreen()
            }
        }
    }
}

