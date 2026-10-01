package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class c5 implements Iterable, Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final c5 f2166z = new c5(t5.f2445b);

    /* renamed from: x, reason: collision with root package name */
    public int f2167x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f2168y;

    static {
        int i6 = x4.f2520a;
    }

    public c5(byte[] bArr) {
        bArr.getClass();
        this.f2168y = bArr;
    }

    public static c5 d(byte[] bArr, int i6, int i10) {
        e(i6, i6 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i6, bArr2, 0, i10);
        return new c5(bArr2);
    }

    public static int e(int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if ((i6 | i10 | i12 | (i11 - i10)) < 0) {
            if (i6 >= 0) {
                if (i10 < i6) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 44 + String.valueOf(i10).length());
                    sb2.append("Beginning index larger than ending index: ");
                    sb2.append(i6);
                    sb2.append(", ");
                    sb2.append(i10);
                    throw new IndexOutOfBoundsException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length());
                sb3.append("End index: ");
                sb3.append(i10);
                sb3.append(" >= ");
                sb3.append(i11);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(i6).length() + 21);
            sb4.append("Beginning index: ");
            sb4.append(i6);
            sb4.append(" < 0");
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        return i12;
    }

    public byte a(int i6) {
        return this.f2168y[i6];
    }

    public byte b(int i6) {
        return this.f2168y[i6];
    }

    public int c() {
        return this.f2168y.length;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof c5) && c() == ((c5) obj).c()) {
                if (c() != 0) {
                    if (obj instanceof c5) {
                        c5 c5Var = (c5) obj;
                        int i6 = this.f2167x;
                        int i10 = c5Var.f2167x;
                        if (i6 == 0 || i10 == 0 || i6 == i10) {
                            int c10 = c();
                            if (c10 <= c5Var.c()) {
                                if (c10 <= c5Var.c()) {
                                    byte[] bArr = c5Var.f2168y;
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (i11 < c10) {
                                        if (this.f2168y[i11] == bArr[i12]) {
                                            i11++;
                                            i12++;
                                        }
                                    }
                                    return true;
                                }
                                int c11 = c5Var.c();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 27 + String.valueOf(c11).length());
                                sb2.append("Ran off end of other: 0, ");
                                sb2.append(c10);
                                sb2.append(", ");
                                sb2.append(c11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            int c12 = c();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(c10).length() + 18 + String.valueOf(c12).length());
                            sb3.append("Length too large: ");
                            sb3.append(c10);
                            sb3.append(c12);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    } else {
                        return obj.equals(this);
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6 = this.f2167x;
        if (i6 == 0) {
            int c10 = c();
            int i10 = c10;
            for (int i11 = 0; i11 < c10; i11++) {
                i10 = (i10 * 31) + this.f2168y[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f2167x = i10;
            return i10;
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new z4(this);
    }

    public final String toString() {
        c5 b5Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int c10 = c();
        if (c() <= 50) {
            concat = a8.f.W(this);
        } else {
            int e10 = e(0, 47, c());
            if (e10 == 0) {
                b5Var = f2166z;
            } else {
                b5Var = new b5(e10, this.f2168y);
            }
            concat = a8.f.W(b5Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(c10);
        sb2.append(" contents=\"");
        return r4.a.o(sb2, concat, "\">");
    }
}
