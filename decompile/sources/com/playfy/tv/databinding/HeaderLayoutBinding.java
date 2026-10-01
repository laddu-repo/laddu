package com.playfy.tv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HeaderLayoutBinding implements a {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.playfy.tv.databinding.HeaderLayoutBinding] */
    public static HeaderLayoutBinding bind(View view) {
        if (view != null) {
            return new Object();
        }
        throw new NullPointerException("rootView");
    }

    public static HeaderLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HeaderLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.header_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
