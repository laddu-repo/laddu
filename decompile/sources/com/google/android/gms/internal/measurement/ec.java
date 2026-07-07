package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ec extends i1 {
    private static final ec zzh;
    private static volatile h2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        ec ecVar = new ec();
        zzh = ecVar;
        i1.p(ec.class, ecVar);
    }

    public static dc A() {
        return (dc) zzh.k();
    }

    public static ec B() {
        return zzh;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void D(long j8) {
        this.zze = 1;
        this.zzf = Long.valueOf(j8);
    }

    public final /* synthetic */ void E(boolean z2) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z2);
    }

    public final /* synthetic */ void F(double d10) {
        this.zze = 3;
        this.zzf = Double.valueOf(d10);
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void H(s0 s0Var) {
        s0Var.getClass();
        this.zze = 5;
        this.zzf = s0Var;
    }

    public final int I() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i10 = 1;
        if (i != 1) {
            i10 = 2;
            if (i != 2) {
                i10 = 3;
                if (i != 3) {
                    i10 = 4;
                    if (i != 4) {
                        i10 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l2(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i10 == 3) {
            return new ec();
        }
        if (i10 == 4) {
            return new dc(zzh);
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
        synchronized (ec.class) {
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
        return this.zzg;
    }

    public final long v() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean w() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double x() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String y() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final t0 z() {
        return this.zze == 5 ? (t0) this.zzf : t0.f3098w;
    }
}
