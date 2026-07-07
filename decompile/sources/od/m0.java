package od;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends ne.j implements ve.q {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ jd.y f10127x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f10128y;

    /* JADX WARN: Type inference failed for: r0v0, types: [ne.j, od.m0] */
    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ?? jVar = new ne.j(3, (le.c) obj3);
        jVar.f10127x = (jd.y) obj;
        jVar.f10128y = booleanValue;
        return jVar.invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        jd.y yVar = this.f10127x;
        boolean z10 = this.f10128y;
        he.a.f(obj);
        if (!z10) {
            return jd.w.f7411a;
        }
        return yVar;
    }
}
