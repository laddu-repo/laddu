package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SettingItemBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3353a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3354b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3355c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f3356d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f3357e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3358f;

    /* renamed from: g, reason: collision with root package name */
    public final SwitchCompat f3359g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3360h;

    public SettingItemBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView2, SwitchCompat switchCompat, TextView textView3) {
        this.f3353a = constraintLayout;
        this.f3354b = textView;
        this.f3355c = imageView;
        this.f3356d = imageView2;
        this.f3357e = imageView3;
        this.f3358f = textView2;
        this.f3359g = switchCompat;
        this.f3360h = textView3;
    }

    public static SettingItemBinding bind(View view) {
        int i6 = R.id.badge;
        TextView textView = (TextView) f.N(view, R.id.badge);
        if (textView != null) {
            i6 = R.id.chevron;
            ImageView imageView = (ImageView) f.N(view, R.id.chevron);
            if (imageView != null) {
                i6 = R.id.end_view;
                if (((LinearLayout) f.N(view, R.id.end_view)) != null) {
                    i6 = R.id.external_icon;
                    ImageView imageView2 = (ImageView) f.N(view, R.id.external_icon);
                    if (imageView2 != null) {
                        i6 = R.id.icon;
                        ImageView imageView3 = (ImageView) f.N(view, R.id.icon);
                        if (imageView3 != null) {
                            i6 = R.id.icon_bg;
                            if (((FrameLayout) f.N(view, R.id.icon_bg)) != null) {
                                i6 = R.id.subtitle;
                                TextView textView2 = (TextView) f.N(view, R.id.subtitle);
                                if (textView2 != null) {
                                    i6 = R.id.switch_compat;
                                    SwitchCompat switchCompat = (SwitchCompat) f.N(view, R.id.switch_compat);
                                    if (switchCompat != null) {
                                        i6 = R.id.text_container;
                                        if (((LinearLayout) f.N(view, R.id.text_container)) != null) {
                                            i6 = R.id.title;
                                            TextView textView3 = (TextView) f.N(view, R.id.title);
                                            if (textView3 != null) {
                                                return new SettingItemBinding((ConstraintLayout) view, textView, imageView, imageView2, imageView3, textView2, switchCompat, textView3);
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

    public static SettingItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SettingItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.setting_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
