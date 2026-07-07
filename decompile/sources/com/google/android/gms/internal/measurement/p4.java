package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class p4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2388a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2389b;

    public p4(Uri uri, boolean z10, boolean z11) {
        this.f2389b = uri;
        this.f2388a = z10;
    }

    public void a(int i6) {
        u1.c.g(!this.f2388a);
        ((SparseBooleanArray) this.f2389b).append(i6, true);
    }

    public void b(r1.o oVar) {
        for (int i6 = 0; i6 < oVar.f11592a.size(); i6++) {
            a(oVar.b(i6));
        }
    }

    public r1.o c() {
        u1.c.g(!this.f2388a);
        this.f2388a = true;
        return new r1.o((SparseBooleanArray) this.f2389b);
    }

    public boolean d() {
        return this.f2388a;
    }

    public boolean e(CharSequence charSequence, int i6) {
        if (charSequence != null && i6 >= 0 && charSequence.length() - i6 >= 0) {
            r0.e eVar = (r0.e) this.f2389b;
            if (eVar == null) {
                return d();
            }
            eVar.getClass();
            char c10 = 2;
            for (int i10 = 0; i10 < i6 && c10 == 2; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                p4 p4Var = r0.f.f11255a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c10 = 2;
                                break;
                        }
                    }
                    c10 = 0;
                }
                c10 = 1;
            }
            if (c10 == 0) {
                return true;
            }
            if (c10 == 1) {
                return false;
            }
            return d();
        }
        throw new IllegalArgumentException();
    }

    public void f() {
        this.f2388a = false;
    }

    public void g(byte b10) {
        ((j2.y) this.f2389b).w(String.valueOf(b10));
    }

    public void h(char c10) {
        j2.y yVar = (j2.y) this.f2389b;
        yVar.i(yVar.f7144y, 1);
        char[] cArr = (char[]) yVar.f7145z;
        int i6 = yVar.f7144y;
        yVar.f7144y = i6 + 1;
        cArr[i6] = c10;
    }

    public void i(int i6) {
        ((j2.y) this.f2389b).w(String.valueOf(i6));
    }

    public void j(long j) {
        ((j2.y) this.f2389b).w(String.valueOf(j));
    }

    public void k(String v10) {
        kotlin.jvm.internal.k.e(v10, "v");
        ((j2.y) this.f2389b).w(v10);
    }

    public void l(short s) {
        ((j2.y) this.f2389b).w(String.valueOf(s));
    }

    public void m(String value) {
        int i6;
        kotlin.jvm.internal.k.e(value, "value");
        j2.y yVar = (j2.y) this.f2389b;
        yVar.i(yVar.f7144y, value.length() + 2);
        char[] cArr = (char[]) yVar.f7145z;
        int i10 = yVar.f7144y;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = yf.w.f15106b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    yVar.i(i13, 2);
                    char charAt = value.charAt(i14);
                    byte[] bArr2 = yf.w.f15106b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i6 = i13 + 1;
                            ((char[]) yVar.f7145z)[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str = yf.w.f15105a[charAt];
                                kotlin.jvm.internal.k.b(str);
                                yVar.i(i13, str.length());
                                str.getChars(0, str.length(), (char[]) yVar.f7145z, i13);
                                int length3 = str.length() + i13;
                                yVar.f7144y = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = (char[]) yVar.f7145z;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                yVar.f7144y = i13;
                            }
                        }
                    } else {
                        i6 = i13 + 1;
                        ((char[]) yVar.f7145z)[i13] = charAt;
                    }
                    i13 = i6;
                }
                yVar.i(i13, 1);
                ((char[]) yVar.f7145z)[i13] = '\"';
                yVar.f7144y = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        yVar.f7144y = i12 + 1;
    }

    public o4 p(String str, long j) {
        Long valueOf = Long.valueOf(j);
        Object obj = o4.f2371g;
        return new o4(this, str, valueOf, 0);
    }

    public o4 q(String str, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Object obj = o4.f2371g;
        return new o4(this, str, valueOf, 1);
    }

    public o4 r(String str, String str2) {
        Object obj = o4.f2371g;
        return new o4(this, str, str2, 3);
    }

    public p4(j2.y yVar) {
        this.f2389b = yVar;
        this.f2388a = true;
    }

    public p4() {
        this.f2389b = new SparseBooleanArray();
    }

    public p4(r0.e eVar, boolean z10) {
        this.f2389b = eVar;
        this.f2388a = z10;
    }

    public void n() {
    }

    public void o() {
    }
}
