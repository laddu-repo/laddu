package com.laddu100

import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.DubStatus
import com.lagradost.cloudstream3.Episode
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.ShowStatus
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.addDubStatus
import com.lagradost.cloudstream3.addEpisodes
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.fixUrl
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newAnimeLoadResponse
import com.lagradost.cloudstream3.newAnimeSearchResponse
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import org.jsoup.Jsoup
import java.net.URLDecoder
import java.net.URLEncoder

class DesiDubAnimeProvider : MainAPI() {
    override var mainUrl = "https://www.desidubanime.me"
    override var name = "DesiDubAnime"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        "top-airing" to "Top Airing",
        "popular" to "Most Popular",
        "completed" to "Completed Series",
        "latest-episode" to "Latest Episode",
        "latest-movies" to "Latest Movies"
    )

    private val baseHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36",
        "Referer" to "$mainUrl/"
    )

    private val ajaxUrl = "$mainUrl/wp-admin/admin-ajax.php"
    private val apiUrl = "$mainUrl/wp-json/kiranime/v1"

    // ─────────────────────────────────────────────────────────────
    // JACKSON DATA CLASSES
    // ─────────────────────────────────────────────────────────────

    private data class EpisodesResponse(
        val success: Boolean = false,
        val data: EpisodesData? = null
    )

    private data class EpisodesData(
        val episodes: List<EpisodeData> = emptyList(),
        val max_episodes_page: Int = 1,
        val message: String? = null,
        val downloads: String? = null
    )

    private data class EpisodeData(
        val number: String = "",
        val thumbnail: String? = null,
        val parent_name: String = "",
        val parent_slug: String = "",
        val anime_id: String = "",
        val anime_type: String = "",
        val title: String? = null,
        val duration: String? = null,
        val released: String? = null,
        val id: Int = 0,
        val url: String = "",
        val post_title: String = "",
        val meta_number: String = ""
    )

    // ─────────────────────────────────────────────────────────────
    // HOMEPAGE — scrape homepage sections from HTML
    // ─────────────────────────────────────────────────────────────

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val sectionName = request.name
        if (page > 1) return newHomePageResponse(sectionName, emptyList())
        val document = try {
            app.get(mainUrl, headers = baseHeaders).document
        } catch (e: Exception) {
            Log.d("DesiDubAnime", "getMainPage error: ${e.message}")
            return newHomePageResponse(sectionName, emptyList())
        }

        // The homepage has sections identified by <h2> headings. The heading and
        // the card container are siblings inside a parent <div>. We find the h2
        // matching the section name, then grab its parent and extract all anime
        // links from within.
        //
        // Two card formats exist on the site:
        //   1. <article class="anime-card"> — used by Latest Episode / Latest Movies
        //      (links to /watch/<slug>-episode-N/)
        //   2. <ul><li> list — used by Top Airing / Most Popular / Completed Series
        //      (links directly to /anime/<slug>/)

        val h2 = document.select("h2").firstOrNull { el ->
            el.text().trim().contains(sectionName, ignoreCase = true)
        } ?: run {
            Log.d("DesiDubAnime", "homepage: section '$sectionName' heading not found")
            return newHomePageResponse(sectionName, emptyList())
        }

        // Get the parent container that holds both the heading and the cards.
        val container = h2.parent() ?: run {
            Log.d("DesiDubAnime", "homepage: no parent for h2")
            return newHomePageResponse(sectionName, emptyList())
        }

        val home = mutableListOf<SearchResponse>()
        val seenUrls = mutableSetOf<String>()

        // Format 1: anime-card articles (Latest Episode / Latest Movies)
        container.select("article.anime-card").forEach { card ->
            val watchHref = card.selectFirst("a[href*='/watch/']")?.attr("href") ?: return@forEach
            val animeUrl = watchUrlToAnimeUrl(watchHref) ?: return@forEach
            if (!seenUrls.add(animeUrl)) return@forEach
            val title = card.selectFirst("img")?.attr("alt")?.trim()?.ifEmpty { null }
                ?: card.selectFirst("h3")?.text()?.trim()
                ?: return@forEach
            val poster = card.selectFirst("img")?.let {
                it.attr("data-src").ifEmpty { it.attr("src") }
            } ?: ""
            val badges = card.select("span.inline-flex").map { it.text().trim() }
            val isMovie = badges.any { it.contains("movie", ignoreCase = true) }
            val hasDub = badges.any { it.contains("dub", ignoreCase = true) }
            val hasSub = badges.any { it.contains("sub", ignoreCase = true) }
            val tvType = if (isMovie) TvType.AnimeMovie else TvType.Anime
            home.add(newAnimeSearchResponse(title, animeUrl, tvType) {
                this.posterUrl = poster
                addDubStatus(dubExist = hasDub, subExist = hasSub || hasDub)
            })
        }

        // Format 2: <ul><li> list items (Top Airing / Most Popular / Completed Series)
        container.select("li a[href*='/anime/']").forEach { a ->
            val animeUrl = a.attr("href").ifBlank { return@forEach }
            if (!seenUrls.add(animeUrl)) return@forEach
            val title = a.attr("title").trim().ifEmpty { a.text().trim() }.ifEmpty { return@forEach }
            // Find the poster image — walk up to the <li> and find an <img>
            val poster = a.selectFirst("img")?.let {
                it.attr("data-src").ifEmpty { it.attr("src") }
            } ?: a.parent()?.selectFirst("img")?.let {
                it.attr("data-src").ifEmpty { it.attr("src") }
            } ?: ""
            home.add(newAnimeSearchResponse(title, animeUrl, TvType.Anime) {
                this.posterUrl = poster
                addDubStatus(dubExist = true, subExist = true)
            })
        }

        Log.d("DesiDubAnime", "homepage $sectionName: ${home.size} items")
        return newHomePageResponse(sectionName, home)
    }

    // ─────────────────────────────────────────────────────────────
    // SEARCH — wp-json/kiranime/v1/anime/search?query=
    // ─────────────────────────────────────────────────────────────

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        val response = try {
            app.get(
                "$apiUrl/anime/search?query=${URLEncoder.encode(query, "UTF-8")}",
                headers = baseHeaders + mapOf("Accept" to "application/json")
            ).parsedSafe<SearchResult>()
        } catch (e: Exception) {
            Log.d("DesiDubAnime", "search error: ${e.message}")
            return emptyList()
        }

        val html = response?.result ?: return emptyList()
        val doc = Jsoup.parse(html)
        return doc.select("a[href*='/anime/']").mapNotNull { el ->
            val href = el.attr("href").ifBlank { return@mapNotNull null }
            val title = el.selectFirst("img")?.attr("alt")?.trim()?.ifEmpty { null }
                ?: el.selectFirst("h3")?.text()?.trim()
                ?: return@mapNotNull null
            val poster = el.selectFirst("img")?.let {
                it.attr("data-src").ifEmpty { it.attr("src") }
            } ?: ""
            val typeText = el.selectFirst("span.uppercase")?.text()?.lowercase() ?: ""
            val tvType = if (typeText.contains("movie")) TvType.AnimeMovie else TvType.Anime

            newAnimeSearchResponse(title, href, tvType) {
                this.posterUrl = poster
                addDubStatus(dubExist = true, subExist = true)
            }
        }
    }

    private data class SearchResult(val result: String = "")

    // ─────────────────────────────────────────────────────────────
    // LOAD — fetch anime page, extract anime_id, fetch episodes via admin-ajax
    // ─────────────────────────────────────────────────────────────

    override suspend fun load(url: String): LoadResponse? {
        val doc = try {
            app.get(url, headers = baseHeaders).document
        } catch (e: Exception) {
            Log.d("DesiDubAnime", "load error: ${e.message}")
            return null
        }

        // Use the main image alt attribute for a clean title (h1 has two
        // language spans that would duplicate the name via .text()).
        val title = doc.selectFirst(".anime-main-image")?.attr("alt")?.trim()
            ?: doc.selectFirst("h1 span")?.text()?.trim()
            ?: doc.selectFirst("h1")?.text()?.trim()
            ?: return null
        val poster = doc.selectFirst(".anime-main-image")?.attr("src")
        val plot = doc.selectFirst("meta[name=description]")?.attr("content")

        // Extract anime_id from data-season attribute on #seasonContent
        val animeId = doc.selectFirst("#seasonContent")?.attr("data-season")
            ?: return null

        // Extract genres, year, status, type from meta
        val genres = doc.select("a[href*='/genre/']").map { it.text().trim() }
            .filter { it.isNotBlank() }.distinct()

        // Determine TV type from the page
        val typeText = doc.selectFirst(".anime-type, span.uppercase")?.text()?.lowercase() ?: ""
        val tvType = when {
            typeText.contains("movie") -> TvType.AnimeMovie
            typeText.contains("ova") || typeText.contains("special") -> TvType.OVA
            else -> TvType.Anime
        }

        // Determine show status
        val statusText = doc.selectFirst(".anime-status, .badge")?.text()?.lowercase() ?: ""
        val showStatus = when {
            statusText.contains("completed") || statusText.contains("finished") -> ShowStatus.Completed
            statusText.contains("airing") || statusText.contains("ongoing") -> ShowStatus.Ongoing
            else -> null
        }

        // Fetch episodes via admin-ajax (paginated, fetch all pages)
        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()
        var currentPage = 1
        var maxPage = 1

        while (currentPage <= maxPage) {
            val epsResponse = try {
                app.get(
                    "$ajaxUrl?action=get_episodes&anime_id=$animeId&page=$currentPage&order=asc",
                    headers = baseHeaders
                ).parsedSafe<EpisodesResponse>()
            } catch (e: Exception) {
                Log.d("DesiDubAnime", "get_episodes page=$currentPage error: ${e.message}")
                break
            }

            val data = epsResponse?.data ?: break
            if (currentPage == 1) maxPage = data.max_episodes_page

            for (ep in data.episodes) {
                val epNum = ep.meta_number.toIntOrNull() ?: ep.id
                val epTitle = ep.title?.takeIf { it.isNotBlank() }
                val epThumb = ep.thumbnail
                val watchUrl = ep.url

                // Data string: $mainUrl|$watchUrl|$type
                // type = "sub" or "dub" — loadLinks fetches the watch page and parses the section.
                val subData = "$mainUrl|$watchUrl|sub"
                val dubData = "$mainUrl|$watchUrl|dub"

                // This is a dub-focused site — most episodes have dub.
                // We expose both sub and dub; loadLinks will check which sections exist.
                subEpisodes.add(newEpisode(subData) {
                    this.name = epTitle
                    this.episode = epNum
                    this.posterUrl = epThumb
                })
                dubEpisodes.add(newEpisode(dubData) {
                    this.name = epTitle
                    this.episode = epNum
                    this.posterUrl = epThumb
                })
            }

            if (currentPage >= maxPage) break
            currentPage++
        }

        Log.d("DesiDubAnime", "load $title: ${subEpisodes.size} sub, ${dubEpisodes.size} dub eps")

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = poster
            this.plot = plot
            this.tags = genres
            this.showStatus = showStatus
            if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
            if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
        }
    }

    // ─────────────────────────────────────────────────────────────
    // LOAD LINKS — parse SUB/DUB sections from watch page, decode embed IDs
    // ─────────────────────────────────────────────────────────────

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // Data: $mainUrl|$watchUrl|$type
        val parts = data.split("|")
        if (parts.size < 3) return false
        val watchUrl = parts[1]
        val type = parts[2]  // "sub" or "dub"

        Log.d("DesiDubAnime", "loadLinks: $watchUrl type=$type")

        val doc = try {
            app.get(watchUrl, headers = baseHeaders).document
        } catch (e: Exception) {
            Log.d("DesiDubAnime", "loadLinks watch page error: ${e.message}")
            return false
        }

        // Find the correct section: player-selection player-sub or player-selection player-dub
        val sectionClass = if (type == "dub") "player-selection player-dub" else "player-selection player-sub"
        val section = doc.selectFirst("div.$sectionClass")
            ?: doc.selectFirst("div[class*=$sectionClass]")
            ?: run {
                // Fallback: if the requested section doesn't exist, try the other one
                // (some episodes only have dub, some only have sub)
                val fallbackClass = if (type == "dub") "player-selection player-sub" else "player-selection player-dub"
                doc.selectFirst("div.$fallbackClass")
                    ?: doc.selectFirst("div[class*=$fallbackClass]")
                    ?: return false
            }

        // Extract all data-embed-id attributes from this section
        val embedSources = section.select("[data-embed-id]").mapNotNull { el ->
            val embedId = el.attr("data-embed-id").ifBlank { return@mapNotNull null }
            val displayName = el.text().trim()
            decodeEmbedId(embedId, displayName)
        }

        Log.d("DesiDubAnime", "found ${embedSources.size} embed sources for type=$type")

        var found = false
        val typeLabel = type.replaceFirstChar { it.uppercase() }

        for (src in embedSources) {
            Log.d("DesiDubAnime", "resolving ${src.name}: ${src.url}")
            val label = "DesiDubAnime - ${src.name} ($typeLabel)"

            try {
                when {
                    // Abyss player — dedicated extractor via enc-dec.app API
                    src.url.contains("abyssplayer.com") || src.url.contains("abyss.to") -> {
                        DesiDubAbyss().apply { name = label }.getUrl(
                            src.url, watchUrl, subtitleCallback, callback
                        )
                        found = true
                    }
                    // Mirror, PlayerX, Ruby, Cloud, and any others — try loadExtractor first
                    else -> {
                        val loaded = loadExtractor(src.url, watchUrl, subtitleCallback, callback)
                        if (loaded) {
                            found = true
                        } else {
                            // WebView fallback: render the page and intercept m3u8/mp4
                            DesiDubWebView(label, src.url).getUrl(
                                src.url, watchUrl, subtitleCallback, callback
                            )
                            found = true
                        }
                    }
                }
            } catch (e: Exception) {
                Log.d("DesiDubAnime", "resolve ${src.name} error: ${e.message}")
            }
        }

        Log.d("DesiDubAnime", "loadLinks $watchUrl type=$type: found=$found")
        return found
    }

    // ─────────────────────────────────────────────────────────────
    // HELPERS
    // ─────────────────────────────────────────────────────────────

    /**
     * Decodes a data-embed-id attribute.
     * Format: base64(name):base64(url)
     * Some Ruby sources have HTML iframe code instead of a plain URL — extract the SRC.
     */
    private data class EmbedSource(val name: String, val url: String)

    private fun decodeEmbedId(embedId: String, displayName: String): EmbedSource? {
        return try {
            val parts = embedId.split(":")
            if (parts.size < 2) return null
            val name = String(android.util.Base64.decode(parts[0], android.util.Base64.DEFAULT), Charsets.UTF_8)
            val decoded = String(android.util.Base64.decode(parts[1], android.util.Base64.DEFAULT), Charsets.UTF_8)

            // If the decoded content is HTML (Ruby source), extract the iframe SRC
            val url = if (decoded.contains("<iframe") || decoded.contains("<IFRAME")) {
                val srcMatch = Regex("""(?i)src=["']([^"']+)["']""").find(decoded)
                srcMatch?.groupValues?.get(1) ?: return null
            } else {
                decoded
            }

            if (url.isBlank()) return null
            EmbedSource(displayName.ifBlank { name }, url)
        } catch (e: Exception) {
            Log.d("DesiDubAnime", "decodeEmbedId error: ${e.message}")
            null
        }
    }

    /**
     * Converts a watch URL (/watch/<slug>-episode-N/) to an anime URL (/anime/<slug>/).
     * Strips "-episode-N" from the slug.
     */
    private fun watchUrlToAnimeUrl(watchUrl: String): String? {
        val slug = watchUrl.substringAfter("/watch/", "")
            .replace(Regex("-episode-\\d+.*"), "")
            .trim()
        return if (slug.isEmpty()) null else "$mainUrl/anime/$slug/"
    }
}
