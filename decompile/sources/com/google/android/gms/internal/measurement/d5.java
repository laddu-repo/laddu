package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d5 extends a8.d {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2181e = Logger.getLogger(d5.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f2182f = y6.f2536e;

    /* renamed from: a, reason: collision with root package name */
    public a6 f2183a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2184b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2185c;

    /* renamed from: d, reason: collision with root package name */
    public int f2186d;

    public d5(int i6, byte[] bArr) {
        int length = bArr.length;
        if (((length - i6) | i6) >= 0) {
            this.f2184b = bArr;
            this.f2186d = 0;
            this.f2185c = i6;
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(h8.c.l("Array range is invalid. Buffer.length=", ", offset=0, length=", length, i6));
    }

    public static int G(int i6) {
        return (352 - (Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public static int p(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int q(String str) {
        int length;
        try {
            length = a7.b(str);
        } catch (z6 unused) {
            length = str.getBytes(t5.f2444a).length;
        }
        return G(length) + length;
    }

    public final void A(int i6) {
        int i10;
        int i11 = this.f2186d;
        while (true) {
            int i12 = i6 & (-128);
            byte[] bArr = this.f2184b;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i6;
                this.f2186d = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i6 | 128);
                    i6 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new e5(i10, this.f2185c, 1, e10);
                }
            }
            throw new e5(i10, this.f2185c, 1, e10);
        }
    }

    public final void B(int i6) {
        int i10 = this.f2186d;
        try {
            byte[] bArr = this.f2184b;
            bArr[i10] = (byte) i6;
            bArr[i10 + 1] = (byte) (i6 >> 8);
            bArr[i10 + 2] = (byte) (i6 >> 16);
            bArr[i10 + 3] = (byte) (i6 >> 24);
            this.f2186d = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new e5(i10, this.f2185c, 4, e10);
        }
    }

    public final void C(long j) {
        int i6;
        int i10 = this.f2186d;
        int i11 = this.f2185c;
        byte[] bArr = this.f2184b;
        if (f2182f && i11 - i10 >= 10) {
            long j10 = j;
            while ((j10 & (-128)) != 0) {
                y6.f2534c.a(bArr, y6.f2537f + i10, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i10++;
            }
            i6 = i10 + 1;
            y6.f2534c.a(bArr, y6.f2537f + i10, (byte) j10);
        } else {
            long j11 = j;
            while ((j11 & (-128)) != 0) {
                int i12 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i10 = i12;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i6 = i12;
                    throw new e5(i6, i11, 1, e);
                }
            }
            i6 = i10 + 1;
            try {
                bArr[i10] = (byte) j11;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new e5(i6, i11, 1, e);
            }
        }
        this.f2186d = i6;
    }

    public final void D(long j) {
        int i6 = this.f2186d;
        try {
            byte[] bArr = this.f2184b;
            bArr[i6] = (byte) j;
            bArr[i6 + 1] = (byte) (j >> 8);
            bArr[i6 + 2] = (byte) (j >> 16);
            bArr[i6 + 3] = (byte) (j >> 24);
            bArr[i6 + 4] = (byte) (j >> 32);
            bArr[i6 + 5] = (byte) (j >> 40);
            bArr[i6 + 6] = (byte) (j >> 48);
            bArr[i6 + 7] = (byte) (j >> 56);
            this.f2186d = i6 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new e5(i6, this.f2185c, 8, e10);
        }
    }

    public final void E(int i6, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f2184b, this.f2186d, i6);
            this.f2186d += i6;
        } catch (IndexOutOfBoundsException e10) {
            throw new e5(this.f2186d, this.f2185c, i6, e10);
        }
    }

    public final void F(String str) {
        int i6 = this.f2186d;
        try {
            int G = G(str.length() * 3);
            int G2 = G(str.length());
            int i10 = this.f2185c;
            byte[] bArr = this.f2184b;
            if (G2 == G) {
                int i11 = i6 + G2;
                this.f2186d = i11;
                int c10 = a7.c(str, bArr, i11, i10 - i11);
                this.f2186d = i6;
                A((c10 - i6) - G2);
                this.f2186d = c10;
                return;
            }
            A(a7.b(str));
            int i12 = this.f2186d;
            this.f2186d = a7.c(str, bArr, i12, i10 - i12);
        } catch (z6 e10) {
            this.f2186d = i6;
            f2181e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(t5.f2444a);
            try {
                int length = bytes.length;
                A(length);
                E(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new e5(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new e5(e12);
        }
    }

    public final void r(int i6, int i10) {
        A((i6 << 3) | i10);
    }

    public final void s(int i6, int i10) {
        A(i6 << 3);
        z(i10);
    }

    public final void t(int i6, int i10) {
        A(i6 << 3);
        A(i10);
    }

    public final void u(int i6, int i10) {
        A((i6 << 3) | 5);
        B(i10);
    }

    public final void v(int i6, long j) {
        A(i6 << 3);
        C(j);
    }

    public final void w(int i6, long j) {
        A((i6 << 3) | 1);
        D(j);
    }

    public final void x(c5 c5Var) {
        A(c5Var.c());
        E(c5Var.c(), c5Var.f2168y);
    }

    public final void y(byte b10) {
        int i6;
        int i10 = this.f2186d;
        try {
            i6 = i10 + 1;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
        try {
            this.f2184b[i10] = b10;
            this.f2186d = i6;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            i10 = i6;
            throw new e5(i10, this.f2185c, 1, e);
        }
    }

    public final void z(int i6) {
        if (i6 >= 0) {
            A(i6);
        } else {
            C(i6);
        }
    }
}
