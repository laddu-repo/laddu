package j6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends FilterInputStream {
    public final d6.f A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile byte[] f6981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6985z;

    public x(InputStream inputStream, d6.f fVar) {
        super(inputStream);
        this.f6984y = -1;
        this.A = fVar;
        this.f6981v = (byte[]) fVar.d(65536, byte[].class);
    }

    public static void l() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f6984y;
        if (i != -1) {
            int i10 = this.f6985z - i;
            int i11 = this.f6983x;
            if (i10 < i11) {
                if (i == 0 && i11 > bArr.length && this.f6982w == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.A.d(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f6981v = bArr2;
                    this.A.h(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i12 = this.f6985z - this.f6984y;
                this.f6985z = i12;
                this.f6984y = 0;
                this.f6982w = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f6985z;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f6982w = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f6984y = -1;
            this.f6985z = 0;
            this.f6982w = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f6981v == null || inputStream == null) {
            l();
            throw null;
        }
        return (this.f6982w - this.f6985z) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6981v != null) {
            this.A.h(this.f6981v);
            this.f6981v = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void i() {
        if (this.f6981v != null) {
            this.A.h(this.f6981v);
            this.f6981v = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f6983x = Math.max(this.f6983x, i);
        this.f6984y = this.f6985z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f6981v;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            l();
            throw null;
        }
        if (this.f6985z >= this.f6982w && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f6981v && (bArr = this.f6981v) == null) {
            l();
            throw null;
        }
        int i = this.f6982w;
        int i10 = this.f6985z;
        if (i - i10 <= 0) {
            return -1;
        }
        this.f6985z = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f6981v == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f6984y;
        if (-1 == i) {
            throw new a6.c("Mark has been invalidated, pos: " + this.f6985z + " markLimit: " + this.f6983x);
        }
        this.f6985z = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j8) {
        if (j8 < 1) {
            return 0L;
        }
        byte[] bArr = this.f6981v;
        if (bArr == null) {
            l();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            l();
            throw null;
        }
        int i = this.f6982w;
        int i10 = this.f6985z;
        if (i - i10 >= j8) {
            this.f6985z = (int) (((long) i10) + j8);
            return j8;
        }
        long j9 = ((long) i) - ((long) i10);
        this.f6985z = i;
        if (this.f6984y == -1 || j8 > this.f6983x) {
            long jSkip = inputStream.skip(j8 - j9);
            if (jSkip > 0) {
                this.f6984y = -1;
            }
            return j9 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j9;
        }
        int i11 = this.f6982w;
        int i12 = this.f6985z;
        if (i11 - i12 >= j8 - j9) {
            this.f6985z = (int) ((((long) i12) + j8) - j9);
            return j8;
        }
        long j10 = (j9 + ((long) i11)) - ((long) i12);
        this.f6985z = i11;
        return j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f6981v;
        if (bArr2 == null) {
            l();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.f6985z;
            int i14 = this.f6982w;
            if (i13 < i14) {
                int i15 = i14 - i13;
                if (i15 >= i10) {
                    i15 = i10;
                }
                System.arraycopy(bArr2, i13, bArr, i, i15);
                this.f6985z += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f6984y == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f6981v && (bArr2 = this.f6981v) == null) {
                        l();
                        throw null;
                    }
                    int i16 = this.f6982w;
                    int i17 = this.f6985z;
                    i12 = i16 - i17;
                    if (i12 >= i11) {
                        i12 = i11;
                    }
                    System.arraycopy(bArr2, i17, bArr, i, i12);
                    this.f6985z += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i += i12;
            }
        } else {
            l();
            throw null;
        }
    }
}
