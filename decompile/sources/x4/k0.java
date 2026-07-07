package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 extends ne.j implements ve.p {
    public final /* synthetic */ p0 A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14594x;

    /* renamed from: y, reason: collision with root package name */
    public int f14595y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f14596z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(p0 p0Var, le.c cVar, int i6) {
        super(2, cVar);
        this.f14594x = i6;
        this.A = p0Var;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f14594x) {
            case 0:
                k0 k0Var = new k0(this.A, cVar, 0);
                k0Var.f14596z = obj;
                return k0Var;
            case 1:
                k0 k0Var2 = new k0(this.A, cVar, 1);
                k0Var2.f14596z = obj;
                return k0Var2;
            default:
                k0 k0Var3 = new k0(this.A, cVar, 2);
                k0Var3.f14596z = obj;
                return k0Var3;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14594x) {
            case 0:
                return ((k0) create((a5.c) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 1:
                return ((k0) create((g0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            default:
                return ((k0) create((g0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x003b, code lost:
    
        if (r6 == r5) goto L49;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
