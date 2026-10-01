package q2;

import a2.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends l1 {
    public final boolean I;
    public final r1.c1 J;
    public final r1.a1 K;
    public w L;
    public v M;
    public boolean N;
    public boolean O;
    public boolean P;

    public y(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I = z11;
        this.J = new r1.c1();
        this.K = new r1.a1();
        r1.d1 h4 = aVar.h();
        if (h4 != null) {
            this.L = new w(h4, null, null);
            this.P = true;
        } else {
            this.L = new w(new x(aVar.i()), r1.c1.f11318q, w.f10981h);
        }
    }

    @Override // q2.l1
    public final c0 D(c0 c0Var) {
        Object obj = c0Var.f10834a;
        Object obj2 = this.L.f10983g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = w.f10981h;
        }
        return c0Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // q2.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(r1.d1 r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.y.E(r1.d1):void");
    }

    @Override // q2.l1
    public final void G() {
        if (!this.I) {
            this.N = true;
            F();
        }
    }

    @Override // q2.a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final v c(c0 c0Var, u2.e eVar, long j) {
        boolean z10;
        v vVar = new v(c0Var, eVar, j);
        if (vVar.A == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        vVar.A = this.H;
        if (this.O) {
            Object obj = c0Var.f10834a;
            if (this.L.f10983g != null && obj.equals(w.f10981h)) {
                obj = this.L.f10983g;
            }
            vVar.b(c0Var.a(obj));
            return vVar;
        }
        this.M = vVar;
        if (!this.N) {
            this.N = true;
            F();
        }
        return vVar;
    }

    public final boolean I(long j) {
        v vVar = this.M;
        int b10 = this.L.b(vVar.f10971x.f10834a);
        if (b10 == -1) {
            return false;
        }
        w wVar = this.L;
        r1.a1 a1Var = this.K;
        wVar.f(b10, a1Var, false);
        long j10 = a1Var.f11298d;
        if (j10 != -9223372036854775807L && j >= j10) {
            j = Math.max(0L, j10 - 1);
        }
        vVar.D = j;
        return true;
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        return this.H.a(e0Var);
    }

    @Override // q2.a
    public final void q(a0 a0Var) {
        v vVar = (v) a0Var;
        if (vVar.B != null) {
            a aVar = vVar.A;
            aVar.getClass();
            aVar.q(vVar.B);
        }
        if (a0Var == this.M) {
            this.M = null;
        }
    }

    @Override // q2.l, q2.a
    public final void s() {
        this.O = false;
        this.N = false;
        super.s();
    }

    @Override // q2.l1, q2.a
    public final void v(r1.e0 e0Var) {
        if (this.P) {
            w wVar = this.L;
            this.L = new w(new w1(this.L.f10943e, e0Var), wVar.f10982f, wVar.f10983g);
        } else {
            this.L = new w(new x(e0Var), r1.c1.f11318q, w.f10981h);
        }
        this.H.v(e0Var);
    }
}
