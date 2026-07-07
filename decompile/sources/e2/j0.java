package e2;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends u1.h {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f4658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4660o;

    @Override // u1.h, u1.g
    public final boolean b() {
        return super.b() && this.f4659n == 0;
    }

    @Override // u1.h, u1.g
    public final ByteBuffer c() {
        int i;
        if (super.b() && (i = this.f4659n) > 0) {
            k(i).put(this.f4658m, 0, this.f4659n).flip();
            this.f4659n = 0;
        }
        return super.c();
    }

    @Override // u1.g
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f4657l);
        this.f4660o += (long) (iMin / this.f12630b.f12628d);
        this.f4657l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f4657l > 0) {
            return;
        }
        int i10 = i - iMin;
        int length = (this.f4659n + i10) - this.f4658m.length;
        ByteBuffer byteBufferK = k(length);
        int iH = w1.b0.h(length, 0, this.f4659n);
        byteBufferK.put(this.f4658m, 0, iH);
        int iH2 = w1.b0.h(length - iH, 0, i10);
        byteBuffer.limit(byteBuffer.position() + iH2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i11 = i10 - iH2;
        int i12 = this.f4659n - iH;
        this.f4659n = i12;
        byte[] bArr = this.f4658m;
        System.arraycopy(bArr, iH, bArr, 0, i12);
        byteBuffer.get(this.f4658m, this.f4659n, i11);
        this.f4659n += i11;
        byteBufferK.flip();
    }

    @Override // u1.h
    public final u1.e g(u1.e eVar) throws u1.f {
        if (!w1.b0.I(eVar.f12627c)) {
            throw new u1.f(eVar);
        }
        this.f4656k = true;
        return (this.i == 0 && this.f4655j == 0) ? u1.e.f12624e : eVar;
    }

    @Override // u1.h
    public final void h() {
        if (this.f4656k) {
            this.f4656k = false;
            int i = this.f4655j;
            int i10 = this.f12630b.f12628d;
            this.f4658m = new byte[i * i10];
            this.f4657l = this.i * i10;
        }
        this.f4659n = 0;
    }

    @Override // u1.h
    public final void i() {
        if (this.f4656k) {
            int i = this.f4659n;
            if (i > 0) {
                this.f4660o += (long) (i / this.f12630b.f12628d);
            }
            this.f4659n = 0;
        }
    }

    @Override // u1.h
    public final void j() {
        this.f4658m = w1.b0.f13688c;
    }
}
