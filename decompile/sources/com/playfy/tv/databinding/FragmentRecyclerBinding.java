package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.divider.MaterialDivider;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FragmentRecyclerBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final SwipeRefreshLayout f3299a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f3300b;

    /* renamed from: c, reason: collision with root package name */
    public final ErrorLyBinding f3301c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f3302d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f3303e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f3304f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialDivider f3305g;

    public FragmentRecyclerBinding(SwipeRefreshLayout swipeRefreshLayout, ImageButton imageButton, ErrorLyBinding errorLyBinding, RecyclerView recyclerView, RecyclerView recyclerView2, LinearLayout linearLayout, MaterialDivider materialDivider) {
        this.f3299a = swipeRefreshLayout;
        this.f3300b = imageButton;
        this.f3301c = errorLyBinding;
        this.f3302d = recyclerView;
        this.f3303e = recyclerView2;
        this.f3304f = linearLayout;
        this.f3305g = materialDivider;
    }

    public static FragmentRecyclerBinding bind(View view) {
        int i6 = R.id.chose_cat;
        ImageButton imageButton = (ImageButton) f.N(view, R.id.chose_cat);
        if (imageButton != null) {
            i6 = R.id.error_ly;
            View N = f.N(view, R.id.error_ly);
            if (N != null) {
                ErrorLyBinding bind = ErrorLyBinding.bind(N);
                i6 = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) f.N(view, R.id.recycler_view);
                if (recyclerView != null) {
                    i6 = R.id.tab_ly;
                    RecyclerView recyclerView2 = (RecyclerView) f.N(view, R.id.tab_ly);
                    if (recyclerView2 != null) {
                        i6 = R.id.tabs_container;
                        LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.tabs_container);
                        if (linearLayout != null) {
                            i6 = R.id.tabs_divider;
                            MaterialDivider materialDivider = (MaterialDivider) f.N(view, R.id.tabs_divider);
                            if (materialDivider != null) {
                                return new FragmentRecyclerBinding((SwipeRefreshLayout) view, imageButton, bind, recyclerView, recyclerView2, linearLayout, materialDivider);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static FragmentRecyclerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecyclerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_recycler, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
