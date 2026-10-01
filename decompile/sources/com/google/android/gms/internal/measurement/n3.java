package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n3 extends m5 {
    private static final n3 zzg;
    private r5 zzb;
    private r5 zzd;
    private s5 zze;
    private s5 zzf;

    static {
        n3 n3Var = new n3();
        zzg = n3Var;
        m5.m(n3.class, n3Var);
    }

    public n3() {
        y5 y5Var = y5.B;
        this.zzb = y5Var;
        this.zzd = y5Var;
        l6 l6Var = l6.B;
        this.zze = l6Var;
        this.zzf = l6Var;
    }

    public static m3 x() {
        return (m3) zzg.h();
    }

    public static n3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = y5.B;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((w4) randomAccess).f2508x) {
            y5 y5Var = (y5) randomAccess;
            int i6 = y5Var.f2531z;
            this.zzd = y5Var.i(i6 + i6);
        }
        v4.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = y5.B;
    }

    public final void D(ArrayList arrayList) {
        s5 s5Var = this.zze;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zze = s5Var.i(size + size);
        }
        v4.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = l6.B;
    }

    public final void F(Iterable iterable) {
        s5 s5Var = this.zzf;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzf = s5Var.i(size + size);
        }
        v4.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = l6.B;
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
                return new n3();
            }
            return new m6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", a3.class, "zzf", p3.class});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((y5) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((y5) this.zzd).size();
    }

    public final s5 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((w4) randomAccess).f2508x) {
            y5 y5Var = (y5) randomAccess;
            int i6 = y5Var.f2531z;
            this.zzb = y5Var.i(i6 + i6);
        }
        v4.c(iterable, this.zzb);
    }
}
