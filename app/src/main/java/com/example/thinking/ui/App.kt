package com.example.thinking.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Preview(showBackground = true)
@Composable
fun App() {
    AppTheme {
        AppNavGraph()
    }
}

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content,
    )
}

@Composable
fun AppScaffold(
    title: @Composable () -> Unit,
    navigationIcon: @Composable (() -> Unit)? = null,
    navController: NavHostController = LocalNavController.current,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                navigationIcon = navigationIcon ?: {
                    AppNavIcon(navController)
                },
                title = title,
            )
        },
        content = content
    )
}

@Composable
fun AppNavIcon(
    navController: NavHostController = LocalNavController.current
) {
    if (navController.previousBackStackEntry != null) IconButton(
        onClick = {
            navController.popBackStack()
        }
    ) {
        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back")
    }
}