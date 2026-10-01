package okhttp3.internal.http;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        k.e(method, "method");
        if (!method.equals("GET") && !method.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static final boolean requiresRequestBody(String method) {
        k.e(method, "method");
        if (!method.equals("POST") && !method.equals("PUT") && !method.equals("PATCH") && !method.equals("PROPPATCH") && !method.equals("REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(String method) {
        k.e(method, "method");
        if (!method.equals("POST") && !method.equals("PATCH") && !method.equals("PUT") && !method.equals("DELETE") && !method.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(String method) {
        k.e(method, "method");
        return !method.equals("PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        k.e(method, "method");
        return method.equals("PROPFIND");
    }
}
