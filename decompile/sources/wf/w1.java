package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w1 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w1 f14421a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f14422b = new a1("kotlin.uuid.Uuid", uf.e.f13123n);

    @Override // sf.a
    public final Object a(vf.b bVar) {
        String concat;
        String uuidString = bVar.q();
        kotlin.jvm.internal.k.e(uuidString, "uuidString");
        int length = uuidString.length();
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    concat = uuidString;
                } else {
                    String substring = uuidString.substring(0, 64);
                    kotlin.jvm.internal.k.d(substring, "substring(...)");
                    concat = substring.concat("...");
                }
                sb2.append(concat);
                sb2.append("\" of length ");
                sb2.append(uuidString.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long b10 = df.c.b(uuidString, 0, 8);
            a8.a.b(8, uuidString);
            long b11 = df.c.b(uuidString, 9, 13);
            a8.a.b(13, uuidString);
            long b12 = df.c.b(uuidString, 14, 18);
            a8.a.b(18, uuidString);
            long b13 = df.c.b(uuidString, 19, 23);
            a8.a.b(23, uuidString);
            long j = (b11 << 16) | (b10 << 32) | b12;
            long b14 = df.c.b(uuidString, 24, 36) | (b13 << 48);
            if (j != 0 || b14 != 0) {
                return new ff.b(j, b14);
            }
        } else {
            long b15 = df.c.b(uuidString, 0, 16);
            long b16 = df.c.b(uuidString, 16, 32);
            if (b15 != 0 || b16 != 0) {
                return new ff.b(b15, b16);
            }
        }
        return ff.b.f5270z;
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        ff.b value = (ff.b) obj;
        kotlin.jvm.internal.k.e(value, "value");
        tVar.s(value.toString());
    }

    @Override // sf.a
    public final uf.g d() {
        return f14422b;
    }
}
