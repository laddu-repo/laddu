package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DialogMultiStreamItemBinding implements a {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.playfy.tv.databinding.DialogMultiStreamItemBinding, java.lang.Object] */
    public static DialogMultiStreamItemBinding bind(View view) {
        int i6 = R.id.hd_badge;
        if (((TextView) f.N(view, R.id.hd_badge)) != null) {
            i6 = R.id.stream_name;
            if (((TextView) f.N(view, R.id.stream_name)) != null) {
                return new Object();
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static DialogMultiStreamItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogMultiStreamItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_multi_stream_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
