package l2;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends DecoderInputBuffer {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8092v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8094x;

    public final boolean b(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        w1.a.d(!decoderInputBuffer.isEncrypted());
        w1.a.d(!decoderInputBuffer.hasSupplementalData());
        w1.a.d(!decoderInputBuffer.isEndOfStream());
        if (c()) {
            if (this.f8093w >= this.f8094x) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.data;
            if (byteBuffer2 != null && (byteBuffer = this.data) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f8093w;
        this.f8093w = i + 1;
        if (i == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.data;
        if (byteBuffer3 != null) {
            ensureSpaceForWrite(byteBuffer3.remaining());
            this.data.put(byteBuffer3);
        }
        this.f8092v = decoderInputBuffer.timeUs;
        return true;
    }

    public final boolean c() {
        return this.f8093w > 0;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, a2.a
    public final void clear() {
        super.clear();
        this.f8093w = 0;
    }
}
