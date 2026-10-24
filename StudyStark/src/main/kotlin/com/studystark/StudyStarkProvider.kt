package com.studystark

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.lagradost.cloudstream3.CommonActivity
import com.lagradost.cloudstream3.ErrorLoadingException
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.SeasonData
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.addSeasonNames
import com.lagradost.cloudstream3.newEpisode
import com.lagradost.cloudstream3.newHomePageResponse
import com.lagradost.cloudstream3.newTvSeriesLoadResponse
import com.lagradost.cloudstream3.newTvSeriesSearchResponse
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.CLEARKEY_UUID
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.newDrmExtractorLink
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import org.jsoup.Jsoup

private val MAPPER = ObjectMapper()

// data url passed from load() into loadLinks()
@JsonIgnoreProperties(ignoreUnknown = true)
data class EpisodeData(
    val kind: String? = null,        // v = lectures, n = notes, q = quiz
    val batch: String? = null,
    val subject: String? = null,
    val topic: String? = null,
    val topicName: String? = null,
    val subjectName: String? = null,
)

private class TopicFetch(
    val subjectId: String,
    val subjectName: String,
    val topics: List<TopicItem>,
)

class StudyStarkProvider : MainAPI() {
    override var mainUrl = "https://vidcloud.eu.org"
    override var name = "StudyStark"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Others, TvType.TvSeries)

    override val mainPage = mainPageOf(
        "all" to "All Batches",
        "IIT-JEE" to "IIT-JEE",
        "NEET" to "NEET",
        "UPSC" to "UPSC",
        "GATE" to "GATE",
        "SSC" to "SSC",
        "FOUNDATION" to "Foundation",
        "SCHOOL_PREPARATION" to "School",
        "BOARD_EXAM" to "Boards",
        "Banking" to "Banking",
        "CA" to "CA / Commerce",
        "NDA" to "Defence",
        "vidyapeeth" to "Vidyapeeth Centers",
    )

    private val pageSize = 30

    private fun batchToSearch(b: CatalogBatch): SearchResponse? {
        val id = b.batch_id ?: return null
        val title = b.name ?: return null
        return newTvSeriesSearchResponse(title, "$mainUrl/batch/$id", TvType.TvSeries) {
            this.posterUrl = b.imageUrl()
            this.year = b.start_date?.substringBefore('-')?.toIntOrNull()
        }
    }

    private suspend fun rowsFor(key: String): List<CatalogBatch> {
        if (key == "vidyapeeth") {
            return StarkApi.vidyapeeth().sortedByDescending { it.start_date }
        }
        val all = StarkApi.catalog()
        if (key == "all") {
            return all.sortedByDescending { it.start_date }
        }
        return all.filter { it.exam.equals(key, ignoreCase = true) }
            .sortedByDescending { it.start_date }
    }

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val rows = rowsFor(request.data)
        val from = (page - 1) * pageSize
        if (from >= rows.size) {
            return newHomePageResponse(request.name, emptyList(), false)
        }
        val slice = rows.drop(from).take(pageSize)
        val items = slice.mapNotNull { batchToSearch(it) }
        return newHomePageResponse(request.name, items, from + pageSize < rows.size)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        val q = query.trim().lowercase()
        val hits = StarkApi.catalog().filter {
            it.name?.lowercase()?.contains(q) == true ||
                it.byName?.lowercase()?.contains(q) == true ||
                it.exam?.lowercase()?.contains(q) == true
        }.sortedByDescending { it.start_date }
        return hits.take(45).mapNotNull { batchToSearch(it) }
    }

    private fun plainDescription(html: String?): String? {
        if (html.isNullOrBlank()) return null
        val text = Jsoup.parse(html).text().trim()
        return text.takeIf { it.isNotBlank() }?.take(600)
    }

    override suspend fun load(url: String): com.lagradost.cloudstream3.LoadResponse? {
        val batchId = Regex("batch/([a-f0-9]+)").find(url)?.groupValues?.get(1)
            ?: return null
        val details = StarkApi.batchDetails(batchId)

        val subjects = details.subjects.orEmpty()
            .filter { !it._id.isNullOrBlank() && !it.subject.isNullOrBlank() }
        if (subjects.isEmpty()) {
            throw ErrorLoadingException("No subjects found in this batch.")
        }

        // pull every subject's topic list, four at a time
        val fetched: List<TopicFetch> = coroutineScope {
            val gate = Semaphore(4)
            subjects.map { subject ->
                async {
                    gate.withPermit {
                        val list = runCatching {
                            StarkApi.topics(batchId, subject._id!!)
                        }.getOrDefault(emptyList())
                        TopicFetch(subject._id!!, subject.subject!!, list)
                    }
                }
            }.awaitAll()
        }

        val seasonNames = mutableListOf<SeasonData>()
        val episodes = mutableListOf<com.lagradost.cloudstream3.Episode>()
        var epIndex = 0

        fetched.forEachIndexed { sIndex, tf ->
            seasonNames.add(SeasonData(season = sIndex + 1, name = tf.subjectName))

            tf.topics.sortedBy { it.displayOrder ?: 0 }.forEach { topic ->
                val tid = topic._id ?: return@forEach
                val tName = topic.name ?: "Topic"
                val data = EpisodeData(
                    kind = "v",
                    batch = batchId,
                    subject = tf.subjectId,
                    topic = tid,
                    topicName = tName,
                    subjectName = tf.subjectName,
                )
                epIndex++
                episodes.add(
                    newEpisode(MAPPER.writeValueAsString(data)) {
                        this.name = tName
                        this.season = sIndex + 1
                        this.episode = epIndex
                    }
                )
                if ((topic.notes ?: 0) > 0) {
                    episodes.add(
                        newEpisode(MAPPER.writeValueAsString(data.copy(kind = "n"))) {
                            this.name = "\uD83D\uDCC4 Notes — $tName"
                            this.season = sIndex + 1
                        }
                    )
                }
                if ((topic.exercises ?: 0) > 0) {
                    episodes.add(
                        newEpisode(MAPPER.writeValueAsString(data.copy(kind = "q"))) {
                            this.name = "\uD83D\uDCDD DPP Quiz — $tName"
                            this.season = sIndex + 1
                        }
                    )
                }
            }
        }

        if (episodes.isEmpty()) {
            throw ErrorLoadingException("No topics found in this batch yet.")
        }

        val response = newTvSeriesLoadResponse(
            details.batchName ?: details.name ?: "Batch",
            url,
            TvType.TvSeries,
            episodes
        ) {
            this.plot = plainDescription(details.description)
            this.tags = listOfNotNull(
                details.exam,
                details.language,
                details.classLevel?.let { "Class $it" },
            )
        }
        response.addSeasonNames(seasonNames)
        return response
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (com.lagradost.cloudstream3.SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val ep = runCatching { parseJson<EpisodeData>(data) }.getOrNull()
            ?: return false
        val batchId = ep.batch ?: return false
        val subjectId = ep.subject ?: return false
        val topicId = ep.topic ?: return false
        val nav = Nav(batchId, subjectId, topicId, ep.topicName.orEmpty(), ep.subjectName.orEmpty())

        // the quiz WebView needs this context at hand
        CommonActivity.activity?.getSharedPreferences("studystark_nav", android.content.Context.MODE_PRIVATE)
            ?.edit()
            ?.putString("batch_id", batchId)
            ?.putString("subject_id", subjectId)
            ?.putString("topic_id", topicId)
            ?.apply()

        return when (ep.kind) {
            "n" -> loadNoteLinks(nav, callback)
            "q" -> loadQuiz(nav)
            else -> loadVideoLinks(nav, callback)
        }
    }

    /** Lectures + DPP videos of a topic, each resolved through play.php into a signed m3u8. */
    private suspend fun loadVideoLinks(
        nav: Nav,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val lectures = runCatching {
            StarkApi.contents(nav.subjectId, nav.topicId, "videos")
        }.getOrDefault(emptyList())

        val dppVideos = runCatching {
            StarkApi.contents(nav.subjectId, nav.topicId, "DppVideos")
        }.getOrDefault(emptyList())

        val all = lectures + dppVideos
        if (all.isEmpty()) {
            throw ErrorLoadingException("No lectures found for ${nav.topicName}.")
        }

        var found = false
        coroutineScope {
            val gate = Semaphore(3)
            val jobs = all.map { item ->
                async {
                    val contentId = item._id ?: return@async null
                    val rawUrl = item.url ?: item.videoDetails?.videoUrl
                    val title = item.topic ?: item.videoDetails?.name ?: "Lecture"
                    if (rawUrl.isNullOrBlank()) return@async null

                    gate.withPermit {
                        val play = runCatching {
                            StarkApi.fetchPlayPage(
                                batchId = nav.batchId,
                                subjectId = nav.subjectId,
                                topicId = nav.topicId,
                                contentId = contentId,
                                videoDetailsId = item.videoDetails?._id,
                                videoUrl = rawUrl,
                                videoName = title,
                                videoImage = item.videoDetails?.image,
                                playType = if (item.isDPPVideos == true) "DppVideos" else "Lecture",
                            )
                        }.getOrNull() ?: return@withPermit null

                        val streamUrl = play.videoUrl ?: return@withPermit null
                        Triple(title, item.isDPPVideos == true, play)
                    }
                }
            }
            jobs.forEach { job ->
                val res = job.await() ?: return@forEach
                val (title, isDpp, play) = res
                val streamUrl = play.videoUrl ?: return@forEach
                val label = if (isDpp) "DPP · $title" else title

                if (play.keyId != null && play.keyValue != null) {
                    callback.invoke(
                        newDrmExtractorLink(
                            name,
                            label,
                            streamUrl,
                            ExtractorLinkType.M3U8,
                            CLEARKEY_UUID,
                        ) {
                            this.referer = "${StarkApi.baseUrl()}/"
                            this.kid = drmField(play.keyId)
                            this.key = drmField(play.keyValue)
                        }
                    )
                } else {
                    callback.invoke(
                        newExtractorLink(
                            name,
                            label,
                            streamUrl,
                            ExtractorLinkType.M3U8,
                        ) {
                            this.referer = "${StarkApi.baseUrl()}/"
                        }
                    )
                }
                found = true
            }
        }
        return found
    }

    /** kid/key are expected base64-ish, hex ids get converted like the live tv plugin does. */
    private fun drmField(raw: String): String {
        val clean = raw.replace("-", "").replace(" ", "")
        if (clean.length == 32 && clean.all { it.isDigit() || it.lowercaseChar() in 'a'..'f' }) {
            return clean.hexToBase64Url()
        }
        return raw
    }

    private fun String.hexToBase64Url(): String {
        val bytes = ByteArray(length / 2) { i ->
            substring(i * 2, i * 2 + 2).toInt(16).toByte()
        }
        return java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(bytes)
    }

    /** Notes + DPP notes: pdf picker for reading, direct links for the downloader. */
    private suspend fun loadNoteLinks(
        nav: Nav,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val notes = runCatching {
            StarkApi.contents(nav.subjectId, nav.topicId, "notes")
        }.getOrDefault(emptyList())

        val dppNotes = runCatching {
            StarkApi.contents(nav.subjectId, nav.topicId, "DppNotes")
        }.getOrDefault(emptyList())

        val pdfs = mutableListOf<StarkPdf>()
        (notes + dppNotes).forEach { item ->
            val isDpp = item.topic?.contains("DPP", true) == true
            item.homeworkIds.orEmpty().forEach { hw ->
                hw.attachmentIds.orEmpty().forEach { att ->
                    val pdfUrl = att.pdfUrl() ?: return@forEach
                    val title = att.name ?: hw.topic ?: "Notes.pdf"
                    pdfs.add(StarkPdf(if (isDpp) "DPP · $title" else title, pdfUrl))
                }
            }
        }

        if (pdfs.isEmpty()) {
            throw ErrorLoadingException("No notes PDFs found for ${nav.topicName}.")
        }

        pdfs.forEach { pdf ->
            callback.invoke(
                newExtractorLink(
                    name,
                    "\uD83D\uDCC4 ${pdf.title}",
                    pdf.url,
                    ExtractorLinkType.VIDEO,
                ) {
                    this.referer = "${StarkApi.baseUrl()}/"
                }
            )
        }

        StarkPdf.showPicker(
            if (nav.topicName.isBlank()) "Notes" else "Notes — ${nav.topicName}",
            pdfs
        )
        return true
    }

    /** DPP quiz list, the site's own quiz page opens in a WebView. */
    private suspend fun loadQuiz(nav: Nav): Boolean {
        val quizzes = runCatching {
            StarkApi.dppList(nav.batchId, nav.subjectId, nav.topicId)
        }.getOrDefault(emptyList())

        if (quizzes.isEmpty()) {
            throw ErrorLoadingException("No DPP quiz found for ${nav.topicName}.")
        }

        StarkQuiz.showQuizList(
            if (nav.topicName.isBlank()) "DPP Quiz" else "DPP Quiz — ${nav.topicName}",
            quizzes
        )
        return true
    }
}

private data class Nav(
    val batchId: String,
    val subjectId: String,
    val topicId: String,
    val topicName: String,
    val subjectName: String,
)
