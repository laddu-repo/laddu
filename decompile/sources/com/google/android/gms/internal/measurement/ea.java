package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ea extends i1 {
    private static final ea zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private r1 zzf = x1.f3218z;

    static {
        ea eaVar = new ea();
        zzg = eaVar;
        i1.p(ea.class, eaVar);
    }

    public static da z() {
        return (da) zzg.k();
    }

    public final /* synthetic */ void A(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((n0) randomAccess).f2906v) {
            x1 x1Var = (x1) randomAccess;
            int i = x1Var.f3220x;
            this.zzf = x1Var.h(i + i);
        }
        m0.d(list, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new ea();
        }
        if (i10 == 4) {
            return new da(zzg);
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
        synchronized (ea.class) {
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

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final int v() {
        return this.zze;
    }

    public final List w() {
        return this.zzf;
    }

    public final int x() {
        return ((x1) this.zzf).size();
    }

    public final long y(int i) {
        return ((x1) this.zzf).b(i);
    }
}
