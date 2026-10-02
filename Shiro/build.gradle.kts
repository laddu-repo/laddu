version = 7

cloudstream {
    description = "Anime with Sub, Dub and Hardsub - multiple servers, real episode titles, multi-language subtitles. Based on csksy's Shiro, hardened for filtering-proxy networks."
    authors = listOf("csksy", "laddu")

    status = 1
    tvTypes = listOf(
        "Anime",
        "AnimeMovie",
        "OVA"
    )
    language = "en"
    iconUrl = "https://www.google.com/s2/favicons?domain=shiro.so&sz=%size%"
}

android {
    buildFeatures {
        buildConfig = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

// The cloudstream3 pre-release SDK's inline helpers (parseJson/toJson) are compiled with
// JVM 11 bytecode, so this module must also target JVM 11 to inline them. The root
// build.gradle.kts defaults subprojects to JVM 1.8; override it here.
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}
