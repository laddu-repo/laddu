package com.laddu100.netmirror

import com.laddu100.netmirror.entities.Source
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.INFER_TYPE
import com.lagradost.cloudstream3.network.WebViewResolver
import com.fasterxml.jackson.core.json.JsonReadFeature
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.lagradost.cloudstream3.USER_AGENT
import com.lagradost.nicehttp.Requests
import com.lagradost.nicehttp.ResponseParser
import kotlin.reflect.KClass
import okhttp3.FormBody
import android.content.Context
import android.webkit.CookieManager
import com.lagradost.api.Log
import com.lagradost.api.getContext
import java.util.UUID
import okhttp3.Request
import java.util.Base64

private const val TAG = "NetMirror"

val JSONParser = object : ResponseParser {
    val mapper: ObjectMapper = jacksonObjectMapper().configure(
        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false
    ).configure(
        JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature(), true
    )

    override fun <T : Any> parse(text: String, kClass: KClass<T>): T {
        return mapper.readValue(text, kClass.java)
    }

    override fun <T : Any> parseSafe(text: String, kClass: KClass<T>): T? {
        return try {
            mapper.readValue(text, kClass.java)
        } catch (e: Exception) {
            null
        }
    }

    override fun writeValueAsString(obj: Any): String {
        return mapper.writeValueAsString(obj)
    }
}

val app = Requests(responseParser = JSONParser).apply {
    defaultHeaders = mapOf("User-Agent" to USER_AGENT)
}

inline fun <reified T : Any> parseJson(text: String): T {
    return JSONParser.parse(text, T::class)
}

