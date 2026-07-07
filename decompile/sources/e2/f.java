package e2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4238b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4239c;

    public f(String str, String str2, String str3) {
        this.f4237a = str;
        this.f4238b = str2;
        this.f4239c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f4237a, fVar.f4237a) && Objects.equals(this.f4238b, fVar.f4238b) && Objects.equals(this.f4239c, fVar.f4239c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f4237a.hashCode() * 31;
        int i10 = 0;
        String str = this.f4238b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (hashCode + i6) * 31;
        String str2 = this.f4239c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
