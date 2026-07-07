package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9837a;

    /* renamed from: b, reason: collision with root package name */
    public final l f9838b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9839c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9840d;

    /* renamed from: e, reason: collision with root package name */
    public View f9841e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9843g;

    /* renamed from: h, reason: collision with root package name */
    public w f9844h;

    /* renamed from: i, reason: collision with root package name */
    public t f9845i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f9842f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final u f9846k = new u(this, 0);

    public v(Context context, l lVar, View view, boolean z10, int i6, int i10) {
        this.f9837a = context;
        this.f9838b = lVar;
        this.f9841e = view;
        this.f9839c = z10;
        this.f9840d = i6;
    }

    public final t a() {
        t c0Var;
        if (this.f9845i == null) {
            Context context = this.f9837a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c0Var = new f(context, this.f9841e, this.f9840d, this.f9839c);
            } else {
                c0Var = new c0(this.f9837a, this.f9838b, this.f9841e, this.f9840d, this.f9839c);
            }
            c0Var.l(this.f9838b);
            c0Var.r(this.f9846k);
            c0Var.n(this.f9841e);
            c0Var.j(this.f9844h);
            c0Var.o(this.f9843g);
            c0Var.p(this.f9842f);
            this.f9845i = c0Var;
        }
        return this.f9845i;
    }

    public final boolean b() {
        t tVar = this.f9845i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f9845i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i6, int i10, boolean z10, boolean z11) {
        t a10 = a();
        a10.s(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f9842f, this.f9841e.getLayoutDirection()) & 7) == 5) {
                i6 -= this.f9841e.getWidth();
            }
            a10.q(i6);
            a10.t(i10);
            int i11 = (int) ((this.f9837a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f9834x = new Rect(i6 - i11, i10 - i11, i6 + i11, i10 + i11);
        }
        a10.b();
    }
}
