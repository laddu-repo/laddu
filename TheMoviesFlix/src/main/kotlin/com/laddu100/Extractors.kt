package com.laddu100

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.base64Decode
import com.lagradost.api.Log
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import org.jsoup.Jsoup
import org.json.JSONObject

private const val TAG = "TMF"

// ============================================================
//  FastDl Extractor — fastdl.zip → googleusercontent direct URL
// ============================================================
//  Flow: GET fastdl.zip/embed?download=XXX → HTML with var reurl = "..."
//  Extract googleusercontent URL from reurl's link= parameter.
//
class FastDlExtractor : ExtractorApi() {
    override val name = "G-Direct"
    override val mainUrl = "https://fastdl.zip"
    override val requiresReferer = false

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        Log.d(TAG, "FastDlExtractor: getUrl $url")
        try {
            val html = app.get(url, headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                "Referer" to "https://nexdrive.fit/"
            )).text
            Log.d(TAG, "FastDlExtractor: got ${html.length} chars")

            // Check for "File Deleted" page
            if (html.contains("File is Deleted") || html.contains("Something went wrong")) {
                Log.d(TAG, "FastDlExtractor: file deleted/unavailable")
                return
            }

            // Extract var reurl = "https://fastdl.zip/dl.php?link=<googleusercontent URL>"
            val reurl = Regex("""var\s+reurl\s*=\s*"([^"]+)"""").find(html)?.groupValues?.get(1)
                ?: Regex("""'(https://fastdl\.[^']+/dl\.php\?link=[^']+)'""").find(html)?.groupValues?.get(1)

            if (reurl == null) {
                Log.d(TAG, "FastDlExtractor: no reurl found")
                return
            }

            val googleUrl = Regex("""link=(https?://[^&"']+)""").find(reurl)?.groupValues?.get(1)
            if (googleUrl == null) {
                Log.d(TAG, "FastDlExtractor: no google URL in reurl")
                return
            }

            val directUrl = java.net.URLDecoder.decode(googleUrl, "UTF-8")
            Log.d(TAG, "FastDlExtractor: resolved → ${directUrl.take(80)}")

            callback.invoke(
                ExtractorLink(
                    source = name,
                    name = name,
                    url = directUrl,
                    referer = "https://fastdl.zip/",
                    quality = Qualities.Unknown.value,
                    type = ExtractorLinkType.VIDEO,
                    headers = mapOf("Referer" to "https://fastdl.zip/")
                )
            )
        } catch (e: Exception) {
            Log.d(TAG, "FastDlExtractor: FAILED ${e.message}")
        }
    }
}

