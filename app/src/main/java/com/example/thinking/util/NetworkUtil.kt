package com.example.thinking.util

import android.Manifest
import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import androidx.annotation.RequiresPermission
import java.util.concurrent.atomic.AtomicBoolean

object NetworkUtil {

    private var isRegistered = AtomicBoolean(false)
    private val networkCallback = object : ConnectivityManager.NetworkCallback() {
        override fun onCapabilitiesChanged(
            network: Network, networkCapabilities: NetworkCapabilities
        ) {
            super.onCapabilitiesChanged(network, networkCapabilities)
            onCapabilitiesChanged?.invoke(network, networkCapabilities)
        }
    }

    var onCapabilitiesChanged: OnCapabilitiesChangedListener? = null

    @RequiresPermission(Manifest.permission.ACCESS_NETWORK_STATE)
    fun registerNetworkCallback(
        context: Context, onCapabilitiesChanged: OnCapabilitiesChangedListener? = null,
    ) {
        NetworkUtil.onCapabilitiesChanged = onCapabilitiesChanged
        if (isRegistered.compareAndSet(false, true)) {
            try {
                context.connectivityManager.registerDefaultNetworkCallback(networkCallback)
            } catch (_: Throwable) {
                isRegistered.set(false)
            }
        }
    }

    @RequiresPermission(Manifest.permission.ACCESS_NETWORK_STATE)
    fun unregisterNetworkCallback(context: Context) {
        context.connectivityManager.unregisterNetworkCallback(networkCallback)
        isRegistered.set(false)
        onCapabilitiesChanged = null
    }
}


typealias OnCapabilitiesChangedListener = (network: Network, networkCapabilities: NetworkCapabilities) -> Unit