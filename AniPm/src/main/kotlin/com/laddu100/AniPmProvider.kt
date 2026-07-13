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
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink

class AniPmProvider : MainAPI() {
    override var mainUrl = "https://ani.pm"
    override var name = "AniPm"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        "trending" to "Top Trending",
        "popular" to "Most Popular",
        "latest" to "Latest Added",
        "top-rated" to "Top Rated",
        "az" to "A-Z"
    )

    private val apiHeaders = mapOf(
        "Accept" to "application/json",
        "Referer" to "$mainUrl/"
    )

    private val m3u8Regex = Regex("""https?://[^\s"']+\.m3u8[^\s"']*""")

    // ─────────────────────────────────────────────────────────────
    // JACKSON DATA CLASSES (from live API probes — zero guesswork)
    // ─────────────────────────────────────────────────────────────

    private data class CatalogResponse(
        val items: List<SearchItem> = emptyList(),
        val page: Int = 1,
        val lastPage: Int = 1,
        val total: Int = 0,
        val hasNextPage: Boolean = false
    )

    private data class SearchItem(
        val id: Int,
        val source: String = "",
        val slug: String? = null,
        val title: String,
        val native: String? = null,
        val poster: String? = null,
        val banner: String? = null,
        val year: Int? = null,
        val score: Double? = null,
        val rating: String? = null,
        val duration: String? = null,
        val status: String? = null,
        val type: String = "TV",
        val genres: List<String> = emptyList(),
        val studios: List<String> = emptyList(),
        val episodeCount: Int? = null,
        val subCount: Int? = null,
        val dubCount: Int? = null,
        val synopsis: String? = null,
        val malId: String? = null,
        val anilistId: String? = null,
        val season: String? = null
    )

    private data class SearchResponseData(
        val items: List<SearchItem> = emptyList()
    )

    private data class SeriesDetail(
        val id: Int,
        val source: String = "",
        val slug: String? = null,
        val title: String,
        val native: String? = null,
        val poster: String? = null,
        val banner: String? = null,
        val year: Int? = null,
        val score: Double? = null,
        val rating: String? = null,
        val duration: String? = null,
        val status: String? = null,
        val type: String = "TV",
        val genres: List<String> = emptyList(),
        val studios: List<String> = emptyList(),
        val episodeCount: Int? = null,
        val subCount: Int? = null,
        val dubCount: Int? = null,
        val synopsis: String? = null,
        val malId: String? = null,
        val anilistId: String? = null,
        val season: String? = null,
        val episodes: List<EpisodeData> = emptyList()
    )

    private data class EpisodeData(
        val number: Int,
        val title: String? = null,
        val thumbnail: String? = null,
        val description: String? = null,
        val embedId: String? = null,
        val sub: String? = null,
        val dub: String? = null,
        val rating: String? = null,
        val aired: String? = null,
        val runtime: Int? = null
    )

    private data class SrcServersResponse(
        val sub: List<SrcSource> = emptyList(),
        val dub: List<SrcSource> = emptyList()
    )

    private data class SrcSource(
        val provider: String = "",
        val name: String = "",
        val kind: String = "hls",        // hls, embed, file
        val url: String = "",
        val priority: Int = 0,
        val subtitle: String? = null,     // hard, soft, null
        val tracks: List<SubtitleTrack>? = null,
        val audioLang: String? = null,    // ja, en
        val resolvable: Boolean? = null
    )

    private data class SubtitleTrack(
        val url: String = "",
        val label: String = "English",
        val default: Boolean = false
    )

    private data class AnimeggResponse(
        val sources: List<AnimeggSource> = emptyList()
    )

    private data class AnimeggSource(
        val url: String = "",
        val quality: String = "",
        val type: String = "mp4"
    )

    // ─────────────────────────────────────────────────────────────
    // HOMEPAGE
    // ─────────────────────────────────────────────────────────────

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val sort = request.data
        val response = try {
            app.get(
                "$mainUrl/api/anime/catalog?sort=$sort&page=$page",
                headers = apiHeaders
            ).parsedSafe<CatalogResponse>()
        } catch (e: Exception) {
            Log.d("AniPm", "getMainPage $sort page=$page error: ${e.message}")
            null
        }

        val items = response?.items ?: emptyList()
        val home = items.mapNotNull { item ->
            val poster = fixPoster(item.poster) ?: return@mapNotNull null
            val title = item.title.ifEmpty { return@mapNotNull null }
            newAnimeSearchResponse(title, "$mainUrl/anime/${item.id}", TvType.Anime) {
                this.posterUrl = poster
                this.year = item.year?.takeIf { it > 0 }
                addDubStatus(
                    dubExist = (item.dubCount ?: 0) > 0,
                    subExist = (item.subCount ?: 0) > 0 || (item.episodeCount ?: 0) > 0
                )
            }
        }
        Log.d("AniPm", "homepage ${request.name} page=$page: ${home.size} items")
        return newHomePageResponse(request.name, home, hasNext = response?.hasNextPage ?: false)
    }

    // ─────────────────────────────────────────────────────────────
    // SEARCH
    // ─────────────────────────────────────────────────────────────

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        val response = try {
            app.get(
                "$mainUrl/api/anime/search?q=${java.net.URLEncoder.encode(query, "UTF-8")}",
                headers = apiHeaders
            ).parsedSafe<SearchResponseData>()
        } catch (e: Exception) {
            Log.d("AniPm", "search '$query' error: ${e.message}")
            return emptyList()
        }

        // Filter to source="anikoto" items — only those have full episode data.
        // Anilist-source items are metadata-only (no episodes/streams).
        return response?.items
            ?.filter { it.source == "anikoto" }
            ?.mapNotNull { item ->
                val poster = fixPoster(item.poster) ?: return@mapNotNull null
                val title = item.title.ifEmpty { return@mapNotNull null }
                newAnimeSearchResponse(title, "$mainUrl/anime/${item.id}", TvType.Anime) {
                    this.posterUrl = poster
                    this.year = item.year?.takeIf { it > 0 }
                    addDubStatus(
                        dubExist = (item.dubCount ?: 0) > 0,
                        subExist = (item.subCount ?: 0) > 0 || (item.episodeCount ?: 0) > 0
                    )
                }
            } ?: emptyList()
    }

    // ─────────────────────────────────────────────────────────────
    // LOAD (series detail with real episode titles + sub/dub separation)
    // ─────────────────────────────────────────────────────────────

    override suspend fun load(url: String): LoadResponse? {
        val seriesId = url.substringAfterLast("/").toIntOrNull() ?: run {
            Log.d("AniPm", "load: invalid url=$url")
            return null
        }

        val detail = try {
            app.get(
                "$mainUrl/api/anime/series/$seriesId",
                headers = apiHeaders
            ).parsedSafe<SeriesDetail>()
        } catch (e: Exception) {
            Log.d("AniPm", "load series/$seriesId error: ${e.message}")
            return null
        } ?: run {
            Log.d("AniPm", "load series/$seriesId: null response")
            return null
        }

        val title = detail.title
        val poster = fixPoster(detail.poster)
        val banner = fixPoster(detail.banner)
        val plot = detail.synopsis
        val year = detail.year?.takeIf { it > 0 }
        val tags = detail.genres.filter { it.isNotBlank() }
        val jpName = detail.native?.takeIf { it.isNotBlank() }

        val showStatus = when (detail.status?.lowercase()) {
            "finished airing", "completed", "finished" -> ShowStatus.Completed
            "currently airing", "ongoing", "airing" -> ShowStatus.Ongoing
            else -> null
        }

        val tvType = when (detail.type) {
            "Movie" -> TvType.AnimeMovie
            "OVA", "ONA", "Special" -> TvType.OVA
            else -> TvType.Anime
        }

        // Build sub/dub episodes with REAL titles, descriptions, thumbnails.
        // Encode the type (sub/dub) + metadata into the data string so loadLinks
        // can call src/servers with the correct title/ep/year/anilistId/malId.
        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        for (ep in detail.episodes) {
            val epNum = ep.number
            val epTitle = ep.title?.takeIf { it.isNotBlank() }
            val epThumb = fixPoster(ep.thumbnail)
            val epDesc = ep.description?.takeIf { it.isNotBlank() }
            // Data string: $mainUrl|$title|$epNum|$type|$year|$anilistId|$malId
            // type = "sub" or "dub" — loadLinks uses this to select the right array.
            val subData = buildEpisodeData(title, epNum, "sub", year, detail.anilistId, detail.malId)
            val dubData = buildEpisodeData(title, epNum, "dub", year, detail.anilistId, detail.malId)

            val hasSub = (detail.subCount ?: 0) > 0 || ep.sub != null
            val hasDub = (detail.dubCount ?: 0) > 0 || ep.dub != null

            if (hasSub) {
                subEpisodes.add(newEpisode(subData) {
                    this.name = epTitle
                    this.episode = epNum
                    this.posterUrl = epThumb
                    this.description = epDesc
                })
            }
            if (hasDub) {
                dubEpisodes.add(newEpisode(dubData) {
                    this.name = epTitle
                    this.episode = epNum
                    this.posterUrl = epThumb
                    this.description = epDesc
                })
            }
        }

        Log.d("AniPm", "load $title: ${subEpisodes.size} sub, ${dubEpisodes.size} dub eps")

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

    // ─────────────────────────────────────────────────────────────
    // LOAD LINKS — the core source system
    // ─────────────────────────────────────────────────────────────

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // Data: $mainUrl|$title|$epNum|$type|$year|$anilistId|$malId
        val parts = data.split("|")
        if (parts.size < 4) {
            Log.d("AniPm", "loadLinks: bad data='$data'")
            return false
        }
        val title = parts[1]
        val epNum = parts[2]
        val type = parts[3]  // "sub" or "dub"
        val year = parts.getOrNull(4)?.takeIf { it.isNotBlank() }
        val anilistId = parts.getOrNull(5)?.takeIf { it.isNotBlank() }
        val malId = parts.getOrNull(6)?.takeIf { it.isNotBlank() }

        Log.d("AniPm", "loadLinks: title='$title' ep=$epNum type=$type year=$year alId=$anilistId malId=$malId")

        var found = false

        // ── PRIMARY: src/servers (Lyra, Halo, Cobalt, Orion, Onyx, Comet, Pulse, Nova) ──
        val srcParams = buildString {
            append("title=${java.net.URLEncoder.encode(title, "UTF-8")}")
            append("&ep=$epNum")
            if (year != null) append("&year=$year")
            if (anilistId != null) append("&anilistId=$anilistId")
            if (malId != null) append("&malId=$malId")
        }

        val srcResponse = try {
            app.get(
                "$mainUrl/api/anime/src/servers?$srcParams",
                headers = apiHeaders
            ).parsedSafe<SrcServersResponse>()
        } catch (e: Exception) {
            Log.d("AniPm", "src/servers error: ${e.message}")
            null
        }

        // Select the correct array based on the requested type (sub/dub).
        val sources = if (type == "dub") srcResponse?.dub else srcResponse?.sub
        Log.d("AniPm", "src/servers $type: ${sources?.size ?: 0} sources")

        sources?.forEach { src ->
            val resolvedUrl = resolveUrl(src.url)
            if (resolvedUrl.isEmpty()) return@forEach

            val subLabel = when (src.subtitle) {
                "hard" -> "Hardsub"
                "soft" -> "Soft Sub"
                else -> if (type == "dub") "Dub" else "Sub"
            }
            val audioLabel = src.audioLang?.let { ", ${it.uppercase()}" } ?: ""
            val label = "AniPm - ${src.name} ($subLabel$audioLabel)"

            when (src.kind) {
                "hls" -> {
                    // HLS streams work directly — no Referer, no headers needed.
                    // ExoPlayer resolves relative variant/segment URLs against the master URL origin.
                    callback(newExtractorLink(
                        source = name,
                        name = label,
                        url = resolvedUrl,
                        type = ExtractorLinkType.M3U8
                    ) {})
                    // Pass VTT subtitle tracks for soft-sub sources.
                    src.tracks?.forEach { track ->
                        val vttUrl = resolveUrl(track.url)
                        if (vttUrl.isNotEmpty()) {
                            subtitleCallback.invoke(SubtitleFile(track.label, vttUrl))
                        }
                    }
                    found = true
                }
                "file" -> {
                    // Direct video file — works for download.
                    callback(newExtractorLink(
                        source = name,
                        name = label,
                        url = resolvedUrl,
                        type = ExtractorLinkType.VIDEO
                    ) {})
                    found = true
                }
                "embed" -> {
                    // Embed sources (vivibebe.site, bibiemb.xyz, otakuhg.site, otakuvid.online)
                    // — same pattern as AniDao. Try loadExtractor first, then HTML m3u8 extraction.
                    try {
                        val loaded = loadExtractor(resolvedUrl, "$mainUrl/", subtitleCallback, callback)
                        if (loaded) {
                            found = true
                        } else {
                            val html = app.get(resolvedUrl, headers = mapOf("Referer" to "$mainUrl/")).text
                            val m3u8 = m3u8Regex.find(html)?.value
                            if (m3u8 != null) {
                                callback(newExtractorLink(
                                    source = name,
                                    name = label,
                                    url = m3u8,
                                    type = ExtractorLinkType.M3U8
                                ) {
                                    this.headers = mapOf("Referer" to resolvedUrl)
                                })
                                found = true
                            }
                        }
                    } catch (e: Exception) {
                        Log.d("AniPm", "embed resolve failed ${src.name}: ${e.message}")
                    }
                }
            }
        }

        // ── SECONDARY: AnimeGG MP4 downloads ──
        try {
            val animeggResponse = app.get(
                "$mainUrl/api/anime/animegg/sources?title=${java.net.URLEncoder.encode(title, "UTF-8")}&ep=$epNum&lang=$type",
                headers = apiHeaders
            ).parsedSafe<AnimeggResponse>()
            animeggResponse?.sources?.forEach { src ->
                val mp4Url = resolveUrl(src.url)
                if (mp4Url.isNotEmpty()) {
                    callback(newExtractorLink(
                        source = name,
                        name = "AniPm - AnimeGG (${type.replaceFirstChar { it.uppercase() }}, ${src.quality})",
                        url = mp4Url,
                        type = ExtractorLinkType.VIDEO
                    ) {})
                    found = true
                }
            }
        } catch (e: Exception) {
            Log.d("AniPm", "animegg error: ${e.message}")
        }

        Log.d("AniPm", "loadLinks $data type=$type: found=$found")
        return found
    }

    // ─────────────────────────────────────────────────────────────
    // HELPERS
    // ─────────────────────────────────────────────────────────────

    /**
     * Builds the episode data string: $mainUrl|$title|$epNum|$type|$year|$anilistId|$malId
     * Starts with https:// so CloudStream doesn't prepend mainUrl.
     */
    private fun buildEpisodeData(
        title: String,
        epNum: Int,
        type: String,
        year: Int?,
        anilistId: String?,
        malId: String?
    ): String {
        return buildString {
            append(mainUrl).append("|")
            append(title).append("|")
            append(epNum).append("|")
            append(type).append("|")
            append(year ?: "").append("|")
            append(anilistId ?: "").append("|")
            append(malId ?: "")
        }
    }

    /**
     * Resolves relative URLs (/api/anime/src/hls?t=...) to absolute (https://ani.pm/api/...).
     * Embed URLs are already absolute (https://vivibebe.site/...).
     */
    private fun resolveUrl(url: String): String {
        if (url.isEmpty()) return ""
        return if (url.startsWith("http")) url else "$mainUrl$url"
    }

    /**
     * Fixes poster URLs. The API sometimes returns relative paths like
     * "/api/anime/cover?anilistId=20" which need the mainUrl prefix.
     * AniList CDN URLs (s4.anilist.co) and other absolute URLs are returned as-is.
     */
    private fun fixPoster(url: String?): String? {
        if (url.isNullOrBlank()) return null
        return if (url.startsWith("http")) url else "$mainUrl$url"
    }
}
