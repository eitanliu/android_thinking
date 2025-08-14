package com.example.thinking.util

import android.app.Activity
import android.app.Dialog
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

inline fun <reified T> Any.asType() = this as T

inline fun <reified T> Any?.asTypeOrNull() = this as? T

inline fun <reified T> getTAG(): String = T::class.java.TAG

inline val <T : Any> T.TAG: String get() = this::class.java.TAG

inline val Class<*>.TAG: String get() = this.simpleName

inline val <T : Activity> T.selfActivity get() = this

inline val <T : Fragment> T.selfFragment get() = this

inline val <T : Dialog> T.selfDialog get() = this

inline val <T : View> T.selfView get() = this

inline val <T : ViewModel> T.selfViewModel get() = this