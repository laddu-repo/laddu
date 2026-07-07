package d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 implements androidx.lifecycle.d0 {

    /* renamed from: y, reason: collision with root package name */
    public static final he.m f3428y = he.a.d(new a0(0));

    /* renamed from: x, reason: collision with root package name */
    public final q f3429x;

    public e0(q qVar) {
        this.f3429x = qVar;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(androidx.lifecycle.f0 f0Var, androidx.lifecycle.w wVar) {
        if (wVar == androidx.lifecycle.w.ON_DESTROY) {
            Object systemService = this.f3429x.getSystemService("input_method");
            kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            b0 b0Var = (b0) f3428y.getValue();
            Object b10 = b0Var.b(inputMethodManager);
            if (b10 != null) {
                synchronized (b10) {
                    View c10 = b0Var.c(inputMethodManager);
                    if (c10 == null) {
                        return;
                    }
                    if (c10.isAttachedToWindow()) {
                        return;
                    }
                    boolean a10 = b0Var.a(inputMethodManager);
                    if (a10) {
                        inputMethodManager.isActive();
                    }
                }
            }
        }
    }
}
