package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 implements g1 {

    /* renamed from: x, reason: collision with root package name */
    public final ve.l f5674x;

    public f1(ve.l lVar) {
        this.f5674x = lVar;
    }

    @Override // gf.g1
    public final void a(Throwable th) {
        this.f5674x.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f5674x.getClass().getSimpleName() + '@' + f0.p(this) + ']';
    }
}
