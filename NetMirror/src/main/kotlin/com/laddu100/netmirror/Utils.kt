package com.laddu100.netmirror

import com.laddu100.netmirror.entities.Source
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.INFER_TYPE
import com.lagradost.cloudstream3.network.WebViewResolver
import com.fasterxml.jackson.core.json.JsonReadFeature
import com.fasterxml.jackson.core.type.TypeReference
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

/** Shared Jackson ObjectMapper for parsing JSON with TypeReference (avoids type erasure). */
val netMirrorMapper: ObjectMapper = jacksonObjectMapper().configure(
    DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false
).configure(
    JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature(), true
)

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

    // Collect ALL cookies from verify2 + verify.php (site sets t_hash, NOT t_hash_t)
    val allCookies = mutableMapOf<String, String>()

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
                    allCookies[name] = value
                    Log.d(TAG, "bypass: verify2 set $name=${value.take(50)}...")
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
            response.headers("Set-Cookie").forEach { sc ->
                val name = sc.substringBefore("=", "").trim()
                val value = sc.substringAfter("=", "").substringBefore(";").trim()
                if (name.isNotEmpty() && value.isNotEmpty()) {
                    allCookies[name] = value
                    Log.d(TAG, "bypass: verify.php set $name=${value.take(50)}...")
                }
            }
            // Return ALL cookies as a cookie string — send everything to play.php
            if (allCookies.isEmpty()) "" else allCookies.entries.joinToString("; ") { "${it.key}=${it.value}" }
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
        val fullCookies = tryBypassDomain(domain)
        if (fullCookies.isNotEmpty()) {
            Log.d(TAG, "bypass: success on $domain")
            netMirrorWorkingDomain = domain
            // Extract just the t_hash (or t_hash_t) value for backward compat with providers
            // Providers use: cookies = mapOf("t_hash_t" to cookie_value)
            val cookieValue = extractCookieValue(fullCookies, "t_hash")
                ?: extractCookieValue(fullCookies, "t_hash_t")
                ?: fullCookies  // fallback: return everything
            NetflixMirrorStorage.saveCookie(cookieValue)
            return cookieValue
        }
    }

    Log.e(TAG, "bypass: all ${candidateDomains.size} domains failed")
    NetflixMirrorStorage.clearCookie()
    return ""
}

/** Extract a specific cookie value from a "name=value; name=value" string. */
private fun extractCookieValue(cookieStr: String, name: String): String? {
    for (part in cookieStr.split(";")) {
        val trimmed = part.trim()
        if (trimmed.startsWith("$name=")) {
            return trimmed.substringAfter("=")
        }
    }
    return null
}

/**
 * Bypass specifically for the play domain (net77.cc).
 *
 * The site now sets `t_hash_p` (play hash with ::ni::p) and `user_token` cookies
 * via JavaScript during the Cloudflare challenge resolution. These CANNOT be
 * obtained via HTTP requests alone — they need a real browser engine (WebView)
 * to execute the JavaScript that sets them.
 *
 * This function:
 *   1. Tries HTTP bypass first (verify.php) — may get t_hash but NOT t_hash_p/user_token
 *   2. Falls back to WebView bypass — loads the homepage, lets JS run, extracts ALL cookies
 *
 * Returns the FULL cookie string (all name=value pairs separated by "; ").
 */
