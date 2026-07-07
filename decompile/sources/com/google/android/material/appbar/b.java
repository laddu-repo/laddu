package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends t0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2578f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f2578f = baseBehavior;
        this.f2576d = appBarLayout;
        this.f2577e = coordinatorLayout;
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        this.f12323a.onInitializeAccessibilityNodeInfo(view, cVar.f12745a);
        cVar.i(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f2576d;
        if (appBarLayout.getTotalScrollRange() != 0) {
            CoordinatorLayout coordinatorLayout = this.f2577e;
            AppBarLayout.BaseBehavior baseBehavior = this.f2578f;
            View x10 = AppBarLayout.BaseBehavior.x(baseBehavior, coordinatorLayout);
            if (x10 != null) {
                int childCount = appBarLayout.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    if (((v9.c) appBarLayout.getChildAt(i6).getLayoutParams()).f13480a != 0) {
                        if (baseBehavior.u() != (-appBarLayout.getTotalScrollRange())) {
                            cVar.b(u0.b.f12734f);
                            cVar.k(true);
                        }
                        if (baseBehavior.u() != 0) {
                            if (x10.canScrollVertically(-1)) {
                                if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                    cVar.b(u0.b.f12735g);
                                    cVar.k(true);
                                    return;
                                }
                                return;
                            }
                            cVar.b(u0.b.f12735g);
                            cVar.k(true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // t0.b
    public final boolean g(View view, int i6, Bundle bundle) {
        AppBarLayout appBarLayout = this.f2576d;
        if (i6 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i6 == 8192) {
            AppBarLayout.BaseBehavior baseBehavior = this.f2578f;
            if (baseBehavior.u() != 0) {
                CoordinatorLayout coordinatorLayout = this.f2577e;
                View x10 = AppBarLayout.BaseBehavior.x(baseBehavior, coordinatorLayout);
                if (x10.canScrollVertically(-1)) {
                    int i10 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        baseBehavior.A(coordinatorLayout, this.f2576d, x10, i10, new int[]{0, 0});
                        return true;
                    }
                } else {
                    appBarLayout.setExpanded(true);
                    return true;
                }
            }
            return false;
        }
        return super.g(view, i6, bundle);
    }
}
