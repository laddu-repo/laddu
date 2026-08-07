package com.laddu100.just4anime

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.utils.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import me.xdrop.fuzzywuzzy.FuzzySearch
import org.jsoup.Jsoup
import java.net.URLEncoder
import java.util.concurrent.ConcurrentHashMap

/**
 * Just4Anime - AniList-powered anime provider.
 *
 * The site (just4anime.online) is a Next.js frontend backed by a Hono.js API
 * at api.just4anime.online. Anime pages are keyed by AniList IDs.
 *
 * Verified API chain (all probed live, no guessing):
 *   Search      GET /api/v1/meta/anilist/search?query=X&page=N
 *   Info        GET /api/v1/meta/anilist/info/{anilistId}
 *   Homepage    GET /api/v1/meta/anilist/{trending|popular|top-rated|upcoming}?page=N
 *   Ep meta     GET https://just4anime.online/api/episodes/{anilistId}   (real episode names)
 *   Servers     GET /api/v1/meta/availability/{anilistId}[?num=N]        (per-type server list)
 *   Streams     GET /api/v1/meta/sources?provider={code}&episodeId={epId}&num={N}&type={sub|hsub|dub}
 *
 * The availability endpoint returns, for every server it knows, the exact
 * per-episode `episodeId` to feed into the sources endpoint. Stream URLs and
 * subtitles come back through the site's own CORS proxy (cors.just4anime.online)
 * so ExoPlayer can play them with no referer handling.
 */
