package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.newExtractorLink
import java.net.URLEncoder

// ════════════════════════════════════════════════════════════════════════════
//  Anicine (anicine.xyz) CloudStream Provider — v1
//  ════════════════════════════════════════════════════════════════════════════
//
//  ARCHITECTURE (derived from line-by-line analysis of anicine.har — 50MB, 867
//  HTTP entries captured via HTTP Toolkit on Chrome 150 / Windows 10):
//
//  anicine.xyz is a Next.js frontend that uses the **AniList GraphQL API** for
//  ALL metadata (search, anime detail, episode counts, recommendations). It
//  proxies AniList via `GET /api/anilist?query={graphql}&variables={json}`.
//  Watch URLs follow `/watch/anime/{anilistId}-{slug}`.
//
//  Video sources: anicine.xyz does NOT host anything. It iframes 6 external
//  "embed providers" via `GET /embed?url={encoded external URL}`. Each provider
//  has a predictable URL pattern keyed on (anilistId, episodeNum, sub|dub):
//
//    1. megaplay.buzz    → /stream/ani/{id}/{ep}/{sub|dub}
//    2. animeplay.cfd    → /stream/ani/{id}/{ep}/{sub|dub}   (thin iframe wrapper around megaplay — SKIP)
//    3. tryembed.us.cc   → /embed/anime/{id}/{ep}/{sub|dub}  (needs tryembed_auth cookie via WebView — DEFERRED to v2)
//    4. vidnest.fun      → /anime/{id}/{ep}/{sub|dub} + /animepahe/{id}/{ep}/{sub|dub}  (Next.js RSC, hard to scrape — DEFERRED)
//    5. cdn.4animo.xyz   → /embed/ani/{id}/{ep}/{sub|dub}?k=1  (uses /stream/getSources?id=anilist:{id}/{ep}&server=hd-1&type={sub|dub})
//    6. flix.screenscape.me → /embed?anilist={id}&e={ep}  (Cloudflare challenge + encrypted API — DEFERRED)
//
//  v1 implements providers #1 (MegaPlay) and #5 (4animo) — both work without
//  any anti-bot bypass from CloudStream's okhttp client. Together they cover
//  sub + dub for the vast majority of anime.
//
//  ── MegaPlay flow ──────────────────────────────────────────────────────────
//    1. GET https://megaplay.buzz/stream/ani/{id}/{ep}/{sub|dub}
//       Headers: Referer: https://anicine.xyz/
//       Response: HTML page containing "<title>File {fileId} - MegaPlay</title>"
//    2. GET https://megaplay.buzz/stream/getSourcesNew?id={fileId}&id={fileId}
//       Headers: X-Requested-With: XMLHttpRequest, Referer: <embed url>
//       Response JSON: { sources: { file: "https://9hjkrt.nekostream.site/.../master.m3u8" },
//                        tracks: [{ file, label, kind, default }],
//                        intro: {start,end}, outro: {start,end}, server }
//    3. The m3u8 on 9hjkrt.nekostream.site requires:
//         Referer: https://megaplay.buzz/
//         Origin:  https://megaplay.buzz
//         User-Agent: <standard Chrome>
//       Subtitle files on 1oe.lostproject.club require the SAME headers.
//
//  ── 4animo flow ────────────────────────────────────────────────────────────
//    1. GET https://cdn.4animo.xyz/stream/getSources?id=anilist:{id}/{ep}&server=hd-1&type={sub|dub}
//       Headers: Referer: https://cdn.4animo.xyz/embed/ani/{id}/{ep}/{type}?k=1
//       Response JSON: { sources: [{ file: "/p/vp?t={token}", type: "hls" }],
//                        tracks: [{ file: "/p/vp?t={token}", label, kind, default }],
//                        intro, outro, encrypted: false, server }
//    2. Resolve relative file URL → https://cdn.4animo.xyz{file}
//    3. The m3u8 (master + sub-playlists + segments) all live on cdn.4animo.xyz
//       and require:
//         Referer: https://cdn.4animo.xyz/
//         Origin:  https://cdn.4animo.xyz
//         User-Agent: <standard Chrome>
//       Subtitle files (also /p/vp?t=...) require the SAME headers.
//
//  ── Episode count derivation ───────────────────────────────────────────────
//    AniList's Media.episodes field is the episode count for FINISHED anime.
//    For RELEASING anime (e.g. One Piece), episodes is null but
//    nextAiringEpisode.episode gives the NEXT ep number (so latest aired = ep - 1).
//    For movies/specials with no episodes field and no nextAiring → 1 episode.
//
//  ── Sub/Dub separation ─────────────────────────────────────────────────────
//    Both MegaPlay and 4animo have separate URLs for sub vs dub (the {type}
//    path segment). We fetch both and add them to the Subbed/Dubbed tabs.
//    If a provider returns no sources for dub (e.g. dub not available), we
//    silently skip — the sub tab still works.
// ════════════════════════════════════════════════════════════════════════════

