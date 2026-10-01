package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CatItemBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f3199a;

    /* renamed from: b, reason: collision with root package name */
    public final ShapeableImageView f3200b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3201c;

    public CatItemBinding(MaterialCardView materialCardView, ShapeableImageView shapeableImageView, TextView textView) {
        this.f3199a = materialCardView;
        this.f3200b = shapeableImageView;
        this.f3201c = textView;
    }

    public static CatItemBinding bind(View view) {
        int i6 = R.id.category_image;
        ShapeableImageView shapeableImageView = (ShapeableImageView) f.N(view, R.id.category_image);
        if (shapeableImageView != null) {
            i6 = R.id.category_title;
            TextView textView = (TextView) f.N(view, R.id.category_title);
            if (textView != null) {
                return new CatItemBinding((MaterialCardView) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static CatItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CatItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.cat_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
