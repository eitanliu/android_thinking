@file:OptIn(
    org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class,
)

import org.jetbrains.kotlin.gradle.dsl.JvmTarget


plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.ksp)
    id("kotlin-kapt")
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

    signingConfigs {
        getByName("debug") {
            storeFile = rootProject.file("debug.jks")
            storePassword = "debug1"
            keyAlias = "debug"
            keyPassword = "debug1"
        }
    }

    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("debug")
        }

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
        sourceCompatibility = JavaVersion.toVersion(libs.versions.jvm.get())
        targetCompatibility = JavaVersion.toVersion(libs.versions.jvm.get())
    }

    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }

    lintOptions.apply {
        // isAbortOnError = true // 禁用所有链接检查
        // isCheckReleaseBuilds = true // 忽略所有链接检查警告
        // baseline(rootProject.file("lint.xml"))
        // sources lint
        disable += listOf("ObsoleteSdkInt")
        // xml lint
        disable += listOf("HardcodedText", "SmallSp", "SpUsage")
    }

    buildFeatures {
        buildConfig = true
        resValues = true
        viewBinding = true
        dataBinding = true
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
        jvmTarget = JvmTarget.fromTarget(libs.versions.jvm.get())
        freeCompilerArgs.addAll(
            // 2.1.0
            "-Xwhen-guards",
            "-Xnon-local-break-continue",
            "-Xmulti-dollar-interpolation",
            // 2.2.0
            "-Xcontext-parameters",
            "-Xnested-type-aliases",
        )
    }
}

dependencies {

    coreLibraryDesugaring(libs.desugar.jdk.libs)
    // compileOnly(files("sources/android-35.jar"))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
    compileOnly(project(":sdk-stub"))

    // android
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.constraintlayout.compose)

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

    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.exoplayer.hls)
    implementation(libs.androidx.media3.exoplayer.dash)
    implementation(libs.androidx.media3.exoplayer.rtsp)
    implementation(libs.androidx.media3.exoplayer.smoothstreaming)
    implementation(libs.androidx.media3.ui)
    implementation(libs.androidx.media3.ui.leanback)
    implementation(libs.androidx.media3.session)

    // compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material3)
    implementation(libs.material)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.navigation.compose)

    // google
    implementation(libs.gson)
    // implementation(libs.play.core.ktx)
    implementation(libs.play.asset.ktx)
    implementation(libs.play.feature.ktx)
    implementation(libs.play.review.ktx)
    implementation(libs.play.update.ktx)
    implementation(libs.play.base)
    implementation(libs.play.basement)
    implementation(libs.play.tasks)
    implementation(libs.play.auth)
    implementation(libs.play.ads)
    implementation(libs.play.location)
    implementation(libs.play.time)
    implementation(libs.play.wearable)
    implementation(libs.play.cronet)
    implementation(libs.play.threadnetwork)
    implementation(libs.google.ump)
    implementation(libs.google.billing.ktx)
    implementation(libs.play.mlkit.document.scanner)
    implementation(libs.mlkit.genai.summarization)
    implementation(libs.mlkit.genai.proofreading)
    implementation(libs.mlkit.genai.rewriting)
    implementation(libs.mlkit.genai.image.description)
    // Vision
    implementation(libs.mlkit.text.recognition)
    implementation(libs.mlkit.text.recognition.chinese)
    implementation(libs.mlkit.text.recognition.devanagari)
    implementation(libs.mlkit.text.recognition.japanese)
    implementation(libs.mlkit.text.recognition.korean)
    implementation(libs.mlkit.face.detection)
    implementation(libs.mlkit.face.mesh.detection)
    implementation(libs.mlkit.pose.detection)
    implementation(libs.mlkit.pose.detection.accurate)
    implementation(libs.mlkit.selfie.segmentation)
    implementation(libs.mlkit.barcode.scanning)
    implementation(libs.mlkit.image.labeling)
    implementation(libs.mlkit.image.labeling.custom)
    implementation(libs.mlkit.obj.detection)
    implementation(libs.mlkit.obj.detection.custom)
    implementation(libs.mlkit.digital.ink.recognition)
    // Natural language
    implementation(libs.mlkit.language.id)
    implementation(libs.mlkit.translate)
    implementation(libs.mlkit.smart.reply)
    implementation(libs.mlkit.entity.extraction)

    implementation(libs.kotlin.reflect)
    implementation(libs.kotlinx.metadata)
    implementation(platform(libs.kotlinx.coroutines.bom))
    implementation(libs.kotlinx.coroutines.play)
    implementation(libs.kotlinx.serialization.core)
    implementation(libs.kotlinx.io.core)
    implementation(libs.kotlinx.datetime)

    implementation(libs.eitanliu.cleaner.android)

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