class Just4Anime : MainAPI() {
    override var mainUrl = "https://just4anime.online"
    override var name = "Just4Anime"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val apiBase = "https://api.just4anime.online/api"

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "application/json, text/plain, */*",
        "Accept-Language" to "en-US,en;q=0.9",
    )

    override val mainPage = mainPageOf(
        "$apiBase/v1/meta/anilist/trending" to "Trending",
        "$apiBase/v1/meta/anilist/popular" to "Popular",
        "$apiBase/v1/meta/anilist/top-rated" to "Top Rated",
        "$apiBase/v1/meta/anilist/upcoming" to "Upcoming",
    )

    // ------------------------------------------------------------------ homepage

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val separator = if (request.data.contains("?")) "&" else "?"
        val body = apiGet("${request.data}$separator" + "page=$page")
        val results = body?.let { parseJsonSafe<J4aAniListResponse>(it)?.data?.results }.orEmpty()
        val items = results.mapNotNull { it.toSearchResponse() }
        return newHomePageResponse(request.name, items)
    }

    // ------------------------------------------------------------------ search

    override suspend fun search(query: String): List<SearchResponse> {
        val encoded = URLEncoder.encode(query, "UTF-8")
        val body = apiGet("$apiBase/v1/meta/anilist/search?query=$encoded&page=1")
        val results = body?.let { parseJsonSafe<J4aAniListResponse>(it)?.data?.results }.orEmpty()
        return results.mapNotNull { it.toSearchResponse() }
    }

    private fun J4aSearchResult.toSearchResponse(): SearchResponse? {
        val anilistId = id ?: return null
        val title = title?.english?.ifBlank { null }
            ?: title?.romaji?.ifBlank { null }
            ?: title?.userPreferred
            ?: return null
        val tvType = when (type?.uppercase()) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL", "MUSIC" -> TvType.OVA
            else -> TvType.Anime
        }
        return newAnimeSearchResponse(title, "$mainUrl/anime/$anilistId", tvType) {
            this.posterUrl = image ?: cover
            addDubStatus(dubExist = true, subExist = true)
        }
    }

    // ------------------------------------------------------------------ details

    override suspend fun load(url: String): LoadResponse? {
        val anilistId = Regex("""/anime/(\d+)""").find(url)?.groupValues?.get(1) ?: return null

        val info = fetchAniListInfo(anilistId)
        val availability = fetchAvailability(anilistId)
        val epMeta = fetchEpisodeMeta(anilistId)

        val title = info?.title?.english?.ifBlank { null }
            ?: info?.title?.romaji?.ifBlank { null }
            ?: epMeta?.title
            ?: return null

        val poster = info?.coverImage?.extraLarge ?: info?.coverImage?.large ?: info?.bannerImage
        val plot = info?.description?.let { Jsoup.parse(it).text() }?.ifBlank { null }
        val genres = info?.genres?.mapNotNull {
            when (it) {
                is String -> it
                is Map<*, *> -> it["name"] as? String
                else -> null
            }
        } ?: emptyList()

        val format = info?.format?.uppercase()
        val tvType = when (format) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL", "MUSIC" -> TvType.OVA
            else -> TvType.Anime
        }

        val subProviders = (availability?.sub?.providers.orEmpty() + availability?.hsub?.providers.orEmpty())
            .filter { (it.totalEpisodes ?: 0) > 0 }
        val dubProviders = availability?.dub?.providers.orEmpty()
            .filter { (it.totalEpisodes ?: 0) > 0 }

        val anilistEps = info?.episodes ?: 0
        val metaEps = epMeta?.totalEpisodes ?: 0
        val subMax = (subProviders.maxOfOrNull { it.totalEpisodes ?: 0 } ?: 0)
            .coerceAtLeast(anilistEps).coerceAtLeast(metaEps).coerceAtLeast(1)
        val dubMax = if (dubProviders.isNotEmpty())
            (dubProviders.maxOfOrNull { it.totalEpisodes ?: 0 } ?: 0).coerceAtLeast(1)
        else 0

        // Real episode names — the frontend endpoint is keyed by AniList id but backed by
        // TheTVDB; guard against id mismatch by comparing series titles (fuzzy).
        val names = mutableMapOf<Int, String>()
        epMeta?.let { meta ->
            val metaTitle = meta.title.orEmpty()
            val infoTitle = (info?.title?.english ?: info?.title?.romaji).orEmpty()
            val ratio = if (metaTitle.isNotBlank() && infoTitle.isNotBlank())
                FuzzySearch.ratio(metaTitle.lowercase(), infoTitle.lowercase())
            else 0
            if (ratio >= 70) {
                meta.episodes.orEmpty().forEach { e ->
                    e.number?.let { n ->
                        e.title?.takeIf { it.isNotBlank() }?.let { names[n] = it }
                    }
                }
            }
        }
        if (names.isEmpty()) {
            fetchAniZip(anilistId)?.episodes.orEmpty().forEach { e ->
                e.number?.let { n ->
                    (e.title?.en ?: e.title?.romaji)?.takeIf { it.isNotBlank() }?.let { names[n] = it }
                }
            }
        }

        val defaultName = if (tvType == TvType.AnimeMovie) "Movie" else null
        val subEpisodes = (1..subMax).map { n ->
            newEpisode("$anilistId|$n|sub") {
                this.episode = n
                this.name = names[n] ?: defaultName ?: "Episode $n"
                this.posterUrl = poster
            }
        }
        val dubEpisodes = if (dubMax > 0) (1..dubMax).map { n ->
            newEpisode("$anilistId|$n|dub") {
                this.episode = n
                this.name = names[n] ?: defaultName ?: "Episode $n"
                this.posterUrl = poster
            }
        } else emptyList()

        val score = info?.averageScore?.let { com.lagradost.cloudstream3.Score.from10(it / 10f) }
        val year = info?.startDate?.year?.takeIf { it > 0 } ?: info?.seasonYear ?: 0

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = poster
            this.plot = plot
            this.tags = genres
            this.score = score
            if (year > 0) this.year = year
            if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
            if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
        }
    }

    // ------------------------------------------------------------------ streams

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val parts = data.split("|")
        if (parts.size < 3) return false
        val anilistId = parts[0]
        val epNum = parts[1].toIntOrNull() ?: return false
        val group = parts[2]

        // Episode-scoped availability gives exact episodeIds per server — no guessing.
        val availability = fetchAvailability(anilistId, epNum) ?: fetchAvailability(anilistId) ?: return false

        val subGroup = availability.sub?.providers.orEmpty()
        val hsubGroup = availability.hsub?.providers.orEmpty()
        val dubGroup = availability.dub?.providers.orEmpty()

        // "sub" episodes pull both Sub and HardSub servers; "dub" pulls Dub servers.
        val selected = when (group) {
            "dub" -> dubGroup.map { it to "dub" }
            else -> subGroup.map { it to "sub" } + hsubGroup.map { it to "hsub" }
        }

        val targets = mutableListOf<J4aTarget>()
        for ((provider, type) in selected) {
            val code = provider.code ?: continue
            if (provider.hasEpisode == false) continue
            val episodeId = provider.episodeId ?: when (code) {
                // AniNeko-family providers build ids as {slug}$ep-{num}
                "kai", "mai", "sai", "zeke", "koto", "levi" ->
                    provider.animeId?.let { "$it\$ep-$epNum" }
                else -> null
            } ?: continue
            if (episodeId.isBlank()) continue
            targets += J4aTarget(code, type, episodeId, provider.displayName ?: code)
        }

        val distinct = targets.distinctBy { it.code to it.type }
        if (distinct.isEmpty()) return false

        val semaphore = Semaphore(4)
        val seenSubs: MutableSet<String> = java.util.Collections.newSetFromMap(java.util.concurrent.ConcurrentHashMap<String, Boolean>())
        val results = coroutineScope {
            distinct.map { target ->
                async(Dispatchers.IO) {
                    semaphore.withPermit {
                        resolveProvider(epNum, target, seenSubs, subtitleCallback, callback)
                    }
                }
            }
        }
        return results.any { it.await() }
    }

    private suspend fun resolveProvider(
        epNum: Int,
        target: J4aTarget,
        seenSubs: MutableSet<String>,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val code = target.code
        val type = target.type
        val episodeId = target.episodeId
        val displayName = target.displayName
        val encodedId = URLEncoder.encode(episodeId, "UTF-8")
        val url = "$apiBase/v1/meta/sources?provider=$code&episodeId=$encodedId&num=$epNum&type=$type"
        val body = apiGet(url) ?: return false
        val parsed = parseJsonSafe<J4aSourcesResponse>(body) ?: return false
        if (parsed.success == false) return false
        val data = parsed.data ?: return false

        val typeLabel = when (type) {
            "dub" -> "Dub"
            "hsub" -> "H-Sub"
            else -> "Sub"
        }
        val baseName = if (displayName.isNotBlank()) "$displayName ($typeLabel)" else code

        var resolved = false
        val sources = data.sources.orEmpty()

        if (sources.isEmpty()) {
            // Embed iframe fallback (rare) — extract the HLS url from the embed page.
            for (frame in data.iframe.orEmpty()) {
                val frameUrl = frame.url ?: continue
                val m3u8 = resolveIframe(frameUrl) ?: continue
                callback(
                    newExtractorLink(baseName, baseName, m3u8, ExtractorLinkType.M3U8) {
                        this.referer = frameUrl
                    }
                )
                resolved = true
            }
        }

        for (src in sources) {
            val srcUrl = src.url ?: continue
            val quality = cleanQuality(src.quality)
            val label = if (quality.isNotBlank()) "$baseName $quality" else baseName
            val srcHeaders = src.headers.orEmpty()
            val isProxied = src.proxied ?: false

            if (src.isM3U8 == true) {
                val generated = if (isProxied)
                    M3u8Helper.generateM3u8(label, srcUrl, referer = "")
                else
                    M3u8Helper.generateM3u8(
                        label, srcUrl,
                        referer = srcHeaders["Referer"].orEmpty(),
                        headers = srcHeaders
                    )
                if (generated.isNotEmpty()) {
                    generated.forEach(callback)
                    resolved = true
                } else {
                    callback(
                        newExtractorLink(baseName, label, srcUrl, ExtractorLinkType.M3U8) {
                            this.headers = srcHeaders
                            srcHeaders["Referer"]?.let { this.referer = it }
                        }
                    )
                    resolved = true
                }
            } else {
                callback(
                    newExtractorLink(baseName, label, srcUrl, ExtractorLinkType.VIDEO) {
                        this.headers = srcHeaders
                        srcHeaders["Referer"]?.let { this.referer = it }
                    }
                )
                resolved = true
            }
        }

        // Subtitles — every language, deduplicated across sources.
        val subtitles = mutableListOf<J4aSubtitle>()
        subtitles += data.subtitles.orEmpty()
        data.sources.orEmpty().forEach { s ->
            subtitles += s.subtitles.orEmpty()
            subtitles += s.subtitleTracks.orEmpty()
        }
        subtitles.distinctBy { it.url }.forEach { sub ->
            val subUrl = sub.url ?: return@forEach
            if (!seenSubs.add(subUrl)) return@forEach
            val lang = sub.lang?.ifBlank { null } ?: sub.language ?: "English"
            try {
                subtitleCallback(
                    newSubtitleFile(lang, subUrl) {
                        this.headers = sub.headers.orEmpty()
                    }
                )
            } catch (e: Exception) {
                Log.d("Just4Anime", "subtitle failed: ${e.message}")
            }
        }

        return resolved
    }

    private suspend fun resolveIframe(url: String): String? = try {
        val page = app.get(url, headers = headers, timeout = 20_000L).text
        val m3u8 = Regex("""(?:https?:)?//[^"'\s]+\.m3u8[^"'\s]*""").find(page)?.value
        when {
            m3u8 == null -> null
            m3u8.startsWith("//") -> "https:$m3u8"
            else -> m3u8
        }
    } catch (e: Exception) {
        null
    }

    // ------------------------------------------------------------------ fetchers

    private suspend fun fetchAniListInfo(id: String): J4aAnimeDetail? {
        J4aCache.get<J4aAnimeDetail>("info:$id", TTL_30M)?.let { return it }
        val body = apiGet("$apiBase/v1/meta/anilist/info/$id") ?: return null
        val parsed = parseJsonSafe<J4aAniListInfoResponse>(body)?.anilist ?: return null
        J4aCache.put("info:$id", parsed)
        return parsed
    }

    private suspend fun fetchAvailability(id: String, num: Int? = null): J4aAvailability? {
        val key = if (num == null) "avail:$id" else "avail:$id:$num"
        val ttl = if (num == null) TTL_5M else TTL_10M
        J4aCache.get<J4aAvailability>(key, ttl)?.let { return it }
        val suffix = if (num == null) "" else "?num=$num"
        val body = apiGet("$apiBase/v1/meta/availability/$id$suffix") ?: return null
        val parsed = parseJsonSafe<J4aAvailabilityResponse>(body)?.data ?: return null
        if (parsed.animeId.isNullOrBlank()) return null
        J4aCache.put(key, parsed)
        return parsed
    }

    private suspend fun fetchEpisodeMeta(id: String): J4aEpisodesData? {
        J4aCache.get<J4aEpisodesData>("epmeta:$id", TTL_30M)?.let { return it }
        val body = apiGet("$mainUrl/api/episodes/$id") ?: return null
        val parsed = parseJsonSafe<J4aEpisodesResponse>(body)?.data ?: return null
        J4aCache.put("epmeta:$id", parsed)
        return parsed
    }

    private suspend fun fetchAniZip(id: String): J4aAniZipData? {
        J4aCache.get<J4aAniZipData>("anizip:$id", TTL_30M)?.let { return it }
        val body = apiGet("$apiBase/v1/meta/anizip/anilist/$id") ?: return null
        val parsed = parseJsonSafe<J4aAniZipResponse>(body)?.data ?: return null
        J4aCache.put("anizip:$id", parsed)
        return parsed
    }

    private suspend fun apiGet(url: String): String? = try {
        app.get(url, headers = headers, timeout = 30_000L).text
    } catch (e: Exception) {
        Log.d("Just4Anime", "apiGet failed: $url -> ${e.message}")
        null
    }

    private fun cleanQuality(q: String?): String {
        val raw = q?.trim().orEmpty()
        if (raw.isBlank()) return ""
        if (raw.equals("auto", true)) return "Auto"
        val last = raw.substringAfterLast(" - ", raw).trim()
        return if (last.isNotBlank() && last.length <= 20) last else raw
    }

    // ------------------------------------------------------------------ json

    private val jsonMapper: ObjectMapper by lazy {
        jacksonObjectMapper().apply {
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        }
    }

    private inline fun <reified T> parseJsonSafe(text: String): T? = try {
        jsonMapper.readValue(text, T::class.java)
    } catch (e: Exception) {
        Log.d("Just4Anime", "json parse failed: ${e.message}")
        null
    }

    companion object {
        private const val TTL_5M = 5 * 60_000L
        private const val TTL_10M = 10 * 60_000L
        private const val TTL_30M = 30 * 60_000L
    }
}

