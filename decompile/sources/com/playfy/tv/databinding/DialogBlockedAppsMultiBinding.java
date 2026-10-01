package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DialogBlockedAppsMultiBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f3216b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3217c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f3218d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f3219e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3220f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3221g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3222h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3223i;

    public DialogBlockedAppsMultiBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f3215a = linearLayout;
        this.f3216b = linearLayout2;
        this.f3217c = imageView;
        this.f3218d = linearLayout3;
        this.f3219e = linearLayout4;
        this.f3220f = textView;
        this.f3221g = textView2;
        this.f3222h = textView3;
        this.f3223i = textView4;
    }

    public static DialogBlockedAppsMultiBinding bind(View view) {
        int i6 = R.id.apps_container;
        LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.apps_container);
        if (linearLayout != null) {
            i6 = R.id.btn_close;
            ImageView imageView = (ImageView) f.N(view, R.id.btn_close);
            if (imageView != null) {
                i6 = R.id.btn_primary;
                LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.btn_primary);
                if (linearLayout2 != null) {
                    i6 = R.id.btn_secondary;
                    LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.btn_secondary);
                    if (linearLayout3 != null) {
                        i6 = R.id.count_badge;
                        TextView textView = (TextView) f.N(view, R.id.count_badge);
                        if (textView != null) {
                            i6 = R.id.footer_text;
                            TextView textView2 = (TextView) f.N(view, R.id.footer_text);
                            if (textView2 != null) {
                                i6 = R.id.hint_text;
                                TextView textView3 = (TextView) f.N(view, R.id.hint_text);
                                if (textView3 != null) {
                                    i6 = R.id.message_text;
                                    TextView textView4 = (TextView) f.N(view, R.id.message_text);
                                    if (textView4 != null) {
                                        return new DialogBlockedAppsMultiBinding((LinearLayout) view, linearLayout, imageView, linearLayout2, linearLayout3, textView, textView2, textView3, textView4);
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

    public static DialogBlockedAppsMultiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBlockedAppsMultiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_blocked_apps_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
