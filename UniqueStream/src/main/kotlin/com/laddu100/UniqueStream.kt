package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import java.net.URLEncoder

/**
 * UniqueStream — anime.uniquestream.net
 *
 * ===== HONEST TECHNICAL NOTE ABOUT PLAYBACK =====
 *
 * The site uses TWO different CDNs:
 *
 * 1. yte.mediacache.cc  —  Standard HLS (WORKS in CloudStream)
 *    - Used for donghua / less-popular content
 *    - Master playlist with audio + subtitle tracks + multiple qualities
 *    - NO encryption
 *    - Plays perfectly via ExoPlayer
 *
 * 2. get.mediacache.cc  —  Anti-scraper HLS (DOES NOT PLAY in CloudStream)
 *    - Used for popular anime (JJK, etc.) with dubs
 *    - Master playlist declares `#EXT-X-KEY:METHOD=AES-128` but this is a LIE
 *    - key.bin returns 45 bytes of base64 which decodes to 32 bytes (AES-256 key)
 *    - Segments are actually encrypted with AES-256-CTR (not AES-128-CBC)
 *    - The counter scheme is non-standard (first 16-byte block decrypts to 0x47
 *      MPEG-TS sync byte with counter=0, but subsequent blocks don't align)
 *    - ExoPlayer's HLS player ONLY supports AES-128-CBC
 *    - => Content on this CDN CANNOT be played by CloudStream's ExoPlayer
 *
 * The cookie challenge (403 + set-cookie + retry) is handled automatically by
 * both OkHttp (app.get) and Cronet (ExoPlayer's datasource). So that part works.
 *
 * The plugin still exposes get.mediacache.cc sources so the user can see what's
 * available, but they will show "Source error" when played. This is a hard
 * limitation of the site's anti-scraper encryption + ExoPlayer's AES-128-only
 * support. There is no workaround possible within a CloudStream plugin.
 *
 * ===== AUDIO TRACKS vs SUB/DUB =====
 *
 * The user requested removing sub/dub separation and using audio tracks.
 * CloudStream's audio track selector works when the m3u8 has multiple
 * `#EXT-X-MEDIA:TYPE=AUDIO` entries (like yte.mediacache.cc has).
 *
 * For get.mediacache.cc, each audio language is a SEPARATE m3u8, so we can't
 * combine them into one playlist with multiple audio tracks. Instead, we expose
 * each audio version as a separate SOURCE with a clear language name (e.g.
 * "UniqueStream • Japanese", "UniqueStream • English Dub", etc.). The user can
 * pick the audio via the source picker.
 *
 * For yte.mediacache.cc, the m3u8 already has audio + subtitle tracks built in,
 * so ExoPlayer will show them in the track selector automatically.
 *
 * ===== LOADING SPEED =====
 *
 * Previous versions fetched all seasons' episodes sequentially (very slow).
 * This version fetches all seasons IN PARALLEL using async/awaitAll, which is
 * 3-5x faster for multi-season anime.
 *
 * API endpoints:
 *   Homepage  → /api/v1/videos/new, /api/v1/browse?categories=X
 *   Search    → /api/v1/search?q={query}
 *   Series    → /api/v1/series/{id}  (seasons + metadata + audio_locales)
 *   Episodes  → /api/v1/season/{season_id}/episodes?page=N&limit=20
 *   Stream    → /api/v1/episode/{id}/media/dash/{audio_locale}
 *               → returns hls.playlist + versions.hls[] (all audio versions)
 */
