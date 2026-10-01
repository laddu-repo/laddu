version = 2

cloudstream {
    language = "en"
    description = "Shiro - Watch Anime in HD with Sub & Dub. Multi-server (Plum, Lemon, Cherry, Grape) with multi-language subtitles."
    authors = listOf("raghav")

    status = 1
    tvTypes = listOf(
        "Anime",
        "AnimeMovie",
        "OVA"
    )
    iconUrl = "https://shiro.so/favicon.ico"
}

// The cloudstream3 pre-release SDK's inline helpers (parseJson/toJson) are compiled with
// JVM 11 bytecode, so this module must also target JVM 11 to inline them. The root
// build.gradle.kts defaults subprojects to JVM 1.8; override it here.
android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}

