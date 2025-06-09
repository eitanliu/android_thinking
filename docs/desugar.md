# desugaring

[Which Java APIs can I use in my Java or Kotlin source code?](https://developer.android.com/build/jdks#compileSdk)  
[android-14 Java 17 Core libraries](https://developer.android.com/about/versions/14/features#core-libraries)  
[android-13 Java 11 Core libraries](https://developer.android.com/about/versions/13/features#core-libraries)  
[android-12 Java 11 APIs](https://developer.android.com/about/versions/12/features#java-api)  
[android-8 Java 8 APIs](https://developer.android.com/about/versions/oreo/android-8.0#art)  

可使用的 Java API `脱糖` [Java 8+ API desugaring support](https://developer.android.com/studio/write/java8-support#library-desugaring)  
Android 8 (API 26) 以下通过脱糖获得 Java 8 及更高版本 API [Java 8+ APIs available through desugaring](https://developer.android.com/studio/write/java8-support-table)  
Android 13 (API 33) 以下通过脱糖提供的 Java 11 及更高版本 API [Java 11+ APIs available through desugaring](https://developer.android.com/studio/write/java11-default-support-table)  
[Java 11+ APIs available through desugaring with the minimal specification](https://developer.android.com/studio/write/java11-minimal-support-table)  
[Java 11+ APIs available through desugaring with the nio specification](https://developer.android.com/studio/write/java11-nio-support-table)

```kotlin

android {
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs_nio:2.1.5")
    // miniVersion Android 8 (API 26) 使用
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs_minimal:2.1.5")
}
```

### API 24

[java.util.stream](https://developer.android.com/reference/java/util/stream/package-summary)  

### API 26

[java.time](https://developer.android.com/reference/java/time/package-summary)  
[java.nio.file](https://developer.android.com/reference/java/nio/file/package-summary)  
[java.lang.invoke](https://developer.android.com/reference/java/lang/invoke/package-summary)  

