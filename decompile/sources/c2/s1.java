package c2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1965e;
    public Object f;

    public static void b(f fVar) {
        int i = fVar.C;
        if (i == 2) {
            w1.a.j(i == 2);
            fVar.C = 1;
            fVar.u();
        }
    }

    public static boolean h(f fVar) {
        return fVar.C != 0;
    }

    public static void l(f fVar, long j8) {
        fVar.I = true;
        if (fVar instanceof q2.e) {
            q2.e eVar = (q2.e) fVar;
            w1.a.j(eVar.I);
            eVar.f10668f0 = j8;
        }
    }

    public void a(f fVar, l lVar) {
        w1.a.j(((f) this.f1965e) == fVar || ((f) this.f) == fVar);
        if (h(fVar)) {
            if (fVar == ((f) lVar.f1836z)) {
                lVar.A = null;
                lVar.f1836z = null;
                lVar.f1832v = true;
            }
            b(fVar);
            w1.a.j(fVar.C == 1);
            fVar.f1724x.G();
            fVar.C = 0;
            fVar.D = null;
            fVar.E = null;
            fVar.I = false;
            fVar.o();
            fVar.L = null;
        }
    }

    public int c() {
        boolean zH = h((f) this.f1965e);
        f fVar = (f) this.f;
        return (zH ? 1 : 0) + ((fVar == null || !h(fVar)) ? 0 : 1);
    }

    public f d(x0 x0Var) {
        o2.c1 c1Var;
        if (x0Var != null && (c1Var = x0Var.f1993c[this.f1963c]) != null) {
            f fVar = (f) this.f1965e;
            if (fVar.D == c1Var) {
                return fVar;
            }
            f fVar2 = (f) this.f;
            if (fVar2 != null && fVar2.D == c1Var) {
                return fVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(c2.x0 r8, c2.f r9) {
        /*
            r7 = this;
            int r0 = r7.f1963c
            r1 = 1
            if (r9 != 0) goto L6
            goto L49
        L6:
            o2.c1[] r2 = r8.f1993c
            r2 = r2[r0]
            o2.c1 r3 = r9.D
            if (r3 == 0) goto L49
            if (r3 != r2) goto L3a
            if (r2 == 0) goto L49
            boolean r2 = r9.k()
            if (r2 != 0) goto L49
            c2.x0 r2 = r8.f2001m
            c2.y0 r3 = r8.f1996g
            boolean r3 = r3.f2012g
            if (r3 == 0) goto L3a
            if (r2 == 0) goto L3a
            boolean r3 = r2.f1995e
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof q2.e
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof m2.b
            if (r3 != 0) goto L39
            long r3 = r9.H
            long r5 = r2.e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L3a
            goto L49
        L39:
            return r1
        L3a:
            c2.x0 r8 = r8.f2001m
            if (r8 == 0) goto L47
            o2.c1[] r8 = r8.f1993c
            r8 = r8[r0]
            o2.c1 r9 = r9.D
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.s1.e(c2.x0, c2.f):boolean");
    }

    public boolean f() {
        int i = this.f1964d;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.f1964d;
        if (i == 0 || i == 2 || i == 4) {
            return h((f) this.f1965e);
        }
        f fVar = (f) this.f;
        fVar.getClass();
        return fVar.C != 0;
    }

    public void i(boolean z2) {
        if (z2) {
            if (this.f1961a) {
                f fVar = (f) this.f1965e;
                w1.a.j(fVar.C == 0);
                fVar.f1724x.G();
                fVar.s();
                this.f1961a = false;
                return;
            }
            return;
        }
        if (this.f1962b) {
            f fVar2 = (f) this.f;
            fVar2.getClass();
            w1.a.j(fVar2.C == 0);
            fVar2.f1724x.G();
            fVar2.s();
            this.f1962b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(f fVar, x0 x0Var, r2.w wVar, l lVar) {
        int i;
        f fVar2 = (f) this.f1965e;
        int i10 = this.f1963c;
        if (fVar == null || fVar.C == 0 || (fVar == fVar2 && ((i = this.f1964d) == 2 || i == 4))) {
            return 1;
        }
        if (fVar == ((f) this.f) && this.f1964d == 3) {
            return 1;
        }
        byte b9 = fVar.D != x0Var.f1993c[i10];
        boolean zB = wVar.b(i10);
        if (!zB || b9 != false) {
            if (!fVar.I) {
                r2.s sVar = wVar.f11130c[i10];
                int length = sVar != null ? sVar.length() : 0;
                t1.o[] oVarArr = new t1.o[length];
                for (int i11 = 0; i11 < length; i11++) {
                    sVar.getClass();
                    oVarArr[i11] = sVar.c(i11);
                }
                o2.c1 c1Var = x0Var.f1993c[i10];
                c1Var.getClass();
                fVar.y(oVarArr, c1Var, x0Var.e(), x0Var.f2004p, x0Var.f1996g.f2007a);
                return 3;
            }
            if (!fVar.l()) {
                return 0;
            }
            a(fVar, lVar);
            if (!zB || f()) {
                i(fVar == fVar2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((f) this.f1965e)) {
            i(true);
        }
        f fVar = (f) this.f;
        if (fVar == null || fVar.C != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        f fVar = (f) this.f1965e;
        int i10 = fVar.C;
        if (i10 == 1 && this.f1964d != 4) {
            w1.a.j(i10 == 1);
            fVar.C = 2;
            fVar.t();
            return;
        }
        f fVar2 = (f) this.f;
        if (fVar2 == null || (i = fVar2.C) != 1 || this.f1964d == 3) {
            return;
        }
        w1.a.j(i == 1);
        fVar2.C = 2;
        fVar2.t();
    }
}
