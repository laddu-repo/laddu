package d4;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f4260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.f f4261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2.g0 f4262e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t1.o f4263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4264h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4270o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f4273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f4277v;

    public t(int i, String str) {
        this.f4258a = str;
        this.f4259b = i;
        w1.t tVar = new w1.t(1024);
        this.f4260c = tVar;
        byte[] bArr = tVar.f13738a;
        this.f4261d = new u3.f(bArr.length, bArr);
        this.f4267l = -9223372036854775807L;
    }

    @Override // d4.i
    public final void a() {
        this.f4264h = 0;
        this.f4267l = -9223372036854775807L;
        this.f4268m = false;
    }

    @Override // d4.i
    public final void b(w1.t tVar) throws t1.g0 {
        int i;
        boolean zH;
        w1.a.k(this.f4262e);
        while (tVar.a() > 0) {
            int i10 = this.f4264h;
            if (i10 != 0) {
                if (i10 != 1) {
                    w1.t tVar2 = this.f4260c;
                    u3.f fVar = this.f4261d;
                    if (i10 == 2) {
                        int iX = ((this.f4266k & (-225)) << 8) | tVar.x();
                        this.f4265j = iX;
                        if (iX > tVar2.f13738a.length) {
                            tVar2.G(iX);
                            byte[] bArr = tVar2.f13738a;
                            fVar.getClass();
                            fVar.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.f4264h = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(tVar.a(), this.f4265j - this.i);
                        tVar.h(fVar.f12868b, this.i, iMin);
                        int i11 = this.i + iMin;
                        this.i = i11;
                        if (i11 == this.f4265j) {
                            fVar.q(0);
                            if (fVar.h()) {
                                if (this.f4268m) {
                                }
                                this.f4264h = 0;
                            } else {
                                this.f4268m = true;
                                int i12 = fVar.i(1);
                                int i13 = i12 == 1 ? fVar.i(1) : 0;
                                this.f4269n = i13;
                                if (i13 != 0) {
                                    throw t1.g0.a(null, null);
                                }
                                if (i12 == 1) {
                                    fVar.i((fVar.i(2) + 1) * 8);
                                }
                                if (!fVar.h()) {
                                    throw t1.g0.a(null, null);
                                }
                                this.f4270o = fVar.i(6);
                                int i14 = fVar.i(4);
                                int i15 = fVar.i(3);
                                if (i14 != 0 || i15 != 0) {
                                    throw t1.g0.a(null, null);
                                }
                                if (i12 == 0) {
                                    int iG = fVar.g();
                                    int iB = fVar.b();
                                    w2.a aVarN = w2.b.n(fVar, true);
                                    this.f4277v = aVarN.f13752a;
                                    this.f4274s = aVarN.f13753b;
                                    this.f4276u = aVarN.f13754c;
                                    int iB2 = iB - fVar.b();
                                    fVar.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    fVar.j(iB2, bArr2);
                                    t1.n nVar = new t1.n();
                                    nVar.f12026a = this.f;
                                    nVar.f12035l = t1.f0.p("video/mp2t");
                                    nVar.f12036m = t1.f0.p("audio/mp4a-latm");
                                    nVar.f12033j = this.f4277v;
                                    nVar.E = this.f4276u;
                                    nVar.F = this.f4274s;
                                    nVar.f12039p = Collections.singletonList(bArr2);
                                    nVar.f12029d = this.f4258a;
                                    nVar.f = this.f4259b;
                                    t1.o oVar = new t1.o(nVar);
                                    if (!oVar.equals(this.f4263g)) {
                                        this.f4263g = oVar;
                                        this.f4275t = 1024000000 / ((long) oVar.G);
                                        this.f4262e.c(oVar);
                                    }
                                } else {
                                    int iB3 = fVar.b();
                                    w2.a aVarN2 = w2.b.n(fVar, true);
                                    this.f4277v = aVarN2.f13752a;
                                    this.f4274s = aVarN2.f13753b;
                                    this.f4276u = aVarN2.f13754c;
                                    fVar.t(fVar.i((fVar.i(2) + 1) * 8) - (iB3 - fVar.b()));
                                }
                                int i16 = fVar.i(3);
                                this.f4271p = i16;
                                if (i16 == 0) {
                                    fVar.t(8);
                                } else if (i16 == 1) {
                                    fVar.t(9);
                                } else if (i16 == 3 || i16 == 4 || i16 == 5) {
                                    fVar.t(6);
                                } else {
                                    if (i16 != 6 && i16 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    fVar.t(1);
                                }
                                boolean zH2 = fVar.h();
                                this.f4272q = zH2;
                                this.f4273r = 0L;
                                if (zH2) {
                                    if (i12 == 1) {
                                        this.f4273r = fVar.i((fVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = fVar.h();
                                            this.f4273r = (this.f4273r << 8) + ((long) fVar.i(8));
                                        } while (zH);
                                    }
                                }
                                if (fVar.h()) {
                                    fVar.t(8);
                                }
                            }
                            if (this.f4269n != 0) {
                                throw t1.g0.a(null, null);
                            }
                            if (this.f4270o != 0) {
                                throw t1.g0.a(null, null);
                            }
                            if (this.f4271p != 0) {
                                throw t1.g0.a(null, null);
                            }
                            int i17 = 0;
                            do {
                                i = fVar.i(8);
                                i17 += i;
                            } while (i == 255);
                            int iG2 = fVar.g();
                            if ((iG2 & 7) == 0) {
                                tVar2.J(iG2 >> 3);
                            } else {
                                fVar.j(i17 * 8, tVar2.f13738a);
                                tVar2.J(0);
                            }
                            this.f4262e.d(i17, tVar2);
                            w1.a.j(this.f4267l != -9223372036854775807L);
                            this.f4262e.a(this.f4267l, 1, i17, 0, null);
                            this.f4267l += this.f4275t;
                            if (this.f4272q) {
                                fVar.t((int) this.f4273r);
                            }
                            this.f4264h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iX2 = tVar.x();
                    if ((iX2 & 224) == 224) {
                        this.f4266k = iX2;
                        this.f4264h = 2;
                    } else if (iX2 != 86) {
                        this.f4264h = 0;
                    }
                }
            } else if (tVar.x() == 86) {
                this.f4264h = 1;
            }
        }
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4267l = j8;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f4262e = qVar.r(g0Var.f4140d, 1);
        g0Var.b();
        this.f = g0Var.f4141e;
    }

    @Override // d4.i
    public final void c(boolean z2) {
    }
}
