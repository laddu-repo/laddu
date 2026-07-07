package yf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class v extends y2.j {

    /* renamed from: f, reason: collision with root package name */
    public final String f15104f;

    public v(String source) {
        kotlin.jvm.internal.k.e(source, "source");
        this.f15104f = source;
    }

    @Override // y2.j
    public int B() {
        char charAt;
        int i6 = this.f14913b;
        if (i6 == -1) {
            return i6;
        }
        while (true) {
            String str = this.f15104f;
            if (i6 >= str.length() || !((charAt = str.charAt(i6)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i6++;
        }
        this.f14913b = i6;
        return i6;
    }

    @Override // y2.j
    public boolean c() {
        int i6 = this.f14913b;
        if (i6 == -1) {
            return false;
        }
        while (true) {
            String str = this.f15104f;
            if (i6 < str.length()) {
                char charAt = str.charAt(i6);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f14913b = i6;
                    return y2.j.u(charAt);
                }
                i6++;
            } else {
                this.f14913b = i6;
                return false;
            }
        }
    }

    @Override // y2.j
    public final String e() {
        String str;
        h('\"');
        int i6 = this.f14913b;
        String str2 = this.f15104f;
        int P = df.m.P(str2, '\"', i6, 4);
        if (P == -1) {
            l();
            int i10 = this.f14913b;
            if (i10 != str2.length() && i10 >= 0) {
                str = String.valueOf(str2.charAt(i10));
            } else {
                str = "EOF";
            }
            y2.j.q(this, h8.c.m("Expected quotation mark '\"', but had '", str, "' instead"), i10, null, 4);
            throw null;
        }
        for (int i11 = i6; i11 < P; i11++) {
            if (str2.charAt(i11) == '\\') {
                return k(str2, this.f14913b, i11);
            }
        }
        this.f14913b = P + 1;
        String substring = str2.substring(i6, P);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    @Override // y2.j
    public byte f() {
        String str;
        int i6 = this.f14913b;
        while (true) {
            str = this.f15104f;
            if (i6 == -1 || i6 >= str.length()) {
                break;
            }
            int i10 = i6 + 1;
            char charAt = str.charAt(i6);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f14913b = i10;
                return n.d(charAt);
            }
            i6 = i10;
        }
        this.f14913b = str.length();
        return (byte) 10;
    }

    @Override // y2.j
    public void h(char c10) {
        int i6 = this.f14913b;
        if (i6 == -1) {
            F(c10);
            throw null;
        }
        while (true) {
            String str = this.f15104f;
            if (i6 < str.length()) {
                int i10 = i6 + 1;
                char charAt = str.charAt(i6);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f14913b = i10;
                    if (charAt == c10) {
                        return;
                    }
                    F(c10);
                    throw null;
                }
                i6 = i10;
            } else {
                this.f14913b = -1;
                F(c10);
                throw null;
            }
        }
    }

    @Override // y2.j
    public final CharSequence s() {
        return this.f15104f;
    }

    @Override // y2.j
    public final String v(String keyToMatch) {
        kotlin.jvm.internal.k.e(keyToMatch, "keyToMatch");
        int i6 = this.f14913b;
        try {
            if (f() == 6 && kotlin.jvm.internal.k.a(x(), keyToMatch)) {
                this.f14915d = null;
                if (f() == 5) {
                    return x();
                }
            }
            return null;
        } finally {
            this.f14913b = i6;
            this.f14915d = null;
        }
    }

    @Override // y2.j
    public final int y(int i6) {
        if (i6 < this.f15104f.length()) {
            return i6;
        }
        return -1;
    }
}
