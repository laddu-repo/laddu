package z6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14789e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14791h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f14792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14794l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f14785a = num;
        this.f14786b = str;
        this.f14787c = str2;
        this.f14788d = str3;
        this.f14789e = str4;
        this.f = str5;
        this.f14790g = str6;
        this.f14791h = str7;
        this.i = str8;
        this.f14792j = str9;
        this.f14793k = str10;
        this.f14794l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f14785a;
            if (num != null ? num.equals(((l) aVar).f14785a) : ((l) aVar).f14785a == null) {
                String str = this.f14786b;
                if (str != null ? str.equals(((l) aVar).f14786b) : ((l) aVar).f14786b == null) {
                    String str2 = this.f14787c;
                    if (str2 != null ? str2.equals(((l) aVar).f14787c) : ((l) aVar).f14787c == null) {
                        String str3 = this.f14788d;
                        if (str3 != null ? str3.equals(((l) aVar).f14788d) : ((l) aVar).f14788d == null) {
                            String str4 = this.f14789e;
                            if (str4 != null ? str4.equals(((l) aVar).f14789e) : ((l) aVar).f14789e == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(((l) aVar).f) : ((l) aVar).f == null) {
                                    String str6 = this.f14790g;
                                    if (str6 != null ? str6.equals(((l) aVar).f14790g) : ((l) aVar).f14790g == null) {
                                        String str7 = this.f14791h;
                                        if (str7 != null ? str7.equals(((l) aVar).f14791h) : ((l) aVar).f14791h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((l) aVar).i) : ((l) aVar).i == null) {
                                                String str9 = this.f14792j;
                                                if (str9 != null ? str9.equals(((l) aVar).f14792j) : ((l) aVar).f14792j == null) {
                                                    String str10 = this.f14793k;
                                                    if (str10 != null ? str10.equals(((l) aVar).f14793k) : ((l) aVar).f14793k == null) {
                                                        String str11 = this.f14794l;
                                                        if (str11 != null ? str11.equals(((l) aVar).f14794l) : ((l) aVar).f14794l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f14785a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f14786b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f14787c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14788d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f14789e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f14790g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f14791h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f14792j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f14793k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f14794l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f14785a);
        sb2.append(", model=");
        sb2.append(this.f14786b);
        sb2.append(", hardware=");
        sb2.append(this.f14787c);
        sb2.append(", device=");
        sb2.append(this.f14788d);
        sb2.append(", product=");
        sb2.append(this.f14789e);
        sb2.append(", osBuild=");
        sb2.append(this.f);
        sb2.append(", manufacturer=");
        sb2.append(this.f14790g);
        sb2.append(", fingerprint=");
        sb2.append(this.f14791h);
        sb2.append(", locale=");
        sb2.append(this.i);
        sb2.append(", country=");
        sb2.append(this.f14792j);
        sb2.append(", mccMnc=");
        sb2.append(this.f14793k);
        sb2.append(", applicationBuild=");
        return j4.a.n(sb2, this.f14794l, "}");
    }
}
