package androidx.lifecycle

import androidx.arch.core.internal.SafeIterableMap

var <T> LiveData<T>.mVersion
    get() = version
    internal set(value) {
        val versionField = LiveData::class.java.getDeclaredField("mVersion")
        versionField.isAccessible = true
        versionField.set(this, value)
        this.setObserverVersion(value)
    }

@Suppress("NOTHING_TO_INLINE", "RestrictedApi")
internal inline fun <T> LiveData<T>.setObserverVersion(version: Int) {
    val mObserversField = LiveData::class.java.getDeclaredField("mObservers")
    mObserversField.isAccessible = true
    val mObservers = mObserversField.get(this) as? SafeIterableMap<*, *> ?: return
    for (observer in mObservers) {
        val clazz = observer.value::class.java
        val lastVersionField = clazz.getDeclaredField("mLastVersion")
        lastVersionField.isAccessible = true
        lastVersionField.set(observer, version)
    }
}

fun <T> LiveData<T>.fixVersion() {
    try {
        if (mVersion < Int.MAX_VALUE) return
        mVersion = LiveData.START_VERSION + 1
    } catch (_: Throwable) {
    }
}