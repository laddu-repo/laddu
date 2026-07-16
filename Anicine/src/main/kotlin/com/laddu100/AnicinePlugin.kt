package com.laddu100

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class AnicinePlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(AnicineProvider())
    }
}
