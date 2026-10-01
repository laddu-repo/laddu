package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v3 extends m5 {
    private static final v3 zzf;
    private int zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private s5 zze = l6.B;

    static {
        v3 v3Var = new v3();
        zzf = v3Var;
        m5.m(v3.class, v3Var);
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
                return new v3();
            }
            return new m6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", x3.class});
        }
        return (byte) 1;
    }

    public final String p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }
}
