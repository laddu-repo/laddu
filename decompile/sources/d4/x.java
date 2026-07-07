package d4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f4312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.f f4313b = new u3.f(10, new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4314c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w1.y f4316e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4318h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4321l;

    public x(i iVar) {
        this.f4312a = iVar;
    }

    @Override // d4.h0
    public final void a() {
        this.f4314c = 0;
        this.f4315d = 0;
        this.f4318h = false;
        this.f4312a.a();
    }

    @Override // d4.h0
    public final void b(int i, w1.t tVar) {
        w1.a.k(this.f4316e);
        int i10 = i & 1;
        int i11 = -1;
        int i12 = 2;
        i iVar = this.f4312a;
        if (i10 != 0) {
            int i13 = this.f4314c;
            if (i13 != 0 && i13 != 1) {
                if (i13 == 2) {
                    w1.a.C("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f4319j != -1) {
                        w1.a.C("PesReader", "Unexpected start indicator: expected " + this.f4319j + " more bytes");
                    }
                    iVar.c(tVar.f13740c == 0);
                }
            }
            this.f4314c = 1;
            this.f4315d = 0;
        }
        int i14 = i;
        while (tVar.a() > 0) {
            int i15 = this.f4314c;
            if (i15 != 0) {
                u3.f fVar = this.f4313b;
                if (i15 != 1) {
                    if (i15 == i12) {
                        if (d(tVar, fVar.f12868b, Math.min(10, this.i)) && d(tVar, null, this.i)) {
                            fVar.q(0);
                            this.f4321l = -9223372036854775807L;
                            if (this.f) {
                                fVar.t(4);
                                long jI = ((long) fVar.i(3)) << 30;
                                fVar.t(1);
                                long jI2 = ((long) (fVar.i(15) << 15)) | jI;
                                fVar.t(1);
                                long jI3 = jI2 | ((long) fVar.i(15));
                                fVar.t(1);
                                if (!this.f4318h && this.f4317g) {
                                    fVar.t(4);
                                    long jI4 = ((long) fVar.i(3)) << 30;
                                    fVar.t(1);
                                    long jI5 = jI4 | ((long) (fVar.i(15) << 15));
                                    fVar.t(1);
                                    long jI6 = jI5 | ((long) fVar.i(15));
                                    fVar.t(1);
                                    this.f4316e.b(jI6);
                                    this.f4318h = true;
                                }
                                this.f4321l = this.f4316e.b(jI3);
                            }
                            i14 |= this.f4320k ? 4 : 0;
                            iVar.d(i14, this.f4321l);
                            this.f4314c = 3;
                            this.f4315d = 0;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = tVar.a();
                        int i16 = this.f4319j;
                        int i17 = i16 == i11 ? 0 : iA - i16;
                        if (i17 > 0) {
                            iA -= i17;
                            tVar.I(tVar.f13739b + iA);
                        }
                        iVar.b(tVar);
                        int i18 = this.f4319j;
                        if (i18 != i11) {
                            int i19 = i18 - iA;
                            this.f4319j = i19;
                            if (i19 == 0) {
                                iVar.c(false);
                                this.f4314c = 1;
                                this.f4315d = 0;
                            }
                        }
                    }
                } else if (d(tVar, fVar.f12868b, 9)) {
                    this.f4314c = e() ? 2 : 0;
                    this.f4315d = 0;
                }
            } else {
                tVar.K(tVar.a());
            }
            i11 = -1;
            i12 = 2;
        }
    }

    @Override // d4.h0
    public final void c(w1.y yVar, w2.q qVar, g0 g0Var) {
        this.f4316e = yVar;
        this.f4312a.e(qVar, g0Var);
    }

    public final boolean d(w1.t tVar, byte[] bArr, int i) {
        int iMin = Math.min(tVar.a(), i - this.f4315d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.K(iMin);
        } else {
            tVar.h(bArr, this.f4315d, iMin);
        }
        int i10 = this.f4315d + iMin;
        this.f4315d = i10;
        return i10 == i;
    }

    public final boolean e() {
        u3.f fVar = this.f4313b;
        fVar.q(0);
        int i = fVar.i(24);
        if (i != 1) {
            u5.a.d(i, "Unexpected start code prefix: ", "PesReader");
            this.f4319j = -1;
            return false;
        }
        fVar.t(8);
        int i10 = fVar.i(16);
        fVar.t(5);
        this.f4320k = fVar.h();
        fVar.t(2);
        this.f = fVar.h();
        this.f4317g = fVar.h();
        fVar.t(6);
        int i11 = fVar.i(8);
        this.i = i11;
        if (i10 == 0) {
            this.f4319j = -1;
        } else {
            int i12 = (i10 - 3) - i11;
            this.f4319j = i12;
            if (i12 < 0) {
                w1.a.C("PesReader", "Found negative packet payload size: " + this.f4319j);
                this.f4319j = -1;
            }
        }
        return true;
    }
}
