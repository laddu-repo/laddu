package com.anikoto

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import com.laddu100.DoHDnsResolver

@CloudstreamPlugin
class AnikotoPlugin : Plugin() {
    override fun load(context: Context) {
        DoHDnsResolver.inject()
        registerMainAPI(AnikotoProvider())
        registerExtractorAPI(MegaPlay())
        registerExtractorAPI(Vidwish())
        registerExtractorAPI(Vidtube())
    }
}
