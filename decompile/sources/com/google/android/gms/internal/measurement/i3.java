package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i3 extends m5 {
    private static final i3 zzh;
    private int zzb;
    private s5 zzd = l6.B;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzg;

    static {
        i3 i3Var = new i3();
        zzh = i3Var;
        m5.m(i3.class, i3Var);
    }

    public static h3 w() {
        return (h3) zzh.h();
    }

    public static h3 x(i3 i3Var) {
        l5 h4 = zzh.h();
        h4.f(i3Var);
        return (h3) h4;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        v4.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = l6.B;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
                            return zzh;
                        }
                        throw null;
                    }
                    return new l5(zzh);
                }
                return new i3();
            }
            return new m6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", k3.class, "zze", "zzf", "zzg", t1.j});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final k3 r(int i6) {
        return (k3) this.zzd.get(i6);
    }

    public final boolean s() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i6, k3 k3Var) {
        E();
        this.zzd.set(i6, k3Var);
    }

    public final /* synthetic */ void z(k3 k3Var) {
        E();
        this.zzd.add(k3Var);
    }
}