// ============================================================
//  VCloud Extractor — vcloud.zip (Cloudflare-protected)
// ============================================================
//  Flow (reverse-engineered from Phisher's Movies4u VCloud extractor):
//  1. GET vcloud.zip/<id> → HTML page (after CF bypass via app.get)
//  2. Select "div.main h4 a" → extract href (download page URL)
//  3. GET that URL → another page
//  4. Select "script:containsData(url)" → extract script data
//  5. Regex "atob\(atob\('([^']+)'\)\)" → double base64 decode → URL
//  6. Regex "var\s+url\s*=\s*'([^']*)'" → URL
//  7. GET that URL → final page with download buttons
//  8. Select "div.card-body" → "h2 a.btn" → extract href
//  9. Select "i#size" for file size, "div.card-header" for title
// 10. Emit ExtractorLink with the download URL
//
class VCloudExtractor : ExtractorApi() {
    override val name = "V-Cloud"
    override val mainUrl = "https://vcloud.zip"
    override val requiresReferer = true

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Referer" to "https://nexdrive.fit/"
    )

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        Log.d(TAG, "VCloudExtractor: getUrl $url")
        try {
            val response = app.get(url, headers = headers)
            val html = response.text
            val doc = response.document
            Log.d(TAG, "VCloudExtractor: got ${html.length} chars, title=${doc.title()}")

            // Log the first 2000 chars of HTML so we can see the page structure
            Log.d(TAG, "VCloudExtractor: HTML_PREVIEW: ${html.take(2000)}")

            // Step 2: Select "div.main h4 a" → extract href
            val downloadLink = doc.selectFirst("div.main h4 a")?.attr("href")
            Log.d(TAG, "VCloudExtractor: div.main h4 a href = $downloadLink")

            if (downloadLink != null && downloadLink.isNotBlank()) {
                val fullUrl = if (downloadLink.startsWith("http")) downloadLink else "$mainUrl$downloadLink"
                Log.d(TAG, "VCloudExtractor: fetching download page $fullUrl")
                val doc2 = app.get(fullUrl, headers = headers).document

                val scriptData = doc2.selectFirst("script:containsData(url)")?.data()
                Log.d(TAG, "VCloudExtractor: script data = ${scriptData?.take(200)}")

                if (scriptData != null) {
                    val encoded = Regex("""atob\(atob\('([^']+)'\)\)""").find(scriptData)?.groupValues?.get(1)
                    if (encoded != null) {
                        val decoded1 = try { base64Decode(encoded) } catch (_: Exception) { null }
                        val decoded2 = if (decoded1 != null) try { base64Decode(decoded1) } catch (_: Exception) { null } else null
                        Log.d(TAG, "VCloudExtractor: decoded atob(atob) = $decoded2")
                        if (decoded2 != null && decoded2.startsWith("http")) {
                            emitVCloudLink(decoded2, callback)
                            return
                        }
                    }

                    val varUrl = Regex("""var\s+url\s*=\s*'([^']*)'""").find(scriptData)?.groupValues?.get(1)
                    Log.d(TAG, "VCloudExtractor: var url = $varUrl")
                    if (varUrl != null && varUrl.startsWith("http")) {
                        emitVCloudLink(varUrl, callback)
                        return
                    }
                }

                val cardBody = doc2.selectFirst("div.card-body")
                if (cardBody != null) {
                    val btns = cardBody.select("h2 a.btn")
                    Log.d(TAG, "VCloudExtractor: found ${btns.size} download buttons")
                    for (btn in btns) {
                        val href = btn.attr("href")
                        if (href.isNotBlank() && href.startsWith("http")) {
                            Log.d(TAG, "VCloudExtractor: button href = ${href.take(80)}")
                            emitVCloudLink(href, callback)
                        }
                    }
                }

                val title = doc2.selectFirst("div.card-header")?.text()
                val size = doc2.selectFirst("i#size")?.text()
                Log.d(TAG, "VCloudExtractor: title=$title size=$size")
            }

            // BROADER fallback: collect ALL <a href> links that start with http
            // and log them so we can see what's on the page
            Log.d(TAG, "VCloudExtractor: fallback - searching ALL links")
            var fallbackCount = 0
            for (a in doc.select("a[href]")) {
                val href = a.attr("href").trim()
                if (href.isBlank() || !href.startsWith("http")) continue
                if (href.contains("vcloud.zip") || href.contains("cloudflare") ||
                    href.contains("googleapi") || href.contains("googletagmanager") ||
                    href.contains("w.org") || href.contains("gmpg")) continue
                Log.d(TAG, "VCloudExtractor: ALL_LINK [$fallbackCount] = ${href.take(150)}")
                // Emit ANY external link as a potential download link
                emitVCloudLink(href, callback)
                fallbackCount++
            }
            Log.d(TAG, "VCloudExtractor: fallback emitted $fallbackCount links")

            // Also search for URLs in script tags and data attributes
            for (script in doc.select("script")) {
                val data = script.data()
                if (data.contains("http") && !data.contains("cloudflare") && !data.contains("google")) {
                    val urls = Regex("""(https?://[^"'\s<>]+)""").findAll(data).map { it.groupValues[1] }.toList()
                    for (u in urls) {
                        if (!u.contains("vcloud") && !u.contains("cloudflare") && !u.contains("google") && !u.contains("w.org")) {
                            Log.d(TAG, "VCloudExtractor: SCRIPT_URL = ${u.take(150)}")
                            emitVCloudLink(u, callback)
                        }
                    }
                }
            }
        } catch (e: Exception) {
            Log.d(TAG, "VCloudExtractor: FAILED ${e.message}")
        }
    }

    private fun emitVCloudLink(url: String, callback: (ExtractorLink) -> Unit) {
        callback.invoke(
            ExtractorLink(
                source = name,
                name = name,
                url = url,
                referer = mainUrl,
                quality = Qualities.Unknown.value,
                type = ExtractorLinkType.VIDEO,
                headers = mapOf("Referer" to "$mainUrl/")
            )
        )
    }
}

