package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.playfy.tv.R;
import com.playfy.tv.ui.OverlayInsetsLayout;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ActivityMainBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutCustomBottomNavBinding f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f3146b;

    /* renamed from: c, reason: collision with root package name */
    public final FragmentContainerView f3147c;

    /* renamed from: d, reason: collision with root package name */
    public final OverlayInsetsLayout f3148d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialToolbar f3149e;

    /* renamed from: f, reason: collision with root package name */
    public final AppBarLayout f3150f;

    /* renamed from: g, reason: collision with root package name */
    public final TvTopLyBinding f3151g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f3152h;

    public ActivityMainBinding(LayoutCustomBottomNavBinding layoutCustomBottomNavBinding, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, OverlayInsetsLayout overlayInsetsLayout, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, TvTopLyBinding tvTopLyBinding, FrameLayout frameLayout2) {
        this.f3145a = layoutCustomBottomNavBinding;
        this.f3146b = frameLayout;
        this.f3147c = fragmentContainerView;
        this.f3148d = overlayInsetsLayout;
        this.f3149e = materialToolbar;
        this.f3150f = appBarLayout;
        this.f3151g = tvTopLyBinding;
        this.f3152h = frameLayout2;
    }

    public static ActivityMainBinding bind(View view) {
        int i6 = R.id.custom_bottom_nav;
        View N = f.N(view, R.id.custom_bottom_nav);
        if (N != null) {
            LayoutCustomBottomNavBinding bind = LayoutCustomBottomNavBinding.bind(N);
            FrameLayout frameLayout = (FrameLayout) view;
            i6 = R.id.nav_host_fragment_activity_main;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) f.N(view, R.id.nav_host_fragment_activity_main);
            if (fragmentContainerView != null) {
                i6 = R.id.overly_inset_ly;
                OverlayInsetsLayout overlayInsetsLayout = (OverlayInsetsLayout) f.N(view, R.id.overly_inset_ly);
                if (overlayInsetsLayout != null) {
                    i6 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) f.N(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        i6 = R.id.toolbar_container;
                        AppBarLayout appBarLayout = (AppBarLayout) f.N(view, R.id.toolbar_container);
                        if (appBarLayout != null) {
                            i6 = R.id.tv_top;
                            View N2 = f.N(view, R.id.tv_top);
                            if (N2 != null) {
                                TvTopLyBinding bind2 = TvTopLyBinding.bind(N2);
                                i6 = R.id.tv_top_container;
                                FrameLayout frameLayout2 = (FrameLayout) f.N(view, R.id.tv_top_container);
                                if (frameLayout2 != null) {
                                    return new ActivityMainBinding(bind, frameLayout, fragmentContainerView, overlayInsetsLayout, materialToolbar, appBarLayout, bind2, frameLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
