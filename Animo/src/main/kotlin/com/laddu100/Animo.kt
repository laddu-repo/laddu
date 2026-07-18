package com.laddu100

import android.annotation.SuppressLint
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.INFER_TYPE
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.newSubtitleFile
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.net.URLEncoder
import kotlin.coroutines.resume

class Animo : MainAPI() {
    override var mainUrl = "https://4animo.xyz"
    override var name = "Animo"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val TAG = "Animo"
    private val apiUrl = "https://api.kryzox.xyz"
    private val cdnUrl = "https://cdn.4animo.xyz"

    private val ua = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"
    private val apiHeaders = mapOf(
        "User-Agent" to ua,
        "Accept" to "application/json, text/plain, */*",
        "Accept-Language" to "en-US,en;q=0.5",
        "Referer" to "$mainUrl/",
        "Origin" to mainUrl
    )

    // Each section maps directly to a real backend endpoint at /anime/{data}
    // (the old keyword=&sort=... search API rejected empty keywords with HTTP 400)
    override val mainPage = mainPageOf(
        Pair("trending", "Trending"),
        Pair("recently-updated", "Recently Updated"),
        Pair("recently-added", "Recently Added"),
        Pair("top", "Top Rated"),
        Pair("movie", "Movies"),
        Pair("tv", "TV Series"),
        Pair("ova", "OVA"),
        Pair("ona", "ONA"),
        Pair("special", "Specials"),
        Pair("completed", "Completed")
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' data='${request.data}' page=$page")
        val endpoint = request.data
        val url = "$apiUrl/anime/$endpoint?page=$page&limit=20"
        Log.d(TAG, "getMainPage Fetching: $url")
        return try {
            val response = app.get(url, headers = apiHeaders, timeout = 30_000L)
            val text = response.text
            Log.d(TAG, "getMainPage Response: HTTP ${response.code}, length=${text.length}")
            Log.d(TAG, "getMainPage Body preview: ${text.take(500)}")
            val items = parseAnimeList(text)
            Log.d(TAG, "getMainPage Parsed ${items.size} anime items for '${request.name}'")
            val home = items.mapNotNull { it.toSearchResponse() }
            Log.d(TAG, "getMainPage Built ${home.size} search responses for '${request.name}'")
            newHomePageResponse(request.name, home, hasNext = home.size == 20)
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage FAILED for '${request.name}': ${e.message}\n${e.stackTraceToString().take(800)}")
            newHomePageResponse(request.name, emptyList(), hasNext = false)
        }
    }

