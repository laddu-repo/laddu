package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p2 extends m5 {
    private static final p2 zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private c6 zzl;
    private c6 zzm;

    static {
        p2 p2Var = new p2();
        zzn = p2Var;
        m5.m(p2.class, p2Var);
    }

    public p2() {
        c6 c6Var = c6.f2169y;
        this.zzl = c6Var;
        this.zzm = c6Var;
        this.zzd = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zze = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzf = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzh = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzi = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzj = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static m2 O() {
        return (m2) zzn.h();
    }

    public static p2 P() {
        return zzn;
    }

    public final boolean A() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String B() {
        return this.zze;
    }

    public final boolean C() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long F() {
        return this.zzg;
    }

    public final boolean G() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String H() {
        return this.zzh;
    }

    public final boolean I() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String J() {
        return this.zzi;
    }

    public final boolean K() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final String L() {
        return this.zzj;
    }

    public final boolean M() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final long N() {
        return this.zzk;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void S(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void T() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void U(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void V() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void W(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzn;
                        }
                        throw null;
                    }
                    return new l5(zzn);
                }
                return new p2();
            }
            return new m6(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", n2.f2360a, "zzm", o2.f2370a});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void p(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void q() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void r(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void s() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final c6 w() {
        c6 c6Var = this.zzl;
        if (!c6Var.f2170x) {
            this.zzl = c6Var.a();
        }
        return this.zzl;
    }

    public final c6 x() {
        c6 c6Var = this.zzm;
        if (!c6Var.f2170x) {
            this.zzm = c6Var.a();
        }
        return this.zzm;
    }

    public final boolean y() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String z() {
        return this.zzd;
    }
}
