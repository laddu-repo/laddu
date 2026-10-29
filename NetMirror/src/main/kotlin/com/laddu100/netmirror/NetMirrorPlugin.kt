package com.laddu100.netmirror

import android.content.Context
import com.lagradost.api.Log
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

/**
 * NetMirror plugin entry point.
 *
 * Built from a full reverse-engineering pass of the official NetMirror.apk
 * (React Native + Hermes HBC v96, app.netmirror.nmv2 v3.1) and the live
 * netmirror web app (netmirror.global -> rotating mirror domains such as
 * netmirror.plus):
 *
 *  - APK domain discovery: 24 mobidetect.* fallback domains answering
 *    {token_hash (webview start url), stape (resolver), u (extractor hosts)}
 *    from /check.php.
 *  - Current web architecture (all verified live):
 *      catalog  GET api2.imdb3.shop/api/tranding?id=..&items_per_page=..&page=..
 *               GET api2.imdb3.shop/api/movies/filter?sort_by=..&dubbing=..&page=..
 *      search   GET api2.imdb4.shop/api/search2/{q}?page=..
 *      details  GET api2.imdb3.shop/api/{movie|tv}/{id}
 *      player   GET {webvp.watch21.shop}/play/watchbox.php?id={subjectid}
 *               &se&ep&dp&na&year&tm_id&ts&sig&nid&exten=false
 *               sig = HMAC-SHA256("{tm_id}:{ts}", "net###@@sss") hex
 *      streams  ArtPlayer page -> quality items (480P bt/ + 1080P resource/ mp4)
 *               + language subtitle items (cacdn.hakunaymatata.com srt)
 */
@CloudstreamPlugin
class NetMirrorPlugin : Plugin() {
    override fun load(context: Context) {
        try {
            Log.d("NetMirror", "Plugin.load() START")
            registerMainAPI(NetMirrorProvider())
            Log.d("NetMirror", "Plugin.load() SUCCESS - NetMirrorProvider registered")
        } catch (e: Throwable) {
            Log.e("NetMirror", "Plugin.load() FAILED: ${e.message}")
            throw e
        }
    }
}
