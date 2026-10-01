package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 extends ne.j implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ int f7989x;

    /* JADX WARN: Type inference failed for: r0v0, types: [ne.j, kf.n0, le.c] */
    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        ?? jVar = new ne.j(2, cVar);
        jVar.f7989x = ((Number) obj).intValue();
        return jVar;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create(Integer.valueOf(((Number) obj).intValue()), (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        he.a.f(obj);
        if (this.f7989x > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
