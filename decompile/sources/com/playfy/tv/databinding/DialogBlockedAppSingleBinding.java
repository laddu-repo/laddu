package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DialogBlockedAppSingleBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollView f3205a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f3206b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3207c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3208d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f3209e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f3210f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f3211g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f3212h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3213i;
    public final TextView j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f3214k;

    public DialogBlockedAppSingleBinding(ScrollView scrollView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView4, TextView textView5, TextView textView6) {
        this.f3205a = scrollView;
        this.f3206b = imageView;
        this.f3207c = textView;
        this.f3208d = textView2;
        this.f3209e = textView3;
        this.f3210f = imageView2;
        this.f3211g = linearLayout;
        this.f3212h = linearLayout2;
        this.f3213i = textView4;
        this.j = textView5;
        this.f3214k = textView6;
    }

    public static DialogBlockedAppSingleBinding bind(View view) {
        int i6 = R.id.app_logo;
        ImageView imageView = (ImageView) f.N(view, R.id.app_logo);
        if (imageView != null) {
            i6 = R.id.app_name;
            TextView textView = (TextView) f.N(view, R.id.app_name);
            if (textView != null) {
                i6 = R.id.app_package;
                TextView textView2 = (TextView) f.N(view, R.id.app_package);
                if (textView2 != null) {
                    i6 = R.id.app_status;
                    TextView textView3 = (TextView) f.N(view, R.id.app_status);
                    if (textView3 != null) {
                        i6 = R.id.btn_close;
                        ImageView imageView2 = (ImageView) f.N(view, R.id.btn_close);
                        if (imageView2 != null) {
                            i6 = R.id.btn_primary;
                            LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.btn_primary);
                            if (linearLayout != null) {
                                i6 = R.id.btn_primary_title;
                                if (((TextView) f.N(view, R.id.btn_primary_title)) != null) {
                                    i6 = R.id.btn_secondary;
                                    LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.btn_secondary);
                                    if (linearLayout2 != null) {
                                        i6 = R.id.footer_text;
                                        TextView textView4 = (TextView) f.N(view, R.id.footer_text);
                                        if (textView4 != null) {
                                            i6 = R.id.hint_text;
                                            TextView textView5 = (TextView) f.N(view, R.id.hint_text);
                                            if (textView5 != null) {
                                                i6 = R.id.message_text;
                                                TextView textView6 = (TextView) f.N(view, R.id.message_text);
                                                if (textView6 != null) {
                                                    return new DialogBlockedAppSingleBinding((ScrollView) view, imageView, textView, textView2, textView3, imageView2, linearLayout, linearLayout2, textView4, textView5, textView6);
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

    public static DialogBlockedAppSingleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBlockedAppSingleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_blocked_app_single, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
