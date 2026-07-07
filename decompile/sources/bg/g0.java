package bg;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1710a;

    /* renamed from: b, reason: collision with root package name */
    public int f1711b;

    /* renamed from: c, reason: collision with root package name */
    public int f1712c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1713d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1714e;

    /* renamed from: f, reason: collision with root package name */
    public g0 f1715f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f1716g;

    public g0() {
        this.f1710a = new byte[8192];
        this.f1714e = true;
        this.f1713d = false;
    }

    public final g0 a() {
        g0 g0Var = this.f1715f;
        if (g0Var == this) {
            g0Var = null;
        }
        g0 g0Var2 = this.f1716g;
        kotlin.jvm.internal.k.b(g0Var2);
        g0Var2.f1715f = this.f1715f;
        g0 g0Var3 = this.f1715f;
        kotlin.jvm.internal.k.b(g0Var3);
        g0Var3.f1716g = this.f1716g;
        this.f1715f = null;
        this.f1716g = null;
        return g0Var;
    }

    public final void b(g0 segment) {
        kotlin.jvm.internal.k.e(segment, "segment");
        segment.f1716g = this;
        segment.f1715f = this.f1715f;
        g0 g0Var = this.f1715f;
        kotlin.jvm.internal.k.b(g0Var);
        g0Var.f1716g = segment;
        this.f1715f = segment;
    }

    public final g0 c() {
        this.f1713d = true;
        return new g0(this.f1710a, this.f1711b, this.f1712c, true, false);
    }

    public final void d(g0 sink, int i6) {
        kotlin.jvm.internal.k.e(sink, "sink");
        byte[] bArr = sink.f1710a;
        if (sink.f1714e) {
            int i10 = sink.f1712c;
            int i11 = i10 + i6;
            if (i11 > 8192) {
                if (!sink.f1713d) {
                    int i12 = sink.f1711b;
                    if (i11 - i12 <= 8192) {
                        ie.i.b0(0, i12, i10, bArr, bArr);
                        sink.f1712c -= sink.f1711b;
                        sink.f1711b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i13 = sink.f1712c;
            int i14 = this.f1711b;
            ie.i.b0(i13, i14, i14 + i6, this.f1710a, bArr);
            sink.f1712c += i6;
            this.f1711b += i6;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public g0(byte[] data, int i6, int i10, boolean z10, boolean z11) {
        kotlin.jvm.internal.k.e(data, "data");
        this.f1710a = data;
        this.f1711b = i6;
        this.f1712c = i10;
        this.f1713d = z10;
        this.f1714e = z11;
    }
}
