package ec;

import b2.k;
import y.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4550a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4552c;

    public b(int i6, String str, long j) {
        this.f4550a = str;
        this.f4551b = j;
        this.f4552c = i6;
    }

    public static k a() {
        k kVar = new k((byte) 0, 5);
        kVar.f1384z = 0L;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i6 = bVar.f4552c;
                String str = bVar.f4550a;
                String str2 = this.f4550a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f4551b == bVar.f4551b) {
                    int i10 = this.f4552c;
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        String str = this.f4550a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f4551b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i11 = this.f4552c;
        if (i11 != 0) {
            i6 = e.c(i11);
        }
        return i6 ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f4550a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f4551b);
        sb2.append(", responseCode=");
        int i6 = this.f4552c;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
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
