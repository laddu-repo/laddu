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
public final class ChannelItemBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final ShapeableImageView f3203b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3204c;

    public ChannelItemBinding(MaterialCardView materialCardView, ShapeableImageView shapeableImageView, TextView textView) {
        this.f3202a = materialCardView;
        this.f3203b = shapeableImageView;
        this.f3204c = textView;
    }

    public static ChannelItemBinding bind(View view) {
        int i6 = R.id.image;
        ShapeableImageView shapeableImageView = (ShapeableImageView) f.N(view, R.id.image);
        if (shapeableImageView != null) {
            i6 = R.id.title;
            TextView textView = (TextView) f.N(view, R.id.title);
            if (textView != null) {
                return new ChannelItemBinding((MaterialCardView) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static ChannelItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChannelItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.channel_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
