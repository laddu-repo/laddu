package com.laddu100

import android.util.Base64
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import kotlinx.coroutines.delay
import java.util.concurrent.ConcurrentHashMap

const val ANIXTV_UA =
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36"

fun anixAjaxHeaders(referer: String): Map<String, String> = mapOf(
    "User-Agent" to ANIXTV_UA,
    "Accept" to "*/*",
    "X-Requested-With" to "XMLHttpRequest",
    "Referer" to referer
)

fun urlEncode(value: String): String = java.net.URLEncoder.encode(value, "UTF-8")

// ============================== vrf cipher ==============================
// JS: RC4(key "ysJhV6U27FVIjjuk") -> base64 -> char-shift by index%8 -> ROT13

private fun rc4(key: ByteArray, data: ByteArray): ByteArray {
    val s = IntArray(256) { it }
    var j = 0
    for (i in 0 until 256) {
        j = (j + s[i] + (key[i % key.size].toInt() and 0xFF)) and 0xFF
        val tmp = s[i]; s[i] = s[j]; s[j] = tmp
    }
    var i = 0
    j = 0
    val out = ByteArray(data.size)
    for (k in data.indices) {
        i = (i + 1) and 0xFF
        j = (j + s[i]) and 0xFF
        val tmp = s[i]; s[i] = s[j]; s[j] = tmp
        out[k] = (data[k].toInt() xor s[(s[i] + s[j]) and 0xFF]).toByte()
    }
    return out
}

private fun rot13(input: String): String = buildString {
    for (c in input) {
        if (c in 'a'..'z') append(((c - 'a' + 13) % 26 + 'a'.code).toChar())
        else if (c in 'A'..'Z') append(((c - 'A' + 13) % 26 + 'A'.code).toChar())
        else append(c)
    }
}

/**
 * Generate the vrf token required by /ajax/episode/list/{id}?vrf={vrf}
 */
fun generateVrf(id: String): String {
    val encrypted = rc4("ysJhV6U27FVIjjuk".toByteArray(Charsets.UTF_8), id.toByteArray(Charsets.UTF_8))
    val b64 = Base64.encodeToString(encrypted, Base64.NO_WRAP)
    val shifted = StringBuilder()
    for ((idx, c) in b64.withIndex()) {
        var code = c.code
        when (idx % 8) {
            0 -> code -= 3
            1 -> code += 3
            2 -> code -= 4
            3 -> code += 2
            4 -> code -= 2
            5 -> code += 5
            6 -> code += 4
        }
        shifted.append(code.toChar())
    }
    return rot13(shifted.toString())
}

// ============================== site models ==============================

@JsonIgnoreProperties(ignoreUnknown = true)
data class AjaxHtmlResult(
    @JsonProperty("status") val status: Int = 0,
    @JsonProperty("result") val result: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AjaxSearchResult(
    @JsonProperty("status") val status: Int = 0,
    @JsonProperty("result") val result: SearchHtml? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class SearchHtml(@JsonProperty("html") val html: String? = null)

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetServerResponse(
    @JsonProperty("status") val status: Int = 0,
    @JsonProperty("result") val result: GetServerData? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetServerData(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("skip_data") val skipData: SkipData? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class SkipData(
    @JsonProperty("intro") val intro: List<Int>? = null,
    @JsonProperty("outro") val outro: List<Int>? = null
)

// ============================== Jikan episode titles ==============================

@JsonIgnoreProperties(ignoreUnknown = true)
data class JikanEpisodes(
    @JsonProperty("data") val data: List<JikanEpisode>? = null,
    @JsonProperty("pagination") val pagination: JikanPagination? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class JikanEpisode(
    @JsonProperty("mal_id") val malId: Int? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("title_romanji") val titleRomanji: String? = null,
    @JsonProperty("episode") val episode: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class JikanPagination(
    @JsonProperty("last_visible_page") val lastVisiblePage: Int? = null,
    @JsonProperty("has_next_page") val hasNextPage: Boolean? = null
)

/**
 * Fetches real episode titles from Jikan for a MAL id.
 * Cached in-memory for 24h. Returns num -> title map (may be partial).
 */
object JikanTitles {
    private data class CacheEntry(val titles: Map<Int, String>, val timestamp: Long)
    private val cache = ConcurrentHashMap<Int, CacheEntry>()
    private const val TTL_MS = 86_400_000L
    private const val MAX_PAGES = 40

    suspend fun getTitles(malId: Int, episodeCount: Int): Map<Int, String> {
        if (malId <= 0 || episodeCount <= 0) return emptyMap()
        cache[malId]?.let {
            if (System.currentTimeMillis() - it.timestamp < TTL_MS) return it.titles
        }

        val titles = mutableMapOf<Int, String>()
        try {
            var page = 1
            var lastPage = Int.MAX_VALUE
            while (page <= lastPage && page <= MAX_PAGES) {
                val url = "https://api.jikan.moe/v4/anime/$malId/episodes?page=$page"
                val response = app.get(
                    url,
                    headers = mapOf("User-Agent" to ANIXTV_UA, "Accept" to "application/json"),
                    timeout = 15_000L
                )
                if (response.code != 200) break
                val parsed = parseJson<JikanEpisodes>(response.text)
                parsed.data?.forEach { ep ->
                    val num = ep.episode ?: return@forEach
                    if (num <= 0) return@forEach
                    val title = ep.title?.takeIf { it.isNotBlank() } ?: ep.titleRomanji?.takeIf { it.isNotBlank() }
                    if (title != null) titles[num] = title
                }
                lastPage = parsed.pagination?.lastVisiblePage ?: page
                val hasNext = parsed.pagination?.hasNextPage ?: false
                if (!hasNext || titles.size >= episodeCount) break
                page++
                delay(400)
            }
        } catch (e: Exception) {
            Log.e("AnixTV", "Jikan titles failed for $malId: ${e.message}")
        }
        cache[malId] = CacheEntry(titles.toMap(), System.currentTimeMillis())
        return cache[malId]!!.titles
    }
}
