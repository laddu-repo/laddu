package com.laddu100.raghavanime

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.addDate
import com.lagradost.cloudstream3.amap
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.nicehttp.RequestBodyTypes
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

class AnikageProvider : MainAPI() {
    override var mainUrl = "https://anikage.cc"
    override var name = "Anikage"
    override var lang = "en"
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val proxyHost = "https://prox.anicore.tv"
    private val anilistUrl = "https://graphql.anilist.co"

    private val anilistQuery = """
        query(${'$'}search: String) {
            Page(page: 1, perPage: 25) {
                media(search: ${'$'}search, type: ANIME, sort: POPULARITY_DESC) {
                    id
                    idMal
                    title { english romaji }
                    coverImage { extraLarge large }
                    format
                    episodes
                    seasonYear
                }
            }
        }
    """.trimIndent()

    override suspend fun search(query: String): List<SearchResponse> {
        val mediaList = anilistSearch(query) ?: return emptyList()
        return mediaList.amap { media ->
            try {
                val anilistId = media.id ?: return@amap null
                // anikage.cc is keyed by anilistId, so resolve each result to confirm it is hosted
                val details = fetchAnimeDetails(anilistId) ?: return@amap null
                val anime = details.anime ?: return@amap null
                val titleName = anime.title?.english ?: anime.title?.romaji ?: return@amap null
                newAnimeSearchResponse(titleName, "$mainUrl/anime/$anilistId") {
                    this.posterUrl = media.coverImage?.let { it.extraLarge ?: it.large }
                        ?: anime.coverImage?.let { it.extraLarge ?: it.large }
                    this.year = media.seasonYear
                }
            } catch (e: Exception) {
                null
            }
        }.filterNotNull()
    }

    override suspend fun load(url: String): LoadResponse {
        val anilistId = url.substringAfterLast("/").toIntOrNull()
            ?: throw ErrorLoadingException("Invalid AniList id in url: $url")

        val details = fetchAnimeDetails(anilistId)
            ?: throw ErrorLoadingException("Anikage has no entry for AniList id $anilistId")
        val anime = details.anime
            ?: throw ErrorLoadingException("Malformed details response for AniList id $anilistId")
        val slug = anime.slug
            ?: throw ErrorLoadingException("Missing slug in Anikage details")

        val titleName = anime.title?.english ?: anime.title?.romaji ?: "Anime $anilistId"
        val episodes = fetchEpisodes(slug)

        val tvType = when (anime.format?.uppercase()) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA" -> TvType.OVA
            else -> TvType.Anime
        }

        val subEpisodes = episodes.map { it.toEpisodeData(anilistId, slug, isDub = false) }
        val dubEpisodes = episodes.map { it.toEpisodeData(anilistId, slug, isDub = true) }

