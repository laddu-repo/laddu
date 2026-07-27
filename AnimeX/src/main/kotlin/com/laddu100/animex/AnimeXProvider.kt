package com.laddu100.animex

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson

class AnimeXProvider : MainAPI() {
    override var mainUrl = "https://animex.one"
    override var name = "AnimeX"
    override val hasMainPage = true
    override var lang = "en"
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie)

    private val anilistUrl = "https://graphql.anilist.co"

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
        val anilistId = path.substringAfterLast("-").toIntOrNull() ?: return null

        val graphql = """{ Media(id: $anilistId) { id title { english romaji } coverImage { large extraLarge } bannerImage description genres episodes format seasonYear averageScore } }"""
        
        val meta: AniListMedia? = try {
            val resp = app.post(anilistUrl, json = mapOf("query" to graphql)).text
            parseJson<AniListMediaResponse>(resp).data?.media
        } catch (e: Exception) {
            null
        }

        val title = meta?.title?.english ?: meta?.title?.romaji ?: return null
        val poster = meta?.coverImage?.extraLarge ?: meta?.coverImage?.large ?: ""
        val banner = meta?.bannerImage ?: ""
        val plot = meta?.description?.replace(Regex("<[^>]+>"), "")?.replace("\\n", "\n")
        val genres = meta?.genres ?: emptyList()
        val year = meta?.seasonYear
        val scoreVal = meta?.averageScore?.div(10.0)?.toFloat()

        val html = try {
            app.get(url).text
        } catch (e: Exception) {
            return null
        }

        val episodeCount = Regex("""episodeCount:(\d+)""").find(html)?.groupValues?.get(1)?.toIntOrNull()
            ?: Regex("""totalEpisodes:(\d+)""").find(html)?.groupValues?.get(1)?.toIntOrNull()
            ?: meta?.episodes
            ?: 1

        val isMovie = meta?.formatStr == "MOVIE" || episodeCount <= 1

        if (isMovie) {
            val watchUrl = "$mainUrl/watch/$path-episode-1"
            return newMovieLoadResponse(title, url, TvType.AnimeMovie, watchUrl) {
                this.posterUrl = poster
                this.backgroundPosterUrl = banner
                this.plot = plot
                this.tags = genres
                this.year = year
                if (scoreVal != null) this.score = Score.from10(scoreVal)
            }
        }

        val episodes = (1..episodeCount).map { ep ->
            newEpisode("$mainUrl/watch/$path-episode-$ep") {
                this.episode = ep
                this.name = "Episode $ep"
            }
        }

        return newTvSeriesLoadResponse(title, url, TvType.Anime, episodes) {
            this.posterUrl = poster
            this.backgroundPosterUrl = banner
            this.plot = plot
            this.tags = genres
            this.year = year
            if (scoreVal != null) this.score = Score.from10(scoreVal)
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return try {
            val html = app.get(data).text

            val playerUrl = Regex("""player_url:"([^"]+)"""").find(html)?.groupValues?.get(1)
                ?: return false

            loadExtractor(playerUrl, data, subtitleCallback, callback)
        } catch (e: Exception) {
            Log.e("AnimeX", "loadLinks: ${e.message}")
            false
        }
    }

    private fun buildPath(title: String, id: Int): String {
        return title.lowercase()
            .replace("&", "and")
            .replace(Regex("[^a-z0-9\\s-]"), "")
            .replace(Regex("\\s+"), "-")
            .replace(Regex("-+"), "-")
            .trim("-") + "-$id"
    }
}

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
    @JsonProperty("averageScore") val averageScore: Int? = null
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
