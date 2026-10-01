package q3;

import y2.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f11082d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11083a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f11084b;

    /* renamed from: c, reason: collision with root package name */
    public int f11085c;

    public static long a(int i6, boolean z10, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z10) {
            j &= ~f11082d[i6 - 1];
        }
        for (int i10 = 1; i10 < i6; i10++) {
            j = (j << 8) | (bArr[i10] & 255);
        }
        return j;
    }

    public final long b(p pVar, boolean z10, boolean z11, int i6) {
        int i10;
        int i11 = this.f11084b;
        byte[] bArr = this.f11083a;
        if (i11 == 0) {
            if (!pVar.d(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 < 8) {
                    if ((f11082d[i13] & i12) != 0) {
                        i10 = i13 + 1;
                        break;
                    }
                    i13++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            this.f11085c = i10;
            if (i10 != -1) {
                this.f11084b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i14 = this.f11085c;
        if (i14 > i6) {
            this.f11084b = 0;
            return -2L;
        }
        if (i14 != 1) {
            pVar.readFully(bArr, 1, i14 - 1);
        }
        this.f11084b = 0;
        return a(this.f11085c, z11, bArr);
    }
}
