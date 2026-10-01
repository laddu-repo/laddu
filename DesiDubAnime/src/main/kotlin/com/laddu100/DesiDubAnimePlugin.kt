package com.laddu100

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class DesiDubAnimePlugin : Plugin() {
    override fun load(context: android.content.Context) {
        registerMainAPI(DesiDubAnimeProvider())
    }
}
