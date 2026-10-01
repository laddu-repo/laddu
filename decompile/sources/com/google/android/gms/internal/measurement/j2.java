package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j2 extends m5 {
    private static final j2 zzf;
    private int zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        j2 j2Var = new j2();
        zzf = j2Var;
        m5.m(j2.class, j2Var);
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
                return new j2();
            }
            return new m6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
