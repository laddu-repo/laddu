package m3;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8571b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8572c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8573d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f8571b = str;
        this.f8572c = str2;
        this.f8573d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f8572c, eVar.f8572c) && Objects.equals(this.f8571b, eVar.f8571b) && Objects.equals(this.f8573d, eVar.f8573d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f8571b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (527 + i6) * 31;
        String str2 = this.f8572c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f8573d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // m3.j
    public final String toString() {
        return this.f8583a + ": language=" + this.f8571b + ", description=" + this.f8572c + ", text=" + this.f8573d;
    }
}
