package gb;

import java.io.Serializable;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f5598z = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f5599x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5600y;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f5599x = iArr;
        this.f5600y = length;
    }

    public final boolean equals(Object obj) {
        a aVar;
        int i6;
        int i10;
        if (obj != this) {
            if ((obj instanceof a) && (i10 = this.f5600y) == (i6 = (aVar = (a) obj).f5600y)) {
                for (int i11 = 0; i11 < i10; i11++) {
                    jb.b.e(i11, i10);
                    int i12 = this.f5599x[i11];
                    jb.b.e(i11, i6);
                    if (i12 == aVar.f5599x[i11]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f5600y; i10++) {
            i6 = (i6 * 31) + this.f5599x[i10];
        }
        return i6;
    }

    public final String toString() {
        int i6 = this.f5600y;
        if (i6 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i6 * 5);
        sb2.append('[');
        int[] iArr = this.f5599x;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i6; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
