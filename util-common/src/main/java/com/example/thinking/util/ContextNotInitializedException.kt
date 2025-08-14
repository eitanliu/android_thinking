package com.example.thinking.util

class ContextNotInitializedException : RuntimeException {
    constructor() : this("ContextInitializer not initialized. Please call ContextInitializer.init(context) first.")

    constructor(message: String?) : super(message)

    constructor(message: String?, cause: Throwable?) : super(message, cause)

    constructor(
        message: String?, cause: Throwable?, enableSuppression: Boolean, writableStackTrace: Boolean
    ) : super(
        message, cause, enableSuppression, writableStackTrace
    )

    constructor(cause: Throwable?) : super(cause)
}
