package com.primeshows

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
 * Custom extractors for PrimeShows embed sources.
 *
 * Each embed domain (videasy, vidfast, vidcore, etc.) is a Next.js SSR app
 * that uses HLS.js to play m3u8 streams. The m3u8 URL is fetched server-side
 * and never exposed in static HTML.
 *
 * These extractors use WebViewResolver to load the embed page, let HLS.js
 * fetch the m3u8, and intercept the network request.
 *
 * Pattern from phisher98's MegaPlay extractor:
 * https://github.com/phisher98/cloudstream-extensions-phisher
 */

// ── Base class with shared WebView resolution logic ──

abstract class PrimeShowsBaseExtractor : ExtractorApi() {
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
            // WebViewResolver: load embed page, HLS.js auto-plays, intercept .m3u8
            val resolver = WebViewResolver(
                interceptUrl = Regex("""\.m3u8"""),
                additionalUrls = listOf(Regex("""\.mp4""")),
                script = """try{var b=document.querySelector('button,[role="button"],.play-btn,.jw-icon-display,.vds-play-button,#playButton,video');if(b){b.click?.()}}catch(e){}""",
                useOkhttp = false,
                timeout = 20_000L
            )
            val resolved = app.get(url, headers = headers, interceptor = resolver).url

            if (resolved.contains(".m3u8", true)) {
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
            // Fallback: try loadExtractor on the URL (handles any nested embeds)
            try {
                val doc = app.get(url, headers = headers).document
                // Look for iframe sources
                val iframeSrc = doc.selectFirst("iframe")?.attr("src")
                if (!iframeSrc.isNullOrBlank()) {
                    val fullUrl = if (iframeSrc.startsWith("http")) iframeSrc else "$mainUrl$iframeSrc"
                    com.lagradost.cloudstream3.utils.loadExtractor(fullUrl, url, subtitleCallback, callback)
                }
            } catch (_: Exception) {}
        }
    }
}

// ── Individual extractors for each embed domain ──

class VideasyExtractor : PrimeShowsBaseExtractor() {
    override val name = "Videasy"
    override val mainUrl = "https://player.videasy.to"
}

class VidfastExtractor : PrimeShowsBaseExtractor() {
    override val name = "Vidfast"
    override val mainUrl = "https://vidfast.pro"
}

class VidcoreExtractor : PrimeShowsBaseExtractor() {
    override val name = "Vidcore"
    override val mainUrl = "https://vidcore.net"
}

class VidrockExtractor : PrimeShowsBaseExtractor() {
    override val name = "Vidrock"
    override val mainUrl = "https://vidrock.ru"
}

class VidupExtractor : PrimeShowsBaseExtractor() {
    override val name = "Vidup"
    override val mainUrl = "https://vidup.to"
}

class ScreenscapeExtractor : PrimeShowsBaseExtractor() {
    override val name = "Scapa [Hindi]"
    override val mainUrl = "https://embed.screenscape.me"
}

class RozarExtractor : PrimeShowsBaseExtractor() {
    override val name = "Rozar [Hindi]"
    override val mainUrl = "https://rozgarlelo.modiplay.xyz"
}

class VidshowsExtractor : PrimeShowsBaseExtractor() {
    override val name = "Vidshows"
    override val mainUrl = "https://player.vidshows.xyz"
}

class AnimeMegaExtractor : PrimeShowsBaseExtractor() {
    override val name = "Anime Mega"
    override val mainUrl = "https://tryembed.us.cc"
}

class AnimeFizzExtractor : PrimeShowsBaseExtractor() {
    override val name = "Anime Fizz"
    override val mainUrl = "https://vidnest.fun"
}
