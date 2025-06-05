# Android Studio & Gradle

## Studio

compileSdk 35 编译失败，需要升级 agp 8.6.0, gradle 8.7  
[Android Gradle plugin Upgrade Assistant](https://developer.android.com/build/agp-upgrade-assistant)  
[Minimum versions of tools for Android API level](https://developer.android.com/build/releases/gradle-plugin#api-level-support)  
[Android resource linking failed with android-35 SDK during Flutter release build](https://stackoverflow.com/questions/78778617)  

## Gradle

依赖文件缓存位置 `~/.gradle/caches/modules-2/files-2.1`  
版本信息缓存位置 `~/.gradle/caches/modules-2/metadata-x.xxx`  
[Dealing with ephemeral builds](https://docs.gradle.org/8.14.1/userguide/dependency_caching.html#sec:ephemeral-ci-cache)  
