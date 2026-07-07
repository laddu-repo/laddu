package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2694x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f2695y;

    public t(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2695y = vVar;
        this.f2694x = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f2694x;
        s a10 = materialCalendarGridView.a();
        if (i6 >= a10.a() && i6 <= a10.c()) {
            if (materialCalendarGridView.a().getItem(i6).longValue() < ((m) this.f2695y.B.f7745y).B0.f2653z.f2656x) {
            } else {
                throw null;
            }
        }
    }
}
