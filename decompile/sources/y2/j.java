package y2;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a */
    public final /* synthetic */ int f14912a = 1;

    /* renamed from: b */
    public int f14913b;

    /* renamed from: c */
    public final Object f14914c;

    /* renamed from: d */
    public Object f14915d;

    /* renamed from: e */
    public Object f14916e;

    public j(g gVar, i iVar, long j, long j10, long j11, long j12, long j13, int i6) {
        this.f14915d = iVar;
        this.f14913b = i6;
        this.f14914c = new e(gVar, j, j10, j11, j12, j13);
    }

    public static /* synthetic */ void q(j jVar, String str, int i6, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i6 = jVar.f14913b;
        }
        if ((i10 & 4) != 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jVar.p(i6, str, str2);
        throw null;
    }

    public static boolean u(char c10) {
        if (c10 != ',' && c10 != ':' && c10 != ']' && c10 != '}') {
            return true;
        }
        return false;
    }

    public static int z(p pVar, long j, mc.i iVar) {
        if (j == pVar.getPosition()) {
            return 0;
        }
        iVar.f8812a = j;
        return 1;
    }

    public void A(long j) {
        f fVar = (f) this.f14916e;
        if (fVar != null && fVar.f14893a == j) {
            return;
        }
        e eVar = (e) this.f14914c;
        this.f14916e = new f(j, eVar.f14883a.b(j), eVar.f14885c, eVar.f14886d, eVar.f14887e, eVar.f14888f);
    }

    public abstract int B();

    public String C(int i6, int i10) {
        return s().subSequence(i6, i10).toString();
    }

    public boolean D() {
        int B = B();
        CharSequence s = s();
        if (B < s.length() && B != -1 && s.charAt(B) == ',') {
            this.f14913b++;
            return true;
        }
        return false;
    }

    public boolean E(boolean z10) {
        int y9 = y(B());
        int length = s().length() - y9;
        if (length >= 4 && y9 != -1) {
            int i6 = 0;
            while (true) {
                if (i6 < 4) {
                    if ("null".charAt(i6) != s().charAt(y9 + i6)) {
                        break;
                    }
                    i6++;
                } else if (length <= 4 || yf.n.d(s().charAt(y9 + 4)) != 0) {
                    if (z10) {
                        this.f14913b = y9 + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void F(char c10) {
        String str;
        int i6 = this.f14913b;
        if (i6 > 0 && c10 == '\"') {
            try {
                this.f14913b = i6 - 1;
                String l10 = l();
                this.f14913b = i6;
                if (kotlin.jvm.internal.k.a(l10, "null")) {
                    p(this.f14913b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f14913b = i6;
                throw th;
            }
        }
        String n10 = yf.n.n(yf.n.d(c10));
        int i10 = this.f14913b;
        int i11 = i10 - 1;
        if (i10 != s().length() && i11 >= 0) {
            str = String.valueOf(s().charAt(i11));
        } else {
            str = "EOF";
        }
        q(this, "Expected " + n10 + ", but had '" + str + "' instead", i11, null, 4);
        throw null;
    }

    public int a(CharSequence charSequence, int i6) {
        int i10 = i6 + 4;
        if (i10 >= charSequence.length()) {
            this.f14913b = i6;
            n();
            if (this.f14913b + 4 < charSequence.length()) {
                return a(charSequence, this.f14913b);
            }
            q(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.f14916e).append((char) (r(charSequence, i6 + 3) + (r(charSequence, i6) << 12) + (r(charSequence, i6 + 1) << 8) + (r(charSequence, i6 + 2) << 4)));
        return i10;
    }

    public void b(int i6, int i10) {
        ((StringBuilder) this.f14916e).append(s(), i6, i10);
    }

    public abstract boolean c();

    public void d(int i6, String str) {
        if (s().length() - i6 >= str.length()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) != (s().charAt(i6 + i10) | ' ')) {
                    q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.f14913b = str.length() + i6;
            return;
        }
        q(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String e();

    public abstract byte f();

    public byte g(byte b10) {
        String str;
        byte f3 = f();
        if (f3 != b10) {
            String n10 = yf.n.n(b10);
            int i6 = this.f14913b;
            int i10 = i6 - 1;
            if (i6 != s().length() && i10 >= 0) {
                str = String.valueOf(s().charAt(i10));
            } else {
                str = "EOF";
            }
            q(this, "Expected " + n10 + ", but had '" + str + "' instead", i10, null, 4);
            throw null;
        }
        return f3;
    }

    public abstract void h(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0137, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        if (r11 == r1) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        if (r1 == r11) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        if (r13 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        if (r1 == (r11 - 1)) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        if (r19 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        if (r2 == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0154, code lost:
    
        if (s().charAt(r11) != '\"') goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        q(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0162, code lost:
    
        q(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0169, code lost:
    
        r21.f14913b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
    
        if (r20 == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016d, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0170, code lost:
    
        if (r8 != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0172, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0187, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0199, code lost:
    
        q(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b3, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017a, code lost:
    
        if (r8 != true) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017c, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c0, code lost:
    
        if (r13 == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c2, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c7, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ca, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cb, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d2, code lost:
    
        q(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d7, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.j.i():long");
    }

    public String j() {
        String str = (String) this.f14915d;
        if (str != null) {
            kotlin.jvm.internal.k.b(str);
            this.f14915d = null;
            return str;
        }
        return e();
    }

    public String k(CharSequence source, int i6, int i10) {
        String m9;
        char c10;
        kotlin.jvm.internal.k.e(source, "source");
        char charAt = source.charAt(i10);
        boolean z10 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                b(i6, i10);
                int y9 = y(i10 + 1);
                if (y9 != -1) {
                    int i11 = y9 + 1;
                    char charAt2 = s().charAt(y9);
                    if (charAt2 == 'u') {
                        i11 = a(s(), i11);
                    } else {
                        if (charAt2 < 'u') {
                            c10 = yf.g.f15066a[charAt2];
                        } else {
                            c10 = 0;
                        }
                        if (c10 != 0) {
                            ((StringBuilder) this.f14916e).append(c10);
                        } else {
                            q(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                            throw null;
                        }
                    }
                    i6 = y(i11);
                    if (i6 == -1) {
                        q(this, "Unexpected EOF", i6, null, 4);
                        throw null;
                    }
                } else {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
            } else {
                i10++;
                if (i10 >= source.length()) {
                    b(i6, i10);
                    i6 = y(i10);
                    if (i6 == -1) {
                        q(this, "Unexpected EOF", i6, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = source.charAt(i10);
                }
            }
            i10 = i6;
            z10 = true;
            charAt = source.charAt(i10);
        }
        if (!z10) {
            m9 = C(i6, i10);
        } else {
            m9 = m(i6, i10);
        }
        this.f14913b = i10 + 1;
        return m9;
    }

    public String l() {
        String m9;
        String str = (String) this.f14915d;
        if (str != null) {
            kotlin.jvm.internal.k.b(str);
            this.f14915d = null;
            return str;
        }
        int B = B();
        if (B < s().length() && B != -1) {
            byte d10 = yf.n.d(s().charAt(B));
            if (d10 == 1) {
                return j();
            }
            if (d10 == 0) {
                boolean z10 = false;
                while (yf.n.d(s().charAt(B)) == 0) {
                    B++;
                    if (B >= s().length()) {
                        b(this.f14913b, B);
                        int y9 = y(B);
                        if (y9 == -1) {
                            this.f14913b = B;
                            return m(0, 0);
                        }
                        B = y9;
                        z10 = true;
                    }
                }
                if (!z10) {
                    m9 = C(this.f14913b, B);
                } else {
                    m9 = m(this.f14913b, B);
                }
                this.f14913b = B;
                return m9;
            }
            q(this, "Expected beginning of the string, but got " + s().charAt(B), 0, null, 6);
            throw null;
        }
        q(this, "EOF", B, null, 4);
        throw null;
    }

    public String m(int i6, int i10) {
        b(i6, i10);
        StringBuilder sb2 = (StringBuilder) this.f14916e;
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        sb2.setLength(0);
        return sb3;
    }

    public void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + s().charAt(this.f14913b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void p(int i6, String message, String hint) {
        String concat;
        kotlin.jvm.internal.k.e(message, "message");
        kotlin.jvm.internal.k.e(hint, "hint");
        if (hint.length() == 0) {
            concat = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            concat = "\n".concat(hint);
        }
        throw yf.n.b(i6, message + " at path: " + ((b2.k) this.f14914c).k() + concat, s());
    }

    public int r(CharSequence charSequence, int i6) {
        char charAt = charSequence.charAt(i6);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        q(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence s();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        return z(r27, r9, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int t(y2.p r27, mc.i r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            java.lang.Object r3 = r0.f14915d
            y2.i r3 = (y2.i) r3
        La:
            java.lang.Object r4 = r0.f14916e
            y2.f r4 = (y2.f) r4
            u1.c.h(r4)
            long r5 = r4.f14898f
            long r7 = r4.f14899g
            long r9 = r4.f14900h
            long r7 = r7 - r5
            int r11 = r0.f14913b
            long r11 = (long) r11
            r13 = 0
            int r14 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r14 > 0) goto L2a
            r0.f14916e = r13
            r3.e()
            int r1 = z(r1, r5, r2)
            return r1
        L2a:
            long r5 = r1.getPosition()
            long r5 = r9 - r5
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto Lca
            r11 = 262144(0x40000, double:1.295163E-318)
            int r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r14 > 0) goto Lca
            int r6 = (int) r5
            r1.w(r6)
            r1.v()
            long r5 = r4.f14894b
            y2.h r5 = r3.d(r1, r5)
            int r6 = r5.f14909a
            long r14 = r5.f14910b
            r16 = r7
            long r7 = r5.f14911c
            r5 = -3
            if (r6 == r5) goto Lc0
            r5 = -2
            if (r6 == r5) goto La1
            r5 = -1
            if (r6 == r5) goto L81
            if (r6 != 0) goto L79
            long r4 = r1.getPosition()
            long r4 = r7 - r4
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 < 0) goto L6f
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 > 0) goto L6f
            int r5 = (int) r4
            r1.w(r5)
        L6f:
            r0.f14916e = r13
            r3.e()
            int r1 = z(r1, r7, r2)
            return r1
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L81:
            r4.f14897e = r14
            r4.f14899g = r7
            r16 = r14
            long r14 = r4.f14894b
            long r5 = r4.f14896d
            long r9 = r4.f14898f
            long r11 = r4.f14895c
            r22 = r7
            r20 = r9
            r24 = r11
            r18 = r16
            r16 = r5
            long r5 = y2.f.a(r14, r16, r18, r20, r22, r24)
            r4.f14900h = r5
            goto La
        La1:
            r5 = r14
            r4.f14896d = r5
            r4.f14898f = r7
            long r14 = r4.f14894b
            long r9 = r4.f14897e
            long r11 = r4.f14899g
            r16 = r5
            long r5 = r4.f14895c
            r24 = r5
            r20 = r7
            r18 = r9
            r22 = r11
            long r5 = y2.f.a(r14, r16, r18, r20, r22, r24)
            r4.f14900h = r5
            goto La
        Lc0:
            r0.f14916e = r13
            r3.e()
            int r1 = z(r1, r9, r2)
            return r1
        Lca:
            int r1 = z(r1, r9, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.j.t(y2.p, mc.i):int");
    }

    public String toString() {
        switch (this.f14912a) {
            case 1:
                return "JsonReader(source='" + ((Object) s()) + "', currentPosition=" + this.f14913b + ')';
            default:
                return super.toString();
        }
    }

    public abstract String v(String str);

    public byte w() {
        CharSequence s = s();
        int i6 = this.f14913b;
        while (true) {
            int y9 = y(i6);
            if (y9 != -1) {
                char charAt = s.charAt(y9);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.f14913b = y9;
                    return yf.n.d(charAt);
                }
                i6 = y9 + 1;
            } else {
                this.f14913b = y9;
                return (byte) 10;
            }
        }
    }

    public String x() {
        if (w() != 1) {
            return null;
        }
        String j = j();
        this.f14915d = j;
        return j;
    }

    public abstract int y(int i6);

    public j() {
        b2.k kVar = new b2.k((byte) 0, 13);
        kVar.f1384z = new Object[8];
        int[] iArr = new int[8];
        for (int i6 = 0; i6 < 8; i6++) {
            iArr[i6] = -1;
        }
        kVar.A = iArr;
        kVar.f1383y = -1;
        this.f14914c = kVar;
        this.f14916e = new StringBuilder();
    }

    public void n() {
    }
}
