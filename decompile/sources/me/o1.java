package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends re.q {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ThreadLocal f8721z;

    /* JADX WARN: Illegal instructions before constructor call */
    public o1(sd.c cVar, sd.h hVar) {
        p1 p1Var = p1.f8724v;
        super(cVar, hVar.A(p1Var) == null ? hVar.n0(p1Var) : hVar);
        this.f8721z = new ThreadLocal();
        if (cVar.f().A(sd.d.f11796v) instanceof s) {
            return;
        }
        Object objL = re.a.l(hVar, null);
        re.a.g(hVar, objL);
        f0(hVar, objL);
    }

    public final boolean e0() {
        boolean z2 = this.threadLocalIsSet && this.f8721z.get() == null;
        this.f8721z.remove();
        return !z2;
    }

    public final void f0(sd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f8721z.set(new od.f(hVar, obj));
    }

    @Override // re.q, me.d1
    public final void o(Object obj) {
        if (this.threadLocalIsSet) {
            od.f fVar = (od.f) this.f8721z.get();
            if (fVar != null) {
                re.a.g((sd.h) fVar.f10116v, fVar.f10117w);
            }
            this.f8721z.remove();
        }
        Object objM = x.m(obj);
        sd.c cVar = this.f11398y;
        sd.h hVarF = cVar.f();
        Object objL = re.a.l(hVarF, null);
        o1 o1VarR = objL != re.a.f11371d ? x.r(cVar, hVarF, objL) : null;
        try {
            this.f11398y.g(objM);
            if (o1VarR == null || o1VarR.e0()) {
                re.a.g(hVarF, objL);
            }
        } catch (Throwable th) {
            if (o1VarR == null || o1VarR.e0()) {
                re.a.g(hVarF, objL);
            }
            throw th;
        }
    }
}
