package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends c2 implements d2 {
    public static final Method Z;
    public k4 Y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // o.d2
    public final void h(n.l lVar, MenuItem menuItem) {
        k4 k4Var = this.Y;
        if (k4Var != null) {
            k4Var.h(lVar, menuItem);
        }
    }

    @Override // o.d2
    public final void n(n.l lVar, n.n nVar) {
        k4 k4Var = this.Y;
        if (k4Var != null) {
            k4Var.n(lVar, nVar);
        }
    }

    @Override // o.c2
    public final r1 q(Context context, boolean z2) {
        g2 g2Var = new g2(context, z2);
        g2Var.setHoverListener(this);
        return g2Var;
    }
}
