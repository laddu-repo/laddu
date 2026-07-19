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
        val url = "$mainUrl${request.data}"
        return try {
            val resp = app.get(url, headers = baseHeaders)
            val results = parseSearchResults(resp.text)
            newHomePageResponse(request.name, results, hasNext = false)
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage failed: ${e.message}")
            newHomePageResponse(request.name, emptyList(), hasNext = false)
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        val url = "$mainUrl/search?keyword=" + URLEncoder.encode(query, "UTF-8")
        return try {
            val resp = app.get(url, headers = baseHeaders)
            parseSearchResults(resp.text)
        } catch (e: Exception) {
            Log.e(TAG, "search failed: ${e.message}")
            emptyList()
        }
    }

    private fun parseSearchResults(html: String): List<SearchResponse> {
        val results = mutableListOf<SearchResponse>()
        val hrefRegex = Regex("""href="(/anime/[a-z0-9][a-z0-9-]+)"[^>]*>""")
        val altRegex = Regex("<img[^>]*alt=\"([^\"]+)\"")
        val h3Regex = Regex("<h3[^>]*>([^<]+)</h3>")
        val imgSrcRegex = Regex("""<img[^>]*src="([^"]+)"""")
        val slugRegex = Regex("\"href\":\"(/anime/[a-f0-9]+)\"[^}]*\"slug\":\"([^\"]+)\"")

        val slugMap = mutableMapOf<String, String>()
        slugRegex.findAll(html).forEach { m ->
            slugMap[m.groupValues[1]] = m.groupValues[2]
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
            val poster = imgSrcRegex.find(after)?.groupValues?.get(1) ?: ""
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

    override suspend fun load(url: String): LoadResponse? {
        val slug = url.removePrefix("$mainUrl/anime/").removePrefix("/")
        Log.d(TAG, "load: slug=$slug")

        val apiHeaders = mapOf(
            "User-Agent" to ua,
            "Accept" to "*/*",
            "Referer" to "$mainUrl/watch/$slug"
        )

        val ep1Url = "$mainUrl/api/anime/$slug/episodes/1"
        val ep1Resp = try {
            app.get(ep1Url, headers = apiHeaders, timeout = 30_000L)
        } catch (e: Exception) {
            Log.e(TAG, "load: episodes/1 fetch failed: ${e.message}")
            return null
        }
        if (ep1Resp.code != 200) {
            Log.e(TAG, "load: episodes/1 non-200: ${ep1Resp.code}")
            return null
        }

        val ep1Data = try {
            parseJson<EpisodeApiResponse>(ep1Resp.text)
        } catch (e: Exception) {
            Log.e(TAG, "load: episodes/1 parse failed: ${e.message}")
            return null
        }

        val animeTitle = ep1Data.anime?.title ?: "Anime"
        val languages = ep1Data.episode?.languages ?: emptyList()
        Log.d(TAG, "load: title=$animeTitle, languages=$languages")

        val hasJapanese = languages.contains("JAPANESE") || languages.isEmpty()
        val hasEnglish = languages.contains("ENGLISH")
        val hasIndianLang = listOf("HINDI", "TELUGU", "TAMIL", "MALAYALAM").any { languages.contains(it) }

        val subEps = if (hasJapanese) fetchAllEpisodes(slug, "JAPANESE") else emptyList()
        val dubEps = if (hasEnglish) fetchAllEpisodes(slug, "ENGLISH") else emptyList()

        val tvType = TvType.Anime
        val finalType = if (dubEps.isNotEmpty()) TvType.Anime else tvType

        Log.d(TAG, "load: subEps=${subEps.size}, dubEps=${dubEps.size}")

        return newAnimeLoadResponse(animeTitle, slug, finalType) {
            this.plot = ep1Data.episode?.description?.let { stripHtml(it) }
            if (subEps.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEps)
            if (dubEps.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEps)
        }
    }

    private suspend fun fetchAllEpisodes(slug: String, lang: String): List<Episode> {
        val episodes = mutableListOf<Episode>()
        val apiHeaders = mapOf(
            "User-Agent" to ua,
            "Accept" to "*/*",
            "Referer" to "$mainUrl/watch/$slug"
        )
        var page = 0
        while (page < 20) {
            val url = "$mainUrl/api/anime/$slug/episodes-range?page=$page&lang=$lang&pageSize=100"
            try {
                val resp = app.get(url, headers = apiHeaders, timeout = 30_000L)
                if (resp.code != 200) break
                val parsed = parseJson<EpisodesRangeResponse>(resp.text)
                val eps = parsed.episodes ?: break
                if (eps.isEmpty()) break
                eps.forEach { ep ->
                    val num = ep.number ?: return@forEach
                    val epName = ep.name?.takeIf { it.isNotBlank() }
                    val fillerSuffix = if (ep.isFiller == true) " (Filler)" else ""
                    episodes.add(newEpisode("$slug|$num|$lang") {
                        this.episode = num
                        this.name = if (epName != null) "$epName$fillerSuffix" else "Episode $num$fillerSuffix"
                        this.posterUrl = ep.img
                        this.description = ep.description
                    })
                }
                if (eps.size < 100) break
                page++
            } catch (e: Exception) {
                Log.e(TAG, "fetchAllEpisodes page=$page failed: ${e.message}")
                break
            }
        }
        return episodes
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val parts = data.split("|")
        if (parts.size < 3) return false
        val slug = parts[0]
        val epNum = parts[1].toIntOrNull() ?: return false
        Log.d(TAG, "loadLinks: slug=$slug epNum=$epNum")

        val url = "$mainUrl/api/anime/$slug/episodes/$epNum"
        val resp = try {
            app.get(url, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "*/*",
                "Referer" to "$mainUrl/watch/$slug"
            ), timeout = 30_000L)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: fetch failed: ${e.message}")
            return false
        }
        if (resp.code != 200) {
            Log.e(TAG, "loadLinks: non-200: ${resp.code}")
            return false
        }

        val episodeData = try {
            parseJson<EpisodeApiResponse>(resp.text).episode
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: parse failed: ${e.message}")
            return false
        } ?: run {
            Log.e(TAG, "loadLinks: episode data is null")
            return false
        }

        val servers = episodeData.servers ?: emptyList()
        val subtitles = episodeData.subtitles ?: emptyList()
        var found = false

        val playHeaders = mapOf(
            "Referer" to "$mainUrl/",
            "User-Agent" to ua
        )

        for (sub in subtitles) {
            val subUrl = sub.url ?: continue
            if (subUrl.isBlank()) continue
            val subLabel = sub.name ?: "English"
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

            when {
                serverName.equals("bato", ignoreCase = true) -> {
                    val langLabel = if (langs.contains("ENGLISH")) "English Dub" else "Japanese Sub"
                    val label = "Animelok - bato ($langLabel)"
                    callback.invoke(
                        newExtractorLink(label, label, serverUrl, type = ExtractorLinkType.M3U8) {
                            this.referer = "$mainUrl/"
                            this.headers = playHeaders
                        }
                    )
                    found = true
                }

                serverName.equals("pahe", ignoreCase = true) -> {
                    try {
                        val qualities = parseJson<List<PaheQuality>>(serverUrl)
                        for (q in qualities) {
                            val qUrl = q.url ?: continue
                            val quality = q.quality ?: "unknown"
                            val label = "Animelok - pahe (Hardsub, $quality)"
                            callback.invoke(
                                newExtractorLink(label, label, qUrl, type = ExtractorLinkType.M3U8) {
                                    this.referer = "$mainUrl/"
                                    this.headers = playHeaders
                                }
                            )
                            found = true
                        }
                    } catch (_: Exception) {}
                }

                serverName.equals("Multi", ignoreCase = true) || tip.equals("Multi", ignoreCase = true) -> {
                    val resolved = resolveMultiServer(serverUrl)
                    if (resolved != null) {
                        val multiHeaders = mapOf(
                            "Referer" to "https://as-cdn21.top/",
                            "Origin" to "https://as-cdn21.top",
                            "User-Agent" to ua
                        )
                        val langLabel = if (langs.size > 1) "Multi" else (langs.firstOrNull() ?: "Multi")
                        val label = "Animelok - Multi ($langLabel)"
                        callback.invoke(
                            newExtractorLink(label, label, resolved, type = ExtractorLinkType.M3U8) {
                                this.referer = "https://as-cdn21.top/"
                                this.headers = multiHeaders
                            }
                        )
                        found = true
                    }
                }
            }
        }

        Log.d(TAG, "loadLinks: found=$found")
        return found
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class PaheQuality(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("quality") val quality: String? = null
    )

    private suspend fun resolveMultiServer(serverUrl: String): String? {
        val hash = serverUrl.substringAfterLast("/").takeIf { it.isNotBlank() } ?: return null
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
            if (resp.code != 200) return null
            val j = parseJson<MultiVideoResponse>(resp.text)
            j.videoSource?.takeIf { it.isNotBlank() }
        } catch (e: Exception) {
            Log.e(TAG, "resolveMultiServer failed: ${e.message}")
            null
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class MultiVideoResponse(
        @JsonProperty("videoSource") val videoSource: String? = null,
        @JsonProperty("hls") val hls: Boolean? = null
    )

    private fun stripHtml(s: String): String {
        return s.replace(Regex("<br\\s*/?>", RegexOption.IGNORE_CASE), "\n")
            .replace(Regex("<[^>]+>"), "")
            .replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">")
            .replace("&quot;", "\"").replace("&#39;", "'").replace("&nbsp;", " ")
            .trim()
    }
}
