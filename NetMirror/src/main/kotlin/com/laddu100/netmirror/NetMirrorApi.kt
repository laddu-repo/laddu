package com.laddu100.netmirror

import android.util.Base64
import com.lagradost.api.Log
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import java.net.URLEncoder
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

/**
 * NetMirror API client.
 *
 * Every request shape below was captured from the live site (netmirror.plus,
 * 2026-10) and re-verified with plain HTTP replays:
 *
 *  - api2.imdb3.shop / api2.imdb4.shop accept plain GETs with a desktop
 *    Chrome UA + Referer https://netmirror.plus/ (no cookies, no CF).
 *  - The player endpoint needs a per-request HMAC signature:
 *        sig = HMAC-SHA256("{tm_id}:{ts}", "net###@@sss") as lowercase hex
 *    where ts is the current unix time in seconds. This is the CURRENT
 *    algorithm from the site bundle (older releases signed only the
 *    timestamp - verified live by replaying a captured browser request).
 *  - The player domain rotates; the site tries webvp.watch21.shop first,
 *    then bet.watch22.shop / limit.watch22.shop. speed.watch22.shop is the
 *    legacy NewTV host (dead origin, HTTP 525, kept last as a hail-mary).
 */
object NetMirrorApi {

    const val TAG = "NetMirror"

    private const val CATALOG_API = "https://api2.imdb3.shop/api"
    private const val SEARCH_API = "https://api2.imdb4.shop/api"
    private const val REFERER = "https://netmirror.plus/"

    /** Player hosts in the order the site itself tries them. */
    val PLAYER_HOSTS = listOf(
        "https://webvp.watch21.shop",
        "https://bet.watch22.shop",
        "https://limit.watch22.shop",
        "https://webvp.watch212.shop",
        "https://dv.watch22.shop",
        "https://speed.watch22.shop",
    )

    /** The player iframe origin is used as Referer for the media CDNs. */
    const val PLAYER_REFERER = "https://webvp.watch21.shop/"

