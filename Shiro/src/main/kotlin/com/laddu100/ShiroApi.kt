package com.laddu100

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.lagradost.api.Log
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import java.util.Calendar

/**
 * Shiro API layer.
 *
 * Two data sources (both verified to require NO auth/cookies):
 *  1. AniList GraphQL (https://graphql.anilist.co/) — all catalog metadata + real episode titles
 *     via `Media.streamingEpisodes { title thumbnail url }`.
 *  2. Shiro's own backend (https://shiro.so/api/episode) — returns HLS stream URLs + VTT subtitle
 *     tracks for every variant (sub/dub) and every server (Plum/Lemon/Cherry/Grape).
 */
object ShiroApi {

    const val MAIN_URL = "https://shiro.so"
    private const val TAG = "Shiro"
    private const val ANILIST_URL = "https://graphql.anilist.co"

    // AniList soft rate limit is 90/min; we make at most a handful per screen so this is safe.
    private val mapper: ObjectMapper = ObjectMapper().registerModule(KotlinModule.Builder().build())

    private const val USER_AGENT =
        "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

    private val baseHeaders = mapOf(
        "User-Agent" to USER_AGENT,
        "Accept" to "application/json"
    )

    private val anilistHeaders = mapOf(
        "User-Agent" to USER_AGENT,
        "Accept" to "application/json",
        "Content-Type" to "application/json"
    )

    // ---------- AniList GraphQL ----------

    private suspend inline fun <reified T : Any> anilist(query: String, variables: Map<String, Any?>): T? {
        return try {
            // NiceHttp serializes `json` map to a JSON request body automatically.
            val resp = app.post(
                ANILIST_URL,
                headers = anilistHeaders,
                json = mapOf("query" to query, "variables" to variables)
            )
            if (!resp.isSuccessful) {
                Log.e(TAG, "anilist POST failed: ${resp.code}")
                return null
            }
            parseJson<T>(resp.text)
        } catch (e: Exception) {
            Log.e(TAG, "anilist error: ${e.message}")
            null
        }
    }

    /**
     * Search anime. Returns AniList media list.
     * Replicates shiro's `SearchAnime` operation.
     */
    suspend fun search(query: String, page: Int = 1, perPage: Int = 25): List<AniListMedia> {
        val q = """
            query(${'$'}search: String!, ${'$'}page: Int!, ${'$'}perPage: Int!) {
              Page(page: ${'$'}page, perPage: ${'$'}perPage) {
                media(type: ANIME, isAdult: false, search: ${'$'}search, sort: SEARCH_MATCH) {
                  id idMal title { romaji english native }
                  coverImage { large extraLarge } bannerImage
                  format status episodes seasonYear genres averageScore popularity trending
                  description(asHtml: true) nextAiringEpisode { episode }
                }
              }
            }
        """.trimIndent()
        val res = anilist<AniListResponse<AniListPage>>(q, mapOf("search" to query, "page" to page, "perPage" to perPage))
            ?: return emptyList()
        return res.data?.page?.media ?: emptyList()
    }

    /**
     * Home-page rows. Each section is a single AniList query.
     * Returns null on failure so the provider can skip that section cleanly.
     */
    suspend fun homeList(sort: String, page: Int = 1, perPage: Int = 30): List<AniListMedia> {
        // sort: TRENDING | POPULARITY_DESC | SCORE_DESC | FAVOURITES_DESC
        val q = """
            query(${'$'}page: Int!, ${'$'}perPage: Int!, ${'$'}sort: [MediaSort]!) {
              Page(page: ${'$'}page, perPage: ${'$'}perPage) {
                media(type: ANIME, isAdult: false, sort: ${'$'}sort) {
                  id idMal title { romaji english native }
                  coverImage { large extraLarge } bannerImage
                  format status episodes seasonYear genres averageScore popularity trending
                  description(asHtml: true) nextAiringEpisode { episode }
                }
              }
            }
        """.trimIndent()
        val res = anilist<AniListResponse<AniListPage>>(q, mapOf("page" to page, "perPage" to perPage, "sort" to sort))
            ?: return emptyList()
        return res.data?.page?.media ?: emptyList()
    }

