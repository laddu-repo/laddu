package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f2387x = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f2388y = 31;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte f2389v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2390w;

    public i(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(d0.d.h(i, "Cannot add invalid orientation: "));
        }
        this.f2389v = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i10 = this.f2390w;
        int i11 = (i10 < 2 || i10 > (i = f2388y)) ? super.read() : i10 == i ? this.f2389v : f2387x[i10 - 2] & 255;
        if (i11 != -1) {
            this.f2390w++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = super.skip(j8);
        if (jSkip > 0) {
            this.f2390w = (int) (((long) this.f2390w) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        int i12 = this.f2390w;
        int i13 = f2388y;
        if (i12 > i13) {
            i11 = super.read(bArr, i, i10);
        } else if (i12 == i13) {
            bArr[i] = this.f2389v;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i, 2 - i12);
        } else {
            int iMin = Math.min(i13 - i12, i10);
            System.arraycopy(f2387x, this.f2390w - 2, bArr, i, iMin);
            i11 = iMin;
        }
        if (i11 > 0) {
            this.f2390w += i11;
        }
        return i11;
    }
}
