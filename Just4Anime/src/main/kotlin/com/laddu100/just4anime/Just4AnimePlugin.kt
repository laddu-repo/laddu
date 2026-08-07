package com.laddu100.just4anime

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class Just4AnimePlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Just4Anime())
    }
}