    /**
     * Current-season row (anime airing THIS season THIS year, by popularity).
     */
    suspend fun currentSeasonList(page: Int = 1, perPage: Int = 30): List<AniListMedia> {
        val (season, year) = currentSeason()
        val q = """
            query(${'$'}page: Int!, ${'$'}perPage: Int!, ${'$'}season: MediaSeason!, ${'$'}year: Int!) {
              Page(page: ${'$'}page, perPage: ${'$'}perPage) {
                media(type: ANIME, season: ${'$'}season, seasonYear: ${'$'}year, sort: POPULARITY_DESC) {
                  id idMal title { romaji english native }
                  coverImage { large extraLarge } bannerImage
                  format status episodes seasonYear genres averageScore popularity trending
                  description(asHtml: true) nextAiringEpisode { episode }
                }
              }
            }
        """.trimIndent()
        val res = anilist<AniListResponse<AniListPage>>(q, mapOf("page" to page, "perPage" to perPage, "season" to season, "year" to year))
            ?: return emptyList()
        return res.data?.page?.media ?: emptyList()
    }

    /**
     * Full anime detail. Critically includes `streamingEpisodes` (real episode titles +
     * Crunchyroll thumbnails) and `recommendations`.
     */
    suspend fun detail(id: Int): AniListMedia? {
        val q = """
            query(${'$'}id: Int!) {
              Media(id: ${'$'}id, type: ANIME, isAdult: false) {
                id idMal title { romaji english native }
                coverImage { large extraLarge } bannerImage
                format status episodes seasonYear genres averageScore popularity trending
                description(asHtml: true) nextAiringEpisode { episode }
                duration source season
                studios(isMain: true) { nodes { name } }
                trailer { id site thumbnail }
                streamingEpisodes { title thumbnail url }
                recommendations(sort: RATING_DESC, perPage: 10) {
                  nodes {
                    mediaRecommendation {
                      id idMal title { romaji english native }
                      coverImage { large extraLarge } bannerImage
                      format status episodes seasonYear genres averageScore popularity trending
                      description(asHtml: true) nextAiringEpisode { episode }
                    }
                  }
                }
              }
            }
        """.trimIndent()
        val res = anilist<AniListResponse<AniListMedia>>(q, mapOf("id" to id)) ?: return null
        return res.data
    }

    // ---------- Shiro /api/episode ----------

    /**
     * THE critical call: returns every variant (sub/dub) and every source (Plum/Lemon/Cherry/Grape)
     * with HLS URLs + VTT subtitle tracks for a given episode.
     *
     * No auth, no cookies, no Origin/Referer required (verified with plain curl).
     */
    suspend fun episodeServers(anilistId: Int, episode: Int): ShiroEpisodeResponse? {
        return try {
            val resp = app.post(
                "$MAIN_URL/api/episode",
                headers = baseHeaders + mapOf("Content-Type" to "application/json"),
                json = mapOf("anilistId" to anilistId, "episode" to episode)
            )
            if (!resp.isSuccessful) {
                Log.d(TAG, "episode POST $anilistId:$episode -> ${resp.code}")
                return null
            }
            parseJson<ShiroEpisodeResponse>(resp.text)
        } catch (e: Exception) {
            Log.e(TAG, "episode error: ${e.message}")
            null
        }
    }

    // ---------- Shiro /api/recent-episodes (home schedule) ----------

    suspend fun recentEpisodes(): List<ShiroSchedule> {
        return try {
            val resp = app.get("$MAIN_URL/api/recent-episodes", headers = baseHeaders)
            if (!resp.isSuccessful) return emptyList()
            parseJson<ShiroRecentEpisodes>(resp.text)?.schedules ?: emptyList()
        } catch (e: Exception) {
            Log.e(TAG, "recent-episodes error: ${e.message}")
            emptyList()
        }
    }

    // ---------- helpers ----------

    /** Builds an absolute stream URL from the relative path returned by /api/episode. */
    fun absolute(url: String?): String? {
        if (url.isNullOrBlank()) return null
        return when {
            url.startsWith("http") -> url
            url.startsWith("/") -> MAIN_URL + url
            else -> "$MAIN_URL/$url"
        }
    }

    /** Quick probe to determine whether a dub variant exists for this anime. */
    suspend fun hasDub(anilistId: Int): Boolean {
        val resp = episodeServers(anilistId, 1) ?: return false
        if (resp.status != "ready") return false
        return resp.variants?.any { it.id == "dub" && !it.sources.isNullOrEmpty() } == true
    }

    private fun currentSeason(): Pair<String, Int> {
        val cal = Calendar.getInstance()
        val year = cal.get(Calendar.YEAR)
        val month = cal.get(Calendar.MONTH) + 1 // 1-12
        val season = when (month) {
            in 1..3 -> "WINTER"
            in 4..6 -> "SPRING"
            in 7..9 -> "SUMMER"
            else -> "FALL"
        }
        return season to year
    }
}
