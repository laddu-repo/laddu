package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i2 extends y {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f5683y = 0;

    static {
        new y();
    }

    @Override // gf.y
    public final void f0(le.h hVar, Runnable runnable) {
        m2 m2Var = (m2) hVar.get(m2.f5689y);
        if (m2Var != null) {
            m2Var.f5690x = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // gf.y
    public final y i0(int i6) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // gf.y
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
