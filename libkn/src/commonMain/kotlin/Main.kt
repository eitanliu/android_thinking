import kotlinx.cinterop.*
import platform.android.*

@CName(externName="Java_com_example_libkn_NativeLib_getStringFromNative")
fun getStringFromNative(env: CPointer<JNIEnvVar>, thiz: jobject): jstring? {
    memScoped {
        return env.pointed.pointed?.NewStringUTF?.invoke(
            env, "Hello from Kotlin/Native!".cstr.ptr
        )
    }
}

//动态注册
fun sayHello() {
    __android_log_print(ANDROID_LOG_ERROR.toInt(), "Kotlin", "Hello %s", "Kotlin Native!")
}

@CName(externName="JNI_OnLoad")
fun JNI_OnLoad(vm: CPointer<JavaVMVar>, preserved: COpaquePointer): jint {
    return memScoped {
        val envStorage = alloc<CPointerVar<JNIEnvVar>>()
        val vmValue = vm.pointed.pointed!!
        val result = vmValue.GetEnv!!(vm, envStorage.ptr.reinterpret(), JNI_VERSION_1_6)
        if (result == JNI_OK) {
            val env = envStorage.pointed!!.pointed!!
            val jclass = env.FindClass!!(envStorage.value, "com/example/libkn/NativeLib".cstr.ptr)
            val jniMethod = allocArray<JNINativeMethod>(1)
            jniMethod[0].fnPtr = staticCFunction(::sayHello)

            jniMethod[0].name = "sayHello".cstr.ptr
            jniMethod[0].signature = "()V".cstr.ptr
            env.RegisterNatives!!(envStorage.value, jclass, jniMethod, 1)
        }
        JNI_VERSION_1_6
    }
}

fun main() {
    println("Hello from Kotlin/Native")
}

fun nativeFunction(): String {
    return "Hello from Kotlin/Native"
}
