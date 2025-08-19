package androidx.fragment.app

import androidx.lifecycle.LifecycleOwner

class FragmentLifecycleOwnerInner

val LifecycleOwner.childFragmentManager: FragmentManager?
    get() {
        return when (this) {
            is FragmentActivity -> {
                supportFragmentManager
            }

            is Fragment -> {
                childFragmentManager
            }

            is FragmentViewLifecycleOwner -> {
                fragment?.childFragmentManager
            }

            else -> null
        }
    }

val LifecycleOwner.parentFragmentManager: FragmentManager?
    get() {
        return when (this) {
            is FragmentActivity -> {
                supportFragmentManager
            }

            is Fragment -> {
                parentFragmentManager
            }

            is FragmentViewLifecycleOwner -> {
                fragment?.parentFragmentManager
            }

            else -> null
        }
    }

inline fun <reified T : Fragment> LifecycleOwner.asFragmentType(): T? = asFragment() as? T

fun LifecycleOwner.asFragment(): Fragment? {
    return when (this) {
        is Fragment -> this
        is FragmentViewLifecycleOwner -> fragment
        else -> null
    }
}

private val FragmentViewLifecycleOwner.fragment: Fragment?
    get() {
        val field = FragmentViewLifecycleOwner::class.java.run {
            try {
                getField("mFragment")
            } catch (_: Exception) {
                fields.firstOrNull { it.type == Fragment::class.java }
            }
        } ?: return null
        field.isAccessible = true
        return field.get(this) as? Fragment
    }
