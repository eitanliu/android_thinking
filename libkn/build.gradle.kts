import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

base {
    archivesName.set("kn")
}

kotlin {

    val buildTypes = setOf(NativeBuildType.RELEASE)

    listOf(
        androidNativeArm64()
    ).forEach { target ->
        target.binaries {
            executable(buildTypes) {
                baseName = base.archivesName.get()
            }
            sharedLib(buildTypes) {
                baseName = base.archivesName.get()
            }
        }
    }

    // listOf(
    //     macosArm64()
    // ).forEach { target ->
    //     target.binaries {
    //         executable(buildTypes)
    //         sharedLib(buildTypes)
    //     }
    // }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.coroutines.core)
            //put your multiplatform dependencies here
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }

        all {
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
    }

    compilerOptions {
        // jvmTarget = JvmTarget.fromTarget(libs.versions.jvm.get())
        freeCompilerArgs.addAll(
            "-Xwhen-guards",
            "-Xnon-local-break-continue",
            "-Xmulti-dollar-interpolation"
        )
    }
}