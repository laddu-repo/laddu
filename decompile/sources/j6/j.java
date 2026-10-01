package j6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l, a6.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ByteBuffer f6947v;

    public j() {
        this.f6947v = ByteBuffer.allocate(4);
    }

    @Override // j6.l
    public short c() throws k {
        ByteBuffer byteBuffer = this.f6947v;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new k();
    }

    @Override // a6.g
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f6947v) {
            this.f6947v.position(0);
            messageDigest.update(this.f6947v.putInt(num.intValue()).array());
        }
    }

    @Override // j6.l
    public int m() {
        return (c() << 8) | c();
    }

    @Override // j6.l
    public int p(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f6947v;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // j6.l
    public long skip(long j8) {
        ByteBuffer byteBuffer = this.f6947v;
        int iMin = (int) Math.min(byteBuffer.remaining(), j8);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public j(ByteBuffer byteBuffer) {
        this.f6947v = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
