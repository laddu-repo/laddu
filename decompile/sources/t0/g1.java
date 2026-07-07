package t0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class g1 extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f12354c;

    public g1() {
        this.f12354c = okhttp3.internal.platform.a.f();
    }

    @Override // t0.l1
    public w1 b() {
        WindowInsets build;
        a();
        build = this.f12354c.build();
        w1 h4 = w1.h(null, build);
        h4.f12417a.o(this.f12370b);
        return h4;
    }

    @Override // t0.l1
    public void d(l0.c cVar) {
        this.f12354c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // t0.l1
    public void e(l0.c cVar) {
        this.f12354c.setStableInsets(cVar.d());
    }

    @Override // t0.l1
    public void f(l0.c cVar) {
        this.f12354c.setSystemGestureInsets(cVar.d());
    }

    @Override // t0.l1
    public void g(l0.c cVar) {
        this.f12354c.setSystemWindowInsets(cVar.d());
    }

    @Override // t0.l1
    public void h(l0.c cVar) {
        this.f12354c.setTappableElementInsets(cVar.d());
    }

    public g1(w1 w1Var) {
        super(w1Var);
        WindowInsets.Builder f3;
        WindowInsets g10 = w1Var.g();
        if (g10 != null) {
            f3 = okhttp3.internal.platform.a.g(g10);
        } else {
            f3 = okhttp3.internal.platform.a.f();
        }
        this.f12354c = f3;
    }
}
