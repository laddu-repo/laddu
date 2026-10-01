package p;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k2 extends f2 implements g2 {

    /* renamed from: b0, reason: collision with root package name */
    public static final Method f10279b0;

    /* renamed from: a0, reason: collision with root package name */
    public k7.c f10280a0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f10279b0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.g2
    public final void d(o.l lVar, MenuItem menuItem) {
        k7.c cVar = this.f10280a0;
        if (cVar != null) {
            cVar.d(lVar, menuItem);
        }
    }

    @Override // p.g2
    public final void n(o.l lVar, o.n nVar) {
        k7.c cVar = this.f10280a0;
        if (cVar != null) {
            cVar.n(lVar, nVar);
        }
    }

    @Override // p.f2
    public final t1 q(Context context, boolean z10) {
        j2 j2Var = new j2(context, z10);
        j2Var.setHoverListener(this);
        return j2Var;
    }
}
