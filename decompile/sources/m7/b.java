package m7;

import bg.b0;
import bg.f0;
import bg.k;
import bg.n;
import h8.c;
import java.io.EOFException;
import java.io.IOException;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a {
    public static final n I;
    public static final n J;
    public static final n K;
    public final f0 C;
    public final k D;
    public int E;
    public long F;
    public int G;
    public String H;

    static {
        n nVar = n.A;
        I = l.u("'\\");
        J = l.u("\"\\");
        K = l.u("{}[]:, \n\t\r\f/\\;#=");
        l.u("\n\r");
        l.u("*/");
    }

    public b(f0 f0Var) {
        this.f8701y = new int[32];
        this.f8702z = new String[32];
        this.A = new int[32];
        this.E = 0;
        this.C = f0Var;
        this.D = f0Var.f1708y;
        g0(6);
    }

    @Override // m7.a
    public final boolean K() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 != 2 && i6 != 4 && i6 != 18) {
            return true;
        }
        return false;
    }

    @Override // m7.a
    public final boolean Q() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 5) {
            this.E = 0;
            int[] iArr = this.A;
            int i10 = this.f8700x - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i6 == 6) {
            this.E = 0;
            int[] iArr2 = this.A;
            int i11 = this.f8700x - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new RuntimeException("Expected a boolean but was " + c.w(f0()) + " at path " + y());
    }

    @Override // m7.a
    public final double S() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 16) {
            this.E = 0;
            int[] iArr = this.A;
            int i10 = this.f8700x - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.F;
        }
        if (i6 == 17) {
            long j = this.G;
            k kVar = this.D;
            kVar.getClass();
            this.H = kVar.g0(j, df.a.f4115a);
        } else if (i6 == 9) {
            this.H = r0(J);
        } else if (i6 == 8) {
            this.H = r0(I);
        } else if (i6 == 10) {
            this.H = s0();
        } else if (i6 != 11) {
            throw new RuntimeException("Expected a double but was " + c.w(f0()) + " at path " + y());
        }
        this.E = 11;
        try {
            double parseDouble = Double.parseDouble(this.H);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.H = null;
                this.E = 0;
                int[] iArr2 = this.A;
                int i11 = this.f8700x - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseDouble;
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + y());
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.H + " at path " + y());
        }
    }

    @Override // m7.a
    public final int a0() {
        String r02;
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 16) {
            long j = this.F;
            int i10 = (int) j;
            if (j == i10) {
                this.E = 0;
                int[] iArr = this.A;
                int i11 = this.f8700x - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new RuntimeException("Expected an int but was " + this.F + " at path " + y());
        }
        if (i6 == 17) {
            long j10 = this.G;
            k kVar = this.D;
            kVar.getClass();
            this.H = kVar.g0(j10, df.a.f4115a);
        } else if (i6 != 9 && i6 != 8) {
            if (i6 != 11) {
                throw new RuntimeException("Expected an int but was " + c.w(f0()) + " at path " + y());
            }
        } else {
            if (i6 == 9) {
                r02 = r0(J);
            } else {
                r02 = r0(I);
            }
            this.H = r02;
            try {
                int parseInt = Integer.parseInt(r02);
                this.E = 0;
                int[] iArr2 = this.A;
                int i12 = this.f8700x - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.E = 11;
        try {
            double parseDouble = Double.parseDouble(this.H);
            int i13 = (int) parseDouble;
            if (i13 == parseDouble) {
                this.H = null;
                this.E = 0;
                int[] iArr3 = this.A;
                int i14 = this.f8700x - 1;
                iArr3[i14] = iArr3[i14] + 1;
                return i13;
            }
            throw new RuntimeException("Expected an int but was " + this.H + " at path " + y());
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.H + " at path " + y());
        }
    }

    @Override // m7.a
    public final String b0() {
        String g02;
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 10) {
            g02 = s0();
        } else if (i6 == 9) {
            g02 = r0(J);
        } else if (i6 == 8) {
            g02 = r0(I);
        } else if (i6 == 11) {
            g02 = this.H;
            this.H = null;
        } else if (i6 == 16) {
            g02 = Long.toString(this.F);
        } else if (i6 == 17) {
            long j = this.G;
            k kVar = this.D;
            kVar.getClass();
            g02 = kVar.g0(j, df.a.f4115a);
        } else {
            throw new RuntimeException("Expected a string but was " + c.w(f0()) + " at path " + y());
        }
        this.E = 0;
        int[] iArr = this.A;
        int i10 = this.f8700x - 1;
        iArr[i10] = iArr[i10] + 1;
        return g02;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E = 0;
        this.f8701y[0] = 8;
        this.f8700x = 1;
        this.D.d();
        this.C.close();
    }

    @Override // m7.a
    public final void d() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 3) {
            g0(1);
            this.A[this.f8700x - 1] = 0;
            this.E = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_ARRAY but was " + c.w(f0()) + " at path " + y());
        }
    }

    @Override // m7.a
    public final void f() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 1) {
            g0(3);
            this.E = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_OBJECT but was " + c.w(f0()) + " at path " + y());
        }
    }

    @Override // m7.a
    public final int f0() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        switch (i6) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // m7.a
    public final int h0(j1.f0 f0Var) {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 < 12 || i6 > 15) {
            return -1;
        }
        if (i6 == 15) {
            return n0(this.H, f0Var);
        }
        int w10 = this.C.w((b0) f0Var.f6908z);
        if (w10 != -1) {
            this.E = 0;
            this.f8702z[this.f8700x - 1] = ((String[]) f0Var.f6907y)[w10];
            return w10;
        }
        String str = this.f8702z[this.f8700x - 1];
        String p02 = p0();
        int n02 = n0(p02, f0Var);
        if (n02 == -1) {
            this.E = 15;
            this.H = p02;
            this.f8702z[this.f8700x - 1] = str;
        }
        return n02;
    }

    @Override // m7.a
    public final void i0() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 14) {
            long f3 = this.C.f(K);
            k kVar = this.D;
            if (f3 == -1) {
                f3 = kVar.f1726y;
            }
            kVar.skip(f3);
        } else if (i6 == 13) {
            u0(J);
        } else if (i6 == 12) {
            u0(I);
        } else if (i6 != 15) {
            throw new RuntimeException("Expected a name but was " + c.w(f0()) + " at path " + y());
        }
        this.E = 0;
        this.f8702z[this.f8700x - 1] = "null";
    }

    @Override // m7.a
    public final void j0() {
        int i6 = 0;
        do {
            int i10 = this.E;
            if (i10 == 0) {
                i10 = m0();
            }
            if (i10 == 3) {
                g0(1);
            } else if (i10 == 1) {
                g0(3);
            } else {
                if (i10 == 4) {
                    i6--;
                    if (i6 >= 0) {
                        this.f8700x--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + c.w(f0()) + " at path " + y());
                    }
                } else if (i10 == 2) {
                    i6--;
                    if (i6 >= 0) {
                        this.f8700x--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + c.w(f0()) + " at path " + y());
                    }
                } else {
                    k kVar = this.D;
                    if (i10 != 14 && i10 != 10) {
                        if (i10 != 9 && i10 != 13) {
                            if (i10 != 8 && i10 != 12) {
                                if (i10 == 17) {
                                    kVar.skip(this.G);
                                } else if (i10 == 18) {
                                    throw new RuntimeException("Expected a value but was " + c.w(f0()) + " at path " + y());
                                }
                            } else {
                                u0(I);
                            }
                        } else {
                            u0(J);
                        }
                    } else {
                        long f3 = this.C.f(K);
                        if (f3 == -1) {
                            f3 = kVar.f1726y;
                        }
                        kVar.skip(f3);
                    }
                }
                this.E = 0;
            }
            i6++;
            this.E = 0;
        } while (i6 != 0);
        int[] iArr = this.A;
        int i11 = this.f8700x - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f8702z[i11] = "null";
    }

    @Override // m7.a
    public final void l() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 4) {
            int i10 = this.f8700x;
            this.f8700x = i10 - 1;
            int[] iArr = this.A;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.E = 0;
            return;
        }
        throw new RuntimeException("Expected END_ARRAY but was " + c.w(f0()) + " at path " + y());
    }

    public final void l0() {
        k0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // m7.a
    public final void m() {
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 2) {
            int i10 = this.f8700x;
            int i11 = i10 - 1;
            this.f8700x = i11;
            this.f8702z[i11] = null;
            int[] iArr = this.A;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.E = 0;
            return;
        }
        throw new RuntimeException("Expected END_OBJECT but was " + c.w(f0()) + " at path " + y());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b7, code lost:
    
        if (r1 == 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ba, code lost:
    
        if (r1 == 4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bd, code lost:
    
        if (r1 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01bf, code lost:
    
        r22.G = r2;
        r9 = 17;
        r22.E = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0194, code lost:
    
        if (o0(r10) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0196, code lost:
    
        if (r1 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0198, code lost:
    
        if (r4 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a0, code lost:
    
        if (r13 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a4, code lost:
    
        if (r8 != r17) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a6, code lost:
    
        if (r13 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a8, code lost:
    
        if (r13 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ab, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ac, code lost:
    
        r22.F = r8;
        r7.skip(r2);
        r9 = 16;
        r22.E = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m0() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.b.m0():int");
    }

    public final int n0(String str, j1.f0 f0Var) {
        int length = ((String[]) f0Var.f6907y).length;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.equals(((String[]) f0Var.f6907y)[i6])) {
                this.E = 0;
                this.f8702z[this.f8700x - 1] = str;
                return i6;
            }
        }
        return -1;
    }

    public final boolean o0(int i6) {
        if (i6 != 9 && i6 != 10 && i6 != 12 && i6 != 13 && i6 != 32) {
            if (i6 != 35) {
                if (i6 != 44) {
                    if (i6 != 47 && i6 != 61) {
                        if (i6 != 123 && i6 != 125 && i6 != 58) {
                            if (i6 != 59) {
                                switch (i6) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            l0();
            throw null;
        }
        return false;
    }

    public final String p0() {
        String str;
        int i6 = this.E;
        if (i6 == 0) {
            i6 = m0();
        }
        if (i6 == 14) {
            str = s0();
        } else if (i6 == 13) {
            str = r0(J);
        } else if (i6 == 12) {
            str = r0(I);
        } else if (i6 == 15) {
            str = this.H;
        } else {
            throw new RuntimeException("Expected a name but was " + c.w(f0()) + " at path " + y());
        }
        this.E = 0;
        this.f8702z[this.f8700x - 1] = str;
        return str;
    }

    public final int q0(boolean z10) {
        int i6 = 0;
        while (true) {
            int i10 = i6 + 1;
            f0 f0Var = this.C;
            if (f0Var.P(i10)) {
                long j = i6;
                k kVar = this.D;
                byte y9 = kVar.y(j);
                if (y9 != 10 && y9 != 32 && y9 != 13 && y9 != 9) {
                    kVar.skip(j);
                    if (y9 == 47) {
                        if (f0Var.P(2L)) {
                            l0();
                            throw null;
                        }
                    } else if (y9 == 35) {
                        l0();
                        throw null;
                    }
                    return y9;
                }
                i6 = i10;
            } else {
                if (!z10) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public final String r0(n nVar) {
        StringBuilder sb2 = null;
        while (true) {
            long f3 = this.C.f(nVar);
            if (f3 != -1) {
                k kVar = this.D;
                if (kVar.y(f3) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(kVar.g0(f3, df.a.f4115a));
                    kVar.readByte();
                    sb2.append(t0());
                } else {
                    if (sb2 == null) {
                        String g02 = kVar.g0(f3, df.a.f4115a);
                        kVar.readByte();
                        return g02;
                    }
                    sb2.append(kVar.g0(f3, df.a.f4115a));
                    kVar.readByte();
                    return sb2.toString();
                }
            } else {
                k0("Unterminated string");
                throw null;
            }
        }
    }

    public final String s0() {
        long f3 = this.C.f(K);
        k kVar = this.D;
        if (f3 != -1) {
            kVar.getClass();
            return kVar.g0(f3, df.a.f4115a);
        }
        return kVar.h0();
    }

    public final char t0() {
        int i6;
        f0 f0Var = this.C;
        if (f0Var.P(1L)) {
            k kVar = this.D;
            byte readByte = kVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (f0Var.P(4L)) {
                                        char c10 = 0;
                                        for (int i10 = 0; i10 < 4; i10++) {
                                            byte y9 = kVar.y(i10);
                                            char c11 = (char) (c10 << 4);
                                            if (y9 >= 48 && y9 <= 57) {
                                                i6 = y9 - 48;
                                            } else if (y9 >= 97 && y9 <= 102) {
                                                i6 = y9 - 87;
                                            } else {
                                                if (y9 < 65 || y9 > 70) {
                                                    k0("\\u".concat(kVar.g0(4L, df.a.f4115a)));
                                                    throw null;
                                                }
                                                i6 = y9 - 55;
                                            }
                                            c10 = (char) (i6 + c11);
                                        }
                                        kVar.skip(4L);
                                        return c10;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + y());
                                }
                                k0("Invalid escape sequence: \\" + ((char) readByte));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        k0("Unterminated escape sequence");
        throw null;
    }

    public final String toString() {
        return "JsonReader(" + this.C + ")";
    }

    public final void u0(n nVar) {
        while (true) {
            long f3 = this.C.f(nVar);
            if (f3 != -1) {
                k kVar = this.D;
                if (kVar.y(f3) == 92) {
                    kVar.skip(f3 + 1);
                    t0();
                } else {
                    kVar.skip(f3 + 1);
                    return;
                }
            } else {
                k0("Unterminated string");
                throw null;
            }
        }
    }
}
