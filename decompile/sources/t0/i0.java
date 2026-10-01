package t0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i0 {
    public static w1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        w1 h4 = w1.h(null, rootWindowInsets);
        t1 t1Var = h4.f12417a;
        t1Var.p(h4);
        t1Var.d(view.getRootView());
        return h4;
    }

    public static void b(View view, int i6, int i10) {
        view.setScrollIndicators(i6, i10);
    }
}
