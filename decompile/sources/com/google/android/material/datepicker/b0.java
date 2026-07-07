package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends o4.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f3405d;

    public b0(m mVar) {
        this.f3405d = mVar;
    }

    @Override // o4.b0
    public final int a() {
        return this.f3405d.f3424v0.A;
    }

    @Override // o4.b0
    public final void d(z0 z0Var, int i) {
        m mVar = this.f3405d;
        int i10 = mVar.f3424v0.f3400v.f3445x + i;
        TextView textView = ((a0) z0Var).f3399u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        Context context = textView.getContext();
        textView.setContentDescription(z.b().get(1) == i10 ? String.format(context.getString(p8.j.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(p8.j.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        c cVar = mVar.f3427y0;
        if (z.b().get(1) == i10) {
            kb.e eVar = cVar.f3407b;
        } else {
            kb.e eVar2 = cVar.f3406a;
        }
        throw null;
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        return new a0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p8.h.mtrl_calendar_year, viewGroup, false));
    }
}
