package df;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4124a;

    /* JADX WARN: Type inference failed for: r0v0, types: [df.d, java.lang.Object] */
    static {
        ?? obj = new Object();
        if (!a8.a.a("  ") && !a8.a.a(HttpUrl.FRAGMENT_ENCODE_SET) && !a8.a.a(HttpUrl.FRAGMENT_ENCODE_SET)) {
            a8.a.a(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        f4124a = obj;
    }

    public final void a(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSeparator = \"");
        sb2.append(HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append("\",");
        sb2.append('\n');
        r4.a.u(sb2, str, "bytePrefix = \"", HttpUrl.FRAGMENT_ENCODE_SET, "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSuffix = \"");
        sb2.append(HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append("\"");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
