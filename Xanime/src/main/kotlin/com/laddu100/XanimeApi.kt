package com.laddu100

import android.util.Base64
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.lagradost.api.Log
import com.lagradost.cloudstream3.app
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.security.MessageDigest
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec

/**
 * Xanime.me API client.
 *
 * Everything below was extracted from the site's own Qwik build chunks (no guessing):
 *
 *  - The site is a Qwik City app. Its browser client talks to an Apollo GraphQL server at
 *    POST https://xanime.me/z2/ (env API_ENDPOINT_APO, base "/z2/").
 *  - BOTH request bodies and response bodies are obfuscated with AES-256-GCM:
 *      key        = SHA-256(UTF8("xanime-ph25-obfuscation-secret-key-2026"))   (32 bytes)
 *      iv         = 12 random bytes
 *      ciphertext = AES-256-GCM(key, iv, UTF8(JSON.stringify(payload)))  -> ct||tag
 *      envelope   = {"v":1, "iv":base64(iv), "ct":base64(ct||tag)}
 *    (functions Zn/qe/je/ie in /build/q-ClVp6Dcr.js, flag Ue() is always true in browser)
 *  - Operations (all verified live against the real server):
 *      get_q27($select: SearchAnime_Select)   search / home rows
 *      get_q02($getAnimesNodeId: String!)     anime details node
 *      get_q01($select: AnimesEpisodesList_Select) episode list (max ~60/page)
 *      get_q07($select: Episodes_Select)      episode + sourcesNode_list
 *  - Source objects carry: src_type ("sub"/"dub"), src_name ("Vidplay"/"1"), a signed
 *    souPath HLS master playlist (e=epoch expiry, s=signature, ~4.5h) and
 *    track[] {label, kind:"captions", trackPath} = per-language VTT subtitle files.
 */
object XanimeApi {

    const val MAIN_URL = "https://xanime.me"
    const val API_URL = "$MAIN_URL/z2/"
    private const val TAG = "Xanime"

    // Extracted verbatim from the site bundle (function ie() in q-ClVp6Dcr.js)
    private const val SECRET = "xanime-ph25-obfuscation-secret-key-2026"

    val mapper: ObjectMapper = ObjectMapper()

    private val ua =
        "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

    private val headers = mapOf(
        "User-Agent" to ua,
        "Accept" to "application/json",
        "Origin" to MAIN_URL,
        "Referer" to "$MAIN_URL/",
    )

    // ---- crypto (exact port of the site's WebCrypto scheme) ----

    private fun deriveKey(): ByteArray {
        val digest = MessageDigest.getInstance("SHA-256")
        return digest.digest(SECRET.toByteArray(Charsets.UTF_8))
    }

    private val aesKey: ByteArray by lazy { deriveKey() }

    private fun b64encode(bytes: ByteArray): String =
        Base64.encodeToString(bytes, Base64.NO_WRAP)

    private fun b64decode(text: String): ByteArray =
        Base64.decode(text, Base64.DEFAULT)

