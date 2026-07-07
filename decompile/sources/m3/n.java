package m3;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8593b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8594c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f8593b = str;
        this.f8594c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f8593b, nVar.f8593b) && Arrays.equals(this.f8594c, nVar.f8594c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        String str = this.f8593b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return Arrays.hashCode(this.f8594c) + ((527 + i6) * 31);
    }

    @Override // m3.j
    public final String toString() {
        return this.f8583a + ": owner=" + this.f8593b;
    }
}
