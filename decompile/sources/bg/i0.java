package bg;

import java.security.MessageDigest;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends n {
    public final transient byte[][] B;
    public final transient int[] C;

    public i0(byte[][] bArr, int[] iArr) {
        super(n.A.f1728x);
        this.B = bArr;
        this.C = iArr;
    }

    @Override // bg.n
    public final String a() {
        return t().a();
    }

    @Override // bg.n
    public final n c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.B;
        int length = bArr.length;
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            int[] iArr = this.C;
            int i11 = iArr[length + i6];
            int i12 = iArr[i6];
            messageDigest.update(bArr[i6], i11, i12 - i10);
            i6++;
            i10 = i12;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.k.b(digest);
        return new n(digest);
    }

    @Override // bg.n
    public final int d() {
        return this.C[this.B.length - 1];
    }

    @Override // bg.n
    public final String e() {
        return t().e();
    }

    @Override // bg.n
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (nVar.d() == d() && l(0, nVar, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // bg.n
    public final int f(int i6, byte[] other) {
        kotlin.jvm.internal.k.e(other, "other");
        return t().f(i6, other);
    }

    @Override // bg.n
    public final byte[] h() {
        return s();
    }

    @Override // bg.n
    public final int hashCode() {
        int i6 = this.f1729y;
        if (i6 != 0) {
            return i6;
        }
        byte[][] bArr = this.B;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < length) {
            int[] iArr = this.C;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i11) + i13;
            while (i13 < i15) {
                i12 = (i12 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i11 = i14;
        }
        this.f1729y = i12;
        return i12;
    }

    @Override // bg.n
    public final byte i(int i6) {
        int i10;
        byte[][] bArr = this.B;
        int length = bArr.length - 1;
        int[] iArr = this.C;
        b.f(iArr[length], i6, 1L);
        int g10 = cg.b.g(this, i6);
        if (g10 == 0) {
            i10 = 0;
        } else {
            i10 = iArr[g10 - 1];
        }
        return bArr[g10][(i6 - i10) + iArr[bArr.length + g10]];
    }

    @Override // bg.n
    public final int j(byte[] other) {
        kotlin.jvm.internal.k.e(other, "other");
        return t().j(other);
    }

    @Override // bg.n
    public final boolean l(int i6, n other, int i10) {
        int i11;
        kotlin.jvm.internal.k.e(other, "other");
        if (i6 >= 0 && i6 <= d() - i10) {
            int i12 = i10 + i6;
            int g10 = cg.b.g(this, i6);
            int i13 = 0;
            while (i6 < i12) {
                int[] iArr = this.C;
                if (g10 == 0) {
                    i11 = 0;
                } else {
                    i11 = iArr[g10 - 1];
                }
                int i14 = iArr[g10] - i11;
                byte[][] bArr = this.B;
                int i15 = iArr[bArr.length + g10];
                int min = Math.min(i12, i14 + i11) - i6;
                if (other.m(i13, bArr[g10], (i6 - i11) + i15, min)) {
                    i13 += min;
                    i6 += min;
                    g10++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // bg.n
    public final boolean m(int i6, byte[] other, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.k.e(other, "other");
        if (i6 < 0 || i6 > d() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i13 = i11 + i6;
        int g10 = cg.b.g(this, i6);
        while (i6 < i13) {
            int[] iArr = this.C;
            if (g10 == 0) {
                i12 = 0;
            } else {
                i12 = iArr[g10 - 1];
            }
            int i14 = iArr[g10] - i12;
            byte[][] bArr = this.B;
            int i15 = iArr[bArr.length + g10];
            int min = Math.min(i13, i14 + i12) - i6;
            if (!b.b((i6 - i12) + i15, i10, min, bArr[g10], other)) {
                return false;
            }
            i10 += min;
            i6 += min;
            g10++;
        }
        return true;
    }

    @Override // bg.n
    public final n n(int i6, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i6 >= 0) {
            if (i10 <= d()) {
                int i11 = i10 - i6;
                if (i11 >= 0) {
                    if (i6 == 0 && i10 == d()) {
                        return this;
                    }
                    if (i6 == i10) {
                        return n.A;
                    }
                    int g10 = cg.b.g(this, i6);
                    int g11 = cg.b.g(this, i10 - 1);
                    byte[][] bArr = this.B;
                    byte[][] bArr2 = (byte[][]) ie.i.h0(bArr, g10, g11 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i12 = 0;
                    int[] iArr2 = this.C;
                    if (g10 <= g11) {
                        int i13 = g10;
                        int i14 = 0;
                        while (true) {
                            iArr[i14] = Math.min(iArr2[i13] - i6, i11);
                            int i15 = i14 + 1;
                            iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                            if (i13 == g11) {
                                break;
                            }
                            i13++;
                            i14 = i15;
                        }
                    }
                    if (g10 != 0) {
                        i12 = iArr2[g10 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i6 - i12) + iArr[length];
                    return new i0(bArr2, iArr);
                }
                throw new IllegalArgumentException(h8.c.l("endIndex=", " < beginIndex=", i10, i6).toString());
            }
            StringBuilder n10 = h8.c.n(i10, "endIndex=", " > length(");
            n10.append(d());
            n10.append(')');
            throw new IllegalArgumentException(n10.toString().toString());
        }
        throw new IllegalArgumentException(h8.c.j(i6, "beginIndex=", " < 0").toString());
    }

    @Override // bg.n
    public final n p() {
        return t().p();
    }

    @Override // bg.n
    public final void r(int i6, k kVar) {
        int i10;
        int g10 = cg.b.g(this, 0);
        int i11 = 0;
        while (i11 < i6) {
            int[] iArr = this.C;
            if (g10 == 0) {
                i10 = 0;
            } else {
                i10 = iArr[g10 - 1];
            }
            int i12 = iArr[g10] - i10;
            byte[][] bArr = this.B;
            int i13 = iArr[bArr.length + g10];
            int min = Math.min(i6, i12 + i10) - i11;
            int i14 = (i11 - i10) + i13;
            g0 g0Var = new g0(bArr[g10], i14, i14 + min, true, false);
            g0 g0Var2 = kVar.f1725x;
            if (g0Var2 == null) {
                g0Var.f1716g = g0Var;
                g0Var.f1715f = g0Var;
                kVar.f1725x = g0Var;
            } else {
                g0 g0Var3 = g0Var2.f1716g;
                kotlin.jvm.internal.k.b(g0Var3);
                g0Var3.b(g0Var);
            }
            i11 += min;
            g10++;
        }
        kVar.f1726y += i6;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.B;
        int length = bArr2.length;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < length) {
            int[] iArr = this.C;
            int i12 = iArr[length + i6];
            int i13 = iArr[i6];
            int i14 = i13 - i10;
            ie.i.b0(i11, i12, i12 + i14, bArr2[i6], bArr);
            i11 += i14;
            i6++;
            i10 = i13;
        }
        return bArr;
    }

    public final n t() {
        return new n(s());
    }

    @Override // bg.n
    public final String toString() {
        return t().toString();
    }
}
