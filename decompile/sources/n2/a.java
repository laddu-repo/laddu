package n2;

import java.math.RoundingMode;
import m2.l;
import u1.a0;
import u1.s;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l f8945a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8946b = new s();

    /* renamed from: c, reason: collision with root package name */
    public final int f8947c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8948d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8949e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8950f;

    /* renamed from: g, reason: collision with root package name */
    public long f8951g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f8952h;

    /* renamed from: i, reason: collision with root package name */
    public long f8953i;

    public a(l lVar) {
        this.f8945a = lVar;
        this.f8947c = lVar.f8517b;
        String str = (String) lVar.f8519d.get("mode");
        str.getClass();
        if (dg.b.f(str, "AAC-hbr")) {
            this.f8948d = 13;
            this.f8949e = 3;
        } else if (dg.b.f(str, "AAC-lbr")) {
            this.f8948d = 6;
            this.f8949e = 2;
        } else {
            throw new UnsupportedOperationException("AAC mode not supported");
        }
        this.f8950f = this.f8949e + this.f8948d;
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        this.f8951g = j;
        this.f8953i = j10;
    }

    @Override // n2.i
    public final void d(long j) {
        this.f8951g = j;
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 1);
        this.f8952h = A;
        A.f(this.f8945a.f8518c);
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        this.f8952h.getClass();
        short v10 = tVar.v();
        int i10 = v10 / this.f8950f;
        long o10 = a8.d.o(this.f8953i, j, this.f8951g, this.f8947c);
        s sVar = this.f8946b;
        sVar.p(tVar);
        int i11 = this.f8949e;
        int i12 = this.f8948d;
        if (i10 == 1) {
            int i13 = sVar.i(i12);
            sVar.t(i11);
            this.f8952h.a(tVar.a(), tVar);
            if (z10) {
                this.f8952h.c(o10, 1, i13, 0, null);
                return;
            }
            return;
        }
        tVar.L((v10 + 7) / 8);
        long j10 = o10;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = sVar.i(i12);
            sVar.t(i11);
            this.f8952h.a(i15, tVar);
            this.f8952h.c(j10, 1, i15, 0, null);
            j10 += a0.Y(i10, 1000000L, this.f8947c, RoundingMode.DOWN);
        }
    }
}
