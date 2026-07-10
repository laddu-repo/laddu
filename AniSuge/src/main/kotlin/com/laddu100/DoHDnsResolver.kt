package com.laddu100

import okhttp3.Dns
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.net.InetAddress
import java.net.UnknownHostException
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit

/**
 * DoH (DNS over HTTPS) resolver that bypasses ISP DNS blocking.
 *
 * Problem: Some ISPs block CDN domains (mt.nekostream.site, cdn.mewstream.buzz,
 * fxpy7.watching.onl) at the DNS level. Devices using DefaultHttpDataSource
 * (which uses system DNS) can't resolve these domains → "Source error" in ExoPlayer.
 * Devices using CronetDataSource work because Chromium has its own DNS stack.
 *
 * Solution: Replace CloudStream's global OkHttpClient DNS with this resolver.
 * It tries system DNS first (fast, works for non-blocked domains), then falls
 * back to Cloudflare DoH (1.1.1.1) for blocked domains.
 *
 * This fixes BOTH API calls AND ExoPlayer's DefaultHttpDataSource, since
 * DefaultHttpDataSource uses the global OkHttpClient internally.
 */
object DoHDnsResolver {

    private val cache = ConcurrentHashMap<String, List<InetAddress>>()

    private val dohClient = OkHttpClient.Builder()
        .connectTimeout(3, TimeUnit.SECONDS)
        .readTimeout(3, TimeUnit.SECONDS)
        .build()

    val dns = object : Dns {
        override fun lookup(hostname: String): List<InetAddress> {
            // 1. Check cache (0ms overhead)
            cache[hostname]?.let { return it }

            // 2. Try system DNS first (fast, works for non-blocked domains)
            try {
                val systemResult = Dns.SYSTEM.lookup(hostname)
                if (systemResult.isNotEmpty()) {
                    cache[hostname] = systemResult
                    return systemResult
                }
            } catch (e: Exception) {
                // System DNS failed — domain might be ISP-blocked
            }

            // 3. Fall back to Cloudflare DoH (bypasses ISP DNS blocking)
            try {
                val dohResult = resolveViaDoH(hostname)
                if (dohResult.isNotEmpty()) {
                    cache[hostname] = dohResult
                    return dohResult
                }
            } catch (e: Exception) {
                // DoH also failed
            }

            throw UnknownHostException(hostname)
        }
    }

    private fun resolveViaDoH(hostname: String): List<InetAddress> {
        val request = Request.Builder()
            .url("https://1.1.1.1/dns-query?name=$hostname&type=A")
            .header("Accept", "application/dns-json")
            .build()

        dohClient.newCall(request).execute().use { response ->
            val body = response.body?.string() ?: return emptyList()
            val json = JSONObject(body)
            val answers = json.optJSONArray("Answer") ?: return emptyList()
            return (0 until answers.length()).mapNotNull { i ->
                val answer = answers.getJSONObject(i)
                if (answer.optInt("type") == 1) {
                    InetAddress.getByName(answer.optString("data"))
                } else null
            }
        }
    }

    /**
     * Inject DoH DNS into CloudStream's global OkHttpClient.
     * Call this from Plugin.load() — affects ALL HTTP calls including ExoPlayer.
     * Safe because system DNS is tried first; DoH only used for blocked domains.
     */
    fun inject() {
        try {
            val clientField = com.lagradost.cloudstream3.app::class.java.getDeclaredField("client")
            clientField.isAccessible = true
            val currentClient = clientField.get(com.lagradost.cloudstream3.app) as OkHttpClient
            val newClient = currentClient.newBuilder()
                .dns(dns)
                .build()
            clientField.set(com.lagradost.cloudstream3.app, newClient)
        } catch (e: Exception) {
            try {
                val baseClientField = com.lagradost.cloudstream3.app::class.java.getDeclaredField("baseClient")
                baseClientField.isAccessible = true
                val currentBase = baseClientField.get(com.lagradost.cloudstream3.app) as OkHttpClient
                val newBase = currentBase.newBuilder()
                    .dns(dns)
                    .build()
                baseClientField.set(com.lagradost.cloudstream3.app, newBase)

                val clientField = com.lagradost.cloudstream3.app::class.java.getDeclaredField("client")
                clientField.isAccessible = true
                val currentClient = clientField.get(com.lagradost.cloudstream3.app) as OkHttpClient
                val newClient = currentClient.newBuilder()
                    .dns(dns)
                    .build()
                clientField.set(com.lagradost.cloudstream3.app, newClient)
            } catch (e2: Exception) {
                // Both attempts failed — continue with system DNS
            }
        }
    }
}
