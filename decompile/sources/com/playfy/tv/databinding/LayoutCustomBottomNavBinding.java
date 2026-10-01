package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LayoutCustomBottomNavBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3328a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f3329b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3330c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f3331d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f3332e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3333f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3334g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3335h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3336i;
    public final FrameLayout j;

    /* renamed from: k, reason: collision with root package name */
    public final View f3337k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f3338l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f3339m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout f3340n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f3341o;

    public LayoutCustomBottomNavBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout2, View view, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f3328a = frameLayout;
        this.f3329b = imageView;
        this.f3330c = imageView2;
        this.f3331d = imageView3;
        this.f3332e = imageView4;
        this.f3333f = textView;
        this.f3334g = textView2;
        this.f3335h = textView3;
        this.f3336i = textView4;
        this.j = frameLayout2;
        this.f3337k = view;
        this.f3338l = linearLayout;
        this.f3339m = linearLayout2;
        this.f3340n = linearLayout3;
        this.f3341o = linearLayout4;
    }

    public static LayoutCustomBottomNavBinding bind(View view) {
        int i6 = R.id.badge_home;
        if (((TextView) f.N(view, R.id.badge_home)) != null) {
            i6 = R.id.bottom_nav_container;
            if (((LinearLayout) f.N(view, R.id.bottom_nav_container)) != null) {
                i6 = R.id.icon_cats;
                ImageView imageView = (ImageView) f.N(view, R.id.icon_cats);
                if (imageView != null) {
                    i6 = R.id.icon_high;
                    ImageView imageView2 = (ImageView) f.N(view, R.id.icon_high);
                    if (imageView2 != null) {
                        i6 = R.id.icon_home;
                        ImageView imageView3 = (ImageView) f.N(view, R.id.icon_home);
                        if (imageView3 != null) {
                            i6 = R.id.icon_settings;
                            ImageView imageView4 = (ImageView) f.N(view, R.id.icon_settings);
                            if (imageView4 != null) {
                                i6 = R.id.label_cats;
                                TextView textView = (TextView) f.N(view, R.id.label_cats);
                                if (textView != null) {
                                    i6 = R.id.label_high;
                                    TextView textView2 = (TextView) f.N(view, R.id.label_high);
                                    if (textView2 != null) {
                                        i6 = R.id.label_home;
                                        TextView textView3 = (TextView) f.N(view, R.id.label_home);
                                        if (textView3 != null) {
                                            i6 = R.id.label_settings;
                                            TextView textView4 = (TextView) f.N(view, R.id.label_settings);
                                            if (textView4 != null) {
                                                FrameLayout frameLayout = (FrameLayout) view;
                                                i6 = R.id.selectionIndicator;
                                                View N = f.N(view, R.id.selectionIndicator);
                                                if (N != null) {
                                                    i6 = R.id.tab_cats;
                                                    LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.tab_cats);
                                                    if (linearLayout != null) {
                                                        i6 = R.id.tab_high;
                                                        LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.tab_high);
                                                        if (linearLayout2 != null) {
                                                            i6 = R.id.tab_home;
                                                            LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.tab_home);
                                                            if (linearLayout3 != null) {
                                                                i6 = R.id.tab_settings;
                                                                LinearLayout linearLayout4 = (LinearLayout) f.N(view, R.id.tab_settings);
                                                                if (linearLayout4 != null) {
                                                                    return new LayoutCustomBottomNavBinding(frameLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, frameLayout, N, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static LayoutCustomBottomNavBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutCustomBottomNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_custom_bottom_nav, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
