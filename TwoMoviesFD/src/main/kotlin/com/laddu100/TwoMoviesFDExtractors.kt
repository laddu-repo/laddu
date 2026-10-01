package com.laddu100

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink

/**
 * Byse extractor (bysesukior.com / q8y5z.com)
 *
 * REAL flow discovered by browser network analysis (no hallucination):
 *  1. Embed page  ->  bysesukior.com/e/{code}  (React SPA, empty shell)
 *  2. SPA calls    ->  /api/videos/{code}/embed/details  ->  returns embed_frame_url on q8y5z.com
 *  3. iframe       ->  q8y5z.com/{segment}/{code}  (SAME React app, shows "Play video" button)
 *  4. On play click, the iframe JS runs a proof-of-work + captcha flow:
 *       POST /api/videos/access/challenge
 *       POST /api/videos/access/attest
 *       POST /api/videos/{code}/embed/captcha
 *       POST /api/videos/{code}/embed/captcha/verify
 *       POST /api/videos/{code}/embed/playback   ->  returns signed HLS URL
 *  5. JW Player loads  ->  edge*-*.sprintcdn.owphbf24.com/hls2/.../master.m3u8?t=...&s=...&e=...
 *
 * Key insight: loading  https://q8y5z.com/e/{code}  as the TOP document creates a
 * SAME-ORIGIN iframe (q8y5z -> q8y5z), so an injected script CAN reach into the
 * iframe's document and click the play button. Loading bysesukior.com/e/{code}
 * instead creates a CROSS-origin iframe (bysesukior -> q8y5z) which a script
 * cannot reach — that is why the old Byse extractor never resolved a link.
 *
 * Solution: rewrite the embed URL to https://q8y5z.com/e/{code}, load it in a
 * WebView, inject a script that polls for the iframe + play button and clicks it,
 * and intercept the .m3u8 that JW Player requests.
 */
class ByseExtractor : ExtractorApi() {
    override val name = "Byse"
    override val mainUrl = "https://bysesukior.com"
    override val requiresReferer = true

    private val videoHost = "https://q8y5z.com"

    /** Pull the file code out of any Byse/q8y5z embed URL. */
    private fun extractCode(url: String): String? {
        // matches /e/{code}  or  /{segment}/{code}
        val m = Regex("""/(?:e/|[A-Za-z0-9]{2,12}/)([A-Za-z0-9]{10,16})""").find(url)
        return m?.groupValues?.get(1)
    }

    override suspend fun getUrl(
        url: String, referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val code = extractCode(url) ?: run {
            println("Byse: could not parse code from $url")
            return
        }

        // Always load q8y5z.com/e/{code} so the inner iframe is same-origin
        // and our injected script can click the play button inside it.
        val loadUrl = "$videoHost/e/$code"

        // Script: poll until the iframe exists, then click the first button
        // inside it (the "Play video" button). Keep retrying for ~25s because
        // the iframe + React app boot asynchronously.
        val clickScript = """
            (function () {
                var tries = 0;
                function tick() {
                    tries++;
                    if (tries > 50) return;
                    try {
                        var f = document.querySelector('iframe');
                        if (f && f.contentWindow && f.contentWindow.document) {
                            var d = f.contentWindow.document;
                            var b = d.querySelector('button') ||
                                    d.querySelector('[class*=play]') ||
                                    d.querySelector('.jw-icon.jw-icon-display');
                            if (b) { b.click(); return; }
                        }
                    } catch (e) {}
                    setTimeout(tick, 500);
                }
                setTimeout(tick, 800);
            })();
        """.trimIndent()

        val resolver = WebViewResolver(
            interceptUrl = Regex("""\.m3u8"""),
            additionalUrls = listOf(Regex("""\.mp4""")),
            script = clickScript,
            useOkhttp = false,
            timeout = 30_000L
        )

        try {
            val resolved = app.get(
                loadUrl,
                referer = referer ?: mainUrl,
                interceptor = resolver
            ).url

            when {
                resolved.contains(".m3u8", true) -> {
                    M3u8Helper.generateM3u8(name, resolved, "$videoHost/").forEach(callback)
                }
                resolved.contains(".mp4", true) -> {
                    callback.invoke(newExtractorLink(name, name, resolved, ExtractorLinkType.VIDEO) {
                        this.referer = "$videoHost/"
                    })
                }
                else -> println("Byse: no media resolved for $code (final url=${resolved.take(80)})")
            }
        } catch (e: Exception) {
            println("Byse: failed for $code - ${e.message}")
        }
    }
}

/**
 * StreamHG extractor (hgcloud.to)
 *
 * JW Player with eval-packed JS. WebViewResolver loads the page, the eval
 * unpacks automatically and JW Player sets up the m3u8. We click the play
 * button to nudge autoplay and intercept the .m3u8.
 */
class StreamHGExtractor : ExtractorApi() {
    override val name = "StreamHG"
    override val mainUrl = "https://hgcloud.to"
    override val requiresReferer = true

    override suspend fun getUrl(
        url: String, referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val resolver = WebViewResolver(
            interceptUrl = Regex("""\.m3u8"""),
            additionalUrls = listOf(Regex("""\.mp4""")),
            script = """try{var b=document.querySelector('.jw-icon.jw-icon-display.jw-button-color.jw-reset,button[class*="play"],.vds-play-button');if(b){b.click()}}catch(e){}""",
            useOkhttp = false,
            timeout = 20_000L
        )
        try {
            val resolved = app.get(url, referer = referer ?: mainUrl, interceptor = resolver).url
            when {
                resolved.contains(".m3u8", true) ->
                    M3u8Helper.generateM3u8(name, resolved, mainUrl).forEach(callback)
                resolved.contains(".mp4", true) ->
                    callback.invoke(newExtractorLink(name, name, resolved, ExtractorLinkType.VIDEO) {
                        this.referer = "$mainUrl/"
                    })
            }
        } catch (e: Exception) {
            println("StreamHG: failed - ${e.message}")
        }
    }
}
