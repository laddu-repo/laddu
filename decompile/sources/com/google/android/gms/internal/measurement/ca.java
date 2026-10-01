package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ca extends i1 {
    private static final ca zzh;
    private static volatile h2 zzi;
    private r1 zzb;
    private r1 zze;
    private s1 zzf;
    private s1 zzg;

    static {
        ca caVar = new ca();
        zzh = caVar;
        i1.p(ca.class, caVar);
    }

    public ca() {
        x1 x1Var = x1.f3218z;
        this.zzb = x1Var;
        this.zze = x1Var;
        k2 k2Var = k2.f2817z;
        this.zzf = k2Var;
        this.zzg = k2Var;
    }

    public static ba C() {
        return (ba) zzh.k();
    }

    public static ca D() {
        return zzh;
    }

    public final s1 A() {
        return this.zzg;
    }

    public final int B() {
        return this.zzg.size();
    }

    public final void E(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((n0) randomAccess).f2906v) {
            x1 x1Var = (x1) randomAccess;
            int i = x1Var.f3220x;
            this.zzb = x1Var.h(i + i);
        }
        m0.d(iterable, this.zzb);
    }

    public final void F() {
        this.zzb = x1.f3218z;
    }

    public final void G(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((n0) randomAccess).f2906v) {
            x1 x1Var = (x1) randomAccess;
            int i = x1Var.f3220x;
            this.zze = x1Var.h(i + i);
        }
        m0.d(list, this.zze);
    }

    public final void H() {
        this.zze = x1.f3218z;
    }

    public final void I(ArrayList arrayList) {
        s1 s1Var = this.zzf;
        if (!((n0) s1Var).f2906v) {
            this.zzf = j4.a.j(s1Var);
        }
        m0.d(arrayList, this.zzf);
    }

    public final void J() {
        this.zzf = k2.f2817z;
    }

    public final void K(Iterable iterable) {
        s1 s1Var = this.zzg;
        if (!((n0) s1Var).f2906v) {
            this.zzg = j4.a.j(s1Var);
        }
        m0.d(iterable, this.zzg);
    }

    public final void L() {
        this.zzg = k2.f2817z;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", p9.class, "zzg", ea.class});
        }
        if (i10 == 3) {
            return new ca();
        }
        if (i10 == 4) {
            return new ba(zzh);
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
        synchronized (ca.class) {
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

    public final List u() {
        return this.zzb;
    }

    public final int v() {
        return ((x1) this.zzb).size();
    }

    public final List w() {
        return this.zze;
    }

    public final int x() {
        return ((x1) this.zze).size();
    }

    public final s1 y() {
        return this.zzf;
    }

    public final int z() {
        return this.zzf.size();
    }
}
