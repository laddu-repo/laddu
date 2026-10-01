package b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends ne.j implements ve.p {
    public final /* synthetic */ g0 A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1321x;

    /* renamed from: y, reason: collision with root package name */
    public int f1322y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f1323z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(g0 g0Var, le.c cVar, int i6) {
        super(2, cVar);
        this.f1321x = i6;
        this.A = g0Var;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f1321x) {
            case 0:
                s sVar = new s(this.A, cVar, 0);
                sVar.f1323z = obj;
                return sVar;
            default:
                s sVar2 = new s(this.A, cVar, 1);
                sVar2.f1323z = obj;
                return sVar2;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1321x) {
            case 0:
                return ((s) create((p) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            default:
                return ((s) create((kf.i) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (r7 == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (r7 == r5) goto L46;
     */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.io.Serializable] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
