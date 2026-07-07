package com.laddu100.netmirror

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
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
import com.lagradost.api.Log
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

suspend fun bypass(mainUrl: String): String {
    // Check persistent storage first
    val (savedCookie, savedTimestamp) = NetflixMirrorStorage.getCookie()

    // Return cached cookie if valid (≤15 hours old)
    if (!savedCookie.isNullOrEmpty() && System.currentTimeMillis() - savedTimestamp < 54_000_000) {
        return savedCookie
    }

    val newCookie = try {
        val headers = mapOf(
            "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
            "Accept-Encoding" to "gzip, deflate, br, zstd",
            "Accept-Language" to "en-US,en;q=0.9",
            "Cache-Control" to "max-age=0",
            "Connection" to "keep-alive",
            "Content-Type" to "application/x-www-form-urlencoded",
            "Origin" to "https://net22.cc",
            "Referer" to "https://net22.cc/verify2",
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
        val formBody = FormBody.Builder()
            .add("g-recaptcha-response", UUID.randomUUID().toString())
            .build()
        val client = app.baseClient.newBuilder()
            .followRedirects(false)
            .followSslRedirects(false)
            .build()
        val request = Request.Builder()
            .url("https://net52.cc/verify.php")
            .post(formBody)
            .apply {
                headers.forEach { (key, value) ->
                    addHeader(key, value)
                }
            }
            .build()
        client.newCall(request).execute().use { response ->
            response.headers("Set-Cookie")
                .firstOrNull { it.startsWith("t_hash_t=") }
                ?.substringAfter("t_hash_t=")
                ?.substringBefore(";")
                .orEmpty()
        }
    } catch (e: Exception) {
        // Clear invalid cookie on failure
        NetflixMirrorStorage.clearCookie()
        throw e
    }

    // Persist the new cookie
    if (newCookie.isNotEmpty()) {
        NetflixMirrorStorage.saveCookie(newCookie)
    }
    return newCookie
}

val newTvBaseHeaders = mapOf(
    "Cache-Control" to "no-cache, no-store, must-revalidate",
    "Pragma" to "no-cache",
    "Expires" to "0",
    "X-Requested-With" to "NetmirrorNewTV v1.0",
    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:136.0) Gecko/20100101 Firefox/136.0 /OS.GatuNewTV v1.0",
    "Accept" to "application/json, text/plain, */*"
)

val newTvDomains = listOf(
    "aHR0cHM6Ly9tb2JpbGVkZXRlY3RzLmNvbQ==",
    "aHR0cHM6Ly9tb2JpbGVkZXRlY3QuYXBw",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LmFydA==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LmNj",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LmNsaWNr",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0Lmluaw==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LmxpdmU=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnBybw==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnNob3A=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnNpdGU=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnNwYWNl",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnN0b3Jl",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LnZpcA==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0Lndpa2k=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0Lnh5eg==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5hcnQ=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5jYw==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5pbmZv",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5pbms=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5saXZl",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5wcm8=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy5zdG9yZQ==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy50b3A=",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0cy54eXo="
)

fun decodeBase64(value: String): String {
    return String(Base64.getDecoder().decode(value))
}

// Resolved NewTV API base URL, cached with a TTL so a stale value doesn't break
// every subsequent loadLinks call. Can be force-refreshed when a request fails.
private var resolvedApiUrl: String = ""
private var resolvedApiUrlTime: Long = 0L
private const val API_URL_TTL_MS = 10 * 60 * 1000L // 10 minutes

suspend fun resolveApiUrl(force: Boolean = false): String {
    val now = System.currentTimeMillis()
    if (!force && resolvedApiUrl.isNotBlank() && now - resolvedApiUrlTime < API_URL_TTL_MS) {
        return resolvedApiUrl
    }
    for ((index, encoded) in newTvDomains.withIndex()) {
        val base = try {
            decodeBase64(encoded).trimEnd('/')
        } catch (_: Exception) {
            continue
        }
        try {
            val response = app.get("$base/checknewtv.php", headers = newTvBaseHeaders)
                .parsed<NewTvTokenResponse>()
            val tokenHash = response.token_hash
            if (!tokenHash.isNullOrBlank()) {
                val decoded = try {
                    decodeBase64(tokenHash).trimEnd('/')
                } catch (_: Exception) {
                    null
                }
                if (!decoded.isNullOrBlank() && decoded.startsWith("http")) {
                    resolvedApiUrl = decoded
                    resolvedApiUrlTime = now
                    Log.d(TAG, "resolveApiUrl: resolved to $decoded (domain #$index)")
                    return resolvedApiUrl
                }
            }
        } catch (_: Exception) {
            // Try next domain.
        }
    }
    throw Exception("Failed to resolve NewTV API base URL (tried ${newTvDomains.size} domains)")
}

