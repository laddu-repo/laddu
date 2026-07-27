package com.laddu100.animex

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.api.Log

class FlixCloudExtractor : ExtractorApi() {
    override val name = "FlixCloud"
    override val mainUrl = "https://flixcloud.cc"
    override val requiresReferer = true

    private val chromeUA =
        "Mozilla/5.0 (Linux; Android 13; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36"

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            val embedHtml = app.get(url, referer = referer).text

            // Extract ASS subtitles from the embed HTML (stronghole.site CDN).
            // Format: url:"https://...stronghole.../file.ass" ... language:"English (...)"
            Regex("""url:"(https://[^"]*stronghole[^"]*\.ass)"[\s\S]{0,120}?language:"([^"]*)"""")
                .findAll(embedHtml).forEach { match ->
                    subtitleCallback.invoke(SubtitleFile(match.groupValues[2], match.groupValues[1]))
                }

            // The playable m3u8 URL is generated at runtime by in-page WASM + hls.js.
            // We cannot replicate the WASM decryption in Kotlin, so we let the WebView run
            // the page JS and intercept the final master.m3u8 request to fetch.flixcloud.cc.
            val (request, _) = WebViewResolver(
                interceptUrl = Regex("""fetch\.flixcloud\.cc.*\.m3u8"""),
                userAgent = chromeUA,
                useOkhttp = false,
                additionalUrls = listOf(Regex("""\.(m3u8|mp4)""")),
                script = null,
                scriptCallback = null,
                timeout = 30_000L
            ).resolveUsingWebView(url) { req ->
                req.url.toString().contains("fetch.flixcloud.cc") &&
                    req.url.toString().contains(".m3u8")
            }

            if (request != null) {
                val m3u8Url = request.url.toString()
                Log.d("AnimeX", "FlixCloud: intercepted m3u8=$m3u8Url")

                val cookies = try {
                    android.webkit.CookieManager.getInstance().getCookie("https://flixcloud.cc")
                } catch (_: Exception) { null }

                // Full browser headers — the flixcloud CDN rejects requests that lack a
                // browser User-Agent (returns a 403/error page instead of the m3u8, which
                // surfaces in ExoPlayer as "Input does not start with the #EXTM3U header").
                val headers = mutableMapOf(
                    "Referer" to "https://flixcloud.cc/",
                    "User-Agent" to chromeUA,
                    "Origin" to "https://flixcloud.cc",
                    "Accept" to "*/*",
                    "Accept-Language" to "en-US,en;q=0.9",
                    "Sec-Fetch-Dest" to "empty",
                    "Sec-Fetch-Mode" to "cors",
                    "Sec-Fetch-Site" to "same-site"
                )
                if (!cookies.isNullOrBlank()) headers["Cookie"] = cookies

                callback.invoke(
                    ExtractorLink(
                        source = name,
                        name = name,
                        url = m3u8Url,
                        referer = "https://flixcloud.cc/",
                        quality = Qualities.Unknown.value,
                        type = ExtractorLinkType.M3U8,
                        headers = headers
                    )
                )
            } else {
                Log.e("AnimeX", "FlixCloud: WebViewResolver returned no m3u8 for $url")
            }
        } catch (e: Exception) {
            Log.e("AnimeX", "FlixCloud: ${e.message}")
        }
    }
}
