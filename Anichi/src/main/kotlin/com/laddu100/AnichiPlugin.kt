package com.laddu100

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class AnichiPlugin: Plugin() {
    override fun load(context: Context) {
        // Register the provider
        registerMainAPI(AnichiProvider())
    }
}
