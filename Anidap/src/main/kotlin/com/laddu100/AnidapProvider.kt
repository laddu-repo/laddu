package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
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
    private val chadHeaders = mapOf(
        "Referer" to "$mainUrl/",
        "Accept" to "application/json",
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"
    )
    // Hardsub providers — only show in Sub tab, never in Dub
    private val hardsubProviders = setOf("loli", "uwu", "kiwi")
    // All known providers for fallback
    private val allProviders = listOf("beep", "mimi", "vee", "yuki", "loli", "uwu", "kiwi", "sora")

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

    // Load data for loadLinks
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class LoadData(
        val slug: String,
        val epNum: String,
        val providers: List<Provider>,
        val type: String // "sub" or "dub"
    )

    // ==================== HELPERS ====================

    private fun AnimeItem.getTitle(): String {
        return title?.userPreferred ?: title?.english ?: title?.romaji ?: "Unknown"
    }

    private fun AnimeItem.getPoster(): String? {
        return image ?: cover
    }

    // ==================== getMainPage ====================

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' page=$page")
        val lists = mutableListOf<HomePageList>()

        try {
            when (request.name) {
                "All" -> {
                    coroutineScope {
                        // Use trending API + real anime searches for homepage
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

                        // Genre-based sections using real anime titles
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
            // Response is nested: { success, data: { success, data: { results: [...] } } }
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
        // Use $mainUrl| prefix so CloudStream doesn't prepend it
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
        // Parse: CloudStream may prepend mainUrl → "https://anidap.se|<id>" or just "<id>"
        val animeId = url.removePrefix("$mainUrl/").removePrefix("$mainUrl|").trim()
        Log.d(TAG, "load: animeId=$animeId")

        return try {
            // 1. Fetch anime detail
            val detailUrl = "$mainUrl/api/anime/$animeId"
            Log.d(TAG, "load: fetching detail -> $detailUrl")
            val detailRes = app.get(detailUrl, headers = baseHeaders, timeout = 30_000L)

            // Parse detail — response is { success, data: {...} }
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

            // 2. Fetch servers with retry for bot_detected
            val serversUrl = "$chadUrl/servers?id=$slug&epNum=1"
            var serversJson: String? = null
            for (attempt in 1..3) {
                Log.d(TAG, "load: fetching servers (attempt $attempt) -> $serversUrl")
                val serversRes = app.get(serversUrl, headers = chadHeaders, timeout = 30_000L)
                Log.d(TAG, "load: servers response code=${serversRes.code} size=${serversRes.text.length}")
                if (serversRes.code == 200 && !serversRes.text.contains("bot_detected") && !serversRes.text.contains("error")) {
                    serversJson = serversRes.text
                    break
                }
                Log.e(TAG, "load: servers attempt $attempt failed (code=${serversRes.code})")
                if (attempt < 3) kotlinx.coroutines.delay(2000)
            }
            
            val servers = if (serversJson != null) {
                try { parseJson<ServersResponse>(serversJson) } catch (e: Exception) {
                    Log.e(TAG, "load: servers parse failed: ${e.message}")
                    ServersResponse()
                }
            } else {
                Log.e(TAG, "load: all server attempts failed, using all 8 providers")
                ServersResponse()
            }
            
            // Get actual provider IDs from servers response
            val serverSubIds = servers.subProviders?.map { it.id }?.distinct() ?: emptyList()
            val serverDubIds = servers.dubProviders?.map { it.id }?.distinct() ?: emptyList()
            
            // Always include ALL 8 providers (servers may not list all — they're dynamic)
            val subAllIds = (serverSubIds + allProviders).distinct()
            // For dub: include all from servers EXCEPT hardsub providers, then add all non-hardsub
            val dubAllIds = (serverDubIds.filter { it !in hardsubProviders } + 
                             allProviders.filter { it !in hardsubProviders }).distinct()
            
            Log.d(TAG, "load: subProviders=${subAllIds.size} dubProviders=${dubAllIds.size}")
            Log.d(TAG, "load: sub ids=$subAllIds")
            Log.d(TAG, "load: dub ids=$dubAllIds")

            // 3. Determine sub/dub availability — always true since we force all providers
            val hasSub = subAllIds.isNotEmpty()
            val hasDub = dubAllIds.isNotEmpty()

            // 4. Determine TvType
            val tvType = when {
                isMovie && hasDub -> TvType.Anime
                isMovie -> TvType.AnimeMovie
                else -> TvType.Anime
            }

            // 5. Build episode lists
            // Data format: "$mainUrl|$slug|$epNum|$type|${providerIds.joinToString(",")}"
            val subEpisodes = if (hasSub) (1..totalEps).map { epNum ->
                newEpisode("$mainUrl|$slug|$epNum|sub|${subAllIds.joinToString(",")}") {
                    this.episode = epNum
                    this.name = "Episode $epNum"
                }
            } else emptyList()

            val dubEpisodes = if (hasDub) (1..totalEps).map { epNum ->
                newEpisode("$mainUrl|$slug|$epNum|dub|${dubAllIds.joinToString(",")}") {
                    this.episode = epNum
                    this.name = "Episode $epNum"
                }
            } else emptyList()
            
            // If both sub and dub are empty, force sub with all providers
            if (subEpisodes.isEmpty() && dubEpisodes.isEmpty() && totalEps > 0) {
                Log.d(TAG, "load: no providers from servers API, forcing all 8 for sub")
                val forcedEps = (1..totalEps).map { epNum ->
                    newEpisode("$mainUrl|$slug|$epNum|sub|${allProviders.joinToString(",")}") {
                        this.episode = epNum
                        this.name = "Episode $epNum"
                    }
                }
                Log.d(TAG, "load: forced ${forcedEps.size} sub episodes with all providers")
                newAnimeLoadResponse(title, url, TvType.Anime) {
                    this.posterUrl = poster
                    this.backgroundPosterUrl = banner
                    this.plot = plot
                    this.tags = genres
                    this.year = year
                    addEpisodes(DubStatus.Subbed, forcedEps)
                }
            } else {

                Log.d(TAG, "load: subEps=${subEpisodes.size} dubEps=${dubEpisodes.size}")

                newAnimeLoadResponse(title, url, tvType) {
                    this.posterUrl = poster
                    this.backgroundPosterUrl = banner
                    this.plot = plot
                    this.tags = genres
                    this.year = year
                    if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
                    if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
                }
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
        if (parts.size < 4) {
            Log.e(TAG, "loadLinks: invalid data format")
            return false
        }
        val slug = parts[0]
        val epNum = parts[1]
        val type = parts[2] // "sub" or "dub"
        val providerIds = parts[3].split(",")

        Log.d(TAG, "loadLinks: slug=$slug epNum=$epNum type=$type providers=$providerIds")
        if (providerIds.isEmpty()) {
            Log.e(TAG, "loadLinks: no providers")
            return false
        }

        var found = false
        for (providerId in providerIds) {
            Log.d(TAG, "loadLinks: fetching sources for provider=$providerId type=$type")
            try {
                val sourcesUrl = "$chadUrl/sources?id=$slug&epNum=$epNum&type=$type&providerId=$providerId"
                // Retry on bot_detected
                var sourcesText: String? = null
                for (attempt in 1..2) {
                    val sourcesRes = app.get(sourcesUrl, headers = chadHeaders, timeout = 30_000L)
                    Log.d(TAG, "loadLinks: provider=$providerId attempt=$attempt code=${sourcesRes.code} size=${sourcesRes.text.length}")
                    if (sourcesRes.code == 200 && !sourcesRes.text.contains("bot_detected") && !sourcesRes.text.contains("\"error\"")) {
                        sourcesText = sourcesRes.text
                        break
                    }
                    if (attempt < 2) kotlinx.coroutines.delay(1500)
                }
                if (sourcesText == null) {
                    Log.e(TAG, "loadLinks: provider=$providerId all attempts failed (bot_detected or error)")
                    continue
                }
                val sourcesData = try { parseJson<SourcesResponse>(sourcesText) } catch (e: Exception) {
                    Log.e(TAG, "loadLinks: provider=$providerId parse failed: ${e.message} body=${sourcesText.take(200)}")
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

                // Determine provider label (with hardsub indicator)
                val providerLabel = when (providerId) {
                    "loli", "uwu", "kiwi" -> "$providerId (Hardsub)"
                    else -> providerId
                }

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
                    Log.d(TAG, "loadLinks: source url=${sourceUrl.take(80)} type=$sourceType")

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
