package com.laddu100

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.fasterxml.jackson.annotation.JsonProperty
import org.jsoup.Jsoup
import java.net.URLEncoder
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope

class AnichiProvider : MainAPI() {
    override var mainUrl = "https://anichi.to"
    override var name = "Anichi"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(
        TvType.Anime,
        TvType.AnimeMovie,
        TvType.OVA
    )

    override val mainPage = mainPageOf(
        "recent" to "Latest Episode",
        "upcoming" to "Upcoming Anime",
        "top" to "Top Anime"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        if (page > 1) return newHomePageResponse(request.name, emptyList())
        val html = app.get("$mainUrl/home").text
        val soup = Jsoup.parse(html)

        val section = when (request.data) {
            "recent" -> soup.selectFirst("#recent-update")
            "upcoming" -> soup.selectFirst("#upcoming-anime")
            "top" -> soup.selectFirst("section:has(h2:contains(Top Anime))")
            else -> null
        }

        val home = mutableListOf<SearchResponse>()
        section?.select(".item, .rank-item")?.forEach { item ->
            val a = if (item.tagName() == "a") item else item.selectFirst("a[href]")
            val href = a?.attr("href")?.takeIf { it.isNotBlank() } ?: return@forEach
            val title = item.selectFirst(".name")?.text()?.trim() 
                ?: item.selectFirst(".rank-title")?.text()?.trim() 
                ?: a.text().trim()
            val img = item.selectFirst("img")
            val posterUrl = img?.attr("data-src")?.takeIf { it.isNotBlank() } ?: img?.attr("src")

            home.add(newAnimeSearchResponse(title, href, TvType.Anime) {
                this.posterUrl = posterUrl
            })
        }

        return newHomePageResponse(request.name, home)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val encodedQuery = URLEncoder.encode(query, "UTF-8")
        val searchJsonText = try {
            app.get(
                url = "$mainUrl/ajax/anime/search?keyword=$encodedQuery",
                headers = mapOf("Referer" to "$mainUrl/")
            ).text
        } catch (e: Exception) {
            ""
        }
        
        val results = mutableListOf<SearchResponse>()
        if (searchJsonText.isNotBlank()) {
            try {
                val json = parseJson<SearchJsonResponse>(searchJsonText)
                val html = json.result?.html
                if (!html.isNullOrBlank()) {
                    val soup = Jsoup.parse(html)
                    soup.select("a.aitem").forEach { a ->
                        val href = a.attr("href").takeIf { it.isNotBlank() } ?: return@forEach
                        val title = a.selectFirst(".title")?.text()?.trim() ?: "Unknown"
                        val posterUrl = a.selectFirst("img")?.attr("src")
                        results.add(newAnimeSearchResponse(title, href, TvType.Anime) {
                            this.posterUrl = posterUrl
                        })
                    }
                }
            } catch (e: Exception) {
                // Ignore and fallback
            }
        }
        
        if (results.isEmpty()) {
            val html = app.get("$mainUrl/filter?keyword=$encodedQuery").text
            val soup = Jsoup.parse(html)
            soup.select(".item").forEach { item ->
                val a = if (item.tagName() == "a") item else item.selectFirst("a[href]")
                val href = a?.attr("href")?.takeIf { it.isNotBlank() } ?: return@forEach
                val title = item.selectFirst(".name")?.text()?.trim() ?: a.text().trim()
                val img = item.selectFirst("img")
                val posterUrl = img?.attr("data-src")?.takeIf { it.isNotBlank() } ?: img?.attr("src")
                results.add(newAnimeSearchResponse(title, href, TvType.Anime) {
                    this.posterUrl = posterUrl
                })
            }
        }
        
        return results
    }

