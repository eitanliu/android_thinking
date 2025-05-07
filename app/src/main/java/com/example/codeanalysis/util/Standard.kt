package com.example.codeanalysis.util


inline fun catchException(crossinline block: () -> Unit): () -> Unit {
    return {
        try {
            block()
        } catch (e: Throwable) {
            e.printStackTrace()
        }
    }
}