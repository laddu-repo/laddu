package com.studystark

import android.content.Context
import android.util.Log
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

private const val BASE = "https://vidcloud.eu.org"

// the site routes every contents lookup through one fixed syllabus batch,
// while details/topics use the batch you actually opened
private const val CONTENTS_BATCH = "634bd315ed7a360018558283"

private const val TAG = "StudyStark"

private val UA =
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36"

private const val CATALOG_URL = "https://studystark.github.io/batches/batches.json"
private const val CATALOG_DISK_TTL = 24L * 60 * 60 * 1000 // 24h

@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogBatch(
    val batch_id: String? = null,
    val language: String? = null,
    val exam: String? = null,
    val name: String? = null,
    val byName: String? = null,
    val photo: String? = null,
    @JsonProperty("class") val classLevel: String? = null,
    val start_date: String? = null,
    val end_date: String? = null,
    val amount: Double? = null,
) {
    fun imageUrl(): String? = photo?.takeIf { it.startsWith("http") }
}

@JsonIgnoreProperties(ignoreUnknown = true)
private data class CatalogFile(
    val data: List<CatalogBatch>? = null,
    val vidyapeeth_batches: List<CatalogBatch>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class TokenReply(
    val success: Boolean? = null,
    val access_token: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class BatchDetails(
    val _id: String? = null,
    val name: String? = null,
    val batchName: String? = null,
    val byName: String? = null,
    val description: String? = null,
    val exam: String? = null,
    val language: String? = null,
    @JsonProperty("class") val classLevel: String? = null,
    val subjects: List<BatchSubject>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class BatchSubject(
    val _id: String? = null,
    val subject: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class TopicItem(
    val _id: String? = null,
    val name: String? = null,
    val displayOrder: Int? = null,
    val notes: Int? = null,
    val exercises: Int? = null,
    val videos: Int? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class VideoDetails(
    val _id: String? = null,
    val name: String? = null,
    val image: String? = null,
    val videoUrl: String? = null,
    val duration: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ContentItem(
    val _id: String? = null,
    val topic: String? = null,
    val url: String? = null,
    val urlType: String? = null,
    val isDPPVideos: Boolean? = null,
    val date: String? = null,
    val videoDetails: VideoDetails? = null,
    val homeworkIds: List<Homework>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Homework(
    val topic: String? = null,
    val note: String? = null,
    val attachmentIds: List<Attachment>? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Attachment(
    val baseUrl: String? = null,
    val key: String? = null,
    val name: String? = null,
) {
    fun pdfUrl(): String? {
        if (baseUrl.isNullOrBlank() || key.isNullOrBlank()) return null
        return baseUrl.trimEnd('/') + "/" + key.trimStart('/')
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class Paginate(
    val totalCount: Int? = null,
    val limit: Int? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class ListReply<T>(
    val success: Boolean? = null,
    val data: List<T>? = null,
    val paginate: Paginate? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class DetailsReply(
    val success: Boolean? = null,
    val data: BatchDetails? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class DppQuizDetails(
    val test: DppTest? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class DppTest(
    val _id: String? = null,
    val name: String? = null,
    val totalMarks: Int? = null,
    val totalQuestions: Int? = null,
    val maxDuration: Int? = null,
    val displayOrder: Int? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
private data class DppListReply(
    val success: Boolean? = null,
    val data: List<DppQuizDetails>? = null,
    val paginate: Paginate? = null,
)

object StarkApi {

    class StarkBlocked(msg: String) : Exception(msg)

    private var token: String? = null
    private var phpSession: String? = null
    private val tokenMutex = Mutex()

    private var catalogCache: List<CatalogBatch>? = null
    private var vidyapeethCache: List<CatalogBatch>? = null
    private var catalogAt: Long = 0
    private val catalogMutex = Mutex()

    // app context for the on-disk catalog cache, attached at plugin load
    @Volatile
    private var appContext: Context? = null

    fun attach(context: Context) {
        appContext = context
    }

    private fun catalogFile(): java.io.File? = runCatching {
        appContext?.filesDir?.let { dir -> java.io.File(dir, "batches_catalog.json") }
    }.getOrNull()

    /** Serve the catalog from the disk copy if it is fresh enough. */
    private fun loadDiskCatalog(maxAgeMs: Long): CatalogFile? {
        val file = catalogFile() ?: return null
        if (!file.isFile) return null
        val age = System.currentTimeMillis() - file.lastModified()
        if (age > maxAgeMs) return null
        val text = runCatching { file.readText() }.getOrNull() ?: run {
            Log.w(TAG, "disk catalog unreadable, falling back to network")
            return null
        }
        val parsed = runCatching { parseJson<CatalogFile>(text) }.getOrNull() ?: run {
            Log.w(TAG, "disk catalog no longer parses, refetching")
            return null
        }
        Log.i(TAG, "catalog served from disk cache (${text.length / 1024}KB, ${age / 60000}min old)")
        return parsed
    }

    private fun saveDiskCatalog(text: String) {
        val file = catalogFile() ?: return
        runCatching {
            file.writeText(text)
            Log.i(TAG, "catalog saved to disk cache")
        }.onFailure { Log.w(TAG, "could not persist catalog: ${it.message}") }
    }

    private fun baseHeaders(): Map<String, String> = mapOf(
        "User-Agent" to UA,
        "Accept" to "application/json, text/plain, */*",
        "Referer" to "$BASE/",
    )

    private fun cookieHeader(): String {
        val parts = mutableListOf<String>()
        phpSession?.let { parts.add("PHPSESSID=$it") }
        token?.let { parts.add("auth_token=$it") }
        return parts.joinToString("; ")
    }

    private fun authHeaders(): Map<String, String> {
        val h = baseHeaders().toMutableMap()
        token?.let { h["Authorization"] = "Bearer $it" }
        // the browser sends all three of these on every api call (har verified)
        h["Client-Version"] = "2.1.6"
        h["Client-Type"] = "WEB"
        h["Client-Id"] = "5eb393ee95fab7468a79d189"
        h["Origin"] = BASE
        h["Cookie"] = cookieHeader()
        return h
    }

    /** session cookie comes from the landing page, token from generate_token.php */
    suspend fun ensureToken(): String = tokenMutex.withLock {
        token?.let { return it }
        try {
            val home = app.get(BASE, headers = baseHeaders() + mapOf(
                "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
            ))
            home.headers.values("set-cookie").forEach { raw ->
                if (raw.contains("PHPSESSID=")) {
                    phpSession = Regex("PHPSESSID=([^;]+)").find(raw)?.groupValues?.get(1)
                }
            }
        } catch (e: Exception) {
            Log.w(TAG, "homepage session fetch failed (non-fatal): ${e.javaClass.simpleName}: ${e.message}")
        }

        val res = try {
            app.get(
                "$BASE/generate_token.php",
                headers = baseHeaders() + mapOf("Cookie" to cookieHeader())
            )
        } catch (e: Exception) {
            Log.e(TAG, "token request failed: ${e.javaClass.simpleName}: ${e.message}")
            throw StarkBlocked(
                "Could not reach vidcloud.eu.org (${e.javaClass.simpleName}). " +
                    "Check your connection or try without VPN."
            )
        }
        if (res.code == 403) {
            Log.e(TAG, "token request blocked with HTTP 403 by the host")
            throw StarkBlocked(
                "vidcloud.eu.org refused the connection (403). " +
                    "Try without VPN, or wait a bit - the host blocks some networks."
            )
        }
        if (res.code != 200) {
            Log.e(TAG, "token request returned HTTP ${res.code}")
        }
        val reply = runCatching { parseJson<TokenReply>(res.text) }.getOrNull()
        val tok = reply?.access_token
        if (tok.isNullOrBlank()) {
            Log.e(TAG, "token reply unusable: HTTP ${res.code}, body: ${res.text.take(120)}")
            throw StarkBlocked("Could not fetch the site token, try again later.")
        }
        Log.i(TAG, "token acquired (length ${tok.length})")
        token = tok
        tok
    }

    suspend fun invalidateToken() {
        tokenMutex.withLock {
            token = null
        }
    }

    fun currentToken(): String? = token

    fun currentSession(): String? = phpSession

    private inline fun <reified T> listReply(text: String): ListReply<T> =
        runCatching { parseJson<ListReply<T>>(text) }.getOrNull() ?: ListReply()

    suspend fun catalog(): List<CatalogBatch> = catalogMutex.withLock {
        val cached = catalogCache
        if (cached != null && System.currentTimeMillis() - catalogAt < 30 * 60 * 1000L) {
            return cached
        }

        // fresh disk copy? parse it instead of pulling 7MB again
        if (cached == null) {
            val disk = loadDiskCatalog(CATALOG_DISK_TTL)
            if (disk != null && !disk.data.isNullOrEmpty()) {
                catalogCache = disk.data
                vidyapeethCache = disk.vidyapeeth_batches.orEmpty()
                catalogAt = System.currentTimeMillis()
                return disk.data
            }
        }

        val started = System.currentTimeMillis()
        val res = try {
            app.get(
                CATALOG_URL,
                headers = mapOf(
                    "User-Agent" to UA,
                    "Accept" to "*/*",
                    "Referer" to "$BASE/",
                )
            )
        } catch (e: Exception) {
            Log.e(TAG, "catalog download failed after ${System.currentTimeMillis() - started}ms: ${e.javaClass.simpleName}: ${e.message}")
            // stale disk copy is better than nothing
            val stale = loadDiskCatalog(Long.MAX_VALUE)
            if (stale != null && !stale.data.isNullOrEmpty()) {
                Log.w(TAG, "using STALE disk catalog (network failed)")
                catalogCache = stale.data
                vidyapeethCache = stale.vidyapeeth_batches.orEmpty()
                catalogAt = 0 // do not count this as fresh
                return stale.data
            }
            throw e
        }
        Log.i(TAG, "catalog downloaded: HTTP ${res.code}, ${res.text.length / 1024}KB in ${System.currentTimeMillis() - started}ms")

        val parsed = runCatching { parseJson<CatalogFile>(res.text) }.getOrNull()
        val list = parsed?.data
        if (list.isNullOrEmpty()) {
            Log.e(TAG, "catalog parse produced no batches (HTTP ${res.code}, body starts: ${res.text.take(80)})")
            // last resort: stale disk copy
            val stale = loadDiskCatalog(Long.MAX_VALUE)
            if (stale != null && !stale.data.isNullOrEmpty()) {
                Log.w(TAG, "using STALE disk catalog (parse failed)")
                catalogCache = stale.data
                vidyapeethCache = stale.vidyapeeth_batches.orEmpty()
                return stale.data
            }
            return cached.orEmpty()
        }
        catalogCache = list
        vidyapeethCache = parsed?.vidyapeeth_batches.orEmpty()
        catalogAt = System.currentTimeMillis()
        if (list.size > 1000) {
            saveDiskCatalog(res.text)
        }
        return list
    }

    suspend fun vidyapeeth(): List<CatalogBatch> {
        catalog()
        return vidyapeethCache.orEmpty()
    }

    suspend fun batchDetails(batchId: String): BatchDetails {
        ensureToken()
        var res = app.get(
            "$BASE/api/v3/batches/$batchId/details?type=EXPLORE_LEAD",
            headers = authHeaders()
        )
        if (res.code == 401 || res.code == 403) {
            Log.w(TAG, "batch details HTTP ${res.code}, refreshing token once")
            invalidateToken()
            ensureToken()
            res = app.get(
                "$BASE/api/v3/batches/$batchId/details?type=EXPLORE_LEAD",
                headers = authHeaders()
            )
        }
        if (!res.text.trimStart().startsWith("{")) {
            Log.e(TAG, "batch details blocked (HTTP ${res.code}, body: ${res.text.take(80)})")
            throw StarkBlocked("Batch details blocked by the host, retry without VPN.")
        }
        return runCatching { parseJson<DetailsReply>(res.text) }.getOrNull()?.data
            ?: throw StarkBlocked("Could not read batch details.")
    }

    /** the contents endpoint keeps totalCount at zero, so a full page means there is another one */
    private fun morePages(out: Int, chunk: Int, limit: Int, total: Int): Boolean {
        if (chunk == 0 || chunk < limit) return false
        if (total > 0 && out >= total) return false
        return true
    }

    suspend fun topics(batchId: String, subjectId: String): List<TopicItem> {
        ensureToken()
        val out = mutableListOf<TopicItem>()
        var page = 1
        while (page < 30) {
            val res = app.get(
                "$BASE/api/v2/batches/$batchId/subject/$subjectId/topics?page=$page",
                headers = authHeaders()
            )
            if (res.code != 200) {
                Log.e(TAG, "topics HTTP ${res.code} for subject $subjectId page $page: ${res.text.take(80)}")
            }
            val reply = listReply<TopicItem>(res.text)
            val chunk = reply.data.orEmpty()
            out += chunk
            val limit = reply.paginate?.limit ?: 20
            val total = reply.paginate?.totalCount ?: -1
            if (!morePages(out.size, chunk.size, limit, total)) break
            page++
        }
        return out
    }

    suspend fun contents(
        subjectId: String,
        topicId: String,
        contentType: String,
    ): List<ContentItem> {
        ensureToken()
        val out = mutableListOf<ContentItem>()
        var page = 1
        while (page < 60) {
            val res = app.get(
                "$BASE/api/v2/batches/$CONTENTS_BATCH/subject/$subjectId/contents" +
                    "?tag=$topicId&contentType=$contentType&page=$page",
                headers = authHeaders()
            )
            if (res.code != 200) {
                Log.e(TAG, "contents($contentType) HTTP ${res.code} for topic $topicId page $page: ${res.text.take(80)}")
            }
            val reply = listReply<ContentItem>(res.text)
            val chunk = reply.data.orEmpty()
            out += chunk
            val limit = reply.paginate?.limit ?: 20
            val total = reply.paginate?.totalCount ?: -1
            if (!morePages(out.size, chunk.size, limit, total)) break
            page++
        }
        return out
    }

    suspend fun dppList(
        batchId: String,
        subjectId: String,
        topicId: String,
    ): List<DppQuizDetails> {
        ensureToken()
        val out = mutableListOf<DppQuizDetails>()
        var page = 1
        while (page < 20) {
            val res = app.get(
                "$BASE/api/v3/test-service/tests/new-dpp-list?page=$page" +
                    "&batchId=$batchId&batchSubjectId=$subjectId&chapterId=$topicId",
                headers = authHeaders()
            )
            if (res.code != 200) {
                Log.e(TAG, "dpp list HTTP ${res.code} page $page: ${res.text.take(80)}")
            }
            val reply = runCatching { parseJson<DppListReply>(res.text) }.getOrNull() ?: break
            val chunk = reply.data.orEmpty()
            out += chunk
            val limit = reply.paginate?.limit ?: 20
            val total = reply.paginate?.totalCount ?: -1
            if (!morePages(out.size, chunk.size, limit, total)) break
            page++
        }
        return out
    }

    data class PlayPage(
        val videoUrl: String?,
        val drmType: String?,
        val keyId: String?,
        val keyValue: String?,
    )

    /**
     * play.php takes the raw cloudfront mpd url, signs it through the site's bunny
     * proxy and hands it back encrypted. No auth header needed, just the cookies.
     */
    suspend fun fetchPlayPage(
        batchId: String,
        subjectId: String,
        topicId: String,
        contentId: String,
        videoDetailsId: String?,
        videoUrl: String,
        videoName: String,
        videoImage: String?,
        playType: String,
    ): PlayPage? {
        ensureToken()
        val params = buildString {
            append("batch_id=").append(batchId)
            append("&program_id=")
            append("&subject_id=").append(subjectId)
            append("&topic_id=").append(topicId)
            append("&video_id=").append(contentId)
            videoDetailsId?.let { append("&typeId=").append(it) }
            append("&video_url=").append(java.net.URLEncoder.encode(videoUrl, "UTF-8"))
            append("&video_name=").append(java.net.URLEncoder.encode(videoName, "UTF-8"))
            append("&video_img=").append(
                java.net.URLEncoder.encode(videoImage ?: "", "UTF-8")
            )
            append("&video_type=new")
            append("&play_type=").append(playType)
        }
        val res = app.get(
            "$BASE/play.php?$params",
            headers = baseHeaders() + mapOf(
                "Cookie" to cookieHeader(),
                "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            )
        )
        val html = res.text
        if (!html.contains("enc_video_url")) {
            Log.e(TAG, "play.php returned no video (HTTP ${res.code}, ${html.length} chars): ${html.take(120)}")
            return null
        }

        fun hidden(id: String): String =
            Regex("<input[^>]*id=\"$id\"[^>]*value=\"([^\"]*)\"").find(html)
                ?.groupValues?.get(1)
                ?.replace("&quot;", "\"")
                ?.replace("&amp;", "&")
                .orEmpty()

        val encUrl = hidden("enc_video_url")
        if (encUrl.isBlank()) return null
        return PlayPage(
            videoUrl = StarkCrypto.decryptVideoUrl(encUrl),
            drmType = StarkCrypto.decryptField(hidden("enc_drm_type")),
            keyId = hidden("enc_key_id").takeIf { it.isNotBlank() }?.let { StarkCrypto.decryptField(it) },
            keyValue = hidden("enc_key_value").takeIf { it.isNotBlank() }?.let { StarkCrypto.decryptField(it) },
        )
    }

    fun baseUrl(): String = BASE
    fun userAgent(): String = UA

    fun pdfViewerUrl(pdfUrl: String): String =
        "$BASE/view-pdf.html?s=" + java.net.URLEncoder.encode(pdfUrl, "UTF-8")

    fun quizUrl(
        testId: String,
        batchId: String,
        subjectId: String,
        topicId: String,
        subjectName: String,
        topicName: String,
        testName: String,
    ): String {
        fun enc(s: String) = java.net.URLEncoder.encode(s, "UTF-8")
        return "$BASE/start-dpp-test/?test_id=$testId&batch_id=$batchId" +
            "&subject_id=$subjectId&subject_name=${enc(subjectName)}" +
            "&topic_id=$topicId&topic_name=${enc(topicName)}" +
            "&test_name=${enc(testName)}"
    }
}
