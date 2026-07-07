package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f512a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f513b;

    /* renamed from: c, reason: collision with root package name */
    public int f514c;

    /* renamed from: d, reason: collision with root package name */
    public int f515d;

    /* renamed from: e, reason: collision with root package name */
    public Object f516e;

    /* renamed from: f, reason: collision with root package name */
    public Object f517f;

    public static void b(g gVar) {
        boolean z10;
        int i6 = gVar.E;
        if (i6 == 2) {
            if (i6 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            gVar.E = 1;
            gVar.u();
        }
    }

    public static boolean h(g gVar) {
        if (gVar.E != 0) {
            return true;
        }
        return false;
    }

    public static void l(g gVar, long j) {
        gVar.K = true;
        if (gVar instanceof s2.e) {
            s2.e eVar = (s2.e) gVar;
            u1.c.g(eVar.K);
            eVar.f12041h0 = j;
        }
    }

    public void a(g gVar, m mVar) {
        boolean z10;
        boolean z11 = true;
        if (((g) this.f516e) != gVar && ((g) this.f517f) != gVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        if (!h(gVar)) {
            return;
        }
        if (gVar == ((g) mVar.B)) {
            mVar.C = null;
            mVar.B = null;
            mVar.f314x = true;
        }
        b(gVar);
        if (gVar.E != 1) {
            z11 = false;
        }
        u1.c.g(z11);
        gVar.f246z.i();
        gVar.E = 0;
        gVar.F = null;
        gVar.G = null;
        gVar.K = false;
        gVar.o();
        gVar.N = null;
    }

    public int c() {
        int i6;
        boolean h4 = h((g) this.f516e);
        g gVar = (g) this.f517f;
        if (gVar != null && h(gVar)) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        return (h4 ? 1 : 0) + i6;
    }

    public g d(c1 c1Var) {
        q2.z0 z0Var;
        if (c1Var != null && (z0Var = c1Var.f178c[this.f514c]) != null) {
            g gVar = (g) this.f516e;
            if (gVar.F == z0Var) {
                return gVar;
            }
            g gVar2 = (g) this.f517f;
            if (gVar2 != null && gVar2.F == z0Var) {
                return gVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r9.J >= r2.e()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(a2.c1 r8, a2.g r9) {
        /*
            r7 = this;
            int r0 = r7.f514c
            r1 = 1
            if (r9 != 0) goto L6
            goto L49
        L6:
            q2.z0[] r2 = r8.f178c
            r2 = r2[r0]
            q2.z0 r3 = r9.F
            if (r3 == 0) goto L49
            if (r3 != r2) goto L3a
            if (r2 == 0) goto L49
            boolean r2 = r9.k()
            if (r2 != 0) goto L49
            a2.c1 r2 = r8.f187m
            a2.d1 r3 = r8.f182g
            boolean r3 = r3.f203g
            if (r3 == 0) goto L3a
            if (r2 == 0) goto L3a
            boolean r3 = r2.f180e
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof s2.e
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof k2.b
            if (r3 != 0) goto L39
            long r3 = r9.J
            long r5 = r2.e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L3a
            goto L49
        L39:
            return r1
        L3a:
            a2.c1 r8 = r8.f187m
            if (r8 == 0) goto L47
            q2.z0[] r8 = r8.f178c
            r8 = r8[r0]
            q2.z0 r9 = r9.F
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.z1.e(a2.c1, a2.g):boolean");
    }

    public boolean f() {
        int i6 = this.f515d;
        if (i6 != 2 && i6 != 4 && i6 != 3) {
            return false;
        }
        return true;
    }

    public boolean g() {
        int i6 = this.f515d;
        if (i6 != 0 && i6 != 2 && i6 != 4) {
            g gVar = (g) this.f517f;
            gVar.getClass();
            if (gVar.E != 0) {
                return true;
            }
            return false;
        }
        return h((g) this.f516e);
    }

    public void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.f512a) {
                g gVar = (g) this.f516e;
                if (gVar.E != 0) {
                    z11 = false;
                }
                u1.c.g(z11);
                gVar.f246z.i();
                gVar.s();
                this.f512a = false;
                return;
            }
            return;
        }
        if (this.f513b) {
            g gVar2 = (g) this.f517f;
            gVar2.getClass();
            if (gVar2.E != 0) {
                z11 = false;
            }
            u1.c.g(z11);
            gVar2.f246z.i();
            gVar2.s();
            this.f513b = false;
        }
    }

    public int j(g gVar, c1 c1Var, t2.w wVar, m mVar) {
        boolean z10;
        int i6;
        int i10;
        g gVar2 = (g) this.f516e;
        int i11 = this.f514c;
        if (gVar == null || gVar.E == 0 || (gVar == gVar2 && ((i10 = this.f515d) == 2 || i10 == 4))) {
            return 1;
        }
        if (gVar == ((g) this.f517f) && this.f515d == 3) {
            return 1;
        }
        boolean z11 = false;
        if (gVar.F != c1Var.f178c[i11]) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean b10 = wVar.b(i11);
        if (!b10 || z10) {
            if (!gVar.K) {
                t2.s sVar = wVar.f12564c[i11];
                if (sVar != null) {
                    i6 = sVar.length();
                } else {
                    i6 = 0;
                }
                r1.q[] qVarArr = new r1.q[i6];
                for (int i12 = 0; i12 < i6; i12++) {
                    sVar.getClass();
                    qVarArr[i12] = sVar.h(i12);
                }
                q2.z0 z0Var = c1Var.f178c[i11];
                z0Var.getClass();
                gVar.y(qVarArr, z0Var, c1Var.e(), c1Var.f190p, c1Var.f182g.f197a);
                return 3;
            }
            if (!gVar.l()) {
                return 0;
            }
            a(gVar, mVar);
            if (!b10 || f()) {
                if (gVar == gVar2) {
                    z11 = true;
                }
                i(z11);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((g) this.f516e)) {
            i(true);
        }
        g gVar = (g) this.f517f;
        if (gVar == null || gVar.E != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i6;
        g gVar = (g) this.f516e;
        int i10 = gVar.E;
        boolean z10 = false;
        if (i10 == 1 && this.f515d != 4) {
            if (i10 == 1) {
                z10 = true;
            }
            u1.c.g(z10);
            gVar.E = 2;
            gVar.t();
            return;
        }
        g gVar2 = (g) this.f517f;
        if (gVar2 != null && (i6 = gVar2.E) == 1 && this.f515d != 3) {
            if (i6 == 1) {
                z10 = true;
            }
            u1.c.g(z10);
            gVar2.E = 2;
            gVar2.t();
        }
    }
}
