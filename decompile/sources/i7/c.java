package i7;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f6630a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6631b;

    public c(float[] fArr, int[] iArr) {
        this.f6630a = fArr;
        this.f6631b = iArr;
    }

    public final void a(c cVar) {
        int i6 = 0;
        while (true) {
            int[] iArr = cVar.f6631b;
            if (i6 < iArr.length) {
                this.f6630a[i6] = cVar.f6630a[i6];
                this.f6631b[i6] = iArr[i6];
                i6++;
            } else {
                return;
            }
        }
    }

    public final c b(float[] fArr) {
        int i6;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f3 = fArr[i10];
            float[] fArr2 = this.f6630a;
            int binarySearch = Arrays.binarySearch(fArr2, f3);
            int[] iArr2 = this.f6631b;
            if (binarySearch >= 0) {
                i6 = iArr2[binarySearch];
            } else {
                int i11 = -(binarySearch + 1);
                if (i11 == 0) {
                    i6 = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    i6 = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f10 = fArr2[i12];
                    i6 = a8.g.i((f3 - f10) / (fArr2[i11] - f10), iArr2[i12], iArr2[i11]);
                }
            }
            iArr[i10] = i6;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f6630a, cVar.f6630a) && Arrays.equals(this.f6631b, cVar.f6631b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6631b) + (Arrays.hashCode(this.f6630a) * 31);
    }
}
