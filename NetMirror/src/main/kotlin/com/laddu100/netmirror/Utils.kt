package com.laddu100.netmirror

import com.laddu100.netmirror.entities.Source
import com.laddu100.netmirror.entities.Tracks
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.fasterxml.jackson.core.json.JsonReadFeature
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.lagradost.cloudstream3.network.CloudflareKiller
import com.lagradost.cloudstream3.USER_AGENT
import com.lagradost.nicehttp.Requests
import com.lagradost.nicehttp.ResponseParser
import kotlin.reflect.KClass
import okhttp3.FormBody
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

val cfKiller = CloudflareKiller()

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

@Volatile
var netMirrorWorkingDomain: String = "https://net52.cc"

private val candidateDomains = listOf(
    "https://net52.cc",
    "https://net77.cc"
)

private fun bypassHeaders(base: String): Map<String, String> = mapOf(
    "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
    "Accept-Encoding" to "gzip, deflate, br, zstd",
    "Accept-Language" to "en-US,en;q=0.9",
    "Cache-Control" to "max-age=0",
    "Connection" to "keep-alive",
    "Origin" to base,
    "Referer" to "$base/mobile/verify2.php",
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
    val userverUrl = "https://userver.net52.cc/?jjoii="
    val userverHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36",
        "Accept" to "application/json, text/plain, */*"
    )

    var addhash = ""
    try {
        val verifyResp = app.get("$base/mobile/verify2.php", headers = bypassHeaders(base), interceptor = cfKiller, timeout = 30000L)
        val verifyBody = verifyResp.text
        Log.d(TAG, "verify2.php response: ${verifyBody.take(300)}")
        val addhashMatch = Regex("([a-f0-9]{32}::[a-f0-9]{32}::\\d+::\\w+)").find(verifyBody)
        if (addhashMatch != null) {
            addhash = addhashMatch.groupValues[1]
            Log.d(TAG, "addhash: $addhash")
        }
    } catch (e: Exception) {
        Log.d(TAG, "verify2.php failed: ${e.message}")
    }

    if (addhash.isEmpty()) {
        val hash1 = UUID.randomUUID().toString().replace("-", "")
        val hash2 = UUID.randomUUID().toString().replace("-", "")
        val ts = System.currentTimeMillis() / 1000
        addhash = "$hash1::$hash2::$ts::ni"
        Log.d(TAG, "addhash (fallback): $addhash")
    }

    try {
        app.get("$userverUrl$addhash", headers = userverHeaders, timeout = 10000L)
    } catch (_: Exception) { }

    for (i in 0..5) {
        kotlinx.coroutines.delay(11000L)
        try {
            val resp = app.get("$userverUrl$addhash", headers = userverHeaders, timeout = 10000L)
            val body = resp.text
            Log.d(TAG, "verifyCheck: ${body.take(200)}")
            if (body.contains("All Done")) {
                val setCookie = resp.headers["set-cookie"] ?: ""
                val tHashMatch = Regex("t_hash_t=([^;\\s]+)").find(setCookie)
                if (tHashMatch != null) {
                    Log.d(TAG, "newCookie: ${tHashMatch.groupValues[1]}")
                    return tHashMatch.groupValues[1]
                }
                val cookieMatch = Regex("([a-f0-9]{32}%3A%3A[a-f0-9]{32}%3A%3A\\d+%3A%3A\\w+%3A%3A\\w+)").find(body)
                if (cookieMatch != null) {
                    Log.d(TAG, "newCookie: ${cookieMatch.groupValues[1]}")
                    return cookieMatch.groupValues[1]
                }
                val cookieField = Regex("\"cookie\"\\s*:\\s*\"([^\"]+)\"").find(body)
                if (cookieField != null) {
                    Log.d(TAG, "newCookie: ${cookieField.groupValues[1]}")
                    return cookieField.groupValues[1]
                }
            }
        } catch (_: Exception) { }
    }

    return ""
}

suspend fun bypass(mainUrl: String): String {
    val (savedCookie, savedTimestamp) = NetflixMirrorStorage.getCookie()

    if (!savedCookie.isNullOrEmpty() && System.currentTimeMillis() - savedTimestamp < 300_000) {
        return savedCookie
    }

    for (domain in candidateDomains) {
        val cookie = tryBypassDomain(domain)
        if (cookie.isNotEmpty()) {
            netMirrorWorkingDomain = domain
            NetflixMirrorStorage.saveCookie(cookie)
            return cookie
        }
    }

    NetflixMirrorStorage.clearCookie()
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

val checkDomains = listOf(
    "aHR0cHM6Ly9tb2JpbGVkZXRlY3RzLmNvbQ==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LmFwcA==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0LmFydA==",
    "aHR0cHM6Ly9tb2JpZGV0ZWN0Lmxj",
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

private var resolvedStapeUrl: String = ""
private var resolvedStapeUrlTime: Long = 0L
private const val STAPE_URL_TTL_MS = 10 * 60 * 1000L

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
                return resolvedStapeUrl
            }
        } catch (_: Exception) {
            // Try next domain.
        }
    }
    throw Exception("Failed to resolve streamtape URL")
}

