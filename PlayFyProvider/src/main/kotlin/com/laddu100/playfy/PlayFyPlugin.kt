package com.laddu100.playfy

import android.content.Context
import com.lagradost.cloudstream3.plugins.Plugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

/**
 * CloudStream plugin entry-point for PlayFy TV.
 *
 * Registers [PlayFyProvider] which fetches live TV channels
 * from the globalmediapoint.online API using AES decryption
 * via the PlayFy TV native library (loaded from the installed APK).
 */
@CloudstreamPlugin
class PlayFyPlugin : Plugin() {

    override fun load(context: Context) {
        registerMainAPI(PlayFyProvider())
    }
}
