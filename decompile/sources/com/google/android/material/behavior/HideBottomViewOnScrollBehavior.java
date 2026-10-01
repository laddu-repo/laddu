package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import f0.b;
import i0.f;
import j1.u0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x9.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f2581b;

    /* renamed from: c, reason: collision with root package name */
    public int f2582c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2583d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f2584e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f2586g;

    /* renamed from: h, reason: collision with root package name */
    public a f2587h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f2589k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2580a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f2585f = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2588i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // f0.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        this.f2585f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2581b = j5.t(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2582c = j5.t(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2583d = j5.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f12956d);
        this.f2584e = j5.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f12955c);
        if (this.f2586g == null) {
            this.f2586g = (AccessibilityManager) f.e(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f2586g;
        if (accessibilityManager != null && this.f2587h == null) {
            a aVar = new a(this, view, 0);
            this.f2587h = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new u0(this, 3));
            return false;
        }
        return false;
    }

    @Override // f0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i6 > 0) {
            if (this.j != 1) {
                if (!this.f2588i || (accessibilityManager = this.f2586g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f2589k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.f2580a.iterator();
                    if (!it.hasNext()) {
                        this.f2589k = view.animate().translationY(this.f2585f).setInterpolator(this.f2584e).setDuration(this.f2582c).setListener(new bb.b(this, 7));
                        return;
                    }
                    throw r4.a.i(it);
                }
                return;
            }
            return;
        }
        if (i6 < 0) {
            s(view);
        }
    }

    @Override // f0.b
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10) {
        if (i6 == 2) {
            return true;
        }
        return false;
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2589k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f2580a.iterator();
        if (!it.hasNext()) {
            this.f2589k = view.animate().translationY(0).setInterpolator(this.f2583d).setDuration(this.f2581b).setListener(new bb.b(this, 7));
            return;
        }
        throw r4.a.i(it);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
