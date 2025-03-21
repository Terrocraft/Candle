plugins {

}

buildscript {
    repositories {
        mavenCentral()
    }
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    // Apply the Kotlin JVM plugin to all subprojects
    apply(plugin = "org.jetbrains.kotlin.jvm")

    dependencies {
        // Common dependencies (if any) can be added here
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "21"
        }
    }
}