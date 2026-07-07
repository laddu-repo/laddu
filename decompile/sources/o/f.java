package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.playfy.tv.R;
import j1.u0;
import java.util.ArrayList;
import p.h2;
import p.k2;
import p.t1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final int A;
    public final boolean B;
    public final Handler C;
    public View K;
    public View L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean S;
    public w T;
    public ViewTreeObserver U;
    public PopupWindow.OnDismissListener V;
    public boolean W;

    /* renamed from: y, reason: collision with root package name */
    public final Context f9765y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9766z;
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final d F = new d(this, 0);
    public final u0 G = new u0(this, 1);
    public final k7.c H = new k7.c(this, 20);
    public int I = 0;
    public int J = 0;
    public boolean R = false;

    public f(Context context, View view, int i6, boolean z10) {
        this.f9765y = context;
        this.K = view;
        this.A = i6;
        this.B = z10;
        this.M = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f9766z = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.C = new Handler();
    }

    @Override // o.b0
    public final boolean a() {
        ArrayList arrayList = this.E;
        if (arrayList.size() <= 0 || !((e) arrayList.get(0)).f9762a.W.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // o.b0
    public final void b() {
        if (!a()) {
            ArrayList arrayList = this.D;
            int size = arrayList.size();
            boolean z10 = false;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                u((l) obj);
            }
            arrayList.clear();
            View view = this.K;
            this.L = view;
            if (view != null) {
                if (this.U == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.U = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.F);
                }
                this.L.addOnAttachStateChangeListener(this.G);
            }
        }
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.b0
    public final void dismiss() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i6 = size - 1; i6 >= 0; i6--) {
                e eVar = eVarArr[i6];
                if (eVar.f9762a.W.isShowing()) {
                    eVar.f9762a.dismiss();
                }
            }
        }
    }

    @Override // o.x
    public final void e(l lVar, boolean z10) {
        int i6;
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((e) arrayList.get(i10)).f9763b) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            int i11 = i10 + 1;
            if (i11 < arrayList.size()) {
                ((e) arrayList.get(i11)).f9763b.c(false);
            }
            e eVar = (e) arrayList.remove(i10);
            l lVar2 = eVar.f9763b;
            k2 k2Var = eVar.f9762a;
            p.a0 a0Var = k2Var.W;
            lVar2.r(this);
            if (this.W) {
                if (Build.VERSION.SDK_INT >= 23) {
                    h2.b(a0Var, null);
                }
                a0Var.setAnimationStyle(0);
            }
            k2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.M = ((e) arrayList.get(size2 - 1)).f9764c;
            } else {
                if (this.K.getLayoutDirection() == 1) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
                this.M = i6;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.T;
                if (wVar != null) {
                    wVar.e(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.U;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.U.removeGlobalOnLayoutListener(this.F);
                    }
                    this.U = null;
                }
                this.L.removeOnAttachStateChangeListener(this.G);
                this.V.onDismiss();
                return;
            }
            if (z10) {
                ((e) arrayList.get(0)).f9763b.c(false);
            }
        }
    }

    @Override // o.x
    public final boolean f(d0 d0Var) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            e eVar = (e) obj;
            if (d0Var == eVar.f9763b) {
                eVar.f9762a.f10240z.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.T;
        if (wVar != null) {
            wVar.v(d0Var);
        }
        return true;
    }

    @Override // o.x
    public final void g() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ListAdapter adapter = ((e) obj).f9762a.f10240z.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.b0
    public final t1 h() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f9762a.f10240z;
    }

    @Override // o.x
    public final void j(w wVar) {
        this.T = wVar;
    }

    @Override // o.t
    public final void l(l lVar) {
        lVar.b(this, this.f9765y);
        if (a()) {
            u(lVar);
        } else {
            this.D.add(lVar);
        }
    }

    @Override // o.t
    public final void n(View view) {
        if (this.K != view) {
            this.K = view;
            this.J = Gravity.getAbsoluteGravity(this.I, view.getLayoutDirection());
        }
    }

    @Override // o.t
    public final void o(boolean z10) {
        this.R = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                eVar = (e) arrayList.get(i6);
                if (!eVar.f9762a.W.isShowing()) {
                    break;
                } else {
                    i6++;
                }
            } else {
                eVar = null;
                break;
            }
        }
        if (eVar != null) {
            eVar.f9763b.c(false);
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
        if (this.I != i6) {
            this.I = i6;
            this.J = Gravity.getAbsoluteGravity(i6, this.K.getLayoutDirection());
        }
    }

    @Override // o.t
    public final void q(int i6) {
        this.N = true;
        this.P = i6;
    }

    @Override // o.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }

    @Override // o.t
    public final void s(boolean z10) {
        this.S = z10;
    }

    @Override // o.t
    public final void t(int i6) {
        this.O = true;
        this.Q = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0166, code lost:
    
        if (((r2.getWidth() + r10[0]) + r5) > r9.right) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0168, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016b, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0172, code lost:
    
        if ((r10[0] - r5) < 0) goto L72;
     */
    /* JADX WARN: Type inference failed for: r8v3, types: [p.k2, p.f2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(o.l r20) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.u(o.l):void");
    }
}
