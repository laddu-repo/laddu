package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FragmentPlaylistsBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final FloatingActionButton f3296a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3297b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f3298c;

    public FragmentPlaylistsBinding(FloatingActionButton floatingActionButton, TextView textView, RecyclerView recyclerView) {
        this.f3296a = floatingActionButton;
        this.f3297b = textView;
        this.f3298c = recyclerView;
    }

    public static FragmentPlaylistsBinding bind(View view) {
        int i6 = R.id.add;
        FloatingActionButton floatingActionButton = (FloatingActionButton) f.N(view, R.id.add);
        if (floatingActionButton != null) {
            i6 = R.id.empty_error;
            TextView textView = (TextView) f.N(view, R.id.empty_error);
            if (textView != null) {
                i6 = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) f.N(view, R.id.recycler_view);
                if (recyclerView != null) {
                    return new FragmentPlaylistsBinding(floatingActionButton, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static FragmentPlaylistsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlaylistsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_playlists, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
