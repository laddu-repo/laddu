package yf;

import w4.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class r extends y2.j {

    /* renamed from: f, reason: collision with root package name */
    public final q0 f15084f;

    /* renamed from: g, reason: collision with root package name */
    public final char[] f15085g;

    /* renamed from: h, reason: collision with root package name */
    public int f15086h = 128;

    /* renamed from: i, reason: collision with root package name */
    public final a f15087i;

    public r(q0 q0Var, char[] cArr) {
        this.f15084f = q0Var;
        this.f15085g = cArr;
        this.f15087i = new a(cArr);
        G(0);
    }

    @Override // y2.j
    public int B() {
        int y9;
        char c10;
        int i6 = this.f14913b;
        while (true) {
            y9 = y(i6);
            if (y9 == -1 || !((c10 = this.f15087i.f15058x[y9]) == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t')) {
                break;
            }
            i6 = y9 + 1;
        }
        this.f14913b = y9;
        return y9;
    }

    @Override // y2.j
    public final String C(int i6, int i10) {
        a aVar = this.f15087i;
        return df.u.y(aVar.f15058x, i6, Math.min(i10, aVar.f15059y));
    }

    public final void G(int i6) {
        a aVar = this.f15087i;
        char[] buffer = aVar.f15058x;
        if (i6 != 0) {
            int i10 = this.f14913b;
            kotlin.jvm.internal.k.e(buffer, "<this>");
            System.arraycopy(buffer, i10, buffer, 0, (i10 + i6) - i10);
        }
        int i11 = aVar.f15059y;
        while (true) {
            if (i6 == i11) {
                break;
            }
            q0 q0Var = this.f15084f;
            q0Var.getClass();
            kotlin.jvm.internal.k.e(buffer, "buffer");
            int a10 = ((h) q0Var.f13989x).a(buffer, i6, i11 - i6);
            if (a10 == -1) {
                aVar.f15059y = Math.min(aVar.f15058x.length, i6);
                this.f15086h = -1;
                break;
            }
            i6 += a10;
        }
        this.f14913b = 0;
    }

    public final void H() {
        f fVar = f.f15065c;
        fVar.getClass();
        char[] array = this.f15085g;
        kotlin.jvm.internal.k.e(array, "array");
        if (array.length == 16384) {
            fVar.a(array);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // y2.j
    public final void b(int i6, int i10) {
        ((StringBuilder) this.f14916e).append(this.f15087i.f15058x, i6, i10 - i6);
    }

    @Override // y2.j
    public boolean c() {
        n();
        int i6 = this.f14913b;
        while (true) {
            int y9 = y(i6);
            if (y9 != -1) {
                char c10 = this.f15087i.f15058x[y9];
                if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                    this.f14913b = y9;
                    return y2.j.u(c10);
                }
                i6 = y9 + 1;
            } else {
                this.f14913b = y9;
                return false;
            }
        }
    }

    @Override // y2.j
    public final String e() {
        String str;
        h('\"');
        int i6 = this.f14913b;
        a aVar = this.f15087i;
        int i10 = aVar.f15059y;
        char[] cArr = aVar.f15058x;
        int i11 = i6;
        while (true) {
            if (i11 < i10) {
                if (cArr[i11] == '\"') {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 == -1) {
            int y9 = y(i6);
            if (y9 == -1) {
                int i12 = this.f14913b;
                int i13 = i12 - 1;
                if (i12 != aVar.f15059y && i13 >= 0) {
                    str = String.valueOf(aVar.f15058x[i13]);
                } else {
                    str = "EOF";
                }
                y2.j.q(this, h8.c.m("Expected quotation mark '\"', but had '", str, "' instead"), i13, null, 4);
                throw null;
            }
            return k(aVar, this.f14913b, y9);
        }
        for (int i14 = i6; i14 < i11; i14++) {
            if (cArr[i14] == '\\') {
                return k(aVar, this.f14913b, i14);
            }
        }
        this.f14913b = i11 + 1;
        return df.u.y(cArr, i6, Math.min(i11, aVar.f15059y));
    }

    @Override // y2.j
    public byte f() {
        n();
        int i6 = this.f14913b;
        while (true) {
            int y9 = y(i6);
            if (y9 != -1) {
                int i10 = y9 + 1;
                byte d10 = n.d(this.f15087i.f15058x[y9]);
                if (d10 != 3) {
                    this.f14913b = i10;
                    return d10;
                }
                i6 = i10;
            } else {
                this.f14913b = y9;
                return (byte) 10;
            }
        }
    }

    @Override // y2.j
    public void h(char c10) {
        n();
        int i6 = this.f14913b;
        while (true) {
            int y9 = y(i6);
            if (y9 != -1) {
                int i10 = y9 + 1;
                char c11 = this.f15087i.f15058x[y9];
                if (c11 != ' ' && c11 != '\n' && c11 != '\r' && c11 != '\t') {
                    this.f14913b = i10;
                    if (c11 == c10) {
                        return;
                    }
                    F(c10);
                    throw null;
                }
                i6 = i10;
            } else {
                this.f14913b = y9;
                F(c10);
                throw null;
            }
        }
    }

    @Override // y2.j
    public final void n() {
        int i6 = this.f15087i.f15059y - this.f14913b;
        if (i6 > this.f15086h) {
            return;
        }
        G(i6);
    }

    @Override // y2.j
    public final CharSequence s() {
        return this.f15087i;
    }

    @Override // y2.j
    public final String v(String keyToMatch) {
        kotlin.jvm.internal.k.e(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // y2.j
    public final int y(int i6) {
        a aVar = this.f15087i;
        if (i6 < aVar.f15059y) {
            return i6;
        }
        this.f14913b = i6;
        n();
        if (this.f14913b == 0 && aVar.length() != 0) {
            return 0;
        }
        return -1;
    }
}
