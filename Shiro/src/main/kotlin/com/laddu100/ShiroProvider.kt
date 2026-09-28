package com.laddu100

import com.lagradost.api.Log
import com.lagradost.cloudstream3.DubStatus
import com.lagradost.cloudstream3.Episode
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.Score
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.ShowStatus
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.addDate
import com.lagradost.cloudstream3.addEpisodes
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newAnimeLoadResponse
import com.lagradost.cloudstream3.newAnimeSearchResponse
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

/**
 * Shiro provider.
 *
 * Architecture (all verified by live HTTP probing, no guesswork):
 *  - Catalog metadata (search, home, detail, episode titles) comes from AniList GraphQL.
 *    Real episode names come from AniList's `Media.streamingEpisodes { title thumbnail url }`
 *    field (sourced by AniList from Crunchyroll).
 *  - Streams + subtitles come from Shiro's own `POST /api/episode` endpoint, which returns a
 *    structured `{ variants: [ { id:"sub"|"dub", sources: [ { label:"Plum"|"Lemon"|"Cherry"|
 *    "Grape", url:"/stream/.../index.m3u8", tracks: [ { src:"/stream/.../file.vtt", label,
 *    language } ] } ] } ] }` shape. No auth, no cookies, no Referer required.
 *  - Sub & dub are separate variants. Each source carries its own subtitle tracks (per-source,
 *    not per-variant). Movies use episode=1 and may also have sub+dub variants.
 *  - Cloudstream hides the sub/dub switcher on TvType.AnimeMovie, so dual-audio movies are typed
 *    as Anime to keep both audio tracks reachable (same trick AniChan uses).
 */
class ShiroProvider : MainAPI() {

