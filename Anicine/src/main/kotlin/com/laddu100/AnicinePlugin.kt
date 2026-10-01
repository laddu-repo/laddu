package com.laddu100

import android.content.Context
import com.lagradost.api.Log
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class AnicinePlugin : Plugin() {
    override fun load(context: Context) {
        Log.d("Anicine", "Plugin.load() START")
        try {
            registerMainAPI(AnicineProvider())
            Log.d("Anicine", "Plugin.load() SUCCESS — AnicineProvider registered")
        } catch (e: Throwable) {
            Log.e("Anicine", "Plugin.load() FAILED: ${e.message}\n${e.stackTraceToString().take(1000)}")
        }
    }
}
