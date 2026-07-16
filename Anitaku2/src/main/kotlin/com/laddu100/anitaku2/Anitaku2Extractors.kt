package com.laddu100.anitaku2

import com.lagradost.api.Log
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.newSubtitleFile
import com.lagradost.cloudstream3.utils.*

/**
 * VibePlayer Extractor - for vivibebe.site and bibiemb.xyz
 * 
 * These embed pages contain JWPlayer setup with:
 * - const src = "https://...master.m3u8"
 * - const subtitle = "https://...vtt" (only for SUB type)
 * 
 * The m3u8 URL is directly in the HTML - no obfuscation needed.
 */
class VibePlayerExtractor : ExtractorApi() {
    override var name = "VibePlayer"
    override var mainUrl = "https://vivibebe.site"
    override val requiresReferer = true

    private val TAG = "Anitaku2-VP"

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val headers = mapOf(
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
            "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Referer" to (referer ?: url),
        )

        val response = app.get(url, headers = headers, timeout = 30_000L).text

        // Extract m3u8 URL
        val m3u8Match = Regex("""const\s+src\s*=\s*"([^"]+\.m3u8[^"]*)"""").find(response)
            ?: throw Exception("No m3u8 found in VibePlayer page")
        val m3u8 = m3u8Match.groupValues[1]

        // Extract subtitle (present for SUB type only)
        val subMatch = Regex("""const\s+subtitle\s*=\s*"([^"]+)"""").find(response)
        val subtitle = subMatch?.groupValues?.get(1)?.takeIf { it.isNotBlank() && it.startsWith("http") }

        // Build stream headers
        val domain = Regex("""https?://([^/]+)""").find(url)?.groupValues?.get(1) ?: mainUrl
        val streamHeaders = mapOf(
            "Referer" to url,
            "Origin" to "https://$domain",
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36"
        )

        M3u8Helper.generateM3u8(name, m3u8, url, headers = streamHeaders).forEach(callback)

        // Add subtitles
        if (!subtitle.isNullOrEmpty()) {
            subtitleCallback.invoke(newSubtitleFile("English", subtitle))
        }

        // Also check for subtitle in URL query params
        val urlSub = when {
            url.contains("sub=") -> Regex("""[?&]sub=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("caption_1=") -> Regex("""[?&]caption_1=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("c1_file=") -> Regex("""[?&]c1_file=([^&]+)""").find(url)?.groupValues?.get(1)
            else -> null
        }
        if (!urlSub.isNullOrEmpty()) {
            subtitleCallback.invoke(newSubtitleFile("English", urlSub))
        }
    }
}

/**
 * StreamHG Extractor - for otakuhg.site
 * 
 * Uses heavily obfuscated JavaScript (eval(function(p,a,c,k,e,d){...})) 
 * to embed the player setup. The m3u8 URL is hidden in the packed JS.
 * We decode the JS packer to extract the stream URL.
 */
class StreamHgExtractor : ExtractorApi() {
    override var name = "StreamHG"
    override var mainUrl = "https://otakuhg.site"
    override val requiresReferer = true

    private val TAG = "Anitaku2-SHG"

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val headers = mapOf(
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
            "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Referer" to (referer ?: url),
        )

        val html = app.get(url, headers = headers, timeout = 30_000L).text

        // Try to decode the JS packer and extract m3u8
        val m3u8 = decodeJSPacker(html, mainUrl)
            ?: findM3u8Direct(html, mainUrl)
            ?: throw Exception("No m3u8 found in StreamHG page")

        val streamHeaders = mapOf(
            "Referer" to url,
            "Origin" to mainUrl,
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36"
        )

        M3u8Helper.generateM3u8(name, m3u8, url, headers = streamHeaders).forEach(callback)

        // Add subtitles from URL params
        addSubtitlesFromUrl(url, subtitleCallback)
    }

    /**
     * Decode the JavaScript packer used by StreamHG and Earnvids
     * Format: eval(function(p,a,c,k,e,d){while(c--)if(k[c])p=p.replace(...);return p}('packed',radix,count,'keys'))
     */
    private fun decodeJSPacker(html: String, hostDomain: String): String? {
        return try {
            val packerMatch = Regex(
                """eval\(function\(p,a,c,k,e,d\)\{.*?\}\('(.+?)',(\d+),(\d+),'(.+?)'\)"""
            ).find(html) ?: return null

            val p = packerMatch.groupValues[1]
            val radix = packerMatch.groupValues[2].toIntOrNull() ?: return null
            val keys = packerMatch.groupValues[4].split("|")

            // Decode: replace base-radix tokens with corresponding keys
            val tokenPattern = Regex("""\b([a-zA-Z0-9]+)\b""")
            val decodedStr = tokenPattern.replace(p) { matchResult ->
                val token = matchResult.groupValues[1]
                try {
                    val idx = token.toInt(radix)
                    if (idx < keys.size && keys[idx].isNotEmpty()) {
                        keys[idx]
                    } else {
                        token
                    }
                } catch (e: Exception) {
                    token
                }
            }

            // Extract m3u8 URL from decoded script
            // Priority: hls4 (relative /stream/ path) > hls2 (CDN URL) > hls3 (.urlset)

            // Pattern 1: /stream/.../master.m3u8 (relative path - hls4)
            val streamPathMatch = Regex("""["'](/stream/[^"']+\.m3u8)["']""").find(decodedStr)
            if (streamPathMatch != null) {
                return "https://$hostDomain${streamPathMatch.groupValues[1]}"
            }

            // Pattern 2: Full URL m3u8 (hls2)
            val fullUrlMatch = Regex("""["'](https?://[^"']+\.m3u8[^"']*)["']""").find(decodedStr)
            if (fullUrlMatch != null) {
                return fullUrlMatch.groupValues[1]
            }

            // Pattern 3: .urlset/master.txt (hls3 variant - convert to m3u8)
            val urlsetMatch = Regex("""["'](https?://[^"']+\.urlset/master\.txt[^"']*)["']""").find(decodedStr)
            if (urlsetMatch != null) {
                return urlsetMatch.groupValues[1].replace("master.txt", "master.m3u8")
            }

            null
        } catch (e: Exception) {
            Log.d(TAG, "JS packer decode failed: ${e.message}")
            null
        }
    }

    private fun findM3u8Direct(html: String, hostDomain: String): String? {
        // Try relative /stream/ path
        val streamPathMatch = Regex("""["'](/stream/[^"']+\.m3u8)["']""").find(html)
        if (streamPathMatch != null) return "https://$hostDomain${streamPathMatch.groupValues[1]}"

        // Try full URL
        val fullUrlMatch = Regex("""(https?://[^"'\s]+/stream/[^"'\s]+\.m3u8[^"'\s]*)""").find(html)
        if (fullUrlMatch != null) return fullUrlMatch.groupValues[1]

        // Try file: property pattern
        val fileMatch = Regex("""file["']\s*[:=]\s*["']([^"']+\.m3u8[^"']*)["']""").find(html)
        if (fileMatch != null) {
            val path = fileMatch.groupValues[1]
            return if (path.startsWith("http")) path else "https://$hostDomain$path"
        }

        return null
    }

    private suspend fun addSubtitlesFromUrl(url: String, subtitleCallback: (SubtitleFile) -> Unit) {
        val subUrl = when {
            url.contains("caption_1=") -> Regex("""[?&]caption_1=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("sub=") -> Regex("""[?&]sub=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("c1_file=") -> Regex("""[?&]c1_file=([^&]+)""").find(url)?.groupValues?.get(1)
            else -> null
        }
        if (!subUrl.isNullOrEmpty()) {
            subtitleCallback.invoke(newSubtitleFile("English", subUrl))
        }
    }
}

/**
 * Earnvids Extractor - for otakuvid.online
 * 
 * Same obfuscated JS packer pattern as StreamHG.
 * Uses a different player script (ev-player.js vs hg-function.js) 
 * but the same m3u8 URL extraction approach works.
 */
class EarnvidsExtractor : ExtractorApi() {
    override var name = "Earnvids"
    override var mainUrl = "https://otakuvid.online"
    override val requiresReferer = true

    private val TAG = "Anitaku2-EV"

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val headers = mapOf(
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
            "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Referer" to (referer ?: url),
        )

        val html = app.get(url, headers = headers, timeout = 30_000L).text

        // Try to decode the JS packer and extract m3u8
        val m3u8 = decodeJSPacker(html, mainUrl)
            ?: findM3u8Direct(html, mainUrl)
            ?: throw Exception("No m3u8 found in Earnvids page")

        val streamHeaders = mapOf(
            "Referer" to url,
            "Origin" to mainUrl,
            "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36"
        )

        M3u8Helper.generateM3u8(name, m3u8, url, headers = streamHeaders).forEach(callback)

        // Add subtitles from URL params
        addSubtitlesFromUrl(url, subtitleCallback)
    }

    private fun decodeJSPacker(html: String, hostDomain: String): String? {
        return try {
            val packerMatch = Regex(
                """eval\(function\(p,a,c,k,e,d\)\{.*?\}\('(.+?)',(\d+),(\d+),'(.+?)'\)"""
            ).find(html) ?: return null

            val p = packerMatch.groupValues[1]
            val radix = packerMatch.groupValues[2].toIntOrNull() ?: return null
            val keys = packerMatch.groupValues[4].split("|")

            val tokenPattern = Regex("""\b([a-zA-Z0-9]+)\b""")
            val decodedStr = tokenPattern.replace(p) { matchResult ->
                val token = matchResult.groupValues[1]
                try {
                    val idx = token.toInt(radix)
                    if (idx < keys.size && keys[idx].isNotEmpty()) {
                        keys[idx]
                    } else {
                        token
                    }
                } catch (e: Exception) {
                    token
                }
            }

            // Pattern 1: /stream/.../master.m3u8 (hls4)
            val streamPathMatch = Regex("""["'](/stream/[^"']+\.m3u8)["']""").find(decodedStr)
            if (streamPathMatch != null) {
                return "https://$hostDomain${streamPathMatch.groupValues[1]}"
            }

            // Pattern 2: Full URL m3u8 (hls2)
            val fullUrlMatch = Regex("""["'](https?://[^"']+\.m3u8[^"']*)["']""").find(decodedStr)
            if (fullUrlMatch != null) {
                return fullUrlMatch.groupValues[1]
            }

            // Pattern 3: .urlset/master.txt (hls3)
            val urlsetMatch = Regex("""["'](https?://[^"']+\.urlset/master\.txt[^"']*)["']""").find(decodedStr)
            if (urlsetMatch != null) {
                return urlsetMatch.groupValues[1].replace("master.txt", "master.m3u8")
            }

            null
        } catch (e: Exception) {
            Log.d(TAG, "JS packer decode failed: ${e.message}")
            null
        }
    }

    private fun findM3u8Direct(html: String, hostDomain: String): String? {
        val streamPathMatch = Regex("""["'](/stream/[^"']+\.m3u8)["']""").find(html)
        if (streamPathMatch != null) return "https://$hostDomain${streamPathMatch.groupValues[1]}"

        val fullUrlMatch = Regex("""(https?://[^"'\s]+/stream/[^"'\s]+\.m3u8[^"'\s]*)""").find(html)
        if (fullUrlMatch != null) return fullUrlMatch.groupValues[1]

        val fileMatch = Regex("""file["']\s*[:=]\s*["']([^"']+\.m3u8[^"']*)["']""").find(html)
        if (fileMatch != null) {
            val path = fileMatch.groupValues[1]
            return if (path.startsWith("http")) path else "https://$hostDomain$path"
        }

        return null
    }

    private suspend fun addSubtitlesFromUrl(url: String, subtitleCallback: (SubtitleFile) -> Unit) {
        val subUrl = when {
            url.contains("caption_1=") -> Regex("""[?&]caption_1=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("sub=") -> Regex("""[?&]sub=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("c1_file=") -> Regex("""[?&]c1_file=([^&]+)""").find(url)?.groupValues?.get(1)
            else -> null
        }
        if (!subUrl.isNullOrEmpty()) {
            subtitleCallback.invoke(newSubtitleFile("English", subUrl))
        }
    }
}