inline fun <reified T : Any> tryParseJson(text: String): T? {
    return try {
        return JSONParser.parseSafe(text, T::class)
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun convertRuntimeToMinutes(runtime: String): Int {
    var totalMinutes = 0
    val parts = runtime.split(" ")
    for (part in parts) {
        when {
            part.endsWith("h") -> {
                val hours = part.removeSuffix("h").trim().toIntOrNull() ?: 0
                totalMinutes += hours * 60
            }
            part.endsWith("m") -> {
                val minutes = part.removeSuffix("m").trim().toIntOrNull() ?: 0
                totalMinutes += minutes
            }
        }
    }
    return totalMinutes
}

/**
 * Working mirror domain shared across all providers. bypass() updates this to
 * whichever domain successfully yields a t_hash_t cookie.
 */
@Volatile
var netMirrorWorkingDomain: String = "https://net52.cc"

/**
 * Last play-domain cookie (from net77.cc). Stored here so each provider's
 * getVideoInterceptor() can forward it with m3u8/segment requests.
 */
@Volatile
var lastPlayCookie: String = ""

private val candidateDomains = listOf(
    "https://net52.cc",
    "https://net77.cc",
    "https://net22.cc",
    "https://net99.cc",
    "https://net50.cc"
)

private fun bypassHeaders(base: String): Map<String, String> = mapOf(
    "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
    "Accept-Encoding" to "gzip, deflate, br, zstd",
    "Accept-Language" to "en-US,en;q=0.9",
    "Cache-Control" to "max-age=0",
    "Connection" to "keep-alive",
    "Origin" to base,
    "Referer" to "$base/verify2",
    "sec-ch-ua" to "\"Google Chrome\";v=\"147\", \"Not.A/Brand\";v=\"8\", \"Chromium\";v=\"147\"",
    "sec-ch-ua-mobile" to "?0",
    "sec-ch-ua-platform" to "\"Windows\"",
    "Sec-Fetch-Dest" to "document",
    "Sec-Fetch-Mode" to "navigate",
    "Sec-Fetch-Site" to "same-origin",
    "Sec-Fetch-User" to "?1",
    "Upgrade-Insecure-Requests" to "1",
    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"
)

private suspend fun tryBypassDomain(domain: String): String {
    val base = domain.trimEnd('/')
    val client = app.baseClient.newBuilder()
        .followRedirects(false)
        .followSslRedirects(false)
        .build()

    try {
        val getReq = Request.Builder()
            .url("$base/verify2")
            .get()
            .apply { bypassHeaders(base).forEach { (k, v) -> addHeader(k, v) } }
            .build()
        client.newCall(getReq).execute().use { resp ->
            resp.headers("Set-Cookie").forEach { sc ->
                val name = sc.substringBefore("=", "").trim()
                val value = sc.substringAfter("=", "").substringBefore(";").trim()
                if (name.isNotEmpty() && value.isNotEmpty()) {
                    // collected but not strictly needed
                }
            }
        }
    } catch (_: Exception) { }

    val formBody = FormBody.Builder()
        .add("g-recaptcha-response", UUID.randomUUID().toString())
        .build()
    val postReq = Request.Builder()
        .url("$base/verify.php")
        .post(formBody)
        .apply { bypassHeaders(base).forEach { (k, v) -> addHeader(k, v) } }
        .build()

    return try {
        client.newCall(postReq).execute().use { response ->
            Log.d(TAG, "bypass: $base/verify.php HTTP ${response.code}")
            response.headers("Set-Cookie")
                .firstOrNull { it.startsWith("t_hash_t=") }
                ?.substringAfter("t_hash_t=")
                ?.substringBefore(";")
                .orEmpty()
        }
    } catch (e: Exception) {
        Log.d(TAG, "bypass: $base exception: ${e.message}")
        ""
    }
}

suspend fun bypass(mainUrl: String): String {
    Log.d(TAG, "bypass: START")
    val (savedCookie, savedTimestamp) = NetflixMirrorStorage.getCookie()

    if (!savedCookie.isNullOrEmpty() && System.currentTimeMillis() - savedTimestamp < 300_000) {
        Log.d(TAG, "bypass: using cached cookie")
        return savedCookie
    }

    for (domain in candidateDomains) {
        Log.d(TAG, "bypass: trying $domain")
        val cookie = tryBypassDomain(domain)
        if (cookie.isNotEmpty()) {
            Log.d(TAG, "bypass: success on $domain")
            netMirrorWorkingDomain = domain
            NetflixMirrorStorage.saveCookie(cookie)
            return cookie
        }
    }

    Log.e(TAG, "bypass: all ${candidateDomains.size} domains failed")
    NetflixMirrorStorage.clearCookie()
    return ""
}

/**
 * Bypass specifically for the play domain (net77.cc). play.php/playlist.php live
 * on net77.cc and need a t_hash_t cookie from net77.cc — the net52.cc cookie
 * (used for browsing) returns null on net77.cc.
 */
suspend fun bypassForPlay(): String {
    Log.d(TAG, "bypassForPlay: START")
    val (savedCookie, savedTimestamp) = NetflixMirrorStorage.getPlayCookie()

    if (!savedCookie.isNullOrEmpty() && System.currentTimeMillis() - savedTimestamp < 300_000) {
        Log.d(TAG, "bypassForPlay: using cached play cookie")
        return savedCookie
    }

    // Try net77.cc first (where play.php lives), then fall back to others.
    val playDomains = listOf("https://net77.cc", "https://net52.cc", "https://net22.cc")
    for (domain in playDomains) {
        Log.d(TAG, "bypassForPlay: trying $domain")
        val cookie = tryBypassDomain(domain)
        if (cookie.isNotEmpty()) {
            Log.d(TAG, "bypassForPlay: success on $domain")
            NetflixMirrorStorage.savePlayCookie(cookie)
            lastPlayCookie = cookie
            return cookie
        }
    }

    Log.e(TAG, "bypassForPlay: all domains failed")
    NetflixMirrorStorage.clearPlayCookie()
    return ""
}

val newTvBaseHeaders = mapOf(
    "Cache-Control" to "no-cache, no-store, must-revalidate",
    "Pragma" to "no-cache",
    "Expires" to "0",
    "X-Requested-With" to "NetmirrorNewTV v1.0",
    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:136.0) Gecko/20100101 Firefox/136.0 /OS.GatuNewTV v1.0",
    "Accept" to "application/json, text/plain, */*"
)

/**
 * Domains for /check.php (base64-encoded). /check.php returns the real API config
 * including `stape` (streamtape resolver URL) and `u` (streamtape mirror domains).
 * Discovered by decompiling the official NetMirror mobile APK.
 */
val checkDomains = listOf(
    "aHR0cHM6Ly9tb2JpbGVkZXRlY3RzLmNvbQ==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LmFydA==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5jYw==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5saXZl",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5wcm8=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy50b3A=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy54eXo=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0Lmluaw==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnN0b3Jl",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnNwYWNl",
)

fun decodeBase64(value: String): String {
    return String(Base64.getDecoder().decode(value))
}

/**
 * Resolved streamtape resolver URL (the `stape` field from /check.php).
 * This is the URL we call with the video id to get the actual stream link.
 */
private var resolvedStapeUrl: String = ""
private var resolvedStapeUrlTime: Long = 0L
private const val STAPE_URL_TTL_MS = 10 * 60 * 1000L

/**
 * Call /check.php (NOT /checknewtv.php) to get the streamtape resolver URL.
 * The response contains:
 *   token_hash → homepage URL (e.g. https://net52.cc/mobile/home?app=1)
 *   stape      → streamtape resolver URL (e.g. https://net52.cc/streamtape.php)
 *   u          → streamtape mirror domains
 */
suspend fun resolveStapeUrl(force: Boolean = false): String {
    val now = System.currentTimeMillis()
    if (!force && resolvedStapeUrl.isNotBlank() && now - resolvedStapeUrlTime < STAPE_URL_TTL_MS) {
        return resolvedStapeUrl
    }
    for (encoded in checkDomains) {
        val base = try {
            decodeBase64(encoded).trimEnd('/')
        } catch (_: Exception) {
            continue
        }
        try {
            val response = app.get("$base/check.php", headers = newTvBaseHeaders)
            Log.d(TAG, "resolveStapeUrl: $base/check.php HTTP ${response.code}")
            val resp = tryParseJson<CheckResponse>(response.text) ?: continue
            val stapeEncoded = resp.stape ?: continue
            val stape = try {
                decodeBase64(stapeEncoded).trimEnd('/')
            } catch (_: Exception) {
                continue
            }
            if (stape.startsWith("http")) {
                resolvedStapeUrl = stape
                resolvedStapeUrlTime = now
                Log.d(TAG, "resolveStapeUrl: stape=$stape")
                return resolvedStapeUrl
            }
        } catch (_: Exception) {
            // Try next domain.
        }
    }
    throw Exception("Failed to resolve streamtape URL")
}

/**
 * Fetch play.php HTML using WebView. Two-step process:
 *
 *   1. Load net77.cc/verify2 → page JS auto-POSTs to verify.php → t_hash_t cookie
 *      is set in CookieManager for net77.cc (the net52.cc cookie doesn't work here)
 *   2. Load net77.cc/play.php?id=<id> → with the proper net77.cc cookie → real HTML
 *      with data-time/data-h → JW Player calls playlist.php → intercept that URL
 */
suspend fun fetchPlayPhpViaWebView(playUrl: String, cookie: String, ott: String): String? {
    Log.d(TAG, "fetchPlayPhpViaWebView: loading $playUrl")

    val base = "https://net77.cc"
    val cm = CookieManager.getInstance()

    // Set ott + hd cookies (these are domain-agnostic)
    try {
        cm.setAcceptCookie(true)
        cm.setCookie(base, "ott=$ott")
        cm.setCookie(base, "hd=on")
        cm.flush()
    } catch (e: Exception) {
        Log.e(TAG, "fetchPlayPhpViaWebView: failed to set cookies: ${e.message}")
    }

    // STEP 1: Load verify2 in WebView to get a net77.cc t_hash_t cookie.
    // The net52.cc cookie doesn't work on net77.cc — each domain issues its own.
    val hasNet77Cookie = try {
        val existing = cm.getCookie(base)
        Log.d(TAG, "fetchPlayPhpViaWebView: existing cookies: $existing")
        existing != null && existing.contains("t_hash_t=")
    } catch (_: Exception) { false }

    if (!hasNet77Cookie) {
        Log.d(TAG, "fetchPlayPhpViaWebView: no net77.cc t_hash_t cookie — loading verify2")
        try {
            val appUserAgent = "Mozilla/5.0 (Linux; Android 13; Pixel 5 Build/TQ3A.230901.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/144.0.7559.132 Safari/537.36 /OS.Gatu v3.0"
            WebViewResolver(
                interceptUrl = Regex(".^"),
                userAgent = appUserAgent,
                useOkhttp = false,
                additionalUrls = listOf(Regex(".")),
                script = null,
                scriptCallback = null,
                timeout = 30_000L
            ).resolveUsingWebView("$base/verify2") { req ->
                val url = req.url.toString()
                Log.d(TAG, "fetchPlayPhpViaWebView: verify2 request: $url")
                // Stop when we see the homepage (means verify.php succeeded + redirect to home)
                url.contains("/home") || url.contains("mobile/home")
            }

            // Check if t_hash_t cookie is now set
            val cookiesAfter = cm.getCookie(base)
            Log.d(TAG, "fetchPlayPhpViaWebView: cookies after verify2: $cookiesAfter")
        } catch (e: Exception) {
            Log.e(TAG, "fetchPlayPhpViaWebView: verify2 exception: ${e.message}")
        }
    } else {
        Log.d(TAG, "fetchPlayPhpViaWebView: already have net77.cc t_hash_t cookie")
    }

    // STEP 2: Load play.php — now with the proper net77.cc t_hash_t cookie
    var playlistUrlResult: String? = null

    try {
        val appUserAgent = "Mozilla/5.0 (Linux; Android 13; Pixel 5 Build/TQ3A.230901.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/144.0.7559.132 Safari/537.36 /OS.Gatu v3.0"

        val extractScript = """
            (function() {
                try {
                    var body = document.body || document.documentElement;
                    var dt = body.getAttribute('data-time');
                    var dh = body.getAttribute('data-h');
                    var title = body.getAttribute('data-title');
                    if (dt && dh) {
                        return 'DATA:' + JSON.stringify({time: dt, h: dh, title: title || ''});
                    }
                    return 'NODATA:' + document.title + ':' + (body.innerHTML || '').substring(0, 300);
                } catch(e) {
                    return 'ERR:' + e.message;
                }
            })();
        """.trimIndent()

        val (request, _) = WebViewResolver(
            interceptUrl = Regex("playlist\\.php"),
            userAgent = appUserAgent,
            useOkhttp = false,
            additionalUrls = listOf(Regex(".")),
            script = extractScript,
            scriptCallback = { result ->
                Log.d(TAG, "fetchPlayPhpViaWebView: script: ${result?.take(400)}")
            },
            timeout = 60_000L
        ).resolveUsingWebView(playUrl) { req ->
            val url = req.url.toString()
            Log.d(TAG, "fetchPlayPhpViaWebView: play request: $url")
            if (url.contains("playlist.php")) {
                playlistUrlResult = url
                true
            } else {
                false
            }
        }

        if (playlistUrlResult != null) {
            Log.d(TAG, "fetchPlayPhpViaWebView: got playlist.php URL")
            return "PLAYLIST_URL:${playlistUrlResult!!}"
        }

        if (request != null && request.url.toString().contains("playlist.php")) {
            val playlistUrl = request.url.toString()
            Log.d(TAG, "fetchPlayPhpViaWebView: intercepted playlist.php")
            return "PLAYLIST_URL:$playlistUrl"
        }

        Log.e(TAG, "fetchPlayPhpViaWebView: no playlist.php intercepted")
    } catch (e: Exception) {
        Log.e(TAG, "fetchPlayPhpViaWebView: exception: ${e.message}")
    }

    return null
}

/** Extract all cookies from CookieManager for a URL. */
private fun getWebViewCookies(url: String): Map<String, String> {
    return try {
        val cookieStr = CookieManager.getInstance()?.getCookie(url) ?: return emptyMap()
        Log.d(TAG, "getWebViewCookies: raw=$cookieStr")
        cookieStr.split(";").associate {
            val split = it.split("=", limit = 2)
            (split.getOrNull(0)?.trim() ?: "") to (split.getOrNull(1)?.trim() ?: "")
        }.filter { it.key.isNotBlank() && it.value.isNotBlank() }
    } catch (e: Exception) {
        Log.e(TAG, "getWebViewCookies: exception: ${e.message}")
        emptyMap()
    }
}

/** Cached play.php data (time + h hash) per video id. */
data class PlayData(val time: String, val h: String, val title: String)
@Volatile
var cachedPlayData: PlayData? = null
@Volatile
var cachedPlayDataId: String = ""

/**
 * Shared link loader. The website flow (discovered from the actual player HTML):
 *
 *   1. GET /play.php?id=<videoId> with t_hash_t cookie
 *      → returns HTML with <body data-time="<tm>" data-h="<hash>" data-title="<title>">
 *
 *   2. Build /playlist.php?id=<id>&t=<title>&tm=<tm>&h=<hash>
 *      → returns the M3U8 playlist directly (segments like 8040_000.js)
 *
 *   3. Pass the playlist.php URL as an ExtractorLink (M3U8). The player loads
 *      it with the t_hash_t cookie and relative segment URLs resolve against
 *      the playlist.php base.
 *
 * Example from browser capture (Enola Holmes 3, id=81605886):
 *   data-time="1783523107"
 *   data-h="96f2850260193b7d02d11ab66a82d435::59a47f5bc7c14ff56a08c2f3d10bafbe::1783523106::ni::p::a3aa719cb280ec0d31401103d23d833f"
 *   playlist.php?id=81605886&t=Enola%20Holmes%203&tm=1783523107&h=96f285...::...::...
 */
suspend fun loadNewTvLinks(
    id: String,
    ott: String,
    providerName: String,
    cookie: String,
    callback: (ExtractorLink) -> Unit
): Boolean {
    Log.d(TAG, "$providerName: loadLinks id=$id ott=$ott")

    // ════════════════════════════════════════════════════════════════════════════
    // APPROACH 1 (PRIMARY): play.php + playlist.php on net77.cc
    // ════════════════════════════════════════════════════════════════════════════
    // This is the website's native player flow. It does NOT need the NewTV API
    // or OTP. It just needs the t_hash_t cookie from verify.php bypass.
    //
    //   1. GET net77.cc/play.php?id=<id> with t_hash_t cookie
    //      → HTML with <body data-time="<tm>" data-h="<hash>" data-title="<title>">
    //   2. Build net77.cc/playlist.php?id=<id>&t=<title>&tm=<tm>&h=<hash>
    //      → returns M3U8 playlist (segments disguised as .js/.jpg)
    //   3. Pass playlist.php URL as ExtractorLink (getVideoInterceptor forwards cookie)
    //
    // This approach was the original website flow. The NewTV API (approach 2) was
    // a newer CNC decompile addition that used a master OTP "111111" — but the
    // site disabled that OTP around July 2026. So we now use approach 1 as primary.
    // ════════════════════════════════════════════════════════════════════════════
    val playResult = tryPlayPhpFlow(id, ott, providerName, callback)
    if (playResult) {
        Log.d(TAG, "$providerName: play.php flow SUCCEEDED")
        return true
    }
    Log.e(TAG, "$providerName: play.php flow failed, trying NewTV API as fallback")

    // ════════════════════════════════════════════════════════════════════════════
    // APPROACH 2 (FALLBACK): NewTV API (otp.php → player.php) on tv.imgcdn.kim
    // ════════════════════════════════════════════════════════════════════════════
    // This used the hardcoded master OTP "111111" which the site disabled.
    // It's kept as a fallback in case the site re-enables it or for older content.
    // ════════════════════════════════════════════════════════════════════════════
    val apiBase = try {
        resolvePlayerApiBase()
    } catch (e: Exception) {
        Log.e(TAG, "$providerName: resolveApiUrl failed: ${e.message}")
        return false
    }
    Log.d(TAG, "$providerName: apiBase=$apiBase")

    // Step 1: Get usertoken via otp.php with hardcoded OTP "111111"
    val userToken = getNewTvUserToken(apiBase, ott)
    Log.d(TAG, "$providerName: userToken=${if (userToken.isNotEmpty()) "YES (${userToken.length} chars)" else "NO"}")

    if (userToken.isEmpty()) {
        Log.e(TAG, "$providerName: failed to get usertoken")
        return false
    }

    // Step 2: Call player.php with the usertoken
    val headers = buildNewTvHeaders(ott, mapOf("Usertoken" to userToken))
    val url = "$apiBase/newtv/player.php?id=$id"

    try {
        val res = app.get(url, headers = headers)
        Log.d(TAG, "$providerName: player.php?id=$id HTTP ${res.code}")
        Log.d(TAG, "$providerName: player.php response: ${res.text.take(500)}")

        if (res.code != 200) return false

        val resp = tryParseJson<NewTvPlayerResponse>(res.text)
        if (resp == null) {
            Log.e(TAG, "$providerName: failed to parse player.php response")
            return false
        }

        Log.d(TAG, "$providerName: status=${resp.status} video_link=${resp.video_link?.take(60)}")

        if (resp.status != "ok" || resp.video_link.isNullOrBlank()) {
            Log.e(TAG, "$providerName: no valid video_link (status=${resp.status})")
            return false
        }

        Log.d(TAG, "$providerName: got video_link: ${resp.video_link}")
        callback.invoke(
            newExtractorLink(providerName, providerName, resp.video_link, type = ExtractorLinkType.M3U8) {
                this.referer = resp.referer ?: apiBase
            }
        )
        return true
    } catch (e: Exception) {
        Log.e(TAG, "$providerName: player.php exception: ${e.message}")
        return false
    }
}

/**
 * PRIMARY approach: play.php + playlist.php flow on net77.cc.
 *
 * Tries two methods:
 *   1. Direct fetch: app.get play.php with t_hash_t cookie, parse data-time/data-h
 *   2. WebView fallback: fetchPlayPhpViaWebView (loads page in WebView, intercepts playlist.php)
 *
 * Returns true if a link was added to callback.
 */
private suspend fun tryPlayPhpFlow(
    id: String,
    ott: String,
    providerName: String,
    callback: (ExtractorLink) -> Unit
): Boolean {
    Log.d(TAG, "$providerName: tryPlayPhpFlow START id=$id ott=$ott")

    // Step 1: Get the play domain cookie (net77.cc t_hash_t)
    val playCookie = bypassForPlay()
    if (playCookie.isEmpty()) {
        Log.e(TAG, "$providerName: tryPlayPhpFlow: bypassForPlay failed")
        return false
    }
    Log.d(TAG, "$providerName: tryPlayPhpFlow: got play cookie")

    // Step 2: Try direct fetch of play.php (no WebView — faster)
    val playDomain = "https://net77.cc"
    val playUrl = "$playDomain/play.php?id=$id"
    val appUserAgent = "Mozilla/5.0 (Linux; Android 13; Pixel 5 Build/TQ3A.230901.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/144.0.7559.132 Safari/537.36 /OS.Gatu v3.0"

    try {
        val res = app.get(
            playUrl,
            headers = mapOf(
                "User-Agent" to appUserAgent,
                "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Accept-Language" to "en-US,en;q=0.5",
                "Referer" to "$playDomain/"
            ),
            cookies = mapOf(
                "t_hash_t" to playCookie,
                "ott" to ott,
                "hd" to "on"
            ),
            timeout = 15_000L
        )
        Log.d(TAG, "$providerName: tryPlayPhpFlow: play.php HTTP ${res.code} size=${res.text.length}")

        if (res.code == 200 && res.text.length > 500) {
            // Parse data-time and data-h from the HTML body tag
            val dataTime = Regex("""data-time=["']([^"']+)["']""").find(res.text)?.groupValues?.get(1)
            val dataH = Regex("""data-h=["']([^"']+)["']""").find(res.text)?.groupValues?.get(1)
            val dataTitle = Regex("""data-title=["']([^"']+)["']""").find(res.text)?.groupValues?.get(1) ?: ""

            Log.d(TAG, "$providerName: tryPlayPhpFlow: data-time=$dataTime data-h=${dataH?.take(40)}...")

            if (!dataTime.isNullOrBlank() && !dataH.isNullOrBlank()) {
                // Build the playlist.php URL
                val encodedTitle = java.net.URLEncoder.encode(dataTitle, "UTF-8")
                val playlistUrl = "$playDomain/playlist.php?id=$id&t=$encodedTitle&tm=$dataTime&h=$dataH"
                Log.d(TAG, "$providerName: tryPlayPhpFlow: built playlist URL: ${playlistUrl.take(80)}...")

                callback.invoke(
                    newExtractorLink(providerName, providerName, playlistUrl, type = ExtractorLinkType.M3U8) {
                        this.referer = "$playDomain/"
                        this.headers = mapOf(
                            "User-Agent" to appUserAgent,
                            "Cookie" to "t_hash_t=$playCookie; ott=$ott; hd=on"
                        )
                    }
                )
                return true
            } else {
                Log.e(TAG, "$providerName: tryPlayPhpFlow: no data-time/data-h in HTML (title=${res.text.take(100)})")
            }
        } else {
            Log.e(TAG, "$providerName: tryPlayPhpFlow: play.php returned ${res.code} (likely CF challenge)")
        }
    } catch (e: Exception) {
        Log.e(TAG, "$providerName: tryPlayPhpFlow: direct fetch exception: ${e.message}")
    }

    // Step 3: Direct fetch failed (CF challenge or no data attributes) — use WebView
    Log.d(TAG, "$providerName: tryPlayPhpFlow: falling back to WebView")
    try {
        val result = fetchPlayPhpViaWebView(playUrl, playCookie, ott)
        if (result != null && result.startsWith("PLAYLIST_URL:")) {
            val playlistUrl = result.removePrefix("PLAYLIST_URL:")
            Log.d(TAG, "$providerName: tryPlayPhpFlow: WebView got playlist URL: ${playlistUrl.take(80)}...")

            // The WebView already set cookies in CookieManager. The getVideoInterceptor
            // will forward them on playlist/segment requests.
            callback.invoke(
                newExtractorLink(providerName, providerName, playlistUrl, type = ExtractorLinkType.M3U8) {
                    this.referer = "$playDomain/"
                    this.headers = mapOf("User-Agent" to appUserAgent)
                }
            )
            return true
        }
        Log.e(TAG, "$providerName: tryPlayPhpFlow: WebView returned no playlist URL")
    } catch (e: Exception) {
        Log.e(TAG, "$providerName: tryPlayPhpFlow: WebView exception: ${e.message}")
    }

    return false
}

/**
 * Get NewTV user token via otp.php with hardcoded OTP "111111".
 * Discovered by decompiling CNC v93 .cs3 — the server accepts "111111" as a
 * master OTP, returning a usertoken that unlocks real video_link from player.php.
 */
suspend fun getNewTvUserToken(apiBase: String, ott: String): String {
    // Check cached token first (24h TTL, per-ott)
    val (savedToken, savedTimestamp) = NetflixMirrorStorage.getUserToken()
    if (!savedToken.isNullOrEmpty() && System.currentTimeMillis() - savedTimestamp < 86_400_000) {
        Log.d(TAG, "getNewTvUserToken: using cached token")
        return savedToken
    }

    val otpHeaders = mapOf(
        "accept" to "application/json, text/plain, */*",
        "cache-control" to "no-cache, no-store, must-revalidate",
        "Connection" to "Keep-Alive",
        "expires" to "0",
        "otp" to "111111",
        "pragma" to "no-cache",
        "user-agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:136.0) Gecko/20100101 Firefox/136.0 /OS.Gatu v1.0"
    )

    return try {
        val res = app.get("$apiBase/newtv/otp.php", headers = otpHeaders)
        Log.d(TAG, "getNewTvUserToken: otp.php HTTP ${res.code}, body=${res.text.take(300)}")

        val resp = tryParseJson<NewTvOtpResponse>(res.text)
        if (resp != null && !resp.usertoken.isNullOrBlank()) {
            Log.d(TAG, "getNewTvUserToken: got usertoken (${resp.usertoken.length} chars)")
            NetflixMirrorStorage.saveUserToken(resp.usertoken)
            resp.usertoken
        } else {
            Log.e(TAG, "getNewTvUserToken: no usertoken in response, status=${resp?.status}")
            ""
        }
    } catch (e: Exception) {
        Log.e(TAG, "getNewTvUserToken: exception: ${e.message}")
        ""
    }
}

// Legacy compat
suspend fun resolveApiUrl(): String {
    return netMirrorWorkingDomain
}

/**
 * Resolve the NewTV player API base URL (tv.imgcdn.kim) from /checknewtv.php.
 * This is the website-based flow: checknewtv.php returns token_hash which
 * base64-decodes to the player API base.
 */
private var resolvedPlayerApiBase: String = ""
private var resolvedPlayerApiBaseTime: Long = 0L
private const val PLAYER_API_TTL_MS = 10 * 60 * 1000L

suspend fun resolvePlayerApiBase(force: Boolean = false): String {
    val now = System.currentTimeMillis()
    if (!force && resolvedPlayerApiBase.isNotBlank() && now - resolvedPlayerApiBaseTime < PLAYER_API_TTL_MS) {
        return resolvedPlayerApiBase
    }
    for (encoded in checkDomains) {
        val base = try {
            decodeBase64(encoded).trimEnd('/')
        } catch (_: Exception) {
            continue
        }
        try {
            val response = app.get("$base/checknewtv.php", headers = newTvBaseHeaders)
            Log.d(TAG, "resolvePlayerApiBase: $base/checknewtv.php HTTP ${response.code}")
            val resp = tryParseJson<NewTvTokenResponse>(response.text) ?: continue
            val tokenHash = resp.token_hash ?: continue
            val decoded = try {
                decodeBase64(tokenHash).trimEnd('/')
            } catch (_: Exception) {
                continue
            }
            if (decoded.startsWith("http")) {
                resolvedPlayerApiBase = decoded
                resolvedPlayerApiBaseTime = now
                Log.d(TAG, "resolvePlayerApiBase: $decoded")
                return resolvedPlayerApiBase
            }
        } catch (_: Exception) {
            // Try next domain.
        }
    }
    throw Exception("Failed to resolve NewTV player API base URL")
}

fun buildNewTvHeaders(ott: String, extra: Map<String, String> = emptyMap()): Map<String, String> {
    val result = newTvBaseHeaders.toMutableMap()
    result["Ott"] = ott
    extra.forEach { (key, value) -> result[key] = value }
    return result
}

data class CheckResponse(
    val token_hash: String? = null,
    val doms: String? = null,
    val mwin: String? = null,
    val popwin: String? = null,
    val `var`: String? = null,
    val stape: String? = null,
    val u: List<String>? = null
)

data class StreamtapeResponse(
    val status: String? = null,
    val video_link: String? = null,
    val link: String? = null,
    val url: String? = null,
    val file: String? = null,
    val source: String? = null,
    val referer: String? = null,
    val sources: List<Source>? = null
)

data class NewTvTokenResponse(
    val token_hash: String? = null,
    val doms: String? = null,
    val mwin: String? = null,
    val popwin: String? = null,
    val `var`: String? = null
)

data class NewTvPlayerResponse(
    val status: String? = null,
    val ott: String? = null,
    val usertoken: String? = null,
    val video_link: String? = null,
    val referer: String? = null,
    val error: String? = null,
    val title: String? = null,
    val ep: String? = null,
    val ep_title: String? = null
)


data class NewTvOtpResponse(
    val otp: String? = null,
    val status: String? = null,
    val usertoken: String? = null,
    val pub_msg: String? = null,
    val pub_msg_f_size: Int? = null,
    val pub_msg_color: String? = null
)
