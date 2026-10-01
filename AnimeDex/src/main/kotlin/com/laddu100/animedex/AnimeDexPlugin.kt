package com.laddu100.animedex

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class AnimeDexPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(AnimeDexProvider())
    }
}
