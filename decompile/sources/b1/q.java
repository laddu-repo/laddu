package b1;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends OutputStream {

    /* renamed from: x, reason: collision with root package name */
    public final FileOutputStream f1318x;

    public q(FileOutputStream fileOutputStream) {
        this.f1318x = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f1318x.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i6) {
        this.f1318x.write(i6);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) {
        kotlin.jvm.internal.k.e(b10, "b");
        this.f1318x.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i6, int i10) {
        kotlin.jvm.internal.k.e(bytes, "bytes");
        this.f1318x.write(bytes, i6, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
