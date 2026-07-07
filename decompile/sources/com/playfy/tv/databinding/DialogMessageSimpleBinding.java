package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DialogMessageSimpleBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3224a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f3225b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3226c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3227d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f3228e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3229f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3230g;

    public DialogMessageSimpleBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        this.f3224a = constraintLayout;
        this.f3225b = imageView;
        this.f3226c = imageView2;
        this.f3227d = textView;
        this.f3228e = linearLayout;
        this.f3229f = textView2;
        this.f3230g = textView3;
    }

    public static DialogMessageSimpleBinding bind(View view) {
        int i6 = R.id.close_btn;
        ImageView imageView = (ImageView) f.N(view, R.id.close_btn);
        if (imageView != null) {
            i6 = R.id.divider_a;
            if (((MaterialDivider) f.N(view, R.id.divider_a)) != null) {
                i6 = R.id.divider_b;
                if (((MaterialDivider) f.N(view, R.id.divider_b)) != null) {
                    i6 = R.id.header;
                    if (((LinearLayout) f.N(view, R.id.header)) != null) {
                        i6 = R.id.header_icon;
                        ImageView imageView2 = (ImageView) f.N(view, R.id.header_icon);
                        if (imageView2 != null) {
                            i6 = R.id.message_text;
                            TextView textView = (TextView) f.N(view, R.id.message_text);
                            if (textView != null) {
                                i6 = R.id.ok_btn;
                                LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.ok_btn);
                                if (linearLayout != null) {
                                    i6 = R.id.subtitle_text;
                                    TextView textView2 = (TextView) f.N(view, R.id.subtitle_text);
                                    if (textView2 != null) {
                                        i6 = R.id.title_text;
                                        TextView textView3 = (TextView) f.N(view, R.id.title_text);
                                        if (textView3 != null) {
                                            return new DialogMessageSimpleBinding((ConstraintLayout) view, imageView, imageView2, textView, linearLayout, textView2, textView3);
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

    public static DialogMessageSimpleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogMessageSimpleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_message_simple, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
