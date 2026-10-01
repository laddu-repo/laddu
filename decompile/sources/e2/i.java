package e2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4249b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4250c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4251d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4252e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f4248a = str;
        this.f4249b = str2;
        this.f4250c = str3;
        this.f4251d = str4;
        this.f4252e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f4248a, iVar.f4248a) && Objects.equals(this.f4249b, iVar.f4249b) && Objects.equals(this.f4250c, iVar.f4250c) && Objects.equals(this.f4251d, iVar.f4251d) && Objects.equals(this.f4252e, iVar.f4252e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f4248a;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (527 + i6) * 31;
        String str2 = this.f4249b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f4250c;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f4251d;
        if (str4 != null) {
            i12 = str4.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str5 = this.f4252e;
        if (str5 != null) {
            i13 = str5.hashCode();
        }
        return i17 + i13;
    }
}
