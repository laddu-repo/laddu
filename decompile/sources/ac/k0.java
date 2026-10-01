package ac;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements af.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f419a;
    private static final ye.d descriptor;

    static {
        k0 k0Var = new k0();
        f419a = k0Var;
        af.m mVar = new af.m("com.google.firebase.sessions.SessionData", k0Var, 3);
        mVar.l("sessionDetails", false);
        mVar.l("backgroundTime", true);
        mVar.l("processDataMap", true);
        descriptor = mVar;
    }

    @Override // af.e
    public final we.a[] a() {
        return new we.a[]{o0.f434a, z7.b.x(h1.f388a), z7.b.x((we.a) m0.f425d[2].getValue())};
    }

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        ye.d dVar = descriptor;
        cf.k kVarC = kVar.c(dVar);
        od.c[] cVarArr = m0.f425d;
        q0 q0Var = null;
        boolean z2 = true;
        int i = 0;
        j1 j1Var = null;
        Map map = null;
        while (z2) {
            int iG = kVarC.g(dVar);
            if (iG == -1) {
                z2 = false;
            } else if (iG == 0) {
                q0Var = (q0) kVarC.n(dVar, 0, o0.f434a, q0Var);
                i |= 1;
            } else if (iG == 1) {
                j1Var = (j1) kVarC.m(dVar, 1, h1.f388a, j1Var);
                i |= 2;
            } else {
                if (iG != 2) {
                    throw new cf.g(iG);
                }
                map = (Map) kVarC.m(dVar, 2, (we.a) cVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        kVarC.t(dVar);
        return new m0(i, q0Var, j1Var, map);
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        m0 m0Var = (m0) obj;
        de.i.e(m0Var, "value");
        ye.d dVar = descriptor;
        cf.l lVarA = lVar.a(dVar);
        od.c[] cVarArr = m0.f425d;
        o0 o0Var = o0.f434a;
        q0 q0Var = m0Var.f426a;
        Map map = m0Var.f428c;
        j1 j1Var = m0Var.f427b;
        lVarA.h(dVar, 0, o0Var, q0Var);
        if (lVarA.o(dVar) || j1Var != null) {
            lVarA.g(dVar, 1, h1.f388a, j1Var);
        }
        if (lVarA.o(dVar) || map != null) {
            lVarA.g(dVar, 2, (we.a) cVarArr[2].getValue(), map);
        }
        lVarA.l(dVar);
    }

    @Override // we.a
    public final ye.d d() {
        return descriptor;
    }
}
