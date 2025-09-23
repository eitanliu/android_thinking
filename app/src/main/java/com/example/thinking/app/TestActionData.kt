package com.example.thinking.app

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.thinking.util.startActivity

class TestActionData(val name: String, val action: () -> Unit) {
    companion object {
        inline fun <reified T : Activity> activity(
            context: Context
        ) = TestActionData(T::class.java.simpleName) {
            context.startActivity<T>()
        }

        inline fun <reified T : Activity> activity(
            context: Context, noinline action: Intent.() -> Unit
        ) = TestActionData(T::class.java.simpleName) {
            context.startActivity<T>(action)
        }
    }
}