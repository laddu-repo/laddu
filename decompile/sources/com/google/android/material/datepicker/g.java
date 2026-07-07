package com.google.android.material.datepicker;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.measurement.j5;
import java.util.ArrayList;
import java.util.List;
import w4.s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2663x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2664y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f2665z;

    public /* synthetic */ g(int i6, int i10, Object obj) {
        this.f2663x = i10;
        this.f2665z = obj;
        this.f2664y = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2663x) {
            case 0:
                RecyclerView recyclerView = ((m) this.f2665z).G0;
                if (!recyclerView.U) {
                    s0 s0Var = recyclerView.K;
                    if (s0Var == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        s0Var.z0(recyclerView, this.f2664y);
                        return;
                    }
                }
                return;
            case 1:
                ((SystemForegroundService) this.f2665z).B.cancel(this.f2664y);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) this.f2665z;
                int size = arrayList.size();
                int i6 = 0;
                if (this.f2664y != 1) {
                    while (i6 < size) {
                        ((e1.i) arrayList.get(i6)).a();
                        i6++;
                    }
                    return;
                } else {
                    while (i6 < size) {
                        ((e1.i) arrayList.get(i6)).b();
                        i6++;
                    }
                    return;
                }
            case 3:
                k0.b bVar = (k0.b) ((u5.r) this.f2665z).f12916y;
                if (bVar != null) {
                    bVar.h(this.f2664y);
                    return;
                }
                return;
            default:
                ((v8.j) this.f2665z).h(this.f2664y);
                return;
        }
    }

    public g(List list, int i6, Throwable th) {
        this.f2663x = 2;
        j5.e(list, "initCallbacks cannot be null");
        this.f2665z = new ArrayList(list);
        this.f2664y = i6;
    }
}
