package com.example.thinking.util

import android.util.Log
import androidx.annotation.IntDef
import kotlin.math.min

@Suppress("NOTHING_TO_INLINE")
object Logcat {
    @Retention(AnnotationRetention.SOURCE)
    @IntDef(V, D, I, W, E, A)
    annotation class Level

    const val V: Int = Log.VERBOSE
    const val D: Int = Log.DEBUG
    const val I: Int = Log.INFO
    const val W: Int = Log.WARN
    const val E: Int = Log.ERROR
    const val A: Int = Log.ASSERT

    private const val MAX_LENGTH = 2000

    var level = I
    var tag = "Logcat"
    var space = "->"
    var isDebug = true

    inline val processName get() = ContextInitializer.contextOrNull.processName

    fun trace(): String {
        // 获取异常所在调用栈信息
        val caller = Throwable().stackTrace.first { it.className != Logcat::class.java.name }
        // 类名 + 方法名
        // var callerClassName = caller.className
        // callerClassName = callerClassName.substring(callerClassName.lastIndexOf(".") + 1);
        // return "${callerClassName}.${caller.methodName}(${caller.fileName}:${caller.lineNumber})"
        // 方法名 + 文件名
        return "${caller.methodName}(${caller.fileName}:${caller.lineNumber})"
    }

    fun printTime() {
        msg("trace time ${TimeUtil.formatCurrent("MM-dd HH:mm:ss.SSS")} $processName")
    }

    fun msg(
        msg: String, @Level level: Int = Logcat.level,
    ) = msg(msg, null, level, tag)

    fun msg(
        tag: String, msg: String, @Level level: Int = Logcat.level,
    ) = msg(msg, null, level, tag)

    fun msg(
        msg: String, tr: Throwable? = null,
        @Level level: Int = Logcat.level,
    ) = msg(msg, tr, level, tag)

    fun msg(
        msg: String, tr: Throwable?,
        tag: String, @Level level: Int = Logcat.level,
    ) = msg(msg, tr, level, tag)

    fun msg(
        msg: String, tr: Throwable?,
        @Level level: Int, tag: String = Logcat.tag,
    ) = msg(tr, level, tag) { msg }

    fun msg(
        tr: Throwable? = null,
        @Level level: Int = Logcat.level,
        tag: String = Logcat.tag,
        builder: () -> String = { "" }
    ) {
        if (isDebug) {
            val string = builder()
            val length = string.length
            var index = 1
            var start = 0
            var end = min(length, MAX_LENGTH)
            val lines = length / MAX_LENGTH
            val pad = lines / 10 + 2

            if ((lines == 1 && length % MAX_LENGTH != 0) || lines > 1) {
                do {
                    val line = "$index ".padStart(pad, '0')
                    val msg = "${trace()} $line$space ${string.subSequence(start, end)}"
                    when (level) {
                        V -> Log.v(tag, msg)
                        D -> Log.d(tag, msg)
                        I -> Log.i(tag, msg)
                        W -> Log.w(tag, msg)
                        E -> Log.e(tag, msg)
                        else -> {
                            Log.println(A, tag, msg)
                        }
                    }
                    start = end
                    end = min(length, end + MAX_LENGTH)
                    index += 1
                } while (start < end)
                when (level) {
                    V -> Log.v(tag, null, tr)
                    D -> Log.d(tag, null, tr)
                    I -> Log.i(tag, null, tr)
                    W -> Log.w(tag, null, tr)
                    E -> Log.e(tag, null, tr)
                    else -> Log.println(A, tag, Log.getStackTraceString(tr))
                }
            } else {
                val msg = "${trace()} $space ${string.subSequence(start, end)}"
                when (level) {
                    V -> Log.v(tag, msg, tr)
                    D -> Log.d(tag, msg, tr)
                    I -> Log.i(tag, msg, tr)
                    W -> Log.w(tag, msg, tr)
                    E -> Log.e(tag, msg, tr)
                    else -> {
                        Log.println(A, tag, msg)
                        if (tr != null) Log.println(A, tag, Log.getStackTraceString(tr))
                    }
                }
            }
        }
    }
}