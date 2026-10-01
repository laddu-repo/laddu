package com.google.android.material.search;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: g, reason: collision with root package name */
    public boolean f2719g;

    public SearchBar$ScrollingViewBehavior() {
        this.f2719g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, f0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.d(coordinatorLayout, view, view2);
        if (!this.f2719g && (view2 instanceof AppBarLayout)) {
            this.f2719g = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider(null);
                return false;
            }
            appBarLayout.setTargetElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2719g = false;
    }
}
