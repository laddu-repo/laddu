version = 2

cloudstream {
    language = "th"
    description = "Just anime with Thai dub and sub"
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
