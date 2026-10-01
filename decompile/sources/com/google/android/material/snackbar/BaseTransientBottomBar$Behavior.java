package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import o5.e0;
import v9.b;
import wa.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e0 f2740h;

    /* JADX WARN: Type inference failed for: r0v0, types: [o5.e0, java.lang.Object] */
    public BaseTransientBottomBar$Behavior() {
        ?? obj = new Object();
        this.f2604e = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f), 1.0f);
        this.f2605f = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f), 1.0f);
        this.f2603d = 0;
        this.f2740h = obj;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, f0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2740h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (b.f13478y == null) {
                    b.f13478y = new b();
                }
                synchronized (b.f13478y.f13479x) {
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (b.f13478y == null) {
                b.f13478y = new b();
            }
            b.f13478y.k();
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.f2740h.getClass();
        return view instanceof c;
    }
}
