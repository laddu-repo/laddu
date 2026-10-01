package com.toonstream

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.app
import com.lagradost.api.Log
import com.google.gson.JsonParser
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
            val html = app.get(url, referer = referer).text
            Regex("""file:\s*"(.*?m3u8.*?)"""").find(html)?.groupValues?.get(1)?.let { m3u8 ->
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
            Log.e("ToonStream", "Streamruby: ${e.message}")
        }
    }
}

open class AWSStream : ExtractorApi() {
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
                "X-Requested-With" to "XMLHttpRequest"
            )).text
            val scriptData = Jsoup.parse(html).selectFirst("script:containsData(function(p,a,c,k,e,d))")?.data() ?: return
            val hash = Regex("""'([^']+)'\s*\)\)""").find(scriptData)?.groupValues?.get(1) ?: return
            val decoded = try {
                com.lagradost.cloudstream3.base64Decode(hash)
            } catch (_: Exception) { null }
            if (decoded != null && decoded.contains("m3u8")) {
                Regex("""(https?://[^"'\s]+\.m3u8[^"'\s]*)""").find(decoded)?.groupValues?.get(1)?.let { m3u8 ->
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
        } catch (e: Exception) {
            Log.e("ToonStream", "AWSStream: ${e.message}")
        }
    }
}

class Zephyrflick : AWSStream() {
    override val name = "Zephyrflick"
    override val mainUrl = "https://play.zephyrflick.top"
}

open class GDMirrorbot : ExtractorApi() {
    override val name = "GDMirrorbot"
    override val mainUrl = "https://gdmirrorbot.nl"
    override val requiresReferer = false

    private val sourceNames = listOf("StreamHG", "StreamP2p", "UpnShare", "RpmShare", "EarnVids")

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            val response = app.get(url)
            val finalUrl = response.url
            val html = response.text

            val finalId = Regex("""FinalID\s*=\s*"([^"]+)"""").find(html)?.groupValues?.get(1) ?: return
            val myKey = Regex("""myKey\s*=\s*"([^"]+)"""").find(html)?.groupValues?.get(1) ?: return
            val idType = Regex("""idType\s*=\s*"([^"]+)"""").find(html)?.groupValues?.get(1) ?: "imdbid"
            val baseUrl = Regex("""let\s+baseUrl\s*=\s*"([^"]+)"""").find(html)?.groupValues?.get(1)?.let {
                getBaseUrl(it)
            } ?: getBaseUrl(finalUrl)

            val apiUrl = if (finalUrl.contains("/tv/")) {
                val seasonMatch = Regex("""/tv/\d+/(\d+)/""").find(finalUrl)
                val season = seasonMatch?.groupValues?.get(1) ?: "1"
                val epMatch = Regex("""/tv/\d+/\d+/(\d+)""").find(finalUrl)
                val epname = epMatch?.groupValues?.get(1) ?: "1"
                "$baseUrl/myseriesapi?tmdbid=$finalId&season=$season&epname=$epname&key=$myKey"
            } else {
                "$baseUrl/mymovieapi?key=$myKey"
            }

            val apiResponse = app.get(apiUrl).text
            val json = JsonParser.parseString(apiResponse).asJsonObject

            val siteUrls = json.getAsJsonArray("siteUrls") ?: return
            val siteNames = json.getAsJsonArray("siteFriendlyNames") ?: return
            val mresult = json.get("mresult")?.asString

            for (i in 0 until siteUrls.size()) {
                val sourceUrl = siteUrls[i].asString
                val sourceName = if (i < siteNames.size()) siteNames[i].asString else "Source"
                try {
                    loadExtractor(sourceUrl, url, subtitleCallback, callback)
                } catch (e: Exception) {
                    Log.e("ToonStream", "GDMirrorbot: Failed to extract from $sourceName at $sourceUrl: ${e.message}")
                }
            }

            if (mresult != null) {
                Log.e("ToonStream", "GDMirrorbot: Failed to decode mresult: $mresult")
            }
        } catch (e: Exception) {
            Log.e("ToonStream", "GDMirrorbot: ${e.message}")
        }
    }

    private fun getBaseUrl(url: String): String {
        return try {
            val uri = java.net.URI(url)
            "${uri.scheme}://${uri.host}"
        } catch (_: Exception) {
            url
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
                "Origin" to mainUrl
            )).text

            val doc = Jsoup.parse(html)
            val script = doc.selectFirst("script:containsData(datas)") ?: return
            val scriptData = script.data()

            val datas = Regex("""const\s+datas\s*=\s*"([^"]*)"""").find(scriptData)?.groupValues?.get(1) ?: return

            val jsonBody = datas.split("\n").map { line ->
                """{"text": "$line"}"""
            }.joinToString(",", "[", "]")

            val decResponse = app.post(decApi, headers = mapOf(
                "Content-Type" to "application/json",
                "Origin" to "https://enc-dec.app",
                "Referer" to "https://enc-dec.app/",
                "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36"
            ), requestBody = jsonBody.toRequestBody("application/json".toMediaType())).text

            val decJson = JsonParser.parseString(decResponse)
            if (decJson.isJsonObject) {
                val obj = decJson.asJsonObject
                for (key in obj.keySet()) {
                    val value = obj.get(key).asString
                    if (value.startsWith("http") && (value.contains(".m3u8") || value.contains(".mp4") || value.contains("playhydrax"))) {
                        val finalUrl = if (value.contains("playhydrax")) {
                            "https://playhydrax.com/?v=" + value.substringAfter("playhydrax.com/?v=", value)
                        } else value
                        callback.invoke(
                            ExtractorLink(
                                source = "$name [$key.uppercase()]",
                                name = "$name [$key.uppercase()]",
                                url = finalUrl,
                                referer = "https://playhydrax.com/",
                                quality = Qualities.Unknown.value,
                                type = if (finalUrl.contains(".m3u8")) ExtractorLinkType.M3U8 else ExtractorLinkType.VIDEO
                            )
                        )
                    }
                }
            }
        } catch (e: Exception) {
            Log.e("ToonStream", "Abyass: ${e.message}")
        }
    }
}
