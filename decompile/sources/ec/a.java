package ec;

import y.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4546b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4547c;

    /* renamed from: d, reason: collision with root package name */
    public final b f4548d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4549e;

    public a(String str, String str2, String str3, b bVar, int i6) {
        this.f4545a = str;
        this.f4546b = str2;
        this.f4547c = str3;
        this.f4548d = bVar;
        this.f4549e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i6 = aVar.f4549e;
                b bVar = aVar.f4548d;
                String str = aVar.f4547c;
                String str2 = aVar.f4546b;
                String str3 = aVar.f4545a;
                String str4 = this.f4545a;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = this.f4546b;
                if (str5 == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str5.equals(str2)) {
                    return false;
                }
                String str6 = this.f4547c;
                if (str6 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str6.equals(str)) {
                    return false;
                }
                b bVar2 = this.f4548d;
                if (bVar2 == null) {
                    if (bVar != null) {
                        return false;
                    }
                } else if (!bVar2.equals(bVar)) {
                    return false;
                }
                int i10 = this.f4549e;
                if (i10 == 0) {
                    if (i6 == 0) {
                        return true;
                    }
                    return false;
                }
                if (e.a(i10, i6)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i6 = 0;
        String str = this.f4545a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f4546b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f4547c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        b bVar = this.f4548d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        int i14 = this.f4549e;
        if (i14 != 0) {
            i6 = e.c(i14);
        }
        return i6 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f4545a);
        sb2.append(", fid=");
        sb2.append(this.f4546b);
        sb2.append(", refreshToken=");
        sb2.append(this.f4547c);
        sb2.append(", authToken=");
        sb2.append(this.f4548d);
        sb2.append(", responseCode=");
        int i6 = this.f4549e;
        if (i6 != 1) {
            if (i6 != 2) {
                str = "null";
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