    private val SIG_KEY = "net###@@sss".toByteArray(Charsets.UTF_8)

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
        "Accept" to "application/json, text/plain, */*",
        "Accept-Language" to "en-US,en;q=0.9",
        "Referer" to REFERER,
        "Origin" to REFERER.trimEnd('/'),
    )

    private val playerHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.9",
        "Referer" to REFERER,
        "Upgrade-Insecure-Requests" to "1",
    )

    /** Media (image/video) request headers shared with the CloudStream player. */
    val mediaHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
        "Referer" to PLAYER_REFERER,
    )

    // ------------------------------------------------------------------ sig

    /** HMAC-SHA256("{tm_id}:{ts}", key) as lowercase hex (site fn C3). */
    fun signature(tmId: String, ts: Long): String {
        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(SIG_KEY, "HmacSHA256"))
        val digest = mac.doFinal("$tmId:$ts".toByteArray(Charsets.UTF_8))
        return digest.joinToString("") { "%02x".format(it) }
    }

    // -------------------------------------------------------------- catalog

    /**
     * Fetch one catalog row. `path` is the bare API path with its fixed
     * params (e.g. "tranding?id=11&items_per_page=15" or
     * "movies/filter?sort_by=date&dubbing=Hindi&items_per_page=30");
     * a 0-based `page` is appended.
     */
    suspend fun list(path: String, page: Int): NetMirrorListResponse? {
        val sep = if (path.contains('?')) '&' else '?'
        val url = "$CATALOG_API/$path${sep}page=$page"
        return try {
            val text = app.get(url, headers = headers).text
            runCatching { parseJson<NetMirrorListResponse>(text) }.getOrNull()
        } catch (e: Exception) {
            Log.e(TAG, "list failed: $url -> ${e.javaClass.simpleName}: ${e.message}")
            null
        }
    }

    /** Site search: /api/search2/{q}?page=N with the site's own encoding. */
    suspend fun search(query: String, page: Int): NetMirrorListResponse? {
        val encoded = encodeQuery(query) ?: return null
        val url = "$SEARCH_API/search2/$encoded?page=$page"
        return try {
            val text = app.get(url, headers = headers).text
            runCatching { parseJson<NetMirrorListResponse>(text) }.getOrNull()
        } catch (e: Exception) {
            Log.e(TAG, "search failed: $url -> ${e.javaClass.simpleName}: ${e.message}")
            null
        }
    }

    /**
     * Query encoding exactly like the site: trim, "/" -> "--slash--",
     * URL-encode, spaces as '+'. (Both '+' and '%20' are accepted live;
     * '--slash--' is required - a raw '%2F' 404s.)
     */
    private fun encodeQuery(query: String): String? {
        val trimmed = query.trim()
        if (trimmed.isEmpty()) return null
        val slashed = trimmed.replace("/", "--slash--")
        return try {
            URLEncoder.encode(slashed, "UTF-8")
        } catch (e: Exception) {
            null
        }
    }

    /** Details for one title. mediaType is "movie" or "tv". */
    suspend fun details(mediaType: String, id: String): NetMirrorDetails? {
        val url = "$CATALOG_API/$mediaType/$id"
        return try {
            val text = app.get(url, headers = headers).text
            runCatching { parseJson<NetMirrorListDetails>(text) }.getOrNull()?.results?.firstOrNull()
        } catch (e: Exception) {
            Log.e(TAG, "details failed: $url -> ${e.javaClass.simpleName}: ${e.message}")
            null
        }
    }

    // --------------------------------------------------------------- player

    /**
     * Build the watchbox player URL for one episode and fetch its HTML from
     * the first host that answers with a real player page.
     *
     * Params (byte-for-byte the site's construction):
     *   id={subjectid} &se &ep &dp &na={b64(title)} &year &tm_id
     *   &ts &sig &nid={id} &exten=false &tv= &token=
     * (movies use se=0&ep=0; na keeps the title exactly as the API returns
     * it, including any trailing newline, exactly like window.btoa(title)).
     */
    suspend fun playerHtml(details: NetMirrorDetails, se: Int?, ep: Int?): String? {
        val subjectid = details.subjectid ?: return null
        val dp = details.dp ?: return null
        val title = details.title ?: return null
        val tmId = details.tm_id ?: ""
        val nid = details.id ?: ""
        val year = extractYear(details.release_date)

        val ts = System.currentTimeMillis() / 1000L
        val sig = signature(tmId, ts)
        val na = try {
            Base64.encodeToString(title.toByteArray(Charsets.UTF_8), Base64.NO_WRAP)
        } catch (e: Exception) {
            ""
        }

        val query = buildString {
            append("id=").append(urlEncode(subjectid))
            append("&se=").append(se ?: 0)
            append("&ep=").append(ep ?: 0)
            append("&dp=").append(urlEncode(dp))
            append("&na=").append(urlEncode(na))
            append("&year=").append(urlEncode(year))
            append("&tm_id=").append(urlEncode(tmId))
            append("&ts=").append(ts)
            append("&sig=").append(sig)
            append("&nid=").append(urlEncode(nid))
            append("&exten=false&tv=&token=")
        }

        for (host in PLAYER_HOSTS) {
            val url = "$host/play/watchbox.php?$query"
            try {
                val text = app.get(url, headers = playerHeaders).text
                if (text.length > 5000 && !text.contains("Unauthorised", ignoreCase = true)) {
                    return text
                }
                Log.w(TAG, "player host rejected: $host (${text.length}b)")
            } catch (e: Exception) {
                Log.w(TAG, "player host failed: $host -> ${e.javaClass.simpleName}: ${e.message}")
            }
        }
        return null
    }

    /**
     * Parse the ArtPlayer page. Streams and subtitles are `html: '<label>',
     * url: '<url>'` selector entries; we classify by extension:
     *   .mp4/.m3u8 -> video, .srt/.vtt -> subtitle.
     * OFF / custom_url / custom_file entries are skipped.
     */
    fun parsePlayer(html: String): Pair<List<NetMirrorStream>, List<NetMirrorSubtitle>> {
        val itemRegex = Regex("""html:\s*'([^']{1,40})'\s*,\s*url:\s*(?:\(\s*)?(?:encodeURI\(\s*)?'([^']+)'""")
        val streams = LinkedHashMap<String, String>()
        val subtitles = LinkedHashMap<String, String>()

        for (m in itemRegex.findAll(html)) {
            val label = m.groupValues[1].trim()
            var url = m.groupValues[2].trim()
            if (url.contains("&amp;")) url = url.replace("&amp;", "&")
            if (!url.startsWith("http")) continue
            val lower = url.substringBefore('?').lowercase()
            when {
                lower.endsWith(".mp4") || lower.endsWith(".m3u8") || lower.endsWith(".mkv") ->
                    streams[url] = label.ifBlank { "Auto" }

                lower.endsWith(".srt") || lower.endsWith(".vtt") ->
                    subtitles[url] = label.ifBlank { "Subtitle" }
            }
        }
        return streams.map { (u, l) -> NetMirrorStream(l, u) } to
                subtitles.map { (u, l) -> NetMirrorSubtitle(l, u) }
    }

    // ---------------------------------------------------------------- utils

    /** "Jul 10,2026" / "2026" -> "2026"; returns "" when nothing matches. */
    fun extractYear(releaseDate: String?): String {
        if (releaseDate.isNullOrBlank()) return ""
        val m = Regex("""(19|20)\d{2}""").find(releaseDate) ?: return ""
        return m.value
    }

    private fun urlEncode(s: String): String =
        URLEncoder.encode(s, "UTF-8").replace("+", "%20")
}
