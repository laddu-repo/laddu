package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import k8.k4;
import t0.p1;
import t0.q1;
import t0.s1;
import t0.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends u1.c {
    @Override // u1.c
    public void G(c0 c0Var, c0 c0Var2, Window window, View view, boolean z2, boolean z10) {
        de.i.e(c0Var, "statusBarStyle");
        de.i.e(c0Var2, "navigationBarStyle");
        de.i.e(window, "window");
        de.i.e(view, "view");
        qf.g.F(window, false);
        window.setStatusBarColor(z2 ? c0Var.f1631b : c0Var.f1630a);
        window.setNavigationBarColor(c0Var2.f1631b);
        k4 k4Var = new k4(view);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new t1(window, k4Var) : i >= 30 ? new s1(window, k4Var) : i >= 26 ? new q1(window, k4Var) : new p1(window, k4Var)).o(!z2);
    }
}
