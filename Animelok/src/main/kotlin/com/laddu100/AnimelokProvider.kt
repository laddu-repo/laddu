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
            emptyList()
        }
    }

    private fun parseSearchResults(html: String): List<SearchResponse> {
        val results = mutableListOf<SearchResponse>()

        val hrefRegex = Regex("""href="(/anime/[a-f0-9]+)"[^>]*>""")
        val altRegex = Regex("<img alt=\"([^\"]+)\"")
        val slugRegex = Regex("\"href\":\"(/anime/[a-f0-9]+)\"[^}]*\"slug\":\"([^\"]+)\"")

        val slugMap = mutableMapOf<String, String>()
        slugRegex.findAll(html).forEach { m ->
            slugMap[m.groupValues[1]] = m.groupValues[2]
        }

        val imgRegex = Regex("""<img[^>]*src="([^"]+)"[^>]*/>""")

        hrefRegex.findAll(html).forEach { match ->
            val href = match.groupValues[1]
            val after = html.substring(match.range.last, (match.range.last + 2000).coerceAtMost(html.length))
            val title = altRegex.find(after)?.groupValues?.get(1) ?: return@forEach
            val decodedTitle = title.replace("&#x27;", "'").replace("&amp;", "&").replace("&quot;", "\"")
            val slug = slugMap[href] ?: href.removePrefix("/anime/")
            val imgMatch = imgRegex.find(after)
            val poster = imgMatch?.groupValues?.get(1) ?: ""

            results.add(newAnimeSearchResponse(decodedTitle, slug, TvType.Anime) {
                this.posterUrl = poster
            })
        }

        return results.distinctBy { it.name }
    }

    private data class AnimeDetail(
        val title: String,
        val slug: String,
        val description: String?,
        val format: String?,
        val status: String?,
        val year: Int?,
        val rating: Int?,
        val duration: String?,
        val genres: List<String>?,
        val languageEpisodes: Map<String, Int>?,
        val totalEpisodes: Int?
    )

    private suspend fun fetchAnimeDetail(slug: String): AnimeDetail? {
        val url = "$mainUrl/search?keyword=" + URLEncoder.encode(slug, "UTF-8")
        val body = "[\"$slug\"]".toByteArray()
        return try {
            val resp = app.post(
                url,
                headers = mapOf(
                    "User-Agent" to ua,
                    "Accept" to "text/x-component",
                    "Content-Type" to "text/plain;charset=UTF-8",
                    "Origin" to mainUrl,
                    "Referer" to "$mainUrl/search?keyword=" + URLEncoder.encode(slug, "UTF-8")
                ),
                data = body,
                timeout = 30_000L
            )
            val text = resp.text
            val jsonRegex = Regex("""\{[^{}]*"title":"[^"]+"[^{}]*"slug":"[^"]+"[^{}]*\}""")
            jsonRegex.findAll(text).forEach { match ->
                val s = match.value
                if (s.contains("\"format\"") && s.contains("\"languageEpisodes\"")) {
                    try {
                        val j = parseJson<AnimeDetailJson>(s)
                        return AnimeDetail(
                            title = j.title ?: return@forEach,
                            slug = j.slug ?: return@forEach,
                            description = j.description,
                            format = j.format,
                            status = j.status,
                            year = j.year,
                            rating = j.rating,
                            duration = j.duration,
                            genres = j.genres?.mapNotNull { it.name },
                            languageEpisodes = j.languageEpisodes,
                            totalEpisodes = j.totalEpisodes
                        )
                    } catch (_: Exception) {}
                }
            }
            null
        } catch (e: Exception) {
            null
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AnimeDetailJson(
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("slug") val slug: String? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("format") val format: String? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("year") val year: Int? = null,
        @JsonProperty("rating") val rating: Int? = null,
        @JsonProperty("duration") val duration: String? = null,
        @JsonProperty("genres") val genres: List<Genre>? = null,
        @JsonProperty("languageEpisodes") val languageEpisodes: Map<String, Int>? = null,
        @JsonProperty("totalEpisodes") val totalEpisodes: Int? = null
    ) {
        @JsonIgnoreProperties(ignoreUnknown = true)
        data class Genre(@JsonProperty("name") val name: String? = null)
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

    override suspend fun load(url: String): LoadResponse? {
        val slug = url.removePrefix("$mainUrl/anime/").removePrefix("/")
        val detail = fetchAnimeDetail(slug) ?: return null

        val title = detail.title
        val plot = detail.description?.let { stripHtml(it) }
        val year = detail.year
        val tags = detail.genres?.filterNotNull()?.takeIf { it.isNotEmpty() }
        val tvType = when (detail.format?.uppercase()) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL" -> TvType.OVA
            else -> TvType.Anime
        }

        val langEps = detail.languageEpisodes ?: emptyMap()
        val hasJapanese = (langEps["JAPANESE"] ?: 0) > 0 || langEps.isEmpty()
        val hasEnglish = (langEps["ENGLISH"] ?: 0) > 0
        val hasIndianLang = listOf("HINDI", "TELUGU", "TAMIL", "MALAYALAM").any { (langEps[it] ?: 0) > 0 }

        val subEpCount = langEps["JAPANESE"] ?: detail.totalEpisodes ?: 0
        val dubEpCount = if (hasEnglish || hasIndianLang) {
            maxOf(
                langEps["ENGLISH"] ?: 0,
                langEps["HINDI"] ?: 0,
                langEps["TELUGU"] ?: 0,
                langEps["TAMIL"] ?: 0,
                langEps["MALAYALAM"] ?: 0
            ).coerceAtLeast(if (hasEnglish) subEpCount else 0)
        } else 0

        val subEps = fetchAllEpisodes(slug, "JAPANESE", subEpCount)
        val dubEps = if (dubEpCount > 0) fetchAllEpisodes(slug, "ENGLISH", dubEpCount) else emptyList()

        val finalType = if (tvType == TvType.AnimeMovie && dubEps.isNotEmpty()) TvType.Anime else tvType

        return newAnimeLoadResponse(title, slug, finalType) {
            this.posterUrl = null
            this.plot = plot
            this.year = year
            this.tags = tags
            if (detail.rating != null) {
                this.score = Score.from10((detail.rating / 10.0).toString())
            }
            if (subEps.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEps)
            if (dubEps.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEps)
        }
    }

    private suspend fun fetchAllEpisodes(slug: String, lang: String, totalCount: Int): List<Episode> {
        val episodes = mutableListOf<Episode>()
        var page = 0
        while (episodes.size < totalCount) {
            val url = "$mainUrl/api/anime/$slug/episodes-range?page=$page&lang=$lang&pageSize=100"
            try {
                val resp = app.get(url, headers = mapOf(
                    "User-Agent" to ua,
                    "Accept" to "*/*",
                    "Referer" to "$mainUrl/watch/$slug"
                ), timeout = 30_000L)
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
                break
            }
        }
        return episodes
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class EpisodeApiResponse(
        @JsonProperty("episode") val episode: EpisodeData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class EpisodeData(
        @JsonProperty("number") val number: Int? = null,
        @JsonProperty("name") val name: String? = null,
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
        val preferredLang = parts[2]

        val url = "$mainUrl/api/anime/$slug/episodes/$epNum"
        val resp = try {
            app.get(url, headers = mapOf(
                "User-Agent" to ua,
                "Accept" to "*/*",
                "Referer" to "$mainUrl/watch/$slug"
            ), timeout = 30_000L)
        } catch (e: Exception) {
            return false
        }
        if (resp.code != 200) return false

        val episodeData = try {
            parseJson<EpisodeApiResponse>(resp.text).episode
        } catch (e: Exception) {
            return false
        } ?: return false

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

                tip.equals("Abyess", ignoreCase = true) -> {
                    val langLabel = serverName
                    val label = "Animelok - Abyess ($langLabel)"
                    try {
                        val resolved = resolveAbyessServer(serverUrl)
                        if (resolved != null) {
                            callback.invoke(
                                newExtractorLink(label, label, resolved, type = ExtractorLinkType.M3U8) {
                                    this.referer = "https://abyssplayer.com/"
                                    this.headers = mapOf(
                                        "Origin" to "https://abyssplayer.com",
                                        "Referer" to "https://abyssplayer.com/",
                                        "User-Agent" to ua
                                    )
                                }
                            )
                            found = true
                        }
                    } catch (_: Exception) {}
                }
            }
        }

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
                data = postBody.toByteArray(),
                timeout = 30_000L
            )
            if (resp.code != 200) return null
            val j = parseJson<MultiVideoResponse>(resp.text)
            j.videoSource?.takeIf { it.isNotBlank() }
        } catch (e: Exception) {
            null
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class MultiVideoResponse(
        @JsonProperty("videoSource") val videoSource: String? = null,
        @JsonProperty("hls") val hls: Boolean? = null
    )

    private suspend fun resolveAbyessServer(shortUrl: String): String? {
        return try {
            val resp = app.get(shortUrl, headers = mapOf(
                "User-Agent" to ua,
                "Referer" to "$mainUrl/"
            ), allowRedirects = true, timeout = 15_000L)
            val finalUrl = resp.url
            if (finalUrl.contains("abyssplayer.com")) {
                val code = finalUrl.substringAfterLast("/").takeIf { it.isNotBlank() } ?: return null
                val apiUrl = "https://abyssplayer.com/api/source/$code"
                val apiResp = app.get(apiUrl, headers = mapOf(
                    "User-Agent" to ua,
                    "Referer" to "https://abyssplayer.com/$code",
                    "Accept" to "application/json"
                ), timeout = 15_000L)
                if (apiResp.code == 200) {
                    val j = parseJson<AbyessResponse>(apiResp.text)
                    j.data?.firstOrNull()?.file?.takeIf { it.isNotBlank() }
                } else null
            } else null
        } catch (e: Exception) {
            null
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AbyessResponse(
        @JsonProperty("data") val data: List<AbyessSource>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AbyessSource(
        @JsonProperty("file") val file: String? = null,
        @JsonProperty("label") val label: String? = null
    )

    private fun stripHtml(s: String): String {
        return s.replace(Regex("<br\\s*/?>", RegexOption.IGNORE_CASE), "\n")
            .replace(Regex("<[^>]+>"), "")
            .replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">")
            .replace("&quot;", "\"").replace("&#39;", "'").replace("&nbsp;", " ")
            .trim()
    }
}
