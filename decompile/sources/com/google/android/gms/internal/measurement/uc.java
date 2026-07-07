package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class uc extends i1 {
    private static final uc zzo;
    private static volatile h2 zzp;
    private int zzb;
    private boolean zzf;
    private s1 zzh;
    private s1 zzi;
    private n1 zzj;
    private vc zzk;
    private boolean zzl;
    private boolean zzm;
    private rc zzn;
    private t0 zze = t0.f3098w;
    private String zzg = "";

    static {
        uc ucVar = new uc();
        zzo = ucVar;
        i1.p(uc.class, ucVar);
    }

    public uc() {
        k2 k2Var = k2.f2817z;
        this.zzh = k2Var;
        this.zzi = k2Var;
        this.zzj = j1.f2780z;
    }

    public static uc u() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", j0.f2765b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i10 == 3) {
            return new uc();
        }
        if (i10 == 4) {
            return new i8(zzo);
        }
        if (i10 == 5) {
            return zzo;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzp;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (uc.class) {
            try {
                h1Var = zzp;
                if (h1Var == null) {
                    h1Var = new h1(zzo);
                    zzp = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }
}
