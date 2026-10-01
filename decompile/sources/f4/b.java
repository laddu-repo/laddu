package f4;

import java.util.Objects;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4705a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.s f4706b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f4707c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4708d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4709e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4710f;

    /* renamed from: g, reason: collision with root package name */
    public String f4711g;

    /* renamed from: h, reason: collision with root package name */
    public y2.f0 f4712h;

    /* renamed from: i, reason: collision with root package name */
    public int f4713i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4714k;

    /* renamed from: l, reason: collision with root package name */
    public long f4715l;

    /* renamed from: m, reason: collision with root package name */
    public r1.q f4716m;

    /* renamed from: n, reason: collision with root package name */
    public int f4717n;

    /* renamed from: o, reason: collision with root package name */
    public long f4718o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(null, str, 0, 0);
        this.f4705a = 0;
    }

    @Override // f4.i
    public final void a(u1.t tVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f4705a) {
            case 0:
                u1.c.h(this.f4712h);
                while (tVar.a() > 0) {
                    int i6 = this.f4713i;
                    u1.t tVar2 = this.f4707c;
                    boolean z15 = true;
                    if (i6 == 0) {
                        while (true) {
                            if (tVar.a() <= 0) {
                                break;
                            }
                            if (!this.f4714k) {
                                if (tVar.y() == 11) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f4714k = z10;
                            } else {
                                int y9 = tVar.y();
                                if (y9 == 119) {
                                    this.f4714k = false;
                                    this.f4713i = 1;
                                    byte[] bArr = tVar2.f12811a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                } else {
                                    if (y9 == 11) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    this.f4714k = z11;
                                }
                            }
                        }
                    } else if (i6 != 1) {
                        if (i6 == 2) {
                            int min = Math.min(tVar.a(), this.f4717n - this.j);
                            this.f4712h.a(min, tVar);
                            int i10 = this.j + min;
                            this.j = i10;
                            if (i10 == this.f4717n) {
                                if (this.f4718o == -9223372036854775807L) {
                                    z15 = false;
                                }
                                u1.c.g(z15);
                                this.f4712h.c(this.f4718o, 1, this.f4717n, 0, null);
                                this.f4718o += this.f4715l;
                                this.f4713i = 0;
                            }
                        }
                    } else {
                        byte[] bArr2 = tVar2.f12811a;
                        int min2 = Math.min(tVar.a(), 128 - this.j);
                        tVar.i(bArr2, this.j, min2);
                        int i11 = this.j + min2;
                        this.j = i11;
                        if (i11 == 128) {
                            u1.s sVar = this.f4706b;
                            sVar.q(0);
                            y2.b p10 = y2.a.p(sVar);
                            int i12 = p10.f14857f;
                            int i13 = p10.f14853b;
                            int i14 = p10.f14854c;
                            String str = p10.f14852a;
                            r1.q qVar = this.f4716m;
                            if (qVar == null || i14 != qVar.F || i13 != qVar.G || !Objects.equals(str, qVar.f11670n)) {
                                r1.p pVar = new r1.p();
                                pVar.f11600a = this.f4711g;
                                pVar.f11610l = k0.p(this.f4710f);
                                pVar.f11611m = k0.p(str);
                                pVar.E = i14;
                                pVar.F = i13;
                                pVar.f11603d = this.f4708d;
                                pVar.f11605f = this.f4709e;
                                pVar.f11608i = i12;
                                if ("audio/ac3".equals(str)) {
                                    pVar.f11607h = i12;
                                }
                                r1.q qVar2 = new r1.q(pVar);
                                this.f4716m = qVar2;
                                this.f4712h.f(qVar2);
                            }
                            this.f4717n = p10.f14855d;
                            this.f4715l = (p10.f14856e * 1000000) / this.f4716m.G;
                            tVar2.K(0);
                            this.f4712h.a(128, tVar2);
                            this.f4713i = 2;
                        }
                    }
                }
                return;
            default:
                u1.c.h(this.f4712h);
                while (tVar.a() > 0) {
                    int i15 = this.f4713i;
                    u1.t tVar3 = this.f4707c;
                    boolean z16 = true;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 == 2) {
                                int min3 = Math.min(tVar.a(), this.f4717n - this.j);
                                this.f4712h.a(min3, tVar);
                                int i16 = this.j + min3;
                                this.j = i16;
                                if (i16 == this.f4717n) {
                                    if (this.f4718o == -9223372036854775807L) {
                                        z16 = false;
                                    }
                                    u1.c.g(z16);
                                    this.f4712h.c(this.f4718o, 1, this.f4717n, 0, null);
                                    this.f4718o += this.f4715l;
                                    this.f4713i = 0;
                                }
                            }
                        } else {
                            byte[] bArr3 = tVar3.f12811a;
                            int min4 = Math.min(tVar.a(), 16 - this.j);
                            tVar.i(bArr3, this.j, min4);
                            int i17 = this.j + min4;
                            this.j = i17;
                            if (i17 == 16) {
                                u1.s sVar2 = this.f4706b;
                                sVar2.q(0);
                                a3.c q9 = y2.a.q(sVar2);
                                int i18 = q9.f521a;
                                r1.q qVar3 = this.f4716m;
                                if (qVar3 == null || 2 != qVar3.F || i18 != qVar3.G || !"audio/ac4".equals(qVar3.f11670n)) {
                                    r1.p pVar2 = new r1.p();
                                    pVar2.f11600a = this.f4711g;
                                    pVar2.f11610l = k0.p(this.f4710f);
                                    pVar2.f11611m = k0.p("audio/ac4");
                                    pVar2.E = 2;
                                    pVar2.F = i18;
                                    pVar2.f11603d = this.f4708d;
                                    pVar2.f11605f = this.f4709e;
                                    r1.q qVar4 = new r1.q(pVar2);
                                    this.f4716m = qVar4;
                                    this.f4712h.f(qVar4);
                                }
                                this.f4717n = q9.f522b;
                                this.f4715l = (q9.f523c * 1000000) / this.f4716m.G;
                                tVar3.K(0);
                                this.f4712h.a(16, tVar3);
                                this.f4713i = 2;
                            }
                        }
                    } else {
                        while (tVar.a() > 0) {
                            if (!this.f4714k) {
                                if (tVar.y() == 172) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f4714k = z12;
                            } else {
                                int y10 = tVar.y();
                                if (y10 == 172) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                this.f4714k = z13;
                                int i19 = 64;
                                if (y10 == 64 || y10 == 65) {
                                    if (y10 == 65) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    this.f4713i = 1;
                                    byte[] bArr4 = tVar3.f12811a;
                                    bArr4[0] = -84;
                                    if (z14) {
                                        i19 = 65;
                                    }
                                    bArr4[1] = (byte) i19;
                                    this.j = 2;
                                }
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override // f4.i
    public final void c() {
        switch (this.f4705a) {
            case 0:
                this.f4713i = 0;
                this.j = 0;
                this.f4714k = false;
                this.f4718o = -9223372036854775807L;
                return;
            default:
                this.f4713i = 0;
                this.j = 0;
                this.f4714k = false;
                this.f4718o = -9223372036854775807L;
                return;
        }
    }

    @Override // f4.i
    public final void d(boolean z10) {
        int i6 = this.f4705a;
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        switch (this.f4705a) {
            case 0:
                this.f4718o = j;
                return;
            default:
                this.f4718o = j;
                return;
        }
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        switch (this.f4705a) {
            case 0:
                h0Var.a();
                h0Var.b();
                this.f4711g = h0Var.f4815e;
                h0Var.b();
                this.f4712h = qVar.A(h0Var.f4814d, 1);
                return;
            default:
                h0Var.a();
                h0Var.b();
                this.f4711g = h0Var.f4815e;
                h0Var.b();
                this.f4712h = qVar.A(h0Var.f4814d, 1);
                return;
        }
    }

    public b(String str, String str2, int i6, int i10) {
        this.f4705a = i10;
        switch (i10) {
            case 1:
                u1.s sVar = new u1.s(16, new byte[16]);
                this.f4706b = sVar;
                this.f4707c = new u1.t(sVar.f12804b);
                this.f4713i = 0;
                this.j = 0;
                this.f4714k = false;
                this.f4718o = -9223372036854775807L;
                this.f4708d = str;
                this.f4709e = i6;
                this.f4710f = str2;
                return;
            default:
                u1.s sVar2 = new u1.s(128, new byte[128]);
                this.f4706b = sVar2;
                this.f4707c = new u1.t(sVar2.f12804b);
                this.f4713i = 0;
                this.f4718o = -9223372036854775807L;
                this.f4708d = str;
                this.f4709e = i6;
                this.f4710f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