class AnicineProvider : MainAPI() {
    override var mainUrl = "https://anicine.xyz"
    override var name = "Anicine"
    override var lang = "en"
    override val hasMainPage = false
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val TAG = "Anicine"
    private val anilistApi = "$mainUrl/api/anilist"

    // Use a desktop Chrome UA — matches what anicine.xyz expects (HAR was
    // captured on Chrome 150 / Windows 10). MegaPlay's CDN validates Referer
    // + Origin but NOT the UA fingerprint, so a desktop UA works fine.
    private val ua = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/150.0.0.0 Safari/537.36"

    // ═══════════════════════════════════════════════════════════════════════
    //  AniList GraphQL queries
    //  ═══════════════════════════════════════════════════════════════════════
    //  anicine.xyz proxies AniList via GET /api/anilist?query={graphql}&variables={json}
    //  Both query and variables are URL-encoded. The proxy forwards to
    //  https://graphql.anilist.co and returns the raw JSON response.

    private val searchQuery = """
        query(${'$'}search: String, ${'$'}page: Int) {
          Page(page: ${'$'}page, perPage: 30) {
            media(type: ANIME, search: ${'$'}search, sort: SEARCH_MATCH) {
              id
              title { romaji english native }
              coverImage { large extraLarge }
              seasonYear
              averageScore
              status
              format
            }
          }
        }
    """.trimIndent()

    private val mediaQuery = """
        query(${'$'}id: Int) {
          Media(id: ${'$'}id, type: ANIME) {
            id
            title { romaji english native }
            coverImage { large extraLarge }
            bannerImage
            description(asHtml: false)
            genres
            averageScore
            episodes
            status
            seasonYear
            format
            nextAiringEpisode { airingAt episode }
            studios { nodes { name isAnimationStudio } }
            trailer { id site }
            recommendations { nodes { mediaRecommendation {
              id
              title { romaji english native }
              coverImage { large extraLarge medium }
              averageScore
              seasonYear
            } } }
          }
        }
    """.trimIndent()

