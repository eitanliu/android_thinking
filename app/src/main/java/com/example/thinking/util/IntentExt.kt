package com.example.thinking.util

import android.content.Intent

/**
 * 栈顶复用
 * 回调 onNewIntent()
 */
fun Intent.singleTop() = apply {
    addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
}

/**
 * 栈内复用
 * 回调 onNewIntent()
 */
fun Intent.singleTasks() = apply {
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
}

/**
 * 清空栈顶、自身
 * 回调 onCreate()
 */
fun Intent.clearTops() = apply {
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
}

/**
 * 清空栈
 * 销毁 singleInstance 模式外的全部 Activity
 * 回调 onCreate()
 */
fun Intent.clearTasks() = apply {
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
}

/**
 * 不执行转场动画
 */
fun Intent.noAnim() = apply {
    addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
}