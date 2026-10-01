package v6;

import androidx.lifecycle.e0;
import androidx.lifecycle.x;
import androidx.lifecycle.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends y {

    /* renamed from: b, reason: collision with root package name */
    public static final h f13360b = new y();

    /* renamed from: c, reason: collision with root package name */
    public static final g f13361c = new Object();

    @Override // androidx.lifecycle.y
    public final void a(e0 e0Var) {
        if (e0Var instanceof androidx.lifecycle.l) {
            androidx.lifecycle.l lVar = (androidx.lifecycle.l) e0Var;
            g gVar = f13361c;
            lVar.f(gVar);
            lVar.S(gVar);
            lVar.d(gVar);
            return;
        }
        throw new IllegalArgumentException((e0Var + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.y
    public final x b() {
        return x.B;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.y
    public final void c(e0 e0Var) {
    }
}
