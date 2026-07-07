package w4;

import a2.a2;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j1 extends t0.b {

    /* renamed from: d, reason: collision with root package name */
    public final k1 f13921d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f13922e = new WeakHashMap();

    public j1(k1 k1Var) {
        this.f13921d = k1Var;
    }

    @Override // t0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f13922e.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return this.f12323a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // t0.b
    public final a2 b(View view) {
        t0.b bVar = (t0.b) this.f13922e.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    @Override // t0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f13922e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12745a;
        k1 k1Var = this.f13921d;
        RecyclerView recyclerView = k1Var.f13932d;
        RecyclerView recyclerView2 = k1Var.f13932d;
        boolean L = recyclerView.L();
        View.AccessibilityDelegate accessibilityDelegate = this.f12323a;
        if (!L && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().W(view, cVar);
            t0.b bVar = (t0.b) this.f13922e.get(view);
            if (bVar != null) {
                bVar.d(view, cVar);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // t0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f13922e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // t0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f13922e.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.f12323a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // t0.b
    public final boolean g(View view, int i6, Bundle bundle) {
        k1 k1Var = this.f13921d;
        RecyclerView recyclerView = k1Var.f13932d;
        RecyclerView recyclerView2 = k1Var.f13932d;
        if (!recyclerView.L() && recyclerView2.getLayoutManager() != null) {
            t0.b bVar = (t0.b) this.f13922e.get(view);
            if (bVar != null) {
                if (bVar.g(view, i6, bundle)) {
                    return true;
                }
            } else if (super.g(view, i6, bundle)) {
                return true;
            }
            y0 y0Var = recyclerView2.getLayoutManager().f14005b.f1148z;
            return false;
        }
        return super.g(view, i6, bundle);
    }

    @Override // t0.b
    public final void h(View view, int i6) {
        t0.b bVar = (t0.b) this.f13922e.get(view);
        if (bVar != null) {
            bVar.h(view, i6);
        } else {
            super.h(view, i6);
        }
    }

    @Override // t0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        t0.b bVar = (t0.b) this.f13922e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
