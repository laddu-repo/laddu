package com.laddu100

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class TwoMoviesFDPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(TwoMoviesFD())
        registerExtractorAPI(ByseExtractor())
        registerExtractorAPI(StreamHGExtractor())
    }
}
