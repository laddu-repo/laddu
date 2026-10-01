package m2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f8447c = new c0(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f8448d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f8449a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8450b;

    public c0(long j, long j10) {
        this.f8449a = j;
        this.f8450b = j10;
    }

    public static c0 a(String str) {
        long parseFloat;
        long parseFloat2;
        Matcher matcher = f8448d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = a0.f8422a;
        if (matches) {
            String group = matcher.group(1);
            if (group != null) {
                String str2 = u1.a0.f12750a;
                if (group.equals("now")) {
                    parseFloat = 0;
                } else {
                    parseFloat = Float.parseFloat(group) * 1000.0f;
                }
                String group2 = matcher.group(2);
                if (group2 != null) {
                    try {
                        parseFloat2 = Float.parseFloat(group2) * 1000.0f;
                        if (parseFloat2 < parseFloat) {
                            throw l0.b(str, null);
                        }
                    } catch (NumberFormatException e10) {
                        throw l0.b(group2, e10);
                    }
                } else {
                    parseFloat2 = -9223372036854775807L;
                }
                return new c0(parseFloat, parseFloat2);
            }
            throw l0.b(str, null);
        }
        throw l0.b(str, null);
    }
}
