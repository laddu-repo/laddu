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
import java.net.URLEncoder

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
    private val megaplayPrefix = "https://megaplay.buzz/stream/"

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

    // src/servers response (Lyra, Halo, Cobalt, Orion, Onyx, Comet, Pulse, Nova)
    private data class SrcServersResponse(
        val sub: List<SrcSource> = emptyList(),
        val dub: List<SrcSource> = emptyList()
    )

    private data class SrcSource(
        val provider: String = "",
        val name: String = "",
        val kind: String = "hls",
        val url: String = "",
        val priority: Int = 0,
        val subtitle: String? = null,
        val tracks: List<SubtitleTrack>? = null,
        val audioLang: String? = null,
        val resolvable: Boolean? = null
    )

    private data class SubtitleTrack(
        val url: String = "",
        val label: String = "English",
        val default: Boolean = false
    )

    // ep-servers response (Zephyr: VidPlay-1, HD-1, Vidstream-2, VidCloud-1)
    private data class EpServersResponse(
        val servers: List<EpServer> = emptyList()
    )

    private data class EpServer(
        val id: String = "",
        val name: String = "",
        val type: String = "sub"  // sub or dub
    )

    // ep-direct response (Zephyr HLS resolution)
    private data class EpDirectResponse(
        val m3u8: String? = null,
        val embed: String? = null,
        val tracks: List<SubtitleTrack>? = null
    )

    // mega/sources response (Helios Direct HLS)
    private data class MegaSourcesResponse(
        val m3u8: String? = null,
        val tracks: List<SubtitleTrack>? = null
    )

    // pahe/find response (Drift)
    private data class PaheFindResponse(
        val sources: List<PaheSource> = emptyList()
    )

    private data class PaheSource(
        val kwik: String = "",
        val quality: String = "",
        val audio: String = "jpn"  // jpn = sub, eng = dub
    )

    // pahe/resolve response (Drift kwik resolution)
    private data class PaheResolveResponse(
        val url: String? = null
    )

    // animegg response
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
                "$mainUrl/api/anime/search?q=${URLEncoder.encode(query, "UTF-8")}",
                headers = apiHeaders
            ).parsedSafe<SearchResponseData>()
        } catch (e: Exception) {
            Log.d("AniPm", "search '$query' error: ${e.message}")
            return emptyList()
        }

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

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        for (ep in detail.episodes) {
            val epNum = ep.number
            val epTitle = ep.title?.takeIf { it.isNotBlank() }
            val epThumb = fixPoster(ep.thumbnail)
            val epDesc = ep.description?.takeIf { it.isNotBlank() }

            // Data string encodes everything loadLinks needs:
            // $mainUrl|$seriesId|$title|$epNum|$type|$year|$anilistId|$malId|$subUrl|$dubUrl
            // subUrl/dubUrl = megaplay.buzz stream URLs (for Helios Direct megaPath)
            val subData = buildEpisodeData(
                seriesId, title, epNum, "sub", year,
                detail.anilistId, detail.malId, ep.sub, ep.dub
            )
            val dubData = buildEpisodeData(
                seriesId, title, epNum, "dub", year,
                detail.anilistId, detail.malId, ep.sub, ep.dub
            )

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
    // LOAD LINKS — 6 source systems, all with sub/dub separation
    // ─────────────────────────────────────────────────────────────

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // Data: $mainUrl|$seriesId|$title|$epNum|$type|$year|$anilistId|$malId|$subUrl|$dubUrl
        val parts = data.split("|")
        if (parts.size < 5) {
            Log.d("AniPm", "loadLinks: bad data='$data'")
            return false
        }
        val seriesId = parts[1]
        val title = parts[2]
        val epNum = parts[3]
        val type = parts[4]  // "sub" or "dub"
        val year = parts.getOrNull(5)?.takeIf { it.isNotBlank() }
        val anilistId = parts.getOrNull(6)?.takeIf { it.isNotBlank() }
        val malId = parts.getOrNull(7)?.takeIf { it.isNotBlank() }
        val subUrl = parts.getOrNull(8)?.takeIf { it.isNotBlank() }
        val dubUrl = parts.getOrNull(9)?.takeIf { it.isNotBlank() }

        Log.d("AniPm", "loadLinks: title='$title' ep=$epNum type=$type")

        var found = false

        // ── 1. HELIOS DIRECT (mega/sources) — HLS with soft subs ──
        // Uses the episode's sub/dub megaplay URL to get a direct HLS stream.
        val megaUrl = if (type == "dub") dubUrl else subUrl
        if (megaUrl != null && megaUrl.contains("megaplay.buzz/stream/")) {
            val megaPath = megaUrl.removePrefix(megaplayPrefix)
            try {
                val megaResp = app.get(
                    "$mainUrl/api/anime/mega/sources?path=${URLEncoder.encode(megaPath, "UTF-8")}",
                    headers = apiHeaders
                ).parsedSafe<MegaSourcesResponse>()
                if (megaResp?.m3u8 != null) {
                    val hlsUrl = resolveUrl(megaResp.m3u8)
                    callback(newExtractorLink(
                        source = name,
                        name = "AniPm - Helios · Direct (${type.replaceFirstChar { it.uppercase() }}, Soft Sub)",
                        url = hlsUrl,
                        type = ExtractorLinkType.M3U8
                    ) {})
                    megaResp.tracks?.forEach { track ->
                        val vttUrl = resolveUrl(track.url)
                        if (vttUrl.isNotEmpty()) {
                            subtitleCallback.invoke(SubtitleFile(track.label, vttUrl))
                        }
                    }
                    found = true
                    Log.d("AniPm", "Helios Direct: OK")
                }
            } catch (e: Exception) {
                Log.d("AniPm", "Helios Direct error: ${e.message}")
            }
        }

        // ── 2. ZEPHYR (ep-servers → ep-direct) — 4 HLS sources with soft subs ──
        // ep-servers returns VidPlay-1, HD-1, Vidstream-2, VidCloud-1 for sub and dub.
        // Each is resolved via ep-direct to get an HLS m3u8 URL.
        try {
            val epServersResp = app.get(
                "$mainUrl/api/anime/ep-servers/$seriesId/$epNum",
                headers = apiHeaders
            ).parsedSafe<EpServersResponse>()
            val zephyrServers = epServersResp?.servers?.filter { it.type == type }
            Log.d("AniPm", "Zephyr ep-servers $type: ${zephyrServers?.size ?: 0} servers")
            zephyrServers?.forEach { server ->
                try {
                    val encId = URLEncoder.encode(server.id, "UTF-8")
                    val directResp = app.get(
                        "$mainUrl/api/anime/ep-direct?id=$encId",
                        headers = apiHeaders
                    ).parsedSafe<EpDirectResponse>()
                    if (directResp?.m3u8 != null) {
                        val hlsUrl = resolveUrl(directResp.m3u8)
                        val variant = if (server.name.startsWith("HD", ignoreCase = true)) "HD" else "Direct"
                        callback(newExtractorLink(
                            source = name,
                            name = "AniPm - Zephyr · $variant (${type.replaceFirstChar { it.uppercase() }}, ${server.name}, Soft Sub)",
                            url = hlsUrl,
                            type = ExtractorLinkType.M3U8
                        ) {})
                        directResp.tracks?.forEach { track ->
                            val vttUrl = resolveUrl(track.url)
                            if (vttUrl.isNotEmpty()) {
                                subtitleCallback.invoke(SubtitleFile(track.label, vttUrl))
                            }
                        }
                        found = true
                    }
                } catch (e: Exception) {
                    Log.d("AniPm", "Zephyr ${server.name} error: ${e.message}")
                }
            }
        } catch (e: Exception) {
            Log.d("AniPm", "Zephyr ep-servers error: ${e.message}")
        }

        // ── 3. DRIFT (pahe/find → pahe/resolve) — HLS hardsub for sub, raw for dub ──
        // pahe/find returns kwik sources with audio field (jpn=sub, eng=dub).
        // pahe/resolve converts kwik URL to a master m3u8.
        try {
            val paheParams = buildString {
                append("title=${URLEncoder.encode(title, "UTF-8")}")
                append("&ep=$epNum")
                if (year != null) append("&year=$year")
            }
            val paheResp = app.get(
                "$mainUrl/api/anime/pahe/find?$paheParams",
                headers = apiHeaders
            ).parsedSafe<PaheFindResponse>()
            // Filter by audio: jpn = sub, eng = dub
            val paheSources = paheResp?.sources?.filter {
                val isDub = it.audio.equals("eng", ignoreCase = true)
                isDub == (type == "dub")
            }
            Log.d("AniPm", "Drift pahe/find $type: ${paheSources?.size ?: 0} sources")
            paheSources?.forEach { src ->
                try {
                    val encKwik = URLEncoder.encode(src.kwik, "UTF-8")
                    val resolveResp = app.get(
                        "$mainUrl/api/anime/pahe/resolve?kwik=$encKwik",
                        headers = apiHeaders
                    ).parsedSafe<PaheResolveResponse>()
                    if (resolveResp?.url != null) {
                        val masterUrl = resolveUrl(resolveResp.url)
                        val subLabel = if (type == "dub") "Dub" else "Hardsub"
                        callback(newExtractorLink(
                            source = name,
                            name = "AniPm - Drift · ${src.quality}p (${type.replaceFirstChar { it.uppercase() }}, $subLabel)",
                            url = masterUrl,
                            type = ExtractorLinkType.M3U8
                        ) {})
                        found = true
                    }
                } catch (e: Exception) {
                    Log.d("AniPm", "Drift ${src.quality}p error: ${e.message}")
                }
            }
        } catch (e: Exception) {
            Log.d("AniPm", "Drift pahe/find error: ${e.message}")
        }

        // ── 4. SRC/SERVERS (Lyra, Halo, Cobalt, Orion, Onyx, Comet, Pulse, Nova) ──
        // 37 sub + 13 dub sources. HLS + file + embed kinds.
        val srcParams = buildString {
            append("title=${URLEncoder.encode(title, "UTF-8")}")
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
                    callback(newExtractorLink(
                        source = name,
                        name = label,
                        url = resolvedUrl,
                        type = ExtractorLinkType.M3U8
                    ) {})
                    src.tracks?.forEach { track ->
                        val vttUrl = resolveUrl(track.url)
                        if (vttUrl.isNotEmpty()) {
                            subtitleCallback.invoke(SubtitleFile(track.label, vttUrl))
                        }
                    }
                    found = true
                }
                "file" -> {
                    callback(newExtractorLink(
                        source = name,
                        name = label,
                        url = resolvedUrl,
                        type = ExtractorLinkType.VIDEO
                    ) {})
                    found = true
                }
                "embed" -> {
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

        // ── 5. ANIMEGG — MP4 downloads (sub + dub) ──
        try {
            val animeggResponse = app.get(
                "$mainUrl/api/anime/animegg/sources?title=${URLEncoder.encode(title, "UTF-8")}&ep=$epNum&lang=$type",
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

        Log.d("AniPm", "loadLinks title='$title' ep=$epNum type=$type: found=$found")
        return found
    }

    // ─────────────────────────────────────────────────────────────
    // HELPERS
    // ─────────────────────────────────────────────────────────────

    /**
     * Builds the episode data string:
     * $mainUrl|$seriesId|$title|$epNum|$type|$year|$anilistId|$malId|$subUrl|$dubUrl
     * Starts with https:// so CloudStream doesn't prepend mainUrl.
     * subUrl/dubUrl are megaplay.buzz stream URLs (for Helios Direct megaPath).
     */
    private fun buildEpisodeData(
        seriesId: Int,
        title: String,
        epNum: Int,
        type: String,
        year: Int?,
        anilistId: String?,
        malId: String?,
        subUrl: String?,
        dubUrl: String?
    ): String {
        return buildString {
            append(mainUrl).append("|")
            append(seriesId).append("|")
            append(title).append("|")
            append(epNum).append("|")
            append(type).append("|")
            append(year ?: "").append("|")
            append(anilistId ?: "").append("|")
            append(malId ?: "").append("|")
            append(subUrl ?: "").append("|")
            append(dubUrl ?: "")
        }
    }

    /**
     * Resolves relative URLs (/api/anime/src/hls?t=...) to absolute.
     * Embed URLs are already absolute (https://vivibebe.site/...).
     */
    private fun resolveUrl(url: String): String {
        if (url.isEmpty()) return ""
        return if (url.startsWith("http")) url else "$mainUrl$url"
    }

    /**
     * Fixes poster URLs. Relative paths get mainUrl prefix.
     */
    private fun fixPoster(url: String?): String? {
        if (url.isNullOrBlank()) return null
        return if (url.startsWith("http")) url else "$mainUrl$url"
    }
}
