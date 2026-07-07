package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y1 extends m5 {
    private static final y1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.m5, com.google.android.gms.internal.measurement.y1] */
    static {
        ?? m5Var = new m5();
        zzg = m5Var;
        m5.m(y1.class, m5Var);
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
                return new m5();
            }
            return new m6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", t1.f2430e, "zze", t1.f2429d, "zzf", t1.f2431f});
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
        int i6;
        int i10 = this.zze;
        if (i10 != 0) {
            i6 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i6 = 0;
                } else {
                    i6 = 3;
                }
            }
        } else {
            i6 = 1;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final int r() {
        int i6;
        int i10 = this.zzf;
        if (i10 != 0) {
            i6 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i6 = 0;
                } else {
                    i6 = 3;
                }
            }
        } else {
            i6 = 1;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }
}
