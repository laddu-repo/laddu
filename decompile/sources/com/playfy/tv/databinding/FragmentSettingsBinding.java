package com.playfy.tv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FragmentSettingsBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f3306a;

    public FragmentSettingsBinding(RecyclerView recyclerView) {
        this.f3306a = recyclerView;
    }

    public static FragmentSettingsBinding bind(View view) {
        if (view != null) {
            return new FragmentSettingsBinding((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
