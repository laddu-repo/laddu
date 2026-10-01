package f4;

import java.util.Arrays;
import java.util.Collections;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f4741x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4742a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4746e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4747f;

    /* renamed from: g, reason: collision with root package name */
    public String f4748g;

    /* renamed from: h, reason: collision with root package name */
    public y2.f0 f4749h;

    /* renamed from: i, reason: collision with root package name */
    public y2.f0 f4750i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4753m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4754n;

    /* renamed from: q, reason: collision with root package name */
    public int f4757q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4758r;

    /* renamed from: t, reason: collision with root package name */
    public int f4759t;

    /* renamed from: v, reason: collision with root package name */
    public y2.f0 f4761v;

    /* renamed from: w, reason: collision with root package name */
    public long f4762w;

    /* renamed from: b, reason: collision with root package name */
    public final u1.s f4743b = new u1.s(7, new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f4744c = new u1.t(Arrays.copyOf(f4741x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f4755o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f4756p = -1;
    public long s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f4760u = -9223372036854775807L;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4751k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4752l = 256;

    public e(int i6, String str, String str2, boolean z10) {
        this.f4742a = z10;
        this.f4745d = str;
        this.f4746e = i6;
        this.f4747f = str2;
    }

    @Override // f4.i
    public final void a(u1.t tVar) {
        int i6;
        int i10;
        int i11;
        boolean z10;
        int i12;
        this.f4749h.getClass();
        String str = u1.a0.f12750a;
        while (tVar.a() > 0) {
            int i13 = this.j;
            u1.t tVar2 = this.f4744c;
            u1.s sVar = this.f4743b;
            int i14 = 0;
            int i15 = 4;
            boolean z11 = true;
            int i16 = 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                int min = Math.min(tVar.a(), this.f4759t - this.f4751k);
                                this.f4761v.a(min, tVar);
                                int i17 = this.f4751k + min;
                                this.f4751k = i17;
                                if (i17 == this.f4759t) {
                                    if (this.f4760u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    u1.c.g(z11);
                                    this.f4761v.c(this.f4760u, 1, this.f4759t, 0, null);
                                    this.f4760u += this.f4762w;
                                    this.j = 0;
                                    this.f4751k = 0;
                                    this.f4752l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f4753m) {
                                i6 = 7;
                            } else {
                                i6 = 5;
                            }
                            byte[] bArr = sVar.f12804b;
                            int min2 = Math.min(tVar.a(), i6 - this.f4751k);
                            tVar.i(bArr, this.f4751k, min2);
                            int i18 = this.f4751k + min2;
                            this.f4751k = i18;
                            if (i18 == i6) {
                                sVar.q(0);
                                if (!this.f4758r) {
                                    int i19 = sVar.i(2) + 1;
                                    if (i19 != 2) {
                                        u1.a.p("AdtsReader", "Detected audio object type: " + i19 + ", but assuming AAC LC.");
                                        i19 = 2;
                                    }
                                    sVar.t(5);
                                    byte[] b10 = y2.a.b(i19, this.f4756p, sVar.i(3));
                                    jd.s r10 = y2.a.r(new u1.s(2, b10), false);
                                    r1.p pVar = new r1.p();
                                    pVar.f11600a = this.f4748g;
                                    pVar.f11610l = k0.p(this.f4747f);
                                    pVar.f11611m = k0.p("audio/mp4a-latm");
                                    pVar.j = r10.f7407c;
                                    pVar.E = r10.f7406b;
                                    pVar.F = r10.f7405a;
                                    pVar.f11614p = Collections.singletonList(b10);
                                    pVar.f11603d = this.f4745d;
                                    pVar.f11605f = this.f4746e;
                                    r1.q qVar = new r1.q(pVar);
                                    this.s = 1024000000 / qVar.G;
                                    this.f4749h.f(qVar);
                                    this.f4758r = true;
                                } else {
                                    sVar.t(10);
                                }
                                sVar.t(4);
                                int i20 = sVar.i(13);
                                int i21 = i20 - 7;
                                if (this.f4753m) {
                                    i21 = i20 - 9;
                                }
                                y2.f0 f0Var = this.f4749h;
                                long j = this.s;
                                this.j = 4;
                                this.f4751k = 0;
                                this.f4761v = f0Var;
                                this.f4762w = j;
                                this.f4759t = i21;
                            }
                        }
                    } else {
                        byte[] bArr2 = tVar2.f12811a;
                        int min3 = Math.min(tVar.a(), 10 - this.f4751k);
                        tVar.i(bArr2, this.f4751k, min3);
                        int i22 = this.f4751k + min3;
                        this.f4751k = i22;
                        if (i22 == 10) {
                            this.f4750i.a(10, tVar2);
                            tVar2.K(6);
                            y2.f0 f0Var2 = this.f4750i;
                            int x10 = tVar2.x() + 10;
                            this.j = 4;
                            this.f4751k = 10;
                            this.f4761v = f0Var2;
                            this.f4762w = 0L;
                            this.f4759t = x10;
                        }
                    }
                } else if (tVar.a() != 0) {
                    sVar.f12804b[0] = tVar.f12811a[tVar.f12812b];
                    sVar.q(2);
                    int i23 = sVar.i(4);
                    int i24 = this.f4756p;
                    if (i24 != -1 && i23 != i24) {
                        this.f4754n = false;
                        this.j = 0;
                        this.f4751k = 0;
                        this.f4752l = 256;
                    } else {
                        if (!this.f4754n) {
                            this.f4754n = true;
                            this.f4755o = this.f4757q;
                            this.f4756p = i23;
                        }
                        this.j = 3;
                        this.f4751k = 0;
                    }
                }
            } else {
                byte[] bArr3 = tVar.f12811a;
                int i25 = tVar.f12812b;
                int i26 = tVar.f12813c;
                while (true) {
                    if (i25 < i26) {
                        i10 = i25 + 1;
                        i11 = bArr3[i25];
                        int i27 = i11 & 255;
                        if (this.f4752l == 512 && (((65280 | ((((byte) i27) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.f4754n) {
                                int i28 = i25 - 1;
                                tVar.K(i25);
                                byte[] bArr4 = sVar.f12804b;
                                if (tVar.a() >= i16) {
                                    tVar.i(bArr4, i14, i16);
                                    sVar.q(i15);
                                    int i29 = sVar.i(i16);
                                    int i30 = this.f4755o;
                                    if (i30 == -1 || i29 == i30) {
                                        if (this.f4756p != -1) {
                                            byte[] bArr5 = sVar.f12804b;
                                            if (tVar.a() < i16) {
                                                break;
                                            }
                                            tVar.i(bArr5, i14, i16);
                                            sVar.q(2);
                                            i12 = 4;
                                            if (sVar.i(4) == this.f4756p) {
                                                tVar.K(i10);
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr6 = sVar.f12804b;
                                        if (tVar.a() >= i12) {
                                            tVar.i(bArr6, i14, i12);
                                            sVar.q(14);
                                            int i31 = sVar.i(13);
                                            if (i31 >= 7) {
                                                byte[] bArr7 = tVar.f12811a;
                                                int i32 = tVar.f12813c;
                                                int i33 = i28 + i31;
                                                if (i33 >= i32) {
                                                    break;
                                                }
                                                byte b11 = bArr7[i33];
                                                if (b11 == -1) {
                                                    int i34 = i33 + 1;
                                                    if (i34 != i32) {
                                                        int i35 = bArr7[i34];
                                                        if ((((65280 | ((i35 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((i35 & 8) >> 3) == i29) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i36 = i33 + 1;
                                                    if (i36 != i32) {
                                                        if (bArr7[i36] == 68) {
                                                            int i37 = i33 + 2;
                                                            if (i37 != i32) {
                                                                if (bArr7[i37] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i38 = this.f4752l;
                        int i39 = i27 | i38;
                        if (i39 != 329) {
                            if (i39 != 511) {
                                if (i39 != 836) {
                                    if (i39 != 1075) {
                                        if (i38 != 256) {
                                            this.f4752l = 256;
                                            i14 = 0;
                                            i15 = 4;
                                            i16 = 1;
                                        }
                                    } else {
                                        this.j = 2;
                                        this.f4751k = 3;
                                        this.f4759t = 0;
                                        tVar2.K(0);
                                        tVar.K(i10);
                                        break;
                                    }
                                } else {
                                    this.f4752l = 1024;
                                }
                            } else {
                                this.f4752l = 512;
                            }
                        } else {
                            this.f4752l = 768;
                        }
                        i25 = i10;
                        i14 = 0;
                        i15 = 4;
                        i16 = 1;
                    } else {
                        tVar.K(i25);
                        break;
                    }
                }
                this.f4757q = (i11 & 8) >> 3;
                if ((i11 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4753m = z10;
                if (!this.f4754n) {
                    this.j = 1;
                    this.f4751k = 0;
                } else {
                    this.j = 3;
                    this.f4751k = 0;
                }
                tVar.K(i10);
            }
        }
    }

    @Override // f4.i
    public final void c() {
        this.f4760u = -9223372036854775807L;
        this.f4754n = false;
        this.j = 0;
        this.f4751k = 0;
        this.f4752l = 256;
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        this.f4760u = j;
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4748g = h0Var.f4815e;
        h0Var.b();
        y2.f0 A = qVar.A(h0Var.f4814d, 1);
        this.f4749h = A;
        this.f4761v = A;
        if (this.f4742a) {
            h0Var.a();
            h0Var.b();
            y2.f0 A2 = qVar.A(h0Var.f4814d, 5);
            this.f4750i = A2;
            r1.p pVar = new r1.p();
            h0Var.b();
            pVar.f11600a = h0Var.f4815e;
            pVar.f11610l = k0.p(this.f4747f);
            pVar.f11611m = k0.p("application/id3");
            r4.a.v(pVar, A2);
            return;
        }
        this.f4750i = new y2.n();
    }

    @Override // f4.i
    public final void d(boolean z10) {
    }
}
