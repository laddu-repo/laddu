package y2;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f14963a;

    /* renamed from: b, reason: collision with root package name */
    public int f14964b;

    /* renamed from: c, reason: collision with root package name */
    public int f14965c;

    /* renamed from: d, reason: collision with root package name */
    public int f14966d;

    /* renamed from: e, reason: collision with root package name */
    public int f14967e;

    /* renamed from: f, reason: collision with root package name */
    public int f14968f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f14969g;

    public boolean a(int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i6 & (-2097152)) != -2097152 || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0 || (i12 = (i6 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i6 >>> 10) & 3) == 3) {
            return false;
        }
        this.f14963a = i10;
        this.f14969g = a.s[3 - i11];
        int i16 = a.f14843t[i13];
        this.f14965c = i16;
        int i17 = 2;
        if (i10 == 2) {
            this.f14965c = i16 / 2;
        } else if (i10 == 0) {
            this.f14965c = i16 / 4;
        }
        int i18 = (i6 >>> 9) & 1;
        int i19 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    i19 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i10 != 3) {
            i19 = 576;
        }
        this.f14968f = i19;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = a.f14844u[i12 - 1];
            } else {
                i15 = a.f14845v[i12 - 1];
            }
            this.f14967e = i15;
            this.f14964b = (((i15 * 12) / this.f14965c) + i18) * 4;
        } else {
            int i20 = 144;
            if (i10 == 3) {
                if (i11 == 2) {
                    i14 = a.f14846w[i12 - 1];
                } else {
                    i14 = a.f14847x[i12 - 1];
                }
                this.f14967e = i14;
                this.f14964b = ((i14 * 144) / this.f14965c) + i18;
            } else {
                int i21 = a.f14848y[i12 - 1];
                this.f14967e = i21;
                if (i11 == 1) {
                    i20 = 72;
                }
                this.f14964b = ((i20 * i21) / this.f14965c) + i18;
            }
        }
        if (((i6 >> 6) & 3) == 3) {
            i17 = 1;
        }
        this.f14966d = i17;
        return true;
    }
}
