@file:Suppress("NO_TAIL_CALLS_FOUND", "NON_TAIL_RECURSIVE_CALL", "NOTHING_TO_INLINE")

package com.example.thinking.util

import android.content.Context
import java.io.File

inline fun Context.randomCacheFile(
    prefix: String = "tamp_", suffix: String = "",
    time: Boolean = true, uuid: Boolean = true,
    external: Boolean = false,
) = FileUtil.randomCacheFile(
    this, prefix, suffix, time, uuid, external
)

tailrec fun File.forEachFolder(action: ((total: Long, file: File) -> Unit)?): Long {
    var size = 0L
    for (file in walk()) {
        if (file.isDirectory) {
            action?.invoke(size, file)
        } else {
            size += file.length()
            action?.invoke(size, file)
        }
    }
    return size
}

tailrec fun File.deleteFolder(delSelf: Boolean = false) {
    val file = this
    if (file.exists()) {
        file.listFiles()?.forEach {
            if (it.isDirectory) {
                it.deleteFolder(true)
            } else {
                it.delete()
            }
        }
        if (delSelf) {
            file.delete()
        }
    }
}