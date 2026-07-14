package com.laddu100.raghavanime

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink

class RaghavAniNami : MainAPI() {
    override var mainUrl = "https://www.aninami.site"
    override var name = "AniNami"
    override val hasMainPage = false
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val apiHeaders = mapOf(
        "Accept" to "application/json",
        "Referer" to "$mainUrl/"
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodesResponse(
        @JsonProperty("success") val success: Boolean? = null,
        @JsonProperty("results") val results: EpisodesResultData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodesResultData(
        @JsonProperty("providers") val providers: Map<String, ProviderData>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ProviderData(
        @JsonProperty("episodes") val episodes: EpisodeCategories? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeCategories(
        @JsonProperty("sub") val sub: List<EpisodeItem>? = null,
        @JsonProperty("dub") val dub: List<EpisodeItem>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeItem(
        @JsonProperty("id") val id: String? = null,
        @JsonProperty("number") val number: Int? = null,
        @JsonProperty("title") val title: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamResponse(
        @JsonProperty("success") val success: Boolean? = null,
        @JsonProperty("results") val results: StreamResultData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamResultData(
        @JsonProperty("streams") val streams: List<Stream>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Stream(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("type") val type: String? = null,
        @JsonProperty("quality") val quality: String? = null,
        @JsonProperty("referer") val referer: String? = null
    )

    override suspend fun load(url: String): LoadResponse? {
        val anilistId = Regex("""/anime/(\d+)""").find(url)?.groupValues?.get(1)?.toIntOrNull()
            ?: return null

        val epsText = try {
            app.get("$mainUrl/api/episodes/$anilistId", headers = apiHeaders).text
        } catch (e: Exception) {
            Log.d("AniNami", "load: ${e.message}")
            return null
        }
        val providers = try {
            parseJson<EpisodesResponse>(epsText).results?.providers ?: emptyMap()
        } catch (e: Exception) {
            Log.d("AniNami", "parse: ${e.message}")
            return null
        }

        val subByNumber = sortedMapOf<Int, String>()
        val dubByNumber = sortedMapOf<Int, String>()

        for ((_, prov) in providers) {
            prov.episodes?.sub?.forEach { ep ->
                val num = ep.number ?: return@forEach
                val id = ep.id ?: return@forEach
                if (!subByNumber.containsKey(num)) subByNumber[num] = id
            }
            prov.episodes?.dub?.forEach { ep ->
                val num = ep.number ?: return@forEach
                val id = ep.id ?: return@forEach
                if (!dubByNumber.containsKey(num)) dubByNumber[num] = id
            }
        }

        val subEpisodes = subByNumber.map { (num, id) ->
            newEpisode("sub|$id") {
                this.episode = num
                this.name = "Episode $num"
            }
        }
        val dubEpisodes = dubByNumber.map { (num, id) ->
            newEpisode("dub|$id") {
                this.episode = num
                this.name = "Episode $num"
            }
        }

        return newAnimeLoadResponse("AniNami", url, TvType.Anime) {
            if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
            if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val pipeIdx = data.indexOf("|")
        if (pipeIdx < 0) return false
        val audioType = data.substring(0, pipeIdx)
        val epId = data.substring(pipeIdx + 1)
        if (epId.isBlank()) return false

        val parts = epId.split("/")
        if (parts.size < 5 || parts[0] != "watch") return false
        val provider = parts[1]
        val anilistId = parts[2]
        val slug = parts.drop(4).joinToString("/")
        if (provider.isEmpty() || slug.isEmpty()) return false

        val watchUrl = "$mainUrl/api/watch/$provider/$anilistId/$audioType/$slug"
        val streamsText = try {
            app.get(watchUrl, headers = apiHeaders).text
        } catch (e: Exception) {
            Log.d("AniNami", "watch: ${e.message}")
            return false
        }
        val streams = try {
            parseJson<StreamResponse>(streamsText).results?.streams
        } catch (e: Exception) {
            Log.d("AniNami", "parse: ${e.message}")
            return false
        } ?: return false

        var found = false
        val seenUrls = mutableSetOf<String>()

        for (stream in streams) {
            val streamUrl = stream.url ?: continue
            if (streamUrl.isBlank() || !seenUrls.add(streamUrl)) continue
            val referer = stream.referer?.takeIf { it.isNotBlank() } ?: "$mainUrl/"
            val qualityLabel = stream.quality?.takeIf { it.isNotBlank() } ?: "Auto"
            val label = "AniNami $qualityLabel"

            when (stream.type?.lowercase()) {
                "hls" -> {
                    callback.invoke(
                        newExtractorLink(label, label, streamUrl, ExtractorLinkType.M3U8) {
                            this.quality = parseQuality(stream.quality)
                            this.headers = mapOf("Referer" to referer)
                        }
                    )
                    found = true
                }
                "embed" -> {
                    try {
                        loadExtractor(streamUrl, referer, subtitleCallback, callback)
                        found = true
                    } catch (e: Exception) {
                        Log.d("AniNami", "embed: ${e.message}")
                    }
                }
                else -> {
                    try {
                        loadExtractor(streamUrl, referer, subtitleCallback, callback)
                        found = true
                    } catch (e: Exception) {
                        Log.d("AniNami", "fallback: ${e.message}")
                    }
                }
            }
        }

        return found
    }

    private fun parseQuality(q: String?): Int {
        if (q.isNullOrBlank() || q == "auto" || q == "Hls") return Qualities.Unknown.value
        val h = Regex("(\\d{3,4})").find(q)?.groupValues?.get(1)?.toIntOrNull()
            ?: return Qualities.Unknown.value
        return when {
            h >= 1080 -> Qualities.P1080.value
            h >= 720 -> Qualities.P720.value
            h >= 480 -> Qualities.P480.value
            else -> Qualities.Unknown.value
        }
    }
}
