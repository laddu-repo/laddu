package com.laddu100.ppv

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class PPVLiveSportsPlugin : Plugin() {
    override fun load(context: Context) {
        PPVLiveSportsProvider.context = context
        registerMainAPI(PPVLiveSportsProvider())
    }
}
