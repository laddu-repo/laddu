package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.playfy.tv.R;
import com.playfy.tv.ui.CornerLabelTextview;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EventItemBannerBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f3267a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f3268b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3269c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f3270d;

    /* renamed from: e, reason: collision with root package name */
    public final CornerLabelTextview f3271e;

    /* renamed from: f, reason: collision with root package name */
    public final LottieAnimationView f3272f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3273g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3274h;

    public EventItemBannerBinding(MaterialCardView materialCardView, ImageView imageView, TextView textView, ImageView imageView2, CornerLabelTextview cornerLabelTextview, LottieAnimationView lottieAnimationView, TextView textView2, TextView textView3) {
        this.f3267a = materialCardView;
        this.f3268b = imageView;
        this.f3269c = textView;
        this.f3270d = imageView2;
        this.f3271e = cornerLabelTextview;
        this.f3272f = lottieAnimationView;
        this.f3273g = textView2;
        this.f3274h = textView3;
    }

    public static EventItemBannerBinding bind(View view) {
        int i6 = R.id.banner_img;
        ImageView imageView = (ImageView) f.N(view, R.id.banner_img);
        if (imageView != null) {
            i6 = R.id.eventDateTime;
            TextView textView = (TextView) f.N(view, R.id.eventDateTime);
            if (textView != null) {
                i6 = R.id.event_logo;
                ImageView imageView2 = (ImageView) f.N(view, R.id.event_logo);
                if (imageView2 != null) {
                    MaterialCardView materialCardView = (MaterialCardView) view;
                    i6 = R.id.hotLabel;
                    CornerLabelTextview cornerLabelTextview = (CornerLabelTextview) f.N(view, R.id.hotLabel);
                    if (cornerLabelTextview != null) {
                        i6 = R.id.live_anim_view;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) f.N(view, R.id.live_anim_view);
                        if (lottieAnimationView != null) {
                            i6 = R.id.status_txt;
                            TextView textView2 = (TextView) f.N(view, R.id.status_txt);
                            if (textView2 != null) {
                                i6 = R.id.timerLayout;
                                if (((LinearLayout) f.N(view, R.id.timerLayout)) != null) {
                                    i6 = R.id.title_txt;
                                    TextView textView3 = (TextView) f.N(view, R.id.title_txt);
                                    if (textView3 != null) {
                                        return new EventItemBannerBinding(materialCardView, imageView, textView, imageView2, cornerLabelTextview, lottieAnimationView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static EventItemBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EventItemBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.event_item_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
