package n;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.w0;
import o.h2;
import o.r1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int P = g.g.abc_popup_menu_item_layout;
    public final int A;
    public final int B;
    public final h2 C;
    public PopupWindow.OnDismissListener F;
    public View G;
    public View H;
    public w I;
    public ViewTreeObserver J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f8867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f8868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f8869y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f8870z;
    public final d D = new d(1, this);
    public final w0 E = new w0(2, this);
    public int N = 0;

    public c0(Context context, l lVar, View view, int i, boolean z2) {
        this.f8867w = context;
        this.f8868x = lVar;
        this.f8870z = z2;
        this.f8869y = new i(lVar, LayoutInflater.from(context), z2, P);
        this.B = i;
        Resources resources = context.getResources();
        this.A = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.abc_config_prefDialogWidth));
        this.G = view;
        this.C = new h2(context, null, i, 0);
        lVar.b(this, context);
    }

    @Override // n.b0
    public final boolean a() {
        return !this.K && this.C.U.isShowing();
    }

    @Override // n.x
    public final void b() {
        this.L = false;
        i iVar = this.f8869y;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // n.b0
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.K || (view = this.G) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.H = view;
        h2 h2Var = this.C;
        o.x xVar = h2Var.U;
        o.x xVar2 = h2Var.U;
        xVar.setOnDismissListener(this);
        h2Var.K = this;
        h2Var.T = true;
        xVar2.setFocusable(true);
        View view2 = this.H;
        boolean z2 = this.J == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.J = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.D);
        }
        view2.addOnAttachStateChangeListener(this.E);
        h2Var.J = view2;
        h2Var.G = this.N;
        boolean z10 = this.L;
        Context context = this.f8867w;
        i iVar = this.f8869y;
        if (!z10) {
            this.M = t.m(iVar, context, this.A);
            this.L = true;
        }
        h2Var.r(this.M);
        xVar2.setInputMethodMode(2);
        Rect rect = this.f8952v;
        h2Var.S = rect != null ? new Rect(rect) : null;
        h2Var.c();
        r1 r1Var = h2Var.f9129x;
        r1Var.setOnKeyListener(this);
        if (this.O) {
            l lVar = this.f8868x;
            if (lVar.f8904m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(g.g.abc_popup_menu_header_item_layout, (ViewGroup) r1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f8904m);
                }
                frameLayout.setEnabled(false);
                r1Var.addHeaderView(frameLayout, null, false);
            }
        }
        h2Var.p(iVar);
        h2Var.c();
    }

    @Override // n.x
    public final void d(l lVar, boolean z2) {
        if (lVar != this.f8868x) {
            return;
        }
        dismiss();
        w wVar = this.I;
        if (wVar != null) {
            wVar.d(lVar, z2);
        }
    }

    @Override // n.b0
    public final void dismiss() {
        if (a()) {
            this.C.dismiss();
        }
    }

    @Override // n.b0
    public final r1 e() {
        return this.C.f9129x;
    }

    @Override // n.x
    public final boolean h(d0 d0Var) {
        boolean z2;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f8867w, d0Var, this.H, this.f8870z, this.B, 0);
            w wVar = this.I;
            vVar.f8961h = wVar;
            t tVar = vVar.i;
            if (tVar != null) {
                tVar.j(wVar);
            }
            int size = d0Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i++;
            }
            vVar.f8960g = z2;
            t tVar2 = vVar.i;
            if (tVar2 != null) {
                tVar2.o(z2);
            }
            vVar.f8962j = this.F;
            this.F = null;
            this.f8868x.c(false);
            h2 h2Var = this.C;
            int width = h2Var.A;
            int iM = h2Var.m();
            if ((Gravity.getAbsoluteGravity(this.N, this.G.getLayoutDirection()) & 7) == 5) {
                width += this.G.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f8959e != null) {
                    vVar.d(width, iM, true, true);
                }
            }
            w wVar2 = this.I;
            if (wVar2 != null) {
                wVar2.k(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override // n.x
    public final boolean i() {
        return false;
    }

    @Override // n.x
    public final void j(w wVar) {
        this.I = wVar;
    }

    @Override // n.t
    public final void n(View view) {
        this.G = view;
    }

    @Override // n.t
    public final void o(boolean z2) {
        this.f8869y.f8890x = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.K = true;
        this.f8868x.c(true);
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.J = this.H.getViewTreeObserver();
            }
            this.J.removeGlobalOnLayoutListener(this.D);
            this.J = null;
        }
        this.H.removeOnAttachStateChangeListener(this.E);
        PopupWindow.OnDismissListener onDismissListener = this.F;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // n.t
    public final void p(int i) {
        this.N = i;
    }

    @Override // n.t
    public final void q(int i) {
        this.C.A = i;
    }

    @Override // n.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.F = onDismissListener;
    }

    @Override // n.t
    public final void s(boolean z2) {
        this.O = z2;
    }

    @Override // n.t
    public final void t(int i) {
        this.C.i(i);
    }

    @Override // n.t
    public final void l(l lVar) {
    }
}
