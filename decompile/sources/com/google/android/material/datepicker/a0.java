package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.playfy.tv.R;
import java.util.Locale;
import w4.i1;
import w4.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends k0 {
    public final m A;

    public a0(m mVar) {
        this.A = mVar;
    }

    @Override // w4.k0
    public final int a() {
        return this.A.B0.C;
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        String format;
        m mVar = this.A;
        int i10 = mVar.B0.f2651x.f2690z + i6;
        TextView textView = ((z) i1Var).f2700u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        Context context = textView.getContext();
        if (y.b().get(1) == i10) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
        }
        textView.setContentDescription(format);
        c cVar = mVar.E0;
        if (y.b().get(1) == i10) {
            zb.d dVar = cVar.f2655b;
        } else {
            zb.d dVar2 = cVar.f2654a;
        }
        throw null;
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        return new z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
