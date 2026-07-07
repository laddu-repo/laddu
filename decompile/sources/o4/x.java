package o4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f9897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f9898b = new c1(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f9899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f9900d;

    public static int b(View view, androidx.emoji2.text.h hVar) {
        return ((hVar.e(view) / 2) + hVar.g(view)) - ((hVar.n() / 2) + hVar.m());
    }

    public static View c(j0 j0Var, androidx.emoji2.text.h hVar) {
        int iV = j0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iN = (hVar.n() / 2) + hVar.m();
        int i = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = j0Var.u(i10);
            int iAbs = Math.abs(((hVar.e(viewU) / 2) + hVar.g(viewU)) - iN);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final int[] a(j0 j0Var, View view) {
        int[] iArr = new int[2];
        if (j0Var.d()) {
            iArr[0] = b(view, d(j0Var));
        } else {
            iArr[0] = 0;
        }
        if (j0Var.e()) {
            iArr[1] = b(view, e(j0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.h d(j0 j0Var) {
        v vVar = this.f9900d;
        if (vVar == null || ((j0) vVar.f906b) != j0Var) {
            this.f9900d = new v(j0Var, 0);
        }
        return this.f9900d;
    }

    public final androidx.emoji2.text.h e(j0 j0Var) {
        v vVar = this.f9899c;
        if (vVar == null || ((j0) vVar.f906b) != j0Var) {
            this.f9899c = new v(j0Var, 1);
        }
        return this.f9899c;
    }

    public final void f() {
        j0 layoutManager;
        RecyclerView recyclerView = this.f9897a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewC = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i = iArrA[0];
        if (i == 0 && iArrA[1] == 0) {
            return;
        }
        this.f9897a.i0(i, iArrA[1], false);
    }
}
