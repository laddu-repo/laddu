package c2;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends s1.h {

    /* renamed from: n, reason: collision with root package name */
    public int f1891n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1892o;

    /* renamed from: p, reason: collision with root package name */
    public int f1893p;

    /* renamed from: q, reason: collision with root package name */
    public long f1894q;
    public byte[] s;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f1898v;

    /* renamed from: r, reason: collision with root package name */
    public int f1895r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f1896t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f1897u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f1889l = 100000;

    /* renamed from: i, reason: collision with root package name */
    public final float f1887i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f1890m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    public final int f1888k = 10;
    public final short j = 1024;

    public m0() {
        byte[] bArr = u1.a0.f12751b;
        this.s = bArr;
        this.f1898v = bArr;
    }

    @Override // s1.h
    public final s1.e a(s1.e eVar) {
        if (eVar.f11984c == 2) {
            if (eVar.f11982a == -1) {
                return s1.e.f11981e;
            }
            return eVar;
        }
        throw new s1.f(eVar);
    }

    @Override // s1.h
    public final void b() {
        if (isActive()) {
            int i6 = this.f11987b.f11983b * 2;
            this.f1891n = i6;
            int i10 = ((((int) ((this.f1889l * r0.f11982a) / 1000000)) / 2) / i6) * i6 * 2;
            if (this.s.length != i10) {
                this.s = new byte[i10];
                this.f1898v = new byte[i10];
            }
        }
        this.f1893p = 0;
        this.f1894q = 0L;
        this.f1895r = 0;
        this.f1896t = 0;
        this.f1897u = 0;
    }

    @Override // s1.g
    public final void f(ByteBuffer byteBuffer) {
        boolean z10;
        int limit;
        boolean z11;
        boolean z12;
        int position;
        while (byteBuffer.hasRemaining() && !this.f11992g.hasRemaining()) {
            int i6 = this.f1893p;
            short s = this.j;
            boolean z13 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (this.f1896t < this.s.length) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.g(z10);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                                int i10 = this.f1891n;
                                limit = (position2 / i10) * i10;
                                break;
                            }
                            position2 += 2;
                        } else {
                            limit = byteBuffer.limit();
                            break;
                        }
                    }
                    int position3 = limit - byteBuffer.position();
                    int i11 = this.f1896t;
                    int i12 = this.f1897u;
                    int i13 = i11 + i12;
                    byte[] bArr = this.s;
                    if (i13 < bArr.length) {
                        i11 = bArr.length;
                    } else {
                        i13 = i12 - (bArr.length - i11);
                    }
                    int i14 = i11 - i13;
                    if (limit < limit2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int min = Math.min(position3, i14);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.s, i13, min);
                    int i15 = this.f1897u + min;
                    this.f1897u = i15;
                    if (i15 <= this.s.length) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u1.c.g(z12);
                    if (!z11 || position3 >= i14) {
                        z13 = false;
                    }
                    l(z13);
                    if (z13) {
                        this.f1893p = 0;
                        this.f1895r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s) {
                            int i16 = this.f1891n;
                            position = ((limit4 / i16) * i16) + i16;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f1893p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // s1.h
    public final void h() {
        if (this.f1897u > 0) {
            l(true);
            this.f1895r = 0;
        }
    }

    @Override // s1.h
    public final void i() {
        this.f1892o = false;
        byte[] bArr = u1.a0.f12751b;
        this.s = bArr;
        this.f1898v = bArr;
    }

    @Override // s1.h, s1.g
    public final boolean isActive() {
        if (super.isActive() && this.f1892o) {
            return true;
        }
        return false;
    }

    public final int k(int i6) {
        boolean z10;
        int length = ((((int) ((this.f1890m * this.f11987b.f11982a) / 1000000)) - this.f1895r) * this.f1891n) - (this.s.length / 2);
        if (length >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        int min = (int) Math.min((i6 * this.f1887i) + 0.5f, length);
        int i10 = this.f1891n;
        return (min / i10) * i10;
    }

    public final void l(boolean z10) {
        int length;
        int k8;
        boolean z11;
        boolean z12;
        int i6 = this.f1897u;
        byte[] bArr = this.s;
        if (i6 != bArr.length && !z10) {
            return;
        }
        boolean z13 = false;
        if (this.f1895r == 0) {
            if (z10) {
                m(i6, 3);
                length = i6;
            } else {
                if (i6 >= bArr.length / 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u1.c.g(z12);
                length = this.s.length / 2;
                m(length, 0);
            }
            k8 = length;
        } else if (z10) {
            int length2 = i6 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int k9 = k(length2) + (this.s.length / 2);
            m(k9, 2);
            k8 = k9;
            length = length3;
        } else {
            length = i6 - (bArr.length / 2);
            k8 = k(length);
            m(k8, 1);
        }
        if (length % this.f1891n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.f("bytesConsumed is not aligned to frame size: %s" + length, z11);
        if (i6 >= k8) {
            z13 = true;
        }
        u1.c.g(z13);
        this.f1897u -= length;
        int i10 = this.f1896t + length;
        this.f1896t = i10;
        this.f1896t = i10 % this.s.length;
        this.f1895r = (k8 / this.f1891n) + this.f1895r;
        this.f1894q += (length - k8) / r2;
    }

    public final void m(int i6, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i6 == 0) {
            return;
        }
        boolean z13 = true;
        if (this.f1897u >= i6) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        if (i10 == 2) {
            int i11 = this.f1896t;
            int i12 = this.f1897u;
            int i13 = i11 + i12;
            byte[] bArr = this.s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i6, this.f1898v, 0, i6);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i6) {
                    System.arraycopy(bArr, length - i6, this.f1898v, 0, i6);
                } else {
                    int i14 = i6 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.f1898v, 0, i14);
                    System.arraycopy(this.s, 0, this.f1898v, i14, length);
                }
            }
        } else {
            int i15 = this.f1896t;
            int i16 = i15 + i6;
            byte[] bArr2 = this.s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.f1898v, 0, i6);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.f1898v, 0, length2);
                System.arraycopy(this.s, 0, this.f1898v, length2, i6 - length2);
            }
        }
        if (i6 % this.f1891n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.a("sizeToOutput is not aligned to frame size: " + i6, z11);
        if (this.f1896t < this.s.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        u1.c.g(z12);
        byte[] bArr3 = this.f1898v;
        if (i6 % this.f1891n != 0) {
            z13 = false;
        }
        u1.c.a("byteOutput size is not aligned to frame size " + i6, z13);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i6; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.f1888k;
                if (i10 == 0) {
                    i20 = ((((i17 * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) / (i6 - 1)) * (i20 - 100)) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) * (100 - i20)) / (i6 - 1)) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
                }
                int i21 = (i19 * i20) / 100;
                if (i21 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = Byte.MAX_VALUE;
                } else if (i21 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = Byte.MIN_VALUE;
                } else {
                    bArr3[i17] = (byte) (i21 & 255);
                    bArr3[i18] = (byte) (i21 >> 8);
                }
            }
        }
        j(i6).put(bArr3, 0, i6).flip();
    }
}
