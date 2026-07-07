package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class rc extends i1 {
    private static final rc zzf;
    private static volatile h2 zzg;
    private int zzb;
    private boolean zze;

    static {
        rc rcVar = new rc();
        zzf = rcVar;
        i1.p(rc.class, rcVar);
    }

    public static rc v() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i10 == 3) {
            return new rc();
        }
        if (i10 == 4) {
            return new i8(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzg;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (rc.class) {
            try {
                h1Var = zzg;
                if (h1Var == null) {
                    h1Var = new h1(zzf);
                    zzg = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return this.zze;
    }
}
