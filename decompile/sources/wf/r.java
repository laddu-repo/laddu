package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f14380a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f14381b = new a1("kotlin.time.Duration", uf.e.f13123n);

    @Override // sf.a
    public final Object a(vf.b bVar) {
        int i6 = ef.a.A;
        String value = bVar.q();
        kotlin.jvm.internal.k.e(value, "value");
        try {
            return new ef.a(ef.f.a(value));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(h8.c.m("Invalid ISO duration string format: '", value, "'."), e10);
        }
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        long j;
        int h4;
        int h10;
        boolean z10;
        boolean z11;
        long j10 = ((ef.a) obj).f4568x;
        int i6 = ef.a.A;
        StringBuilder sb2 = new StringBuilder();
        if (j10 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        if (j10 < 0) {
            j = ef.a.i(j10);
        } else {
            j = j10;
        }
        long h11 = ef.a.h(j, ef.c.HOURS);
        boolean z12 = false;
        if (ef.a.e(j)) {
            h4 = 0;
        } else {
            h4 = (int) (ef.a.h(j, ef.c.MINUTES) % 60);
        }
        if (ef.a.e(j)) {
            h10 = 0;
        } else {
            h10 = (int) (ef.a.h(j, ef.c.SECONDS) % 60);
        }
        int d10 = ef.a.d(j);
        if (ef.a.e(j10)) {
            h11 = 9999999999999L;
        }
        if (h11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (h10 == 0 && d10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (h4 != 0 || (z11 && z10)) {
            z12 = true;
        }
        if (z10) {
            sb2.append(h11);
            sb2.append('H');
        }
        if (z12) {
            sb2.append(h4);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z12)) {
            ef.a.b(sb2, h10, d10, 9, "S", true);
        }
        tVar.s(sb2.toString());
    }

    @Override // sf.a
    public final uf.g d() {
        return f14381b;
    }
}
