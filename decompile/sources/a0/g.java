package a0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends i {
    public int A0;
    public b0.b B0;
    public d0.f C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f96a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f97b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f98s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f99t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f100u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f101v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f102w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f103x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f104y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f105z0;

    @Override // a0.i
    public final void S() {
        for (int i6 = 0; i6 < this.f113r0; i6++) {
            d dVar = this.f112q0[i6];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i6) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f59p0;
            if (iArr[1] == 3) {
                int i10 = dVar.s;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (dVar.f68z * i6);
                        if (i11 != dVar.k()) {
                            dVar.f42g = true;
                            V(iArr[0], dVar.q(), 1, i11, dVar);
                        }
                        return i11;
                    }
                    dVar2 = dVar;
                    if (i10 == 1) {
                        return dVar2.k();
                    }
                    if (i10 == 3) {
                        return (int) ((dVar2.q() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i6) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f59p0;
            if (iArr[0] == 3) {
                int i10 = dVar.f61r;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (dVar.f65w * i6);
                        if (i11 != dVar.q()) {
                            dVar.f42g = true;
                            V(1, i11, iArr[1], dVar.k(), dVar);
                        }
                        return i11;
                    }
                    dVar2 = dVar;
                    if (i10 == 1) {
                        return dVar2.q();
                    }
                    if (i10 == 3) {
                        return (int) ((dVar2.k() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i6, int i10, int i11, int i12, d dVar) {
        d0.f fVar;
        d dVar2;
        b0.b bVar = this.B0;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f73u0;
            }
        }
        bVar.f1216a = i6;
        bVar.f1217b = i11;
        bVar.f1218c = i10;
        bVar.f1219d = i12;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f1220e);
        dVar.L(bVar.f1221f);
        dVar.E = bVar.f1223h;
        dVar.I(bVar.f1222g);
    }

    @Override // a0.d
    public final void b(y.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        d dVar;
        float f3;
        int i6;
        boolean z13;
        ArrayList arrayList = this.W0;
        super.b(cVar, z10);
        d dVar2 = this.T;
        if (dVar2 != null && ((e) dVar2).f74v0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = this.T0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            f fVar = (f) arrayList.get(i11);
                            if (i11 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            fVar.b(i11, z11, z13);
                        }
                    }
                } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                    for (int i12 = 0; i12 < this.f97b1; i12++) {
                        this.f96a1[i12].D();
                    }
                    int[] iArr = this.Z0;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    float f10 = this.J0;
                    d dVar3 = null;
                    int i15 = 0;
                    while (i15 < i13) {
                        if (z11) {
                            i6 = (i13 - i15) - 1;
                            f3 = 1.0f - this.J0;
                        } else {
                            f3 = f10;
                            i6 = i15;
                        }
                        d dVar4 = this.Y0[i6];
                        if (dVar4 != null) {
                            c cVar2 = dVar4.I;
                            if (dVar4.f43g0 != 8) {
                                if (i15 == 0) {
                                    dVar4.f(cVar2, this.I, this.f102w0);
                                    dVar4.f47i0 = this.D0;
                                    dVar4.f37d0 = f3;
                                }
                                if (i15 == i13 - 1) {
                                    dVar4.f(dVar4.K, this.K, this.f103x0);
                                }
                                if (i15 > 0 && dVar3 != null) {
                                    c cVar3 = dVar3.K;
                                    dVar4.f(cVar2, cVar3, this.P0);
                                    dVar3.f(cVar3, cVar2, 0);
                                }
                                dVar3 = dVar4;
                            }
                        }
                        i15++;
                        f10 = f3;
                    }
                    for (int i16 = 0; i16 < i14; i16++) {
                        d dVar5 = this.X0[i16];
                        if (dVar5 != null) {
                            c cVar4 = dVar5.J;
                            if (dVar5.f43g0 != 8) {
                                if (i16 == 0) {
                                    dVar5.f(cVar4, this.J, this.f98s0);
                                    dVar5.f48j0 = this.E0;
                                    dVar5.f39e0 = this.K0;
                                }
                                if (i16 == i14 - 1) {
                                    dVar5.f(dVar5.L, this.L, this.f99t0);
                                }
                                if (i16 > 0 && dVar3 != null) {
                                    c cVar5 = dVar3.L;
                                    dVar5.f(cVar4, cVar5, this.Q0);
                                    dVar3.f(cVar5, cVar4, 0);
                                }
                                dVar3 = dVar5;
                            }
                        }
                    }
                    for (int i17 = 0; i17 < i13; i17++) {
                        for (int i18 = 0; i18 < i14; i18++) {
                            int i19 = (i18 * i13) + i17;
                            if (this.V0 == 1) {
                                i19 = (i17 * i14) + i18;
                            }
                            d[] dVarArr = this.f96a1;
                            if (i19 < dVarArr.length && (dVar = dVarArr[i19]) != null && dVar.f43g0 != 8) {
                                d dVar6 = this.Y0[i17];
                                d dVar7 = this.X0[i18];
                                if (dVar != dVar6) {
                                    dVar.f(dVar.I, dVar6.I, 0);
                                    dVar.f(dVar.K, dVar6.K, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.f(dVar.J, dVar7.J, 0);
                                    dVar.f(dVar.L, dVar7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i20 = 0; i20 < size2; i20++) {
                    f fVar2 = (f) arrayList.get(i20);
                    if (i20 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    fVar2.b(i20, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z11, true);
        }
        this.f104y0 = false;
    }
}
