package com.laddu100

import com.lagradost.api.Log
import com.lagradost.cloudstream3.DubStatus
import com.lagradost.cloudstream3.Episode
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.addEpisodes
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.mainPageOf
import com.lagradost.cloudstream3.newAnimeLoadResponse
import com.lagradost.cloudstream3.newAnimeSearchResponse
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.addDubStatus
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.loadExtractor
import org.jsoup.nodes.Element

class AnixTvProvider : MainAPI() {
    override var mainUrl = "https://anixtv.me"
    override var name = "AnixTV"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    private val TAG = "AnixTV"

    override val mainPage = mainPageOf(
        "updated-all" to "Updated All",
        "trending" to "Trending"
    )

    // ==================== getMainPage ====================

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        if (page > 1) return newHomePageResponse(request.name, emptyList())
        return try {
            val text = app.get(
                "$mainUrl/ajax/home/widget/${request.data}",
                headers = anixAjaxHeaders("$mainUrl/"),
                timeout = 30_000L
            ).text
            val html = parseJson<AjaxHtmlResult>(text).result ?: return newHomePageResponse(request.name, emptyList())
            val cards = org.jsoup.Jsoup.parse(html).select(".content-item .piece").mapNotNull { parseCard(it) }
            newHomePageResponse(request.name, cards)
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage failed: ${e.message}")
            newHomePageResponse(request.name, emptyList())
        }
    }

    // ==================== search ====================

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.length < 2) return emptyList()
        return try {
            val results = mutableListOf<SearchResponse>()
            val seen = mutableSetOf<String>()
            for (page in 1..5) {
                val text = app.get(
                    "$mainUrl/search?keyword=${urlEncode(query)}&page=$page",
                    headers = anixAjaxHeaders("$mainUrl/"),
                    timeout = 30_000L
                ).text
                val items = org.jsoup.Jsoup.parse(text).select(".content-item .piece")
                    .mapNotNull { parseCard(it) }
                if (items.isEmpty()) break
                val fresh = items.filter { seen.add(it.url) }
                if (fresh.isEmpty()) break
                results += fresh
                if (items.size < 30) break
            }
            results
        } catch (e: Exception) {
            Log.e(TAG, "search failed: ${e.message}")
            emptyList()
        }
    }

    // ==================== load ====================

    override suspend fun load(url: String): LoadResponse? {
        return try {
            val doc = app.get(url, headers = anixAjaxHeaders("$mainUrl/"), timeout = 30_000L).document
            val animeId = doc.selectFirst("div.watch-wrap")?.attr("data-id")?.takeIf { it.isNotBlank() }
                ?: return null

            val titleEl = doc.selectFirst(".ani-name")
            val title = titleEl?.text()?.takeIf { it.isNotBlank() } ?: return null
            val poster = doc.selectFirst(".poster img[src]")?.attr("src")
            val plot = doc.selectFirst(".description .short")?.text()?.takeIf { it.isNotBlank() }

            val tvType = when {
                doc.selectFirst("#ani-detail-info a[href*='/type/movie']") != null -> TvType.AnimeMovie
                doc.selectFirst("#ani-detail-info a[href*='/type/ova'], #ani-detail-info a[href*='/type/ona']") != null -> TvType.OVA
                else -> TvType.Anime
            }

            val (subEps, dubEps) = fetchEpisodes(animeId)

            newAnimeLoadResponse(title, url, tvType) {
                this.posterUrl = poster
                this.plot = plot
                if (subEps.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEps)
                if (dubEps.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEps)
            }
        } catch (e: Exception) {
            Log.e(TAG, "load failed: ${e.message}")
            null
        }
    }

    private suspend fun fetchEpisodes(animeId: String): Pair<List<Episode>, List<Episode>> {
        val sub = mutableListOf<Episode>()
        val dub = mutableListOf<Episode>()
        try {
            val vrf = generateVrf(animeId)
            val text = app.get(
                "$mainUrl/ajax/episode/list/$animeId?vrf=${urlEncode(vrf)}",
                headers = anixAjaxHeaders("$mainUrl/"),
                timeout = 60_000L
            ).text
            val html = parseJson<AjaxHtmlResult>(text).result ?: return Pair(sub, dub)

            data class EpRow(val num: Int, val mal: Int, val ids: String, val hasSub: Boolean, val hasDub: Boolean)
            val raw = mutableListOf<EpRow>()
            val malIds = mutableSetOf<Int>()
            org.jsoup.Jsoup.parse(html).select("a[data-ids]").forEach { el ->
                val num = el.attr("data-num").toIntOrNull() ?: return@forEach
                val ids = el.attr("data-ids")
                if (ids.isBlank()) return@forEach
                val mal = el.attr("data-mal").toIntOrNull() ?: 0
                if (mal > 0) malIds.add(mal)
                raw.add(EpRow(num, mal, ids, el.attr("data-sub") == "1", el.attr("data-dub") == "1"))
            }
            if (raw.isEmpty()) return Pair(sub, dub)

            val titles = if (malIds.isNotEmpty()) {
                JikanTitles.getTitles(malIds.first(), raw.size)
            } else emptyMap()

            for (row in raw.sortedBy { it.num }) {
                val epTitle = titles[row.num]?.takeIf { it.isNotBlank() } ?: "Episode ${row.num}"
                if (row.hasSub) sub.add(newEpisode("sub|${row.ids}") { this.episode = row.num; this.name = epTitle })
                if (row.hasDub) dub.add(newEpisode("dub|${row.ids}") { this.episode = row.num; this.name = epTitle })
            }
        } catch (e: Exception) {
            Log.e(TAG, "fetchEpisodes failed: ${e.message}")
        }
        return Pair(sub, dub)
    }

    // ==================== loadLinks ====================

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val parts = data.split("|")
        if (parts.size < 2 || parts[1].isBlank()) return false
        val type = parts[0] // "sub" or "dub"
        val serverIds = parts[1]

        var found = false
        try {
            val listText = app.get(
                "$mainUrl/ajax/server/list?servers=${urlEncode(serverIds)}",
                headers = anixAjaxHeaders("$mainUrl/"),
                timeout = 30_000L
            ).text
            val listHtml = parseJson<AjaxHtmlResult>(listText).result ?: return false
            val servers = org.jsoup.Jsoup.parse(listHtml)
                .select(".ani-server-type[data-type=\"$type\"] .server[data-link-id]")

            for (server in servers) {
                val linkId = server.attr("data-link-id")
                if (linkId.isBlank()) continue
                val serverName = server.selectFirst("span")?.text()?.trim()?.takeIf { it.isNotBlank() } ?: "Server"
                try {
                    val getText = app.get(
                        "$mainUrl/ajax/server?get=${urlEncode(linkId)}",
                        headers = anixAjaxHeaders("$mainUrl/"),
                        timeout = 30_000L
                    ).text
                    val embedUrl = parseJson<GetServerResponse>(getText).result?.url ?: continue
                    val resolved = resolveEmbed(embedUrl, serverName, subtitleCallback, callback)
                    if (resolved) found = true
                } catch (e: Exception) {
                    Log.e(TAG, "server $serverName failed: ${e.message}")
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks failed: ${e.message}")
        }
        return found
    }

    private suspend fun resolveEmbed(
        embedUrl: String,
        serverName: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        var emitted = false
        val localCallback: (ExtractorLink) -> Unit = { emitted = true; callback(it) }
        when {
            embedUrl.contains("megaplay") ->
                AnixTvMegaPlay(serverName).getUrl(embedUrl, "$mainUrl/", subtitleCallback, localCallback)
            embedUrl.contains("vidwish") ->
                AnixTvVidWish(serverName).getUrl(embedUrl, "$mainUrl/", subtitleCallback, localCallback)
            embedUrl.contains("vidtube") ->
                AnixTvVidPlay(serverName).getUrl(embedUrl, "$mainUrl/", subtitleCallback, localCallback)
            else -> {
                val loaded = try {
                    loadExtractor(embedUrl, "$mainUrl/", subtitleCallback, localCallback)
                } catch (e: Exception) {
                    Log.e(TAG, "loadExtractor failed: ${e.message}")
                    false
                }
                if (!loaded && !emitted) {
                    // Unknown host fallback
                    Log.e(TAG, "no extractor handled: $embedUrl")
                }
            }
        }
        return emitted
    }

    // ==================== helpers ====================

    private fun parseCard(el: Element): SearchResponse? {
        val href = el.selectFirst("a[href*='/watch/']")?.attr("href") ?: return null
        val titleEl = el.selectFirst(".ani-name") ?: return null
        val title = titleEl.text().takeIf { it.isNotBlank() }
            ?: titleEl.attr("data-jp").takeIf { it.isNotBlank() }
            ?: return null
        val poster = el.selectFirst("img[src]")?.attr("src")
        val typeText = el.selectFirst(".type, .abs-info .type, .ani-info")?.text() ?: ""
        val tvType = when {
            typeText.contains("Movie", true) -> TvType.AnimeMovie
            typeText.contains("OVA", true) || typeText.contains("ONA", true) -> TvType.OVA
            else -> TvType.Anime
        }
        val watchUrl = if (href.contains("/ep-")) href.substringBefore("/ep-") else href
        return newAnimeSearchResponse(title, watchUrl, tvType) {
            this.posterUrl = poster
            addDubStatus(dubExist = true, subExist = true)
        }
    }
}
