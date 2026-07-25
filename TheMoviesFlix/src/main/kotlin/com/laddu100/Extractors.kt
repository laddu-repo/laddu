package com.laddu100

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.base64Decode
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import org.jsoup.Jsoup
import org.json.JSONObject

//  Extract googleusercontent URL from reurl's link= parameter.

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
        try {
            val html = app.get(url, headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                "Referer" to "https://nexdrive.fit/"
            )).text
            if (html.contains("File is Deleted") || html.contains("Something went wrong")) {
                return
            }
            val reurl = Regex("""var\s+reurl\s*=\s*"([^"]+)"""").find(html)?.groupValues?.get(1)
                ?: Regex("""'(https://fastdl\.[^']+/dl\.php\?link=[^']+)'""").find(html)?.groupValues?.get(1)

            if (reurl == null) {
                return
            }

            val googleUrl = Regex("""link=(https?://[^&"']+)""").find(reurl)?.groupValues?.get(1)
            if (googleUrl == null) {
                return
            }

            val directUrl = java.net.URLDecoder.decode(googleUrl, "UTF-8")

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
        }
    }
}

// 10. Emit ExtractorLink with the download URL

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
        try {
            val response = app.get(url, headers = headers)
            val html = response.text
            val doc = response.document
            val downloadLink = doc.selectFirst("div.main h4 a")?.attr("href")
            if (downloadLink != null && downloadLink.isNotBlank()) {
                val fullUrl = if (downloadLink.startsWith("http")) downloadLink else "$mainUrl$downloadLink"
                val doc2 = app.get(fullUrl, headers = headers).document

                val scriptData = doc2.selectFirst("script:containsData(url)")?.data()

                if (scriptData != null) {
                    val encoded = Regex("""atob\(atob\('([^']+)'\)\)""").find(scriptData)?.groupValues?.get(1)
                    if (encoded != null) {
                        val decoded1 = try { base64Decode(encoded) } catch (_: Exception) { null }
                        val decoded2 = if (decoded1 != null) try { base64Decode(decoded1) } catch (_: Exception) { null } else null
                        if (decoded2 != null && decoded2.startsWith("http")) {
                            emitVCloudLink(decoded2, callback)
                            return
                        }
                    }

                    val varUrl = Regex("""var\s+url\s*=\s*'([^']*)'""").find(scriptData)?.groupValues?.get(1)
                    if (varUrl != null && varUrl.startsWith("http")) {
                        emitVCloudLink(varUrl, callback)
                        return
                    }
                }

                val cardBody = doc2.selectFirst("div.card-body")
                if (cardBody != null) {
                    val btns = cardBody.select("h2 a.btn")
                    for (btn in btns) {
                        val href = btn.attr("href")
                        if (href.isNotBlank() && href.startsWith("http")) {
                        }
                    }
                }

                val title = doc2.selectFirst("div.card-header")?.text()
                val size = doc2.selectFirst("i#size")?.text()
            }
            // and log them so we can see what's on the page
            var fallbackCount = 0
            for (a in doc.select("a[href]")) {
                val href = a.attr("href").trim()
                if (href.isBlank() || !href.startsWith("http")) continue
                if (href.contains("vcloud.zip") || href.contains("cloudflare") ||
                    href.contains("googleapi") || href.contains("googletagmanager") ||
                    href.contains("w.org") || href.contains("gmpg")) continue
                fallbackCount++
            }
            for (script in doc.select("script")) {
                val data = script.data()
                if (data.contains("http") && !data.contains("cloudflare") && !data.contains("google")) {
                    val urls = Regex("""(https?://[^"'\s<>]+)""").findAll(data).map { it.groupValues[1] }.toList()
                    for (u in urls) {
                        if (!u.contains("vcloud") && !u.contains("cloudflare") && !u.contains("google") && !u.contains("w.org")) {
                        }
                    }
                }
            }
        } catch (e: Exception) {
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

//     with Authorization: Bearer <token>

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
        try {
            val code = Regex("""/(?:\?c=|d/)([\da-zA-Z-]+)""").find(url)?.groupValues?.get(1)
            if (code == null) {
                return
            }
            val accountResp = app.post("$api/accounts", headers = headers).text
            val accountJson = JSONObject(accountResp)
            val token = accountJson.getJSONObject("data").getString("token")
            val globalJs = app.get("$mainUrl/dist/js/global.js", headers = headers).text
            val wt = Regex("""appdata\.wt\s*=\s*["']([^"']+)["']""").find(globalJs)?.groupValues?.get(1)
            val contentUrl = "$api/contents/$code" + (if (wt != null) "?wt=$wt" else "")
            val contentHeaders = headers.toMutableMap().apply {
                put("Authorization", "Bearer $token")
            }
            val contentResp = app.get(contentUrl, headers = contentHeaders).text
            val contentJson = JSONObject(contentResp)
            val data = contentJson.getJSONObject("data")
            val children = data.getJSONObject("children")
            val firstKey = children.keys().next()
            val fileObj = children.getJSONObject(firstKey)
            val link = fileObj.getString("link")
            val fileName = fileObj.optString("name", "Unknown")
            val size = fileObj.optLong("size", 0L)
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
        }
    }
}

//  filebee.xyz is a React SPA. The download URL is fetched via
//  api.filebee.xyz/file/downlaod/ POST with fileID.
//  Both filebee.xyz and api.filebee.xyz are CF-protected.
//  We try app.get with CloudflareKiller, then fall back to
//  parsing the page HTML for any download links.

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
        val fileId = url.substringAfterLast("/")
        try {
            // Try CloudflareKiller to bypass CF on filebee.xyz
            val html = app.get(url, headers = headers, interceptor = cfKiller, timeout = 10L).text
            val doc = Jsoup.parse(html)
            for (a in doc.select("a[href]")) {
                val href = a.attr("href")
                if (href.contains("drive.google") || href.contains("googleusercontent") ||
                    href.contains("download") || href.contains(".mp4") || href.contains(".mkv")) {
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
            for (script in doc.select("script")) {
                val data = script.data()
                if (data.contains("drive.google") || data.contains("googleusercontent") ||
                    data.contains("download")) {
                    val urlMatch = Regex("""(https?://[^"'\s]+(?:drive\.google|googleusercontent|download)[^"'\s]*)""").find(data)?.groupValues?.get(1)
                    if (urlMatch != null) {
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
        }
    }
}
