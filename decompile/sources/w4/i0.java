package w4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f13892a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f13893b = new l1(this);

    /* renamed from: c, reason: collision with root package name */
    public g0 f13894c;

    /* renamed from: d, reason: collision with root package name */
    public g0 f13895d;

    public static int b(View view, e1.g gVar) {
        return ((gVar.e(view) / 2) + gVar.g(view)) - ((gVar.n() / 2) + gVar.m());
    }

    public static View c(s0 s0Var, e1.g gVar) {
        int v10 = s0Var.v();
        View view = null;
        if (v10 == 0) {
            return null;
        }
        int n10 = (gVar.n() / 2) + gVar.m();
        int i6 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < v10; i10++) {
            View u3 = s0Var.u(i10);
            int abs = Math.abs(((gVar.e(u3) / 2) + gVar.g(u3)) - n10);
            if (abs < i6) {
                view = u3;
                i6 = abs;
            }
        }
        return view;
    }

    public final int[] a(s0 s0Var, View view) {
        int[] iArr = new int[2];
        if (s0Var.d()) {
            iArr[0] = b(view, d(s0Var));
        } else {
            iArr[0] = 0;
        }
        if (s0Var.e()) {
            iArr[1] = b(view, e(s0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final e1.g d(s0 s0Var) {
        g0 g0Var = this.f13895d;
        if (g0Var == null || ((s0) g0Var.f4158b) != s0Var) {
            this.f13895d = new g0(s0Var, 0);
        }
        return this.f13895d;
    }

    public final e1.g e(s0 s0Var) {
        g0 g0Var = this.f13894c;
        if (g0Var == null || ((s0) g0Var.f4158b) != s0Var) {
            this.f13894c = new g0(s0Var, 1);
        }
        return this.f13894c;
    }

    public final void f() {
        s0 layoutManager;
        View view;
        RecyclerView recyclerView = this.f13892a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a10 = a(layoutManager, view);
                int i6 = a10[0];
                if (i6 == 0 && a10[1] == 0) {
                    return;
                }
                this.f13892a.h0(false, i6, a10[1]);
            }
        }
    }
}
