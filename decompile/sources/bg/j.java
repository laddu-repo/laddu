package bg;

import com.google.protobuf.c3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1723x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1724y;

    public /* synthetic */ j(m mVar, int i6) {
        this.f1723x = i6;
        this.f1724y = mVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        switch (this.f1723x) {
            case 0:
                min = Math.min(((k) this.f1724y).f1726y, Integer.MAX_VALUE);
                break;
            case 1:
                f0 f0Var = (f0) this.f1724y;
                if (!f0Var.f1709z) {
                    min = Math.min(f0Var.f1708y.f1726y, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
            default:
                return ((ByteBuffer) this.f1724y).remaining();
        }
        return (int) min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f1723x) {
            case 0:
                return;
            case 1:
                ((f0) this.f1724y).close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i6) {
        switch (this.f1723x) {
            case 2:
                ((ByteBuffer) this.f1724y).mark();
                return;
            default:
                super.mark(i6);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f1723x) {
            case 2:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f1723x) {
            case 0:
                k kVar = (k) this.f1724y;
                if (kVar.f1726y > 0) {
                    return kVar.readByte() & 255;
                }
                return -1;
            case 1:
                f0 f0Var = (f0) this.f1724y;
                k kVar2 = f0Var.f1708y;
                if (f0Var.f1709z) {
                    throw new IOException("closed");
                }
                if (kVar2.f1726y == 0 && f0Var.f1707x.read(kVar2, 8192L) == -1) {
                    return -1;
                }
                return kVar2.readByte() & 255;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f1724y;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        switch (this.f1723x) {
            case 2:
                try {
                    ((ByteBuffer) this.f1724y).reset();
                    return;
                } catch (InvalidMarkException e10) {
                    throw new IOException(e10);
                }
            default:
                super.reset();
                return;
        }
    }

    public String toString() {
        switch (this.f1723x) {
            case 0:
                return ((k) this.f1724y) + ".inputStream()";
            case 1:
                return ((f0) this.f1724y) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    public j(c3 c3Var) {
        this.f1723x = 2;
        this.f1724y = c3Var.f2882x.slice();
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i6, int i10) {
        switch (this.f1723x) {
            case 0:
                kotlin.jvm.internal.k.e(sink, "sink");
                return ((k) this.f1724y).read(sink, i6, i10);
            case 1:
                kotlin.jvm.internal.k.e(sink, "data");
                f0 f0Var = (f0) this.f1724y;
                k kVar = f0Var.f1708y;
                if (!f0Var.f1709z) {
                    b.f(sink.length, i6, i10);
                    if (kVar.f1726y == 0 && f0Var.f1707x.read(kVar, 8192L) == -1) {
                        return -1;
                    }
                    return kVar.read(sink, i6, i10);
                }
                throw new IOException("closed");
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f1724y;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i10, byteBuffer.remaining());
                byteBuffer.get(sink, i6, min);
                return min;
        }
    }

    private final void d() {
    }
}
