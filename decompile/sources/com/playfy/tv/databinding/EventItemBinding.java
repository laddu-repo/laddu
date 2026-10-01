package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.playfy.tv.R;
import com.playfy.tv.ui.CornerLabelTextview;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EventItemBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f3275a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3276b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3277c;

    /* renamed from: d, reason: collision with root package name */
    public final CornerLabelTextview f3278d;

    /* renamed from: e, reason: collision with root package name */
    public final LottieAnimationView f3279e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3280f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f3281g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3282h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f3283i;
    public final TextView j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f3284k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f3285l;

    public EventItemBinding(MaterialCardView materialCardView, TextView textView, ImageView imageView, CornerLabelTextview cornerLabelTextview, LottieAnimationView lottieAnimationView, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f3275a = materialCardView;
        this.f3276b = textView;
        this.f3277c = imageView;
        this.f3278d = cornerLabelTextview;
        this.f3279e = lottieAnimationView;
        this.f3280f = textView2;
        this.f3281g = imageView2;
        this.f3282h = textView3;
        this.f3283i = imageView3;
        this.j = textView4;
        this.f3284k = textView5;
        this.f3285l = textView6;
    }

    public static EventItemBinding bind(View view) {
        int i6 = R.id.eventDateTime;
        TextView textView = (TextView) f.N(view, R.id.eventDateTime);
        if (textView != null) {
            i6 = R.id.event_logo;
            ImageView imageView = (ImageView) f.N(view, R.id.event_logo);
            if (imageView != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i6 = R.id.headerLayout;
                if (((ConstraintLayout) f.N(view, R.id.headerLayout)) != null) {
                    i6 = R.id.hotLabel;
                    CornerLabelTextview cornerLabelTextview = (CornerLabelTextview) f.N(view, R.id.hotLabel);
                    if (cornerLabelTextview != null) {
                        i6 = R.id.live_anim_view;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) f.N(view, R.id.live_anim_view);
                        if (lottieAnimationView != null) {
                            i6 = R.id.status_txt;
                            TextView textView2 = (TextView) f.N(view, R.id.status_txt);
                            if (textView2 != null) {
                                i6 = R.id.teamAFlag;
                                ImageView imageView2 = (ImageView) f.N(view, R.id.teamAFlag);
                                if (imageView2 != null) {
                                    i6 = R.id.teamAName;
                                    TextView textView3 = (TextView) f.N(view, R.id.teamAName);
                                    if (textView3 != null) {
                                        i6 = R.id.teamBFlag;
                                        ImageView imageView3 = (ImageView) f.N(view, R.id.teamBFlag);
                                        if (imageView3 != null) {
                                            i6 = R.id.teamBName;
                                            TextView textView4 = (TextView) f.N(view, R.id.teamBName);
                                            if (textView4 != null) {
                                                i6 = R.id.timerLayout;
                                                if (((LinearLayout) f.N(view, R.id.timerLayout)) != null) {
                                                    i6 = R.id.title_txt;
                                                    TextView textView5 = (TextView) f.N(view, R.id.title_txt);
                                                    if (textView5 != null) {
                                                        i6 = R.id.vsText;
                                                        TextView textView6 = (TextView) f.N(view, R.id.vsText);
                                                        if (textView6 != null) {
                                                            return new EventItemBinding(materialCardView, textView, imageView, cornerLabelTextview, lottieAnimationView, textView2, imageView2, textView3, imageView3, textView4, textView5, textView6);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static EventItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EventItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.event_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