private data class J4aTarget(
    val code: String,
    val type: String,
    val episodeId: String,
    val displayName: String,
)

// ---------------------------------------------------------------------- cache

private object J4aCache {
    private val map = ConcurrentHashMap<String, Pair<Long, Any>>()

    fun <T> get(key: String, ttlMs: Long): T? {
        val entry = map[key] ?: return null
        if (System.currentTimeMillis() - entry.first > ttlMs) {
            map.remove(key)
            return null
        }
        @Suppress("UNCHECKED_CAST")
        return entry.second as? T
    }

    fun put(key: String, value: Any) {
        map[key] = System.currentTimeMillis() to value
    }
}

// ---------------------------------------------------------------------- models

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAniListResponse(
    @JsonProperty("data") val data: J4aAniListData? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAniListData(
    @JsonProperty("results") val results: List<J4aSearchResult>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aSearchResult(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("title") val title: J4aTitle? = null,
    @JsonProperty("image") val image: String? = null,
    @JsonProperty("cover") val cover: String? = null,
    @JsonProperty("type") val type: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aTitle(
    @JsonProperty("romaji") val romaji: String? = null,
    @JsonProperty("english") val english: String? = null,
    @JsonProperty("native") val native: String? = null,
    @JsonProperty("userPreferred") val userPreferred: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAniListInfoResponse(
    @JsonProperty("anilist") val anilist: J4aAnimeDetail? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAnimeDetail(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("title") val title: J4aTitle? = null,
    @JsonProperty("description") val description: String? = null,
    @JsonProperty("coverImage") val coverImage: J4aCoverImage? = null,
    @JsonProperty("bannerImage") val bannerImage: String? = null,
    @JsonProperty("format") val format: String? = null,
    @JsonProperty("episodes") val episodes: Int? = null,
    @JsonProperty("genres") val genres: List<Any>? = null,
    @JsonProperty("averageScore") val averageScore: Int? = null,
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("seasonYear") val seasonYear: Int? = null,
    @JsonProperty("startDate") val startDate: J4aDate? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aCoverImage(
    @JsonProperty("extraLarge") val extraLarge: String? = null,
    @JsonProperty("large") val large: String? = null,
    @JsonProperty("medium") val medium: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aDate(
    @JsonProperty("year") val year: Int? = null,
    @JsonProperty("month") val month: Int? = null,
    @JsonProperty("day") val day: Int? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAvailabilityResponse(
    @JsonProperty("success") val success: Boolean? = null,
    @JsonProperty("data") val data: J4aAvailability? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAvailability(
    @JsonProperty("animeId") val animeId: String? = null,
    @JsonProperty("malId") val malId: Long? = null,
    @JsonProperty("sub") val sub: J4aTypeGroup? = null,
    @JsonProperty("h-sub") val hsub: J4aTypeGroup? = null,
    @JsonProperty("dub") val dub: J4aTypeGroup? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aTypeGroup(
    @JsonProperty("total") val total: Int? = null,
    @JsonProperty("providers") val providers: List<J4aServer>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aServer(
    @JsonProperty("code") val code: String? = null,
    @JsonProperty("displayName") val displayName: String? = null,
    @JsonProperty("animeId") val animeId: String? = null,
    @JsonProperty("cached") val cached: Boolean? = null,
    @JsonProperty("hasEpisode") val hasEpisode: Boolean? = null,
    @JsonProperty("totalEpisodes") val totalEpisodes: Int? = null,
    @JsonProperty("episodeId") val episodeId: String? = null,
    @JsonProperty("types") val types: List<String>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aSourcesResponse(
    @JsonProperty("success") val success: Boolean? = null,
    @JsonProperty("message") val message: String? = null,
    @JsonProperty("data") val data: J4aSourcesData? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aSourcesData(
    @JsonProperty("isDub") val isDub: Boolean? = null,
    @JsonProperty("type") val type: String? = null,
    @JsonProperty("sources") val sources: List<J4aSource>? = null,
    @JsonProperty("subtitles") val subtitles: List<J4aSubtitle>? = null,
    @JsonProperty("iframe") val iframe: List<J4aSource>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aSource(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("quality") val quality: String? = null,
    @JsonProperty("isM3U8") val isM3U8: Boolean? = null,
    @JsonProperty("server") val server: String? = null,
    @JsonProperty("headers") val headers: Map<String, String>? = null,
    @JsonProperty("proxied") val proxied: Boolean? = null,
    @JsonProperty("isDub") val isDub: Boolean? = null,
    @JsonProperty("subtitles") val subtitles: List<J4aSubtitle>? = null,
    @JsonProperty("subtitleTracks") val subtitleTracks: List<J4aSubtitle>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aSubtitle(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("lang") val lang: String? = null,
    @JsonProperty("language") val language: String? = null,
    @JsonProperty("format") val format: String? = null,
    @JsonProperty("headers") val headers: Map<String, String>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aEpisodesResponse(
    @JsonProperty("success") val success: Boolean? = null,
    @JsonProperty("data") val data: J4aEpisodesData? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aEpisodesData(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("totalEpisodes") val totalEpisodes: Int? = null,
    @JsonProperty("episodes") val episodes: List<J4aEpisodeMeta>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aEpisodeMeta(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("number") val number: Int? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("image") val image: String? = null,
    @JsonProperty("airDate") val airDate: String? = null,
    @JsonProperty("hasAired") val hasAired: Boolean? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAniZipResponse(
    @JsonProperty("data") val data: J4aAniZipData? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAniZipData(
    @JsonProperty("titles") val titles: Map<String, String>? = null,
    @JsonProperty("episodes") val episodes: List<J4aAniZipEpisode>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAniZipEpisode(
    @JsonProperty("number") val number: Int? = null,
    @JsonProperty("title") val title: J4aAniZipTitle? = null,
    @JsonProperty("image") val image: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class J4aAniZipTitle(
    @JsonProperty("en") val en: String? = null,
    @JsonProperty("romaji") val romaji: String? = null,
)
