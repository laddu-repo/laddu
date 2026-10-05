package com.justplay

import com.lagradost.cloudstream3.utils.ExtractorLink

/**
 * Classifies finished player links into download-only vs stream-only and
 * tags the ones that pass in download-only mode.
 *
 * Download-only sources are matched by NAME (case-insensitive) on the final
 * link label the player shows — the user-defined markers are:
 *   - "10Gbps"                  (10Gbps [Download], V-Drive Vegadrop (10Gbps), GDFlix 10Gbps)
 *   - "GDflix instant download" (GDFlix Instant Download [...])
 *   - "instant download"        (Instant Download [...])
 *   - "download"                (Download File, [Download], every other download-named link)
 */
internal object PlaySourceFilter {

    private val downloadTokens = listOf(
        "10gbps",
        "gdflix instant download",
        "instant download",
        "download"
    )

    fun isDownloadOnlyName(name: String): Boolean {
        val n = name.lowercase()
        return downloadTokens.any { n.contains(it) }
    }

    // same link with " (DOWNLOAD ONLY)" appended to the visible name;
    // built directly (newExtractorLink is suspend, this must stay sync)
    fun taggedDownloadOnly(link: ExtractorLink): ExtractorLink {
        val name = if (link.name.contains("(DOWNLOAD ONLY)", ignoreCase = true)) {
            link.name
        } else {
            "${link.name.trimEnd()} (DOWNLOAD ONLY)"
        }
        return ExtractorLink(
            link.source,
            name,
            link.url,
            link.referer,
            link.quality,
            link.headers,
            link.extractorData,
            link.type,
            link.audioTracks
        )
    }
}