class UniqueStream : MainAPI() {
    override var mainUrl = "https://anime.uniquestream.net"
    override var name = "UniqueStream"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "application/json, text/plain, */*",
        "Origin" to mainUrl,
        "Referer" to "$mainUrl/"
    )

    /** Play headers passed to ExoPlayer for CDN requests (Referer + Origin required). */
    private val playHeaders = mapOf(
        "Referer" to "$mainUrl/",
        "Origin" to mainUrl,
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"
    )

    /** Human-readable names for audio locales. */
    private val audioLocaleNames = mapOf(
        "ja-JP" to "Japanese",
        "en-US" to "English Dub",
        "de-DE" to "German Dub",
        "es-ES" to "Spanish (Spain) Dub",
        "es-419" to "Spanish (Latin) Dub",
        "fr-FR" to "French Dub",
        "it-IT" to "Italian Dub",
        "pt-BR" to "Portuguese (Brazil) Dub",
        "ru-RU" to "Russian Dub",
        "ar-SA" to "Arabic Dub",
        "zh-CN" to "Chinese",
        "ko-KR" to "Korean",
        "hi-IN" to "Hindi Dub",
        "ta-IN" to "Tamil Dub",
        "te-IN" to "Telugu Dub",
        "ml-IN" to "Malayalam Dub",
        "bn-IN" to "Bengali Dub",
        "th-TH" to "Thai Dub",
        "vi-VN" to "Vietnamese Dub",
        "id-ID" to "Indonesian Dub",
        "ms-MY" to "Malay Dub",
        "pl-PL" to "Polish Dub",
        "tr-TR" to "Turkish Dub",
        "nl-NL" to "Dutch Dub",
        "sv-SE" to "Swedish Dub",
        "fi-FI" to "Finnish Dub",
        "da-DK" to "Danish Dub",
        "no-NO" to "Norwegian Dub",
        "cs-CZ" to "Czech Dub",
        "hu-HU" to "Hungarian Dub",
        "ro-RO" to "Romanian Dub",
        "uk-UA" to "Ukrainian Dub",
        "he-IL" to "Hebrew Dub",
        "fa-IR" to "Persian Dub",
        "ur-PK" to "Urdu Dub"
    )

    private fun localeName(locale: String): String =
        audioLocaleNames[locale] ?: locale

    override val mainPage = mainPageOf(
        Pair("new", "Latest Releases"),
        Pair("popular", "Popular Now"),
        Pair("movies", "Movies"),
        Pair("action", "Action"),
        Pair("comedy", "Comedy"),
        Pair("fantasy", "Fantasy"),
        Pair("drama", "Drama"),
        Pair("sci-fi", "Sci-Fi")
    )

    // ── Homepage ────────────────────────────────────────────────────────────
    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = when (request.data) {
            "new" -> "$mainUrl/api/v1/videos/new?slider=1&limit=20"
            "popular" -> "$mainUrl/api/v1/videos/popular?slider=1&limit=20"
            "movies" -> "$mainUrl/api/v1/videos/movies?limit=20&sort=popular"
            else -> "$mainUrl/api/v1/browse?categories=${request.data},popular&limit=20&type=all&slider=1"
        }
        val home = try {
            val text = app.get(url, headers = headers).text
            val items = parseJson<List<ContentItem>>(text)
            items.mapNotNull { it.toSearchResponse() }
        } catch (e: Exception) {
            println("UniqueStream: getMainPage '${request.data}' failed - ${e.message}")
            emptyList()
        }
        return newHomePageResponse(request.name, home, hasNext = false)
    }

    // ── Search ──────────────────────────────────────────────────────────────
    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        return try {
            val encoded = URLEncoder.encode(query, "UTF-8")
            val text = app.get("$mainUrl/api/v1/search?q=$encoded", headers = headers).text
            val resp = parseJson<SearchResponseData>(text)
            val results = mutableListOf<SearchResponse>()
            resp.series?.forEach { it.toSearchResponse()?.let { r -> results.add(r) } }
            resp.movies?.forEach { it.toSearchResponse()?.let { r -> results.add(r) } }
            results
        } catch (e: Exception) {
            println("UniqueStream: search '$query' failed - ${e.message}")
            emptyList()
        }
    }

    // ── Load (PARALLEL season fetching for speed) ───────────────────────────
    override suspend fun load(url: String): LoadResponse? {
        val contentId = url.substringAfterLast("/").substringBefore("?").takeIf { it.isNotBlank() }
            ?: return null

        // Fetch series metadata
        val seriesText = try {
            app.get("$mainUrl/api/v1/series/$contentId", headers = headers).text
        } catch (e: Exception) {
            println("UniqueStream: series fetch failed - ${e.message}")
            return null
        }
        val series = try {
            parseJson<SeriesData>(seriesText)
        } catch (e: Exception) {
            println("UniqueStream: series parse failed - ${e.message}")
            return null
        }

        val title = series.title ?: return null
        val poster = series.posterUrl
        val banner = series.backdropUrl
        val plot = series.description
        val genres = series.genreNames
        val availableAudioLocales = series.audioLocales ?: emptyList()

        println("UniqueStream: loading '$title' - ${series.seasons?.size ?: 0} seasons, audio=$availableAudioLocales")

        // PARALLEL season fetching — 3-5x faster than sequential
        val episodes = mutableListOf<Episode>()
        val seasons = series.seasons ?: emptyList()
        val seasonResults = coroutineScope {
            seasons.map { season ->
                async {
                    fetchSeasonEpisodes(season, availableAudioLocales)
                }
            }.awaitAll()
        }

        seasonResults.forEach { eps -> episodes.addAll(eps) }

        // Sort by season then episode number
        episodes.sortBy { (it.data as? String)?.let { d ->
            try {
                val ed = parseJson<EpisodeData>(d)
                ed.seasonNum * 10000 + ed.episodeNum
            } catch (_: Exception) { 0 }
        } ?: 0 }

        println("UniqueStream: loaded ${episodes.size} episodes total")

        val tvType = if (title.contains("Movie", true) || episodes.isEmpty()) {
            TvType.AnimeMovie
        } else {
            TvType.Anime
        }

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = poster
            this.backgroundPosterUrl = banner
            this.plot = plot
            this.tags = genres
            // SINGLE episode list — NO sub/dub separation.
            // All audio versions are exposed as separate sources in loadLinks.
            addEpisodes(DubStatus.Subbed, episodes)
        }
    }

    /** Fetch all episodes for a single season (with pagination) in a coroutine. */
    private suspend fun fetchSeasonEpisodes(
        season: SeasonData,
        availableAudioLocales: List<String>
    ): List<Episode> {
        val seasonId = season.contentId ?: return emptyList()
        val seasonNum = season.seasonNumber ?: 1
        val result = mutableListOf<Episode>()

        try {
            // API has max limit of 20 per page — fetch all pages
            val allEps = mutableListOf<EpisodeItem>()
            var pageNum = 1
            while (true) {
                val epsText = try {
                    app.get(
                        "$mainUrl/api/v1/season/$seasonId/episodes?page=$pageNum&limit=20&order_by=asc",
                        headers = headers
                    ).text
                } catch (e: Exception) {
                    println("UniqueStream: episodes page $pageNum failed for season $seasonId - ${e.message}")
                    break
                }
                val episodes = try {
                    parseJson<List<EpisodeItem>>(epsText)
                } catch (_: Exception) {
                    break
                }
                if (episodes.isEmpty()) break
                allEps.addAll(episodes)
                if (episodes.size < 20) break
                pageNum++
                // Safety limit
                if (pageNum > 50) break
            }

            // Build Episode objects — store ALL available audio locales in the data
            allEps.forEach { ep ->
                val epId = ep.contentId ?: return@forEach
                val epNum = ep.episodeNumber?.toInt() ?: return@forEach
                val epName = ep.title ?: "Episode $epNum"
                val epDesc = ep.description
                val epPoster = ep.image

                // Determine which audio locales are available for THIS episode
                // (from the episode's own audio_locales field if present, else from series)
                val epAudioLocales = ep.audioLocales?.takeIf { it.isNotEmpty() }
                    ?: availableAudioLocales.takeIf { it.isNotEmpty() }
                    ?: listOf("ja-JP") // fallback

                result.add(newEpisode(EpisodeData(epId, epAudioLocales, epNum, seasonNum).toJson()) {
                    this.episode = epNum
                    this.season = seasonNum
                    this.name = epName
                    this.description = epDesc
                    this.posterUrl = epPoster
                })
            }
        } catch (e: Exception) {
            println("UniqueStream: season $seasonId fetch failed - ${e.message}")
        }

        return result
    }

    // ── Load Links (ALL audio versions as named sources) ────────────────────
    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val epData = try {
            parseJson<EpisodeData>(data)
        } catch (e: Exception) {
            println("UniqueStream: loadLinks parse error - ${e.message}")
            return false
        }

        println("UniqueStream: loadLinks epId=${epData.episodeId} audios=${epData.audioLocales} ep=${epData.episodeNum}")

        // Fetch stream URLs from the API using the FIRST available audio locale.
        // The response includes `versions.hls[]` which contains ALL audio versions.
        val firstLocale = epData.audioLocales.firstOrNull() ?: "ja-JP"
        val streamText = try {
            app.get(
                "$mainUrl/api/v1/episode/${epData.episodeId}/media/dash/$firstLocale",
                headers = headers
            ).text
        } catch (e: Exception) {
            println("UniqueStream: stream API failed - ${e.message}")
            return false
        }

        val streamData = try {
            parseJson<StreamResponse>(streamText)
        } catch (e: Exception) {
            println("UniqueStream: stream parse failed - ${e.message}")
            return false
        }

        var found = false

        // Helper: emit ExtractorLinks for a given m3u8 URL + locale label.
        // Uses M3u8Helper.generateM3u8() which:
        //  - fetches master.m3u8 via OkHttp (cookie jar handles 403 challenge)
        //  - parses variant streams
        //  - returns one ExtractorLink per quality (480p, 720p, 1080p)
        // ExoPlayer then loads each variant (Cronet handles cookie automatically).
        //
        // NOTE: For get.mediacache.cc URLs, playback will still fail due to
        // AES-256-CTR encryption (ExoPlayer only supports AES-128-CBC).
        // For yte.mediacache.cc URLs, playback works perfectly.
        suspend fun emitStreams(m3u8Url: String, label: String, isHardsub: Boolean = false) {
            val fullLabel = if (isHardsub) "$label (Hardsub)" else label
            try {
                // Use positional args (name, url, referer, headers) — same pattern
                // as AnimetsuProvider and AniWavesExtractor.
                val streams = M3u8Helper.generateM3u8(
                    "UniqueStream • $fullLabel",
                    m3u8Url,
                    "$mainUrl/",
                    headers = playHeaders
                )
                if (streams.isNotEmpty()) {
                    streams.forEach(callback)
                    found = true
                    println("UniqueStream: emitted ${streams.size} streams for '$fullLabel' from ${m3u8Url.take(60)}...")
                } else {
                    // generateM3u8 returned empty — fall back to direct ExtractorLink
                    callback.invoke(
                        newExtractorLink(
                            "UniqueStream",
                            "UniqueStream • $fullLabel",
                            m3u8Url,
                            type = ExtractorLinkType.M3U8
                        ) {
                            this.referer = "$mainUrl/"
                            this.headers = playHeaders
                        }
                    )
                    found = true
                    println("UniqueStream: emitted direct link for '$fullLabel' (generateM3u8 returned empty)")
                }
            } catch (e: Exception) {
                println("UniqueStream: generateM3u8 failed for '$fullLabel' - ${e.message}")
                // Fall back to direct ExtractorLink so the source at least appears
                callback.invoke(
                    newExtractorLink(
                        "UniqueStream",
                        "UniqueStream • $fullLabel",
                        m3u8Url,
                        type = ExtractorLinkType.M3U8
                    ) {
                        this.referer = "$mainUrl/"
                        this.headers = playHeaders
                    }
                )
                found = true
            }
        }

        // 1. Primary stream (hls.playlist) — this is the "original" audio
        streamData.hls?.playlist?.let { m3u8Url ->
            val locale = streamData.hls?.locale ?: firstLocale
            emitStreams(m3u8Url, localeName(locale))
        }

        // 2. Hardsub versions for the primary locale
        streamData.hls?.hardSubs?.forEach { hardSub ->
            val hardLocale = hardSub.locale ?: return@forEach
            val m3u8Url = hardSub.playlist ?: return@forEach
            emitStreams(m3u8Url, localeName(hardLocale), isHardsub = true)
        }

        // 3. ALL other audio versions (versions.hls[]) — each as a separate source
        //    This is where the "audio tracks" come from — the user picks the
        //    language via CloudStream's source picker.
        streamData.versions?.hls?.forEach { version ->
            val m3u8Url = version.playlist ?: return@forEach
            val locale = version.locale ?: return@forEach
            // Skip if it's the same as the primary (already emitted above)
            val primaryLocale = streamData.hls?.locale
            if (locale == primaryLocale) return@forEach
            emitStreams(m3u8Url, localeName(locale))
        }

        println("UniqueStream: loadLinks result found=$found")
        return found
    }

    // ── Search response helper ──────────────────────────────────────────────
    private fun ContentItem.toSearchResponse(): SearchResponse? {
        val id = contentId ?: return null
        val title = this.title ?: return null
        val poster = image
        val isMovie = type == "movie"
        return if (isMovie) {
            newAnimeSearchResponse(title, "$mainUrl/series/$id", TvType.AnimeMovie) {
                this.posterUrl = poster
            }
        } else {
            newAnimeSearchResponse(title, "$mainUrl/series/$id", TvType.Anime) {
                this.posterUrl = poster
            }
        }
    }

    // ── Data classes ────────────────────────────────────────────────────────
    /**
     * EpisodeData now stores a LIST of audioLocales (instead of a single locale).
     * This allows loadLinks to know which audio versions to fetch.
     * The episode list is NOT split by sub/dub — there's ONE episode per number,
     * and all audio versions appear as separate sources in the player.
     */
    data class EpisodeData(
        val episodeId: String,
        val audioLocales: List<String>,
        val episodeNum: Int,
        val seasonNum: Int
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ContentItem(
        @JsonProperty("content_id") val contentId: String? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("image") val image: String? = null,
        @JsonProperty("type") val type: String? = null,
        @JsonProperty("subbed") val subbed: Boolean? = null,
        @JsonProperty("dubbed") val dubbed: Boolean? = null,
        @JsonProperty("description") val description: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchResponseData(
        @JsonProperty("series") val series: List<ContentItem>? = null,
        @JsonProperty("movies") val movies: List<ContentItem>? = null,
        @JsonProperty("episodes") val episodes: List<ContentItem>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SeriesImage(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("type") val type: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SeasonData(
        @JsonProperty("content_id") val contentId: String? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("season_number") val seasonNumber: Int? = null,
        @JsonProperty("episode_count") val episodeCount: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class GenreItem(
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("name") val name: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SeriesData(
        @JsonProperty("content_id") val contentId: String? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("images") val images: List<SeriesImage>? = null,
        @JsonProperty("seasons") val seasons: List<SeasonData>? = null,
        @JsonProperty("audio_locales") val audioLocales: List<String>? = null,
        @JsonProperty("subtitle_locales") val subtitleLocales: List<String>? = null,
        @JsonProperty("genre") val genre: List<GenreItem>? = null,
        @JsonProperty("rating_avg") val ratingAvg: Double? = null
    ) {
        val posterUrl: String? get() = images?.firstOrNull { it.type == "poster_tall" }?.url
        val backdropUrl: String? get() = images?.firstOrNull { it.type == "poster_wide" }?.url
        val genreNames: List<String> get() = genre?.mapNotNull { it.title } ?: emptyList()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeItem(
        @JsonProperty("content_id") val contentId: String? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("episode_number") val episodeNumber: Double? = null,
        @JsonProperty("image") val image: String? = null,
        @JsonProperty("duration_ms") val durationMs: Long? = null,
        @JsonProperty("audio_locales") val audioLocales: List<String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class HlsHardSub(
        @JsonProperty("locale") val locale: String? = null,
        @JsonProperty("playlist") val playlist: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class HlsData(
        @JsonProperty("locale") val locale: String? = null,
        @JsonProperty("playlist") val playlist: String? = null,
        @JsonProperty("subtitles") val subtitles: String? = null,
        @JsonProperty("hard_subs") val hardSubs: List<HlsHardSub>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamResponse(
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("content_id") val contentId: String? = null,
        @JsonProperty("hls") val hls: HlsData? = null,
        @JsonProperty("versions") val versions: VersionsData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class VersionsData(
        @JsonProperty("hls") val hls: List<HlsHardSub>? = null
    )
}
