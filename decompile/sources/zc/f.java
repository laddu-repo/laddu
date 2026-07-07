package zc;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pd.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements jd.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final jd.c f14891v = jd.c.f7075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1.j f14892w = new w1.j();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Map f14893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CookieManager f14894y;

    public f() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        de.i.d(mapSynchronizedMap, "synchronizedMap(...)");
        this.f14893x = mapSynchronizedMap;
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        this.f14894y = cookieManager;
    }

    public static LinkedHashMap a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                Collection collection = (List) entry.getValue();
                if (collection == null) {
                    collection = p.f10551v;
                }
                linkedHashMap.put(str, collection);
            }
        }
        return linkedHashMap;
    }

    @Override // jd.e
    public final jd.c J(ad.c cVar, Set set) {
        de.i.e(set, "supportedFileDownloaderTypes");
        return this.f14891v;
    }

    @Override // jd.e
    public final Set U(ad.c cVar) {
        jd.c cVar2 = jd.c.f7075v;
        jd.c cVar3 = this.f14891v;
        if (cVar3 == cVar2) {
            return qf.g.A(cVar3);
        }
        try {
            return z7.b.z(cVar, this);
        } catch (Exception unused) {
            return qf.g.A(cVar3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map map = this.f14893x;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((Map.Entry) it.next()).getValue();
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused) {
                }
            }
        }
        map.clear();
    }

    public final void i(HttpURLConnection httpURLConnection, ad.c cVar) throws ProtocolException {
        httpURLConnection.setRequestMethod((String) cVar.f482z);
        this.f14892w.getClass();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        for (Map.Entry entry : ((LinkedHashMap) cVar.f480x).entrySet()) {
            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // jd.e
    public final void p(jd.d dVar) {
        Map map = this.f14893x;
        if (map.containsKey(dVar)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) map.get(dVar);
            map.remove(dVar);
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // jd.e
    public final jd.d v(ad.c cVar, jd.l lVar) throws IOException {
        String str;
        boolean z2;
        long jQ;
        String strL;
        de.i.e(lVar, "interruptMonitor");
        CookieHandler.setDefault(this.f14894y);
        String str2 = (String) cVar.f479w;
        URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
        de.i.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        i(httpURLConnection, cVar);
        if (httpURLConnection.getRequestProperty("Referer") == null) {
            httpURLConnection.addRequestProperty("Referer", z7.b.y(str2));
        }
        httpURLConnection.connect();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        de.i.d(headerFields, "getHeaderFields(...)");
        LinkedHashMap linkedHashMapA = a(headerFields);
        int responseCode = httpURLConnection.getResponseCode();
        str = "";
        if ((responseCode == 302 || responseCode == 301 || responseCode == 303) && z7.b.v(linkedHashMapA, "Location") != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            String strV = z7.b.v(linkedHashMapA, "Location");
            if (strV == null) {
                strV = "";
            }
            URLConnection uRLConnectionOpenConnection2 = new URL(strV).openConnection();
            de.i.c(uRLConnectionOpenConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
            i(httpURLConnection, cVar);
            if (httpURLConnection.getRequestProperty("Referer") == null) {
                httpURLConnection.addRequestProperty("Referer", z7.b.y(str2));
            }
            httpURLConnection.connect();
            Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
            de.i.d(headerFields2, "getHeaderFields(...)");
            linkedHashMapA = a(headerFields2);
            responseCode = httpURLConnection.getResponseCode();
        }
        HttpURLConnection httpURLConnection2 = httpURLConnection;
        LinkedHashMap linkedHashMap = linkedHashMapA;
        int i = responseCode;
        InputStream inputStream = null;
        if (200 > i || i >= 300) {
            z2 = false;
            jQ = -1;
            strL = z7.b.l(httpURLConnection2.getErrorStream());
        } else {
            jQ = z7.b.q(linkedHashMap);
            InputStream inputStream2 = httpURLConnection2.getInputStream();
            String strV2 = z7.b.v(linkedHashMap, "Content-MD5");
            str = strV2 != null ? strV2 : "";
            z2 = true;
            strL = null;
            inputStream = inputStream2;
        }
        boolean zD = z7.b.d(i, linkedHashMap);
        de.i.d(httpURLConnection2.getHeaderFields(), "getHeaderFields(...)");
        jd.d dVar = new jd.d(i, z2, jQ, inputStream, cVar, str, linkedHashMap, zD, strL);
        this.f14893x.put(dVar, httpURLConnection2);
        return dVar;
    }

    @Override // jd.e
    public final void S(ad.c cVar) {
    }

    @Override // jd.e
    public final void Y(ad.c cVar) {
    }

    @Override // jd.e
    public final void z(ad.c cVar) {
    }
}
