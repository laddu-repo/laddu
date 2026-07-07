package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class jc extends i1 {
    private static final jc zzj;
    private static volatile h2 zzk;
    private int zzb;
    private long zzh;
    private z1 zzi = z1.f3268w;
    private String zze = "";
    private t0 zzf = t0.f3098w;
    private String zzg = "";

    static {
        jc jcVar = new jc();
        zzj = jcVar;
        i1.p(jc.class, jcVar);
    }

    public static jc A(w0 w0Var, a1 a1Var) throws u1 {
        i1 i1VarI = zzj.i();
        try {
            m2 m2VarA = j2.f2783c.a(i1VarI.getClass());
            androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) w0Var.f3186x;
            if (kVar == null) {
                kVar = new androidx.datastore.preferences.protobuf.k(w0Var);
            }
            m2VarA.f(i1VarI, kVar, a1Var);
            m2VarA.h(i1VarI);
            i1.s(i1VarI);
            return (jc) i1VarI;
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

    public static jc B() {
        return zzj;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", ic.f2748a});
        }
        if (i10 == 3) {
            return new jc();
        }
        if (i10 == 4) {
            return new i8(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        if (i10 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (jc.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
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

    public final t0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final Map z() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
