package com.laddu100.anitaku

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import org.jsoup.nodes.Element
import java.net.URLEncoder
import java.util.concurrent.ConcurrentHashMap

class Anitaku : MainAPI() {
    override var mainUrl = "https://anitaku.online"
    override var name = "Anitaku"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val TAG = "Anitaku"

    override val mainPage = mainPageOf(
        "$mainUrl/" to "Recent Episodes",
        "$mainUrl/popular.html" to "Popular",
        "$mainUrl/anime-movies.html" to "Movies",
        "$mainUrl/season.html" to "New Season"
    )

    private val aniListCache = ConcurrentHashMap<String, AniListMeta>()

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage: ${request.name} page=$page")
        val url = if (page > 1) "${request.data}?page=$page" else request.data
        val doc = app.get(url, headers = browserHeaders, timeout = 30_000L).document
        val items = doc.select("div.last_episodes .items li").mapNotNull { it.toSearchResult() }
        return newHomePageResponse(request.name, items)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search: $query")
        val encoded = URLEncoder.encode(query, "UTF-8")
        val doc = app.get("$mainUrl/search.html?keyword=$encoded", headers = browserHeaders, timeout = 30_000L).document
        return doc.select("div.last_episodes .items li").mapNotNull { it.toSearchResult() }
    }

    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load: $url")
        val doc = app.get(url, headers = browserHeaders, timeout = 30_000L).document

        val title = doc.selectFirst("div.anime_info_body h1")?.text()?.trim()
            ?: doc.selectFirst("h1")?.text()?.trim()
            ?: return null

        val poster = doc.selectFirst("div.anime_info_body img")?.let {
            it.attr("data-src").ifBlank { it.attr("src") }
        }

        val plot = doc.selectFirst("div.anime_info_body p.type:contains(Plot Summary) + p")
            ?.text()?.trim()
            ?: doc.selectFirst("div.description")?.text()?.trim()

        val genres = doc.select("div.anime_info_body p.type:contains(Genre) a").map { it.text() }

        val typeText = doc.selectFirst("div.anime_info_body p.type:contains(Type) a")?.text()?.trim()
        val isMovie = typeText?.contains("movie", ignoreCase = true) == true
            || typeText?.contains("ova", ignoreCase = true) == true

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        doc.select("ul#episode_related li a").forEach { el ->
            val epNum = el.attr("data-num").toIntOrNull() ?: return@forEach
            val epSlug = el.attr("href")?.substringAfterLast("/") ?: return@forEach
            val hasSub = el.attr("data-sub") == "1"
            val hasDub = el.attr("data-dub") == "1"

            if (hasSub) {
                subEpisodes.add(newEpisode("sub|$epSlug", name = "Episode $epNum") {
                    this.episode = epNum
                })
            }
            if (hasDub) {
                dubEpisodes.add(newEpisode("dub|$epSlug", name = "Episode $epNum") {
                    this.episode = epNum
                })
            }
        }

        val aniMeta = fetchAniListMeta(title)
        if (aniMeta != null) {
            subEpisodes.forEach { ep ->
                aniMeta.episodeTitles[ep.episode]?.let { ep.name = "EP ${ep.episode} - $it" }
            }
            dubEpisodes.forEach { ep ->
                aniMeta.episodeTitles[ep.episode]?.let { ep.name = "EP ${ep.episode} - $it" }
            }
        }

        val finalType = when {
            isMovie && dubEpisodes.isNotEmpty() -> TvType.Anime
            isMovie -> TvType.AnimeMovie
            else -> TvType.Anime
        }

        return newAnimeLoadResponse(title, url, finalType) {
            this.posterUrl = poster ?: aniMeta?.poster
            this.plot = plot ?: aniMeta?.description
            this.tags = genres.ifEmpty { aniMeta?.genres }
            addEpisodes(DubStatus.Subbed, subEpisodes.sortedBy { it.episode })
            if (dubEpisodes.isNotEmpty()) {
                addEpisodes(DubStatus.Dubbed, dubEpisodes.sortedBy { it.episode })
            }
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks: $data")
        val parts = data.split("|")
        if (parts.size < 2) return false
        val audioType = parts[0]
        val epSlug = parts[1]

        val epUrl = "$mainUrl/$epSlug"
        val doc = app.get(epUrl, headers = browserHeaders, timeout = 30_000L).document

        var found = false
        val typeAttr = if (audioType == "dub") "DUB" else "SUB"

        var servers = doc.select("div.server-items.type_$typeAttr .server a[data-video]")
        if (servers.isEmpty() && typeAttr == "SUB") {
            servers = doc.select("div.server-items.type_HSUB .server a[data-video]")
        }

        for (server in servers) {
            val embedUrl = server.attr("data-video")
            val serverName = server.text().trim().replace("Choose this server", "").trim()
            if (embedUrl.isBlank()) continue

            val subtitleUrl = extractSubtitleUrl(embedUrl)
            if (subtitleUrl != null && audioType != "dub") {
                subtitleCallback.invoke(SubtitleFile("English", subtitleUrl))
            }

            when {
                embedUrl.contains("vivibebe.site") || embedUrl.contains("bibiemb.xyz") -> {
                    if (resolveJwPlayer(embedUrl, serverName, callback)) found = true
                }
                else -> {
                    if (resolveWithFallback(embedUrl, serverName, subtitleCallback, callback)) {
                        found = true
                    }
                }
            }
        }

        return found
    }

    private suspend fun resolveJwPlayer(
        embedUrl: String,
        serverName: String,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return try {
            val doc = app.get(embedUrl, headers = mapOf("Referer" to mainUrl), timeout = 30_000L).document
            val script = doc.select("script").find { it.data().contains("const src = ") }?.data()
                ?: return false
            val m3u8 = Regex("""const src = "([^"]+)"""").find(script)?.groupValues?.get(1)
                ?: return false

            if (m3u8.contains(".m3u8")) {
                M3u8Helper.generateM3u8(
                    name = "$name - $serverName",
                    streamUrl = m3u8,
                    referer = embedUrl
                ).forEach(callback)
                true
            } else false
        } catch (e: Exception) {
            Log.e(TAG, "jwplayer failed for $embedUrl: ${e.message}")
            false
        }
    }

    private suspend fun resolveWithFallback(
        embedUrl: String,
        serverName: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val extractorWorked = try {
            loadExtractor(embedUrl, mainUrl, subtitleCallback, callback)
        } catch (e: Exception) {
            Log.e(TAG, "loadExtractor failed: ${e.message}")
            false
        }
        if (extractorWorked) return true

        return try {
            val resolver = WebViewResolver(
                interceptUrl = Regex("""(?i)\.(m3u8|mp4)(?:\?|$)"""),
                additionalUrls = listOf(Regex("""(?i)\.(m3u8|mp4)(?:\?|$)""")),
                script = """document.querySelector('button,[role="button"],.jw-icon-display')?.click();""",
                useOkhttp = false,
                timeout = 20_000L
            )
            val resolved = app.get(embedUrl, referer = mainUrl, interceptor = resolver).url
            if (resolved.contains(".m3u8")) {
                M3u8Helper.generateM3u8(
                    name = "$name - $serverName",
                    streamUrl = resolved,
                    referer = embedUrl
                ).forEach(callback)
                true
            } else false
        } catch (e: Exception) {
            Log.e(TAG, "webview fallback failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchAniListMeta(title: String): AniListMeta? {
        val cacheKey = title.lowercase()
        aniListCache[cacheKey]?.let { return it }

        val query = """query(${'$'}search: String) {
            Media(search: ${'$'}search, type: ANIME) {
                id
                title { english romaji }
                description
                coverImage { large }
                genres
            }
        }"""

        val request = mapOf(
            "query" to query,
            "variables" to mapOf("search" to title)
        )

        return try {
            val response = app.post(
                "https://graphql.anilist.co",
                data = toJson(request),
                headers = mapOf("Content-Type" to "application/json"),
                timeout = 15_000L
            )
            val media = parseJson<AniListResponse>(response.text).data?.media ?: return null

            val epTitles = mutableMapOf<Int, String>()
            val aniZipUrl = "https://api.ani.zip/mappings?anilist_id=${media.id}"
            val aniZipResp = app.get(aniZipUrl, timeout = 15_000L).text
            val aniZipData = parseJson<AniZipResponse>(aniZipResp)

            aniZipData.episodes?.forEach { (numStr, ep) ->
                val num = numStr.toIntOrNull() ?: return@forEach
                ep.title?.english?.let { epTitles[num] = it }
                    ?: ep.title?.romaji?.let { epTitles[num] = it }
            }

            val result = AniListMeta(
                poster = media.coverImage?.large,
                description = media.description,
                genres = media.genres,
                episodeTitles = epTitles
            )
            aniListCache[cacheKey] = result
            result
        } catch (e: Exception) {
            Log.e(TAG, "AniList failed: ${e.message}")
            null
        }
    }

    private fun extractSubtitleUrl(embedUrl: String): String? {
        val params = listOf("?sub=", "&sub=", "?caption_1=", "&caption_1=", "?c1_file=", "&c1_file=")
        for (param in params) {
            if (embedUrl.contains(param)) {
                return embedUrl.substringAfter(param, "").substringBefore("&").takeIf { it.endsWith(".vtt") }
            }
        }
        return null
    }

    private fun Element.toSearchResult(): SearchResponse? {
        val a = this.selectFirst("a") ?: return null
        val href = a.attr("href") ?: return null
        val title = this.selectFirst("p.name")?.text()?.trim()
            ?: a.attr("title")?.trim()
            ?: return null
        val poster = this.selectFirst("img")?.let {
            it.attr("data-src").ifBlank { it.attr("src") }
        }

        val fixedHref = fixUrl(href)
        val isEpisodeUrl = fixedHref.contains("-episode-")
        val animeUrl = if (isEpisodeUrl) {
            val slug = fixedHref.substringAfterLast("/").substringBeforeLast("-episode-")
            "$mainUrl/category/$slug"
        } else {
            fixedHref
        }

        return newAnimeSearchResponse(title, animeUrl, TvType.Anime) {
            this.posterUrl = poster
        }
    }

    private val browserHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.5",
        "Accept-Encoding" to "gzip, deflate, br",
        "DNT" to "1",
        "Connection" to "keep-alive",
        "Upgrade-Insecure-Requests" to "1"
    )
}

data class AniListMeta(
    val poster: String?,
    val description: String?,
    val genres: List<String>?,
    val episodeTitles: Map<Int, String>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListResponse(
    @JsonProperty("data") val data: AniListData? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListData(
    @JsonProperty("Media") val media: AniListMedia? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListMedia(
    @JsonProperty("id") val id: Int? = null,
    @JsonProperty("title") val title: AniListTitle? = null,
    @JsonProperty("description") val description: String? = null,
    @JsonProperty("coverImage") val coverImage: CoverImage? = null,
    @JsonProperty("genres") val genres: List<String>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListTitle(
    @JsonProperty("english") val english: String? = null,
    @JsonProperty("romaji") val romaji: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class CoverImage(
    @JsonProperty("large") val large: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniZipResponse(
    @JsonProperty("episodes") val episodes: Map<String, AniZipEpisode>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniZipEpisode(
    @JsonProperty("title") val title: AniZipTitle? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniZipTitle(
    @JsonProperty("english") val english: String? = null,
    @JsonProperty("romaji") val romaji: String? = null
)
