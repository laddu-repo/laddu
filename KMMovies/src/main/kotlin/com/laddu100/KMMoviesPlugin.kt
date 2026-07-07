package com.laddu100

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class KMMoviesPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(KMMovies())
    }
}
