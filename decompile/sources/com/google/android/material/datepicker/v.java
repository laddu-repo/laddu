package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.playfy.tv.R;
import java.util.Calendar;
import w4.i1;
import w4.k0;
import w4.t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends k0 {
    public final b A;
    public final k7.c B;
    public final int C;

    public v(ContextThemeWrapper contextThemeWrapper, b bVar, k7.c cVar) {
        int i6;
        r rVar = bVar.f2651x;
        r rVar2 = bVar.f2652y;
        r rVar3 = bVar.A;
        if (rVar.f2688x.compareTo(rVar3.f2688x) <= 0) {
            if (rVar3.f2688x.compareTo(rVar2.f2688x) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * s.A;
                if (p.T(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    i6 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i6 = 0;
                }
                this.C = dimensionPixelSize + i6;
                this.A = bVar;
                this.B = cVar;
                if (!this.f13929x.a()) {
                    this.f13930y = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // w4.k0
    public final int a() {
        return this.A.D;
    }

    @Override // w4.k0
    public final long b(int i6) {
        Calendar a10 = y.a(this.A.f2651x.f2688x);
        a10.add(2, i6);
        a10.set(5, 1);
        Calendar a11 = y.a(a10);
        a11.get(2);
        a11.get(1);
        a11.getMaximum(7);
        a11.getActualMaximum(5);
        a11.getTimeInMillis();
        return a11.getTimeInMillis();
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        u uVar = (u) i1Var;
        b bVar = this.A;
        Calendar a10 = y.a(bVar.f2651x.f2688x);
        a10.add(2, i6);
        r rVar = new r(a10);
        uVar.f2696u.setText(rVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uVar.f2697v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && rVar.equals(materialCalendarGridView.a().f2691x)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new s(rVar, bVar);
        throw null;
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (p.T(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new t0(-1, this.C));
            return new u(linearLayout, true);
        }
        return new u(linearLayout, false);
    }
}
