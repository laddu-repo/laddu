package com.laddu100

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class TheMoviesFlixPlugin : Plugin() {
    override fun load(context: Context) {
        // Register the main provider
        registerMainAPI(TheMoviesFlix())

        // Register custom extractors for download hosts
        // These are automatically dispatched by loadExtractor() based on URL domain
        registerExtractorAPI(FastDlExtractor())
        registerExtractorAPI(VCloudExtractor())
        registerExtractorAPI(GoFileExtractor())
        registerExtractorAPI(FileBeeExtractor())
    }
}
