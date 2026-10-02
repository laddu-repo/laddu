package com.laddu100

import com.fasterxml.jackson.databind.JsonNode
import com.lagradost.api.Log
import com.lagradost.cloudstream3.DubStatus
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.Episode
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.LoadResponse.Companion.addAniListId
import com.lagradost.cloudstream3.LoadResponse.Companion.addMalId
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.MainPageData
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.Score
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.ShowStatus
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.addDubStatus
import com.lagradost.cloudstream3.addEpisodes
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newAnimeLoadResponse
import com.lagradost.cloudstream3.newAnimeSearchResponse
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.newMovieLoadResponse
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.newExtractorLink
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import java.util.concurrent.ConcurrentHashMap

/**
 * Xanime.me provider.
 *
 * 100% API driven (the site is a Qwik app with an AES-GCM encrypted GraphQL backend,
 * see XanimeApi for the full reverse-engineering notes):
 *
 *  - search / home      -> get_q27 (SearchAnime_Select)
 *  - details            -> get_q02 (anime node: AniList id, MAL id, genres, studios, sub/dub counts)
 *  - episodes           -> get_q01 (paged 60/page, fetched in parallel; carries per-episode
 *                          sourcesNode_list with a "sub" and a "dub" sou_id)
 *  - links + subtitles  -> get_q07 (sourcesNode_list: signed HLS master + per-language VTT tracks)
 *  - real episode names -> AniList streamingEpisodes (matched by the site's own al_id field)
 *
 * Sub/dub separation is structural, matching how CloudStream models it:
 *  - newAnimeLoadResponse + addEpisodes(DubStatus.Subbed, ...) / addEpisodes(DubStatus.Dubbed, ...)
 *    -> the app renders proper Sub / Dub episode tabs
 *  - each episode's data encodes which language track set it belongs to, so loadLinks only
 *    emits links (and subtitles) of that language
 *  - search results carry addDubStatus(dubExist, subExist) from the site's own sou_types
 *  - movies (single-episode) get both SUB and DUB links in one list, sources named
 *    "Xanime SUB • <server>" / "Xanime DUB • <server>", subtitles labelled "... • SUB/DUB"
 */
class XanimeProvider : MainAPI() {

    override var mainUrl = XanimeApi.MAIN_URL
    override var name = "Xanime"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(
        TvType.Anime,
        TvType.AnimeMovie,
        TvType.OVA,
        TvType.Movie,
        TvType.TvSeries,
    )

    private val TAG = "Xanime"

    private val playHeaders = mapOf(
        "User-Agent" to USER_AGENT,
        "Origin" to XanimeApi.MAIN_URL,
        "Referer" to "${XanimeApi.MAIN_URL}/",
    )

    companion object {
        const val USER_AGENT =
            "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

        // The site's own episode list API caps a single page at 60 items (verified live:
        // One Piece, 1180 episodes, size=1300 returned exactly 60 + paging.pages=11).
        private const val EPISODE_PAGE_SIZE = 60
        private const val MAX_EPISODE_PAGES = 40

        private const val SEARCH_PAGE_SIZE = 24

        // AniList GraphQL (public, keyless) — the site itself mirrors AniList metadata.
        private const val ANILIST_URL = "https://graphql.anilist.co"

        /** "Episode 12 - Giant Stepping" -> "Giant Stepping" ; "Episode 12" -> null */
        fun anilistEpisodeName(raw: String?): String? {
            if (raw.isNullOrBlank()) return null
            val idx = raw.indexOf(" - ")
            if (idx <= 0) return null
            val name = raw.substring(idx + 3).trim()
            return name.takeIf { it.isNotEmpty() && !it.equals(raw.trim(), true) }
        }
    }

    // ---------------- home page ----------------

    // Row keys -> verified SearchAnime_Select filters (all tested live):
    //  sortby: field_update / field_score, type: TV/Movie, sources: dub/sub
    override val mainPage: List<MainPageData> = mainPageOf(
        "field_update" to "Recently Updated",
        "field_score" to "Top Rated",
        "movie_score" to "Popular Movies",
        "dub" to "Dubbed Anime",
        "tv" to "TV Series",
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val select: Map<String, Any?> = when (request.data) {
            "field_update" -> mapOf("sortby" to "field_update", "page" to page, "size" to SEARCH_PAGE_SIZE)
            "field_score" -> mapOf("sortby" to "field_score", "page" to page, "size" to SEARCH_PAGE_SIZE)
            "movie_score" -> mapOf("type" to "Movie", "sortby" to "field_score", "page" to page, "size" to SEARCH_PAGE_SIZE)
            "dub" -> mapOf("sources" to "dub", "page" to page, "size" to SEARCH_PAGE_SIZE)
            "tv" -> mapOf("type" to "TV", "page" to page, "size" to SEARCH_PAGE_SIZE)
            else -> mapOf("sortby" to "field_update", "page" to page, "size" to SEARCH_PAGE_SIZE)
        }
        val items = queryListing(select)
        val hasNext = items.size >= SEARCH_PAGE_SIZE
        return newHomePageResponse(request.name, items, hasNext = hasNext)
    }