suspend fun bypassForPlay(): String {
    Log.d(TAG, "bypassForPlay: START")
    val (savedCookie, savedTimestamp) = NetflixMirrorStorage.getPlayCookie()

    // Cache for 5 minutes
    if (!savedCookie.isNullOrEmpty() && System.currentTimeMillis() - savedTimestamp < 300_000) {
        // Check if the cached cookie has user_token (the critical cookie for ::ni::p)
        if (savedCookie.contains("user_token=")) {
            Log.d(TAG, "bypassForPlay: using cached play cookie (has user_token)")
            return savedCookie
        }
        Log.d(TAG, "bypassForPlay: cached cookie is stale (no user_token), refreshing")
    }

    // STEP 1: Try HTTP bypass first (fast — gets t_hash)
    val playDomains = listOf("https://net77.cc", "https://net52.cc", "https://net22.cc")
    for (domain in playDomains) {
        Log.d(TAG, "bypassForPlay: trying HTTP bypass on $domain")
        val cookie = tryBypassDomain(domain)
        if (cookie.isNotEmpty()) {
            Log.d(TAG, "bypassForPlay: HTTP bypass success on $domain")
            // Check if we got t_hash_p (the critical cookie)
            if (cookie.contains("t_hash_p")) {
                Log.d(TAG, "bypassForPlay: got t_hash_p from HTTP — using directly")
                NetflixMirrorStorage.savePlayCookie(cookie)
                lastPlayCookie = cookie
                return cookie
            }
            // No t_hash_p — need WebView to get it
            Log.d(TAG, "bypassForPlay: HTTP bypass got cookies but no t_hash_p — trying WebView")
            break
        }
    }

    // STEP 2: WebView bypass — loads homepage, lets JS set t_hash_p + user_token
    Log.d(TAG, "bypassForPlay: trying WebView bypass")
    val webViewCookies = fetchAllCookiesViaWebView("https://net77.cc/home")
    if (webViewCookies.isNotEmpty()) {
        Log.d(TAG, "bypassForPlay: WebView bypass success, cookies: ${webViewCookies.take(100)}...")
        NetflixMirrorStorage.savePlayCookie(webViewCookies)
        lastPlayCookie = webViewCookies
        return webViewCookies
    }

    // STEP 3: Last resort — use whatever HTTP cookies we got (even without t_hash_p)
    for (domain in playDomains) {
        val cookie = tryBypassDomain(domain)
        if (cookie.isNotEmpty()) {
            Log.d(TAG, "bypassForPlay: using HTTP cookies as fallback (no t_hash_p)")
            NetflixMirrorStorage.savePlayCookie(cookie)
            lastPlayCookie = cookie
            return cookie
        }
    }

    Log.e(TAG, "bypassForPlay: all methods failed")
    NetflixMirrorStorage.clearPlayCookie()
    return ""
}

/**
 * Load net77.cc/home in WebView, solve Cloudflare challenge, extract ALL cookies.
 *
 * The site sets these cookies via JavaScript during the CF challenge:
 *   - t_hash_p  (play hash with ::ni::p — allows real content)
 *   - user_token (32-char hex — REQUIRED for POST play.php to return ::ni::p)
 *   - cf_clearance (standard Cloudflare clearance)
 *   - t_hash (from verify.php)
 *
 * This function:
 *   1. Clears old cookies (prevents stale t_hash_p from blocking fresh CF challenge)
 *   2. Loads net77.cc/home in WebView with a real Android Chrome UA
 *   3. Waits for CF challenge to resolve (polls CookieManager for user_token)
 *   4. Waits extra time for JS to finish setting all cookies
 *   5. Extracts and returns all cookies
 */