        return newAnimeLoadResponse(titleName, url, tvType) {
            this.posterUrl = anime.coverImage?.let { it.extraLarge ?: it.large }
            this.year = anime.seasonYear
            this.plot = anime.description?.replace(Regex("<[^>]+>"), "")
            this.showStatus = when (anime.status?.uppercase()) {
                "FINISHED" -> ShowStatus.Completed
                "RELEASING" -> ShowStatus.Ongoing
                else -> null
            }
            this.tags = anime.genres
            addEpisodes(DubStatus.Subbed, subEpisodes)
            addEpisodes(DubStatus.Dubbed, dubEpisodes)
        }
    }

    private fun EpisodeResult.toEpisodeData(anilistId: Int, slug: String, isDub: Boolean) =
        newEpisode("$anilistId|$slug|$number|$isDub") {
            this.episode = number
            this.name = title?.takeIf { it.isNotBlank() } ?: "Episode $number"
            this.posterUrl = image
            this.description = description
            airDate?.let { this.addDate(it) }
        }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean = coroutineScope {
        val parts = data.split("|")
        if (parts.size < 4) return@coroutineScope false
        val slug = parts[1]
        val epNum = parts[2]
        val isDub = parts[3] == "true"
        val lang = if (isDub) "dub" else "sub"

        val servers = fetchServers(slug, epNum, lang)
        if (servers.isNullOrEmpty()) return@coroutineScope false

        // Skip servers that explicitly don't expose the requested language
        val usable = servers.filter { server ->
            val types = server.subTypes
            server.id != null && (types.isNullOrEmpty() || types.contains(lang))
        }
        if (usable.isEmpty()) return@coroutineScope false

        val dubLabel = if (isDub) "Dub" else "Sub"

        usable.map { server ->
            async {
                val providerId = server.id ?: return@async
                try {
                    val src = fetchSources(slug, epNum, lang, providerId) ?: return@async

                    src.subtitles?.forEach { sub ->
                        val url = sub.toSubtitleUrl()
                        if (!url.isNullOrEmpty()) {
                            subtitleCallback(newSubtitleFile(sub.label ?: "English", url))
                        }
                    }

                    src.sources?.forEach { source ->
                        val token = source.url
                        if (!token.isNullOrEmpty()) {
                            val isM3u8 = source.isM3U8 != false
                            val path = if (isM3u8) "m3u8" else "stream"
                            callback(
                                newExtractorLink(
                                    "Anikage",
                                    buildLabel(providerId, dubLabel, source.type, source.quality),
                                    "$proxyHost/$path/$token",
                                    if (isM3u8) ExtractorLinkType.M3U8 else ExtractorLinkType.VIDEO
                                ) {
                                    this.quality = getQualityFromName(source.quality)
                                    this.referer = "$mainUrl/"
                                    this.headers = mapOf(
                                        "Origin" to mainUrl,
                                        "Referer" to "$mainUrl/"
                                    )
                                }
                            )
                        }
                        // embedUrl is a direct player page; hand it to the extractor framework
                        // as a fallback when the proxied token is missing or unplayable.
                        val embed = source.embedUrl
                        if (!embed.isNullOrEmpty()) {
                            try {
                                loadExtractor(embed, "$mainUrl/", subtitleCallback, callback)
                            } catch (e: Exception) {
                                Log.d(TAG, "embed extractor failed for $providerId: ${e.message}")
                            }
                        }
                    }
                } catch (e: Exception) {
                    Log.d(TAG, "provider $providerId failed: ${e.message}")
                }
            }
        }.awaitAll()

        true
    }

    // The proxied vtt path is unreliable for subtitle tokens, so prefer the direct VTT URL
    // that anikage exposes inside the subtitle's embedUrl query string.
    private fun SubtitleData.toSubtitleUrl(): String? {
        if (!embedUrl.isNullOrEmpty()) {
            val direct = embedUrl.substringAfter("sub=", "")
                .substringBefore("&")
                .let { java.net.URLDecoder.decode(it, "UTF-8") }
            if (direct.startsWith("http")) return direct
        }
        if (!file.isNullOrEmpty()) return "$proxyHost/vtt/$file"
        return null
    }

    private fun buildLabel(serverId: String, dubLabel: String, type: String?, quality: String?): String {
        val typePart = if (!type.isNullOrEmpty()) ", $type" else ""
        val qualityPart = if (!quality.isNullOrEmpty()) " $quality" else ""
        return "Anikage - $serverId ($dubLabel$typePart)$qualityPart"
    }

    private fun getQualityFromName(quality: String?): Int {
        return when {
            quality?.contains("1080") == true -> Qualities.P1080.value
            quality?.contains("720") == true -> Qualities.P720.value
            quality?.contains("480") == true -> Qualities.P480.value
            quality?.contains("360") == true -> Qualities.P360.value
            else -> Qualities.Unknown.value
        }
    }

    private suspend fun anilistSearch(query: String): List<AniListMedia>? {
        return try {
            val body = mapOf(
                "query" to anilistQuery,
                "variables" to mapOf("search" to query)
            ).toJson().toRequestBody(RequestBodyTypes.JSON.toMediaTypeOrNull())

            app.post(
                anilistUrl,
                headers = mapOf(
                    "Accept" to "application/json",
                    "Content-Type" to "application/json"
                ),
                requestBody = body
            ).parsedSafe<AniListSearchResponse>()?.data?.page?.media
        } catch (e: Exception) {
            Log.d(TAG, "anilist search failed: ${e.message}")
            null
        }
    }

    private suspend fun fetchAnimeDetails(anilistId: Int): AnikageDetailsResponse? {
        return try {
            app.get("$mainUrl/api/media/anime/$anilistId").parsedSafe<AnikageDetailsResponse>()
        } catch (e: Exception) {
            Log.d(TAG, "details fetch failed for $anilistId: ${e.message}")
            null
        }
    }

    private suspend fun fetchEpisodes(slug: String): List<EpisodeResult> {
        return try {
            app.get("$mainUrl/api/media/anime/$slug/episodes")
                .parsedSafe<EpisodesResponse>()?.episodes
                ?: emptyList()
        } catch (e: Exception) {
            Log.d(TAG, "episodes fetch failed for $slug: ${e.message}")
            emptyList()
        }
    }

    private suspend fun fetchServers(slug: String, epNum: String, lang: String): List<ServerData>? {
        return try {
            app.get("$mainUrl/api/media/anime/$slug/episodes/$epNum/servers?lang=$lang")
                .parsedSafe<ServersResponse>()?.servers
        } catch (e: Exception) {
            Log.d(TAG, "servers fetch failed for $slug ep$epNum: ${e.message}")
            null
        }
    }

    private suspend fun fetchSources(
        slug: String,
        epNum: String,
        lang: String,
        providerId: String
    ): EpisodeSource? {
        return try {
            app.get("$mainUrl/api/media/anime/$slug/episodes/$epNum/sources?lang=$lang&provider=$providerId")
                .parsedSafe<EpisodeSource>()
        } catch (e: Exception) {
            Log.d(TAG, "sources fetch failed for $providerId: ${e.message}")
            null
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListSearchResponse(val data: AniListData? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListData(val page: AniListPage? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListPage(val media: List<AniListMedia> = emptyList())

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListMedia(
        val id: Int? = null,
        val idMal: Int? = null,
        val title: AniListTitle? = null,
        val coverImage: AniListCover? = null,
        val format: String? = null,
        val episodes: Int? = null,
        val seasonYear: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListTitle(val english: String? = null, val romaji: String? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListCover(val large: String? = null, val extraLarge: String? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnikageDetailsResponse(val anime: AnikageAnime? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnikageAnime(
        val slug: String? = null,
        val anilistId: Int? = null,
        val malId: Int? = null,
        val title: AnikageTitle? = null,
        val coverImage: AnikageCover? = null,
        val bannerImage: String? = null,
        val format: String? = null,
        val status: String? = null,
        val genres: List<String>? = null,
        val seasonYear: Int? = null,
        val description: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnikageTitle(val english: String? = null, val romaji: String? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnikageCover(val large: String? = null, val extraLarge: String? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodesResponse(
        val anilistId: Int? = null,
        val total: Int? = null,
        val episodes: List<EpisodeResult> = emptyList()
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeResult(
        val number: Int = 0,
        val title: String? = null,
        val description: String? = null,
        @JsonAlias("img") val image: String? = null,
        val isFiller: Boolean? = null,
        val airDate: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ServersResponse(val servers: List<ServerData> = emptyList())

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ServerData(
        val id: String? = null,
        val default: Boolean? = null,
        val label: String? = null,
        val subTypes: List<String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeSource(
        val sources: List<SourceData>? = null,
        val subtitles: List<SubtitleData>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SourceData(
        val url: String? = null,
        val quality: String? = null,
        val isM3U8: Boolean? = null,
        val embedUrl: String? = null,
        val type: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SubtitleData(
        val file: String? = null,
        val label: String? = null,
        val kind: String? = null,
        val default: Boolean? = null,
        val embedUrl: String? = null
    )

    companion object {
        private const val TAG = "Anikage"
    }
}
