package df;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f4125b = new e();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4126a = true;

    public e() {
        if (!a8.a.a(HttpUrl.FRAGMENT_ENCODE_SET)) {
            a8.a.a(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    public final void a(StringBuilder sb2, String str) {
        r4.a.u(sb2, str, "prefix = \"", HttpUrl.FRAGMENT_ENCODE_SET, "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("suffix = \"");
        sb2.append(HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(str);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
