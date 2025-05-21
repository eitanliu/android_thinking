package com.example.thinking.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.thinking.util.catchException

@Composable
fun MainScreen(
    navController: NavHostController = LocalNavController.current
) {
    AppScaffold(
        title = { Text("Main Screen") },
    ) { paddings ->

        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .padding(paddings)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Button(onClick = catchException {
                navController.navigate(AppDestination.SPEECH)
            }) {
                Text("Go to Speech")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    LocalNavProvider { MainScreen() }
}