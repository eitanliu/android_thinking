package com.example.thinking.ui

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.thinking.MainActivity
import com.example.thinking.document.DocumentScannerActivity
import com.example.thinking.util.catchException
import com.example.thinking.util.startActivity

@Composable
fun MainScreen(
    navController: NavHostController = LocalNavController.current,
    context: Context = LocalContext.current
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
            TextField(
                "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
            )
            Button(onClick = catchException {
                navController.navigate(AppDestination.SPEECH)
            }) {
                Text("Go to Speech")
            }
            Button(onClick = catchException {
                context.startActivity<DocumentScannerActivity>()
            }) {
                Text("Document Scanner")
            }
            Box(
                modifier = Modifier
                    .height(5.dp)
                    .fillMaxWidth()
                    .background(color = Color.Gray)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    LocalNavProvider { MainScreen() }
}