    /** Encrypt a JSON string into the site's {"v":1,"iv","ct"} envelope. */
    fun encryptPayload(payloadJson: String): String {
        val iv = ByteArray(12).also { SecureRandom().nextBytes(it) }
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, SecretKeySpec(aesKey, "AES"), GCMParameterSpec(128, iv))
        val ct = cipher.doFinal(payloadJson.toByteArray(Charsets.UTF_8)) // ct||tag, same as WebCrypto
        val envelope = mapper.createObjectNode().apply {
            put("v", 1)
            put("iv", b64encode(iv))
            put("ct", b64encode(ct))
        }
        return mapper.writeValueAsString(envelope)
    }

    /** True when the node looks like the site's {v:int, iv:str, ct:str} envelope (site fn je()). */
    private fun isEnvelope(node: JsonNode?): Boolean =
        node != null &&
            node.isObject &&
            node.has("v") && node.get("v").isNumber &&
            node.has("iv") && node.get("iv").isTextual &&
            node.has("ct") && node.get("ct").isTextual

    /** Decrypt a {"v":1,"iv","ct"} envelope back into a JSON string (site fn qe()). */
    fun decryptEnvelope(ivB64: String, ctB64: String): String? = try {
        val iv = b64decode(ivB64)
        val ct = b64decode(ctB64)
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(aesKey, "AES"), GCMParameterSpec(128, iv))
        val plain = cipher.doFinal(ct)
        String(plain, Charsets.UTF_8)
    } catch (e: Exception) {
        Log.d(TAG, "decrypt failed: ${e.message}")
        null
    }

    /**
     * Run a GraphQL operation against /z2/ with the site's encryption.
     * Returns the decrypted "data" node of the response, or null on failure.
     */
    suspend fun gql(operationQuery: String, variables: Map<String, Any?>): JsonNode? {
        return try {
            val body: Map<String, Any?> = mapOf(
                "query" to operationQuery,
                "variables" to variables,
            )
            val encrypted = encryptPayload(mapper.writeValueAsString(body))
            val response = app.post(
                API_URL,
                headers = headers + mapOf("Content-Type" to "application/json"),
                requestBody = encrypted.toRequestBody("application/json; charset=utf-8".toMediaType()),
                timeout = 30_000L
            )
            val node = mapper.readTree(response.text)
            val root = if (isEnvelope(node)) {
                val decrypted = decryptEnvelope(
                    node.get("iv").asText(),
                    node.get("ct").asText()
                ) ?: return null
                mapper.readTree(decrypted)
            } else {
                node
            }
            if (root.has("errors")) {
                Log.d(TAG, "graphql errors: ${root.get("errors")?.toString()?.take(300)}")
                if (!root.has("data")) return null
            }
            root.get("data") ?: root
        } catch (e: Exception) {
            Log.d(TAG, "gql failed: ${e.message}")
            null
        }
    }

    // ---- GraphQL operations (field lists lifted from the site's own fragments) ----

    /** Search / home listing. Select keys verified: word, page, size, sortby, type, year, season, sources. */
    fun searchQuery(): String = """
        query get_q27(${'$'}select: SearchAnime_Select) {
          get_q27(select: ${'$'}select) {
            reqPage reqSize reqSort reqWord
            newPage
            paging { total pages page init size skip limit prev next }
            didYouMean
            items {
              id
              data {
                ani_id
                info_title
                aniPath
                urlCover600
                ep_total
                info_meta_year
                info_meta_type
                info_meta_genre
                info_sou_types
                info_sou_counts { sub { downloaded } dub { downloaded } }
              }
            }
          }
        }
    """.trimIndent()

    /** Full anime node (details page). Fragments F/M from q-DVE1IA1x.js. */
    fun detailsQuery(): String = """
        query Get_animesNode(${'$'}getAnimesNodeId: String!) {
          get_q02(id: ${'$'}getAnimesNodeId) {
            id
            data {
              ani_id
              ani_id_mal
              al_id
              info_title
              aniPath
              urlCover600
              urlCoverOri
              bgimg_url
              ep_total
              date_create
              date_update
              info_aliases
              info_cover_name
              info_filmdesc
              info_meta_dateAiredBegin
              info_meta_dateAiredEnd
              info_meta_duration
              info_meta_genre
              info_meta_quality
              info_meta_scores
              info_meta_season
              info_meta_status
              info_meta_studios
              info_meta_type
              info_meta_views
              info_meta_year
              info_sou_types
              info_sou_counts { sub { downloaded } dub { downloaded } }
              info_site_views
              info_slug
              info_meta_rating
              info_meta_rating_short
              info_meta_episodeCount
              info_meta_qualities
              info_alternative_titles { type title }
            }
          }
        }
    """.trimIndent()

    /** Episode list for one anime, paged (server caps size at ~60). Fragment J from q-DVE1IA1x.js.
     *  sourcesNode_list is accepted by the server on get_q01 items (verified live: every episode
     *  carries its own {src_type: "sub"/"dub"} sources) — this is what drives the Sub/Dub tabs. */
    fun episodeListQuery(): String = """
        query get_q01(${'$'}select: AnimesEpisodesList_Select) {
          get_q01(select: ${'$'}select) {
            paging { total pages page init size skip limit prev next }
            items {
              id
              data {
                ani_id
                ep_id
                status
                ep_index
                ep_sub_index
                ep_title
                epPath
                is_new
                date_create
                date_update
                sourcesNode_list {
                  id
                  data {
                    sou_id
                    src_type
                    src_name
                    src_server
                  }
                }
              }
            }
          }
        }
    """.trimIndent()

    /** Episode detail with every source: signed HLS, subtitle tracks, intro/outro, alt servers. Fragment Q from q-BySPtn83.js. */
    fun episodeSourcesQuery(): String = """
        query get_q07(${'$'}select: Episodes_Select) {
          get_q07(select: ${'$'}select) {
            id
            data {
              ani_id
              ep_id
              ep_index
              ep_sub_index
              ep_title
              epPath
              sourcesNode_list {
                id
                data {
                  ani_id
                  ep_id
                  sou_id
                  src_name
                  src_server
                  src_type
                  souPath
                  status
                  is_new
                  track { label kind default local trackPath }
                  jump { intro { start end } outro { start end } }
                  m3u8_lists { name iframe }
                }
              }
              episodesPrev { ani_id ep_id ep_index ep_sub_index ep_title epPath }
              episodesNext { ani_id ep_id ep_index ep_sub_index ep_title epPath }
            }
          }
        }
    """.trimIndent()

    // ---- response accessors ----

    fun obj(node: JsonNode?): ObjectNode? = node as? ObjectNode

    fun arr(node: JsonNode?): ArrayNode? = node as? ArrayNode

    fun text(node: JsonNode?, key: String): String? {
        val v = node?.get(key) ?: return null
        return if (v.isNull) null else v.asText()
    }

    fun int(node: JsonNode?, key: String): Int? {
        val v = node?.get(key) ?: return null
        return if (v.isNull || !v.isNumber) v.asText(null)?.toIntOrNull() else v.asInt()
    }

    fun strList(node: JsonNode?, key: String): List<String> {
        val v = arr(node?.get(key)) ?: return emptyList()
        return v.filter { it.isTextual }.map { it.asText() }
    }
}
