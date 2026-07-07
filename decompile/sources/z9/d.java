package z9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14838e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f14834a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14835b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14836c = 16;
    public int f = 0;

    public d() {
        long j8 = 0;
        this.f14837d = j8;
        this.f14838e = j8;
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f14834a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f14836c) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void b(ByteBuffer byteBuffer) {
        long j8 = byteBuffer.getLong();
        long j9 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f14837d;
        this.f14837d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j10 = this.f14838e;
        this.f14837d = ((jRotateLeft2 + j10) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j10;
        this.f14838e = jRotateLeft3;
        this.f14838e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f14837d) * 5) + 944331445;
        this.f += 16;
    }

    public final d c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f14834a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = this.f14835b - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= this.f14836c) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}
