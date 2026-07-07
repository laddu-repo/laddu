package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c3 extends m5 {
    private static final c3 zzi;
    private int zzb;
    private s5 zzd = l6.B;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzf;
    private long zzg;
    private int zzh;

    static {
        c3 c3Var = new c3();
        zzi = c3Var;
        m5.m(c3.class, c3Var);
    }

    public static b3 z() {
        return (b3) zzi.h();
    }

    public final /* synthetic */ void A(int i6, f3 f3Var) {
        I();
        this.zzd.set(i6, f3Var);
    }

    public final /* synthetic */ void B(f3 f3Var) {
        f3Var.getClass();
        I();
        this.zzd.add(f3Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        I();
        v4.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = l6.B;
    }

    public final /* synthetic */ void E(int i6) {
        I();
        this.zzd.remove(i6);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final void I() {
        s5 s5Var = this.zzd;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzd = s5Var.i(size + size);
        }
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzi;
                        }
                        throw null;
                    }
                    return new l5(zzi);
                }
                return new c3();
            }
            return new m6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzb", "zzd", f3.class, "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final f3 r(int i6) {
        return (f3) this.zzd.get(i6);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int y() {
        return this.zzh;
    }
}
