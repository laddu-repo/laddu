package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// ---- AniList GraphQL responses ----

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListResponse<T>(
    @JsonProperty("data") val data: T? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListPage(
    @JsonProperty("Page") val page: AniListPageData? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListPageData(
    @JsonProperty("media") val media: List<AniListMedia>? = null,
    @JsonProperty("pageInfo") val pageInfo: AniListPageInfo? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListPageInfo(
    @JsonProperty("currentPage") val currentPage: Int? = null,
    @JsonProperty("lastPage") val lastPage: Int? = null,
    @JsonProperty("hasNextPage") val hasNextPage: Boolean? = null,
    @JsonProperty("perPage") val perPage: Int? = null,
    @JsonProperty("total") val total: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListMedia(
    @JsonProperty("id") val id: Int? = null,
    @JsonProperty("idMal") val idMal: Int? = null,
    @JsonProperty("title") val title: AniListTitle? = null,
    @JsonProperty("coverImage") val coverImage: AniListCover? = null,
    @JsonProperty("bannerImage") val bannerImage: String? = null,
    @JsonProperty("format") val format: String? = null,
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("episodes") val episodes: Int? = null,
    @JsonProperty("seasonYear") val seasonYear: Int? = null,
    @JsonProperty("genres") val genres: List<String>? = null,
    @JsonProperty("averageScore") val averageScore: Int? = null,
    @JsonProperty("popularity") val popularity: Int? = null,
    @JsonProperty("trending") val trending: Int? = null,
    @JsonProperty("description") val description: String? = null,
    @JsonProperty("duration") val duration: Int? = null,
    @JsonProperty("source") val source: String? = null,
    @JsonProperty("season") val season: String? = null,
    @JsonProperty("studios") val studios: AniListStudios? = null,
    @JsonProperty("trailer") val trailer: AniListTrailer? = null,
    @JsonProperty("streamingEpisodes") val streamingEpisodes: List<AniListStreamEpisode>? = null,
    @JsonProperty("nextAiringEpisode") val nextAiringEpisode: AniListNextAiring? = null,
    @JsonProperty("recommendations") val recommendations: AniListRecommendations? = null
) {
    fun displayTitle(): String? = title?.english?.takeIf { it.isNotBlank() }
        ?: title?.romaji?.takeIf { it.isNotBlank() }
        ?: title?.native?.takeIf { it.isNotBlank() }

    fun otherName(): String? = title?.romaji?.takeIf { it.isNotBlank() && it != title?.english }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListTitle(
    @JsonProperty("romaji") val romaji: String? = null,
    @JsonProperty("english") val english: String? = null,
    @JsonProperty("native") val native: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListCover(
    @JsonProperty("large") val large: String? = null,
    @JsonProperty("extraLarge") val extraLarge: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListStudios(
    @JsonProperty("nodes") val nodes: List<AniListStudio>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListStudio(
    @JsonProperty("name") val name: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListTrailer(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("site") val site: String? = null,
    @JsonProperty("thumbnail") val thumbnail: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListStreamEpisode(
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("thumbnail") val thumbnail: String? = null,
    @JsonProperty("url") val url: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListNextAiring(
    @JsonProperty("episode") val episode: Int? = null,
    @JsonProperty("airingAt") val airingAt: Long? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListRecommendations(
    @JsonProperty("nodes") val nodes: List<AniListRecommendationNode>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AniListRecommendationNode(
    @JsonProperty("mediaRecommendation") val mediaRecommendation: AniListMedia? = null
)

// ---- Shiro /api/episode response ----

@JsonIgnoreProperties(ignoreUnknown = true)
data class ShiroEpisodeResponse(
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("reason") val reason: String? = null,
    @JsonProperty("variants") val variants: List<ShiroVariant>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ShiroVariant(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("label") val label: String? = null,
    @JsonProperty("sources") val sources: List<ShiroSource>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ShiroSource(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("label") val label: String? = null,
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("type") val type: String? = null,
    @JsonProperty("tracks") val tracks: List<ShiroTrack>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ShiroTrack(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("src") val src: String? = null,
    @JsonProperty("type") val type: String? = null,
    @JsonProperty("label") val label: String? = null,
    @JsonProperty("language") val language: String? = null,
    @JsonProperty("default") val default: Boolean? = null
)

// ---- Shiro /api/recent-episodes response (home schedule row) ----

@JsonIgnoreProperties(ignoreUnknown = true)
data class ShiroRecentEpisodes(
    @JsonProperty("schedules") val schedules: List<ShiroSchedule>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ShiroSchedule(
    @JsonProperty("id") val id: Long? = null,
    @JsonProperty("airingAt") val airingAt: Long? = null,
    @JsonProperty("episode") val episode: Int? = null,
    @JsonProperty("media") val media: AniListMedia? = null
)

// ---- Episode payload encoded into each Cloudstream Episode.data ----

data class EpisodeRef(
    val anilistId: Int,
    val ep: Int,
    val isDub: Boolean
)
