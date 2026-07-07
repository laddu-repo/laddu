package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g2 extends m5 {
    private static final g2 zzu;
    private int zzb;
    private long zzd;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzf;
    private s5 zzg;
    private s5 zzh;
    private s5 zzi;
    private String zzj;
    private boolean zzk;
    private s5 zzl;
    private s5 zzm;
    private String zzn;
    private String zzo;
    private b2 zzp;
    private i2 zzq;
    private l2 zzr;
    private j2 zzs;
    private h2 zzt;

    static {
        g2 g2Var = new g2();
        zzu = g2Var;
        m5.m(g2.class, g2Var);
    }

    public g2() {
        l6 l6Var = l6.B;
        this.zzg = l6Var;
        this.zzh = l6Var;
        this.zzi = l6Var;
        this.zzj = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzl = l6Var;
        this.zzm = l6Var;
        this.zzn = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzo = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static f2 F() {
        return (f2) zzu.h();
    }

    public static g2 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final b2 C() {
        b2 b2Var = this.zzp;
        if (b2Var == null) {
            return b2.v();
        }
        return b2Var;
    }

    public final boolean D() {
        if ((this.zzb & 512) != 0) {
            return true;
        }
        return false;
    }

    public final l2 E() {
        l2 l2Var = this.zzr;
        if (l2Var == null) {
            return l2.r();
        }
        return l2Var;
    }

    public final void H(int i6, e2 e2Var) {
        s5 s5Var = this.zzh;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzh = s5Var.i(size + size);
        }
        this.zzh.set(i6, e2Var);
    }

    public final void I() {
        this.zzi = l6.B;
    }

    public final void J() {
        this.zzl = l6.B;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzu;
                        }
                        throw null;
                    }
                    return new l5(zzu);
                }
                return new g2();
            }
            return new m6(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", k2.class, "zzh", e2.class, "zzi", n1.class, "zzj", "zzk", "zzl", w3.class, "zzm", c2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        return (byte) 1;
    }

    public final boolean p() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String s() {
        return this.zze;
    }

    public final s5 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final e2 v(int i6) {
        return (e2) this.zzh.get(i6);
    }

    public final s5 w() {
        return this.zzi;
    }

    public final s5 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
