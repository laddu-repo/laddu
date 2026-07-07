package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u2 extends m5 {
    private static final u2 zzh;
    private int zzb;
    private int zzd;
    private n3 zze;
    private n3 zzf;
    private boolean zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.u2, com.google.android.gms.internal.measurement.m5] */
    static {
        ?? m5Var = new m5();
        zzh = m5Var;
        m5.m(u2.class, m5Var);
    }

    public static t2 w() {
        return (t2) zzh.h();
    }

    public final /* synthetic */ void A(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzh;
                        }
                        throw null;
                    }
                    return new l5(zzh);
                }
                return new m5();
            }
            return new m6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
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

    public final n3 r() {
        n3 n3Var = this.zze;
        if (n3Var == null) {
            return n3.y();
        }
        return n3Var;
    }

    public final boolean s() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final n3 t() {
        n3 n3Var = this.zzf;
        if (n3Var == null) {
            return n3.y();
        }
        return n3Var;
    }

    public final boolean u() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i6) {
        this.zzb |= 1;
        this.zzd = i6;
    }

    public final /* synthetic */ void y(n3 n3Var) {
        this.zze = n3Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(n3 n3Var) {
        this.zzf = n3Var;
        this.zzb |= 4;
    }
}
