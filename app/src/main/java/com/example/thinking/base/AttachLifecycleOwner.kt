package com.example.thinking.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

interface AttachLifecycleOwner : LifecycleOwner {

    fun onAttachedLifecycle()

    fun onDetachedLifecycle()

    class Impl : AttachLifecycleOwner {
        private var _lifecycleRegistry: LifecycleRegistry? = null
        private val lifecycleRegistry: LifecycleRegistry
            get() = _lifecycleRegistry ?: LifecycleRegistry(this).also {
                _lifecycleRegistry = it
            }

        override val lifecycle: Lifecycle
            get() = lifecycleRegistry

        override fun onAttachedLifecycle() {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        }

        override fun onDetachedLifecycle() {
            _lifecycleRegistry?.apply {
                if (currentState > Lifecycle.State.INITIALIZED) {
                    handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                }
                _lifecycleRegistry = null
            }
        }
    }

}