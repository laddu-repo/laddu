package o2;

import c2.p1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends k1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1.r0 f9577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t1.q0 f9578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f9579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f9580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9583s;

    public y(a aVar, boolean z2) {
        super(aVar);
        this.f9576l = z2 && aVar.i();
        this.f9577m = new t1.r0();
        this.f9578n = new t1.q0();
        t1.s0 s0VarG = aVar.g();
        if (s0VarG == null) {
            this.f9579o = new w(new x(aVar.h()), t1.r0.f12093q, w.f9556e);
        } else {
            this.f9579o = new w(s0VarG, null, null);
            this.f9583s = true;
        }
    }

    @Override // o2.k1
    public final void B() {
        if (this.f9576l) {
            return;
        }
        this.f9581q = true;
        A();
    }

    @Override // o2.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final v b(d0 d0Var, s2.e eVar, long j8) {
        v vVar = new v(d0Var, eVar, j8);
        w1.a.j(vVar.f9554y == null);
        vVar.f9554y = this.f9474k;
        if (!this.f9582r) {
            this.f9580p = vVar;
            if (!this.f9581q) {
                this.f9581q = true;
                A();
            }
            return vVar;
        }
        Object obj = d0Var.f9404a;
        if (this.f9579o.f9558d != null && obj.equals(w.f9556e)) {
            obj = this.f9579o.f9558d;
        }
        vVar.b(d0Var.a(obj));
        return vVar;
    }

    public final boolean D(long j8) {
        v vVar = this.f9580p;
        int iB = this.f9579o.b(vVar.f9551v.f9404a);
        if (iB == -1) {
            return false;
        }
        w wVar = this.f9579o;
        t1.q0 q0Var = this.f9578n;
        wVar.f(iB, q0Var, false);
        long j9 = q0Var.f12089d;
        if (j9 != -9223372036854775807L && j8 >= j9) {
            j8 = Math.max(0L, j9 - 1);
        }
        vVar.B = j8;
        return true;
    }

    @Override // o2.a
    public final void n(b0 b0Var) {
        v vVar = (v) b0Var;
        if (vVar.f9555z != null) {
            a aVar = vVar.f9554y;
            aVar.getClass();
            aVar.n(vVar.f9555z);
        }
        if (b0Var == this.f9580p) {
            this.f9580p = null;
        }
    }

    @Override // o2.l, o2.a
    public final void p() {
        this.f9582r = false;
        this.f9581q = false;
        super.p();
    }

    @Override // o2.k1, o2.a
    public final void s(t1.z zVar) {
        if (this.f9583s) {
            w wVar = this.f9579o;
            this.f9579o = new w(new p1(this.f9579o.f9522b, zVar), wVar.f9557c, wVar.f9558d);
        } else {
            this.f9579o = new w(new x(zVar), t1.r0.f12093q, w.f9556e);
        }
        this.f9474k.s(zVar);
    }

    @Override // o2.k1
    public final d0 y(d0 d0Var) {
        Object obj = d0Var.f9404a;
        Object obj2 = this.f9579o.f9558d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = w.f9556e;
        }
        return d0Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // o2.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(t1.s0 r12) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.y.z(t1.s0):void");
    }
}
