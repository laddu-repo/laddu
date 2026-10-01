package com.themoviesboss

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.newSubtitleFile
import org.jsoup.Jsoup

/**
 * Custom extractor for TMBCloud (tmbcloud.top → tmbcloud.lol).
 *
 * TMBCloud uses a 2-token anti-bot system:
 * 1. Page embeds TOKEN_A and PAGE_ID
 * 2. JavaScript calls step2.php → gets TOKEN_B (fails via OkHttp)
 * 3. gen-link.php called with both tokens → returns download URL
 *
 * WebViewResolver handles this by:
 * 1. Loading the tmbcloud page in WebView (JS executes, gets TOKEN_B)
 * 2. Clicking the download button (calls gen-link.php)
 * 3. Intercepting the resulting .mp4/.mkv URL
 */
class TMBCloudExtractor : ExtractorApi() {
    override val name = "TMBCloud"
    override val mainUrl = "https://tmbcloud.top"
    override val requiresReferer = true

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val headers = mapOf(
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
            "Referer" to (referer ?: "https://ww1.themoviesboss.blog/"),
            "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
        )

        try {
            // Step 1: Follow redirect from tmbcloud.top to tmbcloud.lol
            val redirectResponse = app.get(url, headers = headers, allowRedirects = true)
            val finalUrl = redirectResponse.url
            val finalHtml = redirectResponse.text
            val finalDoc = Jsoup.parse(finalHtml)

            // Extract title for labeling
            val pageTitle = finalDoc.selectFirst("title")?.text()?.trim()?.substringBefore(" - ") ?: "Download"

            // Extract quality from title (e.g., "Backrooms.2026.480p.WEBRip")
            val qualityStr = Regex("""(\d{3,4}p|4K)""", RegexOption.IGNORE_CASE).find(pageTitle)?.groupValues?.get(1) ?: ""
            val qualityInt = when {
                qualityStr.contains("4K", true) || qualityStr.contains("2160", true) -> 2160
                qualityStr.contains("1080", true) -> 1080
                qualityStr.contains("720", true) -> 720
                qualityStr.contains("480", true) -> 480
                else -> -1
            }

            // Extract file size from meta description
            val sizeMatch = Regex("""(\d+\.?\d*\s*(?:GB|MB))""", RegexOption.IGNORE_CASE).find(finalHtml)
            val size = sizeMatch?.groupValues?.get(1) ?: ""

            // Find all download buttons with data-type
            val buttons = finalDoc.select("button[data-type]")
            if (buttons.isEmpty()) {
                println("TMBCloud: No download buttons found")
                return
            }

            // Step 2: Use WebViewResolver to click each button and intercept download URL
            for (button in buttons) {
                val type = button.attr("data-type")
                val labelText = button.text().trim().takeIf { it.isNotBlank() } ?: type

                try {
                    println("TMBCloud: Trying button '$labelText' (type=$type) via WebView...")

                    // WebViewResolver: load the tmbcloud page, click the button, intercept .mp4/.mkv
                    // The JS handleDownload() function calls gen-link.php and opens the URL
                    // We intercept the resulting download URL
                    val script = """
                        try {
                            var btn = document.querySelector('button[data-type="$type"]');
                            if (btn) {
                                btn.click();
                            }
                        } catch(e) {}
                    """.trimIndent()

                    val resolver = WebViewResolver(
                        interceptUrl = Regex("""\.(mp4|mkv|m3u8)(?:\?|$)"""),
                        additionalUrls = listOf(Regex("""\.(mp4|mkv|m3u8)(?:\?|$)""")),
                        script = script,
                        useOkhttp = false,
                        timeout = 25_000L
                    )

                    val resolved = app.get(finalUrl, headers = headers, interceptor = resolver).url

                    if (resolved.contains(".mp4", true) || resolved.contains(".mkv", true)) {
                        val label = "TheMoviesBoss $qualityStr $labelText".trim()
                        println("TMBCloud: Found direct video: ${resolved.take(80)}...")
                        callback.invoke(
                            newExtractorLink("TheMoviesBoss", label, resolved, ExtractorLinkType.VIDEO) {
                                this.quality = qualityInt
                                this.headers = headers
                            }
                        )
                    } else if (resolved.contains(".m3u8", true)) {
                        val label = "TheMoviesBoss $qualityStr $labelText".trim()
                        println("TMBCloud: Found m3u8: ${resolved.take(80)}...")
                        M3u8Helper.generateM3u8(label, resolved, mainUrl, headers = headers).forEach(callback)
                    } else {
                        // Try loadExtractor on the resolved URL (might be a file host)
                        try {
                            loadExtractor(resolved, "$mainUrl/", subtitleCallback, callback)
                        } catch (_: Exception) {}
                    }
                } catch (e: Exception) {
                    println("TMBCloud: Button '$type' failed - ${e.message}")
                }
            }
        } catch (e: Exception) {
            println("TMBCloud: Extractor failed - ${e.message}")
        }
    }
}
