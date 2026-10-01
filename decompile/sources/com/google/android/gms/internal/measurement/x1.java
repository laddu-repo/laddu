package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x1 extends m5 {
    private static final x1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private s5 zzg = l6.B;

    static {
        x1 x1Var = new x1();
        zzh = x1Var;
        m5.m(x1.class, x1Var);
    }

    public static x1 w() {
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
                return new x1();
            }
            return new m6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", t1.f2428c, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean p() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
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

    public final boolean t() {
        return this.zzf;
    }

    public final s5 u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int x() {
        int i6;
        switch (this.zzd) {
            case 0:
                i6 = 1;
                break;
            case 1:
                i6 = 2;
                break;
            case 2:
                i6 = 3;
                break;
            case 3:
                i6 = 4;
                break;
            case 4:
                i6 = 5;
                break;
            case 5:
                i6 = 6;
                break;
            case 6:
                i6 = 7;
                break;
            default:
                i6 = 0;
                break;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }
}
