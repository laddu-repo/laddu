package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DonateDialogBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3247a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f3248b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f3249c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f3250d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f3251e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f3252f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3253g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3254h;

    public DonateDialogBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout3, TextView textView, TextView textView2) {
        this.f3247a = constraintLayout;
        this.f3248b = linearLayout;
        this.f3249c = linearLayout2;
        this.f3250d = imageView;
        this.f3251e = imageView2;
        this.f3252f = linearLayout3;
        this.f3253g = textView;
        this.f3254h = textView2;
    }

    public static DonateDialogBinding bind(View view) {
        int i6 = R.id.btnCopy;
        LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.btnCopy);
        if (linearLayout != null) {
            i6 = R.id.close_action_btn;
            LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.close_action_btn);
            if (linearLayout2 != null) {
                i6 = R.id.close_btn;
                ImageView imageView = (ImageView) f.N(view, R.id.close_btn);
                if (imageView != null) {
                    i6 = R.id.content_scroll;
                    if (((ScrollView) f.N(view, R.id.content_scroll)) != null) {
                        i6 = R.id.divider_a;
                        if (((MaterialDivider) f.N(view, R.id.divider_a)) != null) {
                            i6 = R.id.divider_b;
                            if (((MaterialDivider) f.N(view, R.id.divider_b)) != null) {
                                i6 = R.id.header;
                                if (((LinearLayout) f.N(view, R.id.header)) != null) {
                                    i6 = R.id.imgQr;
                                    ImageView imageView2 = (ImageView) f.N(view, R.id.imgQr);
                                    if (imageView2 != null) {
                                        i6 = R.id.qrContainer;
                                        LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.qrContainer);
                                        if (linearLayout3 != null) {
                                            i6 = R.id.tvAddress;
                                            TextView textView = (TextView) f.N(view, R.id.tvAddress);
                                            if (textView != null) {
                                                i6 = R.id.tvMessage;
                                                TextView textView2 = (TextView) f.N(view, R.id.tvMessage);
                                                if (textView2 != null) {
                                                    i6 = R.id.tvTitle;
                                                    if (((TextView) f.N(view, R.id.tvTitle)) != null) {
                                                        return new DonateDialogBinding((ConstraintLayout) view, linearLayout, linearLayout2, imageView, imageView2, linearLayout3, textView, textView2);
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

    public static DonateDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DonateDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.donate_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
