package o4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends t0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f9683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f9684e;

    public b1(RecyclerView recyclerView) {
        this.f9683d = recyclerView;
        a1 a1Var = this.f9684e;
        if (a1Var != null) {
            this.f9684e = a1Var;
        } else {
            this.f9684e = new a1(this);
        }
    }

    @Override // t0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f9683d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        this.f11806a.onInitializeAccessibilityNodeInfo(view, cVar.f12609a);
        RecyclerView recyclerView = this.f9683d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        j0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f9764b;
        layoutManager.V(recyclerView2.f1396x, recyclerView2.B0, cVar);
    }

    @Override // t0.b
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f9683d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().j0(i, bundle);
    }
}
