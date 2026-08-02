package com.laddu100.sportseera

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class SportsEeraPlugin : Plugin() {
    override fun load() {
        registerMainAPI(SportsEeraProvider())
    }
}
