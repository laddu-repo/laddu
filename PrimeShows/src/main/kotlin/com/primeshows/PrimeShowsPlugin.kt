package com.primeshows

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class PrimeShowsPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(PrimeShowsProvider())

        // Register custom extractors for all embed domains
        // These are auto-matched by CloudStream when loadExtractor() is called
        registerExtractorAPI(VideasyExtractor())
        registerExtractorAPI(VidfastExtractor())
        registerExtractorAPI(VidcoreExtractor())
        registerExtractorAPI(VidrockExtractor())
        registerExtractorAPI(VidupExtractor())
        registerExtractorAPI(ScreenscapeExtractor())
        registerExtractorAPI(RozarExtractor())
        registerExtractorAPI(VidshowsExtractor())
        registerExtractorAPI(AnimeMegaExtractor())
        registerExtractorAPI(AnimeFizzExtractor())
    }
}
