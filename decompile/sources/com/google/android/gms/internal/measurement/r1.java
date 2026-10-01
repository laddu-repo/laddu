package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r1 extends m5 {
    private static final r1 zzh;
    private int zzb;
    private x1 zzd;
    private u1 zze;
    private boolean zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        r1 r1Var = new r1();
        zzh = r1Var;
        m5.m(r1.class, r1Var);
    }

    public static r1 x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzh;
                        }
                        throw null;
                    }
                    return new l5(zzh);
                }
                return new r1();
            }
            return new m6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean p() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final x1 q() {
        x1 x1Var = this.zzd;
        if (x1Var == null) {
            return x1.w();
        }
        return x1Var;
    }

    public final boolean r() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final u1 s() {
        u1 u1Var = this.zze;
        if (u1Var == null) {
            return u1.y();
        }
        return u1Var;
    }

    public final boolean t() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
