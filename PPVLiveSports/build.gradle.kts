version = 1

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
    description = "PPV Live Sports - All sports, 24/7 channels, live & upcoming"
    authors = listOf("raghav")
    status = 1
    tvTypes = listOf("Live")
    iconUrl = "https://ppv.st/favicon.png"
}
