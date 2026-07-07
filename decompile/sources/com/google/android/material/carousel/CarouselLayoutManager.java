package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import ca.a;
import ca.b;
import ca.c;
import ca.d;
import ca.e;
import ca.g;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import w4.d1;
import w4.e1;
import w4.s0;
import w4.t0;
import w4.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends s0 implements d1 {

    /* renamed from: p, reason: collision with root package name */
    public final g f2645p;

    /* renamed from: q, reason: collision with root package name */
    public e f2646q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f2647r;

    public CarouselLayoutManager() {
        g gVar = new g();
        new c();
        this.f2647r = new a(this, 0);
        this.f2645p = gVar;
        n0();
        F0(0);
    }

    public final float C0(float f3, float f10) {
        if (E0()) {
            return f3 - f10;
        }
        return f3 + f10;
    }

    public final boolean D0() {
        if (this.f2646q.f2000b == 0) {
            return true;
        }
        return false;
    }

    public final boolean E0() {
        if (D0() && C() == 1) {
            return true;
        }
        return false;
    }

    public final void F0(int i6) {
        d dVar;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(h8.c.i(i6, "invalid orientation:"));
        }
        c(null);
        e eVar = this.f2646q;
        if (eVar != null && i6 == eVar.f2000b) {
            return;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                dVar = new d(this, 0);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            dVar = new d(this, 1);
        }
        this.f2646q = dVar;
        n0();
    }

    @Override // w4.s0
    public final boolean L() {
        return true;
    }

    @Override // w4.s0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        g gVar = this.f2645p;
        float f3 = gVar.f2001a;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        gVar.f2001a = f3;
        float f10 = gVar.f2002b;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        gVar.f2002b = f10;
        n0();
        recyclerView.addOnLayoutChangeListener(this.f2647r);
    }

    @Override // w4.s0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2647r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003b, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0045, code lost:
    
        if (E0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0049, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0052, code lost:
    
        if (E0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // w4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r4, int r5, w4.y0 r6, w4.e1 r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L97
        L8:
            ca.e r6 = r3.f2646q
            int r6 = r6.f2000b
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L47
            r2 = 2
            if (r5 == r2) goto L3d
            r2 = 17
            if (r5 == r2) goto L4c
            r2 = 33
            if (r5 == r2) goto L49
            r2 = 66
            if (r5 == r2) goto L3f
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L55
        L3b:
            if (r6 != r1) goto L38
        L3d:
            r5 = 1
            goto L55
        L3f:
            if (r6 != 0) goto L38
            boolean r5 = r3.E0()
            if (r5 == 0) goto L3d
        L47:
            r5 = -1
            goto L55
        L49:
            if (r6 != r1) goto L38
            goto L47
        L4c:
            if (r6 != 0) goto L38
            boolean r5 = r3.E0()
            if (r5 == 0) goto L47
            goto L3d
        L55:
            if (r5 != r7) goto L58
            goto L97
        L58:
            r6 = 0
            if (r5 != r0) goto L8c
            int r4 = w4.s0.H(r4)
            if (r4 != 0) goto L62
            goto L97
        L62:
            android.view.View r4 = r3.u(r6)
            int r4 = w4.s0.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7b
            int r5 = r3.B()
            if (r4 < r5) goto L74
            goto L7b
        L74:
            ca.e r4 = r3.f2646q
            r4.f()
            r4 = 0
            throw r4
        L7b:
            boolean r4 = r3.E0()
            if (r4 == 0) goto L87
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L87:
            android.view.View r4 = r3.u(r6)
            return r4
        L8c:
            int r4 = w4.s0.H(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L99
        L97:
            r4 = 0
            return r4
        L99:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = w4.s0.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb7
            int r5 = r3.B()
            if (r4 < r5) goto Lb0
            goto Lb7
        Lb0:
            ca.e r4 = r3.f2646q
            r4.f()
            r4 = 0
            throw r4
        Lb7:
            boolean r4 = r3.E0()
            if (r4 == 0) goto Lbe
            goto Lc4
        Lbe:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc4:
            android.view.View r4 = r3.u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, w4.y0, w4.e1):android.view.View");
    }

    @Override // w4.s0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(s0.H(u(0)));
            accessibilityEvent.setToIndex(s0.H(u(v() - 1)));
        }
    }

    @Override // w4.s0
    public final void Y(int i6, int i10) {
        B();
    }

    @Override // w4.s0
    public final void Z() {
        B();
    }

    @Override // w4.d1
    public final PointF a(int i6) {
        return null;
    }

    @Override // w4.s0
    public final void b0(int i6, int i10) {
        B();
    }

    @Override // w4.s0
    public final boolean d() {
        return D0();
    }

    @Override // w4.s0
    public final void d0(y0 y0Var, e1 e1Var) {
        int i6;
        if (e1Var.b() > 0) {
            if (D0()) {
                i6 = this.f14016n;
            } else {
                i6 = this.f14017o;
            }
            if (i6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                E0();
                y0Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        i0(y0Var);
    }

    @Override // w4.s0
    public final boolean e() {
        return !D0();
    }

    @Override // w4.s0
    public final void e0(e1 e1Var) {
        if (v() == 0) {
            return;
        }
        s0.H(u(0));
    }

    @Override // w4.s0
    public final int j(e1 e1Var) {
        v();
        return 0;
    }

    @Override // w4.s0
    public final int k(e1 e1Var) {
        return 0;
    }

    @Override // w4.s0
    public final int l(e1 e1Var) {
        return 0;
    }

    @Override // w4.s0
    public final int m(e1 e1Var) {
        v();
        return 0;
    }

    @Override // w4.s0
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }

    @Override // w4.s0
    public final int n(e1 e1Var) {
        return 0;
    }

    @Override // w4.s0
    public final int o(e1 e1Var) {
        return 0;
    }

    @Override // w4.s0
    public final int o0(int i6, y0 y0Var, e1 e1Var) {
        if (!D0() || v() == 0 || i6 == 0) {
            return 0;
        }
        y0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // w4.s0
    public final int q0(int i6, y0 y0Var, e1 e1Var) {
        if (!e() || v() == 0 || i6 == 0) {
            return 0;
        }
        y0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // w4.s0
    public final t0 r() {
        return new t0(-2, -2);
    }

    @Override // w4.s0
    public final void y(Rect rect, View view) {
        super.y(rect, view);
        rect.centerY();
        if (D0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // w4.s0
    public final void z0(RecyclerView recyclerView, int i6) {
        b bVar = new b(this, recyclerView.getContext());
        bVar.f13823a = i6;
        A0(bVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        new c();
        this.f2647r = new a(this, 0);
        this.f2645p = new g();
        n0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f12678f);
            obtainStyledAttributes.getInt(0, 0);
            n0();
            F0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // w4.s0
    public final void p0(int i6) {
    }
}
