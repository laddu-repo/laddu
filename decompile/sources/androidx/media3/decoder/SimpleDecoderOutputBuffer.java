package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.b;
import java.nio.ByteBuffer;
import y1.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends j {

    /* renamed from: x, reason: collision with root package name */
    public final b f1008x;

    /* renamed from: y, reason: collision with root package name */
    public ByteBuffer f1009y;

    public SimpleDecoderOutputBuffer(b bVar) {
        this.f1008x = bVar;
    }

    @Override // y1.j, y1.a
    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f1009y;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // y1.j
    public final void release() {
        this.f1008x.e(this);
    }
}
