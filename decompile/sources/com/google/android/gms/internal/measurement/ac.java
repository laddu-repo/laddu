package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ac extends i1 {
    private static final ac zzh;
    private static volatile h2 zzi;
    private int zzb;
    private zb zzf;
    private String zze = "";
    private String zzg = "";

    static {
        ac acVar = new ac();
        zzh = acVar;
        i1.p(ac.class, acVar);
    }

    public static xb v() {
        return (xb) zzh.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new ac();
        }
        if (i10 == 4) {
            return new xb(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzi;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (ac.class) {
            try {
                h1Var = zzi;
                if (h1Var == null) {
                    h1Var = new h1(zzh);
                    zzi = h1Var;
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

    public final /* synthetic */ void w(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void x(zb zbVar) {
        this.zzf = zbVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
