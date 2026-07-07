package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z0 {
    public final c1 A;
    public final l B;
    public final Object C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d1 f8678z;

    public b1(d1 d1Var, c1 c1Var, l lVar, Object obj) {
        this.f8678z = d1Var;
        this.A = c1Var;
        this.B = lVar;
        this.C = obj;
    }

    @Override // me.z0
    public final boolean k() {
        return false;
    }

    @Override // me.z0
    public final void l(Throwable th) {
        l lVar = this.B;
        l lVarQ = d1.Q(lVar);
        d1 d1Var = this.f8678z;
        c1 c1Var = this.A;
        Object obj = this.C;
        if (lVarQ == null || !d1Var.Z(c1Var, lVarQ, obj)) {
            c1Var.f8685v.e(new re.h(2), 2);
            l lVarQ2 = d1.Q(lVar);
            if (lVarQ2 == null || !d1Var.Z(c1Var, lVarQ2, obj)) {
                d1Var.j(d1Var.w(c1Var, obj));
            }
        }
    }
}
