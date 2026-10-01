package com.unity3d.ads.network.model;

import ie.s;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, 14, null);
        k.e(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i6, Map map, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i10 & 2) != 0) {
            i6 = httpResponse.statusCode;
        }
        if ((i10 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i10 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i6, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object body, int i6, Map<String, ? extends Object> headers, String urlString) {
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(urlString, "urlString");
        return new HttpResponse(body, i6, headers, urlString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (k.a(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && k.a(this.headers, httpResponse.headers) && k.a(this.urlString, httpResponse.urlString)) {
            return true;
        }
        return false;
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return this.urlString.hashCode() + ((this.headers.hashCode() + (((this.body.hashCode() * 31) + this.statusCode) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponse(body=");
        sb2.append(this.body);
        sb2.append(", statusCode=");
        sb2.append(this.statusCode);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", urlString=");
        return a.n(sb2, this.urlString, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i6) {
        this(body, i6, null, null, 12, null);
        k.e(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i6, Map<String, ? extends Object> headers) {
        this(body, i6, headers, null, 8, null);
        k.e(body, "body");
        k.e(headers, "headers");
    }

    public HttpResponse(Object body, int i6, Map<String, ? extends Object> headers, String urlString) {
        k.e(body, "body");
        k.e(headers, "headers");
        k.e(urlString, "urlString");
        this.body = body;
        this.statusCode = i6;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i6, Map map, String str, int i10, f fVar) {
        this(obj, (i10 & 2) != 0 ? 200 : i6, (i10 & 4) != 0 ? s.f6847x : map, (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str);
    }
}
