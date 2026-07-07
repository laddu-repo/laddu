package com.ssrmovies

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.newSubtitleFile

/**
 * Custom extractor for watch-online.mom embed.
 *
 * The embed page uses JW Player with eval-packed JavaScript containing
 * the m3u8 URL and multiple audio tracks (Hindi, etc.).
 *
 * WebViewResolver loads the page, executes the JS (which unpacks the eval
 * and starts JW Player), and intercepts the .m3u8 network request.
 */
class WatchOnlineMomExtractor : ExtractorApi() {
    override val name = "Watch Online"
    override val mainUrl = "https://watch-online.mom"
    override val requiresReferer = true

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val headers = mapOf(
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
            "Referer" to (referer ?: "$mainUrl/"),
            "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
        )

        try {
            // Method 1: Try to unpack the eval-packed JS to find m3u8 directly
            val doc = app.get(url, headers = headers).document
            val scripts = doc.select("script")
            var m3u8Found: String? = null

            for (script in scripts) {
                val data = script.data()
                if (data.contains("eval(function")) {
                    // The eval-packed JS contains the m3u8 URL
                    // Try to extract it with regex (the packed data has m3u8 references)
                    val m3u8Match = Regex("""(https?://[^\s"'<>]+\.m3u8[^\s"'<>]*)""").find(data)
                    if (m3u8Match != null) {
                        m3u8Found = m3u8Match.groupValues[1]
                        break
                    }
                }
                // Also check for direct m3u8 in any script
                if (data.contains(".m3u8")) {
                    val m3u8Match = Regex("""(https?://[^\s"'<>]+\.m3u8[^\s"'<>]*)""").find(data)
                    if (m3u8Match != null) {
                        m3u8Found = m3u8Match.groupValues[1]
                        break
                    }
                }
            }

            if (m3u8Found != null) {
                println("SSRmovies: Found m3u8 in packed JS: ${m3u8Found.take(60)}...")
                M3u8Helper.generateM3u8(name, m3u8Found, mainUrl, headers = headers).forEach(callback)
                return
            }

            // Method 2: WebViewResolver fallback — load page, JW Player plays, intercept m3u8
            println("SSRmovies: Trying WebViewResolver for watch-online.mom...")
            val resolver = WebViewResolver(
                interceptUrl = Regex("""\.m3u8"""),
                additionalUrls = listOf(Regex("""\.mp4""")),
                script = """try{var b=document.querySelector('.jw-icon-display,.jw-button-color,jw-icon');if(b){b.click()}}catch(e){}""",
                useOkhttp = false,
                timeout = 20_000L
            )
            val resolved = app.get(url, headers = headers, interceptor = resolver).url

            if (resolved.contains(".m3u8", true)) {
                println("SSRmovies: WebViewResolver found m3u8: ${resolved.take(60)}...")
                M3u8Helper.generateM3u8(name, resolved, mainUrl, headers = headers).forEach(callback)
            } else if (resolved.contains(".mp4", true)) {
                callback.invoke(
                    newExtractorLink(source = name, name = name, url = resolved, type = ExtractorLinkType.VIDEO) {
                        this.referer = "$mainUrl/"
                        this.headers = headers
                    }
                )
            }
        } catch (e: Exception) {
            println("SSRmovies: watch-online.mom extractor failed - ${e.message}")
        }
    }
}
