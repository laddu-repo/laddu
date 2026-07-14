package com.laddu100

import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.DubStatus
import com.lagradost.cloudstream3.Episode
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.ShowStatus
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.addDubStatus
import com.lagradost.cloudstream3.addEpisodes
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newAnimeLoadResponse
import com.lagradost.cloudstream3.newAnimeSearchResponse
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson

class AniKageProvider : MainAPI() {
    override var mainUrl = "https://anikage.cc"
    override var name = "AniKage"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val apiUrl = "https://anikage.cc/api/media/anime"
    private val proxyUrl = "https://prox.anicore.tv"
    private val anilistGraphql = "https://graphql.anilist.co"
    private val apiHeaders = mapOf(
        "Accept" to "application/json",
        "Referer" to "$mainUrl/"
    )
    private val proxyHeaders = mapOf(
        "Origin" to mainUrl,
        "Referer" to "$mainUrl/"
    )

    private val subProviders = listOf("koto", "neko", "miko", "megg", "dib", "wave")
    private val dubProvider = "koto"

    override val mainPage = mainPageOf(
        "trending" to "Trending",
        "popular" to "Popular",
        "seasonal" to "This Season",
        "topRated" to "Top Rated",
        "updated" to "Latest Updates"
    )

    private data class AniListResponse(val data: AniListPage? = null)
    private data class AniListPage(val Page: AniListPageData? = null)
    private data class AniListPageData(
        val pageInfo: PageInfo? = null,
        val media: List<AniListMedia> = emptyList()
    )
    private data class PageInfo(val hasNextPage: Boolean = false)
    private data class AniListMedia(
        val id: Int? = null,
        val idMal: Int? = null,
        val title: AniListTitle? = null,
        val coverImage: AniListCover? = null,
        val format: String? = null,
        val episodes: Int? = null,
        val seasonYear: Int? = null,
        val genres: List<String>? = null,
        val averageScore: Int? = null,
        val status: String? = null
    )
    private data class AniListTitle(
        val romaji: String? = null,
        val english: String? = null
    )
    private data class AniListCover(
        val extraLarge: String? = null,
        val large: String? = null
    )

    private data class AnimeDetailResponse(val anime: AnimeDetail? = null)
    private data class AnimeDetail(
        val slug: String = "",
        val anilistId: Int? = null,
        val malId: Int? = null,
        val title: AnimeTitle? = null,
        val coverImage: AnimeCover? = null,
        val bannerImage: String? = null,
        val description: String? = null,
        val genres: List<String>? = null,
        val averageScore: Int? = null,
        val episodes: Int? = null,
        val duration: Int? = null,
        val status: String? = null,
        val format: String? = null,
        val season: String? = null,
        val seasonYear: Int? = null
    )
    private data class AnimeTitle(
        val romaji: String? = null,
        val english: String? = null,
        val native: String? = null
    )
    private data class AnimeCover(
        val large: String? = null,
        val extraLarge: String? = null
    )

    private data class EpisodesResponse(
        val total: Int = 0,
        val episodes: List<EpisodeInfo> = emptyList()
    )
    private data class EpisodeInfo(
        val number: Int,
        val title: String? = null,
        val description: String? = null,
        val image: String? = null,
        val isFiller: Boolean = false
    )

    private data class ServersResponse(val servers: List<ServerInfo> = emptyList())
    private data class ServerInfo(
        val id: String = "",
        val label: String? = null,
        val subTypes: List<String> = emptyList()
    )

    private data class SourcesResponse(
        val sources: List<SourceInfo> = emptyList(),
        val subtitles: List<SubtitleInfo>? = null
    )
    private data class SourceInfo(
        val url: String = "",
        val quality: String? = null,
        val isM3U8: Boolean? = null,
        val embedUrl: String? = null,
        val type: String? = null
    )
    private data class SubtitleInfo(
        val file: String = "",
        val label: String? = null,
        val kind: String? = null,
        val default: Boolean = false,
        val embedUrl: String? = null
    )

    private data class MegaPlayResponse(
        val sources: MegaPlaySource? = null,
        val tracks: List<MegaPlayTrack>? = null
    )
    private data class MegaPlaySource(val file: String? = null)
    private data class MegaPlayTrack(
        val file: String? = null,
        val label: String? = null,
        val kind: String? = null,
        val default: Boolean = false
    )

    private suspend fun anilistSearch(query: String, variables: Map<String, Any?>): AniListResponse? {
        val body = mapOf(
            "query" to query,
            "variables" to variables
        ).toJson()
        return app.post(
            anilistGraphql,
            headers = mapOf("Content-Type" to "application/json", "Accept" to "application/json"),
            requestBody = body
        ).parsedSafe()
    }

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val sort = when (request.data) {
            "trending" -> "TRENDING_DESC"
            "popular" -> "POPULARITY_DESC"
            "topRated" -> "SCORE_DESC"
            "updated" -> "UPDATED"
            "seasonal" -> "TRENDING_DESC"
            else -> "TRENDING_DESC"
        }