// ============================================================
//  GoFile Extractor — gofile.io (API-based)
// ============================================================
//  Flow (reverse-engineered from Phisher's Movies4u Gofile extractor):
//  1. Extract content code from URL: /(?:\?c=|d/)([\da-zA-Z-]+)
//  2. POST https://api.gofile.io/accounts → get guest token
//  3. GET https://gofile.io/dist/js/global.js → extract appdata.wt = "XXX"
//  4. GET https://api.gofile.io/contents/<code>?wt=<wt>
//     with Authorization: Bearer <token>
//  5. Parse JSON → data.children.<first_key>.link → direct download URL
//
class GoFileExtractor : ExtractorApi() {
    override val name = "GoFile"
    override val mainUrl = "https://gofile.io"
    override val requiresReferer = false

    private val api = "https://api.gofile.io"
    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
        "Accept" to "application/json"
    )

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        Log.d(TAG, "GoFileExtractor: getUrl $url")
        try {
            // Step 1: Extract content code
            val code = Regex("""/(?:\?c=|d/)([\da-zA-Z-]+)""").find(url)?.groupValues?.get(1)
            Log.d(TAG, "GoFileExtractor: contentCode = $code")
            if (code == null) {
                Log.d(TAG, "GoFileExtractor: no content code found")
                return
            }

            // Step 2: Create guest account → get token
            val accountResp = app.post("$api/accounts", headers = headers).text
            Log.d(TAG, "GoFileExtractor: account response = ${accountResp.take(200)}")
            val accountJson = JSONObject(accountResp)
            val token = accountJson.getJSONObject("data").getString("token")
            Log.d(TAG, "GoFileExtractor: token = ${token.take(30)}")

            // Step 3: Get website token from global.js
            val globalJs = app.get("$mainUrl/dist/js/global.js", headers = headers).text
            val wt = Regex("""appdata\.wt\s*=\s*["']([^"']+)["']""").find(globalJs)?.groupValues?.get(1)
            Log.d(TAG, "GoFileExtractor: wt = $wt")

            // Step 4: Fetch content with token
            val contentUrl = "$api/contents/$code" + (if (wt != null) "?wt=$wt" else "")
            val contentHeaders = headers.toMutableMap().apply {
                put("Authorization", "Bearer $token")
            }
            val contentResp = app.get(contentUrl, headers = contentHeaders).text
            Log.d(TAG, "GoFileExtractor: content response = ${contentResp.take(300)}")

            // Step 5: Parse JSON → data.children.<first_key>.link
            val contentJson = JSONObject(contentResp)
            val data = contentJson.getJSONObject("data")
            val children = data.getJSONObject("children")
            val firstKey = children.keys().next()
            val fileObj = children.getJSONObject(firstKey)
            val link = fileObj.getString("link")
            val fileName = fileObj.optString("name", "Unknown")
            val size = fileObj.optLong("size", 0L)
            Log.d(TAG, "GoFileExtractor: link = ${link.take(80)} name = $fileName size = $size")

            // Determine quality from filename
            val quality = Regex("""(\d{3,4})[pP]""").find(fileName)?.groupValues?.get(1)?.toIntOrNull()
                ?: Qualities.Unknown.value

            val sizeStr = when {
                size >= 1_073_741_824L -> "%.2f GB".format(size.toDouble() / 1_073_741_824L)
                size >= 1_048_576L -> "%.2f MB".format(size.toDouble() / 1_048_576L)
                else -> "$size B"
            }

            callback.invoke(
                ExtractorLink(
                    source = name,
                    name = "$name [$sizeStr]",
                    url = link,
                    referer = mainUrl,
                    quality = quality,
                    type = ExtractorLinkType.VIDEO,
                    headers = mapOf("Authorization" to "Bearer $token")
                )
            )
        } catch (e: Exception) {
            Log.d(TAG, "GoFileExtractor: FAILED ${e.message}")
        }
    }
}

