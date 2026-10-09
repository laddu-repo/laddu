version = 1

cloudstream {
    language = "en"
    description = "Anime-TH (anime-th.com) Thai anime catalog with real Thai episode names and Sub / Dub tabs. Thai subtitles are hardsubbed into the SUB streams (the site ships no subtitle files), DUB streams are clean Thai audio. 1080p HLS from the site's own main server. Dubbed titles with a sub counterpart on the site show both tabs."
    authors = listOf("laddu")

    status = 1
    tvTypes = listOf(
        "Anime",
        "AnimeMovie"
    )
    iconUrl = "https://anime-th.com/favicon.ico"
}

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
