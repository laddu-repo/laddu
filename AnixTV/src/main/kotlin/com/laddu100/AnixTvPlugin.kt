package com.laddu100

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class AnixTvPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(AnixTvProvider())
        registerExtractorAPI(AnixTvMegaPlay())
        registerExtractorAPI(AnixTvVidWish())
        registerExtractorAPI(AnixTvVidPlay())
    }
}
