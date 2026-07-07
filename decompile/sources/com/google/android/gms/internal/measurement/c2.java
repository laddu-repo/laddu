package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c2 extends m5 {
    private static final c2 zzg;
    private int zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private s5 zze = l6.B;
    private boolean zzf;

    static {
        c2 c2Var = new c2();
        zzg = c2Var;
        m5.m(c2.class, c2Var);
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzg;
                        }
                        throw null;
                    }
                    return new l5(zzg);
                }
                return new c2();
            }
            return new m6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", j2.class, "zzf"});
        }
        return (byte) 1;
    }

    public final String p() {
        return this.zzd;
    }
}
