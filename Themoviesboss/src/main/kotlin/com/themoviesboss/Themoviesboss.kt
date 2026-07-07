package com.themoviesboss

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class Themoviesboss : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(ThemoviesbossProvider())
        registerExtractorAPI(TMBCloudExtractor())
    }
}
