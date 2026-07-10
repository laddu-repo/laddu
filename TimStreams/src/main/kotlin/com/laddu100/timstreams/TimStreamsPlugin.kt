package com.laddu100.timstreams

import android.content.Context
import com.lagradost.cloudstream3.CloudstreamPlugin
import com.lagradost.cloudstream3.Plugin
import com.lagradost.cloudstream3.registerMainAPI

@CloudstreamPlugin
class TimStreamsPlugin : Plugin() {
    override fun load(context: Context) {
        TimStreamsProvider.context = context
        registerMainAPI(TimStreamsProvider())
    }
}