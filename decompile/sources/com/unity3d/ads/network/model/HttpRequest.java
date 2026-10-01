package com.unity3d.ads.network.model;

import h8.c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        k.e(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i6, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i13 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i13 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i13 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i13 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i13 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i13 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i13 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i13 & 256) != 0) {
            i6 = httpRequest.connectTimeout;
        }
        if ((i13 & 512) != 0) {
            i10 = httpRequest.readTimeout;
        }
        if ((i13 & 1024) != 0) {
            i11 = httpRequest.writeTimeout;
        }
        if ((i13 & 2048) != 0) {
            i12 = httpRequest.callTimeout;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = i6;
        int i17 = i10;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i16, i17, i14, i15);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i6, int i10, int i11, int i12) {
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, num, i6, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (k.a(this.baseURL, httpRequest.baseURL) && k.a(this.path, httpRequest.path) && this.method == httpRequest.method && k.a(this.body, httpRequest.body) && k.a(this.headers, httpRequest.headers) && k.a(this.parameters, httpRequest.parameters) && k.a(this.scheme, httpRequest.scheme) && k.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout) {
            return true;
        }
        return false;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode;
        int g10 = c.g(this.scheme, (this.parameters.hashCode() + ((this.headers.hashCode() + ((this.body.hashCode() + ((this.method.hashCode() + c.g(this.path, this.baseURL.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31, 31);
        Integer num = this.port;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((((((g10 + hashCode) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, 3968, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i6) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i6, 0, 0, 0, 3584, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i6, int i10) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i6, i10, 0, 0, 3072, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i6, int i10, int i11) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i6, i10, i11, 0, 2048, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i6, int i10, int i11, int i12) {
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i6;
        this.readTimeout = i10;
        this.writeTimeout = i11;
        this.callTimeout = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ HttpRequest(java.lang.String r13, java.lang.String r14, com.unity3d.ads.network.model.RequestType r15, com.unity3d.ads.network.model.HttpBody r16, java.util.Map r17, java.util.Map r18, java.lang.String r19, java.lang.Integer r20, int r21, int r22, int r23, int r24, int r25, kotlin.jvm.internal.f r26) {
        /*
            r12 = this;
            r0 = r25
            r1 = r0 & 2
            if (r1 == 0) goto L9
            java.lang.String r1 = ""
            goto La
        L9:
            r1 = r14
        La:
            r2 = r0 & 4
            if (r2 == 0) goto L11
            com.unity3d.ads.network.model.RequestType r2 = com.unity3d.ads.network.model.RequestType.GET
            goto L12
        L11:
            r2 = r15
        L12:
            r3 = r0 & 8
            if (r3 == 0) goto L19
            com.unity3d.ads.network.model.HttpBody$EmptyBody r3 = com.unity3d.ads.network.model.HttpBody.EmptyBody.INSTANCE
            goto L1b
        L19:
            r3 = r16
        L1b:
            r4 = r0 & 16
            ie.s r5 = ie.s.f6847x
            if (r4 == 0) goto L23
            r4 = r5
            goto L25
        L23:
            r4 = r17
        L25:
            r6 = r0 & 32
            if (r6 == 0) goto L2a
            goto L2c
        L2a:
            r5 = r18
        L2c:
            r6 = r0 & 64
            if (r6 == 0) goto L33
            java.lang.String r6 = "https"
            goto L35
        L33:
            r6 = r19
        L35:
            r7 = r0 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L3b
            r7 = 0
            goto L3d
        L3b:
            r7 = r20
        L3d:
            r8 = r0 & 256(0x100, float:3.59E-43)
            r9 = 30000(0x7530, float:4.2039E-41)
            if (r8 == 0) goto L46
            r8 = 30000(0x7530, float:4.2039E-41)
            goto L48
        L46:
            r8 = r21
        L48:
            r10 = r0 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto L4f
            r10 = 30000(0x7530, float:4.2039E-41)
            goto L51
        L4f:
            r10 = r22
        L51:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L58
            r11 = 30000(0x7530, float:4.2039E-41)
            goto L5a
        L58:
            r11 = r23
        L5a:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L77
            r26 = 30000(0x7530, float:4.2039E-41)
        L60:
            r14 = r12
            r15 = r13
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r10
            r25 = r11
            goto L7a
        L77:
            r26 = r24
            goto L60
        L7a:
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String, java.lang.Integer, int, int, int, int, int, kotlin.jvm.internal.f):void");
    }
}
