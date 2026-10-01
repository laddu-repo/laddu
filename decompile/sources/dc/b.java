package dc;

import y.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4074b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4075c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4076d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4077e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4078f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4079g;

    public b(String str, int i6, String str2, String str3, long j, long j10, String str4) {
        this.f4073a = str;
        this.f4074b = i6;
        this.f4075c = str2;
        this.f4076d = str3;
        this.f4077e = j;
        this.f4078f = j10;
        this.f4079g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, dc.a] */
    public final a a() {
        ?? obj = new Object();
        obj.f4067b = this.f4073a;
        obj.f4066a = this.f4074b;
        obj.f4068c = this.f4075c;
        obj.f4069d = this.f4076d;
        obj.f4071f = Long.valueOf(this.f4077e);
        obj.f4072g = Long.valueOf(this.f4078f);
        obj.f4070e = this.f4079g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f4079g;
                String str2 = bVar.f4076d;
                String str3 = bVar.f4075c;
                String str4 = bVar.f4073a;
                String str5 = this.f4073a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (e.a(this.f4074b, bVar.f4074b)) {
                    String str6 = this.f4075c;
                    if (str6 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str3)) {
                        return false;
                    }
                    String str7 = this.f4076d;
                    if (str7 == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str7.equals(str2)) {
                        return false;
                    }
                    if (this.f4077e == bVar.f4077e && this.f4078f == bVar.f4078f) {
                        String str8 = this.f4079g;
                        if (str8 == null) {
                            if (str == null) {
                                return true;
                            }
                            return false;
                        }
                        if (str8.equals(str)) {
                            return true;
                        }
                        return false;
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
        int hashCode2;
        int hashCode3;
        int i6 = 0;
        String str = this.f4073a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ e.c(this.f4074b)) * 1000003;
        String str2 = this.f4075c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (c10 ^ hashCode2) * 1000003;
        String str3 = this.f4076d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        long j = this.f4077e;
        int i12 = (i11 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f4078f;
        int i13 = (i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f4079g;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i6 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f4073a);
        sb2.append(", registrationStatus=");
        int i6 = this.f4074b;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f4075c);
        sb2.append(", refreshToken=");
        sb2.append(this.f4076d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f4077e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f4078f);
        sb2.append(", fisError=");
        return r4.a.o(sb2, this.f4079g, "}");
    }
}
