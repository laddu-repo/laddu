package com.laddu100.animex

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson

class AnimeXProvider : MainAPI() {
    override var mainUrl = "https://animex.one"
    override var name = "AnimeX"
    override val hasMainPage = true
    override var lang = "en"
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie)

    private val anilistUrl = "https://graphql.anilist.co"
    private val flixUrl = "https://flixcloud.cc"

    private val flixHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 13; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36",
        "Referer" to "https://animex.one/",
        "Accept" to "application/json, text/plain, */*"
    )

    override val mainPage = mainPageOf(
        "trending" to "Trending Now",
        "popular" to "All-Time Popular",
        "rated" to "Top Rated",
        "season" to "This Season"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val sort = when (request.data) {
            "trending" -> "TRENDING_DESC"
            "popular" -> "POPULARITY_DESC"
            "rated" -> "SCORE_DESC"
            else -> "POPULARITY_DESC"
        }

        val (season, year) = if (request.data == "season") {
            val cal = java.util.Calendar.getInstance()
            val s = when (cal.get(java.util.Calendar.MONTH)) {
                in 0..2 -> "WINTER"
                in 3..5 -> "SPRING"
                in 6..8 -> "SUMMER"
                in 9..11 -> "FALL"
                else -> "WINTER"
            }
            s to cal.get(java.util.Calendar.YEAR)
        } else null to null

        val query = if (season != null) {
            """{ Page(page: 1, perPage: 20) { media(type: ANIME, sort: $sort, season: $season, seasonYear: $year) { id title { english romaji } coverImage { large extraLarge } format episodes seasonYear } } }"""
        } else {
            """{ Page(page: 1, perPage: 20) { media(type: ANIME, sort: $sort) { id title { english romaji } coverImage { large extraLarge } format episodes seasonYear } } }"""
        }

        val items = try {
            val response = app.post(anilistUrl, json = mapOf("query" to query)).text
            parseAniListSearch(response)
        } catch (e: Exception) {
            Log.e("AnimeX", "getMainPage: ${e.message}")
            emptyList()
        }

        return newHomePageResponse(request.name, items)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val encoded = query.replace("\"", "\\\"")
        val graphql = """{ Page(page: 1, perPage: 30) { media(search: "$encoded", type: ANIME) { id title { english romaji } coverImage { large extraLarge } format episodes seasonYear } } }"""
        return try {
            val response = app.post(anilistUrl, json = mapOf("query" to graphql)).text
            parseAniListSearch(response)
        } catch (e: Exception) {
            Log.e("AnimeX", "search: ${e.message}")
            emptyList()
        }
    }

    private fun parseAniListSearch(json: String): List<SearchResponse> {
        val data = try {
            parseJson<AniListPageResponse>(json).data?.page?.media ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
        return data.mapNotNull { media ->
            val title = media.title?.english ?: media.title?.romaji ?: return@mapNotNull null
            val id = media.id ?: return@mapNotNull null
            val poster = media.coverImage?.extraLarge ?: media.coverImage?.large ?: ""
            val path = buildPath(title, id)
            val tvType = if (media.formatStr == "MOVIE") TvType.AnimeMovie else TvType.Anime
            newAnimeSearchResponse(title, "$mainUrl/anime/$path", tvType) {
                this.posterUrl = poster
                this.year = media.seasonYear
            }
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        val path = url.substringAfter("$mainUrl/anime/")
        val anilistId = path.substringAfterLast("-").toIntOrNull() ?: run {
            Log.e("AnimeX", "load: invalid anilistId from url=$url")
            return null
        }

        // 1. Fetch AniList metadata (including streamingEpisode for real episode titles)
        val metaQuery = """{ Media(id: $anilistId) { id title { english romaji } coverImage { large extraLarge } bannerImage description genres episodes format seasonYear averageScore streamingEpisode { title } } }"""

        val meta: AniListMedia? = try {
            val resp = app.post(anilistUrl, json = mapOf("query" to metaQuery)).text
            parseJson<AniListMediaResponse>(resp).data?.media
        } catch (e: Exception) {
            Log.e("AnimeX", "load: AniList fetch failed: ${e.message}")
            null
        }

        val title = meta?.title?.english ?: meta?.title?.romaji ?: run {
            Log.e("AnimeX", "load: no title for anilistId=$anilistId")
            return null
        }
        val poster = meta?.coverImage?.extraLarge ?: meta?.coverImage?.large ?: ""
        val banner = meta?.bannerImage ?: ""
        val plot = meta?.description?.replace(Regex("<[^>]+>"), "")?.replace("\\n", "\n")
        val genres = meta?.genres ?: emptyList()
        val year = meta?.seasonYear
        val scoreVal = meta?.averageScore?.div(10.0)?.toFloat()

        // 2. Fetch ALL episodes from FlixCloud API (paginated)
        val flixEpisodes = fetchAllFlixEpisodes(anilistId)
        Log.d("AnimeX", "load: $title anilistId=$anilistId flixCount=${flixEpisodes.size}")

        if (flixEpisodes.isEmpty()) {
            Log.e("AnimeX", "load: no FlixCloud episodes for anilistId=$anilistId")
            return null
        }

        // 3. Build episode-title map from AniList streamingEpisode (1-indexed)
        val titleMap = mutableMapOf<Int, String>()
        meta?.streamingEpisode?.forEachIndexed { idx, ep ->
            ep.title?.let { titleMap[idx + 1] = it }
        }

        // 4. Determine movie vs series
        val isMovie = meta?.formatStr == "MOVIE" || flixEpisodes.size <= 1

        if (isMovie) {
            val ep = flixEpisodes.first()
            val movieData = "$mainUrl|${ep.accessId}|sub|1"
            return newMovieLoadResponse(title, url, TvType.AnimeMovie, movieData) {
                this.posterUrl = poster
                this.backgroundPosterUrl = banner
                this.plot = plot
                this.tags = genres
                this.year = year
                if (scoreVal != null) this.score = Score.from10(scoreVal)
            }
        }

        // 5. Build Sub/Dub episode lists
        //    - audio="native"  -> Subbed only
        //    - audio="dual"     -> both Subbed AND Dubbed (same dual-audio HLS, ExoPlayer picks track)
        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        flixEpisodes.filter { it.episode > 0 }.sortedBy { it.episode }.forEach { ep ->
            val epNum = ep.episode
            val epTitle = titleMap[epNum] ?: "Episode $epNum"

            // Sub data string (always present)
            val subData = "$mainUrl|${ep.accessId}|sub|$epNum"
            subEpisodes.add(newEpisode(subData) {
                this.episode = epNum
                this.name = epTitle
            })

            // Dub: only for dual-audio episodes
            if (ep.audio == "dual") {
                val dubData = "$mainUrl|${ep.accessId}|dub|$epNum"
                dubEpisodes.add(newEpisode(dubData) {
                    this.episode = epNum
                    this.name = epTitle
                })
            }
        }

        Log.d("AnimeX", "load: ${subEpisodes.size} sub eps, ${dubEpisodes.size} dub eps")

        return newTvSeriesLoadResponse(title, url, TvType.Anime, subEpisodes) {
            this.posterUrl = poster
            this.backgroundPosterUrl = banner
            this.plot = plot
            this.tags = genres
            this.year = year
            if (scoreVal != null) this.score = Score.from10(scoreVal)
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
        // data format: "$mainUrl|$accessId|$subOrDub|$epNum"
        val parts = data.split("|")
        if (parts.size < 4) {
            Log.e("AnimeX", "loadLinks: bad data='$data'")
            return false
        }
        val accessId = parts[1]
        val subOrDub = parts[2]
        val epNum = parts[3]
        val playerUrl = "$flixUrl/e/$accessId?v=1"

        Log.d("AnimeX", "loadLinks: accessId=$accessId subOrDub=$subOrDub ep=$epNum playerUrl=$playerUrl")

        return try {
            loadExtractor(playerUrl, "$mainUrl/", subtitleCallback, callback)
        } catch (e: Exception) {
            Log.e("AnimeX", "loadLinks: ${e.message}")
            false
        }
    }

    /**
     * Fetch ALL episodes from FlixCloud API across all pages.
     * The `next_page` URL in the response is broken (drops anilist_id), so we build
     * the page URL manually: /videos/raw?anilist_id={id}&page={N}
     */
    private suspend fun fetchAllFlixEpisodes(anilistId: Int): List<FlixEpisode> {
        val all = mutableListOf<FlixEpisode>()
        var pageNum = 1
        var totalPages = 1
        var safety = 0
        while (pageNum <= totalPages && safety < 50) {
            val apiUrl = "$flixUrl/videos/raw?anilist_id=$anilistId&page=$pageNum"
            val parsed = try {
                val resp = app.get(apiUrl, headers = flixHeaders).text
                parseJson<FlixCloudResponse>(resp)
            } catch (e: Exception) {
                Log.e("AnimeX", "fetchAllFlixEpisodes: page=$pageNum failed: ${e.message}")
                break
            }
            all.addAll(parsed.data)
            totalPages = parsed.pagination?.totalPages ?: 1
            pageNum++
            safety++
        }

        // Dedupe by episode number (API returns duplicate uploads for some episodes).
        // Keep the first entry per episode, preferring "dual" audio over "native".
        val byEpisode = all.groupBy { it.episode }
        return byEpisode.mapValues { (_, list) ->
            list.firstOrNull { it.audio == "dual" } ?: list.first()
        }.values.sortedBy { it.episode }
    }

    private fun buildPath(title: String, id: Int): String {
        return title.lowercase()
            .replace("&", "and")
            .replace(Regex("[^a-z0-9\\s-]"), "")
            .replace(Regex("\\s+"), "-")
            .replace(Regex("-+"), "-")
            .trimStart('-').trimEnd('-') + "-$id"
    }
}

// ---------------- AniList data classes ----------------

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListPageResponse(
    @JsonProperty("data") val data: AniListPageData? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListPageData(
    @JsonProperty("Page") val page: AniListPageMedia? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListPageMedia(
    @JsonProperty("media") val media: List<AniListMedia>? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListMediaResponse(
    @JsonProperty("data") val data: AniListMediaData? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListMediaData(
    @JsonProperty("Media") val media: AniListMedia? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListMedia(
    @JsonProperty("id") val id: Int? = null,
    @JsonProperty("title") val title: AniListTitle? = null,
    @JsonProperty("coverImage") val coverImage: AniListCover? = null,
    @JsonProperty("bannerImage") val bannerImage: String? = null,
    @JsonProperty("description") val description: String? = null,
    @JsonProperty("genres") val genres: List<String>? = null,
    @JsonProperty("episodes") val episodes: Int? = null,
    @JsonProperty("format") val formatStr: String? = null,
    @JsonProperty("seasonYear") val seasonYear: Int? = null,
    @JsonProperty("averageScore") val averageScore: Int? = null,
    @JsonProperty("streamingEpisode") val streamingEpisode: List<AniListStreamingEpisode>? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListTitle(
    @JsonProperty("english") val english: String? = null,
    @JsonProperty("romaji") val romaji: String? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListCover(
    @JsonProperty("large") val large: String? = null,
    @JsonProperty("extraLarge") val extraLarge: String? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListStreamingEpisode(
    @JsonProperty("title") val title: String? = null
)

// ---------------- FlixCloud data classes ----------------

@JsonIgnoreProperties(ignoreUnknown = true)
data class FlixCloudResponse(
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("data") val data: List<FlixEpisode> = emptyList(),
    @JsonProperty("pagination") val pagination: FlixPagination? = null
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class FlixEpisode(
    @JsonProperty("access_id") val accessId: String = "",
    @JsonProperty("audio") val audio: String = "native",
    @JsonProperty("anilist_id") val anilistId: Int = 0,
    @JsonProperty("episode") val episode: Int = 0,
    @JsonProperty("player_url") val playerUrl: String = ""
)
@JsonIgnoreProperties(ignoreUnknown = true)
data class FlixPagination(
    @JsonProperty("current_page") val currentPage: Int = 1,
    @JsonProperty("per_page") val perPage: Int = 100,
    @JsonProperty("total_items") val totalItems: Int = 0,
    @JsonProperty("total_pages") val totalPages: Int = 1,
    @JsonProperty("next_page") val nextPage: String? = null,
    @JsonProperty("prev_page") val prevPage: String? = null
)
