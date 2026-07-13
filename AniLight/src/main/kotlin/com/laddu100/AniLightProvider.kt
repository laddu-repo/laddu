package com.laddu100

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
import java.net.URLEncoder

class AniLightProvider : MainAPI() {
    override var mainUrl = "https://anilight.live"
    override var name = "AniLight"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val apiUrl = "https://api.anilight.live/api"
    private val apiHeaders = mapOf("Accept" to "application/json")

    override val mainPage = mainPageOf(
        "trending" to "Top Trending",
        "popular" to "Most Popular",
        "seasonal" to "This Season",
        "topRated" to "Top Rated",
        "recentlyAddedEpisodes" to "Latest Episodes"
    )

    private data class HomepageResponse(
        val trending: SectionData? = null,
        val popular: SectionData? = null,
        val seasonal: SectionData? = null,
        val topRated: SectionData? = null,
        val upcoming: SectionData? = null,
        val recentlyAddedEpisodes: List<AnimeItem>? = null
    )

    private data class SectionData(val media: List<AnimeItem> = emptyList())

    private data class AnimeItem(
        val id: Int = 0,
        val slug: String = "",
        val anilistId: Int? = null,
        val idMal: Int? = null,
        val title: TitleData? = null,
        val coverImage: CoverImage? = null,
        val bannerImage: String? = null,
        val description: String? = null,
        val genres: List<String> = emptyList(),
        val averageScore: Int? = null,
        val episodes: Int? = null,
        val duration: Int? = null,
        val status: String? = null,
        val format: String? = null,
        val season: String? = null,
        val seasonYear: Int? = null
    )

    private data class TitleData(
        val romaji: String? = null,
        val english: String? = null,
        val native: String? = null
    )

    private data class CoverImage(
        val large: String? = null,
        val extraLarge: String? = null,
        val medium: String? = null
    )

    private data class WatchResponse(
        val id: Int = 0,
        val episodes: List<EpisodeData> = emptyList(),
        val servers: ServersData? = null
    )

    private data class EpisodeData(
        val number: Int,
        val title: String? = null,
        val jp_title: String? = null,
        val description: String? = null,
        val img: String? = null,
        val isFiller: Boolean = false,
        val embed_url: EmbedUrl? = null
    )

    private data class EmbedUrl(
        val sub: String? = null,
        val dub: String? = null
    )

    private data class ServersData(
        val subProviders: List<Provider> = emptyList(),
        val dubProviders: List<Provider> = emptyList()
    )

    private data class Provider(
        val id: String = "",
        val tip: String? = null,
        val default: Boolean = false
    )

    private data class SourcesResponse(
        val audio: Any? = null,
        val tracks: List<Track>? = null,
        val sources: List<Source> = emptyList(),
        val chapters: List<Chapter>? = null
    )

    private data class Source(
        val url: String = "",
        val quality: String = "auto"
    )

    private data class Track(
        val id: String? = null,
        val url: String = "",
        val kind: String? = null,
        val lang: String? = null,
        val label: String? = null,
        val default: Boolean = false
    )

