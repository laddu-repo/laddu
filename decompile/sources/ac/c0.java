package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements af.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f334a;
    private static final ye.d descriptor;

    static {
        c0 c0Var = new c0();
        f334a = c0Var;
        af.m mVar = new af.m("com.google.firebase.sessions.ProcessData", c0Var, 2);
        mVar.l("pid", false);
        mVar.l("uuid", false);
        descriptor = mVar;
    }

    @Override // af.e
    public final we.a[] a() {
        return new we.a[]{af.f.f504a, af.p.f531a};
    }

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        ye.d dVar = descriptor;
        cf.k kVarC = kVar.c(dVar);
        String strQ = null;
        boolean z2 = true;
        int i = 0;
        int i10 = 0;
        while (z2) {
            int iG = kVarC.g(dVar);
            if (iG == -1) {
                z2 = false;
            } else if (iG == 0) {
                i10 = kVarC.i(dVar, 0);
                i |= 1;
            } else {
                if (iG != 1) {
                    throw new cf.g(iG);
                }
                strQ = kVarC.q(dVar, 1);
                i |= 2;
            }
        }
        kVarC.t(dVar);
        return new e0(i, i10, strQ);
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        e0 e0Var = (e0) obj;
        de.i.e(e0Var, "value");
        ye.d dVar = descriptor;
        cf.l lVarA = lVar.a(dVar);
        int i = e0Var.f349a;
        lVarA.b(dVar, 0);
        lVarA.c(i);
        lVarA.k(dVar, 1, e0Var.f350b);
        lVarA.l(dVar);
    }

    @Override // we.a
    public final ye.d d() {
        return descriptor;
    }
}
