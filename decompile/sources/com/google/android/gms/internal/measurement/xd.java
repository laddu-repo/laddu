package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class xd extends i1 {
    private static final xd zzl;
    private static volatile h2 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private s1 zzg = k2.f2817z;

    static {
        xd xdVar = new xd();
        zzl = xdVar;
        i1.p(xd.class, xdVar);
    }

    public static xd w(InputStream inputStream, a1 a1Var) throws u1 {
        xd xdVar = zzl;
        w0 w0VarM = w0.m(inputStream, 4096);
        i1 i1VarI = xdVar.i();
        try {
            m2 m2VarA = j2.f2783c.a(i1VarI.getClass());
            androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) w0VarM.f3186x;
            if (kVar == null) {
                kVar = new androidx.datastore.preferences.protobuf.k(w0VarM);
            }
            m2VarA.f(i1VarI, kVar, a1Var);
            m2VarA.h(i1VarI);
            i1.s(i1VarI);
            return (xd) i1VarI;
        } catch (q2 e7) {
            throw e7.a();
        } catch (u1 e10) {
            if (e10.f3125v) {
                throw new u1(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof u1) {
                throw ((u1) e11.getCause());
            }
            throw new u1(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof u1) {
                throw ((u1) e12.getCause());
            }
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", j0.f2765b, "zzi", "zzk", "zzj"});
        }
        if (i10 == 3) {
            return new xd();
        }
        if (i10 == 4) {
            return new i8(zzl);
        }
        if (i10 == 5) {
            return zzl;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzm;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (xd.class) {
            try {
                h1Var = zzm;
                if (h1Var == null) {
                    h1Var = new h1(zzl);
                    zzm = h1Var;
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

    public final boolean v() {
        return this.zzf;
    }
}
