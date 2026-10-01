package com.primeshows

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.JsonParser
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.amap
import com.lagradost.cloudstream3.utils.loadExtractor
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import java.net.URLEncoder

class PrimeShowsProvider : MainAPI() {
    override var mainUrl = "https://primeshows.uk"
    override var name = "PrimeShows"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries, TvType.Anime)

    private val tmdbProxy = "$mainUrl/api/proxy/tmdb"
    private val downloadApi = "$mainUrl/api/proxy/download"

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "application/json",
        "Referer" to "$mainUrl/",
    )

    // ── Embed Sources (13 total, from site's player JS) ──
    data class EmbedSource(
        val id: String,
        val label: String,
        val description: String,
        val isHindi: Boolean = false,
        val isAnime: Boolean = false,
        val animeType: String? = null  // "sub", "dub", "hindi"
    )

    private val embedSources = listOf(
        EmbedSource("videasy", "Videasy", "Premium"),
        EmbedSource("vidfast", "Vidfast", "Fast"),
        EmbedSource("vidcore", "Vidcore", "Fast Stream"),
        EmbedSource("vidrock", "Vidrock", "External"),
        EmbedSource("vidup", "Vidup", "Fast Stream"),
        EmbedSource("screenscape", "Scapa [Hindi]", "Hindi", isHindi = true),
        EmbedSource("rozar", "Rozar [Hindi]", "Hindi", isHindi = true),
        EmbedSource("vidshows", "Vidshows", "Special"),
        EmbedSource("anime-mega-sub", "Anime Mega Sub", "Anime Sub", isAnime = true, animeType = "sub"),
        EmbedSource("anime-mega-dub", "Anime Mega Dub", "Anime Dub", isAnime = true, animeType = "dub"),
        EmbedSource("anime-fizz-sub", "Anime Fizz Sub", "Anime Sub", isAnime = true, animeType = "sub"),
        EmbedSource("anime-fizz-dub", "Anime Fizz Dub", "Anime Dub", isAnime = true, animeType = "dub"),
        EmbedSource("anime-fizz-hindi", "Anime Fizz Hindi", "Anime Hindi", isAnime = true, animeType = "hindi")
    )

    // ── Data Classes ──
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TMDBResponse(@JsonProperty("results") val results: List<TMDBItem>? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TMDBItem(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("poster_path") val posterPath: String? = null,
        @JsonProperty("backdrop_path") val backdropPath: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("media_type") val mediaType: String? = null,
        @JsonProperty("release_date") val releaseDate: String? = null,
        @JsonProperty("first_air_date") val firstAirDate: String? = null,
        @JsonProperty("vote_average") val voteAverage: Double? = null,
        @JsonProperty("genre_ids") val genreIds: List<Int>? = null,
        @JsonProperty("original_language") val originalLanguage: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TMDBDetail(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("poster_path") val posterPath: String? = null,
        @JsonProperty("backdrop_path") val backdropPath: String? = null,
        @JsonProperty("release_date") val releaseDate: String? = null,
        @JsonProperty("first_air_date") val firstAirDate: String? = null,
        @JsonProperty("vote_average") val voteAverage: Double? = null,
        @JsonProperty("genres") val genres: List<TMDBGenre>? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("seasons") val seasons: List<TMDBSeason>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TMDBGenre(@JsonProperty("name") val name: String? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TMDBSeason(
        @JsonProperty("season_number") val seasonNumber: Int? = null,
        @JsonProperty("episode_count") val episodeCount: Int? = null,
        @JsonProperty("name") val name: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TMDBSeasonDetail(@JsonProperty("episodes") val episodes: List<TMDBEpisode>? = null)

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TMDBEpisode(
        @JsonProperty("episode_number") val episodeNumber: Int? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("overview") val overview: String? = null,
        @JsonProperty("still_path") val stillPath: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class DownloadSource(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("quality") val quality: String? = null,
        @JsonProperty("size") val size: String? = null,
        @JsonProperty("language") val language: String? = null,
        @JsonProperty("source") val source: String? = null,
        @JsonProperty("provider") val provider: String? = null
    )

    data class EpisodeLoadData(
        val tmdbId: Int,
        val mediaType: String,  // "movie", "tv", "anime"
        val title: String,
        val season: Int? = null,
        val episode: Int? = null
    )

    // ── TMDB Proxy Helper ──
    private suspend fun tmdbGet(endpoint: String): String? {
        val url = "$tmdbProxy?endpoint=${URLEncoder.encode(endpoint, "UTF-8")}&language=en-US"
        return try {
            app.get(url, headers = headers).text
        } catch (e: Exception) {
            println("PrimeShows: TMDB failed $endpoint - ${e.message}")
            null
        }
    }

    private fun img(path: String?, size: String = "w500"): String? {
        if (path.isNullOrBlank()) return null
        return "$mainUrl/tmdb/image/$size$path"
    }

    // ── Build embed URL for a source ──
    private fun buildEmbedUrl(sourceId: String, tmdbId: Int, mediaType: String, season: Int?, episode: Int?): String? {
        return when (sourceId) {
            "videasy" -> if (mediaType == "movie") "https://player.videasy.to/movie/$tmdbId"
                         else "https://player.videasy.to/tv/$tmdbId/${season ?: 1}/${episode ?: 1}"
            "vidfast" -> if (mediaType == "movie") "https://vidfast.pro/movie/$tmdbId?nextButton=true&autoNext=true"
                         else "https://vidfast.pro/tv/$tmdbId/${season ?: 1}/${episode ?: 1}"
            "vidcore" -> if (mediaType == "movie") "https://vidcore.net/movie/$tmdbId?autoPlay=true"
                         else "https://vidcore.net/tv/$tmdbId/${season ?: 1}/${episode ?: 1}?autoPlay=true"
            "vidrock" -> if (mediaType == "movie") "https://vidrock.ru/movie/$tmdbId"
                         else "https://vidrock.ru/tv/$tmdbId/${season ?: 1}/${episode ?: 1}"
            "vidup" -> if (mediaType == "movie") "https://vidup.to/movie/$tmdbId?autoPlay=true"
                       else "https://vidup.to/tv/$tmdbId/${season ?: 1}/${episode ?: 1}?autoPlay=true"
            "screenscape" -> if (mediaType == "movie") "https://embed.screenscape.me/embed?tmdb=$tmdbId&type=movie"
                             else "https://embed.screenscape.me/embed?tmdb=$tmdbId&type=tv&s=${season ?: 1}&e=${episode ?: 1}"
            "rozar" -> if (mediaType == "movie") "https://rozgarlelo.modiplay.xyz/embed/tmdb/movie?id=$tmdbId"
                       else "https://rozgarlelo.modiplay.xyz/embed/tmdb/tv?id=$tmdbId&s=${season ?: 1}&e=${episode ?: 1}"
            "vidshows" -> if (mediaType == "movie") "https://player.vidshows.xyz/embed/movie/$tmdbId"
                          else "https://player.vidshows.xyz/embed/tv/$tmdbId/${season ?: 1}/${episode ?: 1}"
            "anime-mega-sub" -> "https://tryembed.us.cc/embed/anime/$tmdbId/${episode ?: 1}/sub"
            "anime-mega-dub" -> "https://tryembed.us.cc/embed/anime/$tmdbId/${episode ?: 1}/dub"
            "anime-fizz-sub" -> "https://vidnest.fun/anime/$tmdbId/${episode ?: 1}/sub"
            "anime-fizz-dub" -> "https://vidnest.fun/anime/$tmdbId/${episode ?: 1}/dub"
            "anime-fizz-hindi" -> "https://vidnest.fun/anime/$tmdbId/${episode ?: 1}/hindi"
            else -> null
        }
    }

    // ── Main Page ──
    override val mainPage = mainPageOf(
        "trending" to "Trending Now",
        "movie" to "Popular Movies",
        "tv" to "Popular TV Shows",
        "top_movies" to "Top Rated Movies",
        "top_tv" to "Top Rated TV",
        "anime" to "Popular Anime"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val endpoint = when (request.data) {
            "trending" -> "/trending/all/week"
            "movie" -> "/movie/popular"
            "tv" -> "/tv/popular"
            "top_movies" -> "/movie/top_rated"
            "top_tv" -> "/tv/top_rated"
            "anime" -> "/discover/tv?with_genres=16&sort_by=popularity.desc"
            else -> "/movie/popular"
        }
        val mediaOverride = when (request.data) {
            "movie", "top_movies" -> "movie"
            "tv", "top_tv", "anime" -> "tv"
            else -> null
        }
        val home = try {
            val text = tmdbGet("$endpoint&page=$page") ?: ""
            val resp = parseJson<TMDBResponse>(text)
            resp.results?.mapNotNull { it.toSearch(mediaOverride) } ?: emptyList()
        } catch (e: Exception) {
            println("PrimeShows: HomePage error - ${e.message}")
            emptyList()
        }
        return newHomePageResponse(request.name, home)
    }

    private fun TMDBItem.toSearch(mediaOverride: String? = null): SearchResponse? {
        val id = id ?: return null
        val t = title ?: name ?: return null
        val mt = mediaOverride ?: mediaType ?: if (title != null) "movie" else "tv"
        val type = if (mt == "movie") TvType.Movie else TvType.TvSeries
        return newMovieSearchResponse(t, "$mainUrl/info/$id/$mt", type) {
            posterUrl = img(posterPath)
        }
    }

    // ── Search ──
    override suspend fun search(query: String): List<SearchResponse> {
        return try {
            val text = tmdbGet("/search/multi?query=${URLEncoder.encode(query, "UTF-8")}&page=1") ?: return emptyList()
            val resp = parseJson<TMDBResponse>(text)
            resp.results?.filter { it.mediaType in listOf("movie", "tv") }?.mapNotNull { it.toSearch() } ?: emptyList()
        } catch (e: Exception) { emptyList() }
    }

    // ── Load ──
    override suspend fun load(url: String): LoadResponse? {
        return try {
            // URL format: https://primeshows.uk/info/{tmdbId}/{mediaType}
            val regex = Regex("""/info/(\d+)/(movie|tv|anime)""")
            val match = regex.find(url) ?: run {
                println("PrimeShows: Could not parse URL: $url")
                return null
            }
            val tmdbId = match.groupValues[1].toIntOrNull() ?: return null
            val mediaType = match.groupValues[2]
            val isMovie = mediaType == "movie"

            val detailText = tmdbGet(if (isMovie) "/movie/$tmdbId" else "/tv/$tmdbId") ?: return null
            val detail = parseJson<TMDBDetail>(detailText)

            val title = detail.title ?: detail.name ?: "Unknown"
            val poster = img(detail.posterPath)
            val banner = img(detail.backdropPath, "w1280")
            val plot = detail.overview
            val year = (detail.releaseDate ?: detail.firstAirDate)?.take(4)?.toIntOrNull()
            val genres = detail.genres?.mapNotNull { it.name } ?: emptyList()

            if (isMovie) {
                newMovieLoadResponse(title, url, TvType.Movie, EpisodeLoadData(tmdbId, "movie", title).toJson()) {
                    this.posterUrl = poster
                    this.backgroundPosterUrl = banner
                    this.year = year
                    this.plot = plot
                    this.tags = genres
                }
            } else {
                val seasons = detail.seasons?.filter { (it.seasonNumber ?: 0) > 0 } ?: emptyList()
                val episodes = mutableListOf<Episode>()
                for (season in seasons) {
                    val sNum = season.seasonNumber ?: continue
                    val sText = tmdbGet("/tv/$tmdbId/season/$sNum") ?: continue
                    val sDetail = try { parseJson<TMDBSeasonDetail>(sText) } catch (_: Exception) { null }
                    sDetail?.episodes?.forEach { ep ->
                        val eNum = ep.episodeNumber ?: return@forEach
                        episodes.add(newEpisode(EpisodeLoadData(tmdbId, mediaType, title, sNum, eNum).toJson()) {
                            this.episode = eNum
                            this.season = sNum
                            this.name = ep.name ?: "S${sNum}E${eNum}"
                            this.description = ep.overview
                            this.posterUrl = img(ep.stillPath, "w300")
                        })
                    }
                }
                val showStatus = when {
                    detail.status?.contains("Returning", true) == true -> ShowStatus.Ongoing
                    detail.status?.contains("Ended", true) == true -> ShowStatus.Completed
                    else -> null
                }
                newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
                    this.posterUrl = poster
                    this.backgroundPosterUrl = banner
                    this.year = year
                    this.plot = plot
                    this.tags = genres
                    this.showStatus = showStatus
                }
            }
        } catch (e: Exception) {
            println("PrimeShows: load error - ${e.message}")
            null
        }
    }

    // ── Load Links ──
    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val ld = try { parseJson<EpisodeLoadData>(data) } catch (_: Exception) { return false }
        val tmdbId = ld.tmdbId
        val mediaType = ld.mediaType
        val title = ld.title
        val season = ld.season
        val episode = ld.episode
        val seenUrls = mutableSetOf<String>()

        // ── 1. Embed sources — run CONCURRENTLY for speed ──
        // Each source is resolved via custom ExtractorApi (WebViewResolver)
        // Running them in parallel means total time = max(15s) not 10×15s
        val validSources = embedSources.filter { source ->
            if (mediaType != "anime" && source.isAnime) false
            else if (mediaType == "anime" && !source.isAnime) false
            else true
        }

        validSources.amap { source ->
            val embedUrl = buildEmbedUrl(source.id, tmdbId, mediaType, season, episode) ?: return@amap false
            if (!seenUrls.add(embedUrl)) return@amap false
            try {
                loadExtractor(embedUrl, "$mainUrl/", subtitleCallback, callback)
                true
            } catch (e: Exception) {
                println("PrimeShows: ${source.label} failed - ${e.message}")
                false
            }
        }

        // ── 2. Download API — ONLY wasabisys + 111477.xyz (proven playable) ──
        try {
            val dlUrl = if (mediaType == "movie") {
                "$downloadApi/movie?id=$tmdbId&title=${URLEncoder.encode(title, "UTF-8")}"
            } else {
                "$downloadApi/tv?id=$tmdbId&title=${URLEncoder.encode(title, "UTF-8")}&season=${season ?: 1}&episode=${episode ?: 1}"
            }
            val dlHeaders = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
                "Accept" to "application/json",
                "Referer" to if (mediaType == "movie") "$mainUrl/movies/$tmdbId" else "$mainUrl/tv/$tmdbId"
            )
            val dlText = app.get(dlUrl, headers = dlHeaders).text
            val sources = try { parseJson<List<DownloadSource>>(dlText) } catch (_: Exception) { emptyList() }

            for (src in sources) {
                val url = src.url ?: continue
                if (url.startsWith("magnet:") || !seenUrls.add(url)) continue

                val srcName = src.source ?: src.provider ?: "Direct"
                val lang = src.language ?: ""
                val quality = parseQuality(src.quality)
                val label = buildLabel(srcName, quality, lang, src.size)

                // ONLY include wasabisys (direct S3) and 111477.xyz (CDN redirect)
                // Skip ALL other sources (goodstream=HTML, hubcloud=file host, etc.)
                if (url.contains("wasabisys", true)) {
                    callback.invoke(
                        newExtractorLink("PrimeShows", label, url, ExtractorLinkType.VIDEO) {
                            this.quality = quality
                            this.headers = dlHeaders
                        }
                    )
                } else if (url.contains("111477.xyz", true)) {
                    try {
                        val resp = app.get(url, headers = dlHeaders, allowRedirects = false)
                        val location = resp.headers["location"] ?: url
                        callback.invoke(
                            newExtractorLink("PrimeShows", label, location, ExtractorLinkType.VIDEO) {
                                this.quality = quality
                                this.headers = dlHeaders
                            }
                        )
                    } catch (_: Exception) {
                        callback.invoke(
                            newExtractorLink("PrimeShows", label, url, ExtractorLinkType.VIDEO) {
                                this.quality = quality
                                this.headers = dlHeaders
                            }
                        )
                    }
                }
                // ALL other URLs are skipped — no more broken Primebox sources
            }
        } catch (e: Exception) {
            println("PrimeShows: Download API failed - ${e.message}")
        }

        return true
    }

    private fun parseQuality(q: String?): Int {
        if (q.isNullOrBlank()) return -1
        return when {
            q.contains("4k", true) || q.contains("2160") -> 2160
            q.contains("1080") -> 1080
            q.contains("720") -> 720
            q.contains("480") -> 480
            else -> -1
        }
    }

    private fun buildLabel(name: String, quality: Int, lang: String, size: String?): String {
        val parts = mutableListOf(name)
        if (quality > 0) parts.add("${quality}p")
        if (lang.isNotBlank() && !lang.equals("Unknown", true)) parts.add(lang)
        if (size != null && size != "Unknown") parts.add(size)
        return parts.joinToString(" - ")
    }
}
