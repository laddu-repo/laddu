package y1;

import java.nio.ByteBuffer;
import r1.f0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class h extends a {
    public boolean A;
    public long B;
    public ByteBuffer C;
    public final int D;
    public final int E;

    /* renamed from: x, reason: collision with root package name */
    public q f14810x;

    /* renamed from: y, reason: collision with root package name */
    public final d f14811y = new d();

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer f14812z;

    static {
        f0.a("media3.decoder");
    }

    public h(int i6, int i10) {
        this.D = i6;
        this.E = i10;
    }

    public final ByteBuffer a(int i6) {
        int capacity;
        int i10 = this.D;
        if (i10 == 1) {
            return ByteBuffer.allocate(i6);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i6);
        }
        ByteBuffer byteBuffer = this.f14812z;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i6 + ")");
    }

    public final void b(int i6) {
        int i10 = i6 + this.E;
        ByteBuffer byteBuffer = this.f14812z;
        if (byteBuffer == null) {
            this.f14812z = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f14812z = byteBuffer;
            return;
        }
        ByteBuffer a10 = a(i11);
        a10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a10.put(byteBuffer);
        }
        this.f14812z = a10;
    }

    @Override // y1.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f14812z;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.C;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.A = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.f14812z;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.C;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
