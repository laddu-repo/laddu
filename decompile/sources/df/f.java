package df;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f4127d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4128a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4129b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4130c;

    static {
        d dVar = d.f4124a;
        e eVar = e.f4125b;
        f4127d = new f(false, dVar, eVar);
        new f(true, dVar, eVar);
    }

    public f(boolean z10, d bytes, e number) {
        kotlin.jvm.internal.k.e(bytes, "bytes");
        kotlin.jvm.internal.k.e(number, "number");
        this.f4128a = z10;
        this.f4129b = bytes;
        this.f4130c = number;
    }

    public final String toString() {
        StringBuilder b10 = y.e.b("HexFormat(\n    upperCase = ");
        b10.append(this.f4128a);
        b10.append(",\n    bytes = BytesHexFormat(\n");
        this.f4129b.a(b10, "        ");
        b10.append('\n');
        b10.append("    ),");
        b10.append('\n');
        b10.append("    number = NumberHexFormat(");
        b10.append('\n');
        this.f4130c.a(b10, "        ");
        b10.append('\n');
        b10.append("    )");
        b10.append('\n');
        b10.append(")");
        return b10.toString();
    }
}
