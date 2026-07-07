package com.playfy.tv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InlineBannerLyBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3307a;

    public InlineBannerLyBinding(LinearLayout linearLayout) {
        this.f3307a = linearLayout;
    }

    public static InlineBannerLyBinding bind(View view) {
        if (view != null) {
            return new InlineBannerLyBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static InlineBannerLyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static InlineBannerLyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.inline_banner_ly, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
