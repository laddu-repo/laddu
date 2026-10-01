package f8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5115c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5116d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5117e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5118f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5119g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5120h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5121i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5122k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5123l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5113a = num;
        this.f5114b = str;
        this.f5115c = str2;
        this.f5116d = str3;
        this.f5117e = str4;
        this.f5118f = str5;
        this.f5119g = str6;
        this.f5120h = str7;
        this.f5121i = str8;
        this.j = str9;
        this.f5122k = str10;
        this.f5123l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f5113a;
            if (num != null ? num.equals(((h) aVar).f5113a) : ((h) aVar).f5113a == null) {
                String str = this.f5114b;
                if (str != null ? str.equals(((h) aVar).f5114b) : ((h) aVar).f5114b == null) {
                    String str2 = this.f5115c;
                    if (str2 != null ? str2.equals(((h) aVar).f5115c) : ((h) aVar).f5115c == null) {
                        String str3 = this.f5116d;
                        if (str3 != null ? str3.equals(((h) aVar).f5116d) : ((h) aVar).f5116d == null) {
                            String str4 = this.f5117e;
                            if (str4 != null ? str4.equals(((h) aVar).f5117e) : ((h) aVar).f5117e == null) {
                                String str5 = this.f5118f;
                                if (str5 != null ? str5.equals(((h) aVar).f5118f) : ((h) aVar).f5118f == null) {
                                    String str6 = this.f5119g;
                                    if (str6 != null ? str6.equals(((h) aVar).f5119g) : ((h) aVar).f5119g == null) {
                                        String str7 = this.f5120h;
                                        if (str7 != null ? str7.equals(((h) aVar).f5120h) : ((h) aVar).f5120h == null) {
                                            String str8 = this.f5121i;
                                            if (str8 != null ? str8.equals(((h) aVar).f5121i) : ((h) aVar).f5121i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((h) aVar).j) : ((h) aVar).j == null) {
                                                    String str10 = this.f5122k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f5122k) : ((h) aVar).f5122k == null) {
                                                        String str11 = this.f5123l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f5123l) : ((h) aVar).f5123l == null) {
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i6 = 0;
        Integer num = this.f5113a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str = this.f5114b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str2 = this.f5115c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str3 = this.f5116d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        String str4 = this.f5117e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        String str5 = this.f5118f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 ^ hashCode6) * 1000003;
        String str6 = this.f5119g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 ^ hashCode7) * 1000003;
        String str7 = this.f5120h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 ^ hashCode8) * 1000003;
        String str8 = this.f5121i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (i17 ^ hashCode9) * 1000003;
        String str9 = this.j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i19 = (i18 ^ hashCode10) * 1000003;
        String str10 = this.f5122k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i20 = (i19 ^ hashCode11) * 1000003;
        String str11 = this.f5123l;
        if (str11 != null) {
            i6 = str11.hashCode();
        }
        return i6 ^ i20;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f5113a);
        sb2.append(", model=");
        sb2.append(this.f5114b);
        sb2.append(", hardware=");
        sb2.append(this.f5115c);
        sb2.append(", device=");
        sb2.append(this.f5116d);
        sb2.append(", product=");
        sb2.append(this.f5117e);
        sb2.append(", osBuild=");
        sb2.append(this.f5118f);
        sb2.append(", manufacturer=");
        sb2.append(this.f5119g);
        sb2.append(", fingerprint=");
        sb2.append(this.f5120h);
        sb2.append(", locale=");
        sb2.append(this.f5121i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.f5122k);
        sb2.append(", applicationBuild=");
        return r4.a.o(sb2, this.f5123l, "}");
    }
}
