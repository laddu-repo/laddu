package com.laddu100.anitaku2

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class Anitaku2Plugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Anitaku2Provider())
        registerExtractorAPI(VibePlayerExtractor())
        registerExtractorAPI(StreamHgExtractor())
        registerExtractorAPI(EarnvidsExtractor())
    }
}
