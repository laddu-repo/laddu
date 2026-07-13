version = 14

android {
    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
}

cloudstream {
    language = "en"
    description = "AniSnatch - Multi-source anime with sub, dub, Hindi & multi-language"
    authors = listOf("raghav")
    status = 1
    tvTypes = listOf("Anime", "AnimeMovie", "OVA")
    iconUrl = "https://anisnatch.top/favicon.ico?v1.3.9"
}
