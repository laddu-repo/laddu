package of;

import gf.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends y {

    /* renamed from: y, reason: collision with root package name */
    public static final l f10190y = new y();

    @Override // gf.y
    public final void f0(le.h hVar, Runnable runnable) {
        e eVar = e.f10176z;
        eVar.f10178y.f(runnable, k.f10189h, false);
    }

    @Override // gf.y
    public final void g0(le.h hVar, Runnable runnable) {
        e eVar = e.f10176z;
        eVar.f10178y.f(runnable, k.f10189h, true);
    }

    @Override // gf.y
    public final y i0(int i6) {
        mf.a.a(i6);
        if (i6 >= k.f10185d) {
            return this;
        }
        return super.i0(i6);
    }
}
