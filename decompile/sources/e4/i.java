package e4;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import r1.l0;
import u1.a0;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4349a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(t tVar) {
        tVar.getClass();
        String l10 = tVar.l(StandardCharsets.UTF_8);
        if (l10 != null && l10.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = a0.f12750a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j10 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() == 3) {
                j10 += Long.parseLong(trim);
            } else {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
        }
        return j10 * 1000;
    }

    public static void d(t tVar) {
        int i6 = tVar.f12812b;
        if (a(tVar)) {
            return;
        }
        tVar.K(i6);
        throw l0.a(null, "Expected WEBVTT. Got " + tVar.l(StandardCharsets.UTF_8));
    }
}
