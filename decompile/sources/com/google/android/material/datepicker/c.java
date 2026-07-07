package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final zb.d f2654a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.d f2655b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a8.g.q(R.attr.materialCalendarStyle, context, m.class.getCanonicalName()).data, t9.a.f12693w);
        zb.d.s(context, obtainStyledAttributes.getResourceId(4, 0));
        zb.d.s(context, obtainStyledAttributes.getResourceId(2, 0));
        zb.d.s(context, obtainStyledAttributes.getResourceId(3, 0));
        zb.d.s(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList i6 = a8.i.i(context, obtainStyledAttributes, 7);
        this.f2654a = zb.d.s(context, obtainStyledAttributes.getResourceId(9, 0));
        zb.d.s(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2655b = zb.d.s(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(i6.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
