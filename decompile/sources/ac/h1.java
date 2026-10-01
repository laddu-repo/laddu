package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements af.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f388a;
    private static final ye.d descriptor;

    static {
        h1 h1Var = new h1();
        f388a = h1Var;
        af.m mVar = new af.m("com.google.firebase.sessions.Time", h1Var, 3);
        mVar.l("ms", false);
        mVar.l("us", true);
        mVar.l("seconds", true);
        descriptor = mVar;
    }

    @Override // af.e
    public final we.a[] a() {
        af.i iVar = af.i.f510a;
        return new we.a[]{iVar, iVar, iVar};
    }

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        ye.d dVar = descriptor;
        cf.k kVarC = kVar.c(dVar);
        int i = 0;
        long jK = 0;
        long jK2 = 0;
        long jK3 = 0;
        boolean z2 = true;
        while (z2) {
            int iG = kVarC.g(dVar);
            if (iG == -1) {
                z2 = false;
            } else if (iG == 0) {
                jK = kVarC.k(dVar, 0);
                i |= 1;
            } else if (iG == 1) {
                jK2 = kVarC.k(dVar, 1);
                i |= 2;
            } else {
                if (iG != 2) {
                    throw new cf.g(iG);
                }
                jK3 = kVarC.k(dVar, 2);
                i |= 4;
            }
        }
        kVarC.t(dVar);
        return new j1(i, jK, jK2, jK3);
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        j1 j1Var = (j1) obj;
        de.i.e(j1Var, "value");
        ye.d dVar = descriptor;
        cf.l lVarA = lVar.a(dVar);
        long j8 = j1Var.f413a;
        long j9 = j1Var.f415c;
        long j10 = j1Var.f414b;
        lVarA.e(dVar, 0, j8);
        if (lVarA.o(dVar) || j10 != ((long) 1000) * j8) {
            lVarA.e(dVar, 1, j10);
        }
        if (lVarA.o(dVar) || j9 != j8 / ((long) 1000)) {
            lVarA.e(dVar, 2, j9);
        }
        lVarA.l(dVar);
    }

    @Override // we.a
    public final ye.d d() {
        return descriptor;
    }
}
