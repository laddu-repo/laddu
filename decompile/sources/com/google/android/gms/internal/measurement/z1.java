package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z1 extends m5 {
    private static final z1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.m5, com.google.android.gms.internal.measurement.z1] */
    static {
        ?? m5Var = new m5();
        zzf = m5Var;
        m5.m(z1.class, m5Var);
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
                return new m5();
            }
            t1 t1Var = t1.f2430e;
            return new m6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", t1Var, "zze", t1Var});
        }
        return (byte) 1;
    }

    public final int p() {
        int z10 = a.a.z(this.zzd);
        if (z10 == 0) {
            return 1;
        }
        return z10;
    }

    public final int q() {
        int z10 = a.a.z(this.zze);
        if (z10 == 0) {
            return 1;
        }
        return z10;
    }
}