// ============================================================
//  FileBee Extractor — filebee.xyz (Cloudflare SPA)
// ============================================================
//  filebee.xyz is a React SPA. The download URL is fetched via
//  api.filebee.xyz/file/downlaod/ POST with fileID.
//  Both filebee.xyz and api.filebee.xyz are CF-protected.
//  We try app.get with CloudflareKiller, then fall back to
//  parsing the page HTML for any download links.
//
class FileBeeExtractor : ExtractorApi() {
    override val name = "FilePress"
    override val mainUrl = "https://filebee.xyz"
    override val requiresReferer = true

    private val cfKiller = com.lagradost.cloudstream3.network.CloudflareKiller()
    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Referer" to "https://nexdrive.fit/"
    )

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        Log.d(TAG, "FileBeeExtractor: getUrl $url")
        val fileId = url.substringAfterLast("/")
        Log.d(TAG, "FileBeeExtractor: fileId = $fileId")

        try {
            // Try CloudflareKiller to bypass CF on filebee.xyz
            val html = app.get(url, headers = headers, interceptor = cfKiller, timeout = 10L).text
            Log.d(TAG, "FileBeeExtractor: got ${html.length} chars after CF bypass")

            // filebee.xyz is a SPA — the actual content is loaded by JS
            // After CF bypass, we might get the SPA shell or the actual page
            // Look for any download URLs in the HTML
            val doc = Jsoup.parse(html)

            // Check for direct download links
            for (a in doc.select("a[href]")) {
                val href = a.attr("href")
                if (href.contains("drive.google") || href.contains("googleusercontent") ||
                    href.contains("download") || href.contains(".mp4") || href.contains(".mkv")) {
                    Log.d(TAG, "FileBeeExtractor: found link = ${href.take(80)}")
                    callback.invoke(
                        ExtractorLink(
                            source = name,
                            name = name,
                            url = href,
                            referer = mainUrl,
                            quality = Qualities.Unknown.value,
                            type = ExtractorLinkType.VIDEO
                        )
                    )
                }
            }

            // Check for script data with URLs
            for (script in doc.select("script")) {
                val data = script.data()
                if (data.contains("drive.google") || data.contains("googleusercontent") ||
                    data.contains("download")) {
                    val urlMatch = Regex("""(https?://[^"'\s]+(?:drive\.google|googleusercontent|download)[^"'\s]*)""").find(data)?.groupValues?.get(1)
                    if (urlMatch != null) {
                        Log.d(TAG, "FileBeeExtractor: script URL = ${urlMatch.take(80)}")
                        callback.invoke(
                            ExtractorLink(
                                source = name,
                                name = name,
                                url = urlMatch,
                                referer = mainUrl,
                                quality = Qualities.Unknown.value,
                                type = ExtractorLinkType.VIDEO
                            )
                        )
                    }
                }
            }
        } catch (e: Exception) {
            Log.d(TAG, "FileBeeExtractor: FAILED ${e.message}")
        }
    }
}
