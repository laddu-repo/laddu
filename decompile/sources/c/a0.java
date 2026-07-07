package c;

import ac.g0;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher$addCallback$lifecycleObserver$1;
import androidx.fragment.app.i0;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od.j f1625b = new od.j(new g0(2, this));

    public a0(Runnable runnable) {
        this.f1624a = runnable;
    }

    public final void a(i0 i0Var, androidx.lifecycle.s sVar) {
        de.i.e(i0Var, "onBackPressedCallback");
        androidx.lifecycle.u uVarF = sVar.f();
        if (uVarF.f1238c == androidx.lifecycle.n.f1217v) {
            return;
        }
        x xVar = new x(i0Var, new y(i0Var, sVar));
        i0Var.f1027a.add(xVar);
        xVar.b(false);
        sb.p pVar = b().f1679c;
        pVar.getClass();
        if (((LinkedHashSet) pVar.f11744y).add(xVar)) {
            h4.e eVar = (h4.e) pVar.f11743x;
            eVar.getClass();
            if (xVar.f1674c != null) {
                throw new IllegalArgumentException(("Handler '" + xVar + "' is already registered with a dispatcher").toString());
            }
            eVar.f6132e.addFirst(xVar);
            xVar.f1674c = pVar;
            eVar.b();
        }
        OnBackPressedDispatcher$addCallback$lifecycleObserver$1 onBackPressedDispatcher$addCallback$lifecycleObserver$1 = new OnBackPressedDispatcher$addCallback$lifecycleObserver$1(xVar, this, uVarF);
        uVarF.a(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
        i0Var.f1029c.add(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
    }

    public final z b() {
        return (z) this.f1625b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().f1679c.d(new h4.h(onBackInvokedDispatcher, 0), 1);
        b().f1679c.d(new h4.h(onBackInvokedDispatcher, 1000000), 0);
    }
}
