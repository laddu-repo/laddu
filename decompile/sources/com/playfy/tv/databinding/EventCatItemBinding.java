package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EventCatItemBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3264a;

    /* renamed from: b, reason: collision with root package name */
    public final ShapeableImageView f3265b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3266c;

    public EventCatItemBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, TextView textView) {
        this.f3264a = linearLayout;
        this.f3265b = shapeableImageView;
        this.f3266c = textView;
    }

    public static EventCatItemBinding bind(View view) {
        int i6 = R.id.cat_image;
        ShapeableImageView shapeableImageView = (ShapeableImageView) f.N(view, R.id.cat_image);
        if (shapeableImageView != null) {
            i6 = R.id.cat_title;
            TextView textView = (TextView) f.N(view, R.id.cat_title);
            if (textView != null) {
                return new EventCatItemBinding((LinearLayout) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static EventCatItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EventCatItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.event_cat_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
