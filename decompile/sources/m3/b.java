package m3;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8559b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f8559b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8583a.equals(bVar.f8583a) && Arrays.equals(this.f8559b, bVar.f8559b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8559b) + h8.c.g(this.f8583a, 527, 31);
    }
}
