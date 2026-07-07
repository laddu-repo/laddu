package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g6.i f2395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HttpURLConnection f2397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InputStream f2398y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f2399z;

    public k(g6.i iVar, int i) {
        this.f2395v = iVar;
        this.f2396w = i;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e7) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e7);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f2398y;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2397x;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2397x = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f2399z = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, c cVar) {
        g6.i iVar = this.f2395v;
        int i = v6.h.f13224b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (iVar.f == null) {
                    iVar.f = new URL(iVar.d());
                }
                cVar.q(f(iVar.f, 0, null, iVar.f5675b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + v6.h.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e7) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e7);
                }
                cVar.k(e7);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + v6.h.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + v6.h.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i, URL url2, Map map) throws a6.c {
        if (i >= 5) {
            throw new a6.c(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new a6.c(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i10 = this.f2396w;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f2397x = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f2398y = this.f2397x.getInputStream();
                if (this.f2399z) {
                    return null;
                }
                int iC = c(this.f2397x);
                int i11 = iC / 100;
                if (i11 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f2397x;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f2398y = new v6.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f2398y = httpURLConnection2.getInputStream();
                        }
                        return this.f2398y;
                    } catch (IOException e7) {
                        throw new a6.c(c(httpURLConnection2), e7, "Failed to obtain InputStream");
                    }
                }
                if (i11 != 3) {
                    if (iC == -1) {
                        throw new a6.c(iC, null, "Http request failed");
                    }
                    try {
                        throw new a6.c(iC, null, this.f2397x.getResponseMessage());
                    } catch (IOException e10) {
                        throw new a6.c(iC, e10, "Failed to get a response message");
                    }
                }
                String headerField = this.f2397x.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new a6.c(iC, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e11) {
                    throw new a6.c(iC, e11, d0.d.k("Bad redirect url: ", headerField));
                }
            } catch (IOException e12) {
                throw new a6.c(c(this.f2397x), e12, "Failed to connect or obtain data");
            }
        } catch (IOException e13) {
            throw new a6.c(0, e13, "URL.openConnection threw");
        }
    }
}
