package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t3 extends m5 {
    private static final t3 zzj;
    private int zzb;
    private long zzd;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        t3 t3Var = new t3();
        zzj = t3Var;
        m5.m(t3.class, t3Var);
    }

    public static s3 A() {
        return (s3) zzj.h();
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void H(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzj;
                        }
                        throw null;
                    }
                    return new l5(zzj);
                }
                return new t3();
            }
            return new m6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
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

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long v() {
        return this.zzg;
    }

    public final boolean w() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final float x() {
        return this.zzh;
    }

    public final boolean y() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final double z() {
        return this.zzi;
    }
}
