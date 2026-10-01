package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.chip.ChipGroup;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FragmentEventsBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final SwipeRefreshLayout f3290a;

    /* renamed from: b, reason: collision with root package name */
    public final ChipGroup f3291b;

    /* renamed from: c, reason: collision with root package name */
    public final ErrorLyBinding f3292c;

    /* renamed from: d, reason: collision with root package name */
    public final MessageLyBinding f3293d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f3294e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f3295f;

    public FragmentEventsBinding(SwipeRefreshLayout swipeRefreshLayout, ChipGroup chipGroup, ErrorLyBinding errorLyBinding, MessageLyBinding messageLyBinding, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f3290a = swipeRefreshLayout;
        this.f3291b = chipGroup;
        this.f3292c = errorLyBinding;
        this.f3293d = messageLyBinding;
        this.f3294e = recyclerView;
        this.f3295f = recyclerView2;
    }

    public static FragmentEventsBinding bind(View view) {
        int i6 = R.id.chip_group;
        ChipGroup chipGroup = (ChipGroup) f.N(view, R.id.chip_group);
        if (chipGroup != null) {
            i6 = R.id.error_ly;
            View N = f.N(view, R.id.error_ly);
            if (N != null) {
                ErrorLyBinding bind = ErrorLyBinding.bind(N);
                i6 = R.id.message_txt;
                View N2 = f.N(view, R.id.message_txt);
                if (N2 != null) {
                    MessageLyBinding bind2 = MessageLyBinding.bind(N2);
                    i6 = R.id.recycler_view_events;
                    RecyclerView recyclerView = (RecyclerView) f.N(view, R.id.recycler_view_events);
                    if (recyclerView != null) {
                        i6 = R.id.recycler_view_events_cats;
                        RecyclerView recyclerView2 = (RecyclerView) f.N(view, R.id.recycler_view_events_cats);
                        if (recyclerView2 != null) {
                            return new FragmentEventsBinding((SwipeRefreshLayout) view, chipGroup, bind, bind2, recyclerView, recyclerView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static FragmentEventsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEventsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_events, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
