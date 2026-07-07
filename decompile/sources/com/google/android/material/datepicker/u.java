package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.playfy.tv.R;
import java.util.WeakHashMap;
import t0.d0;
import t0.q0;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends i1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f2696u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f2697v;

    public u(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2696u = textView;
        WeakHashMap weakHashMap = q0.f12397a;
        new d0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f2697v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z10) {
            textView.setVisibility(8);
        }
    }
}
