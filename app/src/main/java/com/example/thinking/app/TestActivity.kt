package com.example.thinking.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.thinking.R
import com.example.thinking.databinding.ActivityTestBinding
import com.example.thinking.util.rootWindowInsetsCompat

class TestActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityTestBinding.inflate(layoutInflater)
    }

    val windowInsetsController by lazy {
        WindowInsetsControllerCompat(window, window.decorView)
    }

    val rootWindowInsetsCompat get() = binding.root.rootWindowInsetsCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnStatusBar.setOnClickListener {
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
    }
}