    override suspend fun load(url: String): LoadResponse? {
        val html = app.get(url).text
        val soup = Jsoup.parse(html)

        val dataId = soup.selectFirst(".watch-wrap")?.attr("data-id")
            ?: soup.selectFirst(".page-anime")?.attr("data-id")
            ?: return null

        val title = soup.selectFirst("h1.title")?.text()?.trim()
            ?: soup.selectFirst("meta[property=og:title]")?.attr("content")?.substringBefore(" Episode")?.trim()
            ?: "Unknown"

        val poster = soup.selectFirst("meta[property=og:image]")?.attr("content")

        val bannerStyle = soup.selectFirst(".media-bg")?.attr("style")
        val banner = bannerStyle?.let { style ->
            Regex("""url\(['"]?([^'")]+)['"]?\)""").find(style)?.groupValues?.get(1)
        }

        val plot = soup.selectFirst(".synopsis .shorting")?.text()
            ?: soup.selectFirst(".synopsis")?.text()
            ?: soup.selectFirst(".description")?.text()?.replace("more+", "")?.trim()
            ?: soup.selectFirst("meta[property=og:description]")?.attr("content")?.trim()

        var year: Int? = null
        soup.select(".meta div, .bmeta div").forEach { div ->
            val text = div.text()
            if (text.contains("Premiered:", ignoreCase = true) || text.contains("Aired:", ignoreCase = true) || text.contains("Released:", ignoreCase = true)) {
                val yearMatch = Regex("""\b(19\d\d|20\d\d)\b""").find(text)
                if (yearMatch != null) {
                    year = yearMatch.groupValues[1].toIntOrNull()
                }
            }
        }

        val genres = soup.select(".meta a[href*='/genre/'], .bmeta a[href*='/genre/'], .data a[href*='/genre/']").map { it.text().trim() }

        val epsResponseText = app.get(
            url = "$mainUrl/ajax/episode/list/$dataId?vrf=$dataId",
            headers = mapOf(
                "X-Requested-With" to "XMLHttpRequest",
                "Referer" to url
            )
        ).text

        val epsJson = parseJson<EpsResponse>(epsResponseText)
        val epsHtml = epsJson.result ?: return null
        val epsSoup = Jsoup.parse(epsHtml)

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        epsSoup.select("a[data-ids]").forEach { epLink ->
            val epNum = epLink.attr("data-num").toIntOrNull() ?: epLink.attr("data-slug").toIntOrNull() ?: 1
            val epName = epLink.selectFirst(".ep-name")?.text()?.trim() 
                ?: epLink.attr("title").takeIf { it.isNotBlank() }
                ?: epLink.attr("data-num").takeIf { it.isNotBlank() }?.let { "Episode $it" }
                ?: "Episode $epNum"
            val dataIds = epLink.attr("data-ids").takeIf { it.isNotBlank() } ?: return@forEach
            val hasSub = epLink.attr("data-sub") == "1"
            val hasDub = epLink.attr("data-dub") == "1"

            if (hasSub) {
                subEpisodes.add(newEpisode("$mainUrl|$dataId|$epNum|$dataIds|sub") {
                    this.episode = epNum
                    this.name = epName
                })
            }
            if (hasDub) {
                dubEpisodes.add(newEpisode("$mainUrl|$dataId|$epNum|$dataIds|dub") {
                    this.episode = epNum
                    this.name = epName
                })
            }
        }

        val typeStr = soup.selectFirst(".bmeta .meta div:contains(Type) span")?.text()?.trim() ?: ""
        val tvType = when (typeStr.lowercase()) {
            "movie" -> TvType.AnimeMovie
            "ova", "ona", "special" -> TvType.OVA
            else -> TvType.Anime
        }

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = poster
            this.backgroundPosterUrl = banner
            this.year = year
            this.plot = plot
            this.tags = genres
            if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
            if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean = coroutineScope {
        val parts = data.split("|")
        if (parts.size < 5) return@coroutineScope false
        val baseUrl = parts[0]
        val animeId = parts[1]
        val epNum = parts[2]
        val dataIds = parts[3]
        val selectedType = parts[4] // "sub" or "dub"

        val serverListResponseText = app.get(
            url = "$baseUrl/ajax/server/list?servers=$dataIds",
            headers = mapOf(
                "Referer" to "$baseUrl/watch/",
                "X-Requested-With" to "XMLHttpRequest"
            )
        ).text

        val serverListJson = parseJson<EpsResponse>(serverListResponseText)
        val serverListHtml = serverListJson.result ?: return@coroutineScope false
        val serverListSoup = Jsoup.parse(serverListHtml)

        val serverSections = serverListSoup.select(".servers .type")
        val serversToLoad = mutableListOf<Pair<String, String>>()

        for (section in serverSections) {
            val typeAttr = section.attr("data-type")
            val isMatch = if (selectedType == "sub") {
                typeAttr == "sub" || typeAttr == "hsub"
            } else {
                typeAttr == "dub"
            }

            if (!isMatch) continue

            val servers = section.select("li")
            for (s in servers) {
                val linkId = s.attr("data-link-id").takeIf { it.isNotBlank() } ?: continue
                val serverName = s.text().trim()
                serversToLoad.add(Pair(serverName, linkId))
            }
        }

        if (serversToLoad.isEmpty()) return@coroutineScope false

        val deferreds = serversToLoad.map { (serverName, linkId) ->
            async {
                try {
                    val serverInfoText = app.get(
                        url = "$baseUrl/ajax/server?get=$linkId",
                        headers = mapOf(
                            "Referer" to "$baseUrl/watch/",
                            "X-Requested-With" to "XMLHttpRequest"
                        )
                    ).text

                    val serverInfoJson = parseJson<ServerInfoResponse>(serverInfoText)
                    val playerUrl = serverInfoJson.result?.url ?: return@async false

                    val parsedUrl = java.net.URI(playerUrl)
                    val embedBase = "${parsedUrl.scheme}://${parsedUrl.host}"

                    // MewCDN/Plyr base64 decoder
                    if (playerUrl.contains("plyr.php#")) {
                        val b64 = playerUrl.substringAfter("#").substringBefore("#")
                        val decodedUrl = try {
                            String(android.util.Base64.decode(b64, android.util.Base64.DEFAULT), Charsets.UTF_8)
                        } catch (e: Exception) {
                            ""
                        }
                        if (decodedUrl.isNotBlank()) {
                            val mappedUrl = applyHostMap(decodedUrl)
                            M3u8Helper.generateM3u8(
                                source = "$name - $serverName",
                                streamUrl = mappedUrl,
                                referer = "$embedBase/",
                                headers = mapOf(
                                    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
                                    "Referer" to "$embedBase/"
                                )
                            ).forEach { link ->
                                callback(link)
                            }
                            return@async true
                        }
                    }

                    // Megaplay / Vidwish / Vidtube source resolver
                    val isMegaplayClone = playerUrl.contains("megaplay.buzz") || 
                                          playerUrl.contains("vidwish.live") || 
                                          playerUrl.contains("vidtube.site") ||
                                          playerUrl.contains("vidstream") || 
                                          playerUrl.contains("vidplay")

                    if (isMegaplayClone) {
                        val playerPageHtml = app.get(
                            url = playerUrl,
                            headers = mapOf(
                                "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
                                "Referer" to "$baseUrl/"
                            )
                        ).text

                        val playerPageSoup = Jsoup.parse(playerPageHtml)
                        val playerId = playerPageSoup.selectFirst("#megaplay-player")?.attr("data-id")
                            ?: Regex("""data-id=["'](\d+)""").find(playerPageHtml)?.groupValues?.get(1)
                            ?: playerPageSoup.selectFirst("#megaplay-player")?.attr("data-realid")
                            ?: Regex("""data-realid=["'](\d+)""").find(playerPageHtml)?.groupValues?.get(1)
                            ?: Regex("""/stream/s-\d+/(\d+)""").find(playerUrl)?.groupValues?.get(1)

                        if (playerId != null) {
                            val sourcesUrl = if (playerUrl.contains("vidwish.live")) {
                                "$embedBase/stream/getSources?id=$playerId&id=$playerId"
                            } else {
                                "$embedBase/stream/getSourcesNew?id=$playerId&type=$selectedType&id=$playerId&type=$selectedType"
                            }

                            val sourcesText = app.get(
                                url = sourcesUrl,
                                headers = mapOf(
                                    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
                                    "Referer" to playerUrl,
                                    "X-Requested-With" to "XMLHttpRequest",
                                    "Origin" to embedBase
                                )
                            ).text

                            val sourcesJson = parseJson<SourcesResponse>(sourcesText)
                            val m3u8Url = sourcesJson.sources?.file

                            if (!m3u8Url.isNullOrEmpty()) {
                                M3u8Helper.generateM3u8(
                                    source = "$name - $serverName",
                                    streamUrl = m3u8Url,
                                    referer = embedBase,
                                    headers = mapOf(
                                        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
                                        "Referer" to "$embedBase/"
                                    )
                                ).forEach { link ->
                                    callback(link)
                                }
                            }

                            sourcesJson.tracks?.forEach { track ->
                                val file = track.file ?: return@forEach
                                if (track.kind == "captions" || track.kind == "subtitles") {
                                    subtitleCallback(
                                        newSubtitleFile(track.label ?: "Subtitle", file) {
                                            this.headers = mapOf("Referer" to "$embedBase/")
                                        }
                                    )
                                }
                            }
                            return@async true
                        }
                    }

                    // Fallback to loading via standard extractors
                    val loaded = loadExtractor(playerUrl, "$baseUrl/", subtitleCallback, callback)
                    return@async loaded
                } catch (e: Exception) {
                    false
                }
            }
        }

        deferreds.awaitAll().any { it }
    }

    private fun applyHostMap(url: String): String {
        val hostMap = mapOf(
            "vault-10.owocdn.top" to "10.bigdreamsmalldih.site",
            "vault-11.owocdn.top" to "11.bigdreamsmalldih.site",
            "vault-12.owocdn.top" to "12.bigdreamsmalldih.site",
            "vault-13.owocdn.top" to "13.bigdreamsmalldih.site",
            "vault-14.owocdn.top" to "14.bigdreamsmalldih.site",
            "vault-15.owocdn.top" to "15.bigdreamsmalldih.site",
            "vault-16.owocdn.top" to "16.bigdreamsmalldih.site",
            "vault-99.owocdn.top" to "99.bigdreamsmalldih.site",
            "vault-01.uwucdn.top" to "uwu1.bigdreamsmalldih.site",
            "vault-02.uwucdn.top" to "uwu2.bigdreamsmalldih.site",
            "vault-03.uwucdn.top" to "uwu3.bigdreamsmalldih.site",
            "vault-04.uwucdn.top" to "uwu4.bigdreamsmalldih.site",
            "vault-05.uwucdn.top" to "uwu5.bigdreamsmalldih.site",
            "vibeplayer.site" to "nanobyte.bigdreamsmalldih.site",
            "vault-06.uwucdn.top" to "uwu6.bigdreamsmalldih.site",
            "vault-07.uwucdn.top" to "uwu7.bigdreamsmalldih.site",
            "vault-08.uwucdn.top" to "uwu8.bigdreamsmalldih.site",
            "vault-09.uwucdn.top" to "uwu9.bigdreamsmalldih.site",
            "vault-10.uwucdn.top" to "uwu10.bigdreamsmalldih.site",
            "vault-11.uwucdn.top" to "uwu11.bigdreamsmalldih.site",
            "vault-12.uwucdn.top" to "uwu12.bigdreamsmalldih.site",
            "vault-13.uwucdn.top" to "uwu13.bigdreamsmalldih.site",
            "vault-14.uwucdn.top" to "uwu14.bigdreamsmalldih.site",
            "vault-15.uwucdn.top" to "uwu15.bigdreamsmalldih.site",
            "vault-16.uwucdn.top" to "uwu16.bigdreamsmalldih.site",
            "vault-99.uwucdn.top" to "uwu17.bigdreamsmalldih.site"
        )
        var result = url
        for ((origin, target) in hostMap) {
            if (result.contains(origin)) {
                result = result.replace(origin, target)
            }
        }
        return result
    }

    data class EpsResponse(
        @JsonProperty("status") val status: Int? = null,
        @JsonProperty("result") val result: String? = null
    )

    data class SearchJsonResponse(
        @JsonProperty("status") val status: Int? = null,
        @JsonProperty("result") val result: SearchJsonResult? = null
    )

    data class SearchJsonResult(
        @JsonProperty("html") val html: String? = null
    )

    data class ServerInfoResponse(
        @JsonProperty("status") val status: Int? = null,
        @JsonProperty("result") val result: ServerInfoResult? = null
    )

    data class ServerInfoResult(
        @JsonProperty("url") val url: String? = null
    )

    data class SourcesResponse(
        @JsonProperty("sources") val sources: SourcesFile? = null,
        @JsonProperty("tracks") val tracks: List<SourcesTrack>? = null
    )

    data class SourcesFile(
        @JsonProperty("file") val file: String? = null
    )

    data class SourcesTrack(
        @JsonProperty("file") val file: String? = null,
        @JsonProperty("label") val label: String? = null,
        @JsonProperty("kind") val kind: String? = null
    )
}
