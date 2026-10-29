package com.laddu100.netmirror

import com.lagradost.api.Log
import com.lagradost.cloudstream3.Actor
import com.lagradost.cloudstream3.ActorData
import com.lagradost.cloudstream3.Episode
import com.lagradost.cloudstream3.ErrorLoadingException
import com.lagradost.cloudstream3.HomePageList
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.Score
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.newMovieLoadResponse
import com.lagradost.cloudstream3.newMovieSearchResponse
import com.lagradost.cloudstream3.newTvSeriesLoadResponse
import com.lagradost.cloudstream3.newTvSeriesSearchResponse
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.getQualityFromName
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.newSubtitleFile

/**
 * NetMirror provider - rebuilt from scratch against the CURRENT site
 * architecture (2026-10, reverse-engineered from the official APK + live
 * web app; see NetMirrorApi.kt header for the full protocol notes).
 *
 * Row list mirrors the site homepage (tranding ids + language filters are
 * the site's own values). CloudStream pages are 1-based; the API is 0-based.
 */
class NetMirrorProvider : MainAPI() {

    override var mainUrl = "https://netmirror.plus"
    override var name = "NetMirror"
    override var lang = "en"
    override val hasMainPage = true
    override val hasChromecastSupport = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries, TvType.AsianDrama)

    // The site's own genre id -> name map (from const Vd in the app bundle).
    private val genreNames = mapOf(
        "200" to "Action", "8" to "Adventure", "23" to "Thriller", "101" to "Erotic",
        "10" to "Animation", "20" to "Romance", "11" to "Short", "12" to "Comedy",
        "13" to "Crime", "14" to "Drama", "15" to "History", "16" to "Mystery",
        "25" to "Documentary", "27" to "Sport", "30" to "Sci-Fi", "32" to "War",
        "41" to "Fantasy", "34" to "Horror", "29" to "Biography", "38" to "Family",
        "39" to "Cartoon", "43" to "Reality-TV", "63" to "Nollywood", "47" to "Music",
        "49" to "Game-Show", "52" to "Musical", "55" to "Story", "58" to "Western",
        "64" to "Talk-Show", "85" to "News", "53" to "Learning", "54" to "Language",
        "56" to "Art", "80" to "Show", "81" to "School", "83" to "Youth",
        "84" to "Food", "88" to "LGBTQ", "7" to "Action", "1" to "Movie",
        "2" to "Series", "3" to "Short", "4" to "Drama", "5" to "Comedy",
        "6" to "Documentary", "9" to "TV Show",
    )

    override val mainPage = mainPageOf(
        "tranding?id=11&items_per_page=15" to "Trending Now",
        "tranding?id=60&items_per_page=15" to "Trending Movies",
        "tranding?id=61&items_per_page=15" to "Trending Series",
        "movies/filter?sort_by=date&dubbing=Hindi&country=india&items_per_page=30" to "Latest Hindi",
        "movies/filter?sort_by=date&dubbing=Hindi&countryNotParam=india&items_per_page=30" to "Latest Hindi Dub",
        "movies/filter?sort_by=date&dubbing=Telugu&items_per_page=30" to "Latest Telugu",
        "movies/filter?sort_by=date&dubbing=Tamil&items_per_page=30" to "Latest Tamil",
        "movies/filter?sort_by=date&dubbing=Kannada&items_per_page=30" to "Latest Kannada",
        "movies/filter?sort_by=date&dubbing=Malayalam&items_per_page=30" to "Latest Malayalam",
        // Latest English: the site's exact filter (title_not[] 1-8, cn_multi[] 1-8)
        ("movies/filter?title_not%5B%5D=1&title_not%5B%5D=2&title_not%5B%5D=3&title_not%5B%5D=4" +
                "&title_not%5B%5D=5&title_not%5B%5D=6&title_not%5B%5D=7&title_not%5B%5D=8" +
                "&cn_multi%5B%5D=1&cn_multi%5B%5D=3&cn_multi%5B%5D=4&cn_multi%5B%5D=5" +
                "&cn_multi%5B%5D=6&cn_multi%5B%5D=7&cn_multi%5B%5D=8&sort_by=date&items_per_page=30")
                to "Latest English",
        ("movies/filter?sort_by=created&title_con%5B%5D=1&title_con%5B%5D=2&title_con%5B%5D=6" +
                "&title_con%5B%5D=7&title_con%5B%5D=8&items_per_page=30") to "Newly Added",
        "movies/filter?type=2&dubbing=Hindi&items_per_page=30" to "Latest TV Shows",
        "tranding?id=14&items_per_page=15" to "Bollywood",
        "tranding?id=13&items_per_page=15" to "Hollywood",
        "tranding?id=15&items_per_page=15" to "South Indian",
        "tranding?id=38&items_per_page=15" to "Indian Drama",
        "tranding?id=18&items_per_page=15" to "K-Drama",
        "tranding?id=39&items_per_page=15" to "C-Drama",
        "tranding?id=40&items_per_page=15" to "Western TV",
        "tranding?id=41&items_per_page=15" to "Turkish Drama",
        "tranding?id=37&items_per_page=15" to "Reality TV",
        "tranding?id=9&items_per_page=15" to "Top Rated Series",
    )

    // ------------------------------------------------------------- main page

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse? {
        val apiPage = page - 1
        if (apiPage < 0) return null
        val data = NetMirrorApi.list(request.data, apiPage) ?: return null
        val items = data.results.mapNotNull { it.toSearchResponse() }
        val hasNext = data.pager?.let { (it.total_pages ?: 0) > apiPage + 1 } ?: (items.size >= 15)
        return newHomePageResponse(
            HomePageList(request.name, items, isHorizontalImages = true),
            hasNext = hasNext && items.isNotEmpty(),
        )
    }

    private fun NetMirrorMediaItem.toSearchResponse(): SearchResponse? {
        val id = id?.trim() ?: return null
        val title = title?.trim().takeUnless { it.isNullOrBlank() } ?: "Untitled"
        val poster = backdrop_path?.takeIf { it.startsWith("http") }
        val year = NetMirrorApi.extractYear(release_date).toIntOrNull()
        val score = vote_average?.toDoubleOrNull()
        return if (media_type == "tv") {
            newTvSeriesSearchResponse(title, "tv/$id") {
                this.posterUrl = poster
                this.year = year
                this.score = Score.from10(score)
            }
        } else {
            newMovieSearchResponse(title, "movie/$id") {
                this.posterUrl = poster
                this.year = year
                this.score = Score.from10(score)
            }
        }
    }

    // ---------------------------------------------------------------- search

    override suspend fun search(query: String): List<SearchResponse> {
        val data = NetMirrorApi.search(query, 0) ?: return emptyList()
        return data.results.mapNotNull { it.toSearchResponse() }
    }

    // ------------------------------------------------------------------ load

    override suspend fun load(url: String): LoadResponse? {
        val parts = url.split("/")
        if (parts.size < 2) return null
        val mediaType = parts[0]
        val id = parts[1]
        if (mediaType != "movie" && mediaType != "tv") return null

        val d = NetMirrorApi.details(mediaType, id)
            ?: throw ErrorLoadingException("Could not load details for $url")

        val title = d.title?.trim().takeUnless { it.isNullOrBlank() } ?: "Untitled"
        val poster = d.backdrop_path?.takeIf { it.startsWith("http") }
        val year = NetMirrorApi.extractYear(d.release_date).toIntOrNull()
        val score = d.vote_average?.toDoubleOrNull()
        val plot = d.dis?.trim()
        val genres = d.genre?.mapNotNull { genreNames[it.trim()] }?.distinct()
        val actors = d.stafflist?.mapNotNull { s ->
            s.name?.let { ActorData(Actor(it, s.avatarUrl?.takeIf { u -> u.startsWith("http") })) }
        }.orEmpty()
        val durationMinutes = (d.duration?.trim()?.toLongOrNull() ?: 0L).let { secs ->
            if (secs > 0) (secs / 60L).toInt() else null
        }

        val seasons = d.season.orEmpty().filter { (it.se ?: 0) > 0 && (it.ep ?: 0) > 0 }

        return if (mediaType == "tv" && seasons.isNotEmpty()) {
            val episodes = ArrayList<Episode>(seasons.sumOf { it.ep ?: 0 })
            for (s in seasons) {
                val se = s.se ?: continue
                val epCount = s.ep ?: continue
                for (ep in 1..epCount) {
                    episodes.add(
                        newEpisode(NetMirrorLoadData(id, mediaType, se, ep)) {
                            this.name = "S$se E$ep"
                            this.season = se
                            this.episode = ep
                        }
                    )
                }
            }
            newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
                this.posterUrl = poster
                this.year = year
                this.score = Score.from10(score)
                this.plot = plot
                this.tags = genres
                this.actors = actors
                this.duration = durationMinutes
            }
        } else {
            newMovieLoadResponse(title, url, TvType.Movie, NetMirrorLoadData(id, mediaType)) {
                this.posterUrl = poster
                this.year = year
                this.score = Score.from10(score)
                this.plot = plot
                this.tags = genres
                this.actors = actors
                this.duration = durationMinutes
            }
        }
    }

    // ------------------------------------------------------------- loadLinks

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val ep = runCatching { parseJson<NetMirrorLoadData>(data) }.getOrNull()
            ?: return false

        // Fresh details on every playback: `dp`/`subjectid` are per-response
        // tokens and may expire between load() and the user pressing play.
        val d = NetMirrorApi.details(ep.mediaType, ep.id)
            ?: run {
                Log.e(NetMirrorApi.TAG, "loadLinks: details refresh failed for ${ep.id}")
                return false
            }

        val html = NetMirrorApi.playerHtml(d, ep.se, ep.ep)
            ?: run {
                Log.e(NetMirrorApi.TAG, "loadLinks: player page unavailable for ${ep.id}")
                return false
            }

        val (streams, subtitles) = NetMirrorApi.parsePlayer(html)

        for (sub in subtitles) {
            newSubtitleFile(sub.label, sub.url) {
                this.headers = NetMirrorApi.mediaHeaders
            }.let(subtitleCallback::invoke)
        }

        var found = false
        for (stream in streams) {
            val isHls = stream.url.substringBefore('?').lowercase().endsWith(".m3u8")
            newExtractorLink(
                source = name,
                name = "$name ${stream.label}",
                url = stream.url,
                type = if (isHls) ExtractorLinkType.M3U8 else ExtractorLinkType.VIDEO,
            ) {
                this.quality = getQualityFromName(stream.label)
                this.referer = NetMirrorApi.PLAYER_REFERER
                this.headers = NetMirrorApi.mediaHeaders
            }.let(callback::invoke)
            found = true
        }

        if (!found) {
            Log.w(NetMirrorApi.TAG, "loadLinks: no streams parsed from player page (${html.length}b)")
        }
        return found
    }
}
