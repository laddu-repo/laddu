package com.laddu100.anitaku

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class AnitakuPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Anitaku())
    }
}
