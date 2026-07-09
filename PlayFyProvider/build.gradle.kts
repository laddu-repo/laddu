// use an integer for version numbers
version = 1

android {
    namespace = "com.laddu100.playfy"
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core:1.16.0")
    implementation("com.google.android.material:material:1.12.0")
}

cloudstream {
    language = "en"
    description = "Watch Live Sports & Events on PlayFy TV"
    authors = listOf("raghav")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1
    tvTypes = listOf(
        "Live",
    )
    requiresResources = false

    iconUrl = "https://www.google.com/s2/favicons?domain=globalmediapoint.online&sz=%size%"
}
