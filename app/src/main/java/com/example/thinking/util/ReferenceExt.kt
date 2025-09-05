package com.example.thinking.util

import java.lang.ref.SoftReference
import java.lang.ref.WeakReference

inline fun <reified T> weakReference(referent: T? = null) = WeakReference<T>(referent)

inline fun <reified T> softReference(referent: T? = null) = SoftReference<T>(referent)

inline fun <reified T> T.refWeak() = WeakReference(this)

inline fun <reified T> T.refSoft() = SoftReference(this)