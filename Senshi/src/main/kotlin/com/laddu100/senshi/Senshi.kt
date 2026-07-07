package com.laddu100.senshi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.INFER_TYPE
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.net.URLEncoder

// ════════════════════════════════════════════════════════════════════════════
//  Senshi.live — CloudStream Provider
//  ════════════════════════════════════════════════════════════════════════════
//
//  Site:        https://senshi.live
//  Backend:     Express.js REST API at https://senshi.live/*
//  CDN:         ninstream.com (Cloudflare-fronted nginx, signed-URL HLS)
//  ID System:   anime.id == MyAnimeList ID (clean cross-reference)
//
//  API Map:
//    POST /anime/filter                     {searchTerm, page, limit}  -> search/browse
//    GET  /anime/random                                                 -> random anime
//    GET  /anime/recently-added                                         -> recently added (array)
//    GET  /anime/upcoming                                               -> upcoming (array)
//    GET  /episode-embeds/latest-paginated?page=1&limit=24              -> latest episodes
//    GET  /episodes/{mal_id}                                            -> episode list (titles+filler+skiptimes)
//    GET  /episode-embeds/{mal_id}/{ep_num}                             -> stream URLs with status
//
//  Stream: direct m3u8 (H.264+AAC, 1080p/720p/360p). Needs Referer header.
//  Sub/Dub: each embed has a `status` field ("Dub"/"HardSub"/"Sub") for clean separation.
//
//  Logging: all logs tagged "Senshi". Filter with: adb logcat -s Senshi:* Senshi_CFBypass:*
// ════════════════════════════════════════════════════════════════════════════

class Senshi : MainAPI() {
    override var mainUrl = "https://senshi.live"
    override var name = "Senshi"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val TAG = "Senshi"

    // Mobile browser UA — senshi's CDN accepts requests with this + Referer
    private val ua =
        "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

    // Browser-fingerprint headers for the search POST (senshi checks Referer+Origin)
    private val searchHeaders = mapOf(
        "User-Agent" to ua,
        "Accept" to "application/json, text/plain, */*",
        "Accept-Language" to "en-US,en;q=0.5",
        "Content-Type" to "application/json",
        "Referer" to "$mainUrl/browse",
        "Origin" to mainUrl
    )

    // GET endpoints just need a UA + Referer (no CF challenge normally)
    private val getHeaders = mapOf(
        "User-Agent" to ua,
        "Accept" to "application/json, text/plain, */*",
        "Accept-Language" to "en-US,en;q=0.5",
        "Referer" to "$mainUrl/"
    )

    // ─── Sub/Dub availability cache ──────────────────────────────────────
    // Probes /episode-embeds/{malId}/1 once per anime, caches the result so
    // posters show accurate SUB/DUB badges. Key = malId, Value = (hasSub, hasDub).
    private val subDubCache = mutableMapOf<Int, Pair<Boolean, Boolean>>()
    private val subDubCacheMutex = Mutex()

