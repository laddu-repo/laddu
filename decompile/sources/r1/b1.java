package r1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 extends d1 {

    /* renamed from: e, reason: collision with root package name */
    public final db.k0 f11314e;

    /* renamed from: f, reason: collision with root package name */
    public final db.k0 f11315f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f11316g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f11317h;

    public b1(db.c1 c1Var, db.c1 c1Var2, int[] iArr) {
        boolean z10;
        if (c1Var.A == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        this.f11314e = c1Var;
        this.f11315f = c1Var2;
        this.f11316g = iArr;
        this.f11317h = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f11317h[iArr[i6]] = i6;
        }
    }

    @Override // r1.d1
    public final int a(boolean z10) {
        if (p()) {
            return -1;
        }
        if (!z10) {
            return 0;
        }
        return this.f11316g[0];
    }

    @Override // r1.d1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // r1.d1
    public final int c(boolean z10) {
        if (p()) {
            return -1;
        }
        db.k0 k0Var = this.f11314e;
        if (z10) {
            return this.f11316g[k0Var.size() - 1];
        }
        return k0Var.size() - 1;
    }

    @Override // r1.d1
    public final int e(boolean z10, int i6, int i10) {
        if (i10 == 1) {
            return i6;
        }
        if (i6 == c(z10)) {
            if (i10 == 2) {
                return a(z10);
            }
            return -1;
        }
        if (z10) {
            return this.f11316g[this.f11317h[i6] + 1];
        }
        return i6 + 1;
    }

    @Override // r1.d1
    public final a1 f(int i6, a1 a1Var, boolean z10) {
        a1 a1Var2 = (a1) this.f11315f.get(i6);
        a1Var.h(a1Var2.f11295a, a1Var2.f11296b, a1Var2.f11297c, a1Var2.f11298d, a1Var2.f11299e, a1Var2.f11301g, a1Var2.f11300f);
        return a1Var;
    }

    @Override // r1.d1
    public final int h() {
        return this.f11315f.size();
    }

    @Override // r1.d1
    public final int k(boolean z10, int i6, int i10) {
        if (i10 == 1) {
            return i6;
        }
        if (i6 == a(z10)) {
            if (i10 == 2) {
                return c(z10);
            }
            return -1;
        }
        if (z10) {
            return this.f11316g[this.f11317h[i6] - 1];
        }
        return i6 - 1;
    }

    @Override // r1.d1
    public final Object l(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // r1.d1
    public final c1 m(int i6, c1 c1Var, long j) {
        c1 c1Var2 = (c1) this.f11314e.get(i6);
        c1Var.b(c1Var2.f11327a, c1Var2.f11329c, c1Var2.f11330d, c1Var2.f11331e, c1Var2.f11332f, c1Var2.f11333g, c1Var2.f11334h, c1Var2.f11335i, c1Var2.j, c1Var2.f11337l, c1Var2.f11338m, c1Var2.f11339n, c1Var2.f11340o, c1Var2.f11341p);
        c1Var.f11336k = c1Var2.f11336k;
        return c1Var;
    }

    @Override // r1.d1
    public final int o() {
        return this.f11314e.size();
    }
}
