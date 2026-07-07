package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class cc extends i1 {
    private static final cc zzl;
    private static volatile h2 zzm;
    private int zzb;
    private String zze = "";
    private t0 zzf = t0.f3098w;
    private String zzg = "";
    private s1 zzh;
    private s1 zzi;
    private boolean zzj;
    private long zzk;

    static {
        cc ccVar = new cc();
        zzl = ccVar;
        i1.p(cc.class, ccVar);
    }

    public cc() {
        k2 k2Var = k2.f2817z;
        this.zzh = k2Var;
        this.zzi = k2Var;
    }

    public static bc A() {
        return (bc) zzl.k();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(s0 s0Var) {
        s0Var.getClass();
        this.zzb |= 2;
        this.zzf = s0Var;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void E(ec ecVar) {
        s1 s1Var = this.zzh;
        if (!((n0) s1Var).f2906v) {
            this.zzh = j4.a.j(s1Var);
        }
        this.zzh.add(ecVar);
    }

    public final void F(String str) {
        str.getClass();
        s1 s1Var = this.zzi;
        if (!((n0) s1Var).f2906v) {
            this.zzi = j4.a.j(s1Var);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void G(boolean z2) {
        this.zzb |= 8;
        this.zzj = z2;
    }

    public final /* synthetic */ void H(long j8) {
        this.zzb |= 16;
        this.zzk = j8;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", ec.class, "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new cc();
        }
        if (i10 == 4) {
            return new bc(zzl);
        }
        if (i10 == 5) {
            return zzl;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzm;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (cc.class) {
            try {
                h1Var = zzm;
                if (h1Var == null) {
                    h1Var = new h1(zzl);
                    zzm = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final t0 w() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final s1 y() {
        return this.zzh;
    }

    public final long z() {
        return this.zzk;
    }
}
