package com.toonstream

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.api.Log
import org.jsoup.nodes.Element
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Toonstream : MainAPI() {
    override var mainUrl = "https://toon-stream.site"
    override var name = "Toonstream"
    override val hasMainPage = true
    override var lang = "hi"
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.Anime, TvType.Cartoon)

    private val baseHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
    )

    override val mainPage = mainPageOf(
        "series" to "Series",
        "category/movies" to "Movies",
        "category/cartoon" to "Cartoon",
        "category/anime" to "Animes"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = if (page > 1) "$mainUrl/${request.data}/page/$page" else "$mainUrl/${request.data}"
        val doc = app.get(url, headers = baseHeaders).document
        val items = doc.select("article").mapNotNull { it.toSearchResult() }
        val hasNext = doc.select("a.next").isNotEmpty()
        return newHomePageResponse(request.name, items, hasNext = hasNext)
    }

    private fun Element.toSearchResult(): SearchResponse? {
        val title = select("header > h2").text().replace("Watch Online", "").trim()
        if (title.isBlank()) return null
        val href = fixUrl(select("a").attr("href"))
        val posterRaw = select("div.post-thumbnail > figure > img").attr("src")
        val poster = if (posterRaw.startsWith("http")) posterRaw else "https:$posterRaw"
        val score = selectFirst("span.vote")?.ownText()
        return newMovieSearchResponse(title, href, TvType.Movie) {
            this.posterUrl = poster
            this.score = score?.let { Score.from10(it) }
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val url = "$mainUrl/?s=${java.net.URLEncoder.encode(query, "UTF-8")}"
        val doc = app.get(url, headers = baseHeaders).document
        return doc.select("article").mapNotNull { element ->
            val title = element.select("header > h2").text().replace("Watch Online", "").trim()
            if (title.isBlank()) return@mapNotNull null
            val href = fixUrl(element.select("a").attr("href"))
            val posterRaw = element.select("figure img").attr("src")
            val poster = if (posterRaw.startsWith("http")) posterRaw else "https:$posterRaw"
            val score = element.selectFirst("span.vote")?.ownText()
            newMovieSearchResponse(title, href, TvType.Movie) {
                this.posterUrl = poster
                this.score = score?.let { Score.from10(it) }
            }
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        val doc = app.get(url, headers = baseHeaders).document
        val title = doc.selectFirst("header.entry-header > h1")?.text()?.trim() ?: return null
        val poster = doc.selectFirst("article.post.single div.post-thumbnail img")?.let {
            val src = it.attr("src")
            if (src.startsWith("http")) src else "https:$src"
        } ?: ""
        val bgImg = doc.selectFirst("div.bghd > img")?.attr("src") ?: ""
        val plot = doc.selectFirst("div.description > p")?.text()
        val cast = doc.select("p.loadactor a").map { ActorData(Actor(it.text())) }

        val episodes = mutableListOf<Episode>()
        val epArticles = doc.select("article.episodes")
        if (epArticles.isNotEmpty()) {
            for (art in epArticles) {
                val epHref = art.selectFirst("a.lnk-blk")?.attr("href") ?: continue
                val epTitle = art.selectFirst("h5.entry-title1")?.text() ?: ""
                val epPoster = art.selectFirst("div.post-thumbnail2 img")?.attr("src") ?: ""
                val duration = art.selectFirst("span.duration")?.text()
                episodes.add(newEpisode(fixUrl(epHref)) {
                    this.name = epTitle
                    this.posterUrl = if (epPoster.startsWith("http")) epPoster else "https:$epPoster"
                    this.runTime = duration?.filter { it.isDigit() }?.toIntOrNull()
                })
            }
        }

        val movieLinks = doc.select("#movies-a > ul > li")
        for (li in movieLinks) {
            val epHref = li.selectFirst("a")?.attr("href") ?: continue
            val epTitle = li.text()
            episodes.add(newEpisode(fixUrl(epHref)) {
                this.name = epTitle
            })
        }

        return if (episodes.size > 1) {
            newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
                this.posterUrl = poster
                this.backgroundPosterUrl = bgImg
                this.plot = plot
                this.actors = cast
            }
        } else {
            newMovieLoadResponse(title, url, TvType.Movie, episodes.firstOrNull()?.data ?: url) {
                this.posterUrl = poster
                this.backgroundPosterUrl = bgImg
                this.plot = plot
                this.actors = cast
            }
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val doc = app.get(data, headers = baseHeaders).document
        val embedUrls = mutableListOf<String>()

        for (iframe in doc.select("#aa-options iframe")) {
            val src = iframe.attr("data-src").ifBlank { iframe.attr("src") }
            if (src.isBlank()) continue
            val fullUrl = if (src.startsWith("http")) src else "$mainUrl$src"
            embedUrls.add(fullUrl)
        }

        for (li in doc.select("#movies-a > ul > li, .episodes a.lnk-blk, #options-0 a")) {
            val href = li.attr("data-url").ifBlank { li.attr("href") }
            if (href.isNotBlank()) {
                val fullUrl = if (href.startsWith("http")) href else "$mainUrl$href"
                embedUrls.add(fullUrl)
            }
        }

        if (embedUrls.isEmpty()) return false

        val links = mutableSetOf<String>()
        for (embedUrl in embedUrls) {
            try {
                val embedDoc = app.get(embedUrl, headers = baseHeaders).document
                for (iframe in embedDoc.select("iframe[src]")) {
                    val src = iframe.attr("src")
                    if (src.startsWith("http") && !src.contains("youtube.com")) {
                        links.add(src)
                    }
                }
            } catch (_: Exception) {}
        }

        if (links.isEmpty()) return false

        var found = false
        try {
            coroutineScope {
                val results = links.map { link ->
                    async(Dispatchers.IO) {
                        try {
                            withContext(kotlinx.coroutines.NonCancellable) {
                                try {
                                    loadExtractor(link, data, subtitleCallback, callback)
                                } catch (e: Exception) {
                                    false
                                }
                            }
                        } catch (e: Exception) {
                            false
                        }
                    }
                }.awaitAll()
                found = results.any { it }
            }
        } catch (e: Exception) {
            Log.d("ToonStream", "loadLinks: ${e.message}")
        }
        return found
    }

    private fun fixUrl(href: String): String {
        return if (href.startsWith("http")) href else "$mainUrl$href"
    }
}
