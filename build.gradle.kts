// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.9.2" apply false
    // Use Kotlin 2.0.0
    id("com.google.devtools.ksp") version "2.1.10-1.0.30" apply false
    id("org.jetbrains.kotlin.android") version "2.1.10" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.10" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "2.1.10" apply false
    id("com.google.dagger.hilt.android") version "2.56.2" apply false
}


