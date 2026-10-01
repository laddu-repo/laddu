package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w3 extends m5 {
    private static final w3 zzf;
    private int zzb;
    private s5 zzd = l6.B;
    private u3 zze;

    static {
        w3 w3Var = new w3();
        zzf = w3Var;
        m5.m(w3.class, w3Var);
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzf;
                        }
                        throw null;
                    }
                    return new l5(zzf);
                }
                return new w3();
            }
            return new m6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", x3.class, "zze"});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zzd;
    }

    public final u3 q() {
        u3 u3Var = this.zze;
        if (u3Var == null) {
            return u3.r();
        }
        return u3Var;
    }
}
