package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements af.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f434a;
    private static final ye.d descriptor;

    static {
        o0 o0Var = new o0();
        f434a = o0Var;
        af.m mVar = new af.m("com.google.firebase.sessions.SessionDetails", o0Var, 4);
        mVar.l("sessionId", false);
        mVar.l("firstSessionId", false);
        mVar.l("sessionIndex", false);
        mVar.l("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override // af.e
    public final we.a[] a() {
        af.p pVar = af.p.f531a;
        return new we.a[]{pVar, pVar, af.f.f504a, af.i.f510a};
    }

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        ye.d dVar = descriptor;
        cf.k kVarC = kVar.c(dVar);
        int i = 0;
        int i10 = 0;
        String strQ = null;
        String strQ2 = null;
        long jK = 0;
        boolean z2 = true;
        while (z2) {
            int iG = kVarC.g(dVar);
            if (iG == -1) {
                z2 = false;
            } else if (iG == 0) {
                strQ = kVarC.q(dVar, 0);
                i |= 1;
            } else if (iG == 1) {
                strQ2 = kVarC.q(dVar, 1);
                i |= 2;
            } else if (iG == 2) {
                i10 = kVarC.i(dVar, 2);
                i |= 4;
            } else {
                if (iG != 3) {
                    throw new cf.g(iG);
                }
                jK = kVarC.k(dVar, 3);
                i |= 8;
            }
        }
        kVarC.t(dVar);
        return new q0(i, strQ, strQ2, i10, jK);
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        q0 q0Var = (q0) obj;
        de.i.e(q0Var, "value");
        ye.d dVar = descriptor;
        cf.l lVarA = lVar.a(dVar);
        lVarA.k(dVar, 0, q0Var.f437a);
        lVarA.k(dVar, 1, q0Var.f438b);
        int i = q0Var.f439c;
        lVarA.b(dVar, 2);
        lVarA.c(i);
        lVarA.e(dVar, 3, q0Var.f440d);
        lVarA.l(dVar);
    }

    @Override // we.a
    public final ye.d d() {
        return descriptor;
    }
}