    /**
     * Probe whether an anime has sub and/or dub streams available.
     * Uses cached result if available. Falls back to (true, false) on error.
     */
    private suspend fun probeSubDub(malId: Int): Pair<Boolean, Boolean> {
        subDubCacheMutex.withLock {
            subDubCache[malId]?.let { return it }
        }
        var hasSub = false
        var hasDub = false
        try {
            val res = cfGet("$mainUrl/episode-embeds/$malId/1", headers = getHeaders, timeout = 10_000L)
            if (res.code == 200) {
                val embeds = parseJson<List<StreamEmbed>>(res.text)
                Log.d(TAG, "probeSubDub($malId): ${embeds.size} embeds, statuses=${embeds.map { it.status }}")
                embeds.forEach { emb ->
                    val st = emb.status?.lowercase() ?: ""
                    when {
                        st.contains("dub") -> hasDub = true
                        st.contains("sub") || st.contains("hardsub") -> hasSub = true
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "probeSubDub($malId) failed: ${e.message}")
        }
        if (!hasSub && !hasDub) hasSub = true // fallback: assume sub exists
        val result = Pair(hasSub, hasDub)
        subDubCacheMutex.withLock {
            subDubCache[malId] = result
        }
        return result
    }

    /** Probe multiple anime IDs in parallel (fast — all concurrent). */
    private suspend fun probeSubDubBatch(malIds: List<Int>): Map<Int, Pair<Boolean, Boolean>> =
        coroutineScope {
            malIds.distinct().map { id ->
                async { id to probeSubDub(id) }
            }.awaitAll().toMap()
        }

    // ─── Homepage sections ────────────────────────────────────────────────
    override val mainPage = mainPageOf(
        Pair("recently-added", "Recently Added"),
        Pair("latest", "Latest Episodes"),
        Pair("upcoming", "Upcoming Anime"),
        Pair("random", "Random Picks")
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' data='${request.data}' page=$page")
        return try {
            when (request.data) {
                "recently-added" -> {
                    val res = cfGet("$mainUrl/anime/recently-added", headers = getHeaders)
                    Log.d(TAG, "getMainPage recently-added: HTTP ${res.code}, len=${res.text.length}")
                    val items = parseJson<List<AnimeItem>>(res.text)
                    val subDubMap = probeSubDubBatch(items.mapNotNull { it.id })
                    val home = items.mapNotNull { it.toSearchResponse(subDubMap[it.id]) }
                    Log.d(TAG, "getMainPage recently-added: ${home.size} items")
                    newHomePageResponse(request.name, home, hasNext = false)
                }

                "upcoming" -> {
                    val res = cfGet("$mainUrl/anime/upcoming", headers = getHeaders)
                    Log.d(TAG, "getMainPage upcoming: HTTP ${res.code}, len=${res.text.length}")
                    val items = parseJson<List<AnimeItem>>(res.text)
                    val subDubMap = probeSubDubBatch(items.mapNotNull { it.id })
                    val home = items.mapNotNull { it.toSearchResponse(subDubMap[it.id]) }
                    Log.d(TAG, "getMainPage upcoming: ${home.size} items")
                    newHomePageResponse(request.name, home, hasNext = false)
                }

                "latest" -> {
                    val limit = 24
                    val res = cfGet(
                        "$mainUrl/episode-embeds/latest-paginated?page=$page&limit=$limit",
                        headers = getHeaders
                    )
                    Log.d(TAG, "getMainPage latest: HTTP ${res.code}, len=${res.text.length}")
                    val resp = parseJson<LatestEpisodesResponse>(res.text)
                    val subDubMap = probeSubDubBatch(resp.data.mapNotNull { it.anime?.id })
                    val home = resp.data.mapNotNull { it.toSearchResponse(subDubMap[it.anime?.id]) }
                    Log.d(TAG, "getMainPage latest: ${home.size} items, total=${resp.total}")
                    newHomePageResponse(request.name, home, hasNext = page * limit < (resp.total ?: 0))
                }

                "random" -> {
                    // Fetch several random anime to fill the row
                    val items = mutableListOf<AnimeItem>()
                    repeat(20) {
                        try {
                            val r = cfGet("$mainUrl/anime/random", headers = getHeaders)
                            if (r.code == 200) {
                                items.add(parseJson<AnimeItem>(r.text))
                            }
                        } catch (e: Exception) {
                            Log.e(TAG, "getMainPage random fetch #$it failed: ${e.message}")
                        }
                    }
                    Log.d(TAG, "getMainPage random: ${items.size} items")
                    val subDubMap = probeSubDubBatch(items.mapNotNull { it.id })
                    val home = items.mapNotNull { it.toSearchResponse(subDubMap[it.id]) }
                    newHomePageResponse(request.name, home, hasNext = false)
                }

                else -> newHomePageResponse(request.name, emptyList(), hasNext = false)
            }
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage FAILED for '${request.name}': ${e.message}\n${e.stackTraceToString().take(600)}")
            newHomePageResponse(request.name, emptyList(), hasNext = false)
        }
    }

    // ─── Search ───────────────────────────────────────────────────────────
    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search START: query='$query'")
        if (query.isBlank()) {
            Log.d(TAG, "search: empty query, returning empty list")
            return emptyList()
        }
        return try {
            val encoded = query.replace("\"", "\\\"")
            val body = """{"searchTerm":"$encoded","page":1,"limit":30}"""
            Log.d(TAG, "search POST body=$body")
            val res = cfPost("$mainUrl/anime/filter", body = body, headers = searchHeaders)
            Log.d(TAG, "search Response: HTTP ${res.code}, len=${res.text.length}")
            Log.d(TAG, "search Body preview: ${res.text.take(300)}")
            if (res.code != 200 && res.code != 201) {
                Log.e(TAG, "search non-2xx response, returning empty")
                return emptyList()
            }
            val resp = parseJson<FilterResponse>(res.text)
            val subDubMap = probeSubDubBatch(resp.data.mapNotNull { it.id })
            val results = resp.data.mapNotNull { it.toSearchResponse(subDubMap[it.id]) }
            Log.d(TAG, "search Returning ${results.size} results for '$query'")
            results
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED for '$query': ${e.message}\n${e.stackTraceToString().take(500)}")
            emptyList()
        }
    }

    // ─── Load (anime details + episode list) ───────────────────────────────
    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load START: url=$url")
        // URL format: https://senshi.live/anime/{mal_id}?t={urlencoded_title}
        // The title is encoded by toSearchResponse() so we can search for metadata
        // (senshi has no GET /anime/{id} endpoint — the filter POST is the only way).
        val pathPart = url.substringBefore("?").substringAfterLast("/")
        val malId = pathPart.toIntOrNull()
        if (malId == null) {
            Log.e(TAG, "load: could not parse malId from url=$url")
            return null
        }
        val encodedTitle = try {
            url.substringAfter("?t=", "").let { java.net.URLDecoder.decode(it, "UTF-8") }
        } catch (e: Exception) { "" }
        Log.d(TAG, "load parsed malId=$malId, title='$encodedTitle'")

        // Step 1: Probe the first episode's embeds to determine available stream types.
        // This lets us show ONLY the Sub/Dub tabs that actually have content — no empty tabs.
        var hasSub = false
        var hasDub = false
        try {
            val probeRes = cfGet("$mainUrl/episode-embeds/$malId/1", headers = getHeaders)
            Log.d(TAG, "load probe embeds: HTTP ${probeRes.code}, len=${probeRes.text.length}")
            if (probeRes.code == 200) {
                val probeEmbeds = parseJson<List<StreamEmbed>>(probeRes.text)
                Log.d(TAG, "load probe: ${probeEmbeds.size} embeds, statuses=${probeEmbeds.map { it.status }}")
                probeEmbeds.forEach { emb ->
                    val st = emb.status?.lowercase() ?: ""
                    when {
                        st.contains("dub") -> hasDub = true
                        st.contains("sub") || st.contains("hardsub") -> hasSub = true
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "load probe failed (will assume sub-only): ${e.message}")
        }
        Log.d(TAG, "load probe result: hasSub=$hasSub, hasDub=$hasDub")
        // Fallback: if probe failed entirely, assume sub exists
        if (!hasSub && !hasDub) {
            hasSub = true
            Log.d(TAG, "load: probe found nothing, defaulting to hasSub=true")
        }
        // Cache the probe result so search/homepage posters show accurate badges
        subDubCacheMutex.withLock {
            subDubCache[malId] = Pair(hasSub, hasDub)
        }

        // Step 2: Get full episode list (with titles + filler markers)
        val episodesText = try {
            val r = cfGet("$mainUrl/episodes/$malId", headers = getHeaders)
            Log.d(TAG, "load episodes: HTTP ${r.code}, len=${r.text.length}")
            r.text
        } catch (e: Exception) {
            Log.e(TAG, "load episodes fetch FAILED: ${e.message}")
            return null
        }

        val allEpisodes = try {
            parseJson<List<EpisodeItem>>(episodesText)
        } catch (e: Exception) {
            Log.e(TAG, "load episodes JSON parse FAILED: ${e.message}")
            Log.e(TAG, "load episodes raw preview: ${episodesText.take(400)}")
            return null
        }
        Log.d(TAG, "load got ${allEpisodes.size} episodes from API")

        if (allEpisodes.isEmpty()) {
            Log.e(TAG, "load: no episodes found for malId=$malId")
            return null
        }

        // Step 3: Build sub and dub episode lists. The EpisodeData carries the
        // streamType so loadLinks knows which embeds to return.
        val subEps = mutableListOf<Episode>()
        val dubEps = mutableListOf<Episode>()
        allEpisodes.sortedBy { it.ep_id }.forEach { ep ->
            val num = ep.ep_id ?: return@forEach
            val title = ep.ep_title?.takeIf { it.isNotBlank() } ?: "Episode $num"
            if (hasSub) {
                val data = SenshiEpData(malId, num, "sub").toJson()
                subEps.add(newEpisode(data) {
                    this.episode = num
                    this.name = title
                    if (ep.ep_filler == true) this.episode = num // keep number; filler noted in name
                })
            }
            if (hasDub) {
                val data = SenshiEpData(malId, num, "dub").toJson()
                dubEps.add(newEpisode(data) {
                    this.episode = num
                    this.name = title
                })
            }
        }
        Log.d(TAG, "load built ${subEps.size} sub episodes and ${dubEps.size} dub episodes")

        // Step 4: Fetch anime metadata via title search. Senshi has no GET /anime/{id}
        // endpoint, so we POST /anime/filter with the title (encoded in the load URL by
        // toSearchResponse()) and find the matching anime by mal_id. This gives us
        // poster, plot, year, genres, score, and type — everything CS needs.
        var meta: AnimeItem? = null
        if (encodedTitle.isNotBlank()) {
            try {
                val safeTitle = encodedTitle.replace("\"", "\\\"")
                val body = """{"searchTerm":"$safeTitle","page":1,"limit":10}"""
                Log.d(TAG, "load meta search POST body=$body")
                val metaRes = cfPost("$mainUrl/anime/filter", body = body, headers = searchHeaders)
                Log.d(TAG, "load meta search: HTTP ${metaRes.code}, len=${metaRes.text.length}")
                if (metaRes.code == 200 || metaRes.code == 201) {
                    val resp = parseJson<FilterResponse>(metaRes.text)
                    // Find the exact anime by mal_id (title search may return multiple)
                    meta = resp.data.firstOrNull { it.id == malId }
                    if (meta == null && resp.data.isNotEmpty()) {
                        // Fallback: use the first result if id match fails
                        meta = resp.data[0]
                        Log.d(TAG, "load meta: id match not found, using first result (id=${meta?.id ?: "null"})")
                    }
                    Log.d(TAG, "load meta found: title=${meta?.title}, type=${meta?.type}, year=${meta?.ani_year}")
                }
            } catch (e: Exception) {
                Log.e(TAG, "load meta search failed: ${e.message}")
            }
        } else {
            Log.d(TAG, "load: no title in URL, skipping metadata fetch")
        }

        // Determine TV type. For movies with both sub+dub, use TvType.Anime so the
        // sub/dub selector appears (AnimeMovie hides the selector).
        val aniType = meta?.type?.uppercase() ?: "TV"
        val baseType = when (aniType) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL" -> TvType.OVA
            else -> TvType.Anime
        }
        val finalType = if (baseType == TvType.AnimeMovie && hasDub && hasSub) TvType.Anime else baseType
        Log.d(TAG, "load type: aniType=$aniType, baseType=$baseType, finalType=$finalType")

        val title = meta?.title ?: meta?.title_english ?: "Anime $malId"
        val year = meta?.ani_year ?: meta?.airing_date?.substringBefore(",")?.trim()
            ?.substringAfterLast(" ")?.toIntOrNull()
        val poster = meta?.posterUrl()
        val plot = meta?.ani_description

        return newAnimeLoadResponse(title, url, finalType) {
            this.posterUrl = poster
            this.plot = plot
            this.year = year
            this.tags = meta?.genresList()
            if (meta?.score != null) this.score = Score.from10(meta.score.toString())
            if (subEps.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEps)
            if (dubEps.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEps)
        }
    }

    // ─── Load Links (streams) ─────────────────────────────────────────────
    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START: data=$data")
        val epData = try {
            parseJson<SenshiEpData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: failed to parse SenshiEpData: ${e.message}")
            return false
        }
        Log.d(TAG, "loadLinks: malId=${epData.malId}, epNum=${epData.epNum}, streamType=${epData.streamType}")

        // Fetch fresh embeds (token is time-limited, so always get a fresh URL)
        val embedsText = try {
            val r = cfGet("$mainUrl/episode-embeds/${epData.malId}/${epData.epNum}", headers = getHeaders)
            Log.d(TAG, "loadLinks embeds: HTTP ${r.code}, len=${r.text.length}")
            r.text
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks embeds fetch FAILED: ${e.message}")
            return false
        }

        val embeds = try {
            parseJson<List<StreamEmbed>>(embedsText)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks embeds JSON parse FAILED: ${e.message}")
            Log.e(TAG, "loadLinks embeds raw preview: ${embedsText.take(400)}")
            return false
        }
        Log.d(TAG, "loadLinks got ${embeds.size} embeds: ${embeds.map { it.status }}")

        // Filter embeds by the requested stream type. This is the CLEAN sub/dub separation:
        // - streamType "sub" -> only embeds with status Sub/HardSub
        // - streamType "dub" -> only embeds with status Dub
        val targetStreamType = epData.streamType.lowercase()
        val matching = embeds.filter { emb ->
            val st = emb.status?.lowercase() ?: ""
            when (targetStreamType) {
                "dub" -> st.contains("dub")
                "sub" -> st.contains("sub") || st.contains("hardsub")
                else -> true
            }
        }
        Log.d(TAG, "loadLinks: streamType='$targetStreamType' -> ${matching.size} matching embeds")

        if (matching.isEmpty()) {
            Log.e(TAG, "loadLinks: NO embeds match streamType='$targetStreamType'")
            // Last resort: if the requested type has no embeds, return ALL embeds
            // so the user at least gets something. (Shouldn't happen due to load() probe.)
            Log.d(TAG, "loadLinks: falling back to ALL embeds")
            embeds.forEach { addEmbedLink(it, callback) }
            return embeds.isNotEmpty()
        }

        matching.forEach { addEmbedLink(it, callback) }
        Log.d(TAG, "loadLinks END: returned ${matching.size} links")
        return true
    }

