package o;

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
import com.playfy.tv.R;
import j1.u0;
import p.f2;
import p.k2;
import p.t1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final i A;
    public final boolean B;
    public final int C;
    public final int D;
    public final k2 E;
    public PopupWindow.OnDismissListener H;
    public View I;
    public View J;
    public w K;
    public ViewTreeObserver L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean Q;

    /* renamed from: y, reason: collision with root package name */
    public final Context f9757y;

    /* renamed from: z, reason: collision with root package name */
    public final l f9758z;
    public final d F = new d(this, 1);
    public final u0 G = new u0(this, 2);
    public int P = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [p.k2, p.f2] */
    public c0(Context context, l lVar, View view, int i6, boolean z10) {
        this.f9757y = context;
        this.f9758z = lVar;
        this.B = z10;
        this.A = new i(lVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.D = i6;
        Resources resources = context.getResources();
        this.C = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.I = view;
        this.E = new f2(context, null, i6, 0);
        lVar.b(this, context);
    }

    @Override // o.b0
    public final boolean a() {
        if (!this.M && this.E.W.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // o.b0
    public final void b() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.M && (view = this.I) != null) {
            this.J = view;
            k2 k2Var = this.E;
            p.a0 a0Var = k2Var.W;
            p.a0 a0Var2 = k2Var.W;
            a0Var.setOnDismissListener(this);
            k2Var.M = this;
            k2Var.V = true;
            a0Var2.setFocusable(true);
            View view2 = this.J;
            if (this.L == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.L = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.F);
            }
            view2.addOnAttachStateChangeListener(this.G);
            k2Var.L = view2;
            k2Var.I = this.P;
            boolean z11 = this.N;
            Context context = this.f9757y;
            i iVar = this.A;
            if (!z11) {
                this.O = t.m(iVar, context, this.C);
                this.N = true;
            }
            k2Var.r(this.O);
            a0Var2.setInputMethodMode(2);
            Rect rect2 = this.f9834x;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.U = rect;
            k2Var.b();
            t1 t1Var = k2Var.f10240z;
            t1Var.setOnKeyListener(this);
            if (this.Q) {
                l lVar = this.f9758z;
                if (lVar.f9787m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) t1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(lVar.f9787m);
                    }
                    frameLayout.setEnabled(false);
                    t1Var.addHeaderView(frameLayout, null, false);
                }
            }
            k2Var.p(iVar);
            k2Var.b();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.b0
    public final void dismiss() {
        if (a()) {
            this.E.dismiss();
        }
    }

    @Override // o.x
    public final void e(l lVar, boolean z10) {
        if (lVar == this.f9758z) {
            dismiss();
            w wVar = this.K;
            if (wVar != null) {
                wVar.e(lVar, z10);
            }
        }
    }

    @Override // o.x
    public final boolean f(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f9757y, d0Var, this.J, this.B, this.D, 0);
            w wVar = this.K;
            vVar.f9844h = wVar;
            t tVar = vVar.f9845i;
            if (tVar != null) {
                tVar.j(wVar);
            }
            int size = d0Var.f9781f.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    MenuItem item = d0Var.getItem(i6);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i6++;
                } else {
                    z10 = false;
                    break;
                }
            }
            vVar.f9843g = z10;
            t tVar2 = vVar.f9845i;
            if (tVar2 != null) {
                tVar2.o(z10);
            }
            vVar.j = this.H;
            this.H = null;
            this.f9758z.c(false);
            k2 k2Var = this.E;
            int i10 = k2Var.C;
            int o10 = k2Var.o();
            if ((Gravity.getAbsoluteGravity(this.P, this.I.getLayoutDirection()) & 7) == 5) {
                i10 += this.I.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f9841e != null) {
                    vVar.d(i10, o10, true, true);
                }
            }
            w wVar2 = this.K;
            if (wVar2 != null) {
                wVar2.v(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override // o.x
    public final void g() {
        this.N = false;
        i iVar = this.A;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // o.b0
    public final t1 h() {
        return this.E.f10240z;
    }

    @Override // o.x
    public final void j(w wVar) {
        this.K = wVar;
    }

    @Override // o.t
    public final void n(View view) {
        this.I = view;
    }

    @Override // o.t
    public final void o(boolean z10) {
        this.A.f9774z = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.M = true;
        this.f9758z.c(true);
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.L = this.J.getViewTreeObserver();
            }
            this.L.removeGlobalOnLayoutListener(this.F);
            this.L = null;
        }
        this.J.removeOnAttachStateChangeListener(this.G);
        PopupWindow.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i6 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // o.t
    public final void p(int i6) {
        this.P = i6;
    }

    @Override // o.t
    public final void q(int i6) {
        this.E.C = i6;
    }

    @Override // o.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    @Override // o.t
    public final void s(boolean z10) {
        this.Q = z10;
    }

    @Override // o.t
    public final void t(int i6) {
        this.E.k(i6);
    }

    @Override // o.t
    public final void l(l lVar) {
    }
}
