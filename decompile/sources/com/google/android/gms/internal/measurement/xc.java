package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class xc extends i1 {
    private static final xc zzg;
    private static volatile h2 zzh;
    private int zzb;
    private tc zze;
    private uc zzf;

    static {
        xc xcVar = new xc();
        zzg = xcVar;
        i1.p(xc.class, xcVar);
    }

    public static xc w(byte[] bArr, a1 a1Var) {
        return (xc) i1.e(zzg, bArr, a1Var);
    }

    public static wc x() {
        return (wc) zzg.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new xc();
        }
        if (i10 == 4) {
            return new wc(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzh;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (xc.class) {
            try {
                h1Var = zzh;
                if (h1Var == null) {
                    h1Var = new h1(zzg);
                    zzh = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final tc u() {
        tc tcVar = this.zze;
        return tcVar == null ? tc.I() : tcVar;
    }

    public final uc v() {
        uc ucVar = this.zzf;
        return ucVar == null ? uc.u() : ucVar;
    }

    public final /* synthetic */ void y(tc tcVar) {
        this.zze = tcVar;
        this.zzb |= 1;
    }
}
