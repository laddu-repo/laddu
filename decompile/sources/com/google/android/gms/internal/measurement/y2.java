package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y2 extends m5 {
    private static final y2 zzd;
    private s5 zzb = l6.B;

    static {
        y2 y2Var = new y2();
        zzd = y2Var;
        m5.m(y2.class, y2Var);
    }

    public static v2 q() {
        return (v2) zzd.h();
    }

    public static y2 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzd;
                        }
                        throw null;
                    }
                    return new l5(zzd);
                }
                return new y2();
            }
            return new m6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", x2.class});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        s5 s5Var = this.zzb;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzb = s5Var.i(size + size);
        }
        v4.c(arrayList, this.zzb);
    }
}
