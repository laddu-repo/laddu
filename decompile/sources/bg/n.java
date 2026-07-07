package bg;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class n implements Serializable, Comparable {
    public static final n A = new n(new byte[0]);

    /* renamed from: x */
    public final byte[] f1728x;

    /* renamed from: y */
    public transient int f1729y;

    /* renamed from: z */
    public transient String f1730z;

    public n(byte[] data) {
        kotlin.jvm.internal.k.e(data, "data");
        this.f1728x = data;
    }

    public static int g(n nVar, n other) {
        nVar.getClass();
        kotlin.jvm.internal.k.e(other, "other");
        return nVar.f(0, other.h());
    }

    public static int k(n nVar, n other) {
        nVar.getClass();
        kotlin.jvm.internal.k.e(other, "other");
        return nVar.j(other.h());
    }

    public static /* synthetic */ n o(n nVar, int i6, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return nVar.n(i6, i10);
    }

    public String a() {
        byte[] map = a.f1687a;
        byte[] bArr = this.f1728x;
        kotlin.jvm.internal.k.e(bArr, "<this>");
        kotlin.jvm.internal.k.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            byte b10 = bArr[i6];
            int i11 = i6 + 2;
            byte b11 = bArr[i6 + 1];
            i6 += 3;
            byte b12 = bArr[i11];
            bArr2[i10] = map[(b10 & 255) >> 2];
            bArr2[i10 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i13 = i6 + 1;
                byte b13 = bArr[i6];
                byte b14 = bArr[i13];
                bArr2[i10] = map[(b13 & 255) >> 2];
                bArr2[i10 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr2[i10 + 2] = map[(b14 & 15) << 2];
                bArr2[i10 + 3] = 61;
            }
        } else {
            byte b15 = bArr[i6];
            bArr2[i10] = map[(b15 & 255) >> 2];
            bArr2[i10 + 1] = map[(b15 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        }
        return new String(bArr2, df.a.f4115a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(n other) {
        kotlin.jvm.internal.k.e(other, "other");
        int d10 = d();
        int d11 = other.d();
        int min = Math.min(d10, d11);
        for (int i6 = 0; i6 < min; i6++) {
            int i10 = i(i6) & 255;
            int i11 = other.i(i6) & 255;
            if (i10 != i11) {
                if (i10 < i11) {
                    return -1;
                }
                return 1;
            }
        }
        if (d10 == d11) {
            return 0;
        }
        if (d10 < d11) {
            return -1;
        }
        return 1;
    }

    public n c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f1728x, 0, d());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.k.b(digest);
        return new n(digest);
    }

    public int d() {
        return this.f1728x.length;
    }

    public String e() {
        byte[] bArr = this.f1728x;
        char[] cArr = new char[bArr.length * 2];
        int i6 = 0;
        for (byte b10 : bArr) {
            int i10 = i6 + 1;
            char[] cArr2 = cg.b.f2089a;
            cArr[i6] = cArr2[(b10 >> 4) & 15];
            i6 += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                int d10 = nVar.d();
                byte[] bArr = this.f1728x;
                if (d10 == bArr.length && nVar.m(0, bArr, 0, bArr.length)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(int i6, byte[] other) {
        kotlin.jvm.internal.k.e(other, "other");
        byte[] bArr = this.f1728x;
        int length = bArr.length - other.length;
        int max = Math.max(i6, 0);
        if (max <= length) {
            while (!b.b(max, 0, other.length, bArr, other)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f1728x;
    }

    public int hashCode() {
        int i6 = this.f1729y;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = Arrays.hashCode(this.f1728x);
        this.f1729y = hashCode;
        return hashCode;
    }

    public byte i(int i6) {
        return this.f1728x[i6];
    }

    public int j(byte[] other) {
        kotlin.jvm.internal.k.e(other, "other");
        int d10 = d();
        byte[] bArr = this.f1728x;
        for (int min = Math.min(d10, bArr.length - other.length); -1 < min; min--) {
            if (b.b(min, 0, other.length, bArr, other)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i6, n other, int i10) {
        kotlin.jvm.internal.k.e(other, "other");
        return other.m(0, this.f1728x, i6, i10);
    }

    public boolean m(int i6, byte[] other, int i10, int i11) {
        kotlin.jvm.internal.k.e(other, "other");
        if (i6 >= 0) {
            byte[] bArr = this.f1728x;
            if (i6 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && b.b(i6, i10, i11, bArr, other)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public n n(int i6, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i6 >= 0) {
            byte[] bArr = this.f1728x;
            if (i10 <= bArr.length) {
                if (i10 - i6 >= 0) {
                    if (i6 == 0 && i10 == bArr.length) {
                        return this;
                    }
                    return new n(ie.i.g0(bArr, i6, i10));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public n p() {
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f1728x;
            if (i6 < bArr.length) {
                byte b10 = bArr[i6];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
                    copyOf[i6] = (byte) (b10 + 32);
                    for (int i10 = i6 + 1; i10 < copyOf.length; i10++) {
                        byte b11 = copyOf[i10];
                        if (b11 >= 65 && b11 <= 90) {
                            copyOf[i10] = (byte) (b11 + 32);
                        }
                    }
                    return new n(copyOf);
                }
                i6++;
            } else {
                return this;
            }
        }
    }

    public final String q() {
        String str = this.f1730z;
        if (str == null) {
            byte[] h4 = h();
            kotlin.jvm.internal.k.e(h4, "<this>");
            String str2 = new String(h4, df.a.f4115a);
            this.f1730z = str2;
            return str2;
        }
        return str;
    }

    public void r(int i6, k kVar) {
        kVar.m1write(this.f1728x, 0, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f2, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0130, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d2, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x016f, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0176, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0168, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01a6, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01a9, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01ac, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x013c, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01af, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0092, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0081, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if (r6 == 64) goto L427;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.n.toString():java.lang.String");
    }
}
