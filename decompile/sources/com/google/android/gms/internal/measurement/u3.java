package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u3 extends m5 {
    private static final u3 zzd;
    private s5 zzb = l6.B;

    static {
        u3 u3Var = new u3();
        zzd = u3Var;
        m5.m(u3.class, u3Var);
    }

    public static u3 r() {
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
                return new u3();
            }
            return new m6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", v3.class});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
