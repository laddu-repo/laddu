package a0;

import w8.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f1s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f2t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4v0;

    @Override // a0.d
    public final boolean A() {
        return this.f4v0;
    }

    @Override // a0.d
    public final boolean B() {
        return this.f4v0;
    }

    public final boolean T() {
        int i6;
        int i10;
        int i11;
        int i12 = 0;
        boolean z10 = true;
        while (true) {
            i6 = this.f113r0;
            if (i12 >= i6) {
                break;
            }
            d dVar = this.f112q0[i12];
            if ((this.f2t0 || dVar.c()) && ((((i10 = this.f1s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f1s0) == 2 || i11 == 3) && !dVar.B()))) {
                z10 = false;
            }
            i12++;
        }
        if (!z10 || i6 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f113r0; i14++) {
            d dVar2 = this.f112q0[i14];
            if (this.f2t0 || dVar2.c()) {
                if (!z11) {
                    int i15 = this.f1s0;
                    if (i15 == 0) {
                        i13 = dVar2.i(2).d();
                    } else if (i15 == 1) {
                        i13 = dVar2.i(4).d();
                    } else if (i15 == 2) {
                        i13 = dVar2.i(3).d();
                    } else if (i15 == 3) {
                        i13 = dVar2.i(5).d();
                    }
                    z11 = true;
                }
                int i16 = this.f1s0;
                if (i16 == 0) {
                    i13 = Math.min(i13, dVar2.i(2).d());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, dVar2.i(4).d());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, dVar2.i(3).d());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, dVar2.i(5).d());
                }
            }
        }
        int i17 = i13 + this.f3u0;
        int i18 = this.f1s0;
        if (i18 != 0 && i18 != 1) {
            K(i17, i17);
        } else {
            J(i17, i17);
        }
        this.f4v0 = true;
        return true;
    }

    public final int U() {
        int i6 = this.f1s0;
        if (i6 != 0 && i6 != 1) {
            if (i6 == 2 || i6 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // a0.d
    public final void b(y.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        int i10;
        int i11;
        int i12;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i13 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f29i = cVar.k(cVar6);
        }
        int i14 = this.f1s0;
        if (i14 >= 0 && i14 < 4) {
            c cVar7 = cVarArr[i14];
            if (!this.f4v0) {
                T();
            }
            if (this.f4v0) {
                this.f4v0 = false;
                int i15 = this.f1s0;
                if (i15 != 0 && i15 != 1) {
                    if (i15 == 2 || i15 == 3) {
                        cVar.d(cVar3.f29i, this.Z);
                        cVar.d(cVar5.f29i, this.Z);
                        return;
                    }
                    return;
                }
                cVar.d(cVar2.f29i, this.Y);
                cVar.d(cVar4.f29i, this.Y);
                return;
            }
            for (int i16 = 0; i16 < this.f113r0; i16++) {
                d dVar = this.f112q0[i16];
                if ((this.f2t0 || dVar.c()) && ((((i12 = this.f1s0) == 0 || i12 == 1) && dVar.f59p0[0] == 3 && dVar.I.f26f != null && dVar.K.f26f != null) || ((i12 == 2 || i12 == 3) && dVar.f59p0[1] == 3 && dVar.J.f26f != null && dVar.L.f26f != null))) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!cVar2.g() && !cVar4.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!cVar3.g() && !cVar5.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i11 = this.f1s0) == 0 && z12) || ((i11 == 2 && z13) || ((i11 == 1 && z12) || (i11 == 3 && z13))))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i6 = 4;
            } else {
                i6 = 5;
            }
            int i17 = 0;
            while (i17 < this.f113r0) {
                d dVar2 = this.f112q0[i17];
                if (this.f2t0 || dVar2.c()) {
                    y.f k8 = cVar.k(dVar2.Q[this.f1s0]);
                    c[] cVarArr2 = dVar2.Q;
                    int i18 = this.f1s0;
                    c cVar8 = cVarArr2[i18];
                    cVar8.f29i = k8;
                    c cVar9 = cVar8.f26f;
                    if (cVar9 != null && cVar9.f24d == this) {
                        i10 = cVar8.f27g;
                    } else {
                        i10 = 0;
                    }
                    if (i18 != 0 && i18 != i13) {
                        y.f fVar = cVar7.f29i;
                        int i19 = this.f3u0 + i10;
                        y.b l10 = cVar.l();
                        y.f m9 = cVar.m();
                        m9.A = 0;
                        l10.b(fVar, k8, m9, i19);
                        cVar.c(l10);
                    } else {
                        y.f fVar2 = cVar7.f29i;
                        int i20 = this.f3u0 - i10;
                        y.b l11 = cVar.l();
                        y.f m10 = cVar.m();
                        m10.A = 0;
                        l11.c(fVar2, k8, m10, i20);
                        cVar.c(l11);
                    }
                    cVar.e(cVar7.f29i, k8, this.f3u0 + i10, i6);
                }
                i17++;
                i13 = 2;
            }
            int i21 = this.f1s0;
            if (i21 == 0) {
                cVar.e(cVar4.f29i, cVar2.f29i, 0, 8);
                cVar.e(cVar2.f29i, this.T.K.f29i, 0, 4);
                cVar.e(cVar2.f29i, this.T.I.f29i, 0, 0);
                return;
            }
            if (i21 == 1) {
                cVar.e(cVar2.f29i, cVar4.f29i, 0, 8);
                cVar.e(cVar2.f29i, this.T.I.f29i, 0, 4);
                cVar.e(cVar2.f29i, this.T.K.f29i, 0, 0);
            } else if (i21 == 2) {
                cVar.e(cVar5.f29i, cVar3.f29i, 0, 8);
                cVar.e(cVar3.f29i, this.T.L.f29i, 0, 4);
                cVar.e(cVar3.f29i, this.T.J.f29i, 0, 0);
            } else if (i21 == 3) {
                cVar.e(cVar3.f29i, cVar5.f29i, 0, 8);
                cVar.e(cVar3.f29i, this.T.J.f29i, 0, 4);
                cVar.e(cVar3.f29i, this.T.L.f29i, 0, 0);
            }
        }
    }

    @Override // a0.d
    public final boolean c() {
        return true;
    }

    @Override // a0.d
    public final String toString() {
        String o10 = r4.a.o(new StringBuilder("[Barrier] "), this.f45h0, " {");
        for (int i6 = 0; i6 < this.f113r0; i6++) {
            d dVar = this.f112q0[i6];
            if (i6 > 0) {
                o10 = k.c(o10, ", ");
            }
            StringBuilder b10 = y.e.b(o10);
            b10.append(dVar.f45h0);
            o10 = b10.toString();
        }
        return k.c(o10, "}");
    }
}
