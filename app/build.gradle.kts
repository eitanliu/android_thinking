@file:OptIn(
    org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class,
)

import org.jetbrains.kotlin.gradle.dsl.JvmTarget


plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.thinking"

    // buildToolsVersion = "34.0.0"
    // ndkVersion = "22.1.7171670"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.example.thinking"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    viewBinding.enable = true
    dataBinding.enable = true

    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
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

    coreLibraryDesugaring(libs.desugar.jdk.libs)
    // android
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.constraintlayout)

    // ktx
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.collection.ktx)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.dynamicanimation.ktx)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.livedata.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.paging.common.ktx)
    implementation(libs.androidx.paging.runtime.ktx)
    implementation(libs.androidx.palette.ktx)
    implementation(libs.androidx.preference.ktx)
    implementation(libs.androidx.startup.runtime)
    implementation(libs.androidx.work.runtime.ktx)

    // compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material3)
    implementation(libs.material)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.ui.tooling.preview)

    // google
    implementation(libs.gson)
    // implementation(libs.play.core.ktx)
    implementation(libs.play.asset.ktx)
    implementation(libs.play.feature.ktx)
    implementation(libs.play.review.ktx)
    implementation(libs.play.update.ktx)
    implementation(libs.play.services.base)
    implementation(libs.play.services.basement)
    implementation(libs.play.services.location)
    implementation(libs.play.services.tasks)
    implementation(libs.play.services.auth)
    implementation(libs.play.services.ads)
    implementation(libs.google.ump)
    implementation(libs.mlkit.barcode.scanning)
    implementation(libs.mlkit.document.scanner)
    implementation(libs.billing.ktx)

    implementation(platform(libs.kotlinx.coroutines.bom))
    implementation(libs.kotlinx.coroutines.play)

    implementation("com.github.eitanliu.cleaner:android:main-SNAPSHOT")

    debugImplementation(project(":util-debug"))
    releaseImplementation(project(":util-release"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}