    // The /anime/trending endpoint returns a bare JSON ARRAY, while the other
    // endpoints return {"data":[...]}. Handle both transparently.
    private fun parseAnimeList(text: String): List<AnimeSearchItem> {
        return try {
            val trimmed = text.trim()
            if (trimmed.startsWith("[")) {
                parseJson<List<AnimeSearchItem>>(text)
            } else {
                parseJson<SearchResponseData>(text).data ?: emptyList()
            }
        } catch (e: Exception) {
            Log.e(TAG, "parseAnimeList JSON parse failed: ${e.message}\n${e.stackTraceToString().take(600)}")
            emptyList()
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search START: query='$query'")
        if (query.isBlank()) {
            Log.d(TAG, "search: empty query, returning empty list")
            return emptyList()
        }
        return try {
            val encoded = URLEncoder.encode(query, "UTF-8")
            val url = "$apiUrl/anime/search?keyword=$encoded&page=1&limit=20"
            Log.d(TAG, "search Fetching: $url")
            val response = app.get(url, headers = apiHeaders, timeout = 30_000L)
            val text = response.text
            Log.d(TAG, "search Response: HTTP ${response.code}, length=${text.length}")
            Log.d(TAG, "search Body preview: ${text.take(500)}")
            val resp = parseJson<SearchResponseData>(text)
            val results = resp.data?.mapNotNull { it.toSearchResponse() } ?: emptyList()
            Log.d(TAG, "search Returning ${results.size} results for '$query'")
            results
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED for '$query': ${e.message}\n${e.stackTraceToString().take(600)}")
            emptyList()
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load START: url=$url")
        val animeId = url.substringAfterLast("/").toIntOrNull()
        if (animeId == null) {
            Log.e(TAG, "load: could not parse animeId from url=$url")
            return null
        }
        Log.d(TAG, "load parsed animeId=$animeId")

        val animeText = try {
            val r = app.get("$apiUrl/anime/$animeId", headers = apiHeaders, timeout = 60_000L)
            Log.d(TAG, "load details Response: HTTP ${r.code}, length=${r.text.length}")
            r.text
        } catch (e: Exception) {
            Log.e(TAG, "load details fetch FAILED: ${e.message}\n${e.stackTraceToString().take(600)}")
            return null
        }

        val anime = try {
            parseJson<AnimeDetails>(animeText)
        } catch (e: Exception) {
            Log.e(TAG, "load details JSON parse FAILED: ${e.message}\n${e.stackTraceToString().take(600)}")
            Log.e(TAG, "load details raw preview: ${animeText.take(500)}")
            return null
        }
        val title = anime.titles?.english ?: anime.titles?.romaji
        if (title == null) {
            Log.e(TAG, "load: no title found in anime details, titles=${anime.titles}")
            return null
        }
        Log.d(TAG, "load title='$title', type=${anime.type}, status=${anime.status}")

        val epText = try {
            val r = app.get("$apiUrl/anime/$animeId/episodes", headers = apiHeaders, timeout = 60_000L)
            Log.d(TAG, "load episodes Response: HTTP ${r.code}, length=${r.text.length}")
            r.text
        } catch (e: Exception) {
            Log.e(TAG, "load episodes fetch FAILED: ${e.message}\n${e.stackTraceToString().take(600)}")
            return null
        }

        val epResp = try {
            parseJson<EpisodesResponse>(epText)
        } catch (e: Exception) {
            Log.e(TAG, "load episodes JSON parse FAILED: ${e.message}\n${e.stackTraceToString().take(600)}")
            Log.e(TAG, "load episodes raw preview: ${epText.take(500)}")
            return null
        }
        val episodes = epResp.data ?: emptyList()
        Log.d(TAG, "load got ${episodes.size} episodes (total=${epResp.total}, sub=${epResp.sub_count}, dub=${epResp.dub_count})")

        val subEps = mutableListOf<Episode>()
        val dubEps = mutableListOf<Episode>()

        episodes.forEach { ep ->
            val num = ep.number
            if (num == null) {
                Log.d(TAG, "load: skipping episode with no number: id=${ep.id}")
                return@forEach
            }
            val epId = ep.id
            if (epId == null) {
                Log.d(TAG, "load: skipping episode num=$num with no id")
                return@forEach
            }
            val epName = ep.titles?.en ?: ep.titles?.romaji ?: "Episode $num"
            if (ep.sub == true) {
                val epData = EpisodeData(animeId, epId, ep.embed_id, num, anime.slug ?: "", "sub", ep.ani, anime.al_id).toJson()
                subEps.add(newEpisode(epData) {
                    this.episode = num
                    this.name = epName
                    this.posterUrl = ep.thumbnail
                })
            }
            if (ep.dub == true) {
                val epData = EpisodeData(animeId, epId, ep.embed_id, num, anime.slug ?: "", "dub", ep.ani, anime.al_id).toJson()
                dubEps.add(newEpisode(epData) {
                    this.episode = num
                    this.name = epName
                    this.posterUrl = ep.thumbnail
                })
            }
        }
        Log.d(TAG, "load built ${subEps.size} sub episodes and ${dubEps.size} dub episodes")

        val tvType = when (anime.type?.uppercase()) {
            "MOVIE" -> TvType.AnimeMovie
            "OVA", "ONA", "SPECIAL" -> TvType.OVA
            else -> TvType.Anime
        }
        val year = anime.air?.start?.substringBefore("-")?.toIntOrNull()

        val finalType = if (tvType == TvType.AnimeMovie && dubEps.isNotEmpty()) TvType.Anime else tvType
        return newAnimeLoadResponse(title, url, finalType) {
            this.posterUrl = anime.images?.poster
            this.plot = anime.synopsis
            this.year = year
            this.tags = anime.genres
            if (anime.score != null) this.score = Score.from10(anime.score.toString())
            if (subEps.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEps)
            if (dubEps.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEps)
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START: data=$data")
        val epData = try {
            parseJson<EpisodeData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: failed to parse EpisodeData: ${e.message}")
            return false
        }
        Log.d(TAG, "loadLinks: animeId=${epData.animeId}, episodeNum=${epData.episodeNum}, embedId=${epData.embedId}, streamType=${epData.streamType}")

        val playHeaders = mapOf(
            "Referer" to "$mainUrl/",
            "Origin" to mainUrl,
            "User-Agent" to ua
        )

        // Primary path: hit the getSources API for ALL quality servers (hd=1 to hd=4)
        // for both sub and dub. Each hd value is a different server/quality.
        var found = false
        val typesToTry = if (epData.streamType == "dub") listOf("dub", "sub") else listOf("sub", "dub")
        for (type in typesToTry) {
            var subsPassedForType = false
            for (hd in 1..4) {
                val sourcesUrl = if (hd == 4 && epData.ani != null) {
                    val encodedId = java.net.URLEncoder.encode("anilist:${epData.ani}", "UTF-8")
                    "$cdnUrl/stream/getSources?id=$encodedId&server=hd-4&type=$type"
                } else {
                    "$cdnUrl/stream/getSources?hd=$hd&id=${epData.animeId}&episode=${epData.episodeNum}&type=$type"
                }
                val referer = if (hd == 4 && epData.ani != null && epData.alId != null) {
                    "$cdnUrl/embed/hd-4/ani/${epData.alId}/${epData.episodeNum}/$type"
                } else {
                    "$cdnUrl/embed/hd-$hd/${epData.animeId}/${epData.episodeNum}/$type"
                }
                Log.d(TAG, "loadLinks Fetching getSources (type=$type, hd=$hd): $sourcesUrl")
                try {
                    val response = app.get(
                        sourcesUrl,
                        headers = mapOf(
                            "User-Agent" to ua,
                            "Accept" to "application/json, text/plain, */*",
                            "Referer" to referer,
                            "Origin" to cdnUrl
                        ),
                        timeout = 30_000L
                    )
                    val text = response.text
                    Log.d(TAG, "loadLinks getSources (type=$type, hd=$hd) Response: HTTP ${response.code}, length=${text.length}")
                    if (response.code != 200) {
                        Log.e(TAG, "loadLinks getSources (type=$type, hd=$hd) non-200, skipping")
                        continue
                    }
                    if (text.contains("Just a moment") || text.contains("cloudflare")) {
                        Log.e(TAG, "loadLinks getSources (type=$type, hd=$hd) CF blocked, skipping")
                        continue
                    }
                    val sources = parseJson<GetSourcesResponse>(text)
                    Log.d(TAG, "loadLinks getSources (type=$type, hd=$hd) parsed: ${sources.sources?.size ?: 0} sources, encrypted=${sources.encrypted}, ${sources.tracks?.size ?: 0} tracks, server=${sources.server}")

                    sources.sources?.forEach { s ->
                        val file = s.file ?: return@forEach
                        val streamUrl = if (file.startsWith("http")) file else "$cdnUrl/${file.removePrefix("/")}"
                        val label = "$name HD$hd ($type)"
                        Log.d(TAG, "loadLinks found source: label=$label, type=${s.type}, url=$streamUrl")
                        if (s.type == "hls" || streamUrl.contains(".m3u8")) {
                            try {
                                M3u8Helper.generateM3u8(label, streamUrl, "$cdnUrl/", headers = playHeaders).forEach(callback)
                            } catch (e: Exception) {
                                Log.e(TAG, "loadLinks M3u8Helper failed for $label, adding raw link: ${e.message}")
                                callback.invoke(
                                    newExtractorLink(label, label, streamUrl, type = ExtractorLinkType.M3U8) {
                                        this.referer = "$cdnUrl/"
                                        this.headers = playHeaders
                                    }
                                )
                            }
                            found = true
                        } else {
                            callback.invoke(
                                newExtractorLink(label, label, streamUrl, type = INFER_TYPE) {
                                    this.referer = "$cdnUrl/"
                                    this.headers = playHeaders
                                }
                            )
                            found = true
                        }
                    }

                    if (!subsPassedForType && !sources.tracks.isNullOrEmpty()) {
                        sources.tracks.forEach { t ->
                            val file = t.file ?: return@forEach
                            val subUrl = if (file.startsWith("http")) file else "$cdnUrl/${file.removePrefix("/")}"
                            Log.d(TAG, "loadLinks found subtitle: label=${t.label}, url=$subUrl")
                            // CDN subtitle files need Referer/Origin like the video does,
                            // otherwise the player shows the track name but serves no text.
                            subtitleCallback.invoke(newSubtitleFile(t.label ?: "English", subUrl) {
                                this.headers = playHeaders
                            })
                        }
                        subsPassedForType = true
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "loadLinks getSources (type=$type, hd=$hd) FAILED: ${e.message}")
                }
            }
            if (found) {
                Log.d(TAG, "loadLinks SUCCESS via direct API (type=$type)")
                break
            }
        }

        // Fallback: use a WebView to load the /watch/{slug}?ep={num} page on
        // 4animo.xyz (NOT Cloudflare-protected on /watch/) and intercept the
        // cdn.4animo.xyz m3u8 URL that the MegaCloud player requests.
        if (!found) {
            Log.d(TAG, "loadLinks: direct API found nothing, falling back to WebView extraction")
            val watchUrl = if (epData.slug.isNotBlank()) {
                "$mainUrl/watch/${epData.slug}?ep=${epData.episodeNum}"
            } else {
                "$mainUrl/embed/${epData.embedId}"
            }
            Log.d(TAG, "loadLinks WebView loading: $watchUrl")
            val streamUrl = withTimeoutOrNull(30_000L) {
                extractStreamFromWebView(watchUrl)
            }
            if (streamUrl != null) {
                Log.d(TAG, "loadLinks WebView intercepted stream: $streamUrl")
                if (streamUrl.contains(".m3u8")) {
                    try {
                        M3u8Helper.generateM3u8(name, streamUrl, "$cdnUrl/", headers = playHeaders).forEach(callback)
                    } catch (e: Exception) {
                        Log.e(TAG, "loadLinks WebView M3u8Helper failed, adding raw: ${e.message}")
                        callback.invoke(
                            newExtractorLink(name, name, streamUrl, type = ExtractorLinkType.M3U8) {
                                this.referer = "$cdnUrl/"
                                this.headers = playHeaders
                            }
                        )
                    }
                    found = true
                } else if (streamUrl.isNotEmpty()) {
                    callback.invoke(
                        newExtractorLink(name, name, streamUrl, type = INFER_TYPE) {
                            this.referer = "$cdnUrl/"
                            this.headers = playHeaders
                        }
                    )
                    found = true
                }
            } else {
                Log.e(TAG, "loadLinks WebView found NO stream URL (timeout or no match)")
            }
        }

        Log.d(TAG, "loadLinks END: found=$found")
        return found
    }

    @SuppressLint("SetJavaScriptEnabled")
    private suspend fun extractStreamFromWebView(url: String): String? = withContext(Dispatchers.Main) {
        val context = com.lagradost.cloudstream3.CommonActivity.activity
        if (context == null) {
            Log.e(TAG, "extractStreamFromWebView: no Activity available, cannot create WebView")
            return@withContext null
        }
        Log.d(TAG, "extractStreamFromWebView START: url=$url")
        suspendCancellableCoroutine { cont ->
            var foundUrl: String? = null
            val webView = WebView(context)
            try {
                CookieManager.getInstance().setAcceptCookie(true)
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
                webView.settings.apply {
                    javaScriptEnabled = true
                    domStorageEnabled = true
                    mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                    userAgentString = ua
                }
                webView.webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?) = false

                    override fun onLoadResource(view: WebView?, resourceUrl: String?) {
                        super.onLoadResource(view, resourceUrl)
                        if (resourceUrl != null) {
                            // Log every resource that looks stream-related
                            if (resourceUrl.contains(".m3u8") || resourceUrl.contains("/stream/") ||
                                resourceUrl.contains("/video/") || resourceUrl.contains(".mp4") ||
                                resourceUrl.contains("getSources")
                            ) {
                                Log.d(TAG, "WebView onLoadResource MATCH: $resourceUrl")
                                if (foundUrl == null && (resourceUrl.contains(".m3u8") || resourceUrl.contains(".mp4"))) {
                                    foundUrl = resourceUrl
                                    if (cont.isActive) cont.resume(resourceUrl)
                                }
                            }
                        }
                    }

                    override fun onPageFinished(view: WebView?, url: String?) {
                        super.onPageFinished(view, url)
                        Log.d(TAG, "WebView onPageFinished: $url")
                    }
                }
                Log.d(TAG, "WebView loadUrl: $url")
                webView.loadUrl(url)
            } catch (e: Exception) {
                Log.e(TAG, "extractStreamFromWebView exception: ${e.message}\n${e.stackTraceToString().take(500)}")
                if (cont.isActive) cont.resume(null)
            }
            cont.invokeOnCancellation {
                Log.d(TAG, "WebView cancelled, destroying")
                try { webView.destroy() } catch (_: Exception) {}
            }
        }
    }

    private fun AnimeSearchItem.toSearchResponse(): SearchResponse? {
        val id = id ?: return null
        val title = titles?.english ?: titles?.romaji ?: return null
        return newAnimeSearchResponse(title, "$mainUrl/anime/$id", TvType.Anime) {
            this.posterUrl = images?.poster
            addDubStatus(dubExist = (dub_count ?: 0) > 0, subExist = (sub_count ?: 0) > 0)
        }
    }

    // ---- Data classes ----

    data class EpisodeData(
        val animeId: Int,
        val episodeId: Int,
        val embedId: String?,
        val episodeNum: Int,
        val slug: String,
        val streamType: String,
        val ani: String? = null,
        val alId: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeSearchItem(
        val id: Int? = null,
        val slug: String? = null,
        val titles: Titles? = null,
        val images: Images? = null,
        val type: String? = null,
        val status: String? = null,
        val episodes_count: Int? = null,
        val sub_count: Int? = null,
        val dub_count: Int? = null,
        val score: Double? = null,
        val season_year: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchResponseData(
        val success: Boolean? = null,
        val data: List<AnimeSearchItem>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Images(
        val poster: String? = null,
        val banner: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Titles(
        val romaji: String? = null,
        val english: String? = null,
        val native: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeDetails(
        val id: Int? = null,
        val slug: String? = null,
        val titles: Titles? = null,
        val synopsis: String? = null,
        val images: Images? = null,
        val type: String? = null,
        val status: String? = null,
        val score: Double? = null,
        val rating: String? = null,
        val air: Air? = null,
        val genres: List<String>? = null,
        val al_id: Int? = null,
        val mal_id: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Air(
        val start: String? = null,
        val end: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodesResponse(
        val anime_id: Int? = null,
        val total: Int? = null,
        val sub_count: String? = null,
        val dub_count: String? = null,
        val data: List<EpisodeItem>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeItem(
        val id: Int? = null,
        val number: Int? = null,
        val titles: EpisodeTitles? = null,
        val filler: Boolean? = null,
        val rating: String? = null,
        val thumbnail: String? = null,
        val sub: Boolean? = null,
        val dub: Boolean? = null,
        @com.fasterxml.jackson.annotation.JsonProperty("embed_id")
        val embed_id: String? = null,
        val ani: String? = null,
        val mal: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class EpisodeTitles(
        val en: String? = null,
        val ja: String? = null,
        val romaji: String? = null
    )

    // MegaCloud getSources response from cdn.4animo.xyz/stream/getSources
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class GetSourcesResponse(
        val sources: List<MegaSource>? = null,
        val tracks: List<MegaTrack>? = null,
        val encrypted: Boolean? = null,
        val server: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class MegaSource(
        val file: String? = null,
        val type: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class MegaTrack(
        val file: String? = null,
        val label: String? = null,
        val kind: String? = null,
        val default: Boolean? = null
    )
}
