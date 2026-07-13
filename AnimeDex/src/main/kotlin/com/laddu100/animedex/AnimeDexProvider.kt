package com.laddu100.animedex

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.newSubtitleFile
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope

private const val TAG = "AnimeDex"
private const val API_BASE = "https://animedex.fun"
private const val ANILIST_URL = "https://graphql.anilist.co"
private const val TIMEOUT = 30_000L

class AnimeDexProvider : MainAPI() {
    override var mainUrl = API_BASE
    override var name = "AnimeDex"
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

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36",
        "Accept" to "application/json, text/plain, */*",
        "Accept-Language" to "en-US,en;q=0.9",
        "Origin" to API_BASE
    )

    private fun anilistHeaders(): Map<String, String> = mapOf(
        "Content-Type" to "application/json",
        "Accept" to "application/json",
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"
    )

    private fun streamHeaders(): Map<String, String> = headers + mapOf(
        "Content-Type" to "application/json"
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

        val hasDub = checkDubAvailability(anilistId)

        val subEps = mutableListOf<Episode>()
        val dubEps = mutableListOf<Episode>()

        if (isMovie) {
            val epData = EpisodeData(anilistId, 1, "sub", true, title).toJson()
            subEps.add(newEpisode(epData) {
                this.name = title
            })
            if (hasDub) {
                val dubEpData = EpisodeData(anilistId, 1, "dub", true, title).toJson()
                dubEps.add(newEpisode(dubEpData) {
                    this.name = title
                })
            }
        } else {
            if (epCount > 0) {
                for (ep in 1..epCount) {
                    val subData = EpisodeData(anilistId, ep, "sub", false, title).toJson()
                    subEps.add(newEpisode(subData) {
                        this.episode = ep
                        this.name = "Episode $ep"
                    })
                }
                if (hasDub) {
                    for (ep in 1..epCount) {
                        val dubData = EpisodeData(anilistId, ep, "dub", false, title).toJson()
                        dubEps.add(newEpisode(dubData) {
                            this.episode = ep
                            this.name = "Episode $ep"
                        })
                    }
                }
            } else {
                val subData = EpisodeData(anilistId, 1, "sub", false, title).toJson()
                subEps.add(newEpisode(subData) {
                    this.episode = 1
                    this.name = "Episode 1"
                })
            }
        }

        val tvType = if (isMovie && hasDub) TvType.Anime else if (isMovie) TvType.AnimeMovie else TvType.Anime

        return newAnimeLoadResponse(title, url, tvType) {
            this.posterUrl = poster
            this.plot = plot
            this.tags = genres
            this.year = year
            addEpisodes(DubStatus.Subbed, subEps)
            addEpisodes(DubStatus.Dubbed, dubEps)
        }
    }

    private suspend fun checkDubAvailability(anilistId: Int): Boolean {
        val sources = listOf("anivexa", "luna", "anidap")
        for (source in sources) {
            val hasIt = try {
                val body = when (source) {
                    "anivexa" -> mapOf(
                        "anilistId" to anilistId,
                        "ep" to 1,
                        "lang" to "dub",
                        "provider" to "anineko"
                    )
                    "luna" -> mapOf(
                        "provider" to "anineko",
                        "anilistId" to anilistId,
                        "ep" to 1,
                        "subType" to "dub"
                    )
                    else -> mapOf(
                        "action" to "sources",
                        "anilistId" to anilistId,
                        "ep" to 1,
                        "lang" to "dub",
                        "provider" to "anineko"
                    )
                }
                val resp = app.post(
                    "$API_BASE/api/stream/$source",
                    headers = streamHeaders(),
                    json = body,
                    timeout = TIMEOUT
                ).text
                val parsed = parseJson<StreamResponse>(resp)
                !parsed.sources.isNullOrEmpty()
            } catch (e: Exception) {
                Log.d(TAG, "dub check $source failed: ${e.message}")
                false
            }
            if (hasIt) return true
        }
        return false
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
        val title = epData.title

        Log.d(TAG, "loadLinks: al=$anilistId ep=$epNum lang=$lang")

        var found = false

        coroutineScope {
            val jobs = listOf(
                async { fetchAnidap(anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchAnivexa(anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchLuna(anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchMiruro(anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchAnimelok(anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchAllmanga(title, anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchZen(title, epNum, lang, callback, subtitleCallback) },
                async { fetchKickass(title, epNum, lang, callback, subtitleCallback) },
                async { fetchHindianime(title, epNum, lang, callback, subtitleCallback) },
                async { fetchKitty(anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchMfapi(anilistId, epNum, lang, callback, subtitleCallback) },
                async { fetchCrysoline(anilistId, epNum, lang, callback, subtitleCallback) }
            )
            val results = jobs.awaitAll()
            found = results.any { it }
        }

        Log.d(TAG, "loadLinks done: found=$found")
        return found
    }

    private suspend fun fetchAnidap(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val body = mapOf(
                "action" to "sources",
                "anilistId" to anilistId,
                "ep" to ep,
                "lang" to lang,
                "provider" to "anineko"
            )
            val resp = app.post(
                "$API_BASE/api/stream/anidap",
                headers = streamHeaders(),
                json = body,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "AniDap", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "AniDap failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchAnivexa(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val body = mapOf(
                "anilistId" to anilistId,
                "ep" to ep,
                "lang" to lang,
                "provider" to "anineko"
            )
            val resp = app.post(
                "$API_BASE/api/stream/anivexa",
                headers = streamHeaders(),
                json = body,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "AniVexa", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "AniVexa failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchLuna(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val body = mapOf(
                "provider" to "anineko",
                "anilistId" to anilistId,
                "ep" to ep,
                "subType" to lang
            )
            val resp = app.post(
                "$API_BASE/api/stream/luna",
                headers = streamHeaders(),
                json = body,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "Luna", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "Luna failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchMiruro(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val epBody = mapOf("action" to "episodes", "anilistId" to anilistId)
            val epResp = app.post(
                "$API_BASE/api/stream/miruro",
                headers = streamHeaders(),
                json = epBody,
                timeout = TIMEOUT
            ).text
            val epParsed = parseJson<MiruroEpisodesResponse>(epResp)
            val episodeId = epParsed.episodes?.firstOrNull {
                it.number == ep || it.episodeNum == ep
            }?.id ?: epParsed.episodes?.firstOrNull()?.id

            val srcBody = mutableMapOf(
                "action" to "sources",
                "episodeId" to (episodeId ?: ep),
                "subType" to lang,
                "anilistId" to anilistId,
                "episodeNumber" to ep
            )
            val resp = app.post(
                "$API_BASE/api/stream/miruro",
                headers = streamHeaders(),
                json = srcBody,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "Miruro", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "Miruro failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchAnimelok(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val body = mapOf(
                "action" to "sources",
                "anilistId" to anilistId,
                "episodeNum" to ep,
                "type" to lang
            )
            val resp = app.post(
                "$API_BASE/api/stream/animelok",
                headers = streamHeaders(),
                json = body,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "Animelok", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "Animelok failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchAllmanga(
        title: String, anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val epBody = mapOf(
                "action" to "episodes",
                "title" to title,
                "anilistId" to anilistId,
                "translationType" to lang
            )
            val epResp = app.post(
                "$API_BASE/api/stream/allmanga",
                headers = streamHeaders(),
                json = epBody,
                timeout = TIMEOUT
            ).text
            val epParsed = parseJson<AllMangaEpisodesResponse>(epResp)
            val showId = epParsed.showId ?: return false

            val srcBody = mapOf(
                "action" to "sources",
                "showId" to showId,
                "episodeNum" to ep,
                "translationType" to lang
            )
            val resp = app.post(
                "$API_BASE/api/stream/allmanga",
                headers = streamHeaders(),
                json = srcBody,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "AllManga", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "AllManga failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchZen(
        title: String, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val searchBody = mapOf("action" to "search", "keyword" to title, "page" to 1)
            val searchResp = app.post(
                "$API_BASE/api/stream/zen",
                headers = streamHeaders(),
                json = searchBody,
                timeout = TIMEOUT
            ).text
            val searchParsed = parseJson<ZenSearchResponse>(searchResp)
            val slug = searchParsed.results?.firstOrNull()?.id ?: return false

            val srcBody = mapOf("action" to "sources", "id" to slug, "type" to lang, "server" to "")
            val resp = app.post(
                "$API_BASE/api/stream/zen",
                headers = streamHeaders(),
                json = srcBody,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "Zen", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "Zen failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchKickass(
        title: String, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val epBody = mapOf("action" to "episodes", "title" to title, "animeId" to null)
            val epResp = app.post(
                "$API_BASE/api/stream/kickass",
                headers = streamHeaders(),
                json = epBody,
                timeout = TIMEOUT
            ).text
            val epParsed = parseJson<KickassEpisodesResponse>(epResp)
            val animeId = epParsed.animeId ?: return false

            val serversBody = mapOf("action" to "servers", "animeId" to animeId, "episodeId" to ep)
            val resp = app.post(
                "$API_BASE/api/stream/kickass",
                headers = streamHeaders(),
                json = serversBody,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "KickAss", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "KickAss failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchHindianime(
        title: String, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val body = mapOf(
                "action" to "stream",
                "q" to title,
                "season" to 1,
                "ep" to ep
            )
            val resp = app.post(
                "$API_BASE/api/stream/hindianime",
                headers = streamHeaders(),
                json = body,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<HindiAnimeResponse>(resp)
            parsed.embeds?.forEach { embed ->
                if (!embed.url.isNullOrEmpty() && embed.url != "Error loading") {
                    try {
                        loadExtractor(embed.url, API_BASE, subtitleCallback, callback)
                    } catch (e: Exception) {
                        Log.d(TAG, "HindiAnime embed failed: ${e.message}")
                    }
                }
            }
            !parsed.embeds.isNullOrEmpty()
        } catch (e: Exception) {
            Log.d(TAG, "HindiAnime failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchKitty(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val body = mapOf(
                "provider" to "anineko",
                "anilistId" to anilistId,
                "ep" to ep,
                "audio" to lang
            )
            val resp = app.post(
                "$API_BASE/api/stream/kitty",
                headers = streamHeaders(),
                json = body,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "Kitty", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "Kitty failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchMfapi(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val body = mapOf(
                "action" to "sources",
                "anilistId" to anilistId,
                "ep" to ep,
                "lang" to lang
            )
            val resp = app.post(
                "$API_BASE/api/stream/mfapi",
                headers = streamHeaders(),
                json = body,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "Mfapi", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "Mfapi failed: ${e.message}")
            false
        }
    }

    private suspend fun fetchCrysoline(
        anilistId: Int, ep: Int, lang: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return try {
            val mapBody = mapOf("action" to "map", "anilistId" to anilistId, "lang" to "en")
            val mapResp = app.post(
                "$API_BASE/api/stream/crysoline",
                headers = streamHeaders(),
                json = mapBody,
                timeout = TIMEOUT
            ).text
            val mapParsed = parseJson<CrysolineMapResponse>(mapResp)
            val mapping = mapParsed.available?.firstOrNull() ?: return false

            val srcBody = mapOf(
                "action" to "sources",
                "sourceId" to mapping.sourceId,
                "mappedId" to mapping.mappedId,
                "episodeId" to ep,
                "subType" to lang,
                "server" to "",
                "episodeNumber" to ep
            )
            val resp = app.post(
                "$API_BASE/api/stream/crysoline",
                headers = streamHeaders(),
                json = srcBody,
                timeout = TIMEOUT
            ).text
            val parsed = parseJson<StreamResponse>(resp)
            emitStreams(parsed, "Crysoline", callback, subtitleCallback)
        } catch (e: Exception) {
            Log.d(TAG, "Crysoline failed: ${e.message}")
            false
        }
    }

    private suspend fun emitStreams(
        parsed: StreamResponse,
        sourceName: String,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        var found = false

        parsed.subtitles?.forEach { sub ->
            if (!sub.url.isNullOrBlank()) {
                subtitleCallback.invoke(
                    newSubtitleFile(sub.label ?: "English", sub.url)
                )
            }
        }

        val embedUrls = mutableListOf<String>()

        parsed.sources?.forEach { src ->
            val url = src.url ?: return@forEach
            if (url.isBlank()) return@forEach

            val referer = parsed.headers?.get("Referer") ?: parsed.headers?.get("referer")
            val subUrl = extractSubFromUrl(url)
            if (subUrl != null) {
                subtitleCallback.invoke(newSubtitleFile("English", subUrl))
            }

            if (src.isHLS == true || url.contains(".m3u8")) {
                val label = "$sourceName • ${src.quality ?: "auto"}"
                try {
                    M3u8Helper.generateM3u8(
                        source = label,
                        streamUrl = url,
                        referer = referer ?: API_BASE
                    ).forEach(callback)
                    found = true
                } catch (e: Exception) {
                    Log.d(TAG, "$sourceName m3u8 gen failed: ${e.message}")
                }
            } else if (url.contains(".mp4")) {
                callback.invoke(
                    newExtractorLink(
                        sourceName,
                        sourceName,
                        url,
                        ExtractorLinkType.VIDEO
                    ) {
                        this.referer = referer ?: API_BASE
                        this.quality = getQualityFromLabel(src.quality)
                    }
                )
                found = true
            } else {
                embedUrls.add(url)
            }
        }

        if (embedUrls.isNotEmpty()) {
            coroutineScope {
                embedUrls.map { url ->
                    async {
                        try {
                            loadExtractor(url, API_BASE, subtitleCallback, callback)
                        } catch (e: Exception) {
                            Log.d(TAG, "$sourceName embed failed: ${e.message}")
                        }
                    }
                }.awaitAll()
            }
            found = true
        }

        return found
    }

    private fun extractSubFromUrl(url: String): String? {
        val patterns = listOf(
            Regex("[?&]sub=([^&]+)"),
            Regex("[?&]caption_1=([^&]+)"),
            Regex("[?&]c1_file=([^&]+)")
        )
        for (pattern in patterns) {
            val match = pattern.find(url)
            if (match != null) {
                return java.net.URLDecoder.decode(match.groupValues[1], "UTF-8")
            }
        }
        return null
    }

    private fun getQualityFromLabel(label: String?): Int {
        if (label == null) return Qualities.Unknown.value
        val q = Regex("(\\d+)p").find(label)?.groupValues?.get(1)?.toIntOrNull()
        return when (q) {
            in 0..480 -> Qualities.P240.value
            in 481..720 -> Qualities.P480.value
            in 721..1080 -> Qualities.P720.value
            in 1081..1440 -> Qualities.P1080.value
            else -> Qualities.P1080.value
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
    @JsonProperty("idMal") val idMal: Int? = null,
    @JsonProperty("title") val title: AniListTitle? = null,
    @JsonProperty("coverImage") val coverImage: AniListCover? = null,
    @JsonProperty("bannerImage") val bannerImage: String? = null,
    @JsonProperty("description") val description: String? = null,
    @JsonProperty("averageScore") val averageScore: Int? = null,
    @JsonProperty("format") val format: String? = null,
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("episodes") val episodes: Int? = null,
    @JsonProperty("duration") val duration: Int? = null,
    @JsonProperty("genres") val genres: List<String>? = null,
    @JsonProperty("startDate") val startDate: AniListDate? = null,
    @JsonProperty("nextAiringEpisode") val nextAiringEpisode: AniListAiring? = null
) {
    fun toSearchResult(provider: AnimeDexProvider): SearchResponse? {
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
    @JsonProperty("english") val english: String? = null,
    @JsonProperty("native") val native: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListCover(
    @JsonProperty("large") val large: String? = null,
    @JsonProperty("extraLarge") val extraLarge: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListDate(
    @JsonProperty("year") val year: Int? = null,
    @JsonProperty("month") val month: Int? = null,
    @JsonProperty("day") val day: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListAiring(
    @JsonProperty("episode") val episode: Int? = null,
    @JsonProperty("airingAt") val airingAt: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class StreamResponse(
    @JsonProperty("sources") val sources: List<StreamSource>? = null,
    @JsonProperty("subtitles") val subtitles: List<SubtitleTrack>? = null,
    @JsonProperty("headers") val headers: Map<String, String>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class StreamSource(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("quality") val quality: String? = null,
    @JsonProperty("isHLS") val isHLS: Boolean? = null,
    @JsonProperty("isDASH") val isDASH: Boolean? = null,
    @JsonProperty("isMP4") val isMP4: Boolean? = null,
    @JsonProperty("server") val server: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class SubtitleTrack(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("label") val label: String? = null,
    @JsonProperty("lang") val lang: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class MiruroEpisodesResponse(
    @JsonProperty("episodes") val episodes: List<MiruroEpisode>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class MiruroEpisode(
    @JsonProperty("id") val id: Int? = null,
    @JsonProperty("number") val number: Int? = null,
    @JsonProperty("episodeNum") val episodeNum: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AllMangaEpisodesResponse(
    @JsonProperty("episodes") val episodes: List<AllMangaEpisode>? = null,
    @JsonProperty("showId") val showId: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AllMangaEpisode(
    @JsonProperty("number") val number: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ZenSearchResponse(
    @JsonProperty("results") val results: List<ZenResult>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ZenResult(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("slug") val slug: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class KickassEpisodesResponse(
    @JsonProperty("episodes") val episodes: List<KickassEpisode>? = null,
    @JsonProperty("animeId") val animeId: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class KickassEpisode(
    @JsonProperty("number") val number: Int? = null,
    @JsonProperty("id") val id: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class CrysolineMapResponse(
    @JsonProperty("available") val available: List<CrysolineMapping>? = null,
    @JsonProperty("total") val total: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class CrysolineMapping(
    @JsonProperty("sourceId") val sourceId: String? = null,
    @JsonProperty("mappedId") val mappedId: String? = null,
    @JsonProperty("sourceName") val sourceName: String? = null,
    @JsonProperty("langs") val langs: List<String>? = null,
    @JsonProperty("hasServers") val hasServers: Boolean? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class HindiAnimeResponse(
    @JsonProperty("embeds") val embeds: List<HindiAnimeEmbed>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class HindiAnimeEmbed(
    @JsonProperty("server") val server: String? = null,
    @JsonProperty("url") val url: String? = null
)
