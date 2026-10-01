package r1;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final h f11431h = new h(1, 2, 3, null, -1, -1);

    /* renamed from: i, reason: collision with root package name */
    public static final String f11432i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11433k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11434l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11435m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f11436n;

    /* renamed from: a, reason: collision with root package name */
    public final int f11437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11439c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11440d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11441e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11442f;

    /* renamed from: g, reason: collision with root package name */
    public int f11443g;

    static {
        String str = u1.a0.f12750a;
        f11432i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        f11433k = Integer.toString(2, 36);
        f11434l = Integer.toString(3, 36);
        f11435m = Integer.toString(4, 36);
        f11436n = Integer.toString(5, 36);
    }

    public h(int i6, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f11437a = i6;
        this.f11438b = i10;
        this.f11439c = i11;
        this.f11440d = bArr;
        this.f11441e = i12;
        this.f11442f = i13;
    }

    public static String a(int i6) {
        if (i6 != -1) {
            if (i6 != 1) {
                if (i6 != 2) {
                    return h8.c.i(i6, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i6) {
        if (i6 != -1) {
            if (i6 != 6) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        return h8.c.i(i6, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i6) {
        if (i6 != -1) {
            if (i6 != 10) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 6) {
                                if (i6 != 7) {
                                    return h8.c.i(i6, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean e(h hVar) {
        if (hVar == null) {
            return true;
        }
        int i6 = hVar.f11437a;
        if (i6 == -1 || i6 == 1 || i6 == 2) {
            int i10 = hVar.f11438b;
            if (i10 == -1 || i10 == 2) {
                int i11 = hVar.f11439c;
                if ((i11 == -1 || i11 == 3) && hVar.f11440d == null) {
                    int i12 = hVar.f11442f;
                    if (i12 == -1 || i12 == 8) {
                        int i13 = hVar.f11441e;
                        if (i13 == -1 || i13 == 8) {
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
        return false;
    }

    public static int f(int i6) {
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 9) {
            return 6;
        }
        if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i6) {
        if (i6 != 1) {
            if (i6 != 4) {
                if (i6 != 13) {
                    if (i6 == 16) {
                        return 6;
                    }
                    if (i6 == 18) {
                        return 7;
                    }
                    if (i6 != 6 && i6 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean d() {
        if (this.f11437a != -1 && this.f11438b != -1 && this.f11439c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f11437a == hVar.f11437a && this.f11438b == hVar.f11438b && this.f11439c == hVar.f11439c && Arrays.equals(this.f11440d, hVar.f11440d) && this.f11441e == hVar.f11441e && this.f11442f == hVar.f11442f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f11443g == 0) {
            this.f11443g = ((((Arrays.hashCode(this.f11440d) + ((((((527 + this.f11437a) * 31) + this.f11438b) * 31) + this.f11439c) * 31)) * 31) + this.f11441e) * 31) + this.f11442f;
        }
        return this.f11443g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f11437a));
        sb2.append(", ");
        sb2.append(a(this.f11438b));
        sb2.append(", ");
        sb2.append(c(this.f11439c));
        sb2.append(", ");
        if (this.f11440d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str2 = "NA";
        int i6 = this.f11441e;
        if (i6 == -1) {
            str = "NA";
        } else {
            str = i6 + "bit Luma";
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f11442f;
        if (i10 != -1) {
            str2 = i10 + "bit Chroma";
        }
        return r4.a.o(sb2, str2, ")");
    }
}
