package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.tabs.TabLayout;
import com.playfy.tv.R;
import com.playfy.tv.ui.HeightWrappingViewPager;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TrackSelectionDialogBinding implements a {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.playfy.tv.databinding.TrackSelectionDialogBinding] */
    public static TrackSelectionDialogBinding bind(View view) {
        int i6 = R.id.track_selection_dialog_cancel_button;
        if (((Button) f.N(view, R.id.track_selection_dialog_cancel_button)) != null) {
            i6 = R.id.track_selection_dialog_ok_button;
            if (((Button) f.N(view, R.id.track_selection_dialog_ok_button)) != null) {
                i6 = R.id.track_selection_dialog_tab_layout;
                if (((TabLayout) f.N(view, R.id.track_selection_dialog_tab_layout)) != null) {
                    i6 = R.id.track_selection_dialog_view_pager;
                    if (((HeightWrappingViewPager) f.N(view, R.id.track_selection_dialog_view_pager)) != null) {
                        return new Object();
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static TrackSelectionDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TrackSelectionDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.track_selection_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
