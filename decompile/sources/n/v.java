package n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f8956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f8959e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f8961h;
    public t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8962j;
    public int f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f8963k = new u(0, this);

    public v(Context context, l lVar, View view, boolean z2, int i, int i10) {
        this.f8955a = context;
        this.f8956b = lVar;
        this.f8959e = view;
        this.f8957c = z2;
        this.f8958d = i;
    }

    public final t a() {
        t c0Var;
        if (this.i == null) {
            Context context = this.f8955a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(g.d.abc_cascading_menus_min_smallest_width)) {
                c0Var = new f(context, this.f8959e, this.f8958d, this.f8957c);
            } else {
                c0Var = new c0(this.f8955a, this.f8956b, this.f8959e, this.f8958d, this.f8957c);
            }
            c0Var.l(this.f8956b);
            c0Var.r(this.f8963k);
            c0Var.n(this.f8959e);
            c0Var.j(this.f8961h);
            c0Var.o(this.f8960g);
            c0Var.p(this.f);
            this.i = c0Var;
        }
        return this.i;
    }

    public final boolean b() {
        t tVar = this.i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8962j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i10, boolean z2, boolean z10) {
        t tVarA = a();
        tVarA.s(z10);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f, this.f8959e.getLayoutDirection()) & 7) == 5) {
                i -= this.f8959e.getWidth();
            }
            tVarA.q(i);
            tVarA.t(i10);
            int i11 = (int) ((this.f8955a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f8952v = new Rect(i - i11, i10 - i11, i + i11, i10 + i11);
        }
        tVarA.c();
    }
}
