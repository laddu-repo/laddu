package d;

import a2.a2;
import android.os.Build;
import android.view.View;
import android.view.Window;
import t0.x1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class x extends w {
    @Override // d.v, android.support.v4.media.session.b
    public void s(p0 statusBarStyle, p0 navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        int i6;
        int i10;
        a8.d x1Var;
        kotlin.jvm.internal.k.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.k.e(navigationBarStyle, "navigationBarStyle");
        int i11 = navigationBarStyle.f3477c;
        kotlin.jvm.internal.k.e(window, "window");
        kotlin.jvm.internal.k.e(view, "view");
        boolean z12 = false;
        a8.b.m(window, false);
        if (statusBarStyle.f3477c == 0) {
            i6 = 0;
        } else if (z10) {
            i6 = statusBarStyle.f3476b;
        } else {
            i6 = statusBarStyle.f3475a;
        }
        window.setStatusBarColor(i6);
        if (i11 == 0) {
            i10 = 0;
        } else if (z11) {
            i10 = navigationBarStyle.f3476b;
        } else {
            i10 = navigationBarStyle.f3475a;
        }
        window.setNavigationBarColor(i10);
        window.setStatusBarContrastEnforced(false);
        if (i11 == 0) {
            z12 = true;
        }
        window.setNavigationBarContrastEnforced(z12);
        a2 a2Var = new a2(view);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 35) {
            x1Var = new t0.a2(window, a2Var);
        } else if (i12 >= 30) {
            x1Var = new t0.a2(window, a2Var);
        } else if (i12 >= 26) {
            x1Var = new x1(window, a2Var);
        } else if (i12 >= 23) {
            x1Var = new x1(window, a2Var);
        } else {
            x1Var = new x1(window, a2Var);
        }
        x1Var.j(!z10);
        x1Var.i(true ^ z11);
    }
}
