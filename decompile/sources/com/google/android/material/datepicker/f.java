package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import w4.s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2660x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f2661y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f2662z;

    public /* synthetic */ f(m mVar, v vVar, int i6) {
        this.f2660x = i6;
        this.f2662z = mVar;
        this.f2661y = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int H;
        switch (this.f2660x) {
            case 0:
                m mVar = this.f2662z;
                int M0 = ((LinearLayoutManager) mVar.G0.getLayoutManager()).M0() - 1;
                Calendar a10 = y.a(this.f2661y.A.f2651x.f2688x);
                a10.add(2, M0);
                mVar.N(new r(a10));
                return;
            default:
                m mVar2 = this.f2662z;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar2.G0.getLayoutManager();
                View O0 = linearLayoutManager.O0(false, 0, linearLayoutManager.v());
                if (O0 == null) {
                    H = -1;
                } else {
                    H = s0.H(O0);
                }
                Calendar a11 = y.a(this.f2661y.A.f2651x.f2688x);
                a11.add(2, H + 1);
                mVar2.N(new r(a11));
                return;
        }
    }
}
