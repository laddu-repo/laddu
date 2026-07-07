package okhttp3;

import bg.b;
import bg.e0;
import bg.f0;
import bg.j;
import bg.j0;
import bg.l0;
import bg.m;
import bg.n;
import bg.r;
import bg.s;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import df.u;
import ie.t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class CacheResponseBody extends ResponseBody {
        private final m bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            k.e(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = b.d(new s(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // bg.s, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return Util.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public m source() {
            return this.bodySource;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i6 = 0; i6 < size; i6++) {
                if ("Vary".equalsIgnoreCase(headers.name(i6))) {
                    String value = headers.value(i6);
                    if (treeSet == null) {
                        u.B();
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = df.m.a0(value, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(df.m.n0((String) it.next()).toString());
                    }
                }
            }
            if (treeSet == null) {
                return t.f6848x;
            }
            return treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            k.e(response, "<this>");
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl url) {
            k.e(url, "url");
            n nVar = n.A;
            return l.u(url.toString()).c("MD5").e();
        }

        public final int readInt$okhttp(m source) {
            k.e(source, "source");
            try {
                long u3 = source.u();
                String R = source.R();
                if (u3 >= 0 && u3 <= 2147483647L && R.length() <= 0) {
                    return (int) u3;
                }
                throw new IOException("expected an int but was \"" + u3 + R + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            k.e(response, "<this>");
            Response networkResponse = response.networkResponse();
            k.b(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            k.e(cachedResponse, "cachedResponse");
            k.e(cachedRequest, "cachedRequest");
            k.e(newRequest, "newRequest");
            Set<String> varyFields = varyFields(cachedResponse.headers());
            if (varyFields == null || !varyFields.isEmpty()) {
                for (String str : varyFields) {
                    if (!k.a(cachedRequest.values(str), newRequest.headers(str))) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }

        private Companion() {
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i6 = 0; i6 < size; i6++) {
                String name = headers.name(i6);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i6));
                }
            }
            return builder.build();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class RealCacheRequest implements CacheRequest {
        private final j0 body;
        private final j0 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            k.e(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            j0 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new r(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // bg.r, bg.j0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public j0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z10) {
            this.done = z10;
        }
    }

    public Cache(File directory, long j, FileSystem fileSystem) {
        k.e(directory, "directory");
        k.e(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, directory, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m169deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        k.e(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly(body);
                    }
                    return null;
                }
                return response;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        k.e(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!k.a(method, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void remove$okhttp(Request request) {
        k.e(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i6) {
        this.writeAbortCount = i6;
    }

    public final void setWriteSuccessCount$okhttp(int i6) {
        this.writeSuccessCount = i6;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        try {
            k.e(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(Response cached, Response network) {
        DiskLruCache.Editor editor;
        k.e(cached, "cached");
        k.e(network, "network");
        Entry entry = new Entry(network);
        ResponseBody body = cached.body();
        k.c(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor == null) {
                return;
            }
            try {
                entry.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public final Iterator<String> urls() {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File directory, long j) {
        this(directory, j, FileSystem.SYSTEM);
        k.e(directory, "directory");
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private Companion() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb2.append(companion.get().getPrefix());
            sb2.append("-Sent-Millis");
            SENT_MILLIS = sb2.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(l0 rawSource) {
            TlsVersion tlsVersion;
            k.e(rawSource, "rawSource");
            try {
                f0 d10 = b.d(rawSource);
                String x10 = d10.x(Long.MAX_VALUE);
                HttpUrl parse = HttpUrl.Companion.parse(x10);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = d10.x(Long.MAX_VALUE);
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.Companion.readInt$okhttp(d10);
                    for (int i6 = 0; i6 < readInt$okhttp; i6++) {
                        builder.addLenient$okhttp(d10.x(Long.MAX_VALUE));
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.Companion.parse(d10.x(Long.MAX_VALUE));
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.Companion.readInt$okhttp(d10);
                    for (int i10 = 0; i10 < readInt$okhttp2; i10++) {
                        builder2.addLenient$okhttp(d10.x(Long.MAX_VALUE));
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                    this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                    this.responseHeaders = builder2.build();
                    if (isHttps()) {
                        String x11 = d10.x(Long.MAX_VALUE);
                        if (x11.length() <= 0) {
                            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(d10.x(Long.MAX_VALUE));
                            List<Certificate> readCertificateList = readCertificateList(d10);
                            List<Certificate> readCertificateList2 = readCertificateList(d10);
                            if (!d10.r()) {
                                tlsVersion = TlsVersion.Companion.forJavaName(d10.x(Long.MAX_VALUE));
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException("expected \"\" but was \"" + x11 + '\"');
                        }
                    } else {
                        this.handshake = null;
                    }
                    rawSource.close();
                    return;
                }
                IOException iOException = new IOException("Cache corruption for ".concat(x10));
                Platform.Companion.get().log("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    jb.b.j(rawSource, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return k.a(this.url.scheme(), HttpRequest.DEFAULT_SCHEME);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, bg.m, bg.k] */
        private final List<Certificate> readCertificateList(m mVar) {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(mVar);
            if (readInt$okhttp == -1) {
                return ie.r.f6846x;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                int i6 = 0;
                for (int i10 = 0; i10 < readInt$okhttp; i10++) {
                    String R = mVar.R();
                    ?? obj = new Object();
                    n nVar = n.A;
                    n s = l.s(R);
                    if (s != null) {
                        obj.k0(s);
                        arrayList.add(certificateFactory.generateCertificate(new j(obj, i6)));
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void writeCertList(bg.l lVar, List<? extends Certificate> list) {
            try {
                lVar.Z(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    n nVar = n.A;
                    k.d(bytes, "bytes");
                    lVar.F(l.v(bytes).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            k.e(request, "request");
            k.e(response, "response");
            if (k.a(this.url, request.url()) && k.a(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            k.e(snapshot, "snapshot");
            String str = this.responseHeaders.get(CommonGatewayClient.HEADER_CONTENT_TYPE);
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            k.e(editor, "editor");
            e0 c10 = b.c(editor.newSink(0));
            try {
                c10.F(this.url.toString());
                c10.writeByte(10);
                c10.F(this.requestMethod);
                c10.writeByte(10);
                c10.Z(this.varyHeaders.size());
                c10.writeByte(10);
                int size = this.varyHeaders.size();
                for (int i6 = 0; i6 < size; i6++) {
                    c10.F(this.varyHeaders.name(i6));
                    c10.F(": ");
                    c10.F(this.varyHeaders.value(i6));
                    c10.writeByte(10);
                }
                c10.F(new StatusLine(this.protocol, this.code, this.message).toString());
                c10.writeByte(10);
                c10.Z(this.responseHeaders.size() + 2);
                c10.writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    c10.F(this.responseHeaders.name(i10));
                    c10.F(": ");
                    c10.F(this.responseHeaders.value(i10));
                    c10.writeByte(10);
                }
                c10.F(SENT_MILLIS);
                c10.F(": ");
                c10.Z(this.sentRequestMillis);
                c10.writeByte(10);
                c10.F(RECEIVED_MILLIS);
                c10.F(": ");
                c10.Z(this.receivedResponseMillis);
                c10.writeByte(10);
                if (isHttps()) {
                    c10.writeByte(10);
                    Handshake handshake = this.handshake;
                    k.b(handshake);
                    c10.F(handshake.cipherSuite().javaName());
                    c10.writeByte(10);
                    writeCertList(c10, this.handshake.peerCertificates());
                    writeCertList(c10, this.handshake.localCertificates());
                    c10.F(this.handshake.tlsVersion().javaName());
                    c10.writeByte(10);
                }
                c10.close();
            } finally {
            }
        }

        public Entry(Response response) {
            k.e(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
