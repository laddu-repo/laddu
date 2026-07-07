package com.google.android.material.behavior;

import a8.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import f0.b;
import f0.e;
import h8.c;
import i0.f;
import j1.u0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public a f2590a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f2591b;

    /* renamed from: c, reason: collision with root package name */
    public x9.a f2592c;

    /* renamed from: e, reason: collision with root package name */
    public int f2594e;

    /* renamed from: f, reason: collision with root package name */
    public int f2595f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f2596g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f2597h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f2599k;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2593d = new LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f2598i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // f0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        int i10;
        if (this.f2591b == null) {
            this.f2591b = (AccessibilityManager) f.e(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f2591b;
        if (accessibilityManager != null && this.f2592c == null) {
            x9.a aVar = new x9.a(this, view, 1);
            this.f2592c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new u0(this, 4));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = ((e) view.getLayoutParams()).f4613c;
        if (i11 != 80 && i11 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i11, i6);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            s(i10);
        } else {
            s(1);
        }
        this.f2598i = this.f2590a.k(view, marginLayoutParams);
        this.f2594e = j5.t(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2595f = j5.t(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2596g = j5.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f12956d);
        this.f2597h = j5.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f12955c);
        return false;
    }

    @Override // f0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11, int[] iArr) {
        if (i6 > 0) {
            if (this.j != 1) {
                AccessibilityManager accessibilityManager = this.f2591b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f2599k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.f2593d.iterator();
                    if (!it.hasNext()) {
                        this.f2599k = this.f2590a.n(view, this.f2598i).setInterpolator(this.f2597h).setDuration(this.f2595f).setListener(new bb.b(this, 8));
                        return;
                    }
                    throw r4.a.i(it);
                }
                return;
            }
            return;
        }
        if (i6 < 0) {
            t(view);
        }
    }

    @Override // f0.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10) {
        if (i6 == 2) {
            return true;
        }
        return false;
    }

    public final void s(int i6) {
        a aVar = this.f2590a;
        if (aVar != null && aVar.l() == i6) {
            return;
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    this.f2590a = new x9.b(1);
                    return;
                }
                throw new IllegalArgumentException(c.j(i6, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
            this.f2590a = new x9.b(0);
            return;
        }
        this.f2590a = new x9.b(2);
    }

    public final void t(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2599k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f2593d.iterator();
        if (!it.hasNext()) {
            this.f2590a.getClass();
            this.f2599k = this.f2590a.n(view, 0).setInterpolator(this.f2596g).setDuration(this.f2594e).setListener(new bb.b(this, 8));
            return;
        }
        throw r4.a.i(it);
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
