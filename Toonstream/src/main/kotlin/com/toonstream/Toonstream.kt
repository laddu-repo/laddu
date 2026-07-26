package com.toonstream

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.api.Log
import org.jsoup.nodes.Element

class Toonstream : MainAPI() {
    override var mainUrl = "https://toon-stream.site"
    override var name = "Toonstream"
    override val hasMainPage = true
    override var lang = "hi"
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.Anime, TvType.Cartoon)

    override val mainPage = mainPageOf(
        "series" to "Series",
        "category/movies" to "Movies",
        "category/cartoon" to "Cartoon",
        "category/anime" to "Animes"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = "$mainUrl/${request.data}?type=all&page=$page"
        val doc = app.get(url).document
        val items = doc.select("#movies-a > ul > li").mapNotNull { it.toSearchResult() }
        return newHomePageResponse(HomePageList(request.name, items, false), true)
    }

    private fun Element.toSearchResult(): SearchResponse? {
        val title = select("article > header > h2").text().replace("Watch Online", "").trim()
        if (title.isBlank()) return null
        val href = fixUrl(select("article > a").attr("href"))
        val posterRaw = select("article > div.post-thumbnail > figure > img").attr("src")
        val poster = if (posterRaw.startsWith("http")) posterRaw else "https:$posterRaw"
        val score = selectFirst("span.vote")?.ownText()
        return newMovieSearchResponse(title, href, TvType.Movie) {
            this.posterUrl = poster
            this.score = score?.let { Score.from10(it) }
        }
    }

    private fun Element.toSearch(): SearchResponse? {
        val title = select("article > header > h2").text().replace("Watch Online", "").trim()
        if (title.isBlank()) return null
        val href = fixUrl(select("article > a").attr("href"))
        val posterRaw = select("article figure img").attr("src")
        val poster = if (posterRaw.startsWith("http")) posterRaw else "https:$posterRaw"
        val score = selectFirst("span.vote")?.ownText()
        return newMovieSearchResponse(title, href, TvType.Movie) {
            this.posterUrl = poster
            this.score = score?.let { Score.from10(it) }
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val url = "$mainUrl/s?q=$query&type=all&page=1"
        val doc = app.get(url).document
        return doc.select("#movies-a > ul > li").mapNotNull { it.toSearch() }
    }

    override suspend fun load(url: String): LoadResponse? {
        val doc = app.get(url).document
        val title = doc.selectFirst("header.entry-header > h1")?.text()?.replace("Watch Online", "")?.trim() ?: return null
        val poster = doc.select("article.post.single div.post-thumbnail img").attr("src").let {
            if (it.startsWith("http")) it else "https:$it"
        }
        val bgPoster = doc.select("div.bghd > img").attr("src").let {
            if (it.startsWith("http")) it else "https:$it"
        }
        val plot = doc.selectFirst("div.description > p")?.text()?.trim()
        val cast = doc.select("p.loadactor a").map { ActorData(Actor(it.text())) }
        val duration = doc.select("span.duration").text()

        if (!url.contains("series")) {
            return newMovieLoadResponse(title, url, TvType.Movie, url) {
                this.posterUrl = poster
                this.backgroundPosterUrl = bgPoster
                this.plot = plot
                this.actors = cast
                this.duration = duration.filter { it.isDigit() }.toIntOrNull()
            }
        }

        val episodes = mutableListOf<Episode>()
        val seasonItems = doc.select("div.season-swiper-wrapper a[data-url]")
        for (seasonItem in seasonItems) {
            val seasonUrl = fixUrl(seasonItem.attr("data-url"))
            try {
                val seasonDoc = app.get(seasonUrl).document
                for (article in seasonDoc.select("article.episodes")) {
                    val epHref = article.selectFirst("a.lnk-blk")?.attr("href") ?: continue
                    val epUrl = fixUrl(epHref)
                    val epPoster = article.selectFirst("div.post-thumbnail2 img")?.attr("src")?.let {
                        fixUrl(it)
                    }
                    val epTitle = article.selectFirst("h5.entry-title1")?.text()?.trim() ?: ""
                    val numEpi = article.selectFirst("span.num-epi")?.text() ?: ""
                    val match = Regex("(\\d+)x(\\d+)").find(numEpi)
                    val season = match?.groupValues?.get(1)?.toIntOrNull()
                    val episode = match?.groupValues?.get(2)?.toIntOrNull()

                    episodes.add(newEpisode(epUrl) {
                        this.name = epTitle
                        this.posterUrl = epPoster
                        this.season = season
                        this.episode = episode
                    })
                }
            } catch (e: Exception) {
                Log.e("ToonStream", "Failed to load season: ${e.message}")
            }
        }

        return newTvSeriesLoadResponse(title, url, TvType.Anime, episodes) {
            this.posterUrl = poster
            this.backgroundPosterUrl = bgPoster
            this.plot = plot
            this.actors = cast
            this.duration = duration.filter { it.isDigit() }.toIntOrNull()
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val doc = app.get(data).document
        val iframes = doc.select("#aa-options iframe")
        iframes.amap { iframe ->
            val src = iframe.attr("src").ifBlank { iframe.attr("data-src") }
            if (src.isBlank()) return@amap
            val embedUrl = fixUrl(src)
            try {
                val embedDoc = app.get(embedUrl).document
                val innerIframe = embedDoc.selectFirst("iframe")
                if (innerIframe != null) {
                    val innerSrc = innerIframe.attr("src").ifBlank { innerIframe.attr("data-src") }
                    if (innerSrc.isNotBlank()) {
                        val finalUrl = fixUrl(innerSrc)
                        loadExtractor(finalUrl, subtitleCallback, callback)
                    }
                } else {
                    loadExtractor(embedUrl, subtitleCallback, callback)
                }
            } catch (e: Exception) {
                Log.e("ToonStream", "Failed to load $embedUrl")
            }
        }
        return true
    }

    private fun fixUrl(href: String): String {
        return if (href.startsWith("http")) href else "$mainUrl$href"
    }
}
