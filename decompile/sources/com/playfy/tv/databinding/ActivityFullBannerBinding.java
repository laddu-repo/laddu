package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ActivityFullBannerBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialButton f3142b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f3143c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f3144d;

    public ActivityFullBannerBinding(ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView2) {
        this.f3141a = imageView;
        this.f3142b = materialButton;
        this.f3143c = materialButton2;
        this.f3144d = imageView2;
    }

    public static ActivityFullBannerBinding bind(View view) {
        int i6 = R.id.bannerImage;
        ImageView imageView = (ImageView) f.N(view, R.id.bannerImage);
        if (imageView != null) {
            i6 = R.id.btnClose;
            MaterialButton materialButton = (MaterialButton) f.N(view, R.id.btnClose);
            if (materialButton != null) {
                i6 = R.id.btnSkip;
                MaterialButton materialButton2 = (MaterialButton) f.N(view, R.id.btnSkip);
                if (materialButton2 != null) {
                    i6 = R.id.logoPlaceholder;
                    ImageView imageView2 = (ImageView) f.N(view, R.id.logoPlaceholder);
                    if (imageView2 != null) {
                        return new ActivityFullBannerBinding(imageView, materialButton, materialButton2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static ActivityFullBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFullBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_full_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
