@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util

import android.util.SparseArray
import android.view.View
import android.view.Window
import androidx.core.view.SoftwareKeyboardControllerCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.findViewTreeLifecycleOwner

@Suppress("UNCHECKED_CAST")
val View.bindingTags: SparseArray<Any?>
    get() = run {
        getTag(R.id.bindingTags) as? SparseArray<Any?> ?: SparseArray<Any?>().also {
            setTag(R.id.bindingTags, it)
        }
    }

inline fun <T> View.setBindingTag(key: Int, tag: T?) = bindingTags.put(key, tag)

@Suppress("UNCHECKED_CAST")
inline fun <T> View.getBindingTag(key: Int) = bindingTags.get(key) as? T

@Suppress("UNCHECKED_CAST", "EXTENSION_SHADOWED_BY_MEMBER")
inline fun <T> View.getTag(key: Int) = getTag(key) as? T

var View.rootWindow
    get() = rootView.getTag<Window>(R.id.rootWindow)
    set(value) {
        rootView.setTag(R.id.rootWindow, value)
    }

val View.softwareKeyboardControllerCompat
    get() = getTag<SoftwareKeyboardControllerCompat>(R.id.softwareKeyboardController)
        ?: SoftwareKeyboardControllerCompat(this).apply {
            setTag(R.id.softwareKeyboardController, this)
        }

fun View.findLifecycleOwner(): LifecycleOwner? {
    val binding = DataBindingUtil.findBinding<ViewDataBinding>(this)
    var lifecycleOwner = binding?.lifecycleOwner ?: findViewTreeLifecycleOwner()
    if (lifecycleOwner == null) {
        lifecycleOwner = context.typeIf<LifecycleOwner>()
    }
    return lifecycleOwner
}