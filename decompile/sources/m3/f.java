package m3;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8575c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8576d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8577e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f8574b = str;
        this.f8575c = str2;
        this.f8576d = str3;
        this.f8577e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f8574b, fVar.f8574b) && Objects.equals(this.f8575c, fVar.f8575c) && Objects.equals(this.f8576d, fVar.f8576d) && Arrays.equals(this.f8577e, fVar.f8577e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f8574b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (527 + i6) * 31;
        String str2 = this.f8575c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f8576d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.f8577e) + ((i13 + i11) * 31);
    }

    @Override // m3.j
    public final String toString() {
        return this.f8583a + ": mimeType=" + this.f8574b + ", filename=" + this.f8575c + ", description=" + this.f8576d;
    }
}
