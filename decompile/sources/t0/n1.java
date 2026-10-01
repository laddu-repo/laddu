package t0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class n1 extends m1 {

    /* renamed from: n, reason: collision with root package name */
    public l0.c f12384n;

    public n1(w1 w1Var, WindowInsets windowInsets) {
        super(w1Var, windowInsets);
        this.f12384n = null;
    }

    @Override // t0.t1
    public w1 b() {
        return w1.h(null, this.f12378c.consumeStableInsets());
    }

    @Override // t0.t1
    public w1 c() {
        return w1.h(null, this.f12378c.consumeSystemWindowInsets());
    }

    @Override // t0.t1
    public final l0.c h() {
        if (this.f12384n == null) {
            WindowInsets windowInsets = this.f12378c;
            this.f12384n = l0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f12384n;
    }

    @Override // t0.t1
    public boolean m() {
        return this.f12378c.isConsumed();
    }

    @Override // t0.t1
    public void q(l0.c cVar) {
        this.f12384n = cVar;
    }
}
