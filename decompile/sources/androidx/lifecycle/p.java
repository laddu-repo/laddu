package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements kf.i {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f980x;

    public p(p0 p0Var) {
        this.f980x = p0Var;
    }

    @Override // kf.i
    public final Object emit(Object obj, le.c cVar) {
        p0 p0Var = this.f980x;
        Object J = gf.f0.J(p0Var.f982b, new c(p0Var, obj, null, 1), cVar);
        he.y yVar = he.y.f6101a;
        me.a aVar = me.a.f8833x;
        if (J != aVar) {
            J = yVar;
        }
        if (J == aVar) {
            return J;
        }
        return yVar;
    }
}