private suspend fun fetchAllCookiesViaWebView(url: String): String {
    Log.d(TAG, "fetchAllCookiesViaWebView: START url=$url")
    val cm = CookieManager.getInstance()
    cm.setAcceptCookie(true)
    cm.setAcceptThirdPartyCookies(null, true)

    // Clear ALL old cookies for net77.cc/net52.cc — stale t_hash_p or cf_clearance
    // can cause the CF challenge to loop or fail
    listOf("https://net77.cc", "https://net52.cc", "https://net22.cc").forEach { domain ->
        try {
            val existing = cm.getCookie(domain) ?: ""
            existing.split(";").forEach { cookie ->
                val name = cookie.trim().substringBefore("=", "").trim()
                if (name.isNotEmpty()) {
                    cm.setCookie(domain, "$name=; Max-Age=0; expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/")
                }
            }
        } catch (_: Exception) {}
    }
    cm.flush()
    Log.d(TAG, "fetchAllCookiesViaWebView: cleared old cookies")

    // Real Android Chrome UA — CF challenge checks this
    val appUserAgent = "Mozilla/5.0 (Linux; Android 13; Pixel 5 Build/TQ3A.230901.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/144.0.7559.132 Safari/537.36"

    try {
        // STEP 1: Load the page in WebView, wait for CF challenge to resolve
        // The CF challenge redirects to verify2 → verify.php → home
        // We wait until we see the homepage URL (means CF + verify completed)
        Log.d(TAG, "fetchAllCookiesViaWebView: loading page, waiting for CF challenge...")
        WebViewResolver(
            interceptUrl = Regex("^https?://net(77|52|22|99|50)\\.cc/(home|mobile/home|verify2|verify\\.php)"),
            userAgent = appUserAgent,
            useOkhttp = false,
            additionalUrls = listOf(Regex(".")),
            script = null,
            scriptCallback = null,
            timeout = 60_000L  // 60 seconds — CF challenge can take a while
        ).resolveUsingWebView(url) { req ->
            val reqUrl = req.url.toString()
            Log.d(TAG, "fetchAllCookiesViaWebView: request: $reqUrl")
            // Stop when we reach the homepage (CF + verify completed)
            reqUrl.contains("/home") || reqUrl.contains("mobile/home")
        }

        // STEP 2: Poll for user_token cookie — this is set by JS AFTER the page loads
        // Give it up to 15 more seconds after the page loads
        Log.d(TAG, "fetchAllCookiesViaWebView: page loaded, polling for user_token cookie...")
        var userTokenFound = false
        for (i in 1..15) {
            kotlinx.coroutines.delay(1000)  // 1 second per poll
            cm.flush()
            val cookies = cm.getCookie("https://net77.cc") ?: ""
            if (cookies.contains("user_token=")) {
                Log.d(TAG, "fetchAllCookiesViaWebView: user_token found after ${i}s!")
                userTokenFound = true
                break
            }
            if (i % 5 == 0) {
                Log.d(TAG, "fetchAllCookiesViaWebView: still waiting for user_token (${i}s), current cookies: ${cookies.take(100)}...")
            }
        }

        if (!userTokenFound) {
            Log.e(TAG, "fetchAllCookiesViaWebView: user_token NOT found after 15s")
        }

        // STEP 3: Extract ALL cookies from CookieManager
        cm.flush()
        val cookies77 = cm.getCookie("https://net77.cc") ?: ""
        val cookies52 = cm.getCookie("https://net52.cc") ?: ""
        Log.d(TAG, "fetchAllCookiesViaWebView: net77.cc cookies: ${cookies77.take(200)}...")
        Log.d(TAG, "fetchAllCookiesViaWebView: net52.cc cookies: ${cookies52.take(100)}...")

        // Check if we got the critical cookies
        val hasUserToken = cookies77.contains("user_token=")
        val hasT_hash_p = cookies77.contains("t_hash_p=")
        Log.d(TAG, "fetchAllCookiesViaWebView: hasUserToken=$hasUserToken hasT_hash_p=$hasT_hash_p")

        // Combine all cookies (net77.cc has the important ones)
        val allCookies = mutableListOf<String>()
        if (cookies77.isNotBlank()) allCookies.add(cookies77)
        if (cookies52.isNotBlank()) {
            val names77 = cookies77.split(";").map { it.trim().substringBefore("=", "").trim() }.toSet()
            cookies52.split(";").forEach { c ->
                val name = c.trim().substringBefore("=", "").trim()
                if (name.isNotEmpty() && name !in names77) allCookies.add(c.trim())
            }
        }

        val result = allCookies.joinToString("; ")
        Log.d(TAG, "fetchAllCookiesViaWebView: END, ${allCookies.size} cookie parts, hasUserToken=$hasUserToken")
        return result
    } catch (e: Exception) {
        Log.e(TAG, "fetchAllCookiesViaWebView: exception: ${e.message}")
        return ""
    }
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
    callback: (ExtractorLink) -> Unit,
    subtitleCallback: (SubtitleFile) -> Unit = {},
    episodeTitle: String = ""
): Boolean {
    Log.d(TAG, "$providerName: loadLinks id=$id ott=$ott title='$episodeTitle'")

    // ════════════════════════════════════════════════════════════════════════════
    // NEW FLOW (confirmed from DevTools HAR + logcat, July 2026):
    //
    //   1. POST net77.cc/play.php with body "id=<videoId>" + play cookie
    //      → returns {"h":"in=<HASH>"}
    //
    //   2. Extract tm (timestamp) from the HASH's 3rd segment
    //      Use episodeTitle (already passed from the provider — no need to GET play.php)
    //
    //   3. GET net52.cc/playlist.php?id=<id>&t=<title>&tm=<tm>&h=<HASH>
    //      → JSON with m3u8 sources + subtitles
    //
    //   4. Pass each source as ExtractorLink (M3U8) on net52.cc
    //
    // KEY INSIGHT from HAR: the GET play.php has NO cookies — the `in` hash in the
    // URL is the authentication. We skip the GET play.php entirely since we already
    // have the title from the episode data.
    // ════════════════════════════════════════════════════════════════════════════

    val browseDomain = netMirrorWorkingDomain  // e.g. https://net52.cc
    val browserUA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/150.0.0.0 Safari/537.36 Edg/150.0.0.0"

    // STEP 0: Get ALL cookies from the play domain (t_hash, t_hash_t, etc.)
    val playCookieStr = bypassForPlay()
    if (playCookieStr.isEmpty()) {
        Log.e(TAG, "$providerName: bypassForPlay failed — cannot POST play.php")
        return false
    }
    Log.d(TAG, "$providerName: got play cookies: ${playCookieStr.take(80)}...")

    // Check if we have the critical user_token cookie
    val hasUserToken = playCookieStr.contains("user_token=")
    Log.d(TAG, "$providerName: hasUserToken=$hasUserToken (REQUIRED for ::ni::p real content)")
    if (!hasUserToken) {
        Log.e(TAG, "$providerName: WARNING — no user_token cookie! POST will return ::ni::i:: (10-min placeholder)")
    }

    // STEP 1: POST play.php to get the `in` hash
    val postDomains = listOf("https://net77.cc", "https://net52.cc", "https://net22.cc", "https://net99.cc", "https://net50.cc")
    var inHash = ""

    for (domain in postDomains) {
        // Send ALL cookies from verify.php + ott + hd as a raw Cookie header
        val fullCookieStr = "$playCookieStr; ott=$ott; hd=on"
        val postHeaders = mapOf(
            "Accept" to "*/*",
            "Content-Type" to "application/x-www-form-urlencoded; charset=UTF-8",
            "Origin" to domain,
            "Referer" to "$domain/home",
            "User-Agent" to browserUA,
            "X-Requested-With" to "XMLHttpRequest",
            "Cookie" to fullCookieStr
        )

        try {
            val res = app.post(
                "$domain/play.php",
                requestBody = FormBody.Builder().add("id", id).build(),
                headers = postHeaders,
                timeout = 15_000L
            )
            Log.d(TAG, "$providerName: POST $domain/play.php HTTP ${res.code} body=${res.text.take(200)}")

            if (res.code == 200) {
                val resp = tryParseJson<PlayPostResponse>(res.text)
                val hField = resp?.h ?: ""
                if (hField.startsWith("in=")) {
                    inHash = hField.removePrefix("in=")
                    Log.d(TAG, "$providerName: got in hash from $domain: ${inHash.take(60)}...")
                    break
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "$providerName: POST $domain/play.php exception: ${e.message}")
        }
    }

    if (inHash.isBlank()) {
        Log.e(TAG, "$providerName: POST play.php failed on all domains")
        return false
    }

    // Check if we got ::ni::p (real content) or ::ni::i (placeholder)
    val hashType = inHash.split("::").getOrNull(3) ?: "?"
    val hashUserToken = inHash.split("::").getOrNull(4) ?: ""
    Log.d(TAG, "$providerName: hash type=$hashType user_token_in_hash=${hashUserToken.take(20)}...")
    if (hashType == "i") {
        Log.e(TAG, "$providerName: GOT ::ni::i:: (PLACEHOLDER 10-MIN VIDEO) — user_token cookie missing or invalid!")
    } else if (hashType == "p") {
        Log.d(TAG, "$providerName: GOT ::ni::p:: (REAL CONTENT) ✅")
    }

    // STEP 2: Extract tm (timestamp) from the hash's 3rd segment
    // Hash format: <seg1>::<seg2>::<timestamp>::ni::<type>::<seg5>
    val tm = inHash.split("::").getOrNull(2) ?: ""
    if (tm.isBlank()) {
        Log.e(TAG, "$providerName: no timestamp in hash")
        return false
    }
    Log.d(TAG, "$providerName: tm=$tm title='$episodeTitle'")

    // STEP 3: GET playlist.php on the BROWSE domain
    // No cookies needed — the `in` hash in the URL is the authentication
    // (confirmed from HAR: the browser's GET play.php had NO Cookie header)
    val encodedTitle = java.net.URLEncoder.encode(episodeTitle, "UTF-8")
    val playlistUrl = "$browseDomain/playlist.php?id=$id&t=$encodedTitle&tm=$tm&h=$inHash"
    val playPageUrl = "$browseDomain/play.php?id=$id&in=$inHash"

    val playlistHeaders = mapOf(
        "Accept" to "*/*",
        "Referer" to playPageUrl,
        "User-Agent" to browserUA,
        "X-Requested-With" to "XMLHttpRequest"
    )

    try {
        val res = app.get(playlistUrl, headers = playlistHeaders, timeout = 15_000L)
        Log.d(TAG, "$providerName: playlist.php HTTP ${res.code} size=${res.text.length}")

        if (res.code != 200) {
            Log.e(TAG, "$providerName: playlist.php failed (code=${res.code})")
            return false
        }

        val playlist = try {
            netMirrorMapper.readValue(res.text, object : TypeReference<List<PlaylistItem>>() {})
        } catch (e: Exception) {
            Log.e(TAG, "$providerName: playlist.php parse failed: ${e.message} body=${res.text.take(200)}")
            null
        }
        if (playlist.isNullOrEmpty()) {
            Log.e(TAG, "$providerName: playlist.php returned no items, body=${res.text.take(200)}")
            return false
        }

        var found = false
        for (item in playlist) {
            // Pass subtitles
            item.tracks?.forEach { track ->
                if (track.kind == "captions" && !track.file.isNullOrBlank()) {
                    val subUrl = track.file!!.let {
                        if (it.startsWith("//")) "https:$it" else it
                    }
                    val label = track.label ?: track.language ?: "Subtitle"
                    subtitleCallback.invoke(SubtitleFile(label, subUrl))
                    Log.d(TAG, "$providerName: subtitle '$label' added")
                }
            }

            // Pass each source as an ExtractorLink
            item.sources?.forEach { source ->
                val file = source.file ?: return@forEach
                if (file.isBlank()) return@forEach

                val fullUrl = if (file.startsWith("http")) file else "$browseDomain$file"
                val label = source.label ?: providerName
                val displayLabel = "$providerName - $label"

                Log.d(TAG, "$providerName: source label='$label' url=${fullUrl.take(80)}...")

                callback.invoke(
                    newExtractorLink(displayLabel, displayLabel, fullUrl, type = ExtractorLinkType.M3U8) {
                        this.referer = playPageUrl
                        this.headers = mapOf(
                            "Origin" to browseDomain,
                            "User-Agent" to browserUA
                        )
                    }
                )
                found = true
            }
        }

        Log.d(TAG, "$providerName: loadLinks END found=$found")
        return found
    } catch (e: Exception) {
        Log.e(TAG, "$providerName: playlist.php exception: ${e.message}")
        return false
    }
}

// Response from POST play.php: {"h":"in=<hash>"}
data class PlayPostResponse(
    val h: String? = null
)

// Playlist item from playlist.php
data class PlaylistItem(
    val title: String? = null,
    val sources: List<PlaylistSource>? = null,
    val tracks: List<PlaylistTrack>? = null
)

data class PlaylistSource(
    val file: String? = null,
    val label: String? = null,
    val type: String? = null,
    val default: String? = null
)

data class PlaylistTrack(
    val kind: String? = null,
    val file: String? = null,
    val label: String? = null,
    val language: String? = null
)

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
