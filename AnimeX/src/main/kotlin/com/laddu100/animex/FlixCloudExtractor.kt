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

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            val embedHtml = app.get(url, referer = referer).text

            Regex("""url:"(https://[^"]*stronghole[^"]*\.ass)"[\s\S]{0,100}?language:"([^"]*)"""").findAll(embedHtml).forEach { match ->
                subtitleCallback.invoke(SubtitleFile(match.groupValues[2], match.groupValues[1]))
            }

            val (request, _) = WebViewResolver(
                interceptUrl = Regex("""fetch\.flixcloud\.cc.*\.m3u8"""),
                userAgent = "Mozilla/5.0 (Linux; Android 13; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36",
                useOkhttp = false,
                additionalUrls = listOf(Regex("""\.(m3u8|mp4)""")),
                script = null,
                scriptCallback = null,
                timeout = 30_000L
            ).resolveUsingWebView(url) { req ->
                req.url.toString().contains("fetch.flixcloud.cc") && req.url.toString().contains(".m3u8")
            }

            if (request != null) {
                val m3u8Url = request.url.toString()
                val cookies = try {
                    android.webkit.CookieManager.getInstance().getCookie("https://fetch.flixcloud.cc")
                } catch (_: Exception) { null }

                val headers = mutableMapOf("Referer" to "https://flixcloud.cc/")
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
            }
        } catch (e: Exception) {
            Log.e("AnimeX", "FlixCloud: ${e.message}")
        }
    }
}
