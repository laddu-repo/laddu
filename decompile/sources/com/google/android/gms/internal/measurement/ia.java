package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ia extends i1 {
    private static final ia zzk;
    private static volatile h2 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        ia iaVar = new ia();
        zzk = iaVar;
        i1.p(ia.class, iaVar);
    }

    public static ha F() {
        return (ha) zzk.k();
    }

    public final long A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final float C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zzb & 32) != 0;
    }

    public final double E() {
        return this.zzj;
    }

    public final /* synthetic */ void G(long j8) {
        this.zzb |= 1;
        this.zze = j8;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void J() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void K(long j8) {
        this.zzb |= 8;
        this.zzh = j8;
    }

    public final /* synthetic */ void L() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void M(double d10) {
        this.zzb |= 32;
        this.zzj = d10;
    }

    public final /* synthetic */ void N() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new ia();
        }
        if (i10 == 4) {
            return new ha(zzk);
        }
        if (i10 == 5) {
            return zzk;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzl;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (ia.class) {
            try {
                h1Var = zzl;
                if (h1Var == null) {
                    h1Var = new h1(zzk);
                    zzl = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final long v() {
        return this.zze;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final String y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
