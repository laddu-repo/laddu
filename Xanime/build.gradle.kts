version = 3

cloudstream {
    language = "en"
    description = "Xanime - Watch anime with full Sub & Dub separation. Signed HLS streams up to 1080p, multi-language subtitles (EN, AR, FR, DE, IT, PT-BR, RU, ES, and more), real episode titles from AniList, intro/outro skip data. Powered by xanime.me."
    authors = listOf("laddu")

    status = 1
    tvTypes = listOf(
        "Anime",
        "AnimeMovie",
        "OVA"
    )
    iconUrl = "https://xanime.me/favicon.ico"
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
