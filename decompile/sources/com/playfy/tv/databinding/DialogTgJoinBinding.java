package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DialogTgJoinBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3242a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f3243b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f3244c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f3245d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f3246e;

    public DialogTgJoinBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f3242a = linearLayout;
        this.f3243b = imageView;
        this.f3244c = linearLayout2;
        this.f3245d = linearLayout3;
        this.f3246e = linearLayout4;
    }

    public static DialogTgJoinBinding bind(View view) {
        int i6 = R.id.close_btn;
        ImageView imageView = (ImageView) f.N(view, R.id.close_btn);
        if (imageView != null) {
            i6 = R.id.dsa_btn;
            LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.dsa_btn);
            if (linearLayout != null) {
                i6 = R.id.join_btn;
                LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.join_btn);
                if (linearLayout2 != null) {
                    i6 = R.id.later_btn;
                    LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.later_btn);
                    if (linearLayout3 != null) {
                        return new DialogTgJoinBinding((LinearLayout) view, imageView, linearLayout, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static DialogTgJoinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogTgJoinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_tg_join, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
