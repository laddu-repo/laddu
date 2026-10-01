package com.enma

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class EnmaPlugin : Plugin() {
    override fun load(context: Context) {
        // Store context and kick off WASM initialization immediately.
        // The init runs in a SupervisorJob (survives coroutine cancellation).
        // By the time getMainPage is called, the WASM may already be ready.
        EnmaDecryptor.setContext(context)
        EnmaDecryptor.startInit()
        registerMainAPI(EnmaProvider())
    }
}
