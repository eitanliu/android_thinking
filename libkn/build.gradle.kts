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
                optIn("kotlin.experimental.ExperimentalNativeApi")
                optIn("kotlinx.cinterop.ExperimentalForeignApi")
            }
        }
    }
}