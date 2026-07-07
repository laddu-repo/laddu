package com.playfy.tv.databinding;

import a8.f;
import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ItemCategoryOptionBinding implements a {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.playfy.tv.databinding.ItemCategoryOptionBinding] */
    public static ItemCategoryOptionBinding bind(View view) {
        if (((TextView) f.N(view, R.id.text1)) != null) {
            return new Object();
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text1)));
    }

    public static ItemCategoryOptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCategoryOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(com.playfy.tv.R.layout.item_category_option, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
