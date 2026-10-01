package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n1 extends m5 {
    private static final n1 zzi;
    private int zzb;
    private int zzd;
    private s5 zze;
    private s5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        n1 n1Var = new n1();
        zzi = n1Var;
        m5.m(n1.class, n1Var);
    }

    public n1() {
        l6 l6Var = l6.B;
        this.zze = l6Var;
        this.zzf = l6Var;
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
                return new n1();
            }
            return new m6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", w1.class, "zzf", p1.class, "zzg", "zzh"});
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
        return this.zze.size();
    }

    public final w1 t(int i6) {
        return (w1) this.zze.get(i6);
    }

    public final s5 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final p1 w(int i6) {
        return (p1) this.zzf.get(i6);
    }

    public final void x(int i6, w1 w1Var) {
        s5 s5Var = this.zze;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zze = s5Var.i(size + size);
        }
        this.zze.set(i6, w1Var);
    }

    public final void y(int i6, p1 p1Var) {
        s5 s5Var = this.zzf;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzf = s5Var.i(size + size);
        }
        this.zzf.set(i6, p1Var);
    }
}
