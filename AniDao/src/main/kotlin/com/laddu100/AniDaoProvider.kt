package com.laddu100

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
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import org.jsoup.nodes.Document
import java.net.URL
import java.net.URLDecoder

class AniDaoProvider : MainAPI() {
    override var mainUrl = "https://anidao.to"
    override var name = "AniDao"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        "trending" to "Top Trending",
        "recent" to "Recent Added",
        "ongoing" to "Ongoing Anime"
    )

    private val baseHeaders = mapOf("Referer" to "$mainUrl/")

    // The homepage feeds every section, so cache the parsed document briefly.
    @Volatile
    private var homeCache: Document? = null
    private var homeTime = 0L
    private val homeTtl = 5 * 60 * 1000L

    // Search index over the full animelist catalog, rebuilt when stale.
    private data class AnimeEntry(val url: String, val title: String, val poster: String)
    @Volatile
    private var indexCache: List<AnimeEntry>? = null
    private var indexTime = 0L
    private val indexTtl = 15 * 60 * 1000L

    private val listBatch = 20
    private val maxListPages = 120
    private val maxSearchResults = 80

    private val m3u8Regex = Regex("""https?://[^\s"']+\.m3u8[^\s"']*""")

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        if (page > 1) return newHomePageResponse(request.name, emptyList())

        val doc = homeDocument()
        val sectionId = when (request.data) {
            "trending" -> "an-top-trending-title"
            "recent" -> "an-recent-added-title"
            "ongoing" -> "an-ongoing-title"
            else -> return newHomePageResponse(request.name, emptyList())
        }
        val section = doc.selectFirst("""section[aria-labelledby="$sectionId"]""")
            ?: return newHomePageResponse(request.name, emptyList())

        val home = mutableListOf<SearchResponse>()
        for (item in section.select(".an-home-list-item, article.an-anime-card")) {
            val href = item.attr("href").ifEmpty {
                item.selectFirst("""a[href*="/watch-online/"]""")?.attr("href") ?: ""
            }
            if (!href.contains("/watch-online/")) continue
            val title = item.selectFirst("[data-an-name-en]")?.attr("data-an-name-en")?.trim()
                ?.ifEmpty { null }
                ?: item.selectFirst("img")?.attr("alt")?.trim()?.ifEmpty { null }
                ?: item.selectFirst(".an-anime-card__title a")?.text()?.trim()?.ifEmpty { null }
                ?: item.selectFirst("strong")?.text()?.trim()?.ifEmpty { null }
                ?: continue
            val poster = item.selectFirst("img")?.let {
                it.attr("data-src").ifEmpty { it.attr("src") }
            } ?: ""

            home.add(newAnimeSearchResponse(title, fixUrl(toAnimePath(href)), TvType.Anime) {
                this.posterUrl = poster
                addDubStatus(dubExist = true, subExist = true)
            })
        }
        Log.d("AniDao", "homepage ${request.name}: ${home.size} items")
        return newHomePageResponse(request.name, home)
    }

    private suspend fun homeDocument(): Document {
        val now = System.currentTimeMillis()
        val cached = homeCache
        if (cached != null && now - homeTime < homeTtl) return cached
        val doc = app.get(mainUrl, headers = baseHeaders).document
        homeCache = doc
        homeTime = now
        return doc
    }

    // /search is behind Cloudflare, so we scrape the animelist catalog and filter locally.
    override suspend fun search(query: String): List<SearchResponse> {
        val q = query.lowercase().trim()
        if (q.isEmpty()) return emptyList()
        val index = currentIndex()
        return index.asSequence()
            .filter { it.title.lowercase().contains(q) }
            .take(maxSearchResults)
            .map { e ->
                newAnimeSearchResponse(e.title, e.url, TvType.Anime) {
                    this.posterUrl = e.poster
                    addDubStatus(dubExist = true, subExist = true)
                }
            }
            .toList()
    }

    private suspend fun currentIndex(): List<AnimeEntry> {
        val now = System.currentTimeMillis()
        val cached = indexCache
        if (cached != null && now - indexTime < indexTtl) return cached
        val built = buildIndex()
        indexCache = built
        indexTime = now
        return built
    }

    private suspend fun buildIndex(): List<AnimeEntry> {
        val results = mutableListOf<AnimeEntry>()
        val seen = mutableSetOf<String>()
        var start = 1
        while (start <= maxListPages) {
            val end = minOf(start + listBatch - 1, maxListPages)
            val batch = coroutineScope {
                (start..end).map { p -> async { parseListPage(p) } }.awaitAll()
            }
            var added = 0
            for (entries in batch) {
                for (e in entries) {
                    if (seen.add(e.url)) {
                        results.add(e)
                        added++
                    }
                }
            }
            Log.d("AniDao", "index pages $start..$end: +$added entries (total ${results.size})")
            if (added == 0) break
            start = end + 1
        }
        return results
    }

    private suspend fun parseListPage(page: Int): List<AnimeEntry> {
        return try {
            val doc = app.get("$mainUrl/animelist?page=$page", headers = baseHeaders).document
            doc.select("article.an-anime-card").mapNotNull { card ->
                val a = card.selectFirst("""a[href*="/anime/"]""") ?: return@mapNotNull null
                val url = fixUrl(a.attr("href"))
                val title = a.attr("title").trim().ifEmpty {
                    card.selectFirst(".an-anime-card__title a")?.text()?.trim() ?: return@mapNotNull null
                }
                val poster = card.selectFirst("img")?.let {
                    it.attr("data-src").ifEmpty { it.attr("src") }
                } ?: ""
                AnimeEntry(url, title, poster)
            }
        } catch (_: Exception) {
            emptyList()
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        val doc = app.get(url, headers = baseHeaders).document

        val titleEl = doc.selectFirst("h1.an-section__title")
        val title = titleEl?.attr("data-an-name-en")?.trim()?.ifEmpty { null }
            ?: titleEl?.text()?.trim()
            ?: return null
        val jpName = titleEl?.attr("data-an-name-jp")?.trim()?.ifEmpty { null }
        val posterUrl = doc.selectFirst(".an-detail-hero__poster img")?.attr("src")
        val plot = doc.selectFirst(".an-detail-hero__content > p")?.text()?.trim()

        val metaSpans = doc.select(".an-detail-meta span")
        val year = metaSpans.firstOrNull { it.text().startsWith("Year:") }
            ?.text()?.removePrefix("Year:")?.trim()?.toIntOrNull()
        val tags = doc.select("a.an-genre-chip").map { it.text().trim() }.filter { it.isNotEmpty() }

        val statusStr = doc.selectFirst(".an-badge--status")?.text()?.trim()
        val showStatus = when (statusStr?.lowercase()) {
            "currently airing", "ongoing" -> ShowStatus.Ongoing
            "finished airing", "completed" -> ShowStatus.Completed
            else -> null
        }

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()
        val seenEps = mutableSetOf<String>()
        var epRows = doc.select("""[data-an-panel="oldest"] article.an-episode-row""")
        if (epRows.isEmpty()) epRows = doc.select("article.an-episode-row")
        // The list renders newest-first in the DOM, so walk it backwards to
        // expose episodes in ascending order.
        val orderedRows = epRows.reversed()

        for (row in orderedRows) {
            val link = row.selectFirst("""a[href*="/watch-online/"]""") ?: continue
            val href = fixUrl(link.attr("href"))
            if (!seenEps.add(href)) continue

            val titleText = row.selectFirst(".an-episode-row__title a")?.text()?.trim() ?: ""
            val epNum = Regex("-episode-(\\d+)").find(href)?.groupValues?.get(1)?.toIntOrNull()
            // Strip trailing "Episode N" and leading "N " prefix that the site adds to titles.
            val epName = titleText
                .replace(Regex("\\s*[Ee]pisode\\s*\\d+\\s*$"), "")
                .replace(Regex("^\\d+\\s+"), "")
                .trim()
                .ifEmpty { null }

            val hasHsub = row.select(".an-badge--hsub").isNotEmpty()
            val hasSub = row.select(".an-badge--sub").isNotEmpty()
            val hasDub = row.select(".an-badge--dub").isNotEmpty()

            // Encode the requested DubStatus into the episode data string so that
            // loadLinks() can fetch only the matching panel (sub/hsub for Subbed
            // tab, dub for Dubbed tab). This is what makes Sub/Dub separation work.
            // Hardsub streams live in their own "hsub" panel on the watch page,
            // but we surface them in the Subbed tab (with a clear "(Hardsub)"
            // label) because that's where users expect to find them.
            if (hasSub || hasHsub) {
                subEpisodes.add(newEpisode("$href|sub") {
                    this.name = epName
                    this.episode = epNum
                })
            }
            if (hasDub) {
                dubEpisodes.add(newEpisode("$href|dub") {
                    this.name = epName
                    this.episode = epNum
                })
            }
        }

        Log.d("AniDao", "load $title: ${subEpisodes.size} sub, ${dubEpisodes.size} dub eps")
        // Always expose as Anime so the Subbed/Dubbed tabs render.
        return newAnimeLoadResponse(title, url, TvType.Anime) {
            this.posterUrl = posterUrl
            this.year = year
            this.plot = plot
            this.tags = tags
            this.showStatus = showStatus
            if (jpName != null) this.japName = jpName
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
        // Data string is "$watchUrl|$type" where type is "sub" or "dub".
        // Hardsub is part of the Subbed tab (merged), per user requirement.
        val parts = data.split("|")
        val watchUrl = parts[0]
        val type = parts.getOrElse(1) { "sub" }

        val doc = fetchWatchDoc(watchUrl)
        var found = false

        // Subbed tab → fetch hsub + sub panels (hardsub is merged into Subbed).
        // Dubbed tab → fetch only the dub panel.
        // This is THE fix for "sub and dub separation not working" and
        // "hardsubs too loads in dub" — each tab now only returns its own sources.
        val panels = if (type == "dub") {
            listOf("dub" to SourceKind.DUB)
        } else {
            listOf("hsub" to SourceKind.HARDSUB, "sub" to SourceKind.SUB)
        }

        for ((panel, kind) in panels) {
            val section = doc.selectFirst("""[data-an-panel="$panel"]""") ?: continue
            for (btn in section.select("button[data-an-video]")) {
                val embed = btn.attr("data-an-video")
                if (embed.isEmpty()) continue
                val label = "AniDao - ${domainName(embed)} (${kind.label})"
                passSubtitle(embed, subtitleCallback)
                if (resolveEmbed(embed, watchUrl, label, subtitleCallback, callback)) {
                    found = true
                }
            }
        }
        Log.d("AniDao", "loadLinks $data type=$type: found=$found")
        return found
    }

    private enum class SourceKind(val label: String) {
        SUB("Sub"), DUB("Dub"), HARDSUB("Hardsub")
    }

    /**
     * Fetches the watch-online page. AniDao has a known soft-404 quirk where
     * episode 1 of long-running anime (e.g. One Piece) is linked as
     * `/watch-online/one-piece-100-episode-1` but that URL returns a "not found"
     * page (HTTP 200 with an error body). The real URL is
     * `/watch-online/one-piece-episode-1`. Detect the soft-404 (no source
     * panels present) and retry with the `-100-` segment stripped from the slug.
     */
    private suspend fun fetchWatchDoc(url: String): Document {
        val doc = app.get(url, headers = baseHeaders).document
        val hasPanels = doc.selectFirst(
            """[data-an-panel="sub"], [data-an-panel="dub"], [data-an-panel="hsub"]"""
        ) != null
        if (hasPanels) return doc

        // Soft-404 fallback: strip a stray "-100-" segment that some episode-1
        // URLs carry (e.g. one-piece-100-episode-1 → one-piece-episode-1).
        val altUrl = url.replace(Regex("-100-episode-"), "-episode-")
        if (altUrl != url) {
            Log.d("AniDao", "fetchWatchDoc: soft-404 fallback $url -> $altUrl")
            val altDoc = app.get(altUrl, headers = baseHeaders).document
            if (altDoc.selectFirst(
                    """[data-an-panel="sub"], [data-an-panel="dub"], [data-an-panel="hsub"]"""
                ) != null
            ) {
                return altDoc
            }
        }
        return doc
    }

    private suspend fun resolveEmbed(
        embedUrl: String,
        referer: String,
        label: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return try {
            when {
                embedUrl.contains("vivibebe.site") || embedUrl.contains("bibiemb.xyz") -> {
                    val html = app.get(embedUrl, headers = baseHeaders).text
                    val m3u8 = m3u8Regex.find(html)?.value
                    if (m3u8 != null) {
                        callback(m3u8Link(label, m3u8, embedUrl))
                        true
                    } else false
                }
                embedUrl.contains("otakuhg.site") || embedUrl.contains("otakuvid.online") -> {
                    val html = app.get(embedUrl, headers = baseHeaders).text
                    var m3u8 = m3u8Regex.find(html)?.value
                    if (m3u8 == null) {
                        val unpacked = JsPacker.parseAndUnpack(html)
                        if (unpacked != null) m3u8 = m3u8Regex.find(unpacked)?.value
                    }
                    if (m3u8 != null) {
                        callback(m3u8Link(label, m3u8, embedUrl))
                        true
                    } else false
                }
                embedUrl.contains("playmogo.com") -> {
                    loadExtractor(embedUrl, referer, subtitleCallback, callback)
                }
                else -> {
                    val loaded = loadExtractor(embedUrl, referer, subtitleCallback, callback)
                    if (loaded) true
                    else {
                        val html = app.get(embedUrl, headers = baseHeaders).text
                        val m3u8 = m3u8Regex.find(html)?.value
                        if (m3u8 != null) {
                            callback(m3u8Link(label, m3u8, embedUrl))
                            true
                        } else false
                    }
                }
            }
        } catch (e: Exception) {
            Log.d("AniDao", "resolveEmbed failed $embedUrl: ${e.message}")
            false
        }
    }

    private suspend fun m3u8Link(label: String, m3u8: String, referer: String) = newExtractorLink(
        source = name,
        name = label,
        url = m3u8,
        type = ExtractorLinkType.M3U8
    ) {
        this.headers = mapOf("Referer" to referer)
    }

    private fun passSubtitle(embedUrl: String, subtitleCallback: (SubtitleFile) -> Unit) {
        try {
            val query = URL(embedUrl).query ?: return
            val sub = Regex("""(?:sub|caption_1|c1_file)=([^&]+)""").find(query)?.groupValues?.get(1)
                ?: return
            val decoded = URLDecoder.decode(sub, "UTF-8")
            val label = Regex("""(?:sub_1|c1_label)=([^&]+)""").find(query)?.groupValues?.get(1)
                ?.let { URLDecoder.decode(it, "UTF-8") } ?: "English"
            subtitleCallback.invoke(SubtitleFile(label, decoded))
        } catch (_: Exception) {
        }
    }

    private fun domainName(url: String): String {
        return try {
            URL(url).host.substringBefore(".")
        } catch (_: Exception) {
            "unknown"
        }
    }

    private fun toAnimePath(watchHref: String): String {
        val slug = watchHref.substringAfter("/watch-online/", "")
            // Strip "-episode-N" and any stray "-100-" segment that episode-1
            // URLs carry on AniDao (e.g. one-piece-100-episode-1 → one-piece).
            .replace(Regex("-100-episode-\\d+.*"), "")
            .replace(Regex("-episode-\\d+.*"), "")
            .trim()
        return if (slug.isEmpty()) watchHref else "/anime/$slug"
    }
}

// Unpacks eval(function(p,a,c,k,e,d){...}) payloads used by otakuhg.site / otakuvid.online embeds.
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
