package f4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f4722a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.t f4723b = new u1.t(32);

    /* renamed from: c, reason: collision with root package name */
    public int f4724c;

    /* renamed from: d, reason: collision with root package name */
    public int f4725d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4726e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4727f;

    public c0(b0 b0Var) {
        this.f4722a = b0Var;
    }

    @Override // f4.i0
    public final void a(int i6, u1.t tVar) {
        boolean z10;
        int i10;
        boolean z11;
        if ((i6 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = tVar.f12812b + tVar.y();
        } else {
            i10 = -1;
        }
        if (this.f4727f) {
            if (z10) {
                this.f4727f = false;
                tVar.K(i10);
                this.f4725d = 0;
            } else {
                return;
            }
        }
        while (tVar.a() > 0) {
            int i11 = this.f4725d;
            u1.t tVar2 = this.f4723b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int y9 = tVar.y();
                    tVar.K(tVar.f12812b - 1);
                    if (y9 == 255) {
                        this.f4727f = true;
                        return;
                    }
                }
                int min = Math.min(tVar.a(), 3 - this.f4725d);
                tVar.i(tVar2.f12811a, this.f4725d, min);
                int i12 = this.f4725d + min;
                this.f4725d = i12;
                if (i12 == 3) {
                    tVar2.K(0);
                    tVar2.J(3);
                    tVar2.L(1);
                    int y10 = tVar2.y();
                    int y11 = tVar2.y();
                    if ((y10 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f4726e = z11;
                    int i13 = (((y10 & 15) << 8) | y11) + 3;
                    this.f4724c = i13;
                    byte[] bArr = tVar2.f12811a;
                    if (bArr.length < i13) {
                        tVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(tVar.a(), this.f4724c - this.f4725d);
                tVar.i(tVar2.f12811a, this.f4725d, min2);
                int i14 = this.f4725d + min2;
                this.f4725d = i14;
                int i15 = this.f4724c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f4726e) {
                        if (u1.a0.m(0, tVar2.f12811a, i15, -1) != 0) {
                            this.f4727f = true;
                            return;
                        }
                        tVar2.J(this.f4724c - 4);
                    } else {
                        tVar2.J(i15);
                    }
                    tVar2.K(0);
                    this.f4722a.a(tVar2);
                    this.f4725d = 0;
                }
            }
        }
    }

    @Override // f4.i0
    public final void b(u1.y yVar, y2.q qVar, h0 h0Var) {
        this.f4722a.b(yVar, qVar, h0Var);
        this.f4727f = true;
    }

    @Override // f4.i0
    public final void c() {
        this.f4727f = true;
    }
}
