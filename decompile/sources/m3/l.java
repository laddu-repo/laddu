package m3;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8585b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8586c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8587d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f8585b = str;
        this.f8586c = str2;
        this.f8587d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f8586c, lVar.f8586c) && Objects.equals(this.f8585b, lVar.f8585b) && Objects.equals(this.f8587d, lVar.f8587d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f8585b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (527 + i6) * 31;
        String str2 = this.f8586c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f8587d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // m3.j
    public final String toString() {
        return this.f8583a + ": domain=" + this.f8585b + ", description=" + this.f8586c;
    }
}
