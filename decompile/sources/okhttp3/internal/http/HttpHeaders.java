package okhttp3.internal.http;

import bg.n;
import df.a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpHeaders {
    private static final n QUOTED_STRING_DELIMITERS;
    private static final n TOKEN_DELIMITERS;

    static {
        n nVar = n.A;
        QUOTED_STRING_DELIMITERS = l.u("\"\\");
        TOKEN_DELIMITERS = l.u("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        k.e(response, "response");
        return promisesBody(response);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, bg.k] */
    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        k.e(headers, "<this>");
        k.e(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (headerName.equalsIgnoreCase(headers.name(i6))) {
                ?? obj = new Object();
                obj.s0(headers.value(i6));
                try {
                    readChallengeHeader(obj, arrayList);
                } catch (EOFException e10) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        k.e(response, "<this>");
        if (k.a(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(bg.k r7, java.util.List<okhttp3.Challenge> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb4
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.r()
            if (r7 != 0) goto L21
            goto Lb4
        L21:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            ie.s r0 = ie.s.f6847x
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L63
            if (r6 != 0) goto L40
            boolean r2 = r7.r()
            if (r2 == 0) goto L63
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = y.e.b(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = df.u.D(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.k.d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L63:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6d:
            if (r3 != 0) goto L7e
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb7
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L7e:
            if (r6 == 0) goto Lb7
            r5 = 1
            if (r6 <= r5) goto L84
            goto Lb4
        L84:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8b
            goto Lb4
        L8b:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L98
            java.lang.String r5 = readQuotedString(r7)
            goto L9c
        L98:
            java.lang.String r5 = readToken(r7)
        L9c:
            if (r5 != 0) goto L9f
            goto Lb4
        L9f:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La8
            goto Lb4
        La8:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb5
            boolean r3 = r7.r()
            if (r3 != 0) goto Lb5
        Lb4:
            return
        Lb5:
            r3 = r0
            goto L6d
        Lb7:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(bg.k, java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, bg.k] */
    private static final String readQuotedString(bg.k kVar) {
        if (kVar.readByte() == 34) {
            ?? obj = new Object();
            while (true) {
                long S = kVar.S(QUOTED_STRING_DELIMITERS);
                if (S == -1) {
                    return null;
                }
                if (kVar.y(S) == 34) {
                    obj.write(kVar, S);
                    kVar.readByte();
                    return obj.h0();
                }
                if (kVar.f1726y == S + 1) {
                    return null;
                }
                obj.write(kVar, S);
                kVar.readByte();
                obj.write(kVar, 1L);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final String readToken(bg.k kVar) {
        long S = kVar.S(TOKEN_DELIMITERS);
        if (S == -1) {
            S = kVar.f1726y;
        }
        if (S != 0) {
            return kVar.g0(S, a.f4115a);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        k.e(cookieJar, "<this>");
        k.e(url, "url");
        k.e(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(url, headers);
            if (parseAll.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(url, parseAll);
        }
    }

    private static final boolean skipCommasAndWhitespace(bg.k kVar) {
        boolean z10 = false;
        while (!kVar.r()) {
            byte y9 = kVar.y(0L);
            if (y9 == 44) {
                kVar.readByte();
                z10 = true;
            } else {
                if (y9 != 32 && y9 != 9) {
                    break;
                }
                kVar.readByte();
            }
        }
        return z10;
    }

    private static final boolean startsWith(bg.k kVar, byte b10) {
        if (!kVar.r() && kVar.y(0L) == b10) {
            return true;
        }
        return false;
    }
}
