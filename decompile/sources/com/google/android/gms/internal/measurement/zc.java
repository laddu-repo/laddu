package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class zc extends i1 {
    private static final zc zzg;
    private static volatile h2 zzh;
    private int zzb;
    private s1 zze = k2.f2817z;
    private String zzf = "";

    static {
        zc zcVar = new zc();
        zzg = zcVar;
        i1.p(zc.class, zcVar);
    }

    public static zc v() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zc();
        }
        if (i10 == 4) {
            return new yc(zzg);
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
        synchronized (zc.class) {
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

    public final List u() {
        return this.zze;
    }

    public final void w(String str) {
        s1 s1Var = this.zze;
        if (!((n0) s1Var).f2906v) {
            this.zze = j4.a.j(s1Var);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
