package com.laddu100.anisnatch

import android.content.Context
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.newSubtitleFile
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.concurrent.TimeUnit

private const val TAG = "AniSnatch"
private const val ANILIST_URL = "https://graphql.anilist.co"
private const val BASE_URL = "https://anisnatch.top"
private const val TIMEOUT = 30_000L

class AniSnatchProvider : MainAPI() {
    override var mainUrl = BASE_URL
    override var name = "AniSnatch"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        "trending" to "Trending Now",
        "popular" to "All Time Popular",
        "season" to "This Season",
        "top" to "Top Rated",
        "airing" to "Currently Airing"
    )

    companion object {
        var context: Context? = null
        private val cfBypassMutex = Mutex()
        private val webView = AniSnatchWebView()

        private val okHttpClient by lazy {
            OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .followRedirects(true)
                .build()
        }
    }

    private fun anilistHeaders(): Map<String, String> = mapOf(
        "Content-Type" to "application/json",
        "Accept" to "application/json",
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"
    )

    private fun currentSeason(): Pair<String, Int> {
        val now = java.util.Calendar.getInstance()
        val year = now.get(java.util.Calendar.YEAR)
        val month = now.get(java.util.Calendar.MONTH) + 1
        val season = when (month) {
            in 1..3 -> "WINTER"
            in 4..6 -> "SPRING"
            in 7..9 -> "SUMMER"
            else -> "FALL"
        }
        return season to year
    }

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val isSeason = request.data == "season"
        val isAiring = request.data == "airing"
        val sort = when (request.data) {
            "trending" -> "TRENDING_DESC"
            "popular" -> "POPULARITY_DESC"
            "season" -> "POPULARITY_DESC"
            "top" -> "SCORE_DESC"
            "airing" -> "START_DATE_DESC"
            else -> "TRENDING_DESC"
        }

        val seasonVar = if (isSeason) ", ${'$'}season: MediaSeason, ${'$'}seasonYear: Int" else ""
        val seasonArg = if (isSeason) ", season: ${'$'}season, seasonYear: ${'$'}seasonYear" else ""
        val airingArg = if (isAiring) ", status: RELEASING" else ""

        val query = """
            query (${'$'}page: Int$seasonVar) {
              Page(page: ${'$'}page, perPage: 30) {
                media(type: ANIME, sort: $sort$seasonArg$airingArg) {
                  id
                  title { romaji english }
                  coverImage { large }
                  averageScore
                  format
                  episodes
                  nextAiringEpisode { episode }
                  status
                }
              }
            }
        """.trimIndent()

        val variables: Map<String, Any?> = if (isSeason) {
            val (s, y) = currentSeason()
            mapOf("page" to page, "season" to s, "seasonYear" to y)
        } else {
            mapOf("page" to page)
        }

        val body = mapOf("query" to query, "variables" to variables)

        val response = try {
            app.post(ANILIST_URL, headers = anilistHeaders(), json = body, timeout = TIMEOUT).text
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage failed: ${e.message}")
            return newHomePageResponse(request.name, emptyList())
        }

        val media = try {
            parseJson<AniListResponse>(response).data?.page?.media ?: emptyList()
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage parse failed: ${e.message}")
            emptyList()
        }

        val items = media.mapNotNull { it.toSearchResult(this) }
        return newHomePageResponse(request.name, items)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val gql = """
            query (${'$'}search: String) {
              Page(page: 1, perPage: 30) {
                media(type: ANIME, search: ${'$'}search, sort: SEARCH_MATCH) {
                  id
                  title { romaji english }
                  coverImage { large }
                  averageScore
                  format
                  episodes
                  nextAiringEpisode { episode }
                  status
                }
              }
            }
        """.trimIndent()

        val variables = mapOf("search" to query)
        val body = mapOf("query" to gql, "variables" to variables)

        val response = try {
            app.post(ANILIST_URL, headers = anilistHeaders(), json = body, timeout = TIMEOUT).text
        } catch (e: Exception) {
            Log.e(TAG, "search failed: ${e.message}")
            return emptyList()
        }

        val media = try {
            parseJson<AniListResponse>(response).data?.page?.media ?: emptyList()
        } catch (e: Exception) {
            Log.e(TAG, "search parse failed: ${e.message}")
            emptyList()
        }

        return media.mapNotNull { it.toSearchResult(this) }
    }

    override suspend fun load(url: String): LoadResponse? {
        val anilistId = url.substringAfterLast("/").toIntOrNull() ?: return null

        val gql = """
            query (${'$'}id: Int) {
              Media(id: ${'$'}id, type: ANIME) {
                id
                idMal
                title { romaji english native }
                coverImage { large extraLarge }
                bannerImage
                description
                averageScore
                format
                status
                episodes
                duration
                genres
                startDate { year month day }
                nextAiringEpisode { episode airingAt }
                studios(isMain: true) { nodes { name } }
              }
            }
        """.trimIndent()

        val variables = mapOf("id" to anilistId)
        val body = mapOf("query" to gql, "variables" to variables)

        val response = try {
            app.post(ANILIST_URL, headers = anilistHeaders(), json = body, timeout = TIMEOUT).text
        } catch (e: Exception) {
            Log.e(TAG, "load failed: ${e.message}")
            return null
        }

        val anime = try {
            parseJson<AniListResponse>(response).data?.media
        } catch (e: Exception) {
            Log.e(TAG, "load parse failed: ${e.message}")
            return null
        } ?: return null

        val title = anime.title?.english?.ifBlank { null } ?: anime.title?.romaji ?: return null
        val poster = anime.coverImage?.large ?: anime.coverImage?.extraLarge
        val plot = anime.description?.let { org.jsoup.Jsoup.parse(it).text() }
        val genres = anime.genres?.filterNotNull() ?: emptyList()
        val year = anime.startDate?.year
        val isMovie = anime.format == "MOVIE"
        var epCount = anime.episodes ?: 0
        if (epCount == 0 && anime.status == "RELEASING") {
            anime.nextAiringEpisode?.episode?.let { nextEp ->
                epCount = nextEp - 1
            }
        }
        if (epCount < 1) epCount = 1

        val subEps = mutableListOf<Episode>()
        val dubEps = mutableListOf<Episode>()

        for (ep in 1..epCount) {
            val subData = EpisodeData(anilistId, ep, "sub", isMovie, title).toJson()
            subEps.add(newEpisode(subData) {
                this.episode = ep
                this.name = "Episode $ep"
            })
            val dubData = EpisodeData(anilistId, ep, "dub", isMovie, title).toJson()
            dubEps.add(newEpisode(dubData) {
                this.episode = ep
                this.name = "Episode $ep"
            })
        }

        val tvType = if (isMovie) TvType.Anime else TvType.Anime

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = poster
            this.plot = plot
            this.tags = genres
            this.year = year
            addEpisodes(DubStatus.Subbed, subEps)
            addEpisodes(DubStatus.Dubbed, dubEps)
        }
    }

    private suspend fun callApi(endpoint: String, data: Map<String, Any?>): String? {
        val ctx = context ?: return null
        val dataJson = data.toJson()
        Log.d(TAG, "callApi $endpoint data=$dataJson")

        val encryptedBody = webView.encryptData(dataJson) ?: run {
            Log.e(TAG, "encryptData returned null")
            return null
        }

        Log.d(TAG, "Encrypted body: ${encryptedBody.take(200)}")

        val ir = try {
            parseJson<EncryptedResponse>(encryptedBody)
        } catch (e: Exception) {
            Log.e(TAG, "Parse encrypted body failed: ${e.message}")
            return null
        }

        val timestamp = (System.currentTimeMillis() / 1000).toString()
        val apiUrl = "$BASE_URL/$endpoint/$timestamp"
        Log.d(TAG, "POST $apiUrl")

        val response = doOkHttpPost(apiUrl, encryptedBody, ctx)
        if (response == null) {
            Log.e(TAG, "OkHttp POST returned null — trying CF bypass")
            val bypassed = cfBypassMutex.withLock {
                showAniSnatchCFDialogAndWait("$BASE_URL/home")
            }
            if (!bypassed) {
                Log.e(TAG, "CF bypass dialog failed/cancelled")
                return null
            }
            val retryResponse = doOkHttpPost(apiUrl, encryptedBody, ctx)
            if (retryResponse == null) {
                Log.e(TAG, "OkHttp POST still null after CF bypass")
                return null
            }
            return decryptOkHttp(retryResponse, ir.token ?: return null)
        }

        return decryptOkHttp(response, ir.token ?: return null)
    }

    private fun doOkHttpPost(url: String, body: String, ctx: Context): ByteArray? {
        return try {
            val cookies = AniSnatchPlugin.getCfCookies(ctx)
            val ua = AniSnatchPlugin.getCfUserAgent(ctx).ifBlank {
                "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Mobile Safari/537.36"
            }

            val request = Request.Builder()
                .url(url)
                .post(body.toRequestBody("application/json".toMediaType()))
                .header("Content-Type", "application/json")
                .header("User-Agent", ua)
                .header("Accept", "*/*")
                .header("Referer", "$BASE_URL/")
                .header("Origin", BASE_URL)
                .apply {
                    if (cookies.isNotEmpty()) {
                        header("Cookie", cookies)
                    }
                }
                .build()

            okHttpClient.newCall(request).execute().use { resp ->
                Log.d(TAG, "OkHttp response: HTTP ${resp.code} ${resp.message}")
                if (!resp.isSuccessful) {
                    Log.e(TAG, "OkHttp failed: HTTP ${resp.code}")
                    return null
                }
                resp.body?.bytes()
            }
        } catch (e: Exception) {
            Log.e(TAG, "OkHttp POST error: ${e.message}")
            null
        }
    }

    private suspend fun decryptOkHttp(responseBytes: ByteArray, token: String): String? {
        val hex = responseBytes.joinToString("") { "%02x".format(it) }
        val decrypted = webView.decryptResponse(hex, token)
        Log.d(TAG, "Decrypted response: ${decrypted?.take(500)}")
        return decrypted
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val epData = try {
            parseJson<EpisodeData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks parse failed: ${e.message}")
            return false
        }

        val anilistId = epData.anilistId
        val epNum = epData.episode
        val lang = epData.lang

        Log.d(TAG, "loadLinks: al=$anilistId ep=$epNum lang=$lang")

        val params = mapOf(
            "animeID" to anilistId,
            "episodeNO" to epNum
        )
        val result = callApi("api/loadSVs", params) ?: run {
            Log.e(TAG, "callApi returned null")
            return false
        }

        Log.d(TAG, "loadSVs full response: ${result.take(2000)}")

        val servers = try {
            parseJson<ServersResponse>(result)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks parse failed: ${e.message}")
            return false
        }

        if (servers.success != true) {
            Log.e(TAG, "loadSVs failed: ${servers.message}")
            return false
        }

        var found = false
        val allServers = mutableListOf<ServerInfo>()

        servers.sub?.forEach { allServers.add(ServerInfo(it, "sub")) }
        servers.dub?.forEach { allServers.add(ServerInfo(it, "dub")) }
        servers.hindi?.forEach { allServers.add(ServerInfo(it, "hindi")) }
        servers.multi?.forEach { allServers.add(ServerInfo(it, "multi")) }

        if (allServers.isEmpty()) {
            servers.servers?.forEach { server ->
                val serverLang = when {
                    server.type == "dub" || server.audio == "dub" -> "dub"
                    server.lang?.contains("hi", true) == true -> "hindi"
                    server.lang?.contains("multi", true) == true -> "multi"
                    else -> "sub"
                }
                allServers.add(ServerInfo(server, serverLang))
            }
        }

        if (allServers.isEmpty()) {
            servers.data?.sub?.forEach { allServers.add(ServerInfo(it, "sub")) }
            servers.data?.dub?.forEach { allServers.add(ServerInfo(it, "dub")) }
            servers.data?.hindi?.forEach { allServers.add(ServerInfo(it, "hindi")) }
            servers.data?.multi?.forEach { allServers.add(ServerInfo(it, "multi")) }
        }

        if (allServers.isEmpty()) {
            Log.e(TAG, "No servers found. Raw: ${result.take(500)}")
            return false
        }

        Log.d(TAG, "Found ${allServers.size} servers")

        if (lang == "dub") {
            allServers.retainAll { it.langType == "dub" || it.langType == "hindi" || it.langType == "multi" }
        } else {
            allServers.retainAll { it.langType == "sub" || it.langType == "multi" }
        }

        coroutineScope {
            val jobs = allServers.map { serverInfo ->
                async { resolveServer(serverInfo, lang, callback, subtitleCallback) }
            }
            found = jobs.awaitAll().any { it }
        }

        Log.d(TAG, "loadLinks done: found=$found")
        return found
    }

    private suspend fun resolveServer(
        serverInfo: ServerInfo,
        requestedLang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        val server = serverInfo.server
        val url = server.url ?: server.stream ?: server.link ?: server.file ?: return false
        if (url.isBlank()) return false

        val sourceName = buildString {
            append("AniSnatch")
            append(" • ")
            append(server.name ?: server.server ?: server.source ?: "Server")
            when (serverInfo.langType) {
                "hindi" -> append(" • Hindi")
                "multi" -> append(" • Multi")
                "dub" -> append(" • Dub")
                "sub" -> append(" • Sub")
            }
        }

        server.subtitles?.forEach { sub ->
            if (!sub.url.isNullOrBlank()) {
                subtitleCallback.invoke(newSubtitleFile(sub.label ?: "English", sub.url))
            }
        }

        if (url.contains(".m3u8")) {
            try {
                M3u8Helper.generateM3u8(
                    source = sourceName,
                    streamUrl = url,
                    referer = mainUrl
                ).forEach(callback)
                return true
            } catch (e: Exception) {
                Log.d(TAG, "$sourceName m3u8 failed: ${e.message}")
            }
        }

        if (url.contains(".mp4")) {
            callback.invoke(
                newExtractorLink(sourceName, sourceName, url, ExtractorLinkType.VIDEO) {
                    this.referer = mainUrl
                }
            )
            return true
        }

        if (url.startsWith(mainUrl) || url.startsWith("/video/") || url.contains("/video/")) {
            Log.d(TAG, "$sourceName fetching stream URL from: $url")
            val streamUrl = webView.fetchStreamUrl(url)
            if (streamUrl != null) {
                Log.d(TAG, "$sourceName got stream: $streamUrl")
                if (streamUrl.contains(".m3u8")) {
                    try {
                        val referer = if (streamUrl.contains("megaup")) {
                            "https://argon.razorshell.space/"
                        } else {
                            mainUrl
                        }
                        M3u8Helper.generateM3u8(
                            source = sourceName,
                            streamUrl = streamUrl,
                            referer = referer
                        ).forEach(callback)
                        return true
                    } catch (e: Exception) {
                        Log.d(TAG, "$sourceName stream m3u8 failed: ${e.message}")
                    }
                }
                if (streamUrl.contains(".mp4")) {
                    callback.invoke(
                        newExtractorLink(sourceName, sourceName, streamUrl, ExtractorLinkType.VIDEO) {
                            this.referer = mainUrl
                        }
                    )
                    return true
                }
            }
        }

        return try {
            loadExtractor(url, mainUrl, subtitleCallback, callback)
        } catch (e: Exception) {
            Log.d(TAG, "$sourceName embed failed: ${e.message}")
            false
        }
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class EpisodeData(
    @JsonProperty("anilistId") val anilistId: Int,
    @JsonProperty("episode") val episode: Int,
    @JsonProperty("lang") val lang: String,
    @JsonProperty("isMovie") val isMovie: Boolean,
    @JsonProperty("title") val title: String
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class EncryptedResponse(
    @JsonProperty("data") val data: List<String>? = null,
    @JsonProperty("key") val key: List<Int>? = null,
    @JsonProperty("token") val token: String? = null,
    @JsonProperty("authenticator") val authenticator: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListResponse(
    @JsonProperty("data") val data: AniListData? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListData(
    @JsonProperty("Page") val page: AniListPage? = null,
    @JsonProperty("Media") val media: AniListMedia? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListPage(
    @JsonProperty("media") val media: List<AniListMedia>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListMedia(
    @JsonProperty("id") val id: Int? = null,
    @JsonProperty("title") val title: AniListTitle? = null,
    @JsonProperty("coverImage") val coverImage: AniListCover? = null,
    @JsonProperty("description") val description: String? = null,
    @JsonProperty("format") val format: String? = null,
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("episodes") val episodes: Int? = null,
    @JsonProperty("genres") val genres: List<String>? = null,
    @JsonProperty("startDate") val startDate: AniListDate? = null,
    @JsonProperty("nextAiringEpisode") val nextAiringEpisode: AniListAiring? = null
) {
    fun toSearchResult(provider: AniSnatchProvider): SearchResponse? {
        val title = title?.english?.ifBlank { null } ?: title?.romaji ?: return null
        val id = id ?: return null
        val poster = coverImage?.large ?: coverImage?.extraLarge
        return provider.newAnimeSearchResponse(title, "$id", TvType.Anime) {
            this.posterUrl = poster
        }
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListTitle(
    @JsonProperty("romaji") val romaji: String? = null,
    @JsonProperty("english") val english: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListCover(
    @JsonProperty("large") val large: String? = null,
    @JsonProperty("extraLarge") val extraLarge: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListDate(
    @JsonProperty("year") val year: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListAiring(
    @JsonProperty("episode") val episode: Int? = null,
    @JsonProperty("airingAt") val airingAt: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ServersResponse(
    @JsonProperty("success") val success: Boolean? = null,
    @JsonProperty("message") val message: String? = null,
    @JsonProperty("sub") val sub: List<ServerData>? = null,
    @JsonProperty("dub") val dub: List<ServerData>? = null,
    @JsonProperty("hindi") val hindi: List<ServerData>? = null,
    @JsonProperty("multi") val multi: List<ServerData>? = null,
    @JsonProperty("servers") val servers: List<ServerData>? = null,
    @JsonProperty("data") val data: ServersData? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ServersData(
    @JsonProperty("sub") val sub: List<ServerData>? = null,
    @JsonProperty("dub") val dub: List<ServerData>? = null,
    @JsonProperty("hindi") val hindi: List<ServerData>? = null,
    @JsonProperty("multi") val multi: List<ServerData>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ServerData(
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("server") val server: String? = null,
    @JsonProperty("source") val source: String? = null,
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("stream") val stream: String? = null,
    @JsonProperty("link") val link: String? = null,
    @JsonProperty("file") val file: String? = null,
    @JsonProperty("quality") val quality: String? = null,
    @JsonProperty("type") val type: String? = null,
    @JsonProperty("audio") val audio: String? = null,
    @JsonProperty("lang") val lang: String? = null,
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("subtitles") val subtitles: List<SubtitleTrack>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class SubtitleTrack(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("label") val label: String? = null,
    @JsonProperty("lang") val lang: String? = null
)

data class ServerInfo(
    val server: ServerData,
    val langType: String
)
