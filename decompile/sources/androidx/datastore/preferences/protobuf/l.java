package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.bumptech.glide.c {
    public static final Logger f = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f800g = h1.f782e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1.k1 f805e;

    public l(d1.k1 k1Var, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f802b = new byte[iMax];
        this.f803c = iMax;
        this.f805e = k1Var;
    }

    public static int Y(int i, g gVar) {
        int iA0 = a0(i);
        int size = gVar.size();
        return b0(size) + size + iA0;
    }

    public static int Z(String str) {
        int length;
        try {
            length = k1.a(str);
        } catch (j1 unused) {
            length = str.getBytes(x.f870a).length;
        }
        return b0(length) + length;
    }

    public static int a0(int i) {
        return b0(i << 3);
    }

    public static int b0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int c0(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    @Override // com.bumptech.glide.c
    public final void Q(byte[] bArr, int i, int i10) throws IOException {
        g0(bArr, i, i10);
    }

    public final void T(int i) {
        int i10 = this.f804d;
        int i11 = i10 + 1;
        this.f804d = i11;
        byte[] bArr = this.f802b;
        bArr[i10] = (byte) (i & 255);
        int i12 = i10 + 2;
        this.f804d = i12;
        bArr[i11] = (byte) ((i >> 8) & 255);
        int i13 = i10 + 3;
        this.f804d = i13;
        bArr[i12] = (byte) ((i >> 16) & 255);
        this.f804d = i10 + 4;
        bArr[i13] = (byte) ((i >> 24) & 255);
    }

    public final void U(long j8) {
        int i = this.f804d;
        int i10 = i + 1;
        this.f804d = i10;
        byte[] bArr = this.f802b;
        bArr[i] = (byte) (j8 & 255);
        int i11 = i + 2;
        this.f804d = i11;
        bArr[i10] = (byte) ((j8 >> 8) & 255);
        int i12 = i + 3;
        this.f804d = i12;
        bArr[i11] = (byte) ((j8 >> 16) & 255);
        int i13 = i + 4;
        this.f804d = i13;
        bArr[i12] = (byte) (255 & (j8 >> 24));
        int i14 = i + 5;
        this.f804d = i14;
        bArr[i13] = (byte) (((int) (j8 >> 32)) & 255);
        int i15 = i + 6;
        this.f804d = i15;
        bArr[i14] = (byte) (((int) (j8 >> 40)) & 255);
        int i16 = i + 7;
        this.f804d = i16;
        bArr[i15] = (byte) (((int) (j8 >> 48)) & 255);
        this.f804d = i + 8;
        bArr[i16] = (byte) (((int) (j8 >> 56)) & 255);
    }

    public final void V(int i, int i10) {
        W((i << 3) | i10);
    }

    public final void W(int i) {
        boolean z2 = f800g;
        byte[] bArr = this.f802b;
        if (z2) {
            while ((i & (-128)) != 0) {
                int i10 = this.f804d;
                this.f804d = i10 + 1;
                h1.j(bArr, i10, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i11 = this.f804d;
            this.f804d = i11 + 1;
            h1.j(bArr, i11, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i12 = this.f804d;
            this.f804d = i12 + 1;
            bArr[i12] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i13 = this.f804d;
        this.f804d = i13 + 1;
        bArr[i13] = (byte) i;
    }

    public final void X(long j8) {
        boolean z2 = f800g;
        byte[] bArr = this.f802b;
        if (z2) {
            while ((j8 & (-128)) != 0) {
                int i = this.f804d;
                this.f804d = i + 1;
                h1.j(bArr, i, (byte) ((((int) j8) | 128) & 255));
                j8 >>>= 7;
            }
            int i10 = this.f804d;
            this.f804d = i10 + 1;
            h1.j(bArr, i10, (byte) j8);
            return;
        }
        while ((j8 & (-128)) != 0) {
            int i11 = this.f804d;
            this.f804d = i11 + 1;
            bArr[i11] = (byte) ((((int) j8) | 128) & 255);
            j8 >>>= 7;
        }
        int i12 = this.f804d;
        this.f804d = i12 + 1;
        bArr[i12] = (byte) j8;
    }

    public final void d0() throws IOException {
        this.f805e.write(this.f802b, 0, this.f804d);
        this.f804d = 0;
    }

    public final void e0(int i) throws IOException {
        if (this.f803c - this.f804d < i) {
            d0();
        }
    }

    public final void f0(byte b9) throws IOException {
        if (this.f804d == this.f803c) {
            d0();
        }
        int i = this.f804d;
        this.f804d = i + 1;
        this.f802b[i] = b9;
    }

    public final void g0(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.f804d;
        int i12 = this.f803c;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f802b;
        if (i13 >= i10) {
            System.arraycopy(bArr, i, bArr2, i11, i10);
            this.f804d += i10;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i11, i13);
        int i14 = i + i13;
        int i15 = i10 - i13;
        this.f804d = i12;
        d0();
        if (i15 > i12) {
            this.f805e.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f804d = i15;
        }
    }

    public final void h0(int i, boolean z2) throws IOException {
        e0(11);
        V(i, 0);
        byte b9 = z2 ? (byte) 1 : (byte) 0;
        int i10 = this.f804d;
        this.f804d = i10 + 1;
        this.f802b[i10] = b9;
    }

    public final void i0(int i, g gVar) {
        t0(i, 2);
        j0(gVar);
    }

    public final void j0(g gVar) throws IOException {
        v0(gVar.size());
        Q(gVar.f768w, gVar.e(), gVar.size());
    }

    public final void k0(int i, int i10) {
        e0(14);
        V(i, 5);
        T(i10);
    }

    public final void l0(int i) throws IOException {
        e0(4);
        T(i);
    }

    public final void m0(int i, long j8) {
        e0(18);
        V(i, 1);
        U(j8);
    }

    public final void n0(long j8) throws IOException {
        e0(8);
        U(j8);
    }

    public final void o0(int i, int i10) throws IOException {
        e0(20);
        V(i, 0);
        if (i10 >= 0) {
            W(i10);
        } else {
            X(i10);
        }
    }

    public final void p0(int i) throws IOException {
        if (i >= 0) {
            v0(i);
        } else {
            x0(i);
        }
    }

    public final void q0(int i, a aVar, u0 u0Var) throws IOException {
        t0(i, 2);
        v0(aVar.a(u0Var));
        u0Var.b(aVar, this.f801a);
    }

    public final void r0(int i, String str) throws IOException {
        t0(i, 2);
        s0(str);
    }

    public final void s0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iB0 = b0(length);
            int i = iB0 + length;
            int i10 = this.f803c;
            if (i > i10) {
                byte[] bArr = new byte[length];
                int iP = k1.f799a.p(str, bArr, 0, length);
                v0(iP);
                g0(bArr, 0, iP);
                return;
            }
            if (i > i10 - this.f804d) {
                d0();
            }
            int iB02 = b0(str.length());
            int i11 = this.f804d;
            byte[] bArr2 = this.f802b;
            try {
                if (iB02 == iB0) {
                    int i12 = i11 + iB02;
                    this.f804d = i12;
                    int iP2 = k1.f799a.p(str, bArr2, i12, i10 - i12);
                    this.f804d = i11;
                    W((iP2 - i11) - iB02);
                    this.f804d = iP2;
                } else {
                    int iA = k1.a(str);
                    W(iA);
                    this.f804d = k1.f799a.p(str, bArr2, this.f804d, iA);
                }
            } catch (j1 e7) {
                this.f804d = i11;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new a6.c(e10);
            }
        } catch (j1 e11) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(x.f870a);
            try {
                v0(bytes.length);
                Q(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new a6.c(e12);
            }
        }
    }

    public final void t0(int i, int i10) {
        v0((i << 3) | i10);
    }

    public final void u0(int i, int i10) throws IOException {
        e0(20);
        V(i, 0);
        W(i10);
    }

    public final void v0(int i) throws IOException {
        e0(5);
        W(i);
    }

    public final void w0(int i, long j8) {
        e0(20);
        V(i, 0);
        X(j8);
    }

    public final void x0(long j8) throws IOException {
        e0(10);
        X(j8);
    }
}
