package dc;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements af.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4479a;
    private static final ye.d descriptor;

    static {
        f fVar = new f();
        f4479a = fVar;
        af.m mVar = new af.m("com.google.firebase.sessions.settings.SessionConfigs", fVar, 5);
        mVar.l("sessionsEnabled", false);
        mVar.l("sessionSamplingRate", false);
        mVar.l("sessionTimeoutSeconds", false);
        mVar.l("cacheDurationSeconds", false);
        mVar.l("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override // af.e
    public final we.a[] a() {
        we.a aVarX = z7.b.x(af.a.f495a);
        we.a aVarX2 = z7.b.x(af.c.f497a);
        af.f fVar = af.f.f504a;
        return new we.a[]{aVarX, aVarX2, z7.b.x(fVar), z7.b.x(fVar), z7.b.x(af.i.f510a)};
    }

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        ye.d dVar = descriptor;
        cf.k kVarC = kVar.c(dVar);
        int i = 0;
        Boolean bool = null;
        Double d10 = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z2 = true;
        while (z2) {
            int iG = kVarC.g(dVar);
            if (iG == -1) {
                z2 = false;
            } else if (iG == 0) {
                bool = (Boolean) kVarC.m(dVar, 0, af.a.f495a, bool);
                i |= 1;
            } else if (iG == 1) {
                d10 = (Double) kVarC.m(dVar, 1, af.c.f497a, d10);
                i |= 2;
            } else if (iG == 2) {
                num = (Integer) kVarC.m(dVar, 2, af.f.f504a, num);
                i |= 4;
            } else if (iG == 3) {
                num2 = (Integer) kVarC.m(dVar, 3, af.f.f504a, num2);
                i |= 8;
            } else {
                if (iG != 4) {
                    throw new cf.g(iG);
                }
                l10 = (Long) kVarC.m(dVar, 4, af.i.f510a, l10);
                i |= 16;
            }
        }
        kVarC.t(dVar);
        return new h(i, bool, d10, num, num2, l10);
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        h hVar = (h) obj;
        de.i.e(hVar, "value");
        ye.d dVar = descriptor;
        cf.l lVarA = lVar.a(dVar);
        lVarA.g(dVar, 0, af.a.f495a, hVar.f4480a);
        lVarA.g(dVar, 1, af.c.f497a, hVar.f4481b);
        af.f fVar = af.f.f504a;
        lVarA.g(dVar, 2, fVar, hVar.f4482c);
        lVarA.g(dVar, 3, fVar, hVar.f4483d);
        lVarA.g(dVar, 4, af.i.f510a, hVar.f4484e);
        lVarA.l(dVar);
    }

    @Override // we.a
    public final ye.d d() {
        return descriptor;
    }
}
