package com.unity3d.services.core.network.model;

import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.data.model.OperationType;
import h8.c;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
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
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        k.e(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i6, int i10, int i11, int i12, boolean z10, OperationType operationType, File file, int i13, int i14, Object obj2) {
        int i15;
        File file2;
        String str4;
        HttpRequest httpRequest2;
        OperationType operationType2;
        String str5;
        RequestType requestType2;
        Object obj3;
        Map map3;
        Map map4;
        BodyType bodyType2;
        String str6;
        Integer num2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        String str7 = (i14 & 1) != 0 ? httpRequest.baseURL : str;
        String str8 = (i14 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType3 = (i14 & 4) != 0 ? httpRequest.method : requestType;
        Object obj4 = (i14 & 8) != 0 ? httpRequest.body : obj;
        Map map5 = (i14 & 16) != 0 ? httpRequest.headers : map;
        Map map6 = (i14 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType3 = (i14 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str9 = (i14 & 128) != 0 ? httpRequest.scheme : str3;
        Integer num3 = (i14 & 256) != 0 ? httpRequest.port : num;
        int i20 = (i14 & 512) != 0 ? httpRequest.connectTimeout : i6;
        int i21 = (i14 & 1024) != 0 ? httpRequest.readTimeout : i10;
        int i22 = (i14 & 2048) != 0 ? httpRequest.writeTimeout : i11;
        int i23 = (i14 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? httpRequest.callTimeout : i12;
        boolean z12 = (i14 & 8192) != 0 ? httpRequest.isProtobuf : z10;
        String str10 = str7;
        OperationType operationType3 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i14 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i14 & 65536) != 0) {
            file2 = file3;
            i15 = httpRequest.priority;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i16 = i20;
            i17 = i21;
            i18 = i22;
            i19 = i23;
            z11 = z12;
            str4 = str10;
            httpRequest2 = httpRequest;
        } else {
            i15 = i13;
            file2 = file3;
            str4 = str10;
            httpRequest2 = httpRequest;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i16 = i20;
            i17 = i21;
            i18 = i22;
            i19 = i23;
            z11 = z12;
        }
        return httpRequest2.copy(str4, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i16, i17, i18, i19, z11, operationType2, file2, i15);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10, int i11, int i12, boolean z10, OperationType operationType, File file, int i13) {
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
        k.e(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, i10, i11, i12, z10, operationType, file, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (k.a(this.baseURL, httpRequest.baseURL) && k.a(this.path, httpRequest.path) && this.method == httpRequest.method && k.a(this.body, httpRequest.body) && k.a(this.headers, httpRequest.headers) && k.a(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && k.a(this.scheme, httpRequest.scheme) && k.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && k.a(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority) {
            return true;
        }
        return false;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.method.hashCode() + c.g(this.path, this.baseURL.hashCode() * 31, 31)) * 31;
        Object obj = this.body;
        int i6 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int g10 = c.g(this.scheme, (this.bodyType.hashCode() + ((this.parameters.hashCode() + ((this.headers.hashCode() + ((hashCode3 + hashCode) * 31)) * 31)) * 31)) * 31, 31);
        Integer num = this.port;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i10 = (((((((((g10 + hashCode2) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout) * 31;
        boolean z10 = this.isProtobuf;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int hashCode4 = (this.operationType.hashCode() + ((i10 + i11) * 31)) * 31;
        File file = this.downloadDestination;
        if (file != null) {
            i6 = file.hashCode();
        }
        return ((hashCode4 + i6) * 31) + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, 0, 0, 0, false, null, null, 0, 130048, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, i10, 0, 0, false, null, null, 0, 129024, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10, int i11) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, i10, i11, 0, false, null, null, 0, 126976, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10, int i11, int i12) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, i10, i11, i12, false, null, null, 0, 122880, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10, int i11, int i12, boolean z10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, i10, i11, i12, z10, null, null, 0, 114688, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10, int i11, int i12, boolean z10, OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, i10, i11, i12, z10, operationType, null, 0, 98304, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
        k.e(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10, int i11, int i12, boolean z10, OperationType operationType, File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i6, i10, i11, i12, z10, operationType, file, 0, 65536, null);
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
        k.e(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i6, int i10, int i11, int i12, boolean z10, OperationType operationType, File file, int i13) {
        k.e(baseURL, "baseURL");
        k.e(path, "path");
        k.e(method, "method");
        k.e(headers, "headers");
        k.e(parameters, "parameters");
        k.e(bodyType, "bodyType");
        k.e(scheme, "scheme");
        k.e(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i6;
        this.readTimeout = i10;
        this.writeTimeout = i11;
        this.callTimeout = i12;
        this.isProtobuf = z10;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ HttpRequest(java.lang.String r19, java.lang.String r20, com.unity3d.services.core.network.model.RequestType r21, java.lang.Object r22, java.util.Map r23, java.util.Map r24, com.unity3d.services.core.network.model.BodyType r25, java.lang.String r26, java.lang.Integer r27, int r28, int r29, int r30, int r31, boolean r32, com.unity3d.ads.core.data.model.OperationType r33, java.io.File r34, int r35, int r36, kotlin.jvm.internal.f r37) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, kotlin.jvm.internal.f):void");
    }
}
