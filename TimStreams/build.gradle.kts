plugins {
    id("com.android.library")
}

version = 1

android {
    buildFeatures {
        buildConfig = true
    }
}

cloudstream {
    description = "TimStreams - Watch Live Sports Free"
    authors = listOf("raghav")
    status = 1
    tvTypes = listOf("Live", "Movie", "TVSeries")
    language = "en"
    iconUrl = "https://i.ibb.co/7tBHzxnY/ff.png"
}
