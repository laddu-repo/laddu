package j6;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends MediaDataSource {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f6931v;

    public c0(ByteBuffer byteBuffer) {
        this.f6931v = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f6931v.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j8, byte[] bArr, int i, int i10) {
        ByteBuffer byteBuffer = this.f6931v;
        if (j8 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j8);
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
