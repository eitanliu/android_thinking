package com.example.codeanalysis.util


inline fun catchException(
    crossinline exceptionHandler: (Throwable) -> Unit = ::printException,
    noinline block: () -> Unit
): () -> Unit {
    return {
        try {
            block()
        } catch (e: Throwable) {
            exceptionHandler(e)
        }
    }
}

inline fun <T> catchException(
    crossinline exceptionHandler: (Throwable) -> Unit = ::printException,
    noinline block: (T) -> Unit
): (T) -> Unit {
    return { t ->
        try {
            block(t)
        } catch (e: Throwable) {
            exceptionHandler(e)
        }
    }
}

inline fun <T1, T2> catchException(
    crossinline exceptionHandler: (Throwable) -> Unit = ::printException,
    noinline block: (T1, T2) -> Unit
): (T1, T2) -> Unit {
    return { t1, t2 ->
        try {
            block(t1, t2)
        } catch (e: Throwable) {
            exceptionHandler(e)
        }
    }
}

inline fun <T1, T2, T3> catchException(
    crossinline exceptionHandler: (Throwable) -> Unit = ::printException,
    noinline block: (T1, T2, T3) -> Unit
): (T1, T2, T3) -> Unit {
    return { t1, t2, t3 ->
        try {
            block(t1, t2, t3)
        } catch (e: Throwable) {
            exceptionHandler(e)
        }
    }
}

inline fun <T1, T2, T3, T4> catchException(
    crossinline exceptionHandler: (Throwable) -> Unit = ::printException,
    noinline block: (T1, T2, T3, T4) -> Unit
): (T1, T2, T3, T4) -> Unit {
    return { t1, t2, t3, t4 ->
        try {
            block(t1, t2, t3, t4)
        } catch (e: Throwable) {
            exceptionHandler(e)
        }
    }
}

inline fun <T1, T2, T3, T4, T5> catchException(
    crossinline exceptionHandler: (Throwable) -> Unit = ::printException,
    noinline block: (T1, T2, T3, T4, T5) -> Unit
): (T1, T2, T3, T4, T5) -> Unit {
    return { t1, t2, t3, t4, t5 ->
        try {
            block(t1, t2, t3, t4, t5)
        } catch (e: Throwable) {
            exceptionHandler(e)
        }
    }
}

inline fun <T1, T2, T3, T4, T5, T6> catchException(
    crossinline exceptionHandler: (Throwable) -> Unit = ::printException,
    noinline block: (T1, T2, T3, T4, T5, T6) -> Unit
): (T1, T2, T3, T4, T5, T6) -> Unit {
    return { t1, t2, t3, t4, t5, t6 ->
        try {
            block(t1, t2, t3, t4, t5, t6)
        } catch (e: Throwable) {
            exceptionHandler(e)
        }
    }
}


@Suppress("NOTHING_TO_INLINE")
inline fun printException(e: Throwable) {
    e.printStackTrace()
}
