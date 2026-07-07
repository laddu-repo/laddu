package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 extends m5 {
    private static final p1 zzl;
    private int zzb;
    private int zzd;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private s5 zzf = l6.B;
    private boolean zzg;
    private u1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        p1 p1Var = new p1();
        zzl = p1Var;
        m5.m(p1.class, p1Var);
    }

    public static o1 B() {
        return (o1) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i6, r1 r1Var) {
        s5 s5Var = this.zzf;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzf = s5Var.i(size + size);
        }
        this.zzf.set(i6, r1Var);
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzl;
                        }
                        throw null;
                    }
                    return new l5(zzl);
                }
                return new p1();
            }
            return new m6(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", r1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final boolean p() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final r1 u(int i6) {
        return (r1) this.zzf.get(i6);
    }

    public final boolean v() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final u1 w() {
        u1 u1Var = this.zzh;
        if (u1Var == null) {
            return u1.y();
        }
        return u1Var;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }
}
