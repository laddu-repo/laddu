package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DialogMultiStreamBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3231a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f3232b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f3233c;

    public DialogMultiStreamBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f3231a = constraintLayout;
        this.f3232b = linearLayout;
        this.f3233c = linearLayout2;
    }

    public static DialogMultiStreamBinding bind(View view) {
        int i6 = R.id.cancel_btn;
        LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.cancel_btn);
        if (linearLayout != null) {
            i6 = R.id.linearLayout3;
            if (((LinearLayout) f.N(view, R.id.linearLayout3)) != null) {
                i6 = R.id.streams_container;
                LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.streams_container);
                if (linearLayout2 != null) {
                    return new DialogMultiStreamBinding((ConstraintLayout) view, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static DialogMultiStreamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogMultiStreamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_multi_stream, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
