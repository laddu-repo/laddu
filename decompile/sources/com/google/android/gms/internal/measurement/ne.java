package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ne extends i1 {
    private static final ne zzj;
    private static volatile h2 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private t0 zzf = t0.f3098w;
    private String zzg = "";
    private s1 zzi = k2.f2817z;

    static {
        ne neVar = new ne();
        zzj = neVar;
        i1.p(ne.class, neVar);
    }

    public static me A() {
        return (me) zzj.k();
    }

    public static ne B() {
        return zzj;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(t0 t0Var) {
        t0Var.getClass();
        this.zzb |= 2;
        this.zzf = t0Var;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void F(long j8) {
        this.zzb |= 8;
        this.zzh = j8;
    }

    public final void G(pe peVar) {
        s1 s1Var = this.zzi;
        if (!((n0) s1Var).f2906v) {
            this.zzi = j4.a.j(s1Var);
        }
        this.zzi.add(peVar);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", pe.class});
        }
        if (i10 == 3) {
            return new ne();
        }
        if (i10 == 4) {
            return new me(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (ne.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
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

    public final t0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final s1 y() {
        return this.zzi;
    }

    public final int z() {
        return this.zzi.size();
    }
}