    // ═══════════════════════════════════════════════════════════════════════
    //  SEARCH
    // ═══════════════════════════════════════════════════════════════════════

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search: query='$query'")
        if (query.isBlank()) return emptyList()
        val variables = """{"search":${escapeJson(query)},"page":1}"""
        val url = buildAnilistUrl(searchQuery, variables)
        return try {
            val resp = app.get(url, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "application/json",
                "Referer" to "$mainUrl/"
            ), timeout = 30_000L)
            Log.d(TAG, "search response: HTTP ${resp.code}, len=${resp.text.length}")
            if (resp.code != 200) {
                Log.e(TAG, "search non-200: ${resp.text.take(300)}")
                return emptyList()
            }
            val parsed = parseJson<AniListPageResponse>(resp.text)
            val media = parsed.data?.page?.media ?: emptyList()
            Log.d(TAG, "search parsed ${media.size} results")
            media.mapNotNull { it.toSearchResponse() }
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED: ${e.message}\n${e.stackTraceToString().take(500)}")
            emptyList()
        }
    }

    // ═══════════════════════════════════════════════════════════════════════
    //  LOAD (anime detail + episodes)
    // ═══════════════════════════════════════════════════════════════════════

    override suspend fun load(url: String): LoadResponse? {
        // url is "https://anicine.xyz/watch/anime/{anilistId}-{slug}" OR
        //        "https://anicine.xyz/anime/{anilistId}" (from search)
        Log.d(TAG, "load: url=$url")
        val anilistId = extractAnilistId(url) ?: run {
            Log.e(TAG, "load: could not extract anilistId from $url")
            return null
        }
        Log.d(TAG, "load: anilistId=$anilistId")

        val variables = """{"id":$anilistId}"""
        val apiUrl = buildAnilistUrl(mediaQuery, variables)
        val media = try {
            val resp = app.get(apiUrl, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "application/json",
                "Referer" to "$mainUrl/"
            ), timeout = 30_000L)
            if (resp.code != 200) {
                Log.e(TAG, "load Media query non-200: ${resp.text.take(300)}")
                return null
            }
            parseJson<AniListMediaResponse>(resp.text).data?.media
        } catch (e: Exception) {
            Log.e(TAG, "load Media query FAILED: ${e.message}")
            return null
        } ?: run {
            Log.e(TAG, "load: Media not found for id=$anilistId")
            return null
        }

        val title = media.title?.english?.takeIf { it.isNotBlank() }
            ?: media.title?.romaji?.takeIf { it.isNotBlank() }
            ?: media.title?.native
            ?: "Anime $anilistId"

        // Derive episode count:
        //  - If Media.episodes is not null → use it (finished anime)
        //  - Else if nextAiringEpisode.episode exists → ep - 1 (ongoing, latest aired)
        //  - Else → 1 (movie / special / no metadata)
        val epCount = media.episodes
            ?: media.nextAiringEpisode?.episode?.let { it - 1 }
            ?: 1
        Log.d(TAG, "load: title='$title', epCount=$epCount (Media.episodes=${media.episodes}, nextAiring.ep=${media.nextAiringEpisode?.episode})")

        // Build episode list. Each episode carries its data as
        // "$anilistId|$epNum" — loadLinks parses this back out.
        // We add the SAME episodes to both Subbed and Dubbed tabs; loadLinks
        // will silently skip dub sources if a provider has no dub for that anime.
        val subEps = (1..epCount).map { epNum ->
            newEpisode("$anilistId|$epNum") {
                this.episode = epNum
                this.name = "Episode $epNum"
                this.posterUrl = media.coverImage?.extraLarge ?: media.coverImage?.large
            }
        }
        val dubEps = subEps.toList() // same data, different tab

        val tvType = when (media.format?.uppercase()) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL" -> TvType.OVA
            else -> TvType.Anime
        }

        val plot = media.description?.let { stripHtml(it) }
        val year = media.seasonYear
        val tags = media.genres?.filterNotNull()?.takeIf { it.isNotEmpty() }

        // Recommendations
        val recs = media.recommendations?.nodes
            ?.mapNotNull { it.mediaRecommendation }
            ?.mapNotNull { rec ->
                val recTitle = rec.title?.english?.takeIf { it.isNotBlank() }
                    ?: rec.title?.romaji?.takeIf { it.isNotBlank() }
                    ?: return@mapNotNull null
                val recId = rec.id ?: return@mapNotNull null
                newAnimeSearchResponse(recTitle, "$mainUrl/watch/anime/$recId-${slugify(recTitle)}", tvType) {
                    this.posterUrl = rec.coverImage?.extraLarge ?: rec.coverImage?.large
                }
            }
            ?.take(12) ?: emptyList()

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = media.coverImage?.extraLarge ?: media.coverImage?.large
            this.backgroundPosterUrl = media.bannerImage
            this.plot = plot
            this.year = year
            this.tags = tags
            if (media.averageScore != null) {
                this.score = Score.from10((media.averageScore / 10.0).toString())
            }
            addEpisodes(DubStatus.Subbed, subEps)
            addEpisodes(DubStatus.Dubbed, dubEps)
            this.recommendations = recs
        }
    }

    // ═══════════════════════════════════════════════════════════════════════
    //  LOAD LINKS — fetch sources from all providers for sub + dub
    // ═══════════════════════════════════════════════════════════════════════

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START: data=$data")
        val parts = data.split("|")
        if (parts.size < 2) {
            Log.e(TAG, "loadLinks: bad data format: $data")
            return false
        }
        val anilistId = parts[0].toIntOrNull() ?: run {
            Log.e(TAG, "loadLinks: bad anilistId: ${parts[0]}")
            return false
        }
        val epNum = parts[1].toIntOrNull() ?: run {
            Log.e(TAG, "loadLinks: bad epNum: ${parts[1]}")
            return false
        }
        Log.d(TAG, "loadLinks: anilistId=$anilistId, epNum=$epNum")

        var found = false

        // Provider 1: MegaPlay (megaplay.buzz) — Sub + Dub
        for (type in listOf("sub", "dub")) {
            if (loadMegaPlay(anilistId, epNum, type, subtitleCallback, callback)) {
                found = true
            }
        }

        // Provider 2: 4animo (cdn.4animo.xyz) — Sub + Dub
        for (type in listOf("sub", "dub")) {
            if (load4Animo(anilistId, epNum, type, subtitleCallback, callback)) {
                found = true
            }
        }

        Log.d(TAG, "loadLinks END: found=$found")
        return found
    }

    // ═══════════════════════════════════════════════════════════════════════
    //  PROVIDER 1: MegaPlay (megaplay.buzz)
    // ═══════════════════════════════════════════════════════════════════════

    private suspend fun loadMegaPlay(
        anilistId: Int,
        epNum: Int,
        type: String, // "sub" or "dub"
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val labelType = if (type == "dub") "Dub" else "Sub"
        val embedUrl = "https://megaplay.buzz/stream/ani/$anilistId/$epNum/$type"
        Log.d(TAG, "loadMegaPlay: $embedUrl")

        // Step 1: fetch embed HTML to extract the internal file ID
        val fileId = try {
            val resp = app.get(embedUrl, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Referer" to "$mainUrl/"
            ), timeout = 30_000L)
            if (resp.code != 200) {
                Log.e(TAG, "loadMegaPlay ($type) embed non-200: ${resp.code}")
                return false
            }
            val html = resp.text
            // HTML contains "<title>File {fileId} - MegaPlay</title>"
            val match = Regex("""File\s+(\d{2,12})""").find(html)
            match?.groupValues?.get(1)?.toIntOrNull()
        } catch (e: Exception) {
            Log.e(TAG, "loadMegaPlay ($type) embed fetch FAILED: ${e.message}")
            return false
        }

        if (fileId == null) {
            Log.e(TAG, "loadMegaPlay ($type): could not extract fileId from embed HTML")
            return false
        }
        Log.d(TAG, "loadMegaPlay ($type): fileId=$fileId")

        // Step 2: call getSourcesNew to get the m3u8 URL + tracks
        val sourcesUrl = "https://megaplay.buzz/stream/getSourcesNew?id=$fileId&id=$fileId"
        val sources = try {
            val resp = app.get(sourcesUrl, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "application/json, text/javascript, */*; q=0.01",
                "X-Requested-With" to "XMLHttpRequest",
                "Referer" to embedUrl
            ), timeout = 30_000L)
            if (resp.code != 200) {
                Log.e(TAG, "loadMegaPlay ($type) getSourcesNew non-200: ${resp.code}")
                return false
            }
            parseJson<MegaPlaySourcesResponse>(resp.text)
        } catch (e: Exception) {
            Log.e(TAG, "loadMegaPlay ($type) getSourcesNew FAILED: ${e.message}")
            return false
        }

        // Step 3: extract m3u8 URL
        val m3u8Url = sources.sources?.file
        if (m3u8Url.isNullOrBlank()) {
            Log.e(TAG, "loadMegaPlay ($type): no sources.file in response")
            return false
        }
        Log.d(TAG, "loadMegaPlay ($type): m3u8Url=$m3u8Url")

        // Headers required by 9hjkrt.nekostream.site (MegaPlay's CDN).
        // Confirmed from HAR: master.m3u8 + sub-playlist + segments ALL need
        // Referer + Origin = megaplay.buzz. Without them → 403.
        val playHeaders = mapOf(
            "Referer" to "https://megaplay.buzz/",
            "Origin" to "https://megaplay.buzz",
            "User-Agent" to ua
        )

        // The m3u8 is a master playlist (contains #EXT-X-STREAM-INF variants).
        // ExoPlayer handles master playlist parsing natively and applies the
        // headers to ALL requests (master + sub-playlist + segments on
        // cross-domain CDNs like 9hjkrt.nekostream.site).
        //
        // We do NOT use M3u8Helper here — learned from Anidap v10: M3u8Helper
        // can silently return an empty list if its internal fetch fails, causing
        // the source to disappear without any error. Direct ExtractorLink with
        // ExtractorLinkType.M3U8 is more robust.
        val label = "Anicine - MegaPlay ($labelType)"
        callback.invoke(
            newExtractorLink(label, label, m3u8Url, type = ExtractorLinkType.M3U8) {
                this.referer = "https://megaplay.buzz/"
                this.headers = playHeaders
            }
        )

        // Step 4: subtitles — MegaPlay returns VTT tracks on 1oe.lostproject.club
        // which require the SAME Referer/Origin as the video.
        sources.tracks?.forEach { track ->
            val trackUrl = track.file ?: return@forEach
            if (trackUrl.isBlank()) return@forEach
            val trackLabel = track.label ?: "English"
            Log.d(TAG, "loadMegaPlay ($type): subtitle label=$trackLabel url=$trackUrl")
            subtitleCallback.invoke(
                newSubtitleFile(trackLabel, trackUrl) {
                    this.headers = playHeaders
                }
            )
        }

        return true
    }

    // ═══════════════════════════════════════════════════════════════════════
    //  PROVIDER 2: 4animo (cdn.4animo.xyz) — AniList-style URL pattern
    // ═══════════════════════════════════════════════════════════════════════

    private suspend fun load4Animo(
        anilistId: Int,
        epNum: Int,
        type: String, // "sub" or "dub"
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val labelType = if (type == "dub") "Dub" else "Sub"
        val cdnUrl = "https://cdn.4animo.xyz"
        // AniList-style ID format: "anilist:{anilistId}/{epNum}"
        // (distinct from 4animo's own internal numeric IDs used by the Animo plugin)
        val sourcesApiUrl = "$cdnUrl/stream/getSources?id=anilist%3A$anilistId%2F$epNum&server=hd-1&type=$type"
        val embedReferer = "$cdnUrl/embed/ani/$anilistId/$epNum/$type?k=1"
        Log.d(TAG, "load4Animo ($type): $sourcesApiUrl")

        val sources = try {
            val resp = app.get(sourcesApiUrl, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "*/*",
                "Referer" to embedReferer
            ), timeout = 30_000L)
            if (resp.code != 200) {
                Log.e(TAG, "load4Animo ($type) getSources non-200: ${resp.code}")
                return false
            }
            val text = resp.text
            // Cloudflare challenge detection (cf_clearance may be required for some anime)
            if (text.contains("Just a moment") || text.contains("cloudflare") || text.length < 50) {
                Log.e(TAG, "load4Animo ($type): CF blocked or empty response (len=${text.length})")
                return false
            }
            parseJson<AnimoSourcesResponse>(text)
        } catch (e: Exception) {
            Log.e(TAG, "load4Animo ($type) FAILED: ${e.message}")
            return false
        }

        // Resolve relative URLs (file = "/p/vp?t={token}")
        val sourcesList = sources.sources ?: emptyList()
        if (sourcesList.isEmpty()) {
            Log.d(TAG, "load4Animo ($type): no sources in response")
            return false
        }

        val playHeaders = mapOf(
            "Referer" to "$cdnUrl/",
            "Origin" to cdnUrl,
            "User-Agent" to ua
        )

        var found = false
        sourcesList.forEach { s ->
            val file = s.file ?: return@forEach
            if (file.isBlank()) return@forEach
            // Resolve relative URL: "/p/vp?t=..." → "https://cdn.4animo.xyz/p/vp?t=..."
            val streamUrl = if (file.startsWith("http")) file else "$cdnUrl/${file.removePrefix("/")}"
            Log.d(TAG, "load4Animo ($type): source type=${s.type} url=$streamUrl")

            // The /p/vp?t=... URL always returns an m3u8 master playlist with
            // quality variants (360p, 720p, etc.), regardless of the "type"
            // field in the API response. ExoPlayer parses it natively and
            // applies the headers to ALL requests (master + sub-playlist +
            // segments, including cross-domain CDNs).
            val label = "Anicine - 4animo ($labelType)"
            val linkType = if (s.type == "hls" || streamUrl.contains(".m3u8") || streamUrl.contains("/p/vp")) {
                ExtractorLinkType.M3U8
            } else {
                ExtractorLinkType.VIDEO
            }
            callback.invoke(
                newExtractorLink(label, label, streamUrl, type = linkType) {
                    this.referer = "$cdnUrl/"
                    this.headers = playHeaders
                }
            )
            found = true
        }

        // Subtitles — 4animo returns track URLs as relative "/p/vp?t=..." paths
        // (same as video). Resolve and pass the same headers.
        sources.tracks?.forEach { track ->
            val file = track.file ?: return@forEach
            if (file.isBlank()) return@forEach
            val subUrl = if (file.startsWith("http")) file else "$cdnUrl/${file.removePrefix("/")}"
            val subLabel = track.label ?: "English"
            Log.d(TAG, "load4Animo ($type): subtitle label=$subLabel url=$subUrl")
            subtitleCallback.invoke(
                newSubtitleFile(subLabel, subUrl) {
                    this.headers = playHeaders
                }
            )
        }

        return found
    }

    // ═══════════════════════════════════════════════════════════════════════
    //  Helpers
    // ═══════════════════════════════════════════════════════════════════════

    /** Build the anicine.xyz/api/anilist URL with URL-encoded query + variables. */
    private fun buildAnilistUrl(query: String, variables: String): String {
        return "$anilistApi?query=" + URLEncoder.encode(query, "UTF-8") +
            "&variables=" + URLEncoder.encode(variables, "UTF-8")
    }

    /** Extract the AniList ID from a watch URL like
     *  "https://anicine.xyz/watch/anime/21-one-piece" or
     *  "https://anicine.xyz/anime/21" → 21. */
    private fun extractAnilistId(url: String): Int? {
        // Try /watch/anime/{id}-{slug} pattern
        val watchMatch = Regex("""/watch/anime/(\d+)(?:-|$)""").find(url)
        if (watchMatch != null) return watchMatch.groupValues[1].toIntOrNull()
        // Try /anime/{id} pattern
        val animeMatch = Regex("""/anime/(\d+)(?:[/-]|$)""").find(url)
        if (animeMatch != null) return animeMatch.groupValues[1].toIntOrNull()
        // Try bare integer
        return url.trim('/').substringAfterLast('/').substringBefore('-').toIntOrNull()
    }

    /** JSON-escape a string for embedding in a variables JSON. */
    private fun escapeJson(s: String): String {
        val sb = StringBuilder("\"")
        for (c in s) {
            when (c) {
                '\\' -> sb.append("\\\\")
                '"' -> sb.append("\\\"")
                '\n' -> sb.append("\\n")
                '\r' -> sb.append("\\r")
                '\t' -> sb.append("\\t")
                else -> if (c.code < 0x20) {
                    sb.append(String.format("\\u%04x", c.code))
                } else {
                    sb.append(c)
                }
            }
        }
        sb.append('"')
        return sb.toString()
    }

    /** Strip HTML tags from a description string. */
    private fun stripHtml(s: String): String {
        return s.replace(Regex("<br\\s*/?>", RegexOption.IGNORE_CASE), "\n")
            .replace(Regex("<[^>]+>"), "")
            .replace("&amp;", "&")
            .replace("&lt;", "<")
            .replace("&gt;", ">")
            .replace("&quot;", "\"")
            .replace("&#39;", "'")
            .replace("&nbsp;", " ")
            .trim()
    }

    /** URL-style slugify for building recommendation watch URLs. */
    private fun slugify(s: String): String {
        return s.lowercase()
            .replace(Regex("[^a-z0-9]+"), "-")
            .trim('-')
            .take(80)
    }

    // ═══════════════════════════════════════════════════════════════════════
    //  Data classes (AniList GraphQL responses)
    // ═══════════════════════════════════════════════════════════════════════

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListPageResponse(
        @JsonProperty("data") val data: PageData? = null
    ) {
        @JsonIgnoreProperties(ignoreUnknown = true)
        data class PageData(
            @JsonProperty("Page") val page: Page? = null
        ) {
            @JsonIgnoreProperties(ignoreUnknown = true)
            data class Page(
                @JsonProperty("media") val media: List<Media> = emptyList()
            )
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListMediaResponse(
        @JsonProperty("data") val data: MediaData? = null
    ) {
        @JsonIgnoreProperties(ignoreUnknown = true)
        data class MediaData(
            @JsonProperty("Media") val media: Media? = null
        )
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Media(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("title") val title: Title? = null,
        @JsonProperty("coverImage") val coverImage: CoverImage? = null,
        @JsonProperty("bannerImage") val bannerImage: String? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("genres") val genres: List<String>? = null,
        @JsonProperty("averageScore") val averageScore: Int? = null,
        @JsonProperty("episodes") val episodes: Int? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("seasonYear") val seasonYear: Int? = null,
        @JsonProperty("format") val format: String? = null,
        @JsonProperty("nextAiringEpisode") val nextAiringEpisode: NextAiring? = null,
        @JsonProperty("recommendations") val recommendations: Recommendations? = null
    ) {
        fun toSearchResponse(): SearchResponse? {
            val id = id ?: return null
            val t = title?.english?.takeIf { it.isNotBlank() }
                ?: title?.romaji?.takeIf { it.isNotBlank() }
                ?: title?.native ?: return null
            val poster = coverImage?.extraLarge ?: coverImage?.large
            return newAnimeSearchResponse(t, "$mainUrl/watch/anime/$id-${slugify(t)}", TvType.Anime) {
                this.posterUrl = poster
                this.year = seasonYear
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Title(
        @JsonProperty("romaji") val romaji: String? = null,
        @JsonProperty("english") val english: String? = null,
        @JsonProperty("native") val native: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class CoverImage(
        @JsonProperty("large") val large: String? = null,
        @JsonProperty("extraLarge") val extraLarge: String? = null,
        @JsonProperty("medium") val medium: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class NextAiring(
        @JsonProperty("airingAt") val airingAt: Int? = null,
        @JsonProperty("episode") val episode: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Recommendations(
        @JsonProperty("nodes") val nodes: List<Node>? = null
    ) {
        @JsonIgnoreProperties(ignoreUnknown = true)
        data class Node(
            @JsonProperty("mediaRecommendation") val mediaRecommendation: Media? = null
        )
    }

    // ═══════════════════════════════════════════════════════════════════════
    //  Data classes (provider API responses)
    // ═══════════════════════════════════════════════════════════════════════

    /** MegaPlay /stream/getSourcesNew response. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class MegaPlaySourcesResponse(
        @JsonProperty("sources") val sources: MegaPlaySource? = null,
        @JsonProperty("tracks") val tracks: List<Track>? = null,
        @JsonProperty("intro") val intro: SkipRange? = null,
        @JsonProperty("outro") val outro: SkipRange? = null,
        @JsonProperty("server") val server: Int? = null
    ) {
        @JsonIgnoreProperties(ignoreUnknown = true)
        data class MegaPlaySource(
            @JsonProperty("file") val file: String? = null
        )

        @JsonIgnoreProperties(ignoreUnknown = true)
        data class Track(
            @JsonProperty("file") val file: String? = null,
            @JsonProperty("label") val label: String? = null,
            @JsonProperty("kind") val kind: String? = null,
            @JsonProperty("default") val default: Boolean? = null
        )

        @JsonIgnoreProperties(ignoreUnknown = true)
        data class SkipRange(
            @JsonProperty("start") val start: Int? = null,
            @JsonProperty("end") val end: Int? = null
        )
    }

    /** 4animo /stream/getSources response (AniList-style id pattern). */
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimoSourcesResponse(
        @JsonProperty("sources") val sources: List<AnimoSource>? = null,
        @JsonProperty("tracks") val tracks: List<AnimoTrack>? = null,
        @JsonProperty("intro") val intro: SkipRange? = null,
        @JsonProperty("outro") val outro: SkipRange? = null,
        @JsonProperty("encrypted") val encrypted: Boolean? = null,
        @JsonProperty("server") val server: Int? = null
    ) {
        @JsonIgnoreProperties(ignoreUnknown = true)
        data class AnimoSource(
            @JsonProperty("file") val file: String? = null,
            @JsonProperty("type") val type: String? = null
        )

        @JsonIgnoreProperties(ignoreUnknown = true)
        data class AnimoTrack(
            @JsonProperty("file") val file: String? = null,
            @JsonProperty("label") val label: String? = null,
            @JsonProperty("kind") val kind: String? = null,
            @JsonProperty("default") val default: Boolean? = null
        )

        @JsonIgnoreProperties(ignoreUnknown = true)
        data class SkipRange(
            @JsonProperty("start") val start: Int? = null,
            @JsonProperty("end") val end: Int? = null
        )
    }
}
