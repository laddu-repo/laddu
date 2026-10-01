package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MessageLyBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f3342a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3343b;

    public MessageLyBinding(MaterialCardView materialCardView, TextView textView) {
        this.f3342a = materialCardView;
        this.f3343b = textView;
    }

    public static MessageLyBinding bind(View view) {
        TextView textView = (TextView) f.N(view, R.id.message_txt);
        if (textView != null) {
            return new MessageLyBinding((MaterialCardView) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.message_txt)));
    }

    public static MessageLyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageLyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.message_ly, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