    // Helper: convert a StreamEmbed into ExtractorLink(s). Uses M3u8Helper to
    // parse the master playlist and emit one link per quality (1080p/720p/360p).
    private suspend fun addEmbedLink(embed: StreamEmbed, callback: (ExtractorLink) -> Unit) {
        val streamUrl = embed.url ?: return
        val status = embed.status ?: "Unknown"
        Log.d(TAG, "addEmbedLink: status=$status, url=$streamUrl")

        // Play headers — the ninstream.com CDN REQUIRES Referer: https://senshi.live/
        val playHeaders = mapOf(
            "User-Agent" to ua,
            "Referer" to "$mainUrl/",
            "Origin" to mainUrl,
            "Accept" to "*/*",
            "Accept-Language" to "en-US,en;q=0.5"
        )

        if (streamUrl.contains(".m3u8", ignoreCase = true)) {
            try {
                val label = "$name $status"
                Log.d(TAG, "addEmbedLink: parsing m3u8 with M3u8Helper for '$label'")
                val links = M3u8Helper.generateM3u8(label, streamUrl, "$mainUrl/", headers = playHeaders)
                Log.d(TAG, "addEmbedLink: M3u8Helper produced ${links.size} quality links")
                links.forEach(callback)
            } catch (e: Exception) {
                Log.e(TAG, "addEmbedLink: M3u8Helper failed for $streamUrl: ${e.message}, adding raw link")
                callback.invoke(
                    newExtractorLink("$name $status", "$name $status", streamUrl, type = ExtractorLinkType.M3U8) {
                        this.referer = "$mainUrl/"
                        this.headers = playHeaders
                    }
                )
            }
        } else {
            // Non-m3u8 (mp4 etc.) — add directly
            Log.d(TAG, "addEmbedLink: non-m3u8 stream, adding INFER_TYPE link")
            callback.invoke(
                newExtractorLink("$name $status", "$name $status", streamUrl, type = INFER_TYPE) {
                    this.referer = "$mainUrl/"
                    this.headers = playHeaders
                }
            )
        }
    }

