package com.laddu100.netmirror

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/** Wrapper shared by every list endpoint: {results: [...], pager: {...}} */
@JsonIgnoreProperties(ignoreUnknown = true)
data class NetMirrorListResponse(
    val results: List<NetMirrorMediaItem> = emptyList(),
    val pager: NetMirrorPager? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class NetMirrorPager(
    val current_page: Int? = null,
    val items_per_page: Int? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null,
)

/** One catalog/search row. */
@JsonIgnoreProperties(ignoreUnknown = true)
data class NetMirrorMediaItem(
    val title: String? = null,
    val id: String? = null,
    val backdrop_path: String? = null,
    val release_date: String? = null,
    val media_type: String? = null,
    val vote_average: String? = null,
    val channel: String? = null,
    val cn: String? = null,
)

/** GET /api/{movie|tv}/{id} -> results[0] */
@JsonIgnoreProperties(ignoreUnknown = true)
data class NetMirrorListDetails(
    val results: List<NetMirrorDetails> = emptyList(),
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class NetMirrorDetails(
    val title: String? = null,
    val id: String? = null,
    val backdrop_path: String? = null,
    val release_date: String? = null,
    val media_type: String? = null,
    val vote_average: String? = null,
    val channel: String? = null,
    val season: List<NetMirrorSeason>? = null,
    val genre: List<String>? = null,
    val subjectid: String? = null,
    val stafflist: List<NetMirrorStaff>? = null,
    val duration: String? = null,
    val country: String? = null,
    val embed: String? = null,
    val dp: String? = null,
    val embed_en: String? = null,
    val dis: String? = null,
    val trailer: String? = null,
    val embed_json: Any? = null,
    val tm_id: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class NetMirrorSeason(
    val se: Int? = null,
    val ep: Int? = null,
    val allEp: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class NetMirrorStaff(
    val name: String? = null,
    val staffId: String? = null,
    val avatarUrl: String? = null,
)

/** Episode payload passed from load() to loadLinks(). */
data class NetMirrorLoadData(
    val id: String,
    val mediaType: String,
    val se: Int? = null,
    val ep: Int? = null,
)

/** One playable stream parsed from the watchbox player page. */
data class NetMirrorStream(
    val label: String,
    val url: String,
)

/** One subtitle track parsed from the watchbox player page. */
data class NetMirrorSubtitle(
    val label: String,
    val url: String,
)
