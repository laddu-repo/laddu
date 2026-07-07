package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x9 extends i1 {
    private static final x9 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private s1 zze = k2.f2817z;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        x9 x9Var = new x9();
        zzi = x9Var;
        i1.p(x9.class, x9Var);
    }

    public static w9 B() {
        return (w9) zzi.k();
    }

    public static w9 C(x9 x9Var) {
        g1 g1VarK = zzi.k();
        g1VarK.f(x9Var);
        return (w9) g1VarK;
    }

    public final String A() {
        return this.zzg;
    }

    public final /* synthetic */ void D(int i, z9 z9Var) {
        J();
        this.zze.set(i, z9Var);
    }

    public final /* synthetic */ void E(z9 z9Var) {
        J();
        this.zze.add(z9Var);
    }

    public final /* synthetic */ void F(ArrayList arrayList) {
        J();
        m0.d(arrayList, this.zze);
    }

    public final void G() {
        this.zze = k2.f2817z;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void J() {
        s1 s1Var = this.zze;
        if (((n0) s1Var).f2906v) {
            return;
        }
        this.zze = j4.a.j(s1Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", z9.class, "zzf", "zzg", "zzh", j0.f2772k});
        }
        if (i10 == 3) {
            return new x9();
        }
        if (i10 == 4) {
            return new w9(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzj;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (x9.class) {
            try {
                h1Var = zzj;
                if (h1Var == null) {
                    h1Var = new h1(zzi);
                    zzj = h1Var;
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

    public final int v() {
        return this.zze.size();
    }

    public final z9 w(int i) {
        return (z9) this.zze.get(i);
    }

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
