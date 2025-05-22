// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.multiplatform) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
}


allprojects {
    configurations.all {
        resolutionStrategy {
            force(libs.kotlin.stdlib)
            force(libs.kotlin.stdlib.jdk7)
            force(libs.kotlin.stdlib.jdk8)
            force(libs.kotlinx.coroutines.core)
            force(libs.androidx.lifecycle.common)
            force(libs.androidx.lifecycle.runtime)
            force(libs.androidx.lifecycle.runtime.ktx)
            force(libs.androidx.lifecycle.runtime.compose)
            force(libs.androidx.lifecycle.viewmodel)
            force(libs.androidx.lifecycle.viewmodel.ktx)
            force(libs.androidx.lifecycle.viewmodel.compose)
            force(libs.androidx.lifecycle.viewmodel.savedstate)
        }
    }
}

fun DependencyResolveDetails.force(
    dependency: ProviderConvertible<MinimalExternalModuleDependency>
) = force(dependency.get())


fun DependencyResolveDetails.force(
    dependency: Provider<MinimalExternalModuleDependency>
) = force(dependency.get())

fun DependencyResolveDetails.force(dependency: ExternalDependency) {
    if (requested.module == dependency.module) {
        val version = dependency.version
        if (version != null) useVersion(version)
    }
}

fun ProviderConvertible<MinimalExternalModuleDependency>.getModuleMap() =
    get().module.getModuleMap()

fun Provider<MinimalExternalModuleDependency>.getModuleMap() =
    get().module.getModuleMap()

fun ProviderConvertible<MinimalExternalModuleDependency>.get() = asProvider().get()

fun ModuleIdentifier.getModuleMap() = mapOf(
    "group" to group,
    "module" to name,
)