package com.laddu100

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
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

class Reanime : MainAPI() {
    override var mainUrl = "https://reanime.to"
    override var name = "Reanime"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val TAG = "Reanime"
    private val apiBase = "$mainUrl/api/v1"

    private val ua = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"
    private val browserHeaders = mapOf(
        "User-Agent" to ua,
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,application/json;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.5"
    )

    // The non-Cloudflare-protected /api/v1/home endpoint returns four sections
    // in one shot: trending, latest_aired, new_on_site, upcoming. The old code
    // pointed at /ongoing, /completed, /most-popular, etc. which all 404.
    override val mainPage = mainPageOf(
        Pair("trending", "Trending"),
        Pair("latest_aired", "Latest Episodes"),
        Pair("new_on_site", "New on Site"),
        Pair("upcoming", "Upcoming")
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' key='${request.data}' page=$page")
        // The home endpoint only has one page; only serve page 1.
        if (page > 1) {
            Log.d(TAG, "getMainPage: page>1, returning empty (home API has no pagination)")
            return newHomePageResponse(request.name, emptyList(), hasNext = false)
        }
        val url = "$apiBase/home"
        Log.d(TAG, "getMainPage Fetching: $url")
        return try {
            val response = app.get(url, headers = browserHeaders)
            val text = response.text
            Log.d(TAG, "getMainPage Response: HTTP ${response.code}, length=${text.length}")
            Log.d(TAG, "getMainPage Body preview: ${text.take(400)}")
            val home = parseJson<HomeResponse>(text)
            val sectionItems = when (request.data) {
                "trending" -> home.trending
                "latest_aired" -> home.latest_aired
                "new_on_site" -> home.new_on_site
                "upcoming" -> home.upcoming
                else -> null
            } ?: emptyList()
            Log.d(TAG, "getMainPage '${request.name}' raw items: ${sectionItems.size}")
            val results = sectionItems.mapNotNull { it.toSearchResponse() }
            Log.d(TAG, "getMainPage '${request.name}' built ${results.size} search responses")
            newHomePageResponse(request.name, results, hasNext = false)
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage FAILED for '${request.name}': ${e.message}\n${e.stackTraceToString().take(800)}")
            newHomePageResponse(request.name, emptyList(), hasNext = false)
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
            val url = "$apiBase/search?q=$encoded"
            Log.d(TAG, "search Fetching: $url")
            val response = app.get(url, headers = browserHeaders)
            val text = response.text
            Log.d(TAG, "search Response: HTTP ${response.code}, length=${text.length}")
            Log.d(TAG, "search Body preview: ${text.take(400)}")
            if (response.code != 200) {
                Log.e(TAG, "search non-200 response, returning empty")
                return emptyList()
            }
            val resp = parseJson<SearchApiResponse>(text)
            Log.d(TAG, "search parsed ${resp.results?.size ?: 0} results (total=${resp.total})")
            val results = resp.results?.mapNotNull { it.toSearchResponse() } ?: emptyList()
            Log.d(TAG, "search returning ${results.size} results for '$query'")
            results
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED for '$query': ${e.message}\n${e.stackTraceToString().take(600)}")
            emptyList()
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load START: url=$url")
        val doc = try {
            app.get(url, headers = browserHeaders).document
        } catch (e: Exception) {
            Log.e(TAG, "load fetch FAILED: ${e.message}\n${e.stackTraceToString().take(600)}")
            return null
        }

        val title = doc.selectFirst("h1")?.text()?.trim()
            ?: doc.selectFirst("title")?.text()?.substringBefore(" - ")?.trim()
        if (title == null) {
            Log.e(TAG, "load: could not extract title from page")
            return null
        }
        val poster = doc.selectFirst("meta[property=og:image]")?.attr("content")?.takeIf { it.isNotBlank() }
            ?: doc.selectFirst("img")?.attr("src")
        val plot = doc.selectFirst("meta[name=description]")?.attr("content")
            ?: doc.selectFirst("[class*=description]")?.text()
        Log.d(TAG, "load extracted: title='$title', poster=$poster, plotLen=${plot?.length ?: 0}")

        val html = doc.html()
        Log.d(TAG, "load HTML length=${html.length}, preview: ${html.take(300)}")
        var episodeData = extractEpisodesFromHtml(html, url).toMutableList()
        Log.d(TAG, "load extracted ${episodeData.size} episodes from HTML")

        // If the HTML only has 100 episodes but the site reports more (last_episode field),
        // generate placeholder episodes for the remaining ones. The stream URL will be
        // resolved by WebView in loadLinks using the episode number.
        val lastEpisodeMatch = Regex("""last_episode:(\d+)""").find(html)
        val totalEpisodes = lastEpisodeMatch?.groupValues?.get(1)?.toIntOrNull() ?: 0
        Log.d(TAG, "load: last_episode from HTML = $totalEpisodes, extracted = ${episodeData.size}")
        if (totalEpisodes > episodeData.size) {
            Log.d(TAG, "load: generating placeholder episodes ${episodeData.size + 1}..$totalEpisodes")
            val existingNums = episodeData.map { it.episodeNumber }.toSet()
            for (i in (episodeData.size + 1)..totalEpisodes) {
                if (i !in existingNums) {
                    episodeData.add(ReanimeEpisodeData(url, "ep-$i", i, null))
                }
            }
            Log.d(TAG, "load: total episodes after placeholders: ${episodeData.size}")
        }

        val subEps = mutableListOf<Episode>()
        val dubEps = mutableListOf<Episode>()

        episodeData.forEach { ep ->
            val epData = ep.toJson()
            // The stream API exposes both sub and dub for each episode; we expose
            // the same episode under both DubStatus buckets so the user can pick.
            subEps.add(newEpisode(epData) {
                this.episode = ep.episodeNumber
                this.name = ep.title ?: "Episode ${ep.episodeNumber}"
            })
            dubEps.add(newEpisode(epData) {
                this.episode = ep.episodeNumber
                this.name = ep.title ?: "Episode ${ep.episodeNumber}"
            })
        }

        return newAnimeLoadResponse(title, url, TvType.Anime) {
            this.posterUrl = poster
            this.plot = plot
            if (subEps.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEps)
            if (dubEps.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEps)
        }
    }

    // Pulls episodeId + episode_number (+ title) out of the embedded JS in the
    // anime detail HTML. Each episode object looks like:
    //   {...,episodeId:"ep-1",episode_number:1,...,title:"...",title_japanese:"...",...}
    // The old regex required title BEFORE episodeId, but title actually comes
    // AFTER, so the title capture never matched. Fixed below.
    private fun extractEpisodesFromHtml(html: String, animeUrl: String): List<ReanimeEpisodeData> {
        val episodes = mutableListOf<ReanimeEpisodeData>()
        // Capture episodeId, episode_number and (optionally) the title that
        // follows within the same object (no } in between).
        val epRegex = Regex(
            """episodeId:"([^"]*)"[^{}]*episode_number:(\d+)(?:[^{}]*?title:"((?:[^"\\]|\\.)*)")?"""
        )
        val matches = epRegex.findAll(html).toList()
        Log.d(TAG, "extractEpisodesFromHtml: regex matched ${matches.size} episode blocks")
        matches.forEach { match ->
            val epId = match.groupValues[1]
            val epNum = match.groupValues[2].toIntOrNull() ?: return@forEach
            val title = match.groupValues[3].takeIf { it.isNotBlank() }
                ?.replace("\\\"", "\"")
                ?.replace("\\n", " ")
            episodes.add(ReanimeEpisodeData(animeUrl, epId, epNum, title))
        }
        val distinct = episodes.distinctBy { it.episodeId }
        Log.d(TAG, "extractEpisodesFromHtml: ${distinct.size} distinct episodes (was ${episodes.size} before dedup)")
        if (distinct.isNotEmpty()) {
            Log.d(TAG, "extractEpisodesFromHtml first: ${distinct.first()}")
            Log.d(TAG, "extractEpisodesFromHtml last: ${distinct.last()}")
        }
        return distinct
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START: data=$data")
        val epData = try {
            parseJson<ReanimeEpisodeData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: failed to parse ReanimeEpisodeData: ${e.message}")
            return false
        }
        // The anime URL looks like https://reanime.to/anime/{slug}; pull the slug
        // out so we can build the correct /watch/{slug}?ep={num} URL. The old
        // code built /anime/{slug}/watch/{episodeId} which 404'd.
        val slug = epData.animeUrl.substringAfterLast("/").takeIf { it.isNotBlank() }
        if (slug == null) {
            Log.e(TAG, "loadLinks: could not extract slug from animeUrl=${epData.animeUrl}")
            return false
        }
        val watchUrl = "$mainUrl/watch/$slug?ep=${epData.episodeNumber}"
        Log.d(TAG, "loadLinks: animeUrl=${epData.animeUrl}, slug=$slug, episodeId=${epData.episodeId}, episodeNumber=${epData.episodeNumber}")
        Log.d(TAG, "loadLinks: WebView will load: $watchUrl")

        val playHeaders = mapOf(
            "Referer" to "$mainUrl/",
            "Origin" to mainUrl,
            "User-Agent" to ua
        )

        // Stream endpoints on reanime.to are Cloudflare-protected, so we must
        // let a real WebView solve the challenge and then intercept the m3u8
        // / mp4 URL the player requests.
        val streamUrls = withTimeoutOrNull(35_000L) {
            extractStreamsFromWebView(watchUrl)
        } ?: emptyList()
        Log.d(TAG, "loadLinks: WebView returned ${streamUrls.size} stream URLs: $streamUrls")

        if (streamUrls.isEmpty()) {
            Log.e(TAG, "loadLinks: no stream URLs found via WebView")
            return false
        }

        var found = false
        // Only use master.m3u8 — skip video.m3u8 and audio/native.m3u8
        // (they're separate video/audio tracks that only work together via the master playlist)
        // Also use direct ExtractorLink instead of M3u8Helper (the m3u8 is encoded/custom,
        // M3u8Helper can't parse it, but ExoPlayer can play it directly via Cronet)
        val masterUrl = streamUrls.firstOrNull { it.contains("master.m3u8") }
            ?: streamUrls.firstOrNull { it.contains(".m3u8") && !it.contains("audio/") }

        if (masterUrl != null) {
            Log.d(TAG, "loadLinks using master.m3u8: $masterUrl")
            callback.invoke(
                newExtractorLink(name, name, masterUrl, type = ExtractorLinkType.M3U8) {
                    this.referer = "$mainUrl/"
                    this.headers = playHeaders
                }
            )
            found = true
        } else {
            // Fallback: try all m3u8 URLs except audio-only ones
            streamUrls.forEach { streamUrl ->
                if (streamUrl.contains("audio/")) {
                    Log.d(TAG, "loadLinks skipping audio-only stream: $streamUrl")
                    return@forEach
                }
                Log.d(TAG, "loadLinks processing stream: $streamUrl")
                if (streamUrl.contains(".m3u8")) {
                    callback.invoke(
                        newExtractorLink(name, name, streamUrl, type = ExtractorLinkType.M3U8) {
                            this.referer = "$mainUrl/"
                            this.headers = playHeaders
                        }
                    )
                    found = true
                } else if (streamUrl.contains(".mp4") || streamUrl.contains("/video/")) {
                    callback.invoke(
                        newExtractorLink(name, name, streamUrl, type = INFER_TYPE) {
                            this.referer = "$mainUrl/"
                            this.headers = playHeaders
                        }
                    )
                    found = true
                }
            }
        }
        Log.d(TAG, "loadLinks END: found=$found")
        return found
    }

    @SuppressLint("SetJavaScriptEnabled")
    private suspend fun extractStreamsFromWebView(url: String): List<String> = withContext(Dispatchers.Main) {
        val context = com.lagradost.cloudstream3.CommonActivity.activity
        if (context == null) {
            Log.e(TAG, "extractStreamsFromWebView: no Activity available, cannot create WebView")
            return@withContext emptyList()
        }
        Log.d(TAG, "extractStreamsFromWebView START: url=$url")
        suspendCancellableCoroutine { cont ->
            val foundUrls = LinkedHashSet<String>()
            var resumed = false
            val webView = WebView(context)
            val mainHandler = Handler(Looper.getMainLooper())

            fun tryResume(reason: String) {
                if (resumed) return
                if (!cont.isActive) return
                resumed = true
                Log.d(TAG, "extractStreamsFromWebView resuming ($reason): ${foundUrls.size} urls found")
                cont.resume(foundUrls.toList())
            }

            try {
                CookieManager.getInstance().setAcceptCookie(true)
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
                webView.settings.apply {
                    javaScriptEnabled = true
                    domStorageEnabled = true
                    mediaPlaybackRequiresUserGesture = false
                    mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                    userAgentString = ua
                }
                webView.webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?) = false

                    override fun onLoadResource(view: WebView?, resourceUrl: String?) {
                        super.onLoadResource(view, resourceUrl)
                        if (resourceUrl == null) return
                        // Log every resource that looks stream-related and capture it
                        if (resourceUrl.contains(".m3u8") || resourceUrl.contains(".mp4") ||
                            resourceUrl.contains("/stream/") || resourceUrl.contains("/video/") ||
                            resourceUrl.contains("getSources") || resourceUrl.contains("playlist")
                        ) {
                            Log.d(TAG, "extractStreamsFromWebView onLoadResource MATCH: $resourceUrl")
                            if (resourceUrl.contains(".m3u8") || resourceUrl.contains(".mp4")) {
                                foundUrls.add(resourceUrl)
                            }
                        }
                    }

                    override fun onPageFinished(view: WebView?, pageUrl: String?) {
                        super.onPageFinished(view, pageUrl)
                        Log.d(TAG, "extractStreamsFromWebView onPageFinished: $pageUrl")
                        // Give the player JS some time to fetch the stream after
                        // the page itself has finished loading. If a stream has
                        // already been intercepted we resume immediately,
                        // otherwise wait 8s before giving up on this phase.
                        mainHandler.postDelayed({
                            if (foundUrls.isNotEmpty()) {
                                tryResume("post-delay after onPageFinished (had urls)")
                            } else {
                                // Try to scrape any video source tags the player may have rendered
                                try {
                                    view?.evaluateJavascript(
                                        "(function(){var v=document.querySelector('video');if(v&&v.src){return v.src;}var s=document.querySelectorAll('source');for(var i=0;i<s.length;i++){if(s[i].src){return s[i].src;}}return '';})();"
                                    ) { result ->
                                        val cleaned = result?.trim()?.removeSurrounding("\"")?.takeIf { it.isNotBlank() && it != "null" }
                                        if (!cleaned.isNullOrEmpty()) {
                                            Log.d(TAG, "extractStreamsFromWebView JS extracted video src: $cleaned")
                                            foundUrls.add(cleaned)
                                        }
                                        tryResume("post-JS-eval")
                                    }
                                } catch (e: Exception) {
                                    Log.e(TAG, "extractStreamsFromWebView JS eval failed: ${e.message}")
                                    tryResume("post-JS-eval (error)")
                                }
                            }
                        }, 8000)
                    }
                }
                Log.d(TAG, "extractStreamsFromWebView loadUrl: $url")
                webView.loadUrl(url)
            } catch (e: Exception) {
                Log.e(TAG, "extractStreamsFromWebView exception: ${e.message}\n${e.stackTraceToString().take(500)}")
                tryResume("exception")
            }

            cont.invokeOnCancellation {
                Log.d(TAG, "extractStreamsFromWebView cancelled, destroying WebView")
                try { webView.destroy() } catch (_: Exception) {}
            }
        }
    }

    private fun HomeAnimeItem.toSearchResponse(): SearchResponse? {
        val aid = anime_id ?: return null
        val title = title?.english ?: title?.romaji ?: title?.native ?: return null
        val poster = cover_image?.extra_large ?: cover_image?.large ?: cover_image?.medium
        return newAnimeSearchResponse(title, "$mainUrl/anime/$aid", TvType.Anime) {
            this.posterUrl = poster
            addDubStatus(dubExist = (dubbed ?: 0) > 0, subExist = (subbed ?: 0) > 0)
        }
    }

    private fun SearchAnimeItem.toSearchResponse(): SearchResponse? {
        val aid = anime_id ?: return null
        val title = title?.english ?: title?.romaji ?: title?.native ?: return null
        val poster = cover_image?.extra_large ?: cover_image?.large ?: cover_image?.medium
        return newAnimeSearchResponse(title, "$mainUrl/anime/$aid", TvType.Anime) {
            this.posterUrl = poster
            addDubStatus(dubExist = (dubbed ?: 0) > 0, subExist = (subbed ?: 0) > 0)
        }
    }

    // ---- Data classes ----

    data class ReanimeEpisodeData(
        val animeUrl: String,
        val episodeId: String,
        val episodeNumber: Int,
        val title: String?
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class HomeResponse(
        val trending: List<HomeAnimeItem>? = null,
        val latest_aired: List<HomeAnimeItem>? = null,
        val new_on_site: List<HomeAnimeItem>? = null,
        val upcoming: List<HomeAnimeItem>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class HomeAnimeItem(
        val anime_id: String? = null,
        val title: AnimeTitle? = null,
        val cover_image: CoverImage? = null,
        val banner_image: String? = null,
        val format: String? = null,
        val status: String? = null,
        val genres: List<String>? = null,
        val season_year: Int? = null,
        val episodes: Int? = null,
        val subbed: Int? = null,
        val dubbed: Int? = null,
        val average_score: Int? = null,
        val description: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchApiResponse(
        val limit: Int? = null,
        val offset: Int? = null,
        val total: Int? = null,
        val query: String? = null,
        val results: List<SearchAnimeItem>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SearchAnimeItem(
        val anime_id: String? = null,
        val title: AnimeTitle? = null,
        val cover_image: CoverImage? = null,
        val format: String? = null,
        val status: String? = null,
        val genres: List<String>? = null,
        val season_year: Int? = null,
        val episodes: Int? = null,
        val subbed: Int? = null,
        val dubbed: Int? = null,
        val average_score: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AnimeTitle(
        val english: String? = null,
        val native: String? = null,
        val romaji: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class CoverImage(
        val extra_large: String? = null,
        val large: String? = null,
        val medium: String? = null
    )
}
