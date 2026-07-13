package com.laddu100.anisnatch

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class AniSnatchPlugin : Plugin() {
    override fun load(context: Context) {
        AniSnatchProvider.context = context
        registerMainAPI(AniSnatchProvider())
    }

    companion object {
        private const val PREFS_NAME = "anisnatch_cf"
        private const val KEY_COOKIES = "cf_cookies"
        private const val KEY_UA = "cf_ua"
        private const val KEY_TIMESTAMP = "cf_ts"
        private const val COOKIE_TTL = 45 * 60 * 1000L

        fun saveCfData(context: Context, cookies: String, ua: String) {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            prefs.edit()
                .putString(KEY_COOKIES, cookies)
                .putString(KEY_UA, ua)
                .putLong(KEY_TIMESTAMP, System.currentTimeMillis())
                .apply()
        }

        fun getCfCookies(context: Context): String {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            val ts = prefs.getLong(KEY_TIMESTAMP, 0)
            if (System.currentTimeMillis() - ts > COOKIE_TTL) return ""
            return prefs.getString(KEY_COOKIES, "") ?: ""
        }

        fun getCfUserAgent(context: Context): String {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            return prefs.getString(KEY_UA, "") ?: ""
        }

        fun hasValidCookies(context: Context): Boolean {
            return getCfCookies(context).isNotEmpty()
        }
    }
}
