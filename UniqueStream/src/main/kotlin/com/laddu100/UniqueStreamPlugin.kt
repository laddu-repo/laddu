package com.laddu100

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

/**
 * DISABLED — see build.gradle.kts (status = 0).
 *
 * Reason: The get.mediacache.cc CDN (used for popular anime with dubs) encrypts
 * segments with non-standard AES-256-CTR while declaring AES-128 in the m3u8.
 * ExoPlayer only supports AES-128-CBC, so playback is impossible.
 * Only donghua content on yte.mediacache.cc (standard HLS) would play.
 *
 * The provider class is kept for reference but not registered.
 */
@CloudstreamPlugin
class UniqueStreamPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(UniqueStream())
    }
}
