package j2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends y1.h {
    public long F;
    public int G;
    public int H;

    @Override // y1.h, y1.a
    public final void clear() {
        super.clear();
        this.G = 0;
    }

    public final boolean f(y1.h hVar) {
        ByteBuffer byteBuffer;
        u1.c.b(!hVar.getFlag(1073741824));
        u1.c.b(!hVar.hasSupplementalData());
        u1.c.b(!hVar.isEndOfStream());
        if (g()) {
            if (this.G < this.H) {
                ByteBuffer byteBuffer2 = hVar.f14812z;
                if (byteBuffer2 != null && (byteBuffer = this.f14812z) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i6 = this.G;
        this.G = i6 + 1;
        if (i6 == 0) {
            this.B = hVar.B;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f14812z;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f14812z.put(byteBuffer3);
        }
        this.F = hVar.B;
        return true;
    }

    public final boolean g() {
        if (this.G > 0) {
            return true;
        }
        return false;
    }
}
