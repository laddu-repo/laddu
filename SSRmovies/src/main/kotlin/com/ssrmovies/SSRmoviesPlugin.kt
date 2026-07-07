package com.ssrmovies

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class SSRmoviesPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(SSRmoviesProvider())
        registerExtractorAPI(WatchOnlineMomExtractor())
    }
}
