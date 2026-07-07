import com.android.build.gradle.BaseExtension // Use BaseExtension for broader compatibility
import com.lagradost.cloudstream3.gradle.CloudstreamExtension
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.register
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // This is required for CloudStream plugins
    }

    dependencies {
        // Use the snapshot version as shown below
        classpath("com.github.recloudstream:gradle:-SNAPSHOT")
        
        // Ensure you have these essential plugins
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

fun Project.cloudstream(configuration: CloudstreamExtension.() -> Unit) = 
    extensions.getByName<CloudstreamExtension>("cloudstream").configuration()

// Note: Using BaseExtension instead of LibraryExtension for broader compatibility
fun Project.android(configuration: BaseExtension.() -> Unit) = 
    extensions.getByName<BaseExtension>("android").configuration()

subprojects {
    apply(plugin = "com.android.library")
    apply(plugin = "kotlin-android") // Standard Kotlin plugin application
    apply(plugin = "com.lagradost.cloudstream3.gradle")

    cloudstream {
        // Ensure this points to YOUR specific repository URL
        setRepo(System.getenv("GITHUB_REPOSITORY") ?: "https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME")
        authors = listOf("YourName")
    }

    android {
        namespace = "com.lagradost.${project.name.toLowerCase()}"
        compileSdkVersion(35) // Ensure this is a valid SDK version

        defaultConfig {
            minSdk = 21
            targetSdk = 35
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

        tasks.withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = "1.8"
                // Disables unnecessary assertions to fix common plugin build errors
                freeCompilerArgs = freeCompilerArgs + listOf(
                    "-Xno-call-assertions",
                    "-Xno-param-assertions",
                    "-Xno-receiver-assertions"
                )
            }
        }
    }

    dependencies {
        val cloudstream by configurations
        val implementation by configurations
        
        // This provides the base CloudStream classes
        cloudstream("com.lagradost:cloudstream3:pre-release")

        // Standard dependencies
        implementation(kotlin("stdlib"))
        implementation("com.github.Blatzar:NiceHttp:0.4.18")
        implementation("org.jsoup:jsoup:1.18.3")
        implementation("androidx.annotation:annotation:1.9.1")
        
        // IMPORTANT: Keep these versions low to prevent plugin runtime conflicts
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
        implementation("com.fasterxml.jackson.core:jackson-databind:2.13.1")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
        implementation("org.mozilla:rhino:1.8.1")
        implementation("me.xdrop:fuzzywuzzy:1.4.0")
        implementation("com.google.code.gson:gson:2.10.1")
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
        implementation("org.bouncycastle:bcpkix-jdk18on:1.78")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
