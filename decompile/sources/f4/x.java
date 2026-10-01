package f4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f4989a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.s f4990b = new u1.s(10, new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f4991c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4992d;

    /* renamed from: e, reason: collision with root package name */
    public u1.y f4993e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4994f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4995g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4996h;

    /* renamed from: i, reason: collision with root package name */
    public int f4997i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4998k;

    /* renamed from: l, reason: collision with root package name */
    public long f4999l;

    public x(i iVar) {
        this.f4989a = iVar;
    }

    @Override // f4.i0
    public final void a(int i6, u1.t tVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        u1.c.h(this.f4993e);
        int i13 = i6 & 1;
        int i14 = -1;
        int i15 = 2;
        i iVar = this.f4989a;
        if (i13 != 0) {
            int i16 = this.f4991c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        if (this.j != -1) {
                            u1.a.p("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        if (tVar.f12813c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.d(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    u1.a.p("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f4991c = 1;
            this.f4992d = 0;
        }
        int i17 = i6;
        while (tVar.a() > 0) {
            int i18 = this.f4991c;
            if (i18 != 0) {
                u1.s sVar = this.f4990b;
                if (i18 != 1) {
                    if (i18 != i15) {
                        if (i18 == 3) {
                            int a10 = tVar.a();
                            int i19 = this.j;
                            if (i19 == i14) {
                                i12 = 0;
                            } else {
                                i12 = a10 - i19;
                            }
                            if (i12 > 0) {
                                a10 -= i12;
                                tVar.J(tVar.f12812b + a10);
                            }
                            iVar.a(tVar);
                            int i20 = this.j;
                            if (i20 != i14) {
                                int i21 = i20 - a10;
                                this.j = i21;
                                if (i21 == 0) {
                                    iVar.d(false);
                                    this.f4991c = 1;
                                    this.f4992d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(tVar, sVar.f12804b, Math.min(10, this.f4997i)) && d(tVar, null, this.f4997i)) {
                            sVar.q(0);
                            this.f4999l = -9223372036854775807L;
                            if (this.f4994f) {
                                sVar.t(4);
                                sVar.t(1);
                                sVar.t(1);
                                long i22 = (sVar.i(15) << 15) | (sVar.i(3) << 30) | sVar.i(15);
                                sVar.t(1);
                                if (!this.f4996h && this.f4995g) {
                                    sVar.t(4);
                                    sVar.t(1);
                                    sVar.t(1);
                                    sVar.t(1);
                                    this.f4993e.b((sVar.i(3) << 30) | (sVar.i(15) << 15) | sVar.i(15));
                                    this.f4996h = true;
                                }
                                this.f4999l = this.f4993e.b(i22);
                            }
                            if (this.f4998k) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            i17 |= i11;
                            iVar.e(i17, this.f4999l);
                            this.f4991c = 3;
                            this.f4992d = 0;
                        }
                    }
                } else if (d(tVar, sVar.f12804b, 9)) {
                    if (e()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    this.f4991c = i10;
                    this.f4992d = 0;
                }
            } else {
                tVar.L(tVar.a());
            }
            i14 = -1;
            i15 = 2;
        }
    }

    @Override // f4.i0
    public final void b(u1.y yVar, y2.q qVar, h0 h0Var) {
        this.f4993e = yVar;
        this.f4989a.f(qVar, h0Var);
    }

    @Override // f4.i0
    public final void c() {
        this.f4991c = 0;
        this.f4992d = 0;
        this.f4996h = false;
        this.f4989a.c();
    }

    public final boolean d(u1.t tVar, byte[] bArr, int i6) {
        int min = Math.min(tVar.a(), i6 - this.f4992d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.L(min);
        } else {
            tVar.i(bArr, this.f4992d, min);
        }
        int i10 = this.f4992d + min;
        this.f4992d = i10;
        if (i10 == i6) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        u1.s sVar = this.f4990b;
        sVar.q(0);
        int i6 = sVar.i(24);
        if (i6 != 1) {
            h8.c.p(i6, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        sVar.t(8);
        int i10 = sVar.i(16);
        sVar.t(5);
        this.f4998k = sVar.h();
        sVar.t(2);
        this.f4994f = sVar.h();
        this.f4995g = sVar.h();
        sVar.t(6);
        int i11 = sVar.i(8);
        this.f4997i = i11;
        if (i10 == 0) {
            this.j = -1;
        } else {
            int i12 = (i10 - 3) - i11;
            this.j = i12;
            if (i12 < 0) {
                u1.a.p("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }
}
