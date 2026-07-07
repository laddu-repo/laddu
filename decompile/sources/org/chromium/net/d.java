package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends UploadDataProvider {

    /* renamed from: x, reason: collision with root package name */
    public volatile FileChannel f10200x;

    /* renamed from: y, reason: collision with root package name */
    public final c f10201y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f10202z = new Object();

    public d(c cVar) {
        this.f10201y = cVar;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.f10200x;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public final FileChannel d() {
        if (this.f10200x == null) {
            synchronized (this.f10202z) {
                try {
                    if (this.f10200x == null) {
                        this.f10200x = this.f10201y.p();
                    }
                } finally {
                }
            }
        }
        return this.f10200x;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return d().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            FileChannel d10 = d();
            int i6 = 0;
            while (i6 == 0) {
                int read = d10.read(byteBuffer);
                if (read == -1) {
                    break;
                } else {
                    i6 += read;
                }
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        d().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
