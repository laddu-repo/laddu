package o4;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends t0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f9675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f9676e = new WeakHashMap();

    public a1(b1 b1Var) {
        this.f9675d = b1Var;
    }

    @Override // t0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f9676e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f11806a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // t0.b
    public final ka.c b(View view) {
        t0.b bVar = (t0.b) this.f9676e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // t0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f9676e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12609a;
        b1 b1Var = this.f9675d;
        RecyclerView recyclerView = b1Var.f9683d;
        RecyclerView recyclerView2 = b1Var.f9683d;
        boolean zO = recyclerView.O();
        View.AccessibilityDelegate accessibilityDelegate = this.f11806a;
        if (zO || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, cVar);
        t0.b bVar = (t0.b) this.f9676e.get(view);
        if (bVar != null) {
            bVar.d(view, cVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // t0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f9676e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // t0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f9676e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f11806a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // t0.b
    public final boolean g(View view, int i, Bundle bundle) {
        b1 b1Var = this.f9675d;
        RecyclerView recyclerView = b1Var.f9683d;
        RecyclerView recyclerView2 = b1Var.f9683d;
        if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        t0.b bVar = (t0.b) this.f9676e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        p0 p0Var = recyclerView2.getLayoutManager().f9764b.f1396x;
        return false;
    }

    @Override // t0.b
    public final void h(View view, int i) {
        t0.b bVar = (t0.b) this.f9676e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // t0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f9676e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