        val query = """
            query(${'$'}page: Int, ${'$'}sort: [MediaSort], ${'$'}season: MediaSeason, ${'$'}seasonYear: Int) {
                Page(page: ${'$'}page, perPage: 20) {
                    pageInfo { hasNextPage }
                    media(sort: ${'$'}sort, type: ANIME, season: ${'$'}season, seasonYear: ${'$'}seasonYear) {
                        id idMal title { english romaji } coverImage { extraLarge large }
                        format episodes seasonYear status averageScore genres
                    }
                }
            }
        """.trimIndent()

        val variables = mutableMapOf<String, Any?>(
            "page" to page,
            "sort" to listOf(sort, "POPULARITY_DESC")
        )
        if (request.data == "seasonal") {
            val cal = java.util.Calendar.getInstance()
            val seasonName = when (cal.get(java.util.Calendar.MONTH)) {
                0, 1, 2 -> "WINTER"
                3, 4, 5 -> "SPRING"
                6, 7, 8 -> "SUMMER"
                else -> "FALL"
            }
            variables["season"] = seasonName
            variables["seasonYear"] = cal.get(java.util.Calendar.YEAR)
        }

        val response = try {
            anilistSearch(query, variables)
        } catch (e: Exception) {
            Log.d("AniKage", "getMainPage error: ${e.message}")
            return newHomePageResponse(request.name, emptyList())
        }

        val media = response?.data?.Page?.media ?: return newHomePageResponse(request.name, emptyList())
        val home = media.mapNotNull { item ->
            val title = item.title?.english ?: item.title?.romaji ?: return@mapNotNull null
            val poster = item.coverImage?.extraLarge ?: item.coverImage?.large
            newAnimeSearchResponse(title, "$mainUrl/anime/${item.id}", TvType.Anime) {
                this.posterUrl = poster
                this.year = item.seasonYear
                addDubStatus(dubExist = true, subExist = true)
            }
        }

        return newHomePageResponse(request.name, home, hasNext = response.data?.Page?.pageInfo?.hasNextPage ?: false)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()

        val graphqlQuery = """
            query(${'$'}search: String) {
                Page(page: 1, perPage: 25) {
                    media(search: ${'$'}search, type: ANIME, sort: POPULARITY_DESC) {
                        id idMal title { english romaji } coverImage { extraLarge large }
                        format episodes seasonYear status averageScore genres
                    }
                }
            }
        """.trimIndent()

        val response = try {
            anilistSearch(graphqlQuery, mapOf("search" to query))
        } catch (e: Exception) {
            Log.d("AniKage", "search error: ${e.message}")
            return emptyList()
        }

        val media = response?.data?.Page?.media ?: return emptyList()
        return media.mapNotNull { item ->
            val title = item.title?.english ?: item.title?.romaji ?: return@mapNotNull null
            val poster = item.coverImage?.extraLarge ?: item.coverImage?.large
            val tvType = when (item.format) {
                "MOVIE" -> TvType.AnimeMovie
                "OVA", "ONA", "SPECIAL" -> TvType.OVA
                else -> TvType.Anime
            }
            newAnimeSearchResponse(title, "$mainUrl/anime/${item.id}", tvType) {
                this.posterUrl = poster
                this.year = item.seasonYear
                addDubStatus(dubExist = true, subExist = true)
            }
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        val anilistId = url.substringAfterLast("/").toIntOrNull() ?: return null

        val details = try {
            app.get("$apiUrl/$anilistId", headers = apiHeaders).parsedSafe<AnimeDetailResponse>()
        } catch (e: Exception) {
            Log.d("AniKage", "load detail error: ${e.message}")
            return null
        } ?: return null

        val anime = details.anime ?: return null
        val slug = anime.slug
        val title = anime.title?.english ?: anime.title?.romaji ?: return null
        val poster = anime.coverImage?.extraLarge ?: anime.coverImage?.large
        val banner = anime.bannerImage
        val plot = anime.description?.replace(Regex("<[^>]+>"), "")
        val year = anime.seasonYear
        val tags = anime.genres?.filter { it.isNotBlank() } ?: emptyList()
        val jpName = anime.title?.native

        val showStatus = when (anime.status?.uppercase()) {
            "FINISHED" -> ShowStatus.Completed
            "RELEASING" -> ShowStatus.Ongoing
            else -> null
        }

        val tvType = when (anime.format) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL" -> TvType.OVA
            else -> TvType.Anime
        }

