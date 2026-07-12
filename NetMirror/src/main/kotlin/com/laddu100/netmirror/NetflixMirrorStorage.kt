package com.laddu100.netmirror

import android.content.Context
import android.content.SharedPreferences

object NetflixMirrorStorage {
    private lateinit var context: Context
    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        this.context = context.applicationContext
        this.prefs = context.getSharedPreferences("NetflixMirrorPrefs", Context.MODE_PRIVATE)
    }

    fun saveCookie(cookie: String) {
        val editor = prefs.edit()
        editor.putString("nf_cookie", cookie)
        editor.putLong("nf_cookie_timestamp", System.currentTimeMillis())
        editor.apply()
    }

    fun getCookie(): Pair<String?, Long> {
        return Pair(
            prefs.getString("nf_cookie", null),
            prefs.getLong("nf_cookie_timestamp", 0L)
        )
    }

    fun clearCookie() {
        val editor = prefs.edit()
        editor.remove("nf_cookie")
        editor.remove("nf_cookie_timestamp")
        editor.apply()
    }

    // ---- Play domain cookie (net77.cc — for play.php/playlist.php) ----

    fun savePlayCookie(cookie: String) {
        prefs.edit().apply {
            putString("nf_play_cookie", cookie)
            putLong("nf_play_cookie_ts", System.currentTimeMillis())
            apply()
        }
    }

    fun getPlayCookie(): Pair<String?, Long> {
        return Pair(
            prefs.getString("nf_play_cookie", null),
            prefs.getLong("nf_play_cookie_ts", 0L)
        )
    }

    fun clearPlayCookie() {
        prefs.edit().apply {
            remove("nf_play_cookie")
            remove("nf_play_cookie_ts")
            apply()
        }
    }

    // ---- NewTV Usertoken (obtained via OTP verification) ----

    fun saveUserToken(token: String) {
        prefs.edit().apply {
            putString("newtv_usertoken", token)
            putLong("newtv_usertoken_ts", System.currentTimeMillis())
            apply()
        }
    }

    fun getUserToken(): Pair<String?, Long> {
        val token = prefs.getString("newtv_usertoken", null) ?: return Pair(null, 0L)
        val ts = prefs.getLong("newtv_usertoken_ts", 0L)
        // Token expires after 24 hours
        if (System.currentTimeMillis() - ts > 86_400_000L) {
            clearUserToken()
            return Pair(null, 0L)
        }
        return Pair(token, ts)
    }

    fun clearUserToken() {
        prefs.edit().apply {
            remove("newtv_usertoken")
            remove("newtv_usertoken_ts")
            apply()
        }
    }
}
