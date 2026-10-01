package d1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends OutputStream {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FileOutputStream f3908v;

    public k1(FileOutputStream fileOutputStream) {
        this.f3908v = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f3908v.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f3908v.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        de.i.e(bArr, "b");
        this.f3908v.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        de.i.e(bArr, "bytes");
        this.f3908v.write(bArr, i, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
