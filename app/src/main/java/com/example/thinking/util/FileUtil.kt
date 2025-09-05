package com.example.thinking.util

import android.content.Context
import android.os.Environment
import java.io.File
import java.math.BigDecimal
import java.math.RoundingMode
import java.util.UUID

object FileUtil {

    fun getFileFormatSize(size: Double): String {

        val kiloByte = size / 1024
        if (kiloByte < 1) {
            return size.toString() + "B"
        }

        val megaByte = kiloByte / 1024
        if (megaByte < 1) {
            val result1 = BigDecimal(kiloByte.toString())
            return result1.setScale(2, RoundingMode.HALF_UP).toPlainString() + "KB"
        }

        val gigaByte = megaByte / 1024
        if (gigaByte < 1) {
            val result2 = BigDecimal(megaByte.toString())
            return result2.setScale(2, RoundingMode.HALF_UP).toPlainString() + "MB"
        }

        val teraBytes = gigaByte / 1024
        if (teraBytes < 1) {
            val result3 = BigDecimal(gigaByte.toString())
            return result3.setScale(2, RoundingMode.HALF_UP).toPlainString() + "GB"
        }
        val result4 = BigDecimal(teraBytes)
        return result4.setScale(2, RoundingMode.HALF_UP).toPlainString() + "TB"
    }

    tailrec fun randomCacheFile(
        context: Context,
        prefix: String = "tamp_", suffix: String = "",
        time: Boolean = true, uuid: Boolean = true,
        external: Boolean = false,
    ): File = run {
        val dir = if (external) context.externalCacheDir else context.cacheDir
        File(dir, randomName(prefix, suffix, time, uuid)).let { file ->
            if (file.exists()) randomCacheFile(context, prefix, suffix, time, uuid, external)
            else file
        }
    }

    fun randomName(
        prefix: String = "tamp_", suffix: String = "",
        time: Boolean = true, uuid: Boolean = true,
    ) = run {
        val timeMillis = System.currentTimeMillis().toString().takeIf { time } ?: ""
        val uuidSequence = UUID.randomUUID().toString().run {
            subSequence(length / 2, length)
        }.takeIf { uuid } ?: ""
        "${prefix}${timeMillis}${uuidSequence}${suffix}"
    }

    val hasSdcard by lazy {
        Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)
    }

    val sdcardPath by lazy { Environment.getExternalStorageDirectory() }
}