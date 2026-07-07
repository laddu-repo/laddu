version = 16

android {
    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation("com.google.android.material:material:1.14.0")
}

cloudstream {
    language = "en"
    description = "Torrent support for Anime, Movies and TV via Torrentio, TorrentsDB, Animetosho and custom Stremio addons"
    authors = listOf("raghav")
    status = 1
    tvTypes = listOf("Anime", "AnimeMovie", "OVA", "Movie", "TvSeries", "Torrent")
    iconUrl = "https://png.pngtree.com/element_our/png/20181227/movie-icon-which-is-designed-for-all-application-purpose-new-png_287896.jpg"
    requiresResources = true
}
