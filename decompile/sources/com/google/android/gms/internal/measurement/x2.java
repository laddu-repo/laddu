package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x2 extends m5 {
    private static final x2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.m5, com.google.android.gms.internal.measurement.x2] */
    static {
        ?? m5Var = new m5();
        zzf = m5Var;
        m5.m(x2.class, m5Var);
    }

    public static w2 p() {
        return (w2) zzf.h();
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
            return new m6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", t1.f2433h, "zze", t1.f2434i});
        }
        return (byte) 1;
    }

    public final int q() {
        int i6;
        int i10 = this.zzd;
        if (i10 != 0) {
            i6 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i6 = 4;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            i6 = 0;
                        } else {
                            i6 = 5;
                        }
                    }
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

    public final /* synthetic */ void s(int i6) {
        this.zzd = i6 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i6) {
        this.zze = i6 - 1;
        this.zzb |= 2;
    }
}
