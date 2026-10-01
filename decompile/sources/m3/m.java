package m3;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f8588b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8589c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8590d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f8591e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8592f;

    public m(int i6, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f8588b = i6;
        this.f8589c = i10;
        this.f8590d = i11;
        this.f8591e = iArr;
        this.f8592f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f8588b == mVar.f8588b && this.f8589c == mVar.f8589c && this.f8590d == mVar.f8590d && Arrays.equals(this.f8591e, mVar.f8591e) && Arrays.equals(this.f8592f, mVar.f8592f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8592f) + ((Arrays.hashCode(this.f8591e) + ((((((527 + this.f8588b) * 31) + this.f8589c) * 31) + this.f8590d) * 31)) * 31);
    }
}
