package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ItemBlockedAppBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3324a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f3325b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3326c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3327d;

    public ItemBlockedAppBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f3324a = linearLayout;
        this.f3325b = imageView;
        this.f3326c = textView;
        this.f3327d = textView2;
    }

    public static ItemBlockedAppBinding bind(View view) {
        int i6 = R.id.app_logo;
        ImageView imageView = (ImageView) f.N(view, R.id.app_logo);
        if (imageView != null) {
            i6 = R.id.app_name;
            TextView textView = (TextView) f.N(view, R.id.app_name);
            if (textView != null) {
                i6 = R.id.status_badge;
                TextView textView2 = (TextView) f.N(view, R.id.status_badge);
                if (textView2 != null) {
                    return new ItemBlockedAppBinding((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static ItemBlockedAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBlockedAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_blocked_app, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