    // ─── Helpers ──────────────────────────────────────────────────────────

    private fun AnimeItem.toSearchResponse(subDub: Pair<Boolean, Boolean>? = null): SearchResponse? {
        val id = this.id ?: return null
        val title = this.title ?: this.title_english ?: return null
        // Encode the title in the URL so load() can search for full metadata
        // (senshi has no GET /anime/{id} endpoint — title search is the only way).
        val encodedTitle = try { URLEncoder.encode(title, "UTF-8") } catch (e: Exception) { "" }
        val loadUrl = "$mainUrl/anime/$id?t=$encodedTitle"
        val (hasSub, hasDub) = subDub ?: Pair(true, false)
        return newAnimeSearchResponse(title, loadUrl, TvType.Anime) {
            this.posterUrl = posterUrl()
            addDubStatus(dubExist = hasDub, subExist = hasSub)
        }
    }

    private fun AnimeItem.posterUrl(): String? {
        val pic = anime_picture ?: return null
        return if (pic.startsWith("http")) pic else "$mainUrl$pic"
    }

    private fun AnimeItem.genresList(): List<String>? {
        val g = genres ?: return null
        return if (g.isBlank()) null else g.split(",").map { it.trim() }.filter { it.isNotBlank() }
    }

    private fun LatestEpisodeItem.toSearchResponse(subDub: Pair<Boolean, Boolean>? = null): SearchResponse? {
        val anime = this.anime ?: return null
        val id = anime.id ?: return null
        val title = anime.title ?: anime.title_english ?: return null
        // Encode title for load() metadata fetch (same as AnimeItem.toSearchResponse)
        val encodedTitle = try { URLEncoder.encode(title, "UTF-8") } catch (e: Exception) { "" }
        val loadUrl = "$mainUrl/anime/$id?t=$encodedTitle"
        val (hasSub, hasDub) = subDub ?: Pair(true, false)
        return newAnimeSearchResponse(title, loadUrl, TvType.Anime) {
            this.posterUrl = anime.posterUrl()
            addDubStatus(dubExist = hasDub, subExist = hasSub)
        }
    }

