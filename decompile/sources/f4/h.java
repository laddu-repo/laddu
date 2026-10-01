package f4;

import java.util.Collections;
import java.util.List;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4804a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4805b;

    /* renamed from: c, reason: collision with root package name */
    public long f4806c;

    /* renamed from: d, reason: collision with root package name */
    public int f4807d;

    /* renamed from: e, reason: collision with root package name */
    public int f4808e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4809f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4810g;

    public h(List list) {
        this.f4804a = 0;
        this.f4809f = list;
        this.f4810g = new y2.f0[list.size()];
        this.f4806c = -9223372036854775807L;
    }

    @Override // f4.i
    public final void a(u1.t tVar) {
        boolean z10;
        boolean z11;
        switch (this.f4804a) {
            case 0:
                if (this.f4805b) {
                    if (this.f4807d == 2) {
                        if (tVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (tVar.y() != 32) {
                                this.f4805b = false;
                            }
                            this.f4807d--;
                            z11 = this.f4805b;
                        }
                        if (!z11) {
                            return;
                        }
                    }
                    if (this.f4807d == 1) {
                        if (tVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (tVar.y() != 0) {
                                this.f4805b = false;
                            }
                            this.f4807d--;
                            z10 = this.f4805b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i6 = tVar.f12812b;
                    int a10 = tVar.a();
                    for (y2.f0 f0Var : (y2.f0[]) this.f4810g) {
                        tVar.K(i6);
                        f0Var.a(a10, tVar);
                    }
                    this.f4808e += a10;
                    return;
                }
                return;
            default:
                u1.t tVar2 = (u1.t) this.f4809f;
                u1.c.h((y2.f0) this.f4810g);
                if (this.f4805b) {
                    int a11 = tVar.a();
                    int i10 = this.f4808e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(tVar.f12811a, tVar.f12812b, tVar2.f12811a, this.f4808e, min);
                        if (this.f4808e + min == 10) {
                            tVar2.K(0);
                            if (73 == tVar2.y() && 68 == tVar2.y() && 51 == tVar2.y()) {
                                tVar2.L(3);
                                this.f4807d = tVar2.x() + 10;
                            } else {
                                u1.a.p("Id3Reader", "Discarding invalid ID3 tag");
                                this.f4805b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.f4807d - this.f4808e);
                    ((y2.f0) this.f4810g).a(min2, tVar);
                    this.f4808e += min2;
                    return;
                }
                return;
        }
    }

    @Override // f4.i
    public final void c() {
        switch (this.f4804a) {
            case 0:
                this.f4805b = false;
                this.f4806c = -9223372036854775807L;
                return;
            default:
                this.f4805b = false;
                this.f4806c = -9223372036854775807L;
                return;
        }
    }

    @Override // f4.i
    public final void d(boolean z10) {
        boolean z11;
        int i6;
        boolean z12;
        switch (this.f4804a) {
            case 0:
                if (this.f4805b) {
                    if (this.f4806c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u1.c.g(z11);
                    for (y2.f0 f0Var : (y2.f0[]) this.f4810g) {
                        f0Var.c(this.f4806c, 1, this.f4808e, 0, null);
                    }
                    this.f4805b = false;
                    return;
                }
                return;
            default:
                u1.c.h((y2.f0) this.f4810g);
                if (this.f4805b && (i6 = this.f4807d) != 0 && this.f4808e == i6) {
                    if (this.f4806c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u1.c.g(z12);
                    ((y2.f0) this.f4810g).c(this.f4806c, 1, this.f4807d, 0, null);
                    this.f4805b = false;
                    return;
                }
                return;
        }
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        switch (this.f4804a) {
            case 0:
                if ((i6 & 4) != 0) {
                    this.f4805b = true;
                    this.f4806c = j;
                    this.f4808e = 0;
                    this.f4807d = 2;
                    return;
                }
                return;
            default:
                if ((i6 & 4) != 0) {
                    this.f4805b = true;
                    this.f4806c = j;
                    this.f4807d = 0;
                    this.f4808e = 0;
                    return;
                }
                return;
        }
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        switch (this.f4804a) {
            case 0:
                y2.f0[] f0VarArr = (y2.f0[]) this.f4810g;
                for (int i6 = 0; i6 < f0VarArr.length; i6++) {
                    g0 g0Var = (g0) ((List) this.f4809f).get(i6);
                    h0Var.a();
                    h0Var.b();
                    y2.f0 A = qVar.A(h0Var.f4814d, 3);
                    r1.p pVar = new r1.p();
                    h0Var.b();
                    pVar.f11600a = h0Var.f4815e;
                    pVar.f11610l = k0.p("video/mp2t");
                    pVar.f11611m = k0.p("application/dvbsubs");
                    pVar.f11614p = Collections.singletonList(g0Var.f4803b);
                    pVar.f11603d = g0Var.f4802a;
                    r4.a.v(pVar, A);
                    f0VarArr[i6] = A;
                }
                return;
            default:
                h0Var.a();
                h0Var.b();
                y2.f0 A2 = qVar.A(h0Var.f4814d, 5);
                this.f4810g = A2;
                r1.p pVar2 = new r1.p();
                h0Var.b();
                pVar2.f11600a = h0Var.f4815e;
                pVar2.f11610l = k0.p("video/mp2t");
                pVar2.f11611m = k0.p("application/id3");
                r4.a.v(pVar2, A2);
                return;
        }
    }

    public h() {
        this.f4804a = 1;
        this.f4809f = new u1.t(10);
        this.f4806c = -9223372036854775807L;
    }
}
