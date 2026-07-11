package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AnidapProvider : MainAPI() {
    override var mainUrl = "https://anidap.se"
    override var name = "Anidap"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val chadUrl = "https://chad.anidap.se/rest/api"
    private val TAG = "Anidap"
    private val baseHeaders = mapOf("Referer" to "$mainUrl/home")

    // ════════════════════════════════════════════════════════════════════════════
    // IMPORTANT: NO hardcoded provider lists or hardsub assumptions.
    //
    // The user explicitly stated (and the API confirms) that providers are
    // RANDOM per anime — any provider (beep, mimi, vee, yuki, loli, uwu, kiwi,
    // sora, mini, etc.) can appear in sub, dub, or hardsub for ANY anime.
    // There is NO fixed mapping like "loli/uwu/kiwi are always hardsub".
    //
    // The servers API returns the REAL per-anime provider list with each
    // provider's `tip` field (e.g. "Soft sub, Fast" or "Hard sub, Fast").
    // We use ONLY what the API returns — no fallbacks, no hardcoding.
    // ════════════════════════════════════════════════════════════════════════════

    // ==================== DATA MODELS ====================

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchResponseData(
        @JsonProperty("results") val results: List<AnimeItem>? = null,
        @JsonProperty("currentPage") val currentPage: Int? = null,
        @JsonProperty("hasNextPage") val hasNextPage: Boolean? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeItem(
        @JsonProperty("id") val id: String,
        @JsonProperty("title") val title: AnimeTitle? = null,
        @JsonProperty("image") val image: String? = null,
        @JsonProperty("cover") val cover: String? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("type") val type: String? = null,
        @JsonProperty("totalEpisodes") val totalEpisodes: Int? = null,
        @JsonProperty("genres") val genres: List<String>? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("rating") val rating: Double? = null,
        @JsonProperty("releaseDate") val releaseDate: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeTitle(
        @JsonProperty("romaji") val romaji: String? = null,
        @JsonProperty("english") val english: String? = null,
        @JsonProperty("userPreferred") val userPreferred: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeDetail(
        @JsonProperty("id") val id: String? = null,
        @JsonProperty("title") val title: AnimeTitle? = null,
        @JsonProperty("titleEnglish") val titleEnglish: String? = null,
        @JsonProperty("coverImage") val coverImage: CoverImage? = null,
        @JsonProperty("bannerImage") val bannerImage: String? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("synopsis") val synopsis: String? = null,
        @JsonProperty("episodes") val episodes: Int? = null,
        @JsonProperty("totalEpisodes") val totalEpisodes: Int? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("genres") val genres: List<Genre>? = null,
        @JsonProperty("type") val type: String? = null,
        @JsonProperty("format") val format: String? = null,
        @JsonProperty("seasonYear") val seasonYear: Int? = null,
        @JsonProperty("averageScore") val averageScore: Int? = null,
        @JsonProperty("duration") val duration: Int? = null,
        @JsonProperty("slug") val slug: String? = null,
        @JsonProperty("trailerId") val trailerId: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class CoverImage(
        @JsonProperty("large") val large: String? = null,
        @JsonProperty("extraLarge") val extraLarge: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Genre(
        @JsonProperty("name") val name: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ServersResponse(
        @JsonProperty("subProviders") val subProviders: List<Provider>? = null,
        @JsonProperty("dubProviders") val dubProviders: List<Provider>? = null
    )

    /**
     * A single source provider for an anime episode.
     * - id: short name like "beep", "mimi", "yuki", "loli", "uwu", "kiwi", "sora", "mini", "vee"
     * - default: whether this is the default provider for the type
     * - tip: human-readable description like "Soft sub, Fast" or "Hard sub, Fast, High quality"
     *        THIS is the authoritative source for whether a provider is hardsub or soft sub.
     *        We MUST NOT hardcode which provider is hardsub — the tip varies per anime.
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Provider(
        @JsonProperty("id") val id: String,
        @JsonProperty("default") val default: Boolean? = null,
        @JsonProperty("tip") val tip: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SourcesResponse(
        @JsonProperty("sources") val sources: List<Source>? = null,
        @JsonProperty("tracks") val tracks: List<Track>? = null,
        @JsonProperty("headers") val headers: Map<String, String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Source(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("quality") val quality: String? = null,
        @JsonProperty("type") val type: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Track(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("label") val label: String? = null,
        @JsonProperty("kind") val kind: String? = null
    )

    // ==================== HELPERS ====================

    private fun AnimeItem.getTitle(): String {
        return title?.userPreferred ?: title?.english ?: title?.romaji ?: "Unknown"
    }

    private fun AnimeItem.getPoster(): String? {
        return image ?: cover
    }

    /**
     * Build a clean display label for a provider using its real tip from the API.
     * Examples:
     *   - id=beep,  tip="Soft sub, Fast"            -> "beep (Soft sub, Fast)"
     *   - id=loli,  tip="Hard sub, Fast"            -> "loli (Hardsub, Fast)"
     *   - id=uwu,   tip="Hard sub, Fast, High quality" -> "uwu (Hardsub, High quality)"
     *   - id=mimi,  tip=null                        -> "mimi"
     */
    private fun buildProviderLabel(providerId: String, tip: String?): String {
        if (tip.isNullOrBlank()) return providerId
        // Normalize "Hard sub" -> "Hardsub" for cleaner display
        val normalizedTip = tip.replace("Hard sub", "Hardsub")
        return "$providerId ($normalizedTip)"
    }

    /**
     * Returns true if the provider's tip indicates it's a hardsub provider.
     * This is the ONLY authoritative way to tell — never hardcode by id.
     */
    private fun isHardsubProvider(tip: String?): Boolean {
        if (tip.isNullOrBlank()) return false
        return tip.contains("Hard", ignoreCase = true)
    }

    // ==================== getMainPage ====================

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' page=$page")
        val lists = mutableListOf<HomePageList>()

        try {
            when (request.name) {
                "All" -> {
                    coroutineScope {
                        val trendingDeferred = async { fetchTrendingFromAPI() }
                        val popularDeferred = async { fetchSearch("naruto") }
                        val recentDeferred = async { fetchSearch("one piece") }

                        val trending = trendingDeferred.await()
                        if (trending.isNotEmpty()) {
                            lists.add(HomePageList("🔥 Trending", trending, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Trending -> ${trending.size}")
                        }

                        val popular = popularDeferred.await()
                        if (popular.isNotEmpty()) {
                            lists.add(HomePageList("⭐ Popular", popular, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Popular -> ${popular.size}")
                        }

                        val recent = recentDeferred.await()
                        if (recent.isNotEmpty()) {
                            lists.add(HomePageList("🆕 Recently Added", recent, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Recently Added -> ${recent.size}")
                        }

                        kotlinx.coroutines.delay(500)
                        val actionDeferred = async { fetchSearch("demon slayer") }
                        val comedyDeferred = async { fetchSearch("my hero academia") }
                        val fantasyDeferred = async { fetchSearch("jujutsu kaisen") }

                        val action = actionDeferred.await()
                        if (action.isNotEmpty()) {
                            lists.add(HomePageList("💥 Action", action, isHorizontalImages = true))
                        }

                        val comedy = comedyDeferred.await()
                        if (comedy.isNotEmpty()) {
                            lists.add(HomePageList("😂 Comedy", comedy, isHorizontalImages = true))
                        }

                        val fantasy = fantasyDeferred.await()
                        if (fantasy.isNotEmpty()) {
                            lists.add(HomePageList("🧙 Fantasy", fantasy, isHorizontalImages = true))
                        }
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage FAILED: ${e.message}")
        }

        Log.d(TAG, "getMainPage END: ${lists.size} sections")
        return newHomePageResponse(lists, hasNext = false)
    }

    override val mainPage = mainPageOf(
        "$mainUrl/api/anime/search" to "All"
    )

    private suspend fun fetchSearch(query: String): List<SearchResponse> {
        return try {
            val encoded = java.net.URLEncoder.encode(query, "UTF-8")
            val url = "$mainUrl/api/anime/search?q=$encoded"
            Log.d(TAG, "fetchSearch: $url")
            val res = app.get(url, headers = baseHeaders, timeout = 30_000L)
            val parsed = parseJson<SearchResponseData>(res.text)
            val results = parsed.results ?: emptyList()
            Log.d(TAG, "fetchSearch: '$query' -> ${results.size} items")
            results.mapNotNull { it.toSearchResponse() }
        } catch (e: Exception) {
            Log.e(TAG, "fetchSearch FAILED: ${e.message}")
            emptyList()
        }
    }

    private suspend fun fetchTrendingFromAPI(): List<SearchResponse> {
        return try {
            val url = "$mainUrl/api/anime/trending"
            Log.d(TAG, "fetchTrendingFromAPI: $url")
            val res = app.get(url, headers = baseHeaders, timeout = 30_000L)
            val root = parseJson<com.fasterxml.jackson.databind.JsonNode>(res.text)
            val resultsNode = root.path("data").path("data").path("results")
            if (resultsNode.isArray) {
                val results = mutableListOf<SearchResponse>()
                for (node in resultsNode) {
                    val id = node.path("id").asText()
                    val title = node.path("title").path("userPreferred").asText()
                    val image = node.path("image").asText()
                    if (id.isNotBlank() && title.isNotBlank()) {
                        results.add(newAnimeSearchResponse(title, "$mainUrl|$id", TvType.Anime) {
                            this.posterUrl = image.ifBlank { null }
                            addDubStatus(dubExist = true, subExist = true)
                        })
                    }
                }
                Log.d(TAG, "fetchTrendingFromAPI: ${results.size} items")
                results
            } else {
                emptyList()
            }
        } catch (e: Exception) {
            Log.e(TAG, "fetchTrendingFromAPI FAILED: ${e.message}")
            emptyList()
        }
    }

    private fun AnimeItem.toSearchResponse(): SearchResponse? {
        val title = getTitle()
        if (title == "Unknown") return null
        val data = "$mainUrl|$id"
        Log.d(TAG, "toSearchResponse: '$title' id=$id")
        return newAnimeSearchResponse(title, data, TvType.Anime) {
            this.posterUrl = getPoster()
            addDubStatus(dubExist = true, subExist = true)
        }
    }

    // ==================== search ====================

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search START: query='$query'")
        if (query.length < 2) return emptyList()
        return try {
            val encoded = java.net.URLEncoder.encode(query, "UTF-8")
            val url = "$mainUrl/api/anime/search?q=$encoded"
            Log.d(TAG, "search: $url")
            val res = app.get(url, headers = baseHeaders, timeout = 30_000L)
            val parsed = parseJson<SearchResponseData>(res.text)
            val results = parsed.results ?: emptyList()
            Log.d(TAG, "search END: ${results.size} results")
            results.mapNotNull { it.toSearchResponse() }
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED: ${e.message}")
            emptyList()
        }
    }

    // ==================== load ====================

    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load START: url='$url'")
        val animeId = url.removePrefix("$mainUrl/").removePrefix("$mainUrl|").trim()
        Log.d(TAG, "load: animeId=$animeId")

        return try {
            // 1. Fetch anime detail (no anti-bot on anidap.se/api/* — direct app.get is fine)
            val detailUrl = "$mainUrl/api/anime/$animeId"
            Log.d(TAG, "load: fetching detail -> $detailUrl")
            val detailRes = app.get(detailUrl, headers = baseHeaders, timeout = 30_000L)

            val detailRoot = parseJson<com.fasterxml.jackson.databind.JsonNode>(detailRes.text)
            val dataNode = detailRoot.path("data")
            val detail = parseJson<AnimeDetail>(dataNode.toString())

            val slug = detail.slug ?: detail.id ?: animeId
            val title = detail.title?.userPreferred ?: detail.title?.english ?: detail.titleEnglish ?: "Unknown"
            val poster = detail.coverImage?.extraLarge ?: detail.coverImage?.large
            val banner = detail.bannerImage
            val plot = detail.description ?: detail.synopsis
            val year = detail.seasonYear
            val genres = detail.genres?.mapNotNull { it.name }?.filter { it.isNotBlank() }
            val totalEps = detail.episodes ?: detail.totalEpisodes ?: 0
            val isMovie = detail.format == "MOVIE" || detail.type == "MOVIE"

            Log.d(TAG, "load: title='$title' slug=$slug episodes=$totalEps format=${detail.format}")

            // 2. Fetch servers via cfAppGet (handles _amx_id anti-bot bypass)
            // The servers API returns the REAL per-anime provider list with tips.
            // We do NOT fall back to hardcoded providers — if this fails, we show
            // no episodes (better than showing fake episodes that all fail to load).
            val serversUrl = "$chadUrl/servers?id=$slug&epNum=1"
            Log.d(TAG, "load: fetching servers (via cfAppGet) -> $serversUrl")
            val serversRes = cfAppGet(
                serversUrl,
                headers = mapOf(
                    "Referer" to "$mainUrl/",
                    "Accept" to "application/json"
                )
            )
            Log.d(TAG, "load: servers response code=${serversRes.code} size=${serversRes.text.length}")

            val servers = if (serversRes.code == 200 && !serversRes.text.contains("bot_detected") && !serversRes.text.contains("\"error\"")) {
                try { parseJson<ServersResponse>(serversRes.text) } catch (e: Exception) {
                    Log.e(TAG, "load: servers parse failed: ${e.message} body=${serversRes.text.take(200)}")
                    ServersResponse()
                }
            } else {
                Log.e(TAG, "load: servers API failed (code=${serversRes.code}) — no fallback, will show empty episodes")
                ServersResponse()
            }

            // Use ONLY the providers from the servers response.
            // NO hardcoded fallback — providers are random per anime.
            val subProviders: List<Provider> = servers.subProviders?.filter { it.id.isNotBlank() } ?: emptyList()
            val dubProviders: List<Provider> = servers.dubProviders?.filter { it.id.isNotBlank() } ?: emptyList()

            // Build provider→tip map from the REAL API response (no hardcoding)
            val providerTips = mutableMapOf<String, String>()
            subProviders.forEach { p -> providerTips[p.id] = p.tip ?: "" }
            dubProviders.forEach { p -> if (!providerTips.containsKey(p.id)) providerTips[p.id] = p.tip ?: "" }

            Log.d(TAG, "load: subProviders=${subProviders.size} dubProviders=${dubProviders.size}")
            Log.d(TAG, "load: sub ids=${subProviders.map { it.id }}")
            Log.d(TAG, "load: dub ids=${dubProviders.map { it.id }}")
            Log.d(TAG, "load: providerTips=$providerTips")

            if (totalEps <= 0) {
                Log.e(TAG, "load: no episodes found in detail (totalEps=$totalEps)")
                return newAnimeLoadResponse(title, url, TvType.Anime) {
                    this.posterUrl = poster
                    this.backgroundPosterUrl = banner
                    this.plot = plot
                    this.tags = genres
                    this.year = year
                }
            }

            val hasSub = subProviders.isNotEmpty()
            val hasDub = dubProviders.isNotEmpty()

            // 4. Determine TvType
            val tvType = when {
                isMovie && hasDub -> TvType.Anime
                isMovie -> TvType.AnimeMovie
                else -> TvType.Anime
            }

            // 5. Build episode lists.
            // Data format: "$mainUrl|$slug|$epNum|$type|${providerIds.joinToString(",")}|${tips.joinToString(";;")}"
            // We pack the tips so loadLinks can label sources correctly without re-fetching servers.
            val subEpisodes = if (hasSub) (1..totalEps).map { epNum ->
                val ids = subProviders.joinToString(",") { it.id }
                val tips = subProviders.joinToString(";;") { it.id + "=" + (it.tip ?: "") }
                newEpisode("$mainUrl|$slug|$epNum|sub|$ids|$tips") {
                    this.episode = epNum
                    this.name = "Episode $epNum"
                }
            } else emptyList()

            val dubEpisodes = if (hasDub) (1..totalEps).map { epNum ->
                val ids = dubProviders.joinToString(",") { it.id }
                val tips = dubProviders.joinToString(";;") { it.id + "=" + (it.tip ?: "") }
                newEpisode("$mainUrl|$slug|$epNum|dub|$ids|$tips") {
                    this.episode = epNum
                    this.name = "Episode $epNum"
                }
            } else emptyList()

            Log.d(TAG, "load: subEps=${subEpisodes.size} dubEps=${dubEpisodes.size}")

            // If both sub and dub are empty (servers API failed AND no providers),
            // return a load response with no episodes. The user will see "no episodes"
            // which is better than fake episodes that all fail to load.
            return newAnimeLoadResponse(title, url, tvType) {
                this.posterUrl = poster
                this.backgroundPosterUrl = banner
                this.plot = plot
                this.tags = genres
                this.year = year
                if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
                if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
            }
        } catch (e: Exception) {
            Log.e(TAG, "load FAILED: ${e.message}")
            null
        }
    }

    // ==================== loadLinks ====================

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START: data='$data'")

        // Strip mainUrl prefix if present (CloudStream prepends it)
        val cleanData = data.removePrefix("$mainUrl/").removePrefix("$mainUrl|").trim()
        val parts = cleanData.split("|")
        Log.d(TAG, "loadLinks: parts count=${parts.size} parts=$parts")
        if (parts.size < 5) {
            Log.e(TAG, "loadLinks: invalid data format (expected >=5 parts, got ${parts.size})")
            return false
        }
        val slug = parts[0]
        val epNum = parts[1]
        val type = parts[2] // "sub" or "dub"
        val providerIds = parts[3].split(",").filter { it.isNotBlank() }
        // parts[4] = "id1=tip1;;id2=tip2;;..." (may be empty if no tips)
        val tipsMap: Map<String, String> = if (parts.size >= 5 && parts[4].isNotBlank()) {
            parts[4].split(";;").mapNotNull { entry ->
                val eqIdx = entry.indexOf('=')
                if (eqIdx > 0) entry.substring(0, eqIdx) to entry.substring(eqIdx + 1)
                else null
            }.toMap()
        } else emptyMap()

        Log.d(TAG, "loadLinks: slug=$slug epNum=$epNum type=$type providers=$providerIds tips=$tipsMap")
        if (providerIds.isEmpty()) {
            Log.e(TAG, "loadLinks: no providers")
            return false
        }

        var found = false
        for (providerId in providerIds) {
            val tip = tipsMap[providerId]
            Log.d(TAG, "loadLinks: fetching sources for provider=$providerId type=$type tip=$tip")
            try {
                val sourcesUrl = "$chadUrl/sources?id=$slug&epNum=$epNum&type=$type&providerId=$providerId"
                // Use cfAppGet for anti-bot bypass (chad.anidap.se is protected)
                val sourcesRes = cfAppGet(
                    sourcesUrl,
                    headers = mapOf(
                        "Referer" to "$mainUrl/",
                        "Accept" to "application/json"
                    )
                )
                Log.d(TAG, "loadLinks: provider=$providerId code=${sourcesRes.code} size=${sourcesRes.text.length}")
                if (sourcesRes.code != 200 || sourcesRes.text.contains("bot_detected") || sourcesRes.text.contains("\"error\"")) {
                    Log.e(TAG, "loadLinks: provider=$providerId failed (code=${sourcesRes.code})")
                    continue
                }

                val sourcesData = try { parseJson<SourcesResponse>(sourcesRes.text) } catch (e: Exception) {
                    Log.e(TAG, "loadLinks: provider=$providerId parse failed: ${e.message} body=${sourcesRes.text.take(200)}")
                    continue
                }

                val sources = sourcesData.sources ?: emptyList()
                val tracks = sourcesData.tracks ?: emptyList()
                val headers = sourcesData.headers ?: emptyMap()
                val referer = headers["Referer"] ?: headers["referer"] ?: "$mainUrl/"

                Log.d(TAG, "loadLinks: provider=$providerId sources=${sources.size} tracks=${tracks.size} referer=$referer")

                if (sources.isEmpty()) {
                    Log.e(TAG, "loadLinks: no sources for provider=$providerId")
                    continue
                }

                // Build the display label using the REAL tip from the API.
                // NO hardcoding — the tip tells us if it's hardsub or soft sub.
                val providerLabel = buildProviderLabel(providerId, tip)

                // Process subtitles
                for (track in tracks) {
                    val trackUrl = track.url ?: continue
                    val label = track.label ?: "Subtitle"
                    if (track.kind == "captions" || track.kind == "subtitles") {
                        subtitleCallback.invoke(SubtitleFile(label, trackUrl))
                        Log.d(TAG, "loadLinks: subtitle '$label' added")
                    }
                }

                // Process sources
                for (source in sources) {
                    val sourceUrl = source.url ?: continue
                    val sourceType = source.type ?: ""
                    val quality = source.quality ?: "auto"
                    Log.d(TAG, "loadLinks: source url=${sourceUrl.take(80)} type=$sourceType quality=$quality")

                    when {
                        // HLS m3u8
                        sourceUrl.contains(".m3u8") || sourceType.contains("mpegurl") -> {
                            M3u8Helper.generateM3u8(
                                source = "$name - $providerLabel",
                                streamUrl = sourceUrl,
                                referer = referer
                            ).forEach(callback)
                            found = true
                            Log.d(TAG, "loadLinks: $providerLabel m3u8 added")
                        }

                        // DASH mpd — skip (ExoPlayer needs special handling)
                        sourceUrl.contains(".mpd") || sourceType.contains("dash") -> {
                            Log.d(TAG, "loadLinks: $providerLabel DASH (mpd) — skipping (not supported)")
                        }

                        // Direct mp4/webm
                        sourceUrl.contains(".mp4") || sourceUrl.contains(".webm") || sourceType.contains("mp4") || sourceType.contains("webm") -> {
                            callback.invoke(
                                newExtractorLink(
                                    source = "$name - $providerLabel",
                                    name = "$name - $providerLabel",
                                    url = sourceUrl,
                                    type = ExtractorLinkType.VIDEO
                                ) {
                                    this.headers = mapOf("Referer" to referer)
                                    this.quality = Qualities.Unknown.value
                                }
                            )
                            found = true
                            Log.d(TAG, "loadLinks: $providerLabel mp4 added")
                        }

                        // Try loadExtractor for unknown URLs (kwik.cx, etc.)
                        else -> {
                            val loaded = loadExtractor(sourceUrl, referer, subtitleCallback, callback)
                            if (loaded) {
                                found = true
                                Log.d(TAG, "loadLinks: $providerLabel resolved via loadExtractor")
                            } else {
                                // Last resort — add as direct link
                                callback.invoke(
                                    newExtractorLink(
                                        source = "$name - $providerLabel",
                                        name = "$name - $providerLabel",
                                        url = sourceUrl,
                                        type = ExtractorLinkType.VIDEO
                                    ) {
                                        this.headers = mapOf("Referer" to referer)
                                    }
                                )
                                found = true
                                Log.d(TAG, "loadLinks: $providerLabel direct fallback added")
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "loadLinks: provider=$providerId FAILED: ${e.message}")
            }
        }

        Log.d(TAG, "loadLinks END: found=$found")
        return found
    }
}
