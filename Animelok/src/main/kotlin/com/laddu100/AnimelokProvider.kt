package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.INFER_TYPE
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.net.URLEncoder

class AnimelokProvider : MainAPI() {
    override var mainUrl = "https://animelok.net"
    override var name = "Animelok"
    override var lang = "en"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        Pair("/home", "Trending"),
        Pair("/trending", "Popular"),
        Pair("/cartoons", "Cartoons")
    )

    private val TAG = "Animelok"
    private val ua = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/150.0.0.0 Safari/537.36"

    private val baseHeaders = mapOf(
        "User-Agent" to ua,
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.9",
        "Referer" to "$mainUrl/"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage: section='${request.name}' url='${request.data}'")
        val url = "$mainUrl${request.data}"
        return try {
            val resp = app.get(url, headers = baseHeaders)
            Log.d(TAG, "getMainPage: response code=${resp.code} len=${resp.text.length}")
            val results = parseSearchResults(resp.text)
            Log.d(TAG, "getMainPage: parsed ${results.size} results for '${request.name}'")
            newHomePageResponse(request.name, results, hasNext = false)
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage FAILED: ${e.message}")
            newHomePageResponse(request.name, emptyList(), hasNext = false)
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search: query='$query'")
        if (query.isBlank()) return emptyList()
        val url = "$mainUrl/search?keyword=" + URLEncoder.encode(query, "UTF-8")
        return try {
            val resp = app.get(url, headers = baseHeaders)
            Log.d(TAG, "search: response code=${resp.code} len=${resp.text.length}")
            val results = parseSearchResults(resp.text)
            Log.d(TAG, "search: parsed ${results.size} results")
            results
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED: ${e.message}")
            emptyList()
        }
    }

    private fun parseSearchResults(html: String): List<SearchResponse> {
        val results = mutableListOf<SearchResponse>()
        val hrefRegex = Regex("""href="(/anime/[a-z0-9][a-z0-9-]+)"[^>]*>""")
        val altRegex = Regex("<img[^>]*alt=\"([^\"]+)\"")
        val h3Regex = Regex("<h3[^>]*>([^<]+)</h3>")
        val imgSrcRegex = Regex("""<img[^>]*src="([^"]+)"""")

        // RSC data has escaped quotes: \"href\":\"/anime/HASH\"...\"slug\":\"SLUG\"
        val slugRegexEscaped = Regex("\\\\\"href\\\\\":\\\\\"/anime/([a-f0-9]+)\\\\\"[^}]*\\\\\"slug\\\\\":\\\\\"([^\\\\\"]+)\\\\\"")
        val slugMap = mutableMapOf<String, String>()
        slugRegexEscaped.findAll(html).forEach { m ->
            slugMap["/anime/${m.groupValues[1]}"] = m.groupValues[2]
        }

        hrefRegex.findAll(html).forEach { match ->
            val href = match.groupValues[1]
            val after = html.substring(match.range.last, (match.range.last + 2000).coerceAtMost(html.length))
            val title = altRegex.find(after)?.groupValues?.get(1)
                ?: h3Regex.find(after)?.groupValues?.get(1)
                ?: return@forEach
            val decodedTitle = title.replace("&#x27;", "'").replace("&amp;", "&")
                .replace("&quot;", "\"").replace("&#x2F;", "/").trim()
            if (decodedTitle.length < 2 || decodedTitle.length > 200) return@forEach
            val slug = slugMap[href] ?: href.removePrefix("/anime/")
            var poster = imgSrcRegex.find(after)?.groupValues?.get(1) ?: ""
            // Unwrap wsrv.nl proxy URLs to get the direct image URL
            if (poster.contains("wsrv.nl/?url=")) {
                val encodedUrl = poster.substringAfter("url=").substringBefore("&")
                poster = java.net.URLDecoder.decode(encodedUrl, "UTF-8")
            }
            results.add(newAnimeSearchResponse(decodedTitle, slug, TvType.Anime) {
                this.posterUrl = poster
            })
        }
        return results.distinctBy { it.name }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class EpisodesRangeResponse(
        @JsonProperty("episodes") val episodes: List<EpisodeInfo>? = null
    ) {
        @JsonIgnoreProperties(ignoreUnknown = true)
        data class EpisodeInfo(
            @JsonProperty("number") val number: Int? = null,
            @JsonProperty("name") val name: String? = null,
            @JsonProperty("img") val img: String? = null,
            @JsonProperty("isFiller") val isFiller: Boolean? = null,
            @JsonProperty("description") val description: String? = null
        )
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class EpisodeApiResponse(
        @JsonProperty("anime") val anime: AnimeInfo? = null,
        @JsonProperty("episode") val episode: EpisodeData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AnimeInfo(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("anilistId") val anilistId: Int? = null,
        @JsonProperty("slug") val slug: String? = null,
        @JsonProperty("title") val title: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class EpisodeData(
        @JsonProperty("number") val number: Int? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("img") val img: String? = null,
        @JsonProperty("introStart") val introStart: Int? = null,
        @JsonProperty("introEnd") val introEnd: Int? = null,
        @JsonProperty("outroStart") val outroStart: Int? = null,
        @JsonProperty("outroEnd") val outroEnd: Int? = null,
        @JsonProperty("servers") val servers: List<Server>? = null,
        @JsonProperty("subtitles") val subtitles: List<Subtitle>? = null,
        @JsonProperty("languages") val languages: List<String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class Server(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("tip") val tip: String? = null,
        @JsonProperty("languages") val languages: List<String>? = null,
        @JsonProperty("url") val url: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class Subtitle(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("url") val url: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class EpisodeLoadData(
        @JsonProperty("slug") val slug: String? = null,
        @JsonProperty("epNum") val epNum: Int? = null,
        @JsonProperty("lang") val lang: String? = null
    )

    override suspend fun load(url: String): LoadResponse? {
        var slug = url.substringAfterLast("/").takeIf { it.isNotBlank() } ?: url
        Log.d(TAG, "load: url=$url, slug=$slug")

        val apiHeaders = mapOf(
            "User-Agent" to ua,
            "Accept" to "*/*",
            "Referer" to "$mainUrl/watch/$slug"
        )

        Log.d(TAG, "load: fetching episodes/1 for slug=$slug")
        var ep1Url = "$mainUrl/api/anime/$slug/episodes/1"
        var ep1Resp = try {
            app.get(ep1Url, headers = apiHeaders, timeout = 30_000L)
        } catch (e: Exception) {
            Log.e(TAG, "load: episodes/1 fetch FAILED: ${e.message}")
            return null
        }
        Log.d(TAG, "load: episodes/1 response code=${ep1Resp.code} len=${ep1Resp.text.length}")

        if (ep1Resp.code == 404) {
            Log.d(TAG, "load: got 404, trying to resolve hash→slug from anime page")
            val resolvedSlug = resolveSlugFromPage(slug)
            if (resolvedSlug != null && resolvedSlug != slug) {
                slug = resolvedSlug
                Log.d(TAG, "load: resolved slug=$slug")
                ep1Url = "$mainUrl/api/anime/$slug/episodes/1"
                ep1Resp = try {
                    app.get(ep1Url, headers = mapOf(
                        "User-Agent" to ua,
                        "Accept" to "*/*",
                        "Referer" to "$mainUrl/watch/$slug"
                    ), timeout = 30_000L)
                } catch (e: Exception) {
                    Log.e(TAG, "load: episodes/1 retry FAILED: ${e.message}")
                    return null
                }
                Log.d(TAG, "load: retry response code=${ep1Resp.code}")
            }
        }

        if (ep1Resp.code != 200) {
            Log.e(TAG, "load: episodes/1 non-200: ${ep1Resp.code}")
            return null
        }

        val ep1Data = try {
            parseJson<EpisodeApiResponse>(ep1Resp.text)
        } catch (e: Exception) {
            Log.e(TAG, "load: episodes/1 parse FAILED: ${e.message}")
            return null
        }

        val animeTitle = ep1Data.anime?.title ?: "Anime"
        val languages = ep1Data.episode?.languages ?: emptyList()
        val plot = ep1Data.episode?.description?.let { stripHtml(it) }
        Log.d(TAG, "load: title='$animeTitle', languages=$languages")

        val fetchLang = when {
            languages.contains("JAPANESE") -> "JAPANESE"
            languages.contains("ENGLISH") -> "ENGLISH"
            languages.isNotEmpty() -> languages.first()
            else -> "JAPANESE"
        }
        Log.d(TAG, "load: fetching episodes for lang=$fetchLang")
        val episodes = fetchAllEpisodes(slug, fetchLang)
        Log.d(TAG, "load: episodes=${episodes.size}")

        val finalType = TvType.Anime

        return newAnimeLoadResponse(animeTitle, slug, finalType) {
            this.plot = plot
            if (episodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, episodes)
        }
    }

    private suspend fun fetchAllEpisodes(slug: String, lang: String): List<Episode> {
        Log.d(TAG, "fetchAllEpisodes: slug=$slug, lang=$lang")
        val episodes = mutableListOf<Episode>()
        val apiHeaders = mapOf(
            "User-Agent" to ua,
            "Accept" to "*/*",
            "Referer" to "$mainUrl/watch/$slug"
        )
        var page = 0
        while (page < 20) {
            val url = "$mainUrl/api/anime/$slug/episodes-range?page=$page&lang=$lang&pageSize=100"
            Log.d(TAG, "fetchAllEpisodes: page=$page url=$url")
            try {
                val resp = app.get(url, headers = apiHeaders, timeout = 30_000L)
                Log.d(TAG, "fetchAllEpisodes: page=$page code=${resp.code} len=${resp.text.length}")
                if (resp.code != 200) {
                    Log.e(TAG, "fetchAllEpisodes: page=$page non-200, stopping")
                    break
                }
                val parsed = parseJson<EpisodesRangeResponse>(resp.text)
                val eps = parsed.episodes ?: break
                Log.d(TAG, "fetchAllEpisodes: page=$page parsed ${eps.size} episodes")
                if (eps.isEmpty()) break
                eps.forEach { ep ->
                    val num = ep.number ?: return@forEach
                    val epName = ep.name?.takeIf { it.isNotBlank() }
                    val fillerSuffix = if (ep.isFiller == true) " (Filler)" else ""
                    val loadData = EpisodeLoadData(
                        slug = slug,
                        epNum = num,
                        lang = lang
                    ).toJson()
                    episodes.add(newEpisode(loadData) {
                        this.episode = num
                        this.name = if (epName != null) "$epName$fillerSuffix" else "Episode $num$fillerSuffix"
                        this.posterUrl = ep.img
                        this.description = ep.description
                    })
                }
                if (eps.size < 100) break
                page++
            } catch (e: Exception) {
                Log.e(TAG, "fetchAllEpisodes: page=$page FAILED: ${e.message}")
                break
            }
        }
        Log.d(TAG, "fetchAllEpisodes: total ${episodes.size} episodes for lang=$lang")
        return episodes
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks: data=$data")

        val loadData = try {
            parseJson<EpisodeLoadData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: failed to parse JSON data: ${e.message}")
            return false
        }

        val slug = loadData.slug ?: run {
            Log.e(TAG, "loadLinks: slug is null")
            return false
        }
        val epNum = loadData.epNum ?: run {
            Log.e(TAG, "loadLinks: epNum is null")
            return false
        }
        Log.d(TAG, "loadLinks: slug=$slug, epNum=$epNum, lang=${loadData.lang}")

        val url = "$mainUrl/api/anime/$slug/episodes/$epNum"
        Log.d(TAG, "loadLinks: fetching $url")
        val resp = try {
            app.get(url, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "*/*",
                "Referer" to "$mainUrl/watch/$slug"
            ), timeout = 30_000L)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: fetch FAILED: ${e.message}")
            return false
        }
        Log.d(TAG, "loadLinks: response code=${resp.code} len=${resp.text.length}")
        if (resp.code != 200) {
            Log.e(TAG, "loadLinks: non-200: ${resp.code}")
            return false
        }

        val episodeData = try {
            parseJson<EpisodeApiResponse>(resp.text).episode
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: parse FAILED: ${e.message}")
            return false
        } ?: run {
            Log.e(TAG, "loadLinks: episode data is null")
            return false
        }

        val servers = episodeData.servers ?: emptyList()
        val subtitles = episodeData.subtitles ?: emptyList()
        Log.d(TAG, "loadLinks: ${servers.size} servers, ${subtitles.size} subtitles")
        var found = false

        val playHeaders = mapOf(
            "Referer" to "$mainUrl/",
            "User-Agent" to ua
        )

        for (sub in subtitles) {
            val subUrl = sub.url ?: continue
            if (subUrl.isBlank()) continue
            val subLabel = sub.name ?: "English"
            Log.d(TAG, "loadLinks: subtitle '$subLabel' -> $subUrl")
            subtitleCallback.invoke(
                newSubtitleFile(subLabel, subUrl) {
                    this.headers = playHeaders
                }
            )
        }

        for (server in servers) {
            val serverUrl = server.url ?: continue
            if (serverUrl.isBlank()) continue
            val serverName = server.name ?: "unknown"
            val tip = server.tip ?: ""
            val langs = server.languages ?: emptyList()
            Log.d(TAG, "loadLinks: server name=$serverName tip=$tip langs=$langs url=${serverUrl.take(80)}")

            when {
                serverUrl.contains("play.zephyrflick.top") || serverName.contains("multi", ignoreCase = true) || tip.contains("multi", ignoreCase = true) -> {
                    Log.d(TAG, "loadLinks: resolving Multi Audio server")
                    val resolved = resolveMultiServer(serverUrl)
                    if (resolved != null) {
                        Log.d(TAG, "loadLinks: Multi resolved to $resolved")
                        val multiHeaders = mapOf(
                            "Referer" to "https://as-cdn21.top/",
                            "Origin" to "https://as-cdn21.top",
                            "User-Agent" to ua
                        )
                        val label = "Animelok - Multi Audio"
                        callback.invoke(
                            newExtractorLink(label, label, resolved, type = ExtractorLinkType.M3U8) {
                                this.referer = "https://as-cdn21.top/"
                                this.headers = multiHeaders
                            }
                        )
                        found = true
                    } else {
                        Log.e(TAG, "loadLinks: Multi resolution FAILED")
                    }
                }

                else -> {
                    Log.d(TAG, "loadLinks: skipping server '$serverName' (not Multi Audio)")
                }
            }
        }

        Log.d(TAG, "loadLinks: END found=$found")
        return found
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class PaheQuality(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("quality") val quality: String? = null
    )

    private suspend fun resolveMultiServer(serverUrl: String): String? {
        val hash = serverUrl.substringAfterLast("/").takeIf { it.isNotBlank() } ?: return null
        Log.d(TAG, "resolveMultiServer: hash=$hash")
        val postUrl = "https://as-cdn21.top/player/index.php?data=$hash&do=getVideo"
        val postBody = "hash=$hash&r=" + URLEncoder.encode("$mainUrl/", "UTF-8")
        return try {
            val resp = app.post(
                postUrl,
                headers = mapOf(
                    "User-Agent" to ua,
                    "Accept" to "application/json",
                    "Content-Type" to "application/x-www-form-urlencoded; charset=UTF-8",
                    "Origin" to "https://as-cdn21.top",
                    "Referer" to "https://as-cdn21.top/video/$hash",
                    "X-Requested-With" to "XMLHttpRequest"
                ),
                requestBody = postBody.toRequestBody("application/x-www-form-urlencoded; charset=UTF-8".toMediaType()),
                timeout = 30_000L
            )
            Log.d(TAG, "resolveMultiServer: POST response code=${resp.code} len=${resp.text.length}")
            if (resp.code != 200) return null
            val j = parseJson<MultiVideoResponse>(resp.text)
            val src = j.videoSource?.takeIf { it.isNotBlank() }
            Log.d(TAG, "resolveMultiServer: videoSource=$src")
            src
        } catch (e: Exception) {
            Log.e(TAG, "resolveMultiServer FAILED: ${e.message}")
            null
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class MultiVideoResponse(
        @JsonProperty("videoSource") val videoSource: String? = null,
        @JsonProperty("hls") val hls: Boolean? = null
    )

    private suspend fun resolveSlugFromPage(hashOrSlug: String): String? {
        val pageUrl = "$mainUrl/anime/$hashOrSlug"
        Log.d(TAG, "resolveSlugFromPage: fetching $pageUrl")
        return try {
            val resp = app.get(pageUrl, headers = baseHeaders, timeout = 15_000L)
            val html = resp.text
            // RSC data has: \"slug\":\"one-piece-21\"
            val slugRegex = Regex("\\\\\"slug\\\\\":\\\\\"([^\\\\\"]+)\\\\\"")
            val match = slugRegex.find(html)
            val slug = match?.groupValues?.get(1)
            Log.d(TAG, "resolveSlugFromPage: found slug=$slug")
            slug
        } catch (e: Exception) {
            Log.e(TAG, "resolveSlugFromPage FAILED: ${e.message}")
            null
        }
    }

    private fun stripHtml(s: String): String {
        return s.replace(Regex("<br\\s*/?>", RegexOption.IGNORE_CASE), "\n")
            .replace(Regex("<[^>]+>"), "")
            .replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">")
            .replace("&quot;", "\"").replace("&#39;", "'").replace("&nbsp;", " ")
            .trim()
    }
}
