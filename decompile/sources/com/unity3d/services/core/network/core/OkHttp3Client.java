package com.unity3d.services.core.network.core;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gf.f0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final OkHttpClient client;
    private final ISDKDispatchers dispatchers;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, OkHttpClient client) {
        k.e(dispatchers, "dispatchers");
        k.e(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest r11, final boolean r12, le.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.unity3d.services.core.network.core.OkHttp3Client$execute$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.services.core.network.core.OkHttp3Client$execute$1 r0 = (com.unity3d.services.core.network.core.OkHttp3Client$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.network.core.OkHttp3Client$execute$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r11 = r0.L$2
            okhttp3.OkHttpClient r11 = (okhttp3.OkHttpClient) r11
            java.lang.Object r11 = r0.L$1
            okhttp3.Request r11 = (okhttp3.Request) r11
            java.lang.Object r11 = r0.L$0
            com.unity3d.services.core.network.model.HttpRequest r11 = (com.unity3d.services.core.network.model.HttpRequest) r11
            he.a.f(r13)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            return r13
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            he.a.f(r13)
            okhttp3.Request r13 = com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(r11)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            okhttp3.OkHttpClient r1 = r10.client     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            okhttp3.OkHttpClient$Builder r1 = r1.newBuilder()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            int r3 = r11.getConnectTimeout()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            long r3 = (long) r3     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            okhttp3.OkHttpClient$Builder r1 = r1.connectTimeout(r3, r5)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            int r3 = r11.getReadTimeout()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            long r3 = (long) r3     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            okhttp3.OkHttpClient$Builder r1 = r1.readTimeout(r3, r5)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            int r3 = r11.getWriteTimeout()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            long r3 = (long) r3     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            okhttp3.OkHttpClient$Builder r1 = r1.writeTimeout(r3, r5)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            okhttp3.OkHttpClient r1 = r1.build()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r0.L$0 = r11     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r0.L$1 = r13     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r0.L$2 = r1     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r0.Z$0 = r12     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r0.label = r2     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            gf.k r3 = new gf.k     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            le.c r0 = a8.c.i(r0)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r3.<init>(r2, r0)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r3.s()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            okhttp3.Call r13 = r1.newCall(r13)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r0.<init>(r13)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r3.u(r0)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r0.<init>()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            r13.enqueue(r0)     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            java.lang.Object r11 = r3.r()     // Catch: java.io.IOException -> L9b java.net.SocketTimeoutException -> Lb0
            me.a r12 = me.a.f8833x
            if (r11 != r12) goto L9a
            return r12
        L9a:
            return r11
        L9b:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r0 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request failed"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        Lb0:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r0 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request timeout"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, boolean, le.c):java.lang.Object");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        k.e(request, "request");
        return (HttpResponse) f0.B(this.dispatchers.getIo(), new OkHttp3Client$executeBlocking$1(this, request, null));
    }
}
