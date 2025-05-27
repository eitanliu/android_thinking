package com.example.thinking.util

/**
 *
 * [java.lang.System.getenv] 获取系统环境变量
 * [java.lang.System.getProperty] 获取系统属性
 *
 * Android
 * [java.lang.System.initUnchangeableSystemProperties]
 * [java.lang.AndroidHardcodedSystemProperties.STATIC_PROPERTIES]
 *
 * JDK
 * [jdk.internal.util.SystemProps]
 * [java.lang.VersionProps]
 * [Class File Versions](https://javaalmanac.io/bytecode/versions/)
 */
object SystemConfig {
    // Unchangeable
    const val KEY_PROP_JAVA_BOOT_CLASS_PATH = "java.boot.class.path"
    const val KEY_PROP_JAVA_CLASS_PATH = "java.class.path"
    const val KEY_PROP_JAVA_HOME = "java.home"
    const val KEY_PROP_JAVA_VM_VERSION = "java.vm.version"
    const val KEY_PROP_USER_NAME = "user.name"
    const val KEY_PROP_OS_ARCH = "os.arch"
    const val KEY_PROP_OS_NAME = "os.name"
    const val KEY_PROP_OS_VERSION = "os.version"
    const val KEY_PROP_ICU_VERSION = "android.icu.library.version"
    const val KEY_PROP_ICU_UNICODE_VERSION = "android.icu.unicode.version"
    const val KEY_PROP_ICU_CLDR_VERSION = "android.icu.cldr.version"

    // STATIC_PROPERTIES
    const val KEY_PROP_JAVA_CLASS_VERSION = "java.class.version"
    const val KEY_PROP_JAVA_VERSION = "java.version"

    const val KEY_PROP_FILE_ENCODING = "file.encoding"
    const val KEY_PROP_FILE_SEPARATOR = "file.separator"
    const val KEY_PROP_LINE_SEPARATOR = "line.separator"
    const val KEY_PROP_PATH_SEPARATOR = "path.separator"

    const val KEY_PROP_USER_HOME = "user.home"
    const val KEY_PROP_USER_AGENT = "http.agent"

    const val KEY_ENV_PATH = "PATH"
    const val KEY_ENV_TMPDIR = "TMPDIR"
    const val KEY_ENV_ANDROID_DATA = "ANDROID_DATA"
    const val KEY_ENV_ANDROID_ASSETS = "ANDROID_ASSETS"
    const val KEY_ENV_ANDROID_STORAGE = "ANDROID_STORAGE"
    const val KEY_ENV_ANDROID_ART_ROOT = "ANDROID_ART_ROOT"
    const val KEY_ENV_ANDROID_ROOT = "ANDROID_ROOT"
    const val KEY_ENV_SYSTEMSERVERCLASSPATH = "SYSTEMSERVERCLASSPATH"
    const val KEY_ENV_STANDALONE_SYSTEMSERVER_JARS = "STANDALONE_SYSTEMSERVER_JARSH"
    const val KEY_ENV_DEX2OATBOOTCLASSPATH = "DEX2OATBOOTCLASSPATH"
    const val KEY_ENV_BOOTCLASSPATH = "BOOTCLASSPATH"
}