package com.google.android.material.behavior;

import a1.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import f0.b;
import t0.q0;
import x9.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public f f2600a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2601b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2602c;

    /* renamed from: d, reason: collision with root package name */
    public int f2603d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f2604e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: f, reason: collision with root package name */
    public float f2605f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final c f2606g = new c(this);

    @Override // f0.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f2601b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f2601b = false;
            }
        } else {
            z10 = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2601b = z10;
        }
        if (z10) {
            if (this.f2600a == null) {
                this.f2600a = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f2606g);
            }
            if (!this.f2602c && this.f2600a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // f0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            q0.o(view, 1048576);
            q0.j(view, 0);
            if (s(view)) {
                q0.p(view, u0.b.j, new v9.b(this));
            }
        }
        return false;
    }

    @Override // f0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f2600a != null) {
            if (!this.f2602c || motionEvent.getActionMasked() != 3) {
                this.f2600a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
