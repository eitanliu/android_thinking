@file:OptIn(
    org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class,
)

import org.jetbrains.kotlin.gradle.dsl.JvmTarget


plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.thinking.util"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

kotlin {
    sourceSets.all {
        languageSettings.apply {
            optIn("androidx.compose.material3.ExperimentalMaterial3Api")
            optIn("kotlin.ExperimentalStdlibApi")
            optIn("kotlin.experimental.ExperimentalNativeApi")
            optIn("kotlin.native.runtime.NativeRuntimeApi")
            optIn("kotlin.time.ExperimentalTime")
            // 2.1.2
            optIn("kotlin.concurrent.atomics.ExperimentalAtomicApi")
            optIn("kotlin.uuid.ExperimentalUuidApi")

            optIn("kotlinx.cinterop.ExperimentalForeignApi")
            optIn("kotlinx.coroutines.DelicateCoroutinesApi")
            optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
        }
    }

    compilerOptions {
        jvmTarget = JvmTarget.JVM_11
        freeCompilerArgs.add("-Xwhen-guards")
    }
}

dependencies {

    api(project(":util-common"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}