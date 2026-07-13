package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
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
import com.lagradost.cloudstream3.LoadResponse.Companion.addAniListId
import com.lagradost.cloudstream3.addDubStatus
import com.lagradost.cloudstream3.addEpisodes
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newAnimeLoadResponse
import com.lagradost.cloudstream3.newAnimeSearchResponse
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.nicehttp.RequestBodyTypes
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import java.net.URLEncoder

class AniNamiProvider : MainAPI() {
    override var mainUrl = "https://www.aninami.site"
    override var name = "AniNami"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val TAG = "AniNami"
    private val anilistUrl = "https://graphql.anilist.co"
    private val apiHeaders = mapOf(
        "Accept" to "application/json",
        "Referer" to "$mainUrl/"
    )
    private val anilistHeaders = mapOf(
        "Accept" to "application/json",
        "Content-Type" to "application/json"
    )

    private val providerNames = mapOf(
        "kiwi" to "Quartz", "zoro" to "Topaz", "arc" to "Onyx", "hop" to "Jasper",
        "bee" to "Garnet", "pewe" to "Pyrite", "bonk" to "Beryl", "bun" to "Zircon",
        "ally" to "Opal", "nun" to "Amber", "twin" to "Jade", "cog" to "Ruby",
        "moo" to "Coral", "telli" to "Amethyst"
    )