        val episodesResponse = try {
            app.get("$apiUrl/$slug/episodes", headers = apiHeaders).parsedSafe<EpisodesResponse>()
        } catch (e: Exception) {
            Log.d("AniKage", "load episodes error: ${e.message}")
            return null
        } ?: return null

        val episodes = episodesResponse.episodes
        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        for (ep in episodes) {
            val epData = "$mainUrl|$slug|${ep.number}|sub"
            val dubEpData = "$mainUrl|$slug|${ep.number}|dub"

            subEpisodes.add(newEpisode(epData) {
                this.name = ep.title
                this.episode = ep.number
                this.posterUrl = ep.image
                this.description = ep.description
            })
            dubEpisodes.add(newEpisode(dubEpData) {
                this.name = ep.title
                this.episode = ep.number
                this.posterUrl = ep.image
                this.description = ep.description
            })
        }

        Log.d("AniKage", "load $title: ${subEpisodes.size} eps")

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = poster
            this.backgroundPosterUrl = banner
            this.year = year
            this.plot = plot
            this.tags = tags
            this.showStatus = showStatus
            if (jpName != null) this.japName = jpName
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
        val parts = data.split("|")
        if (parts.size < 4) return false
        val slug = parts[1]
        val epNum = parts[2]
        val type = parts[3]

        val lang = if (type == "dub") "dub" else "sub"
        val providers = if (type == "dub") listOf(dubProvider) else subProviders

        Log.d("AniKage", "loadLinks: slug=$slug ep=$epNum lang=$lang providers=$providers")

        var found = false

        for (providerId in providers) {
            try {
                val sourcesResponse = app.get(
                    "$apiUrl/$slug/episodes/$epNum/sources?lang=$lang&provider=$providerId",
                    headers = apiHeaders
                ).parsedSafe<SourcesResponse>() ?: continue

                if (sourcesResponse.sources.isEmpty()) continue

                for (source in sourcesResponse.sources) {
                    val sourceUrl = source.url
                    if (sourceUrl.isBlank()) continue

                    val quality = source.quality ?: "auto"
                    val sourceType = source.type ?: ""
                    val isM3u8 = source.isM3U8 != false
                    val embedUrl = source.embedUrl

                    val subLabel = when {
                        sourceType.contains("soft", ignoreCase = true) -> "Soft Sub"
                        sourceType.contains("hard", ignoreCase = true) -> "Hardsub"
                        type == "dub" -> "Dub"
                        else -> "Sub"
                    }

                    val label = "AniKage - ${providerId.replaceFirstChar { it.uppercase() }} ($quality, $subLabel)"

                    val proxiedUrl = if (isM3u8) {
                        "$proxyUrl/m3u8/$sourceUrl"
                    } else {
                        "$proxyUrl/stream/$sourceUrl"
                    }

                    callback(newExtractorLink(
                        source = name,
                        name = label,
                        url = proxiedUrl,
                        type = if (isM3u8) ExtractorLinkType.M3U8 else ExtractorLinkType.VIDEO
                    ) {
                        this.headers = proxyHeaders
                    })
                    found = true

                    if (embedUrl != null && embedUrl.contains("megaplay.buzz")) {
                        fetchMegaPlaySubtitles(embedUrl, subtitleCallback)
                    }
                }

                sourcesResponse.subtitles?.forEach { sub ->
                    if (sub.embedUrl != null && sub.embedUrl.contains("megaplay.buzz")) {
                        fetchMegaPlaySubtitles(sub.embedUrl, subtitleCallback)
                    }
                }
            } catch (e: Exception) {
                Log.d("AniKage", "provider $providerId error: ${e.message}")
            }
        }

        Log.d("AniKage", "loadLinks: found=$found")
        return found
    }

    private suspend fun fetchMegaPlaySubtitles(
        embedUrl: String,
        subtitleCallback: (SubtitleFile) -> Unit
    ) {
        try {
            val id = Regex("""/stream/(?:s-\d+/)?(\w+)""").find(embedUrl)?.groupValues?.get(1)
                ?: embedUrl.substringAfterLast("/").substringBefore("/")

            val response = app.get(
                "https://megaplay.buzz/stream/getSources?id=$id",
                headers = mapOf(
                    "Referer" to "https://megaplay.buzz/",
                    "Origin" to "https://megaplay.buzz",
                    "X-Requested-With" to "XMLHttpRequest"
                )
            ).parsedSafe<MegaPlayResponse>() ?: return

            response.tracks?.forEach { track ->
                if (track.kind == "captions" || track.kind == "subtitles") {
                    val file = track.file ?: return@forEach
                    if (file.isNotBlank()) {
                        subtitleCallback.invoke(
                            SubtitleFile(track.label ?: "English", file)
                        )
                    }
                }
            }
        } catch (e: Exception) {
            Log.d("AniKage", "megaplay subtitles error: ${e.message}")
        }
    }
}