    override var mainUrl = ShiroApi.MAIN_URL
    override var name = "Shiro"
    override val hasMainPage = true
    override var lang = "en"
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        "trending" to "Trending Now",
        "popular" to "All-Time Popular",
        "season" to "This Season",
        "top" to "Top Rated",
        "recent" to "Recently Aired"
    )

    // ---------- Home page ----------

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse? {
        val items: List<SearchResponse> = when (request.data) {
            "trending" -> ShiroApi.homeList("TRENDING", page).mapNotNull { it.toSearchResponse() }
            "popular" -> ShiroApi.homeList("POPULARITY_DESC", page).mapNotNull { it.toSearchResponse() }
            "season" -> ShiroApi.currentSeasonList(page).mapNotNull { it.toSearchResponse() }
            "top" -> ShiroApi.homeList("SCORE_DESC", page).mapNotNull { it.toSearchResponse() }
            "recent" -> {
                // shiro's schedule row has no pagination; only show on page 1
                if (page > 1) emptyList()
                else ShiroApi.recentEpisodes().mapNotNull { it.toSearchResponse() }
            }
            else -> emptyList()
        }
        // AniList returns up to 30 per page; treat a full page as having a next page.
        val hasNext = items.size >= 25 && request.data != "recent"
        return newHomePageResponse(request.name, items, hasNext = hasNext)
    }

    // ---------- Search ----------

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        return ShiroApi.search(query).mapNotNull { it.toSearchResponse() }
    }

    // ---------- Load (anime detail + episode list) ----------

    override suspend fun load(url: String): LoadResponse? {
        val anilistId = url.substringAfterLast("/").substringBefore("-").toIntOrNull()
            ?: url.substringAfterLast("/").toIntOrNull()
            ?: return null

        val anime = ShiroApi.detail(anilistId) ?: return null
        val title = anime.displayTitle() ?: return null

        val totalEpisodes = anime.episodes ?: 0
        val streaming = anime.streamingEpisodes.orEmpty()

        // Build episode list with REAL titles from AniList streamingEpisodes.
        // streamingEpisodes is 1-indexed and aligned with episode numbers.
        val episodeNumbers = buildEpisodeNumbers(totalEpisodes, streaming.size, anime.nextAiringEpisode?.episode)

        // Probe dub availability once (uses episode 1).
        val dubAvailable = ShiroApi.hasDub(anilistId)

        val isMovie = anime.format == "MOVIE"
        // Dual-audio movies must be typed as Anime so the sub/dub switcher stays visible.
        val tvType = when {
            isMovie && dubAvailable -> TvType.Anime
            isMovie -> TvType.AnimeMovie
            else -> TvType.Anime
        }

        val subEps = episodeNumbers.map { num -> buildEpisode(anime, num, streaming, isDub = false) }
        val dubEps = if (dubAvailable) episodeNumbers.map { num -> buildEpisode(anime, num, streaming, isDub = true) }
            else emptyList()

        val showStatus = when (anime.status) {
            "RELEASING" -> ShowStatus.Ongoing
            "FINISHED" -> ShowStatus.Completed
            else -> null
        }

        val recommendations = anime.recommendations?.nodes
            ?.mapNotNull { it.mediaRecommendation }
            ?.mapNotNull { it.toSearchResponse() }
            .orEmpty()

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = anime.coverImage?.extraLarge ?: anime.coverImage?.large
            this.backgroundPosterUrl = anime.bannerImage
            this.plot = anime.description?.let(::stripHtml)
            this.tags = anime.genres ?: emptyList()
            this.year = anime.seasonYear
            this.duration = anime.duration
            this.showStatus = showStatus
            this.score = anime.averageScore?.let { Score.from100(it.toDouble()) }
            addEpisodes(DubStatus.Subbed, subEps)
            if (dubEps.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEps)
            this.recommendations = recommendations
        }
    }

    // ---------- loadLinks (stream + subtitle extraction) ----------

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val ref = try {
            parseJson<EpisodeRef>(data)
        } catch (e: Exception) {
            Log.e("Shiro", "bad episode data: ${e.message}")
            null
        } ?: return false

        val resp = ShiroApi.episodeServers(ref.anilistId, ref.ep) ?: return false
        if (resp.status != "ready") {
            Log.d("Shiro", "episode ${ref.anilistId}:${ref.ep} status=${resp.status}")
            return false
        }

        val desired = if (ref.isDub) "dub" else "sub"
        // Prefer the requested variant; fall back to whatever exists (e.g. anime with only sub).
        val variant = resp.variants?.firstOrNull { it.id == desired && !it.sources.isNullOrEmpty() }
            ?: resp.variants?.firstOrNull { !it.sources.isNullOrEmpty() }
            ?: return false

        val variantLabel = variant.label ?: variant.id?.replaceFirstChar { it.uppercase() } ?: "Shiro"
        // Dedupe subtitle languages across sources within this call so the player doesn't show
        // the same "English" track 4x (one per server). Keeps the subtitle menu clean.
        val seenSubs = HashSet<String>()
        var found = false

        for (source in variant.sources.orEmpty()) {
            val srcUrl = ShiroApi.absolute(source.url) ?: continue
            val srcLabel = source.label?.takeIf { it.isNotBlank() } ?: "Server"
            val linkName = "Shiro $variantLabel - $srcLabel"
            val referer = "$mainUrl/"

            // Master playlist → explode to per-quality ExtractorLinks via M3u8Helper.
            try {
                M3u8Helper.generateM3u8(linkName, srcUrl, referer).forEach(callback)
                found = true
            } catch (e: Exception) {
                Log.d("Shiro", "m3u8 explode failed for $srcLabel: ${e.message}")
                try {
                    callback.invoke(
                        newExtractorLink(linkName, srcLabel, srcUrl, type = ExtractorLinkType.M3U8) {
                        }
                    )
                    found = true
                } catch (e2: Exception) {
                    Log.d("Shiro", "fallback link failed: ${e2.message}")
                }
            }

            // Per-source subtitle tracks. Emit each unique language once.
            for (track in source.tracks.orEmpty()) {
                val subUrl = ShiroApi.absolute(track.src) ?: continue
                val lang = track.label?.takeIf { it.isNotBlank() }
                    ?: track.language?.takeIf { it.isNotBlank() }
                    ?: "English"
                if (seenSubs.add(lang.lowercase())) {
                    subtitleCallback.invoke(newSubtitleFile(lang, subUrl))
                }
            }
        }

        return found
    }

    // ---------- helpers ----------

    private fun AniListMedia.toSearchResponse(): SearchResponse? {
        val id = this.id ?: return null
        val displayTitle = displayTitle() ?: return null
        val tvType = if (format == "MOVIE") TvType.AnimeMovie else TvType.Anime
        val url = "$mainUrl/anime/$id"
        return newAnimeSearchResponse(displayTitle, url, tvType) {
            this.posterUrl = coverImage?.extraLarge ?: coverImage?.large
            this.year = seasonYear
            this.otherName = otherName()
            score?.let { score = Score.from100(it.toDouble()) }
        }
    }

    private fun ShiroSchedule.toSearchResponse(): SearchResponse? {
        val media = this.media ?: return null
        val id = media.id ?: return null
        val displayTitle = media.displayTitle() ?: return null
        val url = "$mainUrl/anime/$id"
        return newAnimeSearchResponse(displayTitle, url, TvType.Anime) {
            this.posterUrl = media.coverImage?.extraLarge ?: media.coverImage?.large
            this.year = media.seasonYear
            this.otherName = media.otherName()
            score?.let { score = Score.from100(it.toDouble()) }
        }
    }

    /**
     * Decide which episode numbers to list. streamingEpisodes may be shorter than total episodes
     * (some anime aren't fully indexed on Crunchyroll) — pad the rest with plain "Episode N".
     * For currently-airing anime, cap at the next-airing episode (don't list unaired episodes).
     */
    private fun buildEpisodeNumbers(totalEpisodes: Int, streamingCount: Int, nextAiringEp: Int?): List<Int> {
        val ceiling = when {
            nextAiringEp != null && nextAiringEp > 0 -> nextAiringEp - 1
            totalEpisodes > 0 -> totalEpisodes
            streamingCount > 0 -> streamingCount
            else -> 1
        }
        val upper = if (ceiling < 1) 1 else ceiling
        return (1..upper).toList()
    }

    private fun buildEpisode(
        anime: AniListMedia,
        num: Int,
        streaming: List<AniListStreamEpisode>,
        isDub: Boolean
    ): Episode {
        val ref = EpisodeRef(anime.id ?: 0, num, isDub)
        // streamingEpisodes is 1-indexed.
        val stream = streaming.getOrNull(num - 1)
        val epTitle = stream?.title?.takeIf { it.isNotBlank() }
            ?: if (anime.format == "MOVIE") anime.displayTitle() else "Episode $num"
        return newEpisode(ref.toJson()) {
            this.episode = num
            this.name = epTitle
            this.posterUrl = stream?.thumbnail?.takeIf { it.startsWith("http") }
        }
    }

    private fun stripHtml(html: String): String =
        html.replace(Regex("<br\\s*/?>"), "\n")
            .replace(Regex("<[^>]+>"), "")
            .replace("&amp;", "&")
            .replace("&quot;", "\"")
            .replace("&#39;", "'")
            .replace("&nbsp;", " ")
            .trim()

    @Suppress("unused")
    private fun parseAirDate(epoch: Long?): Date? {
        if (epoch == null) return null
        return try {
            val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.US)
            sdf.timeZone = TimeZone.getTimeZone("UTC")
            sdf.format(Date(epoch * 1000))
            sdf.parse(sdf.format(Date(epoch * 1000)))
        } catch (e: Exception) { null }
    }
}
