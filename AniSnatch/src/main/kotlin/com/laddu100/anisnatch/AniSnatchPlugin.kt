package com.laddu100.anisnatch

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class AniSnatchPlugin : Plugin() {
    override fun load(context: Context) {
        AniSnatchProvider.context = context
        registerMainAPI(AniSnatchProvider())
    }
}
