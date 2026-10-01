package ic;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: x, reason: collision with root package name */
    public long f6741x;

    /* renamed from: y, reason: collision with root package name */
    public long f6742y;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f6742y = -1L;
        this.f6741x = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f6741x);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        ((FilterInputStream) this).in.mark(i6);
        this.f6742y = this.f6741x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f6741x == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f6741x--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f6742y != -1) {
                ((FilterInputStream) this).in.reset();
                this.f6741x = this.f6742y;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f6741x));
        this.f6741x -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        long j = this.f6741x;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i6, (int) Math.min(i10, j));
        if (read != -1) {
            this.f6741x -= read;
        }
        return read;
    }
}
