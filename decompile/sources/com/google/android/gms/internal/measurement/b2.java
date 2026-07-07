package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b2 extends m5 {
    private static final b2 zzi;
    private int zzb;
    private s5 zzd;
    private s5 zze;
    private s5 zzf;
    private boolean zzg;
    private s5 zzh;

    static {
        b2 b2Var = new b2();
        zzi = b2Var;
        m5.m(b2.class, b2Var);
    }

    public b2() {
        l6 l6Var = l6.B;
        this.zzd = l6Var;
        this.zze = l6Var;
        this.zzf = l6Var;
        this.zzh = l6Var;
    }

    public static b2 v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzi;
                        }
                        throw null;
                    }
                    return new l5(zzi);
                }
                return new b2();
            }
            return new m6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", y1.class, "zze", z1.class, "zzf", a2.class, "zzg", "zzh", y1.class});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final s5 u() {
        return this.zzh;
    }
}