fun invalidateResolvedApiUrl() {
    resolvedApiUrl = ""
    resolvedApiUrlTime = 0L
}

fun buildNewTvHeaders(ott: String, extra: Map<String, String> = emptyMap()): Map<String, String> {
    val result = newTvBaseHeaders.toMutableMap()
    result["Ott"] = ott
    extra.forEach { (key, value) ->
        result[key] = value
    }
    return result
}

/**
 * Shared link loader used by all four mirror providers.
 * - Resolves the NewTV API base URL (with TTL caching)
 * - Calls player.php with the provider's ott value
 * - On request failure, invalidates the cache and retries once with a fresh resolution
 * - Logs every step with com.lagradost.api.Log so failures are visible in logcat
 * - Accepts ANY status as long as a video_link is present (the API changed "ok" → "otp"
 *   but still returns a valid link)
 */
suspend fun loadNewTvLinks(
    id: String,
    ott: String,
    providerName: String,
    callback: (ExtractorLink) -> Unit
): Boolean {
    Log.d(TAG, "$providerName: loadLinks id=$id ott=$ott")

    val apiBase = try {
        resolveApiUrl()
    } catch (e: Exception) {
        Log.e(TAG, "$providerName: resolveApiUrl failed: ${e.message}")
        return false
    }

    var response: NewTvPlayerResponse? = null
    var usedBase: String = apiBase

    fun parseAndLog(text: String, base: String): NewTvPlayerResponse? {
        Log.d(TAG, "$providerName: player.php raw response (base=$base): ${text.take(500)}")
        val parsed = tryParseJson<NewTvPlayerResponse>(text)
        if (parsed == null) {
            Log.e(TAG, "$providerName: failed to parse player.php response as JSON")
        }
        return parsed
    }

    try {
        val res = app.get(
            "$apiBase/newtv/player.php?id=$id",
            headers = buildNewTvHeaders(ott, mapOf("Usertoken" to ""))
        )
        response = parseAndLog(res.text, apiBase)
    } catch (e: Exception) {
        Log.e(TAG, "$providerName: player.php request failed (apiBase=$apiBase): ${e.message}")
        // The cached URL may have gone stale — refresh and retry once.
        invalidateResolvedApiUrl()
        val retryBase = try {
            resolveApiUrl(force = true)
        } catch (e2: Exception) {
            Log.e(TAG, "$providerName: retry resolveApiUrl failed: ${e2.message}")
            return false
        }
        if (retryBase == apiBase) {
            Log.e(TAG, "$providerName: retry produced same apiBase, giving up")
            return false
        }
        Log.d(TAG, "$providerName: retrying with apiBase=$retryBase")
        try {
            val res = app.get(
                "$retryBase/newtv/player.php?id=$id",
                headers = buildNewTvHeaders(ott, mapOf("Usertoken" to ""))
            )
            usedBase = retryBase
            response = parseAndLog(res.text, retryBase)
        } catch (e2: Exception) {
            Log.e(TAG, "$providerName: retry player.php request failed: ${e2.message}")
            return false
        }
    }

    val resp = response ?: return false

    Log.d(
        TAG,
        "$providerName: status=${resp.status} referer=${resp.referer} link=${resp.video_link?.take(80)}"
    )

    // The API may return status="otp" (one-time-play) instead of "ok", but still
    // provide a perfectly valid video_link. Trust the link if it's present.
    if (resp.video_link.isNullOrBlank()) {
        Log.e(TAG, "$providerName: video_link is null/blank (status=${resp.status})")
        return false
    }

    callback.invoke(
        newExtractorLink(providerName, providerName, resp.video_link, type = ExtractorLinkType.M3U8) {
            this.referer = resp.referer ?: usedBase
        }
    )
    return true
}

data class NewTvTokenResponse(
    val token_hash: String? = null
)

data class NewTvPlayerResponse(
    val status: String? = null,
    val video_link: String? = null,
    val referer: String? = null
)
