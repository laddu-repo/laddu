package of;

import gf.z0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h extends z0 {

    /* renamed from: y, reason: collision with root package name */
    public c f10178y;

    @Override // gf.y
    public final void f0(le.h hVar, Runnable runnable) {
        c.l(this.f10178y, runnable, 6);
    }

    @Override // gf.y
    public final void g0(le.h hVar, Runnable runnable) {
        c.l(this.f10178y, runnable, 2);
    }

    @Override // gf.z0
    public final Executor j0() {
        return this.f10178y;
    }
}
