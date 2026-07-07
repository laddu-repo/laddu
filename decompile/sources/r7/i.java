package r7;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.jvm.internal.k;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Closeable, Flushable {

    /* renamed from: x, reason: collision with root package name */
    public final DiskLruCache f11868x;

    public i(DiskLruCache diskLruCache) {
        this.f11868x = diskLruCache;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11868x.close();
    }

    public final Response d(Request request) {
        k.e(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.f11868x.get(d.a(request));
            if (snapshot != null) {
                try {
                    e eVar = new e(snapshot.getSource(0));
                    RequestBody body = request.body();
                    Headers headers = eVar.f11855g;
                    String str = headers.get(CommonGatewayClient.HEADER_CONTENT_TYPE);
                    String str2 = headers.get("Content-Length");
                    Response.Builder receivedResponseAtMillis = new Response.Builder().request(new Request.Builder().url(eVar.f11849a).method(eVar.f11851c, body).headers(eVar.f11850b).build()).protocol(eVar.f11852d).code(eVar.f11853e).message(eVar.f11854f).headers(headers).handshake(eVar.f11856h).sentRequestAtMillis(eVar.f11857i).receivedResponseAtMillis(eVar.j);
                    Response build = receivedResponseAtMillis.cacheResponse(receivedResponseAtMillis.build()).body(new c(snapshot, str, str2)).build();
                    if (request.tag(a8.b.class) == null) {
                        return build.newBuilder().request(request).build();
                    }
                    throw new ClassCastException();
                } catch (IOException unused) {
                    Util.closeQuietly(snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response f(okhttp3.Response r9) {
        /*
            r8 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.k.e(r9, r0)
            boolean r0 = r9.isSuccessful()
            if (r0 != 0) goto Lc
            goto L4b
        Lc:
            r7.e r0 = new r7.e
            r0.<init>(r9)
            r1 = 0
            okhttp3.internal.cache.DiskLruCache r2 = r8.f11868x     // Catch: java.io.IOException -> L32
            okhttp3.Request r3 = r9.request()     // Catch: java.io.IOException -> L32
            java.lang.String r3 = r7.d.a(r3)     // Catch: java.io.IOException -> L32
            r6 = 2
            r7 = 0
            r4 = 0
            okhttp3.internal.cache.DiskLruCache$Editor r2 = okhttp3.internal.cache.DiskLruCache.edit$default(r2, r3, r4, r6, r7)     // Catch: java.io.IOException -> L32
            if (r2 != 0) goto L27
            goto L4b
        L27:
            r0.c(r2)     // Catch: java.io.IOException -> L30
            r7.g r0 = new r7.g     // Catch: java.io.IOException -> L30
            r0.<init>(r8, r2)     // Catch: java.io.IOException -> L30
            goto L3c
        L30:
            goto L34
        L32:
            r2 = r1
        L34:
            if (r2 == 0) goto L3b
            r2.abort()     // Catch: java.io.IOException -> L3a
            goto L3b
        L3a:
        L3b:
            r0 = r1
        L3c:
            if (r0 != 0) goto L3f
            goto L4b
        L3f:
            r7.f r2 = r0.f11862c
            bg.e0 r2 = bg.b.c(r2)
            okhttp3.ResponseBody r3 = r9.body()
            if (r3 != 0) goto L4c
        L4b:
            return r9
        L4c:
            bg.m r4 = r3.source()
            r7.h r5 = new r7.h
            r5.<init>(r4, r0, r2)
            java.lang.String r0 = "Content-Type"
            r2 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r9, r0, r1, r2, r1)
            long r1 = r3.contentLength()
            okhttp3.Response$Builder r9 = r9.newBuilder()
            okhttp3.internal.http.RealResponseBody r3 = new okhttp3.internal.http.RealResponseBody
            bg.f0 r4 = bg.b.d(r5)
            r3.<init>(r0, r1, r4)
            okhttp3.Response$Builder r9 = r9.body(r3)
            okhttp3.Response r9 = r9.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.i.f(okhttp3.Response):okhttp3.Response");
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f11868x.flush();
    }
}
