package com.unity3d.ads.core.extensions;

import bg.n;
import df.a;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        k.e(str, "<this>");
        byte[] bytes = str.getBytes(a.f4115a);
        k.d(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] data = Arrays.copyOf(bytes, bytes.length);
        n nVar = n.A;
        k.e(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        k.d(copyOf, "copyOf(...)");
        String e10 = new n(copyOf).c("SHA-256").e();
        k.d(e10, "bytes.sha256().hex()");
        return e10;
    }

    public static final String guessMimeType(String str) {
        k.e(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
