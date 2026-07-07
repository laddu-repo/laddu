package a0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f106q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f107r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f108s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f109t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f110u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f111v0;

    public h() {
        this.R.clear();
        this.R.add(this.f109t0);
        int length = this.Q.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.Q[i6] = this.f109t0;
        }
    }

    @Override // a0.d
    public final boolean A() {
        return this.f111v0;
    }

    @Override // a0.d
    public final boolean B() {
        return this.f111v0;
    }

    @Override // a0.d
    public final void Q(y.c cVar, boolean z10) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f109t0;
        cVar.getClass();
        int n10 = y.c.n(cVar2);
        if (this.f110u0 == 1) {
            this.Y = n10;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n10;
        O(this.T.q());
        L(0);
    }

    public final void R(int i6) {
        this.f109t0.l(i6);
        this.f111v0 = true;
    }

    public final void S(int i6) {
        if (this.f110u0 != i6) {
            this.f110u0 = i6;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.f110u0 == 1) {
                this.f109t0 = this.I;
            } else {
                this.f109t0 = this.J;
            }
            arrayList.add(this.f109t0);
            c[] cVarArr = this.Q;
            int length = cVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                cVarArr[i10] = this.f109t0;
            }
        }
    }

    @Override // a0.d
    public final void b(y.c cVar, boolean z10) {
        boolean z11;
        e eVar = (e) this.T;
        if (eVar != null) {
            Object i6 = eVar.i(2);
            Object i10 = eVar.i(4);
            d dVar = this.T;
            boolean z12 = true;
            if (dVar != null && dVar.f59p0[0] == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f110u0 == 0) {
                i6 = eVar.i(3);
                i10 = eVar.i(5);
                d dVar2 = this.T;
                if (dVar2 == null || dVar2.f59p0[1] != 2) {
                    z12 = false;
                }
                z11 = z12;
            }
            if (this.f111v0) {
                c cVar2 = this.f109t0;
                if (cVar2.f23c) {
                    y.f k8 = cVar.k(cVar2);
                    cVar.d(k8, this.f109t0.d());
                    if (this.f107r0 != -1) {
                        if (z11) {
                            cVar.f(cVar.k(i10), k8, 0, 5);
                        }
                    } else if (this.f108s0 != -1 && z11) {
                        y.f k9 = cVar.k(i10);
                        cVar.f(k8, cVar.k(i6), 0, 5);
                        cVar.f(k9, k8, 0, 5);
                    }
                    this.f111v0 = false;
                    return;
                }
            }
            if (this.f107r0 != -1) {
                y.f k10 = cVar.k(this.f109t0);
                cVar.e(k10, cVar.k(i6), this.f107r0, 8);
                if (z11) {
                    cVar.f(cVar.k(i10), k10, 0, 5);
                    return;
                }
                return;
            }
            if (this.f108s0 != -1) {
                y.f k11 = cVar.k(this.f109t0);
                y.f k12 = cVar.k(i10);
                cVar.e(k11, k12, -this.f108s0, 8);
                if (z11) {
                    cVar.f(k11, cVar.k(i6), 0, 5);
                    cVar.f(k12, k11, 0, 5);
                    return;
                }
                return;
            }
            if (this.f106q0 != -1.0f) {
                y.f k13 = cVar.k(this.f109t0);
                y.f k14 = cVar.k(i10);
                float f3 = this.f106q0;
                y.b l10 = cVar.l();
                l10.f14772d.g(k13, -1.0f);
                l10.f14772d.g(k14, f3);
                cVar.c(l10);
            }
        }
    }

    @Override // a0.d
    public final boolean c() {
        return true;
    }

    @Override // a0.d
    public final c i(int i6) {
        int c10 = y.e.c(i6);
        if (c10 != 1) {
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        return null;
                    }
                }
            }
            if (this.f110u0 == 0) {
                return this.f109t0;
            }
            return null;
        }
        if (this.f110u0 == 1) {
            return this.f109t0;
        }
        return null;
    }
}