    // ─── Data classes (matching senshi's API responses) ───────────────────

    /** Per-episode payload stored in EpisodeData for loadLinks. */
    data class SenshiEpData(
        val malId: Int,
        val epNum: Int,
        val streamType: String // "sub" or "dub"
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class FilterResponse(
        val data: List<AnimeItem> = emptyList(),
        val total: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeItem(
        val id: Int? = null,
        val public_id: String? = null,
        val anime_picture: String? = null,
        val trailer: String? = null,
        val title: String? = null,
        val title_english: String? = null,
        val synonyms: String? = null,
        val type: String? = null,
        val ani_source: String? = null,
        val ani_episodes: String? = null,
        val ani_status: String? = null,
        val airing_date: String? = null,
        val duration: String? = null,
        val rating: String? = null,
        val score: Double? = null,
        val scored_by: Int? = null,
        val ani_description: String? = null,
        val ani_season: String? = null,
        val ani_year: Int? = null,
        val genres: String? = null,
        val relations: Map<String, List<Int>>? = null,
        val producers: String? = null,
        val studios: String? = null,
        val tvdb_id: String? = null,
        val version: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeItem(
        val id: Int? = null,
        val ep_id: Int? = null,
        val mal_id: Int? = null,
        val ep_title: String? = null,
        val ep_filler: Boolean? = null,
        val ep_recap: Boolean? = null,
        val intro_start: String? = null,
        val intro_end: String? = null,
        val outro_start: String? = null,
        val outro_end: String? = null,
        val created_at: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamEmbed(
        val url: String? = null,
        val server2: String? = null,
        val serverFM: String? = null,
        val download: String? = null,
        val status: String? = null,
        val masked_base_url: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class LatestEpisodesResponse(
        val data: List<LatestEpisodeItem> = emptyList(),
        val total: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class LatestEpisodeItem(
        val id: Int? = null,
        val anime: AnimeItem? = null,
        val episode: EpisodeItem? = null,
        val created_at: String? = null
    )
}
