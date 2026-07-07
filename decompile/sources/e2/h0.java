package e2;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends u1.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4644q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f4646s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f4649v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4645r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4647t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4648u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f4639l = 100000;
    public final float i = 0.2f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f4640m = 2000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4638k = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f4637j = 1024;

    public h0() {
        byte[] bArr = w1.b0.f13688c;
        this.f4646s = bArr;
        this.f4649v = bArr;
    }

    @Override // u1.h, u1.g
    public final boolean a() {
        return super.a() && this.f4642o;
    }

    @Override // u1.g
    public final void e(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f12634g.hasRemaining()) {
            int i = this.f4643p;
            short s3 = this.f4637j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f4646s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s3) {
                        int i10 = this.f4641n;
                        iPosition = ((iLimit3 / i10) * i10) + i10;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f4643p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                w1.a.j(this.f4647t < this.f4646s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s3) {
                        int i11 = this.f4641n;
                        iLimit = (iPosition2 / i11) * i11;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f4647t;
                int i12 = this.f4648u;
                int length2 = length + i12;
                byte[] bArr = this.f4646s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i12 - (bArr.length - length);
                }
                int i13 = length - length2;
                boolean z2 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i13);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f4646s, length2, iMin);
                int i14 = this.f4648u + iMin;
                this.f4648u = i14;
                w1.a.j(i14 <= this.f4646s.length);
                boolean z10 = z2 && iPosition3 < i13;
                m(z10);
                if (z10) {
                    this.f4643p = 0;
                    this.f4645r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // u1.h
    public final u1.e g(u1.e eVar) throws u1.f {
        if (eVar.f12627c == 2) {
            return eVar.f12625a == -1 ? u1.e.f12624e : eVar;
        }
        throw new u1.f(eVar);
    }

    @Override // u1.h
    public final void h() {
        if (a()) {
            u1.e eVar = this.f12630b;
            int i = eVar.f12626b * 2;
            this.f4641n = i;
            int i10 = ((((int) ((this.f4639l * ((long) eVar.f12625a)) / 1000000)) / 2) / i) * i * 2;
            if (this.f4646s.length != i10) {
                this.f4646s = new byte[i10];
                this.f4649v = new byte[i10];
            }
        }
        this.f4643p = 0;
        this.f4644q = 0L;
        this.f4645r = 0;
        this.f4647t = 0;
        this.f4648u = 0;
    }

    @Override // u1.h
    public final void i() {
        if (this.f4648u > 0) {
            m(true);
            this.f4645r = 0;
        }
    }

    @Override // u1.h
    public final void j() {
        this.f4642o = false;
        byte[] bArr = w1.b0.f13688c;
        this.f4646s = bArr;
        this.f4649v = bArr;
    }

    public final int l(int i) {
        int length = ((((int) ((this.f4640m * ((long) this.f12630b.f12625a)) / 1000000)) - this.f4645r) * this.f4641n) - (this.f4646s.length / 2);
        w1.a.j(length >= 0);
        int iMin = (int) Math.min((i * this.i) + 0.5f, length);
        int i10 = this.f4641n;
        return (iMin / i10) * i10;
    }

    public final void m(boolean z2) {
        int length;
        int iL;
        int i = this.f4648u;
        byte[] bArr = this.f4646s;
        if (i == bArr.length || z2) {
            if (this.f4645r == 0) {
                if (z2) {
                    n(i, 3);
                    length = i;
                } else {
                    w1.a.j(i >= bArr.length / 2);
                    length = this.f4646s.length / 2;
                    n(length, 0);
                }
                iL = length;
            } else if (z2) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.f4646s.length / 2);
                n(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iL = l(length);
                n(iL, 1);
            }
            w1.a.i("bytesConsumed is not aligned to frame size: %s" + length, length % this.f4641n == 0);
            w1.a.j(i >= iL);
            this.f4648u -= length;
            int i10 = this.f4647t + length;
            this.f4647t = i10;
            this.f4647t = i10 % this.f4646s.length;
            int i11 = this.f4645r;
            int i12 = this.f4641n;
            this.f4645r = (iL / i12) + i11;
            this.f4644q += (long) ((length - iL) / i12);
        }
    }

    public final void n(int i, int i10) {
        if (i == 0) {
            return;
        }
        w1.a.d(this.f4648u >= i);
        if (i10 == 2) {
            int i11 = this.f4647t;
            int i12 = this.f4648u;
            int i13 = i11 + i12;
            byte[] bArr = this.f4646s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i, this.f4649v, 0, i);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f4649v, 0, i);
                } else {
                    int i14 = i - length;
                    System.arraycopy(bArr, bArr.length - i14, this.f4649v, 0, i14);
                    System.arraycopy(this.f4646s, 0, this.f4649v, i14, length);
                }
            }
        } else {
            int i15 = this.f4647t;
            int i16 = i15 + i;
            byte[] bArr2 = this.f4646s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.f4649v, 0, i);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.f4649v, 0, length2);
                System.arraycopy(this.f4646s, 0, this.f4649v, length2, i - length2);
            }
        }
        w1.a.c("sizeToOutput is not aligned to frame size: " + i, i % this.f4641n == 0);
        w1.a.j(this.f4647t < this.f4646s.length);
        byte[] bArr3 = this.f4649v;
        w1.a.c("byteOutput size is not aligned to frame size " + i, i % this.f4641n == 0);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.f4638k;
                if (i10 == 0) {
                    i20 = ((((i17 * 1000) / (i - 1)) * (i20 - 100)) / 1000) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * 1000) * (100 - i20)) / (i - 1)) / 1000;
                }
                int i21 = (i19 * i20) / 100;
                if (i21 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = 127;
                } else if (i21 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = -128;
                } else {
                    bArr3[i17] = (byte) (i21 & 255);
                    bArr3[i18] = (byte) (i21 >> 8);
                }
            }
        }
        k(i).put(bArr3, 0, i).flip();
    }
}
