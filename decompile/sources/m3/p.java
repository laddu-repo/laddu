package m3;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8597b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8598c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f8597b = str2;
        this.f8598c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f8583a.equals(pVar.f8583a) && Objects.equals(this.f8597b, pVar.f8597b) && Objects.equals(this.f8598c, pVar.f8598c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int g10 = h8.c.g(this.f8583a, 527, 31);
        int i10 = 0;
        String str = this.f8597b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (g10 + i6) * 31;
        String str2 = this.f8598c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override // m3.j
    public final String toString() {
        return this.f8583a + ": url=" + this.f8598c;
    }
}
