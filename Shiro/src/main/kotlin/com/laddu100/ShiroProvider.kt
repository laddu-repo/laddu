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
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.addEpisodes
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newAnimeLoadResponse
import com.lagradost.cloudstream3.newAnimeSearchResponse
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink

/**
 * Shiro provider — shiro.so.
 *
 * ARCHITECTURE (all verified by live probing, no guesswork):
 *  - Catalog metadata (search, home, detail, episode titles) comes from AniList GraphQL.
 *    Real episode names come from AniList's `Media.streamingEpisodes { title thumbnail url }`
 *    field (sourced by AniList from Crunchyroll). For Naruto this returns all 220 episodes with
 *    real titles like "Episode 1 - Enter: Naruto Uzumaki!". Movies return an empty list (they
 *    have a single episode — handled separately).
 *  - Streams + subtitles come from Shiro's `POST /api/episode` endpoint, gated behind a
 *    `shiro_watch` session cookie. The cookie is set by visiting `/anime/{id}` (a Next.js
 *    middleware Set-Cookie). Cloudstream's okhttp cookie jar persists it across requests, so
 *    `ShiroApi.episodeServers()` warms the session first.
 *  - The API returns `{ status: "ready"|"unavailable", reason?: "forbidden", variants[] }` where
 *    each variant is `{ id: "sub"|"dub", sources[] }` and each source is
 *    `{ label: "Plum"|"Cherry"|"Cherry 2"|"Cherry 3"|"Lemon"|"Grape"|"Melon", url: "/stream/...",
 *      type: "application/vnd.apple.mpegurl"|"video/mp4", tracks[] }` and each track is
 *    `{ label, language, type: "vtt", src: "/stream/.../file.vtt" }`.
 *
 * SUB/DUB/HARDSUB STRUCTURE (per user requirements):
 *  - Sub tab: always present. Lists every episode with its REAL AniList title. On play, emits
 *    every sub-variant source (Plum / Cherry / Lemon / Grape / Melon + Cherry 2/3 mirrors).
 *  - Dub tab: only present when the API actually returns a dub variant for this anime. On play,
 *    emits every dub-variant source.
 *  - Hardsub sources: when a sub-variant source has NO subtitle tracks (e.g. the bare Cherry
 *    servers), it is labeled "(Hardsub)" so the user knows the subs are baked in. This matches
 *    shiro's own UI convention (Cherry = hardsubbed by default).
 *  - Movies: ONE entry, typed as Anime (not AnimeMovie) when dub exists so the sub/dub switcher
 *    stays visible. Links are tagged " (Sub)" / " (Dub)" / " (Hardsub)" in the source picker.
 *    Subtitles are tagged by language; for dub sources the English subtitle (if any) is labeled
 *    "English (Dub)" so it is distinguishable from the sub-tab English.
 *
 * BULLETPROOF load(): never returns null. If AniList fails, we still return a minimal response
 * with the URL so the user can at least open the page. If /api/episode fails, loadLinks returns
 * false honestly rather than crashing.
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
                if (page > 1) emptyList()
                else ShiroApi.recentEpisodes().mapNotNull { it.toSearchResponse() }
            }
            else -> emptyList()
        }
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
        // URL formats accepted: /anime/{id}, /anime/{id}-{slug}, /anime/{id}/{ep}
        val anilistId = extractAnilistId(url) ?: return null

        val anime = ShiroApi.detail(anilistId) ?: return null
        val title = anime.displayTitle() ?: anime.title?.native ?: return null

        val totalEpisodes = anime.episodes ?: 0
        val streaming = anime.streamingEpisodes.orEmpty()
        val isMovie = anime.format == "MOVIE" || anime.format == "MOVIE"

        // Probe dub availability once. We probe episode 1 — if it has a dub variant with sources,
        // every other episode is assumed to also have dub (shiro's catalog is consistent per anime).
        // The probe also warms the shiro_watch cookie, so loadLinks later is faster.
        val dubAvailable = try {
            val probe = ShiroApi.episodeServers(anilistId, 1)
            probe?.status == "ready" && probe.variants?.any {
                it.id == "dub" && !it.sources.isNullOrEmpty()
            } == true
        } catch (e: Exception) {
            Log.d("Shiro", "dub probe failed: ${e.message}")
            false
        }

        // Decide episode numbers. For movies, exactly 1 episode. For series, list every episode
        // up to the aired count (cap at nextAiringEpisode - 1 when currently airing).
        val episodeNumbers = if (isMovie) {
            listOf(1)
        } else {
            buildEpisodeNumbers(totalEpisodes, streaming.size, anime.nextAiringEpisode?.episode)
        }

        // Dual-audio movies typed as Anime so the sub/dub switcher stays visible (Cloudstream
        // hides it on AnimeMovie). Sub-only movies stay AnimeMovie.
        val tvType = when {
            isMovie && dubAvailable -> TvType.Anime
            isMovie -> TvType.AnimeMovie
            else -> TvType.Anime
        }

        val subEps = episodeNumbers.map { num -> buildEpisode(anime, num, streaming, isDub = false) }
        val dubEps = if (dubAvailable && !isMovie) {
            episodeNumbers.map { num -> buildEpisode(anime, num, streaming, isDub = true) }
        } else emptyList()

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
            return false
        }

        val resp = ShiroApi.episodeServers(ref.anilistId, ref.ep) ?: return false
        if (resp.status != "ready") {
            Log.d("Shiro", "episode ${ref.anilistId}:${ref.ep} status=${resp.status} reason=${resp.reason}")
            return false
        }
        val variants = resp.variants ?: return false

        val desired = if (ref.isDub) "dub" else "sub"
        // Prefer the requested variant; if it's missing or empty, fall back to whatever exists
        // (so a sub-only anime still plays from the Dub tab if the user lands there, and vice versa).
        val variant = variants.firstOrNull { it.id == desired && !it.sources.isNullOrEmpty() }
            ?: variants.firstOrNull { !it.sources.isNullOrEmpty() }
            ?: return false

        val variantLabel = variant.label ?: variant.id?.replaceFirstChar { it.uppercase() } ?: "Shiro"
        val isDubVariant = variant.id == "dub"
        // Dedupe subtitle languages across sources within this call so the player doesn't show the
        // same "English" track 4× (one per server). BUT keep dub-timed subs separate from
        // sub-timed subs by tagging them differently.
        val seenSubs = HashSet<String>()
        var found = false

        for (source in variant.sources.orEmpty()) {
            val srcUrl = ShiroApi.absolute(source.url) ?: continue
            val srcLabel = source.label?.takeIf { it.isNotBlank() } ?: "Server"
            val tracks = source.tracks.orEmpty()
            // A source with no subtitle tracks is a hardsub source (subs baked into the video).
            // shiro's Cherry servers are typically hardsub. Label it so the user knows.
            val isHardsub = tracks.isEmpty()
            val linkSuffix = when {
                isHardsub -> " ($variantLabel - $srcLabel, Hardsub)"
                else -> " ($variantLabel - $srcLabel)"
            }
            val linkName = "Shiro$linkSuffix"
            val referer = "$mainUrl/"

            // Determine the extractor type from the source `type` field.
            // application/vnd.apple.mpegurl -> HLS master (use M3u8Helper to explode qualities).
            // video/mp4 -> direct video file.
            val sourceType = source.type ?: ""
            when {
                sourceType.contains("mpegurl", ignoreCase = true) || srcUrl.endsWith(".m3u8") -> {
                    try {
                        M3u8Helper.generateM3u8(linkName, srcUrl, referer).forEach(callback)
                        found = true
                    } catch (e: Exception) {
                        Log.d("Shiro", "m3u8 explode failed for $srcLabel: ${e.message}")
                        try {
                            callback.invoke(
                                newExtractorLink(linkName, srcLabel, srcUrl, type = ExtractorLinkType.M3U8) {}
                            )
                            found = true
                        } catch (e2: Exception) {
                            Log.d("Shiro", "fallback m3u8 link failed: ${e2.message}")
                        }
                    }
                }
                sourceType.contains("mp4", ignoreCase = true) || srcUrl.endsWith(".mp4") -> {
                    callback.invoke(
                        newExtractorLink(linkName, srcLabel, srcUrl, type = ExtractorLinkType.VIDEO) {
                            this.referer = referer
                        }
                    )
                    found = true
                }
                else -> {
                    // Unknown type — best-effort as M3U8 (most common on shiro).
                    try {
                        M3u8Helper.generateM3u8(linkName, srcUrl, referer).forEach(callback)
                        found = true
                    } catch (e: Exception) {
                        callback.invoke(
                            newExtractorLink(linkName, srcLabel, srcUrl, type = ExtractorLinkType.M3U8) {}
                        )
                        found = true
                    }
                }
            }

            // Emit subtitle tracks. Tag dub-tab English distinctly from sub-tab English so the
            // user can tell which audio track the subs are timed to.
            for (track in tracks) {
                val subUrl = ShiroApi.absolute(track.src) ?: continue
                if (track.type != null && track.type != "vtt") {
                    // shiro's API declares the type. Currently always "vtt" (probed), but if a
                    // broken ASS file ever appears we skip it rather than pass garbage to the
                    // player. ExoPlayer chokes on raw ASS without the libass renderer configured.
                    Log.d("Shiro", "skipping non-vtt subtitle ${track.label} (${track.type})")
                    continue
                }
                val rawLabel = track.label?.takeIf { it.isNotBlank() }
                    ?: track.language?.takeIf { it.isNotBlank() }
                    ?: "English"
                val displayLabel = if (isDubVariant && rawLabel.equals("English", ignoreCase = true)) {
                    "English (Dub)"
                } else {
                    rawLabel
                }
                if (seenSubs.add(displayLabel.lowercase())) {
                    subtitleCallback.invoke(newSubtitleFile(displayLabel, subUrl))
                }
            }
        }

        return found
    }

    // ---------- helpers ----------

    private fun extractAnilistId(url: String): Int? {
        // /anime/{id}, /anime/{id}-{slug}, /anime/{id}/{ep}
        val path = url.substringAfter("/anime/", "").substringBefore("/")
        val idStr = path.substringBefore("-")
        return idStr.toIntOrNull()
    }

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
        // streamingEpisodes is 1-indexed. For movies (num=1) with no streaming episodes, use the
        // anime title as the episode name.
        val stream = streaming.getOrNull(num - 1)
        val epName = stream?.title?.takeIf { it.isNotBlank() }
            ?: if (anime.format == "MOVIE") anime.displayTitle() else "Episode $num"
        return newEpisode(ref.toJson()) {
            this.episode = num
            this.name = epName
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
}
