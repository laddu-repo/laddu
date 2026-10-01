package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.newExtractorLink

@JsonIgnoreProperties(ignoreUnknown = true)
data class MegaSources(
    @JsonProperty("sources") val sources: MegaSource? = null,
    @JsonProperty("tracks") val tracks: List<MegaTrack>? = null,
    @JsonProperty("server") val server: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class MegaSource(@JsonProperty("file") val file: String? = null)

@JsonIgnoreProperties(ignoreUnknown = true)
data class MegaTrack(
    @JsonProperty("file") val file: String? = null,
    @JsonProperty("label") val label: String? = null,
    @JsonProperty("kind") val kind: String? = null,
    @JsonProperty("default") val isDefault: Boolean? = null
)

/**
 * Base extractor for the MegaPlay-family embed hosts used by AnixTV:
 * megaplay.buzz (HD-2 / Vidstream-2), vidwish.live (VidCloud-1), vidtube.site (VidPlay-1).
 *
 * Flow: parse embed page for #megaplay-player data-id (+ settings cid/cidu) ->
 * GET {host}/stream/getSources?id=..&cidu=.. -> m3u8 + VTT subtitle tracks.
 */
open class AnixTvMegaPlay(private val sourceName: String = "MegaPlay") : ExtractorApi() {
    override val name = sourceName
    override val mainUrl = "https://megaplay.buzz"
    override val requiresReferer = false

    private fun headers(): Map<String, String> = mapOf(
        "User-Agent" to ANIXTV_UA,
        "Accept" to "*/*",
        "X-Requested-With" to "XMLHttpRequest",
        "Referer" to "$mainUrl/"
    )

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        var resolved = false
        runCatching {
            val document = app.get(url, headers = headers()).document
            val html = document.html()

            val id = document.selectFirst("#megaplay-player")?.attr("data-id")?.takeIf { it.isNotBlank() }
                ?: Regex("""data-id=["'](\d+)""").find(html)?.groupValues?.get(1)
                ?: Regex("""/stream/s-?\d+/(\d+)""").find(url)?.groupValues?.get(1)
                ?: return@runCatching
            val cidu = Regex("""cidu["']?\s*[:=]\s*["']([0-9a-fA-F]+)["']""").find(html)?.groupValues?.get(1) ?: ""

            val sourcesUrl = "$mainUrl/stream/getSources?id=$id" +
                (if (cidu.isNotEmpty()) "&cidu=$cidu" else "")
            val sourcesText = app.get(sourcesUrl, headers = headers()).text
            val sources = parseJson<MegaSources>(sourcesText)
            val m3u8 = sources.sources?.file?.takeIf { it.startsWith("http") } ?: return@runCatching

            callback.invoke(
                newExtractorLink(
                    source = sourceName,
                    name = sourceName,
                    url = m3u8,
                    type = ExtractorLinkType.M3U8
                ) {
                    this.quality = Qualities.Unknown.value
                    this.headers = headers()
                }
            )
            resolved = true

            sources.tracks?.forEach { track ->
                val file = track.file?.takeIf { it.startsWith("http") } ?: return@forEach
                if (track.kind == "captions" || track.kind == "subtitles") {
                    subtitleCallback.invoke(
                        newSubtitleFile(track.label ?: "Subtitle", file) {
                            this.headers = mapOf(
                                "User-Agent" to ANIXTV_UA,
                                "Referer" to "$mainUrl/"
                            )
                        }
                    )
                }
            }
        }.onFailure { error ->
            Log.e(sourceName, "getSources failed, trying WebView: ${error.message}")
            if (!resolved) webViewFallback(url, subtitleCallback, callback)
        }
    }

    private suspend fun webViewFallback(
        url: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        runCatching {
            val resolver = WebViewResolver(
                interceptUrl = Regex("""\.m3u8"""),
                additionalUrls = listOf(Regex("""\.m3u8""")),
                script = """document.querySelector('.jw-icon-display')?.click();""",
                useOkhttp = false,
                timeout = 15_000L
            )
            val m3u8 = app.get(url, referer = mainUrl, interceptor = resolver).url
            if (m3u8.contains(".m3u8")) {
                callback.invoke(
                    newExtractorLink(
                        source = sourceName,
                        name = sourceName,
                        url = m3u8,
                        type = ExtractorLinkType.M3U8
                    ) {
                        this.quality = Qualities.Unknown.value
                        this.headers = headers()
                    }
                )
            }
        }.onFailure { Log.e(sourceName, "WebView fallback failed: ${it.message}") }
    }
}

class AnixTvVidWish(sourceName: String = "VidWish") : AnixTvMegaPlay(sourceName) {
    override val mainUrl = "https://vidwish.live"
}

class AnixTvVidPlay(sourceName: String = "VidPlay") : AnixTvMegaPlay(sourceName) {
    override val mainUrl = "https://vidtube.site"
}
