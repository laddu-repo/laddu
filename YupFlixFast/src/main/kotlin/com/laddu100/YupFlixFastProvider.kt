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
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class YupFlixFastProvider : MainAPI() {
    override var mainUrl = "https://watch.yupflix.org"
    override var name = "YupFlixFast"
    override var lang = "hi"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    private val apiUrl = "https://jolly-mouse-f41c.annierane.workers.dev"
    private val TAG = "YupFlix"

    // ==================== DATA MODELS ====================

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class MovieListResponse(
        @JsonProperty("data") val data: List<ContentItem>? = null,
        @JsonProperty("page") val page: Int? = null,
        @JsonProperty("totalPages") val totalPages: Int? = null,
        @JsonProperty("total") val total: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchApiResponse(
        @JsonProperty("movies") val movies: List<ContentItem>? = null,
        @JsonProperty("series") val series: List<ContentItem>? = null,
        @JsonProperty("total") val total: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ContentItem(
        @JsonProperty("_id") val id: String,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("posterPath") val posterPath: String? = null,
        @JsonProperty("backdropPath") val backdropPath: String? = null,
        @JsonProperty("releaseDate") val releaseDate: String? = null,
        @JsonProperty("firstAirDate") val firstAirDate: String? = null,
        @JsonProperty("genres") val genres: List<Genre>? = null,
        @JsonProperty("categories") val categories: List<String>? = null,
        @JsonProperty("voteAverage") val voteAverage: Double? = null,
        @JsonProperty("runtime") val runtime: Int? = null,
        @JsonProperty("numberOfSeasons") val numberOfSeasons: Int? = null,
        @JsonProperty("numberOfEpisodes") val numberOfEpisodes: Int? = null,
        @JsonProperty("type") val type: String? = null,
        @JsonProperty("contentType") val contentType: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Genre(
        @JsonProperty("name") val name: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class MovieDetail(
        @JsonProperty("_id") val id: String,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("posterPath") val posterPath: String? = null,
        @JsonProperty("backdropPath") val backdropPath: String? = null,
        @JsonProperty("releaseDate") val releaseDate: String? = null,
        @JsonProperty("genres") val genres: List<Genre>? = null,
        @JsonProperty("categories") val categories: List<String>? = null,
        @JsonProperty("voteAverage") val voteAverage: Double? = null,
        @JsonProperty("runtime") val runtime: Int? = null,
        @JsonProperty("streamingLinks") val streamingLinks: List<StreamLink>? = null,
        @JsonProperty("enableStream") val enableStream: Boolean? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SeriesDetail(
        @JsonProperty("_id") val id: String,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("posterPath") val posterPath: String? = null,
        @JsonProperty("backdropPath") val backdropPath: String? = null,
        @JsonProperty("firstAirDate") val firstAirDate: String? = null,
        @JsonProperty("genres") val genres: List<Genre>? = null,
        @JsonProperty("categories") val categories: List<String>? = null,
        @JsonProperty("voteAverage") val voteAverage: Double? = null,
        @JsonProperty("numberOfSeasons") val numberOfSeasons: Int? = null,
        @JsonProperty("seasons") val seasons: List<Season>? = null,
        @JsonProperty("enableWatch") val enableWatch: Boolean? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Season(
        @JsonProperty("seasonNumber") val seasonNumber: Int? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("episodes") val episodes: List<EpisodeData>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeData(
        @JsonProperty("episodeNumber") val episodeNumber: Int? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("stillPath") val stillPath: String? = null,
        @JsonProperty("airDate") val airDate: String? = null,
        @JsonProperty("runtime") val runtime: Int? = null,
        @JsonProperty("streamingLinks") val streamingLinks: List<StreamLink>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamLink(
        @JsonProperty("quality") val quality: String? = null,
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("type") val type: String? = null,
        @JsonProperty("isActive") val isActive: Boolean? = null
    )

    // Load data for loadLinks
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class LoadData(
        val title: String,
        val streamLinks: List<StreamLink>,
        val posterUrl: String? = null,
        val isSeries: Boolean = false
    )

    // ==================== HELPERS ====================

    private fun ContentItem.getType(): String {
        return type ?: contentType ?: "movie"
    }

    private fun ContentItem.getYear(): Int? {
        val date = releaseDate ?: firstAirDate
        return date?.take(4)?.toIntOrNull()
    }

    private fun ContentItem.getPoster(): String? {
        return posterPath ?: backdropPath
    }

    // ==================== getMainPage ====================

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' page=$page")
        val lists = mutableListOf<HomePageList>()

        try {
            when (request.name) {
                "All" -> {
                    coroutineScope {
                        // Fetch all sections in parallel
                        val latestDeferred = async { fetchMovies("sort=latest", 30) }
                        val bollywoodDeferred = async { fetchMovies("category=Bollywood", 30) }
                        val hollywoodDeferred = async { fetchMovies("category=Hollywood", 30) }
                        val actionDeferred = async { fetchMovies("genre=Action", 30) }
                        val comedyDeferred = async { fetchMovies("genre=Comedy", 30) }
                        val dramaDeferred = async { fetchMovies("genre=Drama", 30) }

                        val latest = latestDeferred.await()
                        if (latest.isNotEmpty()) {
                            lists.add(HomePageList("🆕 Latest", latest, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Latest -> ${latest.size}")
                        }

                        val bollywood = bollywoodDeferred.await()
                        if (bollywood.isNotEmpty()) {
                            lists.add(HomePageList("🎬 Bollywood", bollywood, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Bollywood -> ${bollywood.size}")
                        }

                        val hollywood = hollywoodDeferred.await()
                        if (hollywood.isNotEmpty()) {
                            lists.add(HomePageList("🎥 Hollywood", hollywood, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Hollywood -> ${hollywood.size}")
                        }

                        val action = actionDeferred.await()
                        if (action.isNotEmpty()) {
                            lists.add(HomePageList("💥 Action", action, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Action -> ${action.size}")
                        }

                        val comedy = comedyDeferred.await()
                        if (comedy.isNotEmpty()) {
                            lists.add(HomePageList("😂 Comedy", comedy, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Comedy -> ${comedy.size}")
                        }

                        val drama = dramaDeferred.await()
                        if (drama.isNotEmpty()) {
                            lists.add(HomePageList("🎭 Drama", drama, isHorizontalImages = true))
                            Log.d(TAG, "getMainPage: Drama -> ${drama.size}")
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
        "$apiUrl/api/movies/public" to "All"
    )

    private suspend fun fetchMovies(params: String, limit: Int): List<SearchResponse> {
        return try {
            val url = "$apiUrl/api/movies/public?$params&page=1&limit=$limit"
            Log.d(TAG, "fetchMovies: $url")
            val res = app.get(url, timeout = 30_000L)
            val parsed = parseJson<MovieListResponse>(res.text)
            val data = parsed.data ?: emptyList()
            Log.d(TAG, "fetchMovies: got ${data.size} items (total: ${parsed.total})")
            data.mapNotNull { it.toSearchResponse() }
        } catch (e: Exception) {
            Log.e(TAG, "fetchMovies FAILED: ${e.message}")
            emptyList()
        }
    }

    // Use CloudStream's SearchResponse via typealias to avoid conflict with our data class
    

    private fun ContentItem.toSearchResponse(): SearchResponse? {
        val title = title ?: return null
        val contentType = getType()
        val tvType = if (contentType == "series") TvType.TvSeries else TvType.Movie
        // Data format: "$mainUrl|$id|$contentType"
        val data = "$mainUrl|$id|$contentType"
        Log.d(TAG, "toSearchResponse: '$title' type=$contentType id=$id")
        return newMovieSearchResponse(title, data, tvType) {
            this.posterUrl = getPoster()
            this.year = getYear()
        }
    }

    // ==================== search ====================

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search START: query='$query'")
        if (query.length < 2) return emptyList()
        return try {
            val encoded = java.net.URLEncoder.encode(query, "UTF-8")
            val url = "$apiUrl/api/search?q=$encoded&limit=20"
            Log.d(TAG, "search: $url")
            val res = app.get(url, timeout = 30_000L)
            val parsed = parseJson<SearchApiResponse>(res.text)
            Log.d(TAG, "search: movies=${parsed.movies?.size ?: 0} series=${parsed.series?.size ?: 0}")

            val results = mutableListOf<SearchResponse>()
            parsed.movies?.forEach { results.add(it.toSearchResponse() ?: return@forEach) }
            parsed.series?.forEach {
                val sr = it.copy(contentType = "series").toSearchResponse()
                sr?.let { results.add(it) }
            }
            Log.d(TAG, "search END: ${results.size} results")
            results
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED: ${e.message}")
            emptyList()
        }
    }

    // ==================== load ====================

    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load START: url='$url'")
        // Parse: "$mainUrl|$id|$contentType"
        val parts = url.split("|")
        if (parts.size < 3) {
            Log.e(TAG, "load: invalid url format")
            return null
        }
        val contentId = parts[1]
        val contentType = parts[2]
        val isSeries = contentType == "series"
        Log.d(TAG, "load: id=$contentId isSeries=$isSeries")

        return try {
            if (isSeries) {
                loadSeries(contentId)
            } else {
                loadMovie(contentId)
            }
        } catch (e: Exception) {
            Log.e(TAG, "load FAILED: ${e.message}")
            null
        }
    }

    private suspend fun loadMovie(id: String): LoadResponse? {
        val url = "$apiUrl/api/movies/public/$id"
        Log.d(TAG, "loadMovie: $url")
        val res = app.get(url, timeout = 30_000L)
        val movie = parseJson<MovieDetail>(res.text)
        Log.d(TAG, "loadMovie: title='${movie.title}' streams=${movie.streamingLinks?.size ?: 0}")

        val title = movie.title ?: return null
        val poster = movie.posterPath ?: movie.backdropPath
        val plot = movie.overview
        val year = movie.releaseDate?.take(4)?.toIntOrNull()
        val genres = movie.genres?.mapNotNull { it.name }?.filter { it.isNotBlank() }
        val streamLinks = movie.streamingLinks?.filter { it.isActive != false && !it.url.isNullOrBlank() } ?: emptyList()
        Log.d(TAG, "loadMovie: active streams=${streamLinks.size}")

        val loadData = LoadData(title = title, streamLinks = streamLinks, posterUrl = poster, isSeries = false)

        return newMovieLoadResponse(title, "$mainUrl|$id|movie", TvType.Movie, loadData.toJson()) {
            this.posterUrl = poster
            this.plot = plot
            this.year = year
            this.tags = genres
        }
    }

    private suspend fun loadSeries(id: String): LoadResponse? {
        val url = "$apiUrl/api/series/public/$id"
        Log.d(TAG, "loadSeries: $url")
        val res = app.get(url, timeout = 30_000L)
        val series = parseJson<SeriesDetail>(res.text)
        Log.d(TAG, "loadSeries: title='${series.title}' seasons=${series.seasons?.size ?: 0}")

        val title = series.title ?: return null
        val poster = series.posterPath ?: series.backdropPath
        val plot = series.overview
        val year = series.firstAirDate?.take(4)?.toIntOrNull()
        val genres = series.genres?.mapNotNull { it.name }?.filter { it.isNotBlank() }

        val episodes = mutableListOf<com.lagradost.cloudstream3.Episode>()
        series.seasons?.forEach { season ->
            val seasonNum = season.seasonNumber ?: 1
            season.episodes?.forEach { ep ->
                val epNum = ep.episodeNumber ?: return@forEach
                val epTitle = ep.name ?: "Episode $epNum"
                val streamLinks = ep.streamingLinks?.filter { it.isActive != false && !it.url.isNullOrBlank() } ?: emptyList()
                if (streamLinks.isEmpty()) return@forEach

                val loadData = LoadData(
                    title = "$title S${seasonNum}E$epNum",
                    streamLinks = streamLinks,
                    posterUrl = ep.stillPath ?: poster,
                    isSeries = true
                )
                episodes.add(newEpisode(loadData.toJson()) {
                    this.name = epTitle
                    this.season = seasonNum
                    this.episode = epNum
                    this.posterUrl = ep.stillPath
                })
                Log.d(TAG, "loadSeries: S${seasonNum}E$epNum '$epTitle' streams=${streamLinks.size}")
            }
        }

        Log.d(TAG, "loadSeries: total episodes=${episodes.size}")
        return newTvSeriesLoadResponse(title, "$mainUrl|$id|series", TvType.TvSeries, episodes) {
            this.posterUrl = poster
            this.plot = plot
            this.year = year
            this.tags = genres
        }
    }

    // ==================== loadLinks ====================

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START")

        val loadData = try {
            parseJson<LoadData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: parse error: ${e.message}")
            return false
        }

        Log.d(TAG, "loadLinks: title='${loadData.title}' streams=${loadData.streamLinks.size}")
        if (loadData.streamLinks.isEmpty()) {
            Log.e(TAG, "loadLinks: no stream links")
            return false
        }

        var found = false
        // Group all streams under a single source name with different qualities
        // ExoPlayer will show them in the quality selector (tracks section)
        val bestUrl = loadData.streamLinks.firstNotNullOfOrNull { it.url }
        if (bestUrl != null) {
            Log.d(TAG, "loadLinks: single source with ${loadData.streamLinks.size} qualities")
            for (link in loadData.streamLinks) {
                val url = link.url ?: continue
                val qualityStr = link.quality ?: "Unknown"
                val quality = when {
                    qualityStr.contains("1080") -> Qualities.P1080.value
                    qualityStr.contains("720") -> Qualities.P720.value
                    qualityStr.contains("480") -> Qualities.P480.value
                    qualityStr.contains("360") -> Qualities.P360.value
                    else -> Qualities.Unknown.value
                }
                Log.d(TAG, "loadLinks: quality=$qualityStr url=${url.take(80)}")

                try {
                    if (url.contains(".m3u8") || link.type == "hls") {
                        M3u8Helper.generateM3u8(
                            source = name,
                            streamUrl = url,
                            referer = mainUrl
                        ).forEach {
                            callback.invoke(it)
                        }
                        found = true
                        Log.d(TAG, "loadLinks: $qualityStr m3u8 added")
                    } else {
                        callback.invoke(
                            com.lagradost.cloudstream3.utils.newExtractorLink(
                                source = name,
                                name = name,
                                url = url,
                                type = ExtractorLinkType.VIDEO
                            ) {
                                this.quality = quality
                            }
                        )
                        found = true
                        Log.d(TAG, "loadLinks: $qualityStr direct link added")
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "loadLinks: $qualityStr FAILED: ${e.message}")
                }
            }
        }

        Log.d(TAG, "loadLinks END: found=$found")
        return found
    }
}

// Episode class (CloudStream's Episode has different constructor)

