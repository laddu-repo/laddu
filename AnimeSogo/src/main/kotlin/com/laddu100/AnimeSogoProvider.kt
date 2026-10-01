package com.laddu100

import android.util.Base64
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.JsonParser
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import java.net.URLEncoder

class AnimeSogoProvider : MainAPI() {
    override var mainUrl = "https://animesogo.to"
    override var name = "AnimeSogo"
    override var lang = "en"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        "$mainUrl/latest-updated" to "Latest Updated",
        "$mainUrl/new-release" to "New Release",
        "$mainUrl/most-viewed" to "Most Viewed"
    )

    private var isUrlLoaded = false

    data class FirebaseConfig(
        @JsonProperty("animesogo") val animesogo: String? = null,
        @JsonProperty("animesogo_url") val animesogo_url: String? = null,
        @JsonProperty("animesogoUrl") val animesogoUrl: String? = null,
    )

    private suspend fun loadFirebaseUrl() {
        if (isUrlLoaded) return
        try {
            val response = app.get("https://cloudstreampluginhelper-default-rtdb.firebaseio.com/.json").text
            val json = parseJson<FirebaseConfig>(response)
            val url = json.animesogo ?: json.animesogo_url ?: json.animesogoUrl
            url?.let {
                if (it.isNotEmpty()) {
                    mainUrl = it.removeSuffix("/")
                }
            }
            isUrlLoaded = true
        } catch (_: Exception) {}
    }

    private val browserHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.5",
    )

    private fun ajaxHeaders(referer: String) = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "X-Requested-With" to "XMLHttpRequest",
        "Accept" to "application/json, text/javascript, */*; q=0.01",
        "Referer" to referer,
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse? {
        loadFirebaseUrl()
        val doc = app.get("${request.data}?page=$page", headers = browserHeaders).document
        val items = doc.select("div.ani.items > div.item").mapNotNull { it.toSearchResult() }
        return newHomePageResponse(request.name, items)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        loadFirebaseUrl()
        val encodedQuery = URLEncoder.encode(query, "UTF-8")
        val doc = app.get("$mainUrl/filter?keyword=$encodedQuery", headers = browserHeaders).document
        return doc.select("div.ani.items > div.item").mapNotNull { it.toSearchResult() }
    }

    override suspend fun load(url: String): LoadResponse? {
        loadFirebaseUrl()
        val doc = try {
            app.get(url, headers = browserHeaders).document
        } catch (e: Exception) {
            return null
        }

        val title = doc.selectFirst("#w-info h1.title, h1[itemprop=name]")?.text()?.trim()
            ?: doc.selectFirst("h1.title")?.text()?.trim()
            ?: return null

        val poster = doc.selectFirst("#w-info .poster img, img[itemprop=image]")?.let {
            it.attr("data-src").ifBlank { it.attr("src") }
        }

        val description = doc.selectFirst("#w-info .synopsis .content, .synopsis .content")?.text()
        val genres = doc.select("#w-info a[href*='/genre/'], .meta a[href*='/genre/']").map { it.text().trim() }
        val isMovie = doc.selectFirst("#w-info a[href*='/type/movie']") != null

        val animeId = doc.selectFirst("#watch-main")?.attr("data-id")
            ?: doc.selectFirst("[data-id]")?.attr("data-id")
            ?: Regex("""data-id=["'](\d+)["']""").find(doc.html())?.groupValues?.get(1)

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        if (!animeId.isNullOrBlank()) {
            try {
                val json = app.get(
                    "$mainUrl/ajax/episode/list/$animeId",
                    referer = url, headers = ajaxHeaders(url)
                ).text
                val html = jsonResultString(json)
                if (html.isNotBlank()) {
                    Jsoup.parse(html).select("a[data-ids]").forEach { el ->
                        val serverIds = el.attr("data-ids")
                        val episodeNumber = el.attr("data-num").toIntOrNull()
                        val hasSub = el.attr("data-sub") == "1"
                        val hasDub = el.attr("data-dub") == "1"
                        val malId = el.attr("data-mal")
                        val timestamp = el.attr("data-timestamp")
                        val slug = el.attr("data-slug")
                        if (serverIds.isBlank()) return@forEach

                        val data = "sogo|$url|$serverIds|$episodeNumber|$malId|$timestamp|$slug"
                        val epName = "Episode ${episodeNumber ?: ""}"

                        if (hasSub || !hasDub) {
                            subEpisodes.add(newEpisode(data) {
                                this.episode = episodeNumber
                                this.name = epName
                            })
                        }
                        if (hasDub) {
                            dubEpisodes.add(newEpisode(data) {
                                this.episode = episodeNumber
                                this.name = epName
                            })
                        }
                    }
                }
            } catch (_: Exception) {}
        }

        if (subEpisodes.isEmpty() && dubEpisodes.isEmpty()) {
            doc.select("a[href*='/ep-']").mapIndexed { i, el ->
                subEpisodes.add(newEpisode(el.attr("href")) {
                    this.episode = i + 1
                    this.name = el.text().ifBlank { "Episode ${i + 1}" }
                })
            }
        }

        val finalType = if (isMovie) TvType.AnimeMovie else TvType.Anime
        return newAnimeLoadResponse(title, url, finalType) {
            this.posterUrl = poster
            this.plot = description
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
    ): Boolean {
        loadFirebaseUrl()

        val cleanData = when {
            data.startsWith("$mainUrl/sogo|") -> data.removePrefix("$mainUrl/")
            data.startsWith("/sogo|") -> data.removePrefix("/")
            else -> data
        }

        if (!cleanData.startsWith("sogo|")) return false
        val parts = cleanData.split("|", limit = 7)
        if (parts.size < 7) return false
        val referer = parts[1]
        val serverIds = parts[2]
        val epNum = parts[3]
        val malId = parts[4]
        val timestamp = parts[5]
        val slug = parts[6]
        if (serverIds.isBlank()) return false

        var found = false

        try {
            val encodedIds = URLEncoder.encode(serverIds, "UTF-8")
            val serverListJson = app.get(
                "$mainUrl/ajax/server/list?servers=$encodedIds",
                referer = referer, headers = ajaxHeaders(referer)
            ).text
            val serverListHtml = jsonResultString(serverListJson)
            if (serverListHtml.isNotBlank()) {
                val serverDoc = Jsoup.parse(serverListHtml)
                val typeSelectors = listOf(
                    "div.type[data-type=sub]",
                    "div.type[data-type=hsub]",
                    "div.type[data-type=dub]"
                )
                val preferredServers = typeSelectors.flatMap { sel ->
                    serverDoc.select("$sel a.server[data-link-id]")
                }.ifEmpty {
                    serverDoc.select("a.server[data-link-id]")
                }

                val linkIds = preferredServers.map { el ->
                    val linkId = el.attr("data-link-id")
                    val typeName = el.closest("div.type")?.attr("data-type") ?: "sub"
                    Triple(linkId, typeName, el.selectFirst("span")?.text() ?: "Server")
                }.filter { it.first.isNotBlank() }.distinctBy { it.first }

                for ((linkId, typeName, serverName) in linkIds) {
                    try {
                        val serverUrl = getServerUrl(linkId, referer) ?: continue
                        val audioType = if (typeName == "dub") "dub" else "sub"
                        if (resolveStream(serverUrl, referer, audioType, "$name $serverName", subtitleCallback, callback)) {
                            found = true
                        }
                    } catch (_: Exception) {}
                }
            }
        } catch (_: Exception) {}

        try {
            if (malId.isNotBlank() && timestamp.isNotBlank() && slug.isNotBlank()) {
                val mapperServers = getMapperServers(malId, slug, timestamp, referer)
                for ((linkId, audioType, serverName) in mapperServers) {
                    try {
                        val serverUrl = getServerUrl(linkId, referer) ?: continue
                        if (resolveStream(serverUrl, referer, audioType, "$name $serverName", subtitleCallback, callback)) {
                            found = true
                        }
                    } catch (_: Exception) {}
                }
            }
        } catch (_: Exception) {}

        return found
    }

    private suspend fun getServerUrl(linkId: String, referer: String): String? {
        val encoded = URLEncoder.encode(linkId, "UTF-8")
        val json = app.get(
            "$mainUrl/ajax/server?get=$encoded",
            referer = referer, headers = ajaxHeaders(referer)
        ).text
        return try {
            val obj = JsonParser.parseString(json).asJsonObject
            if (obj.get("status")?.asInt != 200) null
            else obj.get("result")?.asJsonObject?.get("url")?.asString
        } catch (_: Exception) { null }
    }

    private suspend fun getMapperServers(
        malId: String,
        slug: String,
        timestamp: String,
        referer: String
    ): List<Triple<String, String, String>> {
        val servers = mutableListOf<Triple<String, String, String>>()
        try {
            val apiUrl = "https://mapper.nekostream.site/api/mal/$malId/$slug/$timestamp"
            val response = app.get(apiUrl, referer = referer, headers = ajaxHeaders(referer)).text
            val json = JsonParser.parseString(response).asJsonObject
            json.entrySet().forEach { (key, value) ->
                if (key == "status") return@forEach
                if (!value.isJsonObject) return@forEach
                val entry = value.asJsonObject
                val subObj = entry.getAsJsonObject("sub")
                val dubObj = entry.getAsJsonObject("dub")
                val subUrl = subObj?.get("url")?.asString
                val dubUrl = dubObj?.get("url")?.asString
                val displayName = when {
                    key.contains("gogoanime", ignoreCase = true) -> "Vidstream"
                    key.contains("anivibe", ignoreCase = true) -> "Vibe-Stream"
                    key.contains("kiwi", ignoreCase = true) -> key.replace("kiwi-stream", "Server", ignoreCase = true)
                    else -> key.replaceFirstChar { it.uppercase() }
                }
                if (!subUrl.isNullOrBlank()) {
                    servers.add(Triple(subUrl, "sub", displayName))
                }
                if (!dubUrl.isNullOrBlank()) {
                    servers.add(Triple(dubUrl, "dub", displayName))
                }
            }
        } catch (_: Exception) {}
        return servers
    }

    private suspend fun resolveStream(
        url: String,
        referer: String,
        audioType: String,
        sourceName: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val normalizedUrl = when {
            url.startsWith("//") -> "https:$url"
            url.startsWith("/") -> "$mainUrl$url"
            else -> url
        }

        if (normalizedUrl.contains("mewcdn.online/player/plyr.php")) {
            val hash = normalizedUrl.substringAfter("#", "")
            if (hash.isNotBlank()) {
                val decoded = try {
                    String(Base64.decode(hash, Base64.DEFAULT))
                } catch (_: Exception) { null }
                if (!decoded.isNullOrBlank() && decoded.startsWith("http")) {
                    return resolveMegaPlay(decoded, referer, audioType, sourceName, subtitleCallback, callback)
                }
            }
        }

        if (normalizedUrl.contains("megaplay.buzz") || normalizedUrl.contains("vidwish.live") || normalizedUrl.contains("vidtube.site")) {
            return resolveMegaPlay(normalizedUrl, referer, audioType, sourceName, subtitleCallback, callback)
        }

        return try {
            loadExtractor(normalizedUrl, referer, subtitleCallback, callback)
        } catch (_: Exception) { false }
    }

    private suspend fun resolveMegaPlay(
        url: String,
        referer: String,
        audioType: String,
        sourceName: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val host = "https://megaplay.buzz"

        val pageHeaders = mapOf(
            "User-Agent" to browserHeaders["User-Agent"]!!,
            "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Referer" to referer,
        )

        val ajaxHdrs = mapOf(
            "User-Agent" to browserHeaders["User-Agent"]!!,
            "Accept" to "*/*",
            "X-Requested-With" to "XMLHttpRequest",
            "Origin" to host,
            "Referer" to url,
        )

        val playbackHeaders = mapOf(
            "User-Agent" to browserHeaders["User-Agent"]!!,
            "Accept" to "*/*",
            "Origin" to host,
            "Referer" to "$host/",
        )

        try {
            val doc = app.get(url, headers = pageHeaders).document
            val playerEl = doc.selectFirst("#megaplay-player")
            val streamId = playerEl?.attr("data-id")
                ?: playerEl?.attr("data-realid")
                ?: Regex("""/stream/s-\d+/(\d+)""").find(url)?.groupValues?.get(1)
                ?: return false
            if (streamId.isBlank()) return false

            val type = if (url.contains("/dub", ignoreCase = true) || audioType == "dub") "dub" else "sub"

            val sourcesText = app.get(
                "$host/stream/getSources?id=$streamId&type=$type",
                headers = ajaxHdrs, referer = url
            ).text

            val root = try { JsonParser.parseString(sourcesText).asJsonObject } catch (_: Exception) { null }
                ?: return false

            val m3u8 = try {
                val sourcesEl = root.get("sources")
                if (sourcesEl?.isJsonObject == true) {
                    sourcesEl.asJsonObject.get("file")?.asString
                } else if (sourcesEl?.isJsonArray == true && sourcesEl.asJsonArray.size() > 0) {
                    sourcesEl.asJsonArray[0].asJsonObject.get("file")?.asString
                } else null
            } catch (_: Exception) { null }

            if (m3u8.isNullOrBlank()) return false

            val displayType = if (audioType == "dub") "DUB" else "SUB"
            val generated = M3u8Helper.generateM3u8("$sourceName $displayType", m3u8, host, headers = playbackHeaders)
            if (generated.isNotEmpty()) {
                generated.forEach(callback)
            } else {
                callback.invoke(
                    newExtractorLink(sourceName, "$sourceName $displayType", m3u8, ExtractorLinkType.M3U8) {
                        this.referer = "$host/"
                        this.headers = playbackHeaders
                    }
                )
            }

            try {
                val tracks = root.getAsJsonArray("tracks")
                if (tracks != null) {
                    for (element in tracks) {
                        val track = element.asJsonObject
                        val kind = track.get("kind")?.asString ?: continue
                        if (kind != "captions" && kind != "subtitles") continue
                        val file = track.get("file")?.asString ?: continue
                        val trackUrl = if (file.startsWith("http")) file else "$host/${file.removePrefix("/")}"
                        val label = track.get("label")?.asString ?: "English"
                        val subHeaders = when {
                            trackUrl.contains("lostproject.club") -> mapOf("Referer" to "https://megaplay.buzz/")
                            trackUrl.contains("nekostream.site") -> mapOf("Referer" to "$host/")
                            else -> playbackHeaders
                        }
                        subtitleCallback.invoke(newSubtitleFile(label, trackUrl) {
                            this.headers = subHeaders
                        })
                    }
                }
            } catch (_: Exception) {}

            return true
        } catch (_: Exception) {
            return false
        }
    }

    private fun jsonResultString(json: String): String {
        return try {
            val obj = JsonParser.parseString(json).asJsonObject
            if (obj.get("status")?.asInt != 200) ""
            else obj.get("result")?.asString.orEmpty()
        } catch (_: Exception) { "" }
    }

    private fun Element.toSearchResult(): AnimeSearchResponse? {
        val titleElement = selectFirst("a.name.d-title") ?: selectFirst("a[title]")
            ?: selectFirst("a[href*='/watch/']") ?: return null
        val href = titleElement.attr("href").ifBlank { selectFirst("div.poster a, a")?.attr("href").orEmpty() }
        val title = titleElement.text().trim().ifBlank { titleElement.attr("title").trim() }
        if (href.isBlank() || title.isBlank()) return null
        val poster = selectFirst("div.poster img, img")?.let { it.attr("data-src").ifBlank { it.attr("src") } }
        val type = if (selectFirst(".type, .right")?.text()?.contains("Movie", ignoreCase = true) == true) TvType.AnimeMovie else TvType.Anime
        val metaText = select(".meta, .info, .type, .right").text()
        val hasDub = selectFirst(".dub, i.dub, .fa-microphone") != null || metaText.contains("Dub", ignoreCase = true)
        val hasSub = selectFirst(".sub, i.sub, .fa-closed-captioning") != null || metaText.contains("Sub", ignoreCase = true) || !hasDub
        return newAnimeSearchResponse(title, href, type) {
            this.posterUrl = poster
            addDubStatus(dubExist = hasDub, subExist = hasSub)
        }
    }
}
