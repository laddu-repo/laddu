package s3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f12055a;

    /* renamed from: b, reason: collision with root package name */
    public int f12056b;

    /* renamed from: c, reason: collision with root package name */
    public int f12057c;

    /* renamed from: d, reason: collision with root package name */
    public int f12058d;

    /* renamed from: e, reason: collision with root package name */
    public int f12059e;

    public boolean a() {
        int i6;
        int i10;
        int i11;
        int i12 = this.f12055a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.f12058d;
            int i15 = this.f12056b;
            if (i14 > i15) {
                i11 = 1;
            } else if (i14 == i15) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.f12058d;
            int i17 = this.f12057c;
            if (i16 > i17) {
                i10 = 1;
            } else if (i16 == i17) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.f12059e;
            int i19 = this.f12056b;
            if (i18 > i19) {
                i6 = 1;
            } else if (i18 == i19) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            if (((i6 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f12059e;
            int i21 = this.f12057c;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
