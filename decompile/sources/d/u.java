package d;

import a2.a2;
import android.os.Build;
import android.view.View;
import android.view.Window;
import t0.x1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends android.support.v4.media.session.b {
    @Override // android.support.v4.media.session.b
    public void s(p0 statusBarStyle, p0 navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        int i6;
        a8.d x1Var;
        kotlin.jvm.internal.k.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.k.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.k.e(window, "window");
        kotlin.jvm.internal.k.e(view, "view");
        a8.b.m(window, false);
        if (z10) {
            i6 = statusBarStyle.f3476b;
        } else {
            i6 = statusBarStyle.f3475a;
        }
        window.setStatusBarColor(i6);
        window.setNavigationBarColor(navigationBarStyle.f3476b);
        a2 a2Var = new a2(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            x1Var = new t0.a2(window, a2Var);
        } else if (i10 >= 30) {
            x1Var = new t0.a2(window, a2Var);
        } else if (i10 >= 26) {
            x1Var = new x1(window, a2Var);
        } else if (i10 >= 23) {
            x1Var = new x1(window, a2Var);
        } else {
            x1Var = new x1(window, a2Var);
        }
        x1Var.j(!z10);
    }
}
