# desugaring

[Java versions in Android builds](https://developer.android.com/build/jdks)  
[Android Releases](https://developer.android.com/about/versions)  

[Java 8+ API desugaring support](https://developer.android.com/studio/write/java8-support#library-desugaring)
可使用的 Java API [JDK compileSdk](https://developer.android.com/build/jdks#compileSdk) `脱糖` [desugaring](https://developer.android.com/studio/write/java8-support)  
8 (API 26) 以下通过脱糖获得 Java 8 及更高版本 API [Java 8+ APIs available through desugaring](https://developer.android.com/studio/write/java8-support-table)  
13 (API 33) 以下通过脱糖提供的 Java 11 及更高版本 API [Java 11+ APIs available through desugaring](https://developer.android.com/studio/write/java11-default-support-table)

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
}
```
