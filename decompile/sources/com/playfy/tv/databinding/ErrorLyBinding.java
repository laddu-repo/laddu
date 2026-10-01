package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ErrorLyBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3255a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3256b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3257c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f3258d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f3259e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3260f;

    /* renamed from: g, reason: collision with root package name */
    public final CircularProgressIndicator f3261g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f3262h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f3263i;

    public ErrorLyBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, LinearLayout linearLayout2, TextView textView2, TextView textView3, CircularProgressIndicator circularProgressIndicator, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f3255a = linearLayout;
        this.f3256b = textView;
        this.f3257c = imageView;
        this.f3258d = linearLayout2;
        this.f3259e = textView2;
        this.f3260f = textView3;
        this.f3261g = circularProgressIndicator;
        this.f3262h = linearLayout3;
        this.f3263i = linearLayout4;
    }

    public static ErrorLyBinding bind(View view) {
        int i6 = R.id.clear_data_btn;
        LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.clear_data_btn);
        if (linearLayout != null) {
            i6 = R.id.empty_error;
            TextView textView = (TextView) f.N(view, R.id.empty_error);
            if (textView != null) {
                i6 = R.id.error_image;
                ImageView imageView = (ImageView) f.N(view, R.id.error_image);
                if (imageView != null) {
                    i6 = R.id.error_ly_container;
                    LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.error_ly_container);
                    if (linearLayout2 != null) {
                        i6 = R.id.error_title;
                        TextView textView2 = (TextView) f.N(view, R.id.error_title);
                        if (textView2 != null) {
                            i6 = R.id.error_txt;
                            TextView textView3 = (TextView) f.N(view, R.id.error_txt);
                            if (textView3 != null) {
                                i6 = R.id.f15334pb;
                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) f.N(view, R.id.f15334pb);
                                if (circularProgressIndicator != null) {
                                    i6 = R.id.retry_btn;
                                    LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.retry_btn);
                                    if (linearLayout3 != null) {
                                        i6 = R.id.telegram_btn;
                                        LinearLayout linearLayout4 = (LinearLayout) f.N(view, R.id.telegram_btn);
                                        if (linearLayout4 != null) {
                                            return new ErrorLyBinding(linearLayout, textView, imageView, linearLayout2, textView2, textView3, circularProgressIndicator, linearLayout3, linearLayout4);
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

    public static ErrorLyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ErrorLyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.error_ly, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
