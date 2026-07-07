package w4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k1 extends t0.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f13932d;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f13933e;

    public k1(RecyclerView recyclerView) {
        this.f13932d = recyclerView;
        j1 j1Var = this.f13933e;
        if (j1Var != null) {
            this.f13933e = j1Var;
        } else {
            this.f13933e = new j1(this);
        }
    }

    @Override // t0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f13932d.L()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(accessibilityEvent);
            }
        }
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        this.f12323a.onInitializeAccessibilityNodeInfo(view, cVar.f12745a);
        RecyclerView recyclerView = this.f13932d;
        if (!recyclerView.L() && recyclerView.getLayoutManager() != null) {
            s0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f14005b;
            layoutManager.V(recyclerView2.f1148z, recyclerView2.D0, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[ADDED_TO_REGION] */
    @Override // t0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r6 = super.g(r6, r7, r8)
            r8 = 1
            if (r6 == 0) goto L8
            return r8
        L8:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f13932d
            boolean r0 = r6.L()
            r1 = 0
            if (r0 != 0) goto Lac
            w4.s0 r0 = r6.getLayoutManager()
            if (r0 == 0) goto Lac
            w4.s0 r6 = r6.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r6.f14005b
            w4.y0 r0 = r0.f1148z
            int r0 = r6.f14017o
            int r2 = r6.f14016n
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r4 = r6.f14005b
            android.graphics.Matrix r4 = r4.getMatrix()
            boolean r4 = r4.isIdentity()
            if (r4 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r4 = r6.f14005b
            boolean r4 = r4.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L44
            int r0 = r3.height()
            int r2 = r3.width()
        L44:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r7 == r3) goto L79
            r3 = 8192(0x2000, float:1.148E-41)
            if (r7 == r3) goto L4f
            r7 = 0
        L4d:
            r0 = 0
            goto La1
        L4f:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f14005b
            r3 = -1
            boolean r7 = r7.canScrollVertically(r3)
            if (r7 == 0) goto L64
            int r7 = r6.G()
            int r0 = r0 - r7
            int r7 = r6.D()
            int r0 = r0 - r7
            int r7 = -r0
            goto L65
        L64:
            r7 = 0
        L65:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f14005b
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L4d
            int r0 = r6.E()
            int r2 = r2 - r0
            int r0 = r6.F()
            int r2 = r2 - r0
            int r0 = -r2
            goto La1
        L79:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f14005b
            boolean r7 = r7.canScrollVertically(r8)
            if (r7 == 0) goto L8d
            int r7 = r6.G()
            int r0 = r0 - r7
            int r7 = r6.D()
            int r0 = r0 - r7
            r7 = r0
            goto L8e
        L8d:
            r7 = 0
        L8e:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f14005b
            boolean r0 = r0.canScrollHorizontally(r8)
            if (r0 == 0) goto L4d
            int r0 = r6.E()
            int r2 = r2 - r0
            int r0 = r6.F()
            int r0 = r2 - r0
        La1:
            if (r7 != 0) goto La6
            if (r0 != 0) goto La6
            goto Lac
        La6:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f14005b
            r6.h0(r8, r0, r7)
            return r8
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.k1.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
