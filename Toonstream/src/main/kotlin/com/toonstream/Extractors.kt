package com.toonstream

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.base64Decode
import com.lagradost.api.Log
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import org.jsoup.Jsoup

class StreamSB8 : com.lagradost.cloudstream3.extractors.StreamSB() {
    override var mainUrl = "https://streamsb.net"
}

class D000d : com.lagradost.cloudstream3.extractors.DoodLaExtractor() {
    override var mainUrl = "https://d000d.com"
}

class Vidhidevip : com.lagradost.cloudstream3.extractors.VidhideExtractor() {
    override var mainUrl = "https://vidhidevip.com"
}

class Cdnwish : com.lagradost.cloudstream3.extractors.StreamWishExtractor() {
    override var mainUrl = "https://cdnwish.com"
}

class FileMoonnl : com.lagradost.cloudstream3.extractors.Filesim() {
    override val name = "FileMoon"
    override val mainUrl = "https://filemoon.nl"
}

class Cloudy : com.lagradost.cloudstream3.extractors.VidStack() {
    override var mainUrl = "https://cloudy.upns.one"
}

class Streamruby : ExtractorApi() {
    override val name = "Streamruby"
    override val mainUrl = "https://streamruby.com"
    override val requiresReferer = true

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            val embedUrl = if (url.contains("/e/")) url else {
                val id = url.substringAfter("/e/", "").substringBefore("/")
                "$mainUrl/e/$id"
            }
            val html = app.get(embedUrl, referer = referer, headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"
            )).text
            Regex("""file:\s*"(.*?m3u8.*?)"""").find(html)?.groupValues?.get(1)?.let { m3u8Url ->
                callback.invoke(
                    ExtractorLink(
                        source = name,
                        name = name,
                        url = m3u8Url,
                        referer = mainUrl,
                        quality = Qualities.Unknown.value,
                        type = ExtractorLinkType.M3U8
                    )
                )
            }
        } catch (e: Exception) {
            Log.d("ToonStream", "Streamruby: ${e.message}")
        }
    }
}

class AWSStream : ExtractorApi() {
    override val name = "AWSStream"
    override val mainUrl = "https://z.awstream.net"
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
                "X-Requested-With" to "XMLHttpRequest"
            )).text
            val scriptData = Jsoup.parse(html).selectFirst("script:containsData(function(p,a,c,k,e,d))")?.data()
            if (scriptData != null) {
                val hash = Regex("""'([^']+)'\s*\)\)""").find(scriptData)?.groupValues?.get(1)
                if (hash != null) {
                    val decoded = try { base64Decode(hash) } catch (_: Exception) { null }
                    if (decoded != null && decoded.contains("m3u8")) {
                        val m3u8 = Regex("""(https?://[^"'\s]+\.m3u8[^"'\s]*)""").find(decoded)?.groupValues?.get(1)
                        if (m3u8 != null) {
                            callback.invoke(
                                ExtractorLink(
                                    source = name,
                                    name = name,
                                    url = m3u8,
                                    referer = mainUrl,
                                    quality = Qualities.Unknown.value,
                                    type = ExtractorLinkType.M3U8
                                )
                            )
                        }
                    }
                }
            }
        } catch (e: Exception) {
            Log.d("ToonStream", "AWSStream: ${e.message}")
        }
    }
}

class Zephyrflick : AWSStream() {
    override val name = "Zephyrflick"
    override val mainUrl = "https://play.zephyrflick.top"
    override val requiresReferer = false
}

class GDMirrorbot : ExtractorApi() {
    override val name = "GDMirrorbot"
    override val mainUrl = "https://gdmirrorbot.nl"
    override val requiresReferer = false

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            val id = Regex("""/tv/\d+/(\d+)/""").find(url)?.groupValues?.get(1) ?: return
            val apiUrl = "$mainUrl/api?mresult=$id"
            val response = app.get(apiUrl, headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"
            )).text

            val sources = listOf("StreamHG", "StreamP2p", "EarnVids", "UpnShare", "RpmShare")
            for (source in sources) {
                Regex(""""$source"\s*:\s*"([^"]+)"""").find(response)?.groupValues?.get(1)?.let { embedUrl ->
                    try {
                        loadExtractor(embedUrl, url, subtitleCallback, callback)
                    } catch (_: Exception) {}
                }
            }
        } catch (e: Exception) {
            Log.d("ToonStream", "GDMirrorbot: ${e.message}")
        }
    }
}

class Techinmind : GDMirrorbot() {
    override val name = "Techinmind Cloud AIO"
    override val mainUrl = "https://stream.techinmind.space"
}

class Abyass : ExtractorApi() {
    override val name = "Abyass"
    override val mainUrl = "https://abyssplayer.com"
    override val requiresReferer = true

    private val decApi = "https://enc-dec.app/api/dec-abyss"

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            val html = app.get(url, referer = referer, headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                "Origin" to mainUrl
            )).text

            val scriptData = Jsoup.parse(html).selectFirst("script:containsData(text)")?.data() ?: return
            val texts = Regex(""""text"\s*:\s*"([^"]+)"""").findAll(scriptData).map { it.groupValues[1] }.toList()
            if (texts.isEmpty()) return

            val jsonBody = texts.joinToString(",", "[", "]") { "\"$it\"" }
            val decResponse = app.post(decApi, headers = mapOf(
                "Content-Type" to "application/json",
                "Origin" to "https://enc-dec.app"
            ), requestBody = jsonBody.toRequestBody("application/json".toMediaType())).text

            Regex("""(https?://[^"'\s]+\.m3u8[^"'\s]*)""").find(decResponse)?.groupValues?.get(1)?.let { m3u8 ->
                callback.invoke(
                    ExtractorLink(
                        source = name,
                        name = name,
                        url = m3u8,
                        referer = mainUrl,
                        quality = Qualities.Unknown.value,
                        type = ExtractorLinkType.M3U8
                    )
                )
            }
        } catch (e: Exception) {
            Log.d("ToonStream", "Abyass: ${e.message}")
        }
    }
}

