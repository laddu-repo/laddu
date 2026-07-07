package a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f79a;

    /* renamed from: d, reason: collision with root package name */
    public c f82d;

    /* renamed from: e, reason: collision with root package name */
    public c f83e;

    /* renamed from: f, reason: collision with root package name */
    public c f84f;

    /* renamed from: g, reason: collision with root package name */
    public c f85g;

    /* renamed from: h, reason: collision with root package name */
    public int f86h;

    /* renamed from: i, reason: collision with root package name */
    public int f87i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f88k;

    /* renamed from: q, reason: collision with root package name */
    public int f94q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f95r;

    /* renamed from: b, reason: collision with root package name */
    public d f80b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f81c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f89l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f90m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f91n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f92o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f93p = 0;

    public f(g gVar, int i6, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f95r = gVar;
        this.f79a = i6;
        this.f82d = cVar;
        this.f83e = cVar2;
        this.f84f = cVar3;
        this.f85g = cVar4;
        this.f86h = gVar.f102w0;
        this.f87i = gVar.f98s0;
        this.j = gVar.f103x0;
        this.f88k = gVar.f99t0;
        this.f94q = i10;
    }

    public final void a(d dVar) {
        int i6 = this.f79a;
        int i10 = 0;
        g gVar = this.f95r;
        if (i6 == 0) {
            int U = gVar.U(dVar, this.f94q);
            if (dVar.f59p0[0] == 3) {
                this.f93p++;
                U = 0;
            }
            int i11 = gVar.P0;
            if (dVar.f43g0 != 8) {
                i10 = i11;
            }
            this.f89l = U + i10 + this.f89l;
            int T = gVar.T(dVar, this.f94q);
            if (this.f80b == null || this.f81c < T) {
                this.f80b = dVar;
                this.f81c = T;
                this.f90m = T;
            }
        } else {
            int U2 = gVar.U(dVar, this.f94q);
            int T2 = gVar.T(dVar, this.f94q);
            if (dVar.f59p0[1] == 3) {
                this.f93p++;
                T2 = 0;
            }
            int i12 = gVar.Q0;
            if (dVar.f43g0 != 8) {
                i10 = i12;
            }
            this.f90m = T2 + i10 + this.f90m;
            if (this.f80b == null || this.f81c < U2) {
                this.f80b = dVar;
                this.f81c = U2;
                this.f89l = U2;
            }
        }
        this.f92o++;
    }

    public final void b(int i6, boolean z10, boolean z11) {
        g gVar;
        boolean z12;
        int i10;
        int i11;
        int i12;
        d dVar;
        int i13;
        boolean z13;
        int i14;
        int i15;
        float f3;
        float f10;
        float f11;
        int i16;
        float f12;
        float f13;
        int i17;
        int i18;
        int i19;
        int i20 = this.f92o;
        int i21 = 0;
        while (true) {
            gVar = this.f95r;
            if (i21 >= i20 || (i19 = this.f91n + i21) >= gVar.f97b1) {
                break;
            }
            d dVar2 = gVar.f96a1[i19];
            if (dVar2 != null) {
                dVar2.D();
            }
            i21++;
        }
        if (i20 != 0 && this.f80b != null) {
            if (z11 && i6 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i22 = -1;
            int i23 = -1;
            for (int i24 = 0; i24 < i20; i24++) {
                if (z10) {
                    i18 = (i20 - 1) - i24;
                } else {
                    i18 = i24;
                }
                int i25 = this.f91n + i18;
                if (i25 >= gVar.f97b1) {
                    break;
                }
                d dVar3 = gVar.f96a1[i25];
                if (dVar3 != null && dVar3.f43g0 == 0) {
                    if (i22 == -1) {
                        i22 = i24;
                    }
                    i23 = i24;
                }
            }
            if (this.f79a == 0) {
                d dVar4 = this.f80b;
                dVar4.f48j0 = gVar.E0;
                c cVar = dVar4.L;
                c cVar2 = dVar4.J;
                int i26 = this.f87i;
                if (i6 > 0) {
                    i26 += gVar.Q0;
                }
                cVar2.a(this.f83e, i26);
                if (z11) {
                    cVar.a(this.f85g, this.f88k);
                }
                if (i6 > 0) {
                    this.f83e.f24d.L.a(cVar2, 0);
                }
                if (gVar.S0 == 3 && !dVar4.E) {
                    for (int i27 = 0; i27 < i20; i27++) {
                        if (z10) {
                            i17 = (i20 - 1) - i27;
                        } else {
                            i17 = i27;
                        }
                        int i28 = this.f91n + i17;
                        if (i28 >= gVar.f97b1) {
                            break;
                        }
                        dVar = gVar.f96a1[i28];
                        if (dVar.E) {
                            break;
                        }
                    }
                }
                dVar = dVar4;
                d dVar5 = null;
                int i29 = 0;
                while (i29 < i20) {
                    if (z10) {
                        i13 = (i20 - 1) - i29;
                    } else {
                        i13 = i29;
                    }
                    int i30 = this.f91n + i13;
                    if (i30 < gVar.f97b1) {
                        d dVar6 = gVar.f96a1[i30];
                        if (dVar6 == null) {
                            i15 = i20;
                            z13 = z12;
                            i14 = i23;
                        } else {
                            c cVar3 = dVar6.L;
                            c cVar4 = dVar6.J;
                            c cVar5 = dVar6.I;
                            z13 = z12;
                            if (i29 == 0) {
                                i14 = i23;
                                dVar6.f(cVar5, this.f82d, this.f86h);
                            } else {
                                i14 = i23;
                            }
                            if (i13 == 0) {
                                int i31 = gVar.D0;
                                if (z10) {
                                    f3 = 1.0f;
                                    f10 = 1.0f - gVar.J0;
                                } else {
                                    f3 = 1.0f;
                                    f10 = gVar.J0;
                                }
                                if (this.f91n == 0) {
                                    i16 = gVar.F0;
                                    f11 = f10;
                                    if (i16 != -1) {
                                        if (z10) {
                                            f13 = gVar.L0;
                                            f12 = f3 - f13;
                                            dVar6.f47i0 = i16;
                                            dVar6.f37d0 = f12;
                                        } else {
                                            f12 = gVar.L0;
                                            dVar6.f47i0 = i16;
                                            dVar6.f37d0 = f12;
                                        }
                                    }
                                } else {
                                    f11 = f10;
                                }
                                if (z11 && (i16 = gVar.H0) != -1) {
                                    if (z10) {
                                        f13 = gVar.N0;
                                        f12 = f3 - f13;
                                    } else {
                                        f12 = gVar.N0;
                                    }
                                } else {
                                    i16 = i31;
                                    f12 = f11;
                                }
                                dVar6.f47i0 = i16;
                                dVar6.f37d0 = f12;
                            }
                            if (i29 == i20 - 1) {
                                i15 = i20;
                                dVar6.f(dVar6.K, this.f84f, this.j);
                            } else {
                                i15 = i20;
                            }
                            if (dVar5 != null) {
                                c cVar6 = dVar5.K;
                                cVar5.a(cVar6, gVar.P0);
                                if (i29 == i22) {
                                    int i32 = this.f86h;
                                    if (cVar5.h()) {
                                        cVar5.f28h = i32;
                                    }
                                }
                                cVar6.a(cVar5, 0);
                                if (i29 == i14 + 1) {
                                    int i33 = this.j;
                                    if (cVar6.h()) {
                                        cVar6.f28h = i33;
                                    }
                                }
                            }
                            if (dVar6 != dVar4) {
                                int i34 = gVar.S0;
                                if (i34 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                                    dVar6.M.a(dVar.M, 0);
                                } else if (i34 != 0) {
                                    if (i34 != 1) {
                                        if (z13) {
                                            cVar4.a(this.f83e, this.f87i);
                                            cVar3.a(this.f85g, this.f88k);
                                        } else {
                                            cVar4.a(cVar2, 0);
                                            cVar3.a(cVar, 0);
                                        }
                                    } else {
                                        cVar3.a(cVar, 0);
                                    }
                                } else {
                                    cVar4.a(cVar2, 0);
                                }
                            }
                            dVar5 = dVar6;
                        }
                        i29++;
                        z12 = z13;
                        i23 = i14;
                        i20 = i15;
                    } else {
                        return;
                    }
                }
                return;
            }
            int i35 = i20;
            boolean z14 = z12;
            int i36 = i23;
            d dVar7 = this.f80b;
            dVar7.f47i0 = gVar.D0;
            c cVar7 = dVar7.I;
            c cVar8 = dVar7.K;
            int i37 = this.f86h;
            if (i6 > 0) {
                i37 += gVar.P0;
            }
            if (z10) {
                cVar8.a(this.f84f, i37);
                if (z11) {
                    cVar7.a(this.f82d, this.j);
                }
                if (i6 > 0) {
                    this.f84f.f24d.I.a(cVar8, 0);
                }
            } else {
                cVar7.a(this.f82d, i37);
                if (z11) {
                    cVar8.a(this.f84f, this.j);
                }
                if (i6 > 0) {
                    this.f82d.f24d.K.a(cVar7, 0);
                }
            }
            int i38 = 0;
            d dVar8 = null;
            while (true) {
                int i39 = i35;
                if (i38 < i39 && (i10 = this.f91n + i38) < gVar.f97b1) {
                    d dVar9 = gVar.f96a1[i10];
                    if (dVar9 == null) {
                        i35 = i39;
                    } else {
                        c cVar9 = dVar9.J;
                        c cVar10 = dVar9.K;
                        c cVar11 = dVar9.I;
                        if (i38 == 0) {
                            dVar9.f(cVar9, this.f83e, this.f87i);
                            int i40 = gVar.E0;
                            float f14 = gVar.K0;
                            if (this.f91n == 0) {
                                i12 = gVar.G0;
                                i35 = i39;
                                i11 = -1;
                                if (i12 != -1) {
                                    f14 = gVar.M0;
                                    i40 = i12;
                                    dVar9.f48j0 = i40;
                                    dVar9.f39e0 = f14;
                                }
                            } else {
                                i35 = i39;
                                i11 = -1;
                            }
                            if (z11 && (i12 = gVar.I0) != i11) {
                                f14 = gVar.O0;
                                i40 = i12;
                            }
                            dVar9.f48j0 = i40;
                            dVar9.f39e0 = f14;
                        } else {
                            i35 = i39;
                        }
                        if (i38 == i35 - 1) {
                            dVar9.f(dVar9.L, this.f85g, this.f88k);
                        }
                        if (dVar8 != null) {
                            c cVar12 = dVar8.L;
                            cVar9.a(cVar12, gVar.Q0);
                            if (i38 == i22) {
                                int i41 = this.f87i;
                                if (cVar9.h()) {
                                    cVar9.f28h = i41;
                                }
                            }
                            cVar12.a(cVar9, 0);
                            if (i38 == i36 + 1) {
                                int i42 = this.f88k;
                                if (cVar12.h()) {
                                    cVar12.f28h = i42;
                                }
                            }
                        }
                        if (dVar9 != dVar7) {
                            if (z10) {
                                int i43 = gVar.R0;
                                if (i43 != 0) {
                                    if (i43 != 1) {
                                        if (i43 == 2) {
                                            cVar11.a(cVar7, 0);
                                            cVar10.a(cVar8, 0);
                                        }
                                    } else {
                                        cVar11.a(cVar7, 0);
                                    }
                                } else {
                                    cVar10.a(cVar8, 0);
                                }
                            } else {
                                int i44 = gVar.R0;
                                if (i44 != 0) {
                                    if (i44 != 1) {
                                        if (i44 == 2) {
                                            if (z14) {
                                                cVar11.a(this.f82d, this.f86h);
                                                cVar10.a(this.f84f, this.j);
                                            } else {
                                                cVar11.a(cVar7, 0);
                                                cVar10.a(cVar8, 0);
                                            }
                                        }
                                    } else {
                                        cVar10.a(cVar8, 0);
                                    }
                                } else {
                                    cVar11.a(cVar7, 0);
                                }
                                dVar8 = dVar9;
                            }
                        }
                        dVar8 = dVar9;
                    }
                    i38++;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f79a == 1) {
            return this.f90m - this.f95r.Q0;
        }
        return this.f90m;
    }

    public final int d() {
        if (this.f79a == 0) {
            return this.f89l - this.f95r.P0;
        }
        return this.f89l;
    }

    public final void e(int i6) {
        g gVar;
        int i10;
        int i11 = this.f93p;
        if (i11 != 0) {
            int i12 = this.f92o;
            int i13 = i6 / i11;
            int i14 = 0;
            while (true) {
                gVar = this.f95r;
                if (i14 >= i12 || (i10 = this.f91n + i14) >= gVar.f97b1) {
                    break;
                }
                d dVar = gVar.f96a1[i10];
                if (this.f79a == 0) {
                    if (dVar != null) {
                        int[] iArr = dVar.f59p0;
                        if (iArr[0] == 3 && dVar.f61r == 0) {
                            gVar.V(1, i13, iArr[1], dVar.k(), dVar);
                        }
                    }
                } else if (dVar != null) {
                    int[] iArr2 = dVar.f59p0;
                    if (iArr2[1] == 3 && dVar.s == 0) {
                        int i15 = i13;
                        gVar.V(iArr2[0], dVar.q(), 1, i15, dVar);
                        i13 = i15;
                    }
                }
                i14++;
            }
            this.f89l = 0;
            this.f90m = 0;
            this.f80b = null;
            this.f81c = 0;
            int i16 = this.f92o;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = this.f91n + i17;
                if (i18 < gVar.f97b1) {
                    d dVar2 = gVar.f96a1[i18];
                    if (this.f79a == 0) {
                        int q9 = dVar2.q();
                        int i19 = gVar.P0;
                        if (dVar2.f43g0 == 8) {
                            i19 = 0;
                        }
                        this.f89l = q9 + i19 + this.f89l;
                        int T = gVar.T(dVar2, this.f94q);
                        if (this.f80b == null || this.f81c < T) {
                            this.f80b = dVar2;
                            this.f81c = T;
                            this.f90m = T;
                        }
                    } else {
                        int U = gVar.U(dVar2, this.f94q);
                        int T2 = gVar.T(dVar2, this.f94q);
                        int i20 = gVar.Q0;
                        if (dVar2.f43g0 == 8) {
                            i20 = 0;
                        }
                        this.f90m = T2 + i20 + this.f90m;
                        if (this.f80b == null || this.f81c < U) {
                            this.f80b = dVar2;
                            this.f81c = U;
                            this.f89l = U;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i6, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f79a = i6;
        this.f82d = cVar;
        this.f83e = cVar2;
        this.f84f = cVar3;
        this.f85g = cVar4;
        this.f86h = i10;
        this.f87i = i11;
        this.j = i12;
        this.f88k = i13;
        this.f94q = i14;
    }
}
