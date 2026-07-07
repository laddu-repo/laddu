package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x3 extends m5 {
    private static final x3 zzj;
    private int zzb;
    private int zzd;
    private s5 zze = l6.B;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzh;
    private double zzi;

    static {
        x3 x3Var = new x3();
        zzj = x3Var;
        m5.m(x3.class, x3Var);
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
                return new x3();
            }
            return new m6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", t1.f2439o, "zze", x3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final List p() {
        return this.zze;
    }

    public final String q() {
        return this.zzf;
    }

    public final boolean r() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String s() {
        return this.zzg;
    }

    public final boolean t() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final double w() {
        return this.zzi;
    }

    public final int x() {
        int i6;
        int i10 = this.zzd;
        if (i10 != 0) {
            i6 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i6 = 4;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            i6 = 0;
                        } else {
                            i6 = 5;
                        }
                    }
                } else {
                    i6 = 3;
                }
            }
        } else {
            i6 = 1;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }
}
