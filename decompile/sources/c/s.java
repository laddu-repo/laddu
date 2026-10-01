package c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import k8.k4;
import t0.p1;
import t0.q1;
import t0.s1;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends r {
    @Override // c.q, c.o, u1.c
    public void G(c0 c0Var, c0 c0Var2, Window window, View view, boolean z2, boolean z10) {
        de.i.e(c0Var, "statusBarStyle");
        de.i.e(c0Var2, "navigationBarStyle");
        de.i.e(window, "window");
        de.i.e(view, "view");
        qf.g.F(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new w0.d(viewGroup.getContext(), pd.i.W(new w0.a[]{new w0.a(2, 0), new w0.a(1, 0), new w0.a(4, 0), new w0.a(8, 0)})));
        }
        window.setNavigationBarContrastEnforced(true);
        k4 k4Var = new k4(view);
        int i = Build.VERSION.SDK_INT;
        t1 t1Var = i >= 35 ? new t0.t1(window, k4Var) : i >= 30 ? new s1(window, k4Var) : i >= 26 ? new q1(window, k4Var) : new p1(window, k4Var);
        t1Var.o(!z2);
        t1Var.n(!z10);
    }
}