    // ---------------- search ----------------

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        val items = queryListing(
            mapOf("word" to query.trim(), "page" to 1, "size" to SEARCH_PAGE_SIZE)
        )
        // Nudge exact-title matches to the top (the site's relevance search is fuzzy)
        val q = query.trim().lowercase()
        return items.sortedByDescending {
            val title = it.name.lowercase()
            when {
                title == q -> 3
                title.startsWith(q) -> 2
                title.contains(q) -> 1
                else -> 0
            }
        }
    }

    override suspend fun quickSearch(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        return queryListing(
            mapOf("word" to query.trim(), "page" to 1, "size" to 10)
        )
    }

    private suspend fun queryListing(select: Map<String, Any?>): List<SearchResponse> {
        val data = XanimeApi.gql(XanimeApi.searchQuery(), mapOf("select" to select)) ?: return emptyList()
        val result = XanimeApi.obj(data.get("get_q27")) ?: return emptyList()
        val items = XanimeApi.arr(result.get("items")) ?: return emptyList()
        return items.mapNotNull { node -> node.toSearchResponse() }
    }

    private fun JsonNode.toSearchResponse(): SearchResponse? {
        val d = get("data") ?: return null
        val aniId = XanimeApi.text(d, "ani_id") ?: return null
        val title = XanimeApi.text(d, "info_title") ?: return null
        val poster = XanimeApi.text(d, "urlCover600")
        val year = XanimeApi.int(d, "info_meta_year")
        val souTypes = XanimeApi.strList(d, "info_sou_types")
        val metaType = XanimeApi.strList(d, "info_meta_type").firstOrNull()
        val tvType = mapTvType(metaType, XanimeApi.int(d, "ep_total"))
        return newAnimeSearchResponse(title, "$mainUrl/title/$aniId", tvType) {
            this.posterUrl = poster
            this.year = year
            addDubStatus(dubExist = souTypes.contains("dub"), subExist = souTypes.contains("sub"))
        }
    }

    private fun mapTvType(metaType: String?, epTotal: Int?): TvType = when (metaType?.uppercase()) {
        "MOVIE" -> TvType.AnimeMovie
        "OVA" -> TvType.OVA
        else -> if ((epTotal ?: 0) <= 1 && metaType?.uppercase() == "MOVIE") TvType.AnimeMovie else TvType.Anime
    }

    // ---------------- details ----------------

    override suspend fun load(url: String): LoadResponse? {
        // URLs are always "$mainUrl/title/<ani_id>" (or the site's "<ani_id>-<slug>" form)
        val aniId = url.substringAfterLast("/").substringBefore("-").takeIf { it.isNotBlank() }
            ?: return null

        val data = XanimeApi.gql(
            XanimeApi.detailsQuery(),
            mapOf("getAnimesNodeId" to aniId)
        ) ?: return null
        val node = XanimeApi.obj(data.get("get_q02")) ?: return null
        val d = node.get("data") ?: return null

        val title = XanimeApi.text(d, "info_title") ?: return null
        val poster = XanimeApi.text(d, "urlCoverOri") ?: XanimeApi.text(d, "urlCover600")
        val background = XanimeApi.text(d, "bgimg_url")
        val plot = XanimeApi.text(d, "info_filmdesc")
        val genres = XanimeApi.strList(d, "info_meta_genre")
        val studios = XanimeApi.strList(d, "info_meta_studios")
        val year = XanimeApi.text(d, "info_meta_year")?.toIntOrNull()
        val season = XanimeApi.text(d, "info_meta_season") // e.g. "Fall 2022"
        val statusText = XanimeApi.text(d, "info_meta_status")
        val metaTypes = XanimeApi.strList(d, "info_meta_type")
        val souTypes = XanimeApi.strList(d, "info_sou_types")
        val epTotal = XanimeApi.int(d, "ep_total")
            ?: XanimeApi.int(d, "info_meta_episodeCount")
            ?: 1
        val scoreVal = XanimeApi.int(d, "info_meta_scores") // 0..100 (81 == 8.1/10)
        val malId = XanimeApi.text(d, "ani_id_mal")?.takeIf { it.isNotBlank() }
        val alId = XanimeApi.text(d, "al_id")?.takeIf { it.isNotBlank() }

        val tvType = mapTvType(metaTypes.firstOrNull(), epTotal)
        val isMovie = tvType == TvType.AnimeMovie || epTotal <= 1

        // ---- episodes (parallel page fetch) + real names from AniList ----
        val episodeList = fetchAllEpisodes(aniId, epTotal)
        val realTitles: Map<Int, String> = if (alId != null) {
            fetchAnilistEpisodeTitles(alId)
        } else {
            emptyMap()
        }

        fun buildEpisode(ep: JsonNode, lang: String): Episode? {
            val epId = XanimeApi.text(ep, "ep_id") ?: return null
            val index = XanimeApi.int(ep, "ep_index") ?: return null
            val subIndex = XanimeApi.int(ep, "ep_sub_index") ?: 0
            val fallbackName = XanimeApi.text(ep, "ep_title") ?: "Episode $index"
            val payload = XanimeEpisodeData(
                aniId = aniId,
                epId = epId,
                epIndex = index,
                epSubIndex = subIndex,
                lang = lang,
            )
            return newEpisode(payload.toJson()) {
                this.episode = index
                this.name = realTitles[index] ?: fallbackName
            }
        }

        // Per-episode sub/dub availability comes straight from get_q01's sourcesNode_list
        fun hasSource(ep: JsonNode, type: String): Boolean {
            val list = XanimeApi.arr(ep.get("sourcesNode_list")) ?: return false
            for (i in 0 until list.size()) {
                if (XanimeApi.text(list.get(i).get("data"), "src_type")?.lowercase() == type) return true
            }
            return false
        }

        val subEpisodes = episodeList.filter { hasSource(it, "sub") }
            .mapNotNull { buildEpisode(it, "sub") }
        val dubEpisodes = episodeList.filter { hasSource(it, "dub") }
            .mapNotNull { buildEpisode(it, "dub") }

        val tags = buildList {
            addAll(genres)
            if (souTypes.contains("dub") && !souTypes.contains("sub")) add("Dub")
            studios.firstOrNull()?.let { add(it) }
        }

        val showStatus = when (statusText) {
            "currently_airing" -> ShowStatus.Ongoing
            "finished_airing" -> ShowStatus.Completed
            else -> null
        }

        return if (isMovie) {
            // Movies: single load; both SUB and DUB links are emitted by loadLinks,
            // separated by link source names and labelled subtitles.
            val subData = subEpisodes.firstOrNull()?.data
                ?: XanimeEpisodeData(aniId, "", 1, 0, "sub").toJson()
            val dubData = dubEpisodes.firstOrNull()?.data
            val movieData = if (dubData != null) "$subData|$dubData" else subData
            newMovieLoadResponse(title, url, TvType.AnimeMovie, movieData) {
                this.posterUrl = poster
                this.backgroundPosterUrl = background
                this.plot = plot
                this.tags = tags
                this.year = year
                if (scoreVal != null && scoreVal in 1..100) {
                    this.score = Score.from10((scoreVal / 10.0).toString())
                }
                if (malId != null) addMalId(malId.toIntOrNull())
                if (alId != null) addAniListId(alId.toIntOrNull())
            }
        } else {
            newAnimeLoadResponse(title, url, tvType) {
                this.posterUrl = poster
                this.backgroundPosterUrl = background
                this.plot = plot
                this.tags = tags
                this.year = year
                if (scoreVal != null && scoreVal in 1..100) {
                    this.score = Score.from10((scoreVal / 10.0).toString())
                }
                if (showStatus != null) {
                    this.showStatus = showStatus
                }
                season?.let { s ->
                    // "Fall 2022" -> season number; Spring=1 Summer=2 Fall=3 Winter=4
                    val parts = s.split(" ")
                    val yearPart = parts.getOrNull(1)?.toIntOrNull()
                    if (yearPart != null) this.year = yearPart
                }
                if (malId != null) addMalId(malId.toIntOrNull())
                if (alId != null) addAniListId(alId.toIntOrNull())
                if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
                if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
                if (subEpisodes.isEmpty() && dubEpisodes.isEmpty()) {
                    addEpisodes(DubStatus.Subbed, episodeList.mapNotNull { buildEpisode(it, "sub") })
                }
            }
        }
    }

    /**
     * Fetch every episode page in parallel (site caps at 60/page).
     */
    private suspend fun fetchAllEpisodes(aniId: String, epTotal: Int): List<JsonNode> {
        val pages = (((epTotal.coerceAtLeast(1) - 1) / EPISODE_PAGE_SIZE) + 1)
            .coerceAtMost(MAX_EPISODE_PAGES)
        val collected = ConcurrentHashMap<Int, List<JsonNode>>()
        coroutineScope {
            (1..pages).map { p ->
                async {
                    try {
                        val data = XanimeApi.gql(
                            XanimeApi.episodeListQuery(),
                            mapOf(
                                "select" to mapOf(
                                    "ani_id" to aniId,
                                    "init" to EPISODE_PAGE_SIZE,
                                    "size" to EPISODE_PAGE_SIZE,
                                    "page" to p,
                                )
                            )
                        ) ?: return@async
                        val list = XanimeApi.obj(data.get("get_q01")) ?: return@async
                        val items = XanimeApi.arr(list.get("items")) ?: return@async
                        val eps = ArrayList<JsonNode>()
                        for (i in 0 until items.size()) {
                            val item = items.get(i)
                            val d = item.get("data") ?: continue
                            if (XanimeApi.text(d, "ep_id") != null) eps.add(d)
                        }
                        collected[p] = eps
                    } catch (e: Exception) {
                        Log.d(TAG, "episode page $p failed: ${e.message}")
                    }
                }
            }.awaitAll()
        }
        return collected.entries.sortedBy { it.key }.flatMap { it.value }
            .distinctBy { XanimeApi.text(it, "ep_id") }
    }

    /**
     * Real episode titles from AniList (streamingEpisodes, e.g. "Episode 20 - Advent of the Demon").
     * Matched against the site's own al_id field — the site mirrors AniList metadata.
     */
    private suspend fun fetchAnilistEpisodeTitles(alId: String): Map<Int, String> {
        if (alId.isBlank() || alId.toIntOrNull() == null) return emptyMap()
        return try {
            val query = """
                query (${'$'}id: Int) {
                  Media(id: ${'$'}id, type: ANIME) {
                    streamingEpisodes { title }
                  }
                }
            """.trimIndent()
            val bodyJson = XanimeApi.mapper.writeValueAsString(
                mapOf(
                    "query" to query,
                    "variables" to mapOf("id" to alId.toInt()),
                )
            )
            val resp = app.post(
                ANILIST_URL,
                headers = mapOf(
                    "User-Agent" to USER_AGENT,
                    "Content-Type" to "application/json",
                    "Accept" to "application/json",
                ),
                json = bodyJson,
                timeout = 20_000L
            )
            val root = XanimeApi.mapper.readTree(resp.text)
            val media = root.get("data")?.get("Media") ?: return emptyMap()
            val eps = XanimeApi.arr(media.get("streamingEpisodes")) ?: return emptyMap()
            val out = LinkedHashMap<Int, String>()
            for (i in 0 until eps.size()) {
                val epNode = eps.get(i)
                val raw = XanimeApi.text(epNode, "title") ?: continue
                val num = Regex("Episode\\s+(\\d+)", RegexOption.IGNORE_CASE)
                    .find(raw)?.groupValues?.get(1)?.toIntOrNull() ?: (i + 1)
                anilistEpisodeName(raw)?.let { out[num] = it }
            }
            out
        } catch (e: Exception) {
            Log.d(TAG, "anilist titles failed: ${e.message}")
            emptyMap()
        }
    }

    // ---------------- links + subtitles ----------------

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // Movie payloads may be "subJson|dubJson" (both languages on one watch page)
        val parts = data.split("|")
        val wantedLangs = HashSet<String>()
        val epIds = LinkedHashSet<String>()
        for (part in parts) {
            val epData = try {
                XanimeEpisodeData.fromJson(part)
            } catch (e: Exception) {
                Log.d(TAG, "episode data parse failed: ${e.message}")
                null
            } ?: continue
            if (epData.epId.isNotBlank()) {
                epIds.add(epData.epId)
                if (epData.lang.isNotBlank()) wantedLangs.add(epData.lang)
            }
        }
        if (epIds.isEmpty()) return false

        var found = false
        val seenSubUrls = HashSet<String>()
        val seenLinkUrls = HashSet<String>()

        for (epId in epIds) {
            val resp = XanimeApi.gql(
                XanimeApi.episodeSourcesQuery(),
                mapOf("select" to mapOf("id" to epId))
            ) ?: continue
            val epNode = XanimeApi.obj(resp.get("get_q07")) ?: continue
            val epDataNode = epNode.get("data") ?: continue
            val sources = XanimeApi.arr(epDataNode.get("sourcesNode_list")) ?: continue

            for (s in 0 until sources.size()) {
                val src = sources.get(s).get("data") ?: continue
                val srcType = XanimeApi.text(src, "src_type")?.lowercase() ?: "sub"
                // Series episodes only emit their own language; movies emit everything
                if (wantedLangs.isNotEmpty() && srcType !in wantedLangs) continue

                val souPath = XanimeApi.text(src, "souPath")?.takeIf { it.isNotBlank() } ?: continue
                val rawName = XanimeApi.text(src, "src_name")?.takeIf { it.isNotBlank() } ?: "Server"
                val serverLabel = if (rawName == "1") "Server 1" else rawName
                val langTag = if (srcType == "dub") "DUB" else "SUB"
                val linkName = "Xanime $langTag • $serverLabel"

                // --- subtitles carried by THIS source ---
                // sub source  -> translation subs in many languages
                // dub source  -> dubtitles (usually English)
                val tracks = XanimeApi.arr(src.get("track"))
                if (tracks != null) {
                    for (t in 0 until tracks.size()) {
                        val track = tracks.get(t)
                        val trackPath = XanimeApi.text(track, "trackPath")?.takeIf { it.isNotBlank() } ?: continue
                        val kind = XanimeApi.text(track, "kind")?.lowercase()
                        if (kind != null && kind != "captions" && kind != "subtitles") continue
                        val label = XanimeApi.text(track, "label")?.takeIf { it.isNotBlank() } ?: "Unknown"
                        val display = "$label • $langTag"
                        if (seenSubUrls.add(trackPath)) {
                            subtitleCallback.invoke(newSubtitleFile(display, trackPath))
                        }
                    }
                }

                // --- HLS master playlist ---
                try {
                    M3u8Helper.generateM3u8(
                        linkName,
                        souPath,
                        "$mainUrl/",
                        headers = playHeaders
                    ).forEach { link ->
                        if (seenLinkUrls.add(link.url)) callback.invoke(link)
                    }
                    found = true
                } catch (e: Exception) {
                    Log.d(TAG, "m3u8 parse failed ($linkName): ${e.message}")
                    if (seenLinkUrls.add(souPath)) {
                        callback.invoke(
                            newExtractorLink(
                                linkName,
                                "$langTag HLS (Adaptive)",
                                souPath,
                                type = ExtractorLinkType.M3U8
                            ) {
                                this.referer = "$mainUrl/"
                                this.headers = playHeaders
                                this.quality = Qualities.Unknown.value
                            }
                        )
                    }
                    found = true
                }

                // --- alternate iframe embeds (schema field m3u8_lists {name, iframe}) ---
                val m3u8Lists = XanimeApi.arr(src.get("m3u8_lists"))
                if (m3u8Lists != null) {
                    for (m in 0 until m3u8Lists.size()) {
                        val entry = m3u8Lists.get(m)
                        val iframe = XanimeApi.text(entry, "iframe")?.takeIf { it.isNotBlank() } ?: continue
                        if (seenLinkUrls.add(iframe)) {
                            callback.invoke(
                                newExtractorLink(
                                    linkName,
                                    "$serverLabel Embed",
                                    iframe,
                                    type = ExtractorLinkType.M3U8
                                ) {
                                    this.referer = "$mainUrl/"
                                    this.headers = playHeaders
                                    this.quality = Qualities.Unknown.value
                                }
                            )
                            found = true
                        }
                    }
                }
            }
        }

        return found
    }
}

/** Payload embedded in every Episode.data / movie data. */
data class XanimeEpisodeData(
    val aniId: String,
    val epId: String,
    val epIndex: Int,
    val epSubIndex: Int,
    val lang: String,
) {
    fun toJson(): String {
        val node = XanimeApi.mapper.createObjectNode().apply {
            put("aniId", aniId)
            put("epId", epId)
            put("epIndex", epIndex)
            put("epSubIndex", epSubIndex)
            put("lang", lang)
        }
        return XanimeApi.mapper.writeValueAsString(node)
    }

    companion object {
        fun fromJson(json: String): XanimeEpisodeData {
            val node = XanimeApi.mapper.readTree(json)
            return XanimeEpisodeData(
                aniId = node.path("aniId").asText(""),
                epId = node.path("epId").asText(""),
                epIndex = node.path("epIndex").asInt(0),
                epSubIndex = node.path("epSubIndex").asInt(0),
                lang = node.path("lang").asText(""),
            )
        }
    }
}