suspend fun loadNewTvLinks(
    id: String,
    ott: String,
    providerName: String,
    callback: (ExtractorLink) -> Unit,
    subtitleCallback: (SubtitleFile) -> Unit
): Boolean {
    val base = netMirrorWorkingDomain
    val cookies = mapOf(
        "t_hash_t" to NetflixMirrorStorage.getCookie().first.orEmpty(),
        "hd" to "on",
        "ott" to ott
    )
    val playlistPath = when (ott) {
        "nf" -> "/mobile/playlist.php?id="
        "hs" -> "/mobile/hs/playlist.php?id="
        "pv" -> "/mobile/pv/playlist.php?id="
        else -> "/mobile/playlist.php?id="
    }
    val resp = try {
        app.get("$base$playlistPath$id", headers = playlistHeaders, cookies = cookies, referer = "$base/mobile/home?app=1", interceptor = cfKiller)
            .parsedSafe<PlayListResponse>()
    } catch (_: Exception) {
        null
    } ?: return false

    val sources = resp.sources ?: return false
    sources.forEach { source ->
        val file = source.file ?: return@forEach
        if (file.isNotBlank()) {
            callback.invoke(
                newExtractorLink(providerName, providerName, file, type = ExtractorLinkType.M3U8) {
                    this.referer = base
                }
            )
        }
    }

    resp.tracks?.forEach { track ->
        val file = track.file ?: return@forEach
        if (file.isNotBlank()) {
            subtitleCallback.invoke(SubtitleFile(track.label ?: "English", file))
        }
    }

    return sources.isNotEmpty()
}

private val playlistHeaders = mapOf(
    "Accept" to "application/json, text/plain, */*",
    "X-Requested-With" to "XMLHttpRequest",
    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:136.0) Gecko/20100101 Firefox/136.0 /OS.Gatu v1.0"
)

data class PlayListResponse(
    val status: String? = null,
    val sources: List<Source>? = null,
    val tracks: List<Tracks>? = null
)

suspend fun getNewTvUserToken(apiBase: String, ott: String): String {
    val (savedToken, savedTs) = NetflixMirrorStorage.getUserToken(ott)
    if (!savedToken.isNullOrEmpty() && System.currentTimeMillis() - savedTs < 86_400_000) {
        Log.d(TAG, "getNewTvUserToken: using cached token for ott=$ott")
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

    val resp = try {
        val r = app.get("$apiBase/newtv/otp.php", headers = otpHeaders)
        Log.d(TAG, "getNewTvUserToken: otp.php HTTP ${r.code} body=${r.text.take(200)}")
        r.parsedSafe<NewTvOtpResponse>()
    } catch (e: Exception) {
        Log.e(TAG, "getNewTvUserToken: otp.php exception: ${e.message}")
        null
    } ?: return ""

    val newToken = resp.usertoken.orEmpty()
    if (newToken.isNotEmpty()) {
        NetflixMirrorStorage.saveUserToken(ott, newToken)
        Log.d(TAG, "getNewTvUserToken: got token (${newToken.length} chars)")
    } else {
        Log.e(TAG, "getNewTvUserToken: no usertoken in response, status=${resp.status}")
    }
    return newToken
}

@Volatile
private var resolvedApiUrl: String = ""
@Volatile
private var resolvedApiUrlTime: Long = 0L
private const val API_URL_TTL_MS = 10 * 60 * 1000L

suspend fun resolveApiUrl(): String {
    val now = System.currentTimeMillis()
    if (resolvedApiUrl.isNotBlank() && now - resolvedApiUrlTime < API_URL_TTL_MS) {
        return resolvedApiUrl
    }

    val (savedBase, savedTs) = NetflixMirrorStorage.getApiBase()
    if (!savedBase.isNullOrEmpty() && now - savedTs < 86_400_000) {
        resolvedApiUrl = savedBase
        resolvedApiUrlTime = now
        Log.d(TAG, "resolveApiUrl: using cached=$savedBase")
        return resolvedApiUrl
    }

    for (encoded in checkDomains) {
        val base = try {
            decodeBase64(encoded).trimEnd('/')
        } catch (_: Exception) {
            continue
        }
        try {
            val r = app.get("$base/checknewtv.php", headers = newTvBaseHeaders)
            Log.d(TAG, "resolveApiUrl: $base/checknewtv.php HTTP ${r.code}")
            val resp = r.parsedSafe<NewTvTokenResponse>() ?: continue
            val tokenHash = resp.token_hash ?: continue
            val decoded = try {
                decodeBase64(tokenHash).trimEnd('/')
            } catch (_: Exception) {
                continue
            }
            if (decoded.startsWith("http")) {
                resolvedApiUrl = decoded
                resolvedApiUrlTime = System.currentTimeMillis()
                NetflixMirrorStorage.saveApiBase(decoded)
                Log.d(TAG, "resolveApiUrl: resolved=$decoded")
                return resolvedApiUrl
            }
        } catch (e: Exception) {
            Log.d(TAG, "resolveApiUrl: $base failed: ${e.message}")
        }
    }
    throw Exception("Failed to resolve NewTV API base URL")
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
