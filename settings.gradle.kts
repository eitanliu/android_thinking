@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev/")
            content {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("org.jetbrains")
            }
        }
        maven {
            url = uri("https://jitpack.io")
            content {
                includeGroupAndSubgroups("com.github")
            }
        }
    }
}

rootProject.name = "android_thinking"
include(":app")
// include(":libkn")
// include(":libkn-api")
include(":sdk-stub")
include(":util-common")
include(":util-debug")
include(":util-release")
