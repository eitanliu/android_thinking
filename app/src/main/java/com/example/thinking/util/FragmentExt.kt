package com.example.thinking.util

import android.app.Activity
import android.content.Intent
import androidx.fragment.app.Fragment

inline fun <reified T : Activity> Fragment.startActivity() {
    activity?.startActivity<T>()
}

inline fun <reified T : Activity> Fragment.startActivity(
    noinline action: Intent.() -> Unit
) {
    activity?.startActivity<T>(action)
}