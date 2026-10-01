package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class tc extends i1 {
    private static final o1 zzl = new f1(13);
    private static final tc zzq;
    private static volatile h2 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private s1 zzi;
    private s1 zzj;
    private n1 zzk;
    private vc zzm;
    private boolean zzn;
    private boolean zzo;
    private rc zzp;
    private t0 zze = t0.f3098w;
    private String zzg = "";

    static {
        tc tcVar = new tc();
        zzq = tcVar;
        i1.p(tc.class, tcVar);
    }

    public tc() {
        k2 k2Var = k2.f2817z;
        this.zzi = k2Var;
        this.zzj = k2Var;
        this.zzk = j1.f2780z;
    }

    public static sc H() {
        return (sc) zzq.k();
    }

    public static tc I() {
        return zzq;
    }

    public final s1 A() {
        return this.zzj;
    }

    public final List B() {
        return new p1(this.zzk, zzl);
    }

    public final boolean C() {
        return (this.zzb & 16) != 0;
    }

    public final vc D() {
        vc vcVar = this.zzm;
        return vcVar == null ? vc.w() : vcVar;
    }

    public final boolean E() {
        return this.zzn;
    }

    public final boolean F() {
        return this.zzo;
    }

    public final rc G() {
        rc rcVar = this.zzp;
        return rcVar == null ? rc.v() : rcVar;
    }

    public final /* synthetic */ void J(long j8) {
        this.zzb |= 8;
        this.zzh = j8;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", j0.f2765b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i10 == 3) {
            return new tc();
        }
        if (i10 == 4) {
            return new sc(zzq);
        }
        if (i10 == 5) {
            return zzq;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzr;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (tc.class) {
            try {
                h1Var = zzr;
                if (h1Var == null) {
                    h1Var = new h1(zzq);
                    zzr = h1Var;
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

    public final t0 v() {
        return this.zze;
    }

    public final boolean w() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final long y() {
        return this.zzh;
    }

    public final s1 z() {
        return this.zzi;
    }
}