    override val mainPage = mainPageOf(
        "TRENDING" to "Trending",
        "POPULAR" to "Popular",
        "TOP_RATED" to "Top Rated"
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchResponseData(
        @JsonProperty("success") val success: Boolean? = null,
        @JsonProperty("results") val results: SearchPage? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchPage(
        @JsonProperty("results") val results: List<AnimeItem>? = null,
        @JsonProperty("total") val total: Int? = null,
        @JsonProperty("hasNextPage") val hasNextPage: Boolean? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeItem(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("idMal") val idMal: Int? = null,
        @JsonProperty("title") val title: AnimeTitle? = null,
        @JsonProperty("coverImage") val coverImage: CoverImage? = null,
        @JsonProperty("bannerImage") val bannerImage: String? = null,
        @JsonProperty("format") val format: String? = null,
        @JsonProperty("seasonYear") val seasonYear: Int? = null,
        @JsonProperty("episodes") val episodes: Int? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("averageScore") val averageScore: Int? = null,
        @JsonProperty("genres") val genres: List<String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeTitle(
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
    data class EpisodesResponse(
        @JsonProperty("success") val success: Boolean? = null,
        @JsonProperty("results") val results: EpisodesResultData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodesResultData(
        @JsonProperty("mappings") val mappings: Map<String, Any?>? = null,
        @JsonProperty("providers") val providers: Map<String, ProviderData>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ProviderData(
        @JsonProperty("meta") val meta: ProviderMeta? = null,
        @JsonProperty("episodes") val episodes: EpisodeCategories? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ProviderMeta(
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("image") val image: String? = null,
        @JsonProperty("totalEpisodes") val totalEpisodes: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeCategories(
        @JsonProperty("sub") val sub: List<EpisodeItem>? = null,
        @JsonProperty("dub") val dub: List<EpisodeItem>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeItem(
        @JsonProperty("id") val id: String? = null,
        @JsonProperty("number") val number: Int? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("image") val image: String? = null,
        @JsonProperty("airDate") val airDate: String? = null,
        @JsonProperty("duration") val duration: Int? = null,
        @JsonProperty("audio") val audio: String? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("filler") val filler: Boolean? = null,
        @JsonProperty("fillerType") val fillerType: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamResponse(
        @JsonProperty("success") val success: Boolean? = null,
        @JsonProperty("results") val results: StreamResultData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamResultData(
        @JsonProperty("streams") val streams: List<Stream>? = null,
        @JsonProperty("download") val download: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Stream(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("type") val type: String? = null,
        @JsonProperty("quality") val quality: String? = null,
        @JsonProperty("audio") val audio: String? = null,
        @JsonProperty("referer") val referer: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListResponse(
        @JsonProperty("data") val data: AniListData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListData(
        @JsonProperty("Page") val Page: AniListPage? = null,
        @JsonProperty("Media") val Media: AniListMedia? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListPage(
        @JsonProperty("media") val media: List<AniListMedia>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListMedia(
        @JsonProperty("id") val id: Int? = null,
        @JsonProperty("title") val title: AniListTitle? = null,
        @JsonProperty("description") val description: String? = null,
        @JsonProperty("coverImage") val coverImage: AniListCoverImage? = null,
        @JsonProperty("bannerImage") val bannerImage: String? = null,
        @JsonProperty("format") val format: String? = null,
        @JsonProperty("seasonYear") val seasonYear: Int? = null,
        @JsonProperty("episodes") val episodes: Int? = null,
        @JsonProperty("duration") val duration: Int? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("averageScore") val averageScore: Int? = null,
        @JsonProperty("genres") val genres: List<String>? = null,
        @JsonProperty("nextAiringEpisode") val nextAiringEpisode: AniListNextAiring? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListTitle(
        @JsonProperty("romaji") val romaji: String? = null,
        @JsonProperty("english") val english: String? = null,
        @JsonProperty("native") val native: String? = null,
        @JsonProperty("userPreferred") val userPreferred: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListCoverImage(
        @JsonProperty("large") val large: String? = null,
        @JsonProperty("extraLarge") val extraLarge: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AniListNextAiring(
        @JsonProperty("episode") val episode: Int? = null
    )

    private val TRENDING_QUERY = """
        query (${'$'}page: Int, ${'$'}perPage: Int) {
            Page(page: ${'$'}page, perPage: ${'$'}perPage) {
                media(type: ANIME, sort: TRENDING_DESC) {
                    id
                    title { romaji english native userPreferred }
                    coverImage { large extraLarge }
                    format
                    episodes
                    status
                    seasonYear
                    averageScore
                    genres
                }
            }
        }
    """.trimIndent()

    private val POPULAR_QUERY = """
        query (${'$'}page: Int, ${'$'}perPage: Int) {
            Page(page: ${'$'}page, perPage: ${'$'}perPage) {
                media(type: ANIME, sort: POPULARITY_DESC) {
                    id
                    title { romaji english native userPreferred }
                    coverImage { large extraLarge }
                    format
                    episodes
                    status
                    seasonYear
                    averageScore
                    genres
                }
            }
        }
    """.trimIndent()

    private val TOP_RATED_QUERY = """
        query (${'$'}page: Int, ${'$'}perPage: Int) {
            Page(page: ${'$'}page, perPage: ${'$'}perPage) {
                media(type: ANIME, sort: SCORE_DESC) {
                    id
                    title { romaji english native userPreferred }
                    coverImage { large extraLarge }
                    format
                    episodes
                    status
                    seasonYear
                    averageScore
                    genres
                }
            }
        }
    """.trimIndent()

    private val INFO_QUERY = """
        query (${'$'}id: Int) {
            Media(id: ${'$'}id, type: ANIME) {
                id
                title { english romaji native userPreferred }
                description(asHtml: false)
                bannerImage
                coverImage { large extraLarge }
                episodes
                genres
                status
                seasonYear
                format
                averageScore
                duration
                nextAiringEpisode { episode }
            }
        }
    """.trimIndent()

    private suspend fun anilistQuery(query: String, variables: Map<String, Any?>): String {
        val body = mapOf(
            "query" to query,
            "variables" to variables
        ).toJson().toRequestBody(RequestBodyTypes.JSON.toMediaTypeOrNull())
        return app.post(anilistUrl, headers = anilistHeaders, requestBody = body).text
    }

    private fun parseQuality(q: String?): Int {
        if (q.isNullOrBlank() || q == "auto" || q == "Hls") return Qualities.Unknown.value
        val match = Regex("(\\d{3,4})").find(q)
        val h = match?.groupValues?.get(1)?.toIntOrNull() ?: return Qualities.Unknown.value
        return when {
            h >= 1080 -> Qualities.P1080.value
            h >= 720 -> Qualities.P720.value
            h >= 480 -> Qualities.P480.value
            h >= 360 -> Qualities.P360.value
            else -> Qualities.Unknown.value
        }
    }

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val query = when (request.data) {
            "TRENDING" -> TRENDING_QUERY
            "POPULAR" -> POPULAR_QUERY
            "TOP_RATED" -> TOP_RATED_QUERY
            else -> TRENDING_QUERY
        }
        val variables = mapOf("page" to page, "perPage" to 20)
        val responseText = try {
            anilistQuery(query, variables)
        } catch (e: Exception) {
            Log.d(TAG, "getMainPage failed: ${e.message}")
            return newHomePageResponse(request.name, emptyList())
        }
        val response = parseJson<AniListResponse>(responseText)
        val mediaList = response.data?.Page?.media ?: emptyList()

        val home = mediaList.mapNotNull { media ->
            val id = media.id ?: return@mapNotNull null
            val title = media.title?.userPreferred
                ?: media.title?.english
                ?: media.title?.romaji
                ?: return@mapNotNull null
            val posterUrl = media.coverImage?.extraLarge ?: media.coverImage?.large
            newAnimeSearchResponse(title, "$mainUrl/anime/$id", TvType.Anime) {
                this.posterUrl = posterUrl
                this.year = media.seasonYear
                addDubStatus(dubExist = true, subExist = true)
            }
        }
        return newHomePageResponse(request.name, home)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val encoded = URLEncoder.encode(query, "UTF-8")
        val url = "$mainUrl/api/search?query=$encoded"
        val responseText = try {
            app.get(url, headers = apiHeaders).text
        } catch (e: Exception) {
            Log.d(TAG, "search failed: ${e.message}")
            return emptyList()
        }
        val response = parseJson<SearchResponseData>(responseText)
        val results = response.results?.results ?: emptyList()

        return results.mapNotNull { item ->
            val id = item.id ?: return@mapNotNull null
            val title = item.title?.english
                ?: item.title?.romaji
                ?: item.title?.native
                ?: return@mapNotNull null
            val posterUrl = item.coverImage?.extraLarge
                ?: item.coverImage?.large
                ?: item.coverImage?.medium
            newAnimeSearchResponse(title, "$mainUrl/anime/$id", TvType.Anime) {
                this.posterUrl = posterUrl
                this.year = item.seasonYear
                addDubStatus(dubExist = true, subExist = true)
            }
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        val anilistId = Regex("""/anime/(\d+)""").find(url)?.groupValues?.get(1)?.toIntOrNull()
            ?: return null

        val infoText = try {
            anilistQuery(INFO_QUERY, mapOf("id" to anilistId))
        } catch (e: Exception) {
            Log.d(TAG, "load info failed: ${e.message}")
            return null
        }
        val infoResponse = parseJson<AniListResponse>(infoText)
        val media = infoResponse.data?.Media ?: return null

        val title = media.title?.userPreferred
            ?: media.title?.english
            ?: media.title?.romaji
            ?: "Unknown"
        val posterUrl = media.coverImage?.extraLarge ?: media.coverImage?.large
        val bannerUrl = media.bannerImage
        val plot = media.description?.replace(Regex("<[^>]*>"), "")
        val year = media.seasonYear
        val tags = media.genres ?: emptyList()
        val animeScore = media.averageScore

        val tvType = TvType.Anime
        val showStatus = when (media.status) {
            "RELEASING" -> ShowStatus.Ongoing
            "FINISHED" -> ShowStatus.Completed
            else -> null
        }

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        try {
            val epsUrl = "$mainUrl/api/episodes/$anilistId"
            val epsText = app.get(epsUrl, headers = apiHeaders).textLarge
            val epsData = parseJson<EpisodesResponse>(epsText)
            val providers = epsData.results?.providers ?: emptyMap()

            val subByNumber = sortedMapOf<Int, EpisodeItem>()
            val subIdsByNumber = sortedMapOf<Int, MutableList<String>>()
            for ((_, prov) in providers) {
                prov.episodes?.sub?.forEach { ep ->
                    val num = ep.number ?: return@forEach
                    val id = ep.id ?: return@forEach
                    subIdsByNumber.getOrPut(num) { mutableListOf() }.add(id)
                    if (!subByNumber.containsKey(num)) subByNumber[num] = ep
                }
            }
            val dubByNumber = sortedMapOf<Int, EpisodeItem>()
            val dubIdsByNumber = sortedMapOf<Int, MutableList<String>>()
            for ((_, prov) in providers) {
                prov.episodes?.dub?.forEach { ep ->
                    val num = ep.number ?: return@forEach
                    val id = ep.id ?: return@forEach
                    dubIdsByNumber.getOrPut(num) { mutableListOf() }.add(id)
                    if (!dubByNumber.containsKey(num)) dubByNumber[num] = ep
                }
            }

            for ((num, ids) in subIdsByNumber) {
                val dataStr = "sub|${ids.joinToString(";;")}"
                val rep = subByNumber[num]
                val epName = rep?.title?.takeIf { it.isNotBlank() } ?: "Episode $num"
                val desc = buildString {
                    if (rep?.filler == true) append("[Filler] ")
                    rep?.description?.let { append(it) }
                }.ifEmpty { null }
                subEpisodes.add(newEpisode(dataStr) {
                    this.name = epName
                    this.episode = num
                    this.posterUrl = rep?.image
                    this.description = desc
                })
            }

            for ((num, ids) in dubIdsByNumber) {
                val dataStr = "dub|${ids.joinToString(";;")}"
                val rep = dubByNumber[num]
                val epName = rep?.title?.takeIf { it.isNotBlank() } ?: "Episode $num"
                val desc = buildString {
                    if (rep?.filler == true) append("[Filler] ")
                    rep?.description?.let { append(it) }
                }.ifEmpty { null }
                dubEpisodes.add(newEpisode(dataStr) {
                    this.name = epName
                    this.episode = num
                    this.posterUrl = rep?.image
                    this.description = desc
                })
            }
        } catch (e: Exception) {
            Log.d(TAG, "load episodes failed: ${e.message}")
        }

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = posterUrl
            this.backgroundPosterUrl = bannerUrl
            this.year = year
            this.plot = plot
            this.tags = tags
            if (animeScore != null) this.score = Score.from10((animeScore / 10).toString())
            this.showStatus = showStatus
            addAniListId(anilistId)
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
        val pipeIdx = data.indexOf("|")
        if (pipeIdx < 0) return false
        val idsStr = data.substring(pipeIdx + 1)
        val epIds = idsStr.split(";;").filter { it.isNotEmpty() }
        if (epIds.isEmpty()) return false

        var found = false
        val seenUrls = mutableSetOf<String>()

        for (epId in epIds) {
            val parts = epId.split("/")
            if (parts.size < 5 || parts[0] != "watch") continue
            val provider = parts[1]
            val anilistId = parts[2]
            val audioType = parts[3]
            val slug = parts.drop(4).joinToString("/")
            if (provider.isEmpty() || anilistId.isEmpty() || audioType.isEmpty() || slug.isEmpty()) continue

            val displayName = providerNames[provider] ?: provider
            val watchUrl = "$mainUrl/api/watch/$provider/$anilistId/$audioType/$slug"
            val streamsText = try {
                app.get(watchUrl, headers = apiHeaders).text
            } catch (e: Exception) {
                Log.d(TAG, "watch failed for $provider: ${e.message}")
                continue
            }
            val streamData = try {
                parseJson<StreamResponse>(streamsText)
            } catch (e: Exception) {
                continue
            }
            val streams = streamData.results?.streams ?: continue

            for (stream in streams) {
                val streamUrl = stream.url ?: continue
                if (streamUrl.isBlank()) continue
                if (!seenUrls.add(streamUrl)) continue
                val referer = stream.referer?.takeIf { it.isNotBlank() } ?: "$mainUrl/"
                val quality = parseQuality(stream.quality)
                val qualityLabel = stream.quality?.takeIf { it.isNotBlank() } ?: "Auto"
                val label = "$displayName $qualityLabel"

                when (stream.type?.lowercase()) {
                    "hls" -> {
                        callback.invoke(
                            newExtractorLink(
                                source = name,
                                name = label,
                                url = streamUrl,
                                type = ExtractorLinkType.M3U8
                            ) {
                                this.quality = quality
                                this.headers = mapOf("Referer" to referer)
                            }
                        )
                        found = true
                    }
                    "embed" -> {
                        if (handleEmbed(streamUrl, referer, label, subtitleCallback, callback)) {
                            found = true
                        }
                    }
                    else -> {
                        try {
                            loadExtractor(streamUrl, referer, subtitleCallback, callback)
                            found = true
                        } catch (_: Exception) {
                        }
                    }
                }
            }
        }

        return found
    }

    private suspend fun handleEmbed(
        embedUrl: String,
        referer: String,
        label: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val host = try {
            java.net.URL(embedUrl).host
        } catch (_: Exception) {
            ""
        }

        val needsScrape = host.isNotEmpty() && (
            host.contains("vivibebe.site") ||
            host.contains("bibiemb.xyz") ||
            host.contains("otakuhg.site") ||
            host.contains("otakuvid.online")
        )

        if (needsScrape) {
            return try {
                val html = app.get(embedUrl, headers = mapOf("Referer" to referer)).text
                var m3u8 = Regex("""(https?://[^\s"'<>]+\.m3u8[^\s"'<>]*)""").find(html)?.groupValues?.get(1)
                if (m3u8 == null && (host.contains("otakuhg.site") || host.contains("otakuvid.online"))) {
                    val unpacked = JsPacker.parseAndUnpack(html)
                    if (unpacked != null) {
                        m3u8 = Regex("""(https?://[^\s"'<>]+\.m3u8[^\s"'<>]*)""").find(unpacked)?.groupValues?.get(1)
                    }
                }
                if (m3u8 != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = name,
                            name = label,
                            url = m3u8,
                            type = ExtractorLinkType.M3U8
                        ) {
                            this.headers = mapOf("Referer" to embedUrl)
                        }
                    )
                    true
                } else {
                    false
                }
            } catch (_: Exception) {
                false
            }
        }

        return try {
            val loaded = loadExtractor(embedUrl, referer, subtitleCallback, callback)
            if (loaded) {
                true
            } else {
                val html = app.get(embedUrl, headers = mapOf("Referer" to referer)).text
                val m3u8 = Regex("""(https?://[^\s"'<>]+\.m3u8[^\s"'<>]*)""").find(html)?.groupValues?.get(1)
                if (m3u8 != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = name,
                            name = label,
                            url = m3u8,
                            type = ExtractorLinkType.M3U8
                        ) {
                            this.headers = mapOf("Referer" to embedUrl)
                        }
                    )
                    true
                } else {
                    false
                }
            }
        } catch (_: Exception) {
            false
        }
    }
}

object JsPacker {
    private const val CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    private fun baseN(num: Int, base: Int): String {
        if (num == 0) return CHARS[0].toString()
        var temp = num
        val sb = StringBuilder()
        while (temp > 0) {
            sb.append(CHARS[temp % base])
            temp /= base
        }
        return sb.reverse().toString()
    }

    fun unpack(p: String, a: Int, c: Int, k: List<String>): String {
        var payload = p
        for (i in c - 1 downTo 0) {
            if (i < k.size && k[i].isNotEmpty()) {
                val key = k[i]
                val baseStr = baseN(i, a)
                val regex = Regex("\\b$baseStr\\b")
                payload = payload.replace(regex, key)
            }
        }
        return payload
    }

    fun parseAndUnpack(html: String): String? {
        val startIdx = html.indexOf("eval(function(p,a,c,k,e,d)")
        val actualStart = if (startIdx != -1) startIdx else html.indexOf("function(p,a,c,k,e,d)")
        if (actualStart == -1) return null

        val openBraceIdx = html.indexOf("{", actualStart)
        if (openBraceIdx == -1) return null

        var braceCount = 1
        var j = openBraceIdx + 1
        while (j < html.length && braceCount > 0) {
            if (html[j] == '{') braceCount++
            else if (html[j] == '}') braceCount--
            j++
        }

        val argsStartIdx = html.indexOf("(", j - 1)
        if (argsStartIdx == -1) return null

        var argsParenCount = 1
        var kIdx = argsStartIdx + 1
        while (kIdx < html.length && argsParenCount > 0) {
            if (html[kIdx] == '(') argsParenCount++
            else if (html[kIdx] == ')') argsParenCount--
            kIdx++
        }

        val argsStr = html.substring(argsStartIdx + 1, kIdx - 1).trim()
        if (argsStr.isEmpty()) return null

        val startChar = argsStr.first()
        var payload = ""
        var i = 1
        while (i < argsStr.length) {
            if (argsStr[i] == startChar) {
                var backslashCount = 0
                var m = i - 1
                while (m >= 0 && argsStr[m] == '\\') {
                    backslashCount++
                    m--
                }
                if (backslashCount % 2 == 0) break
            }
            payload += argsStr[i]
            i++
        }

        payload = payload.replace("\\$startChar", startChar.toString()).replace("\\\\", "\\")

        val rest = argsStr.substring(i + 1)
        val restQuoteMatch = Regex("[\"']").find(rest) ?: return null
        val quotePos = restQuoteMatch.range.first
        val restQuoteChar = restQuoteMatch.value

        val ints = Regex("\\b\\d+\\b").findAll(rest.substring(0, quotePos)).map { it.value.toInt() }.toList()
        if (ints.size < 2) return null
        val a = ints[0]
        val c = ints[1]

        var keysStr = ""
        var jj = quotePos + 1
        while (jj < rest.length) {
            if (rest[jj].toString() == restQuoteChar) {
                var backslashCount = 0
                var m = jj - 1
                while (m >= 0 && rest[m] == '\\') {
                    backslashCount++
                    m--
                }
                if (backslashCount % 2 == 0) break
            }
            keysStr += rest[jj]
            jj++
        }

        keysStr = keysStr.replace("\\$restQuoteChar", restQuoteChar).replace("\\\\", "\\")
        val keys = keysStr.split("|")

        return unpack(payload, a, c, keys)
    }
}
