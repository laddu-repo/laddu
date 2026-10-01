package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s2 extends m5 {
    private static final s2 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.s2, com.google.android.gms.internal.measurement.m5] */
    static {
        ?? m5Var = new m5();
        zzk = m5Var;
        m5.m(s2.class, m5Var);
    }

    public static r2 w() {
        return (r2) zzk.h();
    }

    public static s2 x() {
        return zzk;
    }

    public final /* synthetic */ void A(boolean z10) {
        this.zzb |= 4;
        this.zzf = z10;
    }

    public final /* synthetic */ void B(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    public final /* synthetic */ void C(boolean z10) {
        this.zzb |= 16;
        this.zzh = z10;
    }

    public final /* synthetic */ void D(boolean z10) {
        this.zzb |= 32;
        this.zzi = z10;
    }

    public final /* synthetic */ void E(boolean z10) {
        this.zzb |= 64;
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzk;
                        }
                        throw null;
                    }
                    return new l5(zzk);
                }
                return new m5();
            }
            return new m6(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final boolean p() {
        return this.zzd;
    }

    public final boolean q() {
        return this.zze;
    }

    public final boolean r() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final /* synthetic */ void y(boolean z10) {
        this.zzb |= 1;
        this.zzd = z10;
    }

    public final /* synthetic */ void z(boolean z10) {
        this.zzb |= 2;
        this.zze = z10;
    }
}
