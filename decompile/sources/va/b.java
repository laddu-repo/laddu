package va;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a8.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0.b f13500g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f0.b bVar, int i6) {
        super(1);
        this.f13499f = i6;
        this.f13500g = bVar;
    }

    @Override // a8.a
    public final int c(View view, int i6) {
        switch (this.f13499f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13500g;
                return c9.a.b(i6, sideSheetBehavior.f2720a.o(), sideSheetBehavior.f2720a.n());
            default:
                return view.getLeft();
        }
    }

    @Override // a8.a
    public final int d(View view, int i6) {
        switch (this.f13499f) {
            case 0:
                return view.getTop();
            default:
                return c9.a.b(i6, ((BottomSheetBehavior) this.f13500g).y(), o());
        }
    }

    @Override // a8.a
    public int m(View view) {
        switch (this.f13499f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13500g;
                return sideSheetBehavior.f2730l + sideSheetBehavior.f2733o;
            default:
                return super.m(view);
        }
    }

    @Override // a8.a
    public int o() {
        switch (this.f13499f) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f13500g;
                if (bottomSheetBehavior.I) {
                    return bottomSheetBehavior.V;
                }
                return bottomSheetBehavior.G;
            default:
                return super.o();
        }
    }

    @Override // a8.a
    public final void q(int i6) {
        switch (this.f13499f) {
            case 0:
                if (i6 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13500g;
                    if (sideSheetBehavior.f2726g) {
                        sideSheetBehavior.s(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i6 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f13500g;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.D(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // a8.a
    public final void r(View view, int i6, int i10) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f13499f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13500g;
                WeakReference weakReference = sideSheetBehavior.f2735q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2720a.D(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2738u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f2720a.d(i6);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw r4.a.i(it);
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f13500g).v(i10);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r0.E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.y()) < java.lang.Math.abs(r6.getTop() - r0.E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r0.D) < java.lang.Math.abs(r7 - r0.G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f2720a.t(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2720a.l()) < java.lang.Math.abs(r7 - r0.f2720a.m())) goto L73;
     */
    @Override // a8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va.b.s(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L27;
     */
    @Override // a8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f13499f
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            f0.b r0 = r4.f13500g
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f2612c0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f2608a0
            if (r1 != r6) goto L31
            java.lang.ref.WeakReference r6 = r0.X
            if (r6 == 0) goto L26
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L31
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L31
            goto L3f
        L31:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.W
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            f0.b r6 = r4.f13500g
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f2727h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r6 = r6.f2734p
            if (r6 == 0) goto L57
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L57
            r1 = 1
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: va.b.u(android.view.View, int):boolean");
    }
}
