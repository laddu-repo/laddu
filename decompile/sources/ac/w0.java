package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements t0 {
    public static final double f = Math.random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f457g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.g f458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nb.d f459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dc.k f460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd.h f462e;

    public w0(fa.g gVar, nb.d dVar, dc.k kVar, l lVar, sd.h hVar) {
        de.i.e(gVar, "firebaseApp");
        de.i.e(dVar, "firebaseInstallations");
        de.i.e(kVar, "sessionSettings");
        de.i.e(lVar, "eventGDTLogger");
        de.i.e(hVar, "backgroundDispatcher");
        this.f458a = gVar;
        this.f459b = dVar;
        this.f460c = kVar;
        this.f461d = lVar;
        this.f462e = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r0.b(r1) == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ac.w0 r6, ud.c r7) {
        /*
            dc.k r0 = r6.f460c
            boolean r1 = r7 instanceof ac.v0
            if (r1 == 0) goto L15
            r1 = r7
            ac.v0 r1 = (ac.v0) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            ac.v0 r1 = new ac.v0
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r6 = r1.f452y
            int r7 = r1.A
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            td.a r5 = td.a.f12544v
            if (r7 == 0) goto L3a
            if (r7 == r3) goto L36
            if (r7 != r2) goto L2e
            fa.b.z(r6)
            goto L78
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            fa.b.z(r6)
            goto L48
        L3a:
            fa.b.z(r6)
            bc.c r6 = bc.c.f1604a
            r1.A = r3
            java.lang.Object r6 = r6.b(r1)
            if (r6 != r5) goto L48
            goto L77
        L48:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            if (r6 == 0) goto L57
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L57
            goto Lad
        L57:
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lad
            java.lang.Object r7 = r6.next()
            sa.i r7 = (sa.i) r7
            o2.p r7 = r7.f11618a
            boolean r7 = r7.b()
            if (r7 == 0) goto L5b
            r1.A = r2
            java.lang.Object r6 = r0.b(r1)
            if (r6 != r5) goto L78
        L77:
            return r5
        L78:
            dc.p r6 = r0.f4489a
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L85
        L80:
            boolean r3 = r6.booleanValue()
            goto L8e
        L85:
            dc.p r6 = r0.f4490b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L8e
            goto L80
        L8e:
            if (r3 != 0) goto L98
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L98:
            double r6 = ac.w0.f
            double r0 = r0.a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto La5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        La5:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lad:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.w0.a(ac.w0, ud.c):java.lang.Object");
    }
}
