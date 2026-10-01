package com.laddu100

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.lagradost.api.Log
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson

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
     * Visit shiro's EPISODE page so the Next.js middleware sets the `shiro_watch` cookie, then
     * extract that cookie from the Set-Cookie response header and return it.
     *
     * KEY FINDINGS (verified by live probing + logcat analysis):
     *  - /api/episode returns {"status":"unavailable","reason":"forbidden"} WITHOUT the cookie.
     *  - The cookie is set by the /anime/{id}/{ep} EPISODE page response (NOT the /anime/{id} page,
     *    which is CDN-cached and often returns no Set-Cookie on GET).
     *  - The cookie works regardless of TLS fingerprint (curl-captured cookie unlocks the API for
     *    every anime, including ones that were "forbidden" without it). So okhttp's app.get will
     *    capture it just as well as a browser would.
     *  - The cookie is NOT auto-persisted across separate app.post calls in all cases, so we
     *    capture it explicitly here and pass it as a Cookie header on /api/episode.
     *
     * Returns the cookie string ("shiro_watch=...") or null on failure.
     */
    private suspend fun fetchWatchCookie(anilistId: Int): String? {
        return try {
            // Episode page URL. The slug is cosmetic for the middleware — it matches on /anime/<id>/.
            // Using episode 1 is always safe (every anime has at least ep 1).
            val resp = app.get(
                "$MAIN_URL/anime/$anilistId/1",
                headers = pageHeaders,
                timeout = 15_000L
            )
            // Cloudstream's NiceResponse exposes all Set-Cookie headers via headers.values("Set-Cookie").
            // The cookie looks like: shiro_watch=xxx.yyy.zzz; Path=/; Expires=...; ...
            val cookies = resp.headers.values("Set-Cookie")
            val watch = cookies
                .firstOrNull { it.startsWith("shiro_watch=") }
                ?.substringBefore(";")
                ?.trim()
            if (watch.isNullOrBlank()) {
                Log.d(TAG, "fetchWatchCookie($anilistId): no shiro_watch in Set-Cookie (cookies=$cookies)")
                null
            } else {
                Log.d(TAG, "fetchWatchCookie($anilistId): got cookie ${watch.take(30)}...")
                watch
            }
        } catch (e: Exception) {
            Log.d(TAG, "fetchWatchCookie($anilistId) failed: ${e.message}")
            null
        }
    }

    /** Cached cookie — shiro_watch lasts 24h, so we reuse it across many episode loads. */
    @Volatile
    private var cachedCookie: String? = null
    @Volatile
    private var cachedCookieTs: Long = 0L
    private const val COOKIE_TTL_MS = 23 * 60 * 60 * 1000L // 23h (cookie lasts 24h)

    private suspend fun watchCookie(anilistId: Int): String? {
        val now = System.currentTimeMillis()
        val cached = cachedCookie
        if (cached != null && now - cachedCookieTs < COOKIE_TTL_MS) return cached
        val fresh = fetchWatchCookie(anilistId)
        if (fresh != null) {
            cachedCookie = fresh
            cachedCookieTs = now
        }
        return fresh ?: cached // fall back to stale cookie if fetch failed
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
     * THE critical call. Fetches the shiro_watch cookie (from the episode page) then POSTs
     * /api/episode with the cookie explicitly passed as a Cookie header.
     *
     * Without the cookie the API returns {"status":"unavailable","reason":"forbidden"}.
     * With it, returns {"status":"ready","variants":[...]} for every anime on shiro's catalog.
     */
    suspend fun episodeServers(anilistId: Int, episode: Int): ShiroEpisodeResponse? {
        // Fetch the cookie first. watchCookie() caches it for 23h (cookie lasts 24h) so subsequent
        // episode loads skip the page GET.
        val cookie = watchCookie(anilistId)

        // Try up to 2 times: first with the cached cookie, and if that returns "forbidden",
        // force a fresh cookie fetch and retry.
        for (attempt in 1..2) {
            val resp = try {
                val headers = baseHeaders.toMutableMap().apply {
                    put("Content-Type", "application/json")
                    put("Origin", MAIN_URL)
                    put("Referer", "$MAIN_URL/anime/$anilistId/1")
                    if (!cookie.isNullOrBlank()) put("Cookie", cookie)
                }
                app.post(
                    "$MAIN_URL/api/episode",
                    headers = headers,
                    json = mapOf("anilistId" to anilistId, "episode" to episode),
                    timeout = 20_000L
                )
            } catch (e: Exception) {
                Log.e(TAG, "episode POST error: ${e.message}")
                return null
            }

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

            // If forbidden, the cookie was missing/expired. Force a fresh fetch and retry once.
            if (parsed.status == "unavailable" && parsed.reason == "forbidden" && attempt == 1) {
                Log.d(TAG, "forbidden on attempt 1 for $anilistId:$episode — forcing fresh cookie")
                cachedCookie = null
                cachedCookieTs = 0L
                val fresh = fetchWatchCookie(anilistId)
                if (fresh.isNullOrBlank()) {
                    Log.d(TAG, "fresh cookie fetch failed — giving up")
                    return parsed
                }
                cachedCookie = fresh
                cachedCookieTs = System.currentTimeMillis()
                continue
            }
            return parsed
        }
        return null
    }

    // ---------- Shiro /api/recent-episodes (home schedule) ----------

    suspend fun recentEpisodes(): List<ShiroSchedule> {
        return try {
            val cookie = watchCookie(1) // any id works; just need a cookie
            val headers = baseHeaders.toMutableMap().apply {
                if (!cookie.isNullOrBlank()) put("Cookie", cookie)
            }
            val resp = app.get("$MAIN_URL/api/recent-episodes", headers = headers)
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
