package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f3 extends m5 {
    private static final f3 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private s5 zzi = l6.B;

    static {
        f3 f3Var = new f3();
        zzj = f3Var;
        m5.m(f3.class, f3Var);
    }

    public static e3 B() {
        return (e3) zzj.h();
    }

    public final int A() {
        return this.zzi.size();
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void H(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final void J(f3 f3Var) {
        s5 s5Var = this.zzi;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzi = s5Var.i(size + size);
        }
        this.zzi.add(f3Var);
    }

    public final void K(ArrayList arrayList) {
        s5 s5Var = this.zzi;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzi = s5Var.i(size + size);
        }
        v4.c(arrayList, this.zzi);
    }

    public final void L() {
        this.zzi = l6.B;
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
                return new f3();
            }
            return new m6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", f3.class});
        }
        return (byte) 1;
    }

    public final boolean p() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String q() {
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

    public final boolean t() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final float w() {
        return this.zzg;
    }

    public final boolean x() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final double y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzi;
    }
}
