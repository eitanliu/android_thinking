package com.example.thinking.app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.thinking.R
import com.example.thinking.databinding.ActivityTestBinding
import com.example.thinking.util.Logcat
import com.example.thinking.util.OS
import com.example.thinking.util.rootWindowInsetsCompat
import com.example.thinking.util.startActivity
import com.example.thinking.util.statusBarHeight
import kotlin.math.max

class TestActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityTestBinding.inflate(layoutInflater)
    }

    val windowInsetsController by lazy {
        WindowInsetsControllerCompat(window, window.decorView)
    }

    val rootWindowInsetsCompat get() = binding.root.rootWindowInsetsCompat

    val actionList by lazy {
        listOf(
            TestActionData("Status Bar", ::togglerStatusBar),
            TestActionData("DisplayActivity") {
                startActivity<DisplayActivity>()
            },
            TestActionData("Dump String", ::dumpString),
            TestActionData("Dump StringArray", ::dumpStringArray),
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout(),
            )
            val statusBarHeight = application.resources.statusBarHeight
            Logcat.msg("statusBarHeight: $statusBarHeight, ${systemBars.top}")
            val left = systemBars.left
            val right = systemBars.right
            val top = max(statusBarHeight, systemBars.top)
            val bottom = systemBars.bottom
            v.setPadding(left, top, right, bottom)
            insets
        }
        binding.list.adapter = TestActionAdapter().apply {
            submitList(actionList)
        }
    }

    fun togglerStatusBar() {
        val windowInsetsCompat = rootWindowInsetsCompat
        if (windowInsetsCompat != null) {
            if (windowInsetsCompat.isVisible(WindowInsetsCompat.Type.statusBars())) {
                windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())
            } else {
                windowInsetsController.show(WindowInsetsCompat.Type.statusBars())
            }
        } else {
            windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())
        }
    }

    fun dumpString() {
        for (key in OS.R.stringNames) {
            val value = OS.getStringOrNull(key)
            Logcat.msg("$key, $value")
        }
    }

    fun dumpStringArray() {
        for (key in OS.R.stringArrayNames) {
            val value = OS.getStringArrayOrNull(key)
            Logcat.msg("$key, ${value?.joinToString()}")
        }
    }

}