    private data class Chapter(
        val start: Int = 0,
        val end: Int = 0,
        val title: String? = null
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        if (page > 1) return newHomePageResponse(request.name, emptyList())

        val response = try {
            app.get("$apiUrl/homepage", headers = apiHeaders).parsedSafe<HomepageResponse>()
        } catch (e: Exception) {
            Log.d("AniLight", "getMainPage error: ${e.message}")
            return newHomePageResponse(request.name, emptyList())
        } ?: return newHomePageResponse(request.name, emptyList())

        val section: List<AnimeItem> = when (request.data) {
            "trending" -> response.trending?.media ?: emptyList()
            "popular" -> response.popular?.media ?: emptyList()
            "seasonal" -> response.seasonal?.media ?: emptyList()
            "topRated" -> response.topRated?.media ?: emptyList()
            "recentlyAddedEpisodes" -> response.recentlyAddedEpisodes ?: emptyList()
            else -> emptyList()
        }

        val home = section.mapNotNull { item ->
            val title = item.title?.english ?: item.title?.romaji ?: return@mapNotNull null
            val poster = item.coverImage?.extraLarge ?: item.coverImage?.large
            newAnimeSearchResponse(title, item.slug, TvType.Anime) {
                this.posterUrl = poster
                this.year = item.seasonYear
                addDubStatus(dubExist = true, subExist = true)
            }
        }

        Log.d("AniLight", "homepage ${request.name}: ${home.size} items")
        return newHomePageResponse(request.name, home)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        val results = try {
            app.get(
                "$apiUrl/search?q=${URLEncoder.encode(query, "UTF-8")}",
                headers = apiHeaders
            ).parsedSafe<List<AnimeItem>>()
        } catch (e: Exception) {
            Log.d("AniLight", "search error: ${e.message}")
            return emptyList()
        } ?: return emptyList()

        return results.mapNotNull { item ->
            val title = item.title?.english ?: item.title?.romaji ?: return@mapNotNull null
            val poster = item.coverImage?.extraLarge ?: item.coverImage?.large
            val tvType = when (item.format) {
                "MOVIE" -> TvType.AnimeMovie
                "OVA", "ONA", "SPECIAL" -> TvType.OVA
                else -> TvType.Anime
            }
            newAnimeSearchResponse(title, item.slug, tvType) {
                this.posterUrl = poster
                this.year = item.seasonYear
                addDubStatus(dubExist = true, subExist = true)
            }
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        val slug = url.substringAfterLast("/")
        val detail = try {
            app.get("$apiUrl/anime/$slug", headers = apiHeaders).parsedSafe<AnimeItem>()
        } catch (e: Exception) {
            Log.d("AniLight", "load detail error: ${e.message}")
            return null
        } ?: run {
            Log.d("AniLight", "load detail null for slug=$slug")
            return null
        }

        val title = detail.title?.english ?: detail.title?.romaji ?: return null
        val poster = detail.coverImage?.extraLarge ?: detail.coverImage?.large
        val banner = detail.bannerImage
        val plot = detail.description
        val year = detail.seasonYear
        val tags = detail.genres.filter { it.isNotBlank() }
        val jpName = detail.title?.native

        val showStatus = when (detail.status) {
            "FINISHED" -> ShowStatus.Completed
            "RELEASING" -> ShowStatus.Ongoing
            else -> null
        }

        val tvType = when (detail.format) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL" -> TvType.OVA
            else -> TvType.Anime
        }

        val watch = try {
            app.get("$apiUrl/watch/$slug", headers = apiHeaders).parsedSafe<WatchResponse>()
        } catch (e: Exception) {
            Log.d("AniLight", "load watch error: ${e.message}")
            return null
        } ?: run {
            Log.d("AniLight", "load watch null for slug=$slug")
            return null
        }

        val anilistId = detail.anilistId ?: watch.id
        val subProviders = watch.servers?.subProviders ?: emptyList()
        val dubProviders = watch.servers?.dubProviders ?: emptyList()

        Log.d("AniLight", "load $title: ${watch.episodes.size} eps, ${subProviders.size} sub, ${dubProviders.size} dub providers")

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        for (ep in watch.episodes) {
            val epNum = ep.number
            val epTitle = ep.title?.takeIf { it.isNotBlank() }
            val epThumb = ep.img
            val epDesc = ep.description?.takeIf { it.isNotBlank() }
            val fillerStr = if (ep.isFiller) " (Filler)" else null

            val subData = "$anilistId|$epNum|sub|${subProviders.joinToString(",") { it.id }}|${subProviders.joinToString(";") { it.tip ?: "" }}"
            val dubData = "$anilistId|$epNum|dub|${dubProviders.joinToString(",") { it.id }}|${dubProviders.joinToString(";") { it.tip ?: "" }}"

            if (subProviders.isNotEmpty()) {
                subEpisodes.add(newEpisode(subData) {
                    this.name = epTitle
                    this.episode = epNum
                    this.posterUrl = epThumb
                    this.description = epDesc?.let { it + fillerStr } ?: fillerStr
                })
            }
            if (dubProviders.isNotEmpty()) {
                dubEpisodes.add(newEpisode(dubData) {
                    this.name = epTitle
                    this.episode = epNum
                    this.posterUrl = epThumb
                    this.description = epDesc?.let { it + fillerStr } ?: fillerStr
                })
            }
        }

        Log.d("AniLight", "load $title: ${subEpisodes.size} sub eps, ${dubEpisodes.size} dub eps")

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
        if (parts.size < 3) {
            Log.d("AniLight", "loadLinks: bad data='$data'")
            return false
        }
        val anilistId = parts[0]
        val epNum = parts[1]
        val type = parts[2]
        val providerIds = parts.getOrNull(3)?.split(",")?.filter { it.isNotBlank() } ?: emptyList()
        val tips = parts.getOrNull(4)?.split(";")?.filter { it.isNotBlank() } ?: emptyList()

        Log.d("AniLight", "loadLinks: id=$anilistId ep=$epNum type=$type providers=$providerIds")

        var found = false
        val typeLabel = type.replaceFirstChar { it.uppercase() }

        for ((index, providerId) in providerIds.withIndex()) {
            val tip = tips.getOrNull(index)?.trim() ?: ""
            val subLabel = when {
                tip.contains("soft", ignoreCase = true) -> "Soft Sub"
                tip.contains("hard", ignoreCase = true) -> "Hardsub"
                else -> if (type == "dub") "Dub" else "Sub"
            }

            try {
                val sourcesResponse = app.get(
                    "$apiUrl/sources?id=$anilistId&epNum=$epNum&type=$type&providerId=$providerId",
                    headers = apiHeaders
                ).parsedSafe<SourcesResponse>()

                if (sourcesResponse == null || sourcesResponse.sources.isEmpty()) {
                    continue
                }

                val trackUrls = sourcesResponse.tracks
                    ?.filter { it.kind == "captions" || it.kind == "subtitles" }
                    ?: emptyList()

                for (source in sourcesResponse.sources) {
                    val url = source.url
                    if (url.isBlank()) continue

                    val qualityLabel = source.quality.takeIf { it != "auto" && it.isNotBlank() } ?: ""
                    val label = buildString {
                        append("AniLight - ")
                        append(providerId.replaceFirstChar { it.uppercase() })
                        append(" ($typeLabel, $subLabel")
                        if (qualityLabel.isNotBlank()) append(", $qualityLabel")
                        append(")")
                    }

                    when {
                        url.contains(".m3u8", ignoreCase = true) -> {
                            callback(newExtractorLink(
                                source = name,
                                name = label,
                                url = url,
                                type = ExtractorLinkType.M3U8
                            ) {})
                            found = true
                        }
                        url.contains(".mp4", ignoreCase = true) -> {
                            callback(newExtractorLink(
                                source = name,
                                name = label,
                                url = url,
                                type = ExtractorLinkType.VIDEO
                            ) {})
                            found = true
                        }
                        else -> {
                            callback(newExtractorLink(
                                source = name,
                                name = label,
                                url = url,
                                type = ExtractorLinkType.M3U8
                            ) {})
                            found = true
                        }
                    }
                }

                trackUrls.forEach { track ->
                    if (track.url.isNotBlank()) {
                        subtitleCallback.invoke(SubtitleFile(track.label ?: "English", track.url))
                    }
                }
            } catch (e: Exception) {
                Log.d("AniLight", "source $providerId error: ${e.message}")
            }
        }

        Log.d("AniLight", "loadLinks: found=$found")
        return found
    }
}
