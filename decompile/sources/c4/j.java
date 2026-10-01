package c4;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import t1.g0;
import w1.b0;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f2102a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(t tVar) {
        tVar.getClass();
        String strK = tVar.k(StandardCharsets.UTF_8);
        return strK != null && strK.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = b0.f13686a;
        String[] strArrSplit = str.split("\\.", 2);
        long j8 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j8 = (j8 * 60) + Long.parseLong(str2);
        }
        long j9 = j8 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j9 += Long.parseLong(strTrim);
        }
        return j9 * 1000;
    }

    public static void d(t tVar) throws g0 {
        int i = tVar.f13739b;
        if (a(tVar)) {
            return;
        }
        tVar.J(i);
        throw g0.a(null, "Expected WEBVTT. Got " + tVar.k(StandardCharsets.UTF_8));
    }
}
