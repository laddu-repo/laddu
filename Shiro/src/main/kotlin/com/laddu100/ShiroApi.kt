package com.laddu100

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.lagradost.api.Log
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.nicehttp.NiceResponse

/**
 * Shiro API layer — shiro.so.
 *
 * KEY INSIGHT (learned from logcat + live probing):
 *   The `POST /api/episode` endpoint is GATED behind a `shiro_watch` session cookie. Without it
 *   the API returns `{"status":"unavailable","reason":"forbidden"}`. The cookie is NOT set by
 *   Cloudflare; it is set by a Next.js middleware on the `/anime/{id}-{slug}` PAGE response
 *   (Set-Cookie header, 24h expiry, HttpOnly, SameSite=lax). Cloudstream's okhttp client
 *   (NiceHttp) keeps a cookie jar, so a single `app.get("/anime/{id}-...")` warms it and every
 *   subsequent `app.post("/api/episode")` carries the cookie automatically.
 *
 * Two data sources:
 *  1. AniList GraphQL (`https://graphql.anilist.co/`) — all catalog metadata + real episode titles
 *     via `Media.streamingEpisodes { title thumbnail url }`.
 *  2. Shiro's own backend (`https://shiro.so/api/episode`) — returns HLS URLs + VTT subtitle tracks
 *     for every variant (sub/dub) and every server (Plum / Cherry / Cherry 2 / Cherry 3 / Lemon /
 *     Grape / Melon — the set varies per anime and per episode).
 *
 * All stream + subtitle URLs are RELATIVE (`/stream/...`) and must be prefixed with MAIN_URL.
 * Streams + subtitles fetch cleanly with plain GET (no cookie needed for the actual media URLs).
 */
object ShiroApi {

    const val MAIN_URL = "https://shiro.so"
    private const val TAG = "Shiro"
    private const val ANILIST_URL = "https://graphql.anilist.co"

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

    private val pageHeaders = mapOf(
        "User-Agent" to USER_AGENT,
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.9"
    )

    // ---------- Cookie bootstrap ----------

    /**
     * Visit the anime page so the Next.js middleware sets the `shiro_watch` cookie. Cloudstream's
     * okhttp cookie jar persists it for every subsequent request in the session. Cheap and
     * idempotent — safe to call before every /api/episode.
     *
     * Returns the page response (sometimes useful) or null on failure. Failures here are NOT fatal
     * — a previously-set cookie from an earlier call may still be valid.
     */
    private suspend fun warmSession(anilistId: Int): Boolean {
        return try {
            // The slug is cosmetic; shiro's middleware matches on /anime/<id>- prefix, so any slug
            // (or even just the id) triggers the Set-Cookie. We use the bare id to avoid having to
            // build a real slug.
            val resp = app.get("$MAIN_URL/anime/$anilistId-$", headers = pageHeaders, timeout = 15_000L)
            // 200 is the normal case (page renders). 404 also sets the cookie on the middleware
            // path, but we treat non-2xx/4xx as soft failures.
            resp.code in 200..404
        } catch (e: Exception) {
            Log.d(TAG, "warmSession($anilistId) failed: ${e.message}")
            false
        }
    }

    // ---------- AniList GraphQL ----------

    private suspend inline fun <reified T : Any> anilist(query: String, variables: Map<String, Any?>): T? {
        return try {
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

    suspend fun homeList(sort: String, page: Int = 1, perPage: Int = 30): List<AniListMedia> {
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
     * THE critical call. Warms the session cookie first, then POSTs /api/episode.
     * Returns the full ShiroEpisodeResponse (status + variants + sources + tracks) or null.
     */
    suspend fun episodeServers(anilistId: Int, episode: Int): ShiroEpisodeResponse? {
        // Always warm the session — cheap and idempotent. If the cookie is already in the jar,
        // the GET is still a single round-trip and harmless. If it's expired/missing, this sets it.
        warmSession(anilistId)

        var resp: NiceResponse? = null
        for (attempt in 1..2) {
            resp = try {
                app.post(
                    "$MAIN_URL/api/episode",
                    headers = baseHeaders + mapOf(
                        "Content-Type" to "application/json",
                        "Origin" to MAIN_URL,
                        "Referer" to "$MAIN_URL/anime/$anilistId"
                    ),
                    json = mapOf("anilistId" to anilistId, "episode" to episode),
                    timeout = 20_000L
                )
            } catch (e: Exception) {
                Log.e(TAG, "episode POST error: ${e.message}")
                null
            }
            if (resp == null) return null

            if (!resp.isSuccessful) {
                Log.d(TAG, "episode POST $anilistId:$episode -> ${resp.code}")
                return null
            }

            val parsed = try {
                parseJson<ShiroEpisodeResponse>(resp.text)
            } catch (e: Exception) {
                Log.e(TAG, "episode parse error: ${e.message}")
                return null
            }

            // If we got "forbidden" the cookie wasn't actually set (rare — e.g. middleware
            // skipped on a cached page). Warm once more with a cache-buster and retry.
            if (parsed.status == "unavailable" && parsed.reason == "forbidden" && attempt == 1) {
                Log.d(TAG, "forbidden on first attempt, re-warming session for $anilistId")
                warmSession(anilistId)
                continue
            }
            return parsed
        }
        return resp?.let { parseJson<ShiroEpisodeResponse>(it.text) }
    }

    // ---------- Shiro /api/recent-episodes (home schedule) ----------

    suspend fun recentEpisodes(): List<ShiroSchedule> {
        return try {
            warmSession(1) // any id works; just to get a cookie for the API call
            val resp = app.get("$MAIN_URL/api/recent-episodes", headers = baseHeaders)
            if (!resp.isSuccessful) return emptyList()
            parseJson<ShiroRecentEpisodes>(resp.text)?.schedules ?: emptyList()
        } catch (e: Exception) {
            Log.e(TAG, "recent-episodes error: ${e.message}")
            emptyList()
        }
    }

    // ---------- helpers ----------

    fun absolute(url: String?): String? {
        if (url.isNullOrBlank()) return null
        return when {
            url.startsWith("http") -> url
            url.startsWith("/") -> MAIN_URL + url
            else -> "$MAIN_URL/$url"
        }
    }

    private fun currentSeason(): Pair<String, Int> {
        val cal = java.util.Calendar.getInstance()
        val year = cal.get(java.util.Calendar.YEAR)
        val month = cal.get(java.util.Calendar.MONTH) + 1
        val season = when (month) {
            in 1..3 -> "WINTER"
            in 4..6 -> "SPRING"
            in 7..9 -> "SUMMER"
            else -> "FALL"
        }
        return season to year
    }
}
