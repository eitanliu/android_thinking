package com.example.thinking

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.thinking.ui.App
import java.lang.ref.Cleaner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val properties = System.getProperties()
        for (property in properties) {
            Log.e("MainActivity", "prop: ${property.key} = ${property.value}")
        }
        val envs = System.getenv()
        for (env in envs) {
            Log.e("MainActivity", "env: ${env.key} = ${env.value}")
        }
        val a = 1
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Cleaner.create().register(a) {}
        }
        Log.e("MainActivity", "${System.getProperty("java.home")}")
        Log.e("MainActivity", "${System.getProperty("java.runtime.version")}")
        Log.e("MainActivity", "${System.getProperty("java.runtime.name")}")
        Log.e("MainActivity", "${System.getProperty("java.vendor.version")}")
        Log.e("MainActivity", "${System.getProperty("java.vendor.version")}")
        Log.e("MainActivity", "${System.getProperty("java.specification.version")}")
        setContent {
            App()
        }
    }
}