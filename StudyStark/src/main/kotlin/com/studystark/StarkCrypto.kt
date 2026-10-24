package com.studystark

import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

/**
 * play.php hands the stream url to the player as an AES blob sitting in a hidden
 * input on the page. Same key/iv live inside video-script.js.
 */
object StarkCrypto {

    private val KEY = "R7@kP4#xL9!mQ2$v".toByteArray(Charsets.UTF_8)
    private val IV = "T3!nW8\$qZ5@rK1#p".toByteArray(Charsets.UTF_8)

    fun decryptVideoUrl(b64: String): String? {
        if (b64.isBlank()) return null
        return try {
            val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
            cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(KEY, "AES"), IvParameterSpec(IV))
            val plain = cipher.doFinal(java.util.Base64.getDecoder().decode(b64))
            String(plain, Charsets.UTF_8).trim().ifBlank { null }
        } catch (_: Exception) {
            null
        }
    }

    fun decryptField(b64: String): String? {
        if (b64.isBlank()) return null
        return try {
            val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
            cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(KEY, "AES"), IvParameterSpec(IV))
            String(cipher.doFinal(java.util.Base64.getDecoder().decode(b64)), Charsets.UTF_8).trim()
        } catch (_: Exception) {
            null
        }
    }
}
