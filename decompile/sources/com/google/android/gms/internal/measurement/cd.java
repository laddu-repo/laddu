package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class cd extends i1 {
    private static final cd zze;
    private static volatile h2 zzf;
    private z1 zzb = z1.f3268w;

    static {
        cd cdVar = new cd();
        zze = cdVar;
        i1.p(cd.class, cdVar);
    }

    public static cd v() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", ad.f2479a});
        }
        if (i10 == 3) {
            return new cd();
        }
        if (i10 == 4) {
            return new bd(zze);
        }
        if (i10 == 5) {
            return zze;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzf;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (cd.class) {
            try {
                h1Var = zzf;
                if (h1Var == null) {
                    h1Var = new h1(zze);
                    zzf = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final zc u(String str, zc zcVar) {
        str.getClass();
        zc zcVar2 = (zc) this.zzb.get(str);
        return zcVar2 != null ? zcVar2 : zcVar;
    }

    public final z1 w() {
        z1 z1Var = this.zzb;
        if (!z1Var.f3269v) {
            this.zzb = z1Var.a();
        }
        return this.zzb;
    }
}
