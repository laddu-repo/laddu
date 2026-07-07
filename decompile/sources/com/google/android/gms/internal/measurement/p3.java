package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p3 extends m5 {
    private static final p3 zzf;
    private int zzb;
    private int zzd;
    private r5 zze = y5.B;

    static {
        p3 p3Var = new p3();
        zzf = p3Var;
        m5.m(p3.class, p3Var);
    }

    public static o3 u() {
        return (o3) zzf.h();
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
                return new p3();
            }
            return new m6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final boolean p() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return ((y5) this.zze).size();
    }

    public final long t(int i6) {
        return ((y5) this.zze).b(i6);
    }

    public final /* synthetic */ void v(int i6) {
        this.zzb |= 1;
        this.zzd = i6;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((w4) randomAccess).f2508x) {
            y5 y5Var = (y5) randomAccess;
            int i6 = y5Var.f2531z;
            this.zze = y5Var.i(i6 + i6);
        }
        v4.c(list, this.zze);
    }
}
