package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import w4.s0;
import w4.v0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f2667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2668b;

    public k(m mVar, v vVar) {
        this.f2668b = mVar;
        this.f2667a = vVar;
    }

    @Override // w4.v0
    public final void b(RecyclerView recyclerView, int i6, int i10) {
        int M0;
        String formatDateTime;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext unused;
        b bVar = this.f2667a.A;
        m mVar = this.f2668b;
        if (i6 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar.G0.getLayoutManager();
            View O0 = linearLayoutManager.O0(false, 0, linearLayoutManager.v());
            if (O0 == null) {
                M0 = -1;
            } else {
                M0 = s0.H(O0);
            }
        } else {
            M0 = ((LinearLayoutManager) mVar.G0.getLayoutManager()).M0();
        }
        Calendar a10 = y.a(bVar.f2651x.f2688x);
        a10.add(2, M0);
        r rVar = new r(a10);
        mVar.C0 = rVar;
        MaterialButton materialButton = mVar.L0;
        Calendar a11 = y.a(bVar.f2651x.f2688x);
        a11.add(2, M0);
        a11.set(5, 1);
        Calendar a12 = y.a(a11);
        a12.get(2);
        a12.get(1);
        a12.getMaximum(7);
        a12.getActualMaximum(5);
        a12.getTimeInMillis();
        long timeInMillis = a12.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = y.f2699a;
            instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            timeZone = TimeZone.getTimeZone("UTC");
            instanceForSkeleton.setTimeZone(timeZone);
            unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            formatDateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        materialButton.setText(formatDateTime);
        mVar.P(bVar.f2651x.d(rVar));
    }
}
