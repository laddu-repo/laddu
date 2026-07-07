package sb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f11713v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f11714w;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f11714w = -1L;
        this.f11713v = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f11713v);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f11714w = this.f11713v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f11713v == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f11713v--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f11714w == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f11713v = this.f11714w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f11713v));
        this.f11713v -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        long j8 = this.f11713v;
        if (j8 == 0) {
            return -1;
        }
        int i11 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i10, j8));
        if (i11 != -1) {
            this.f11713v -= (long) i11;
        }
        return i11;
    }
}
