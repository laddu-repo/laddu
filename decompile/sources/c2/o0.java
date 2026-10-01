package c2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends s1.h {

    /* renamed from: i, reason: collision with root package name */
    public int f1907i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1908k;

    /* renamed from: l, reason: collision with root package name */
    public int f1909l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f1910m;

    /* renamed from: n, reason: collision with root package name */
    public int f1911n;

    /* renamed from: o, reason: collision with root package name */
    public long f1912o;

    @Override // s1.h
    public final s1.e a(s1.e eVar) {
        if (u1.a0.L(eVar.f11984c)) {
            this.f1908k = true;
            if (this.f1907i == 0 && this.j == 0) {
                return s1.e.f11981e;
            }
            return eVar;
        }
        throw new s1.f(eVar);
    }

    @Override // s1.h
    public final void b() {
        if (this.f1908k) {
            this.f1908k = false;
            int i6 = this.j;
            int i10 = this.f11987b.f11985d;
            this.f1910m = new byte[i6 * i10];
            this.f1909l = this.f1907i * i10;
        }
        this.f1911n = 0;
    }

    @Override // s1.h, s1.g
    public final boolean c() {
        if (super.c() && this.f1911n == 0) {
            return true;
        }
        return false;
    }

    @Override // s1.h, s1.g
    public final ByteBuffer d() {
        int i6;
        if (super.c() && (i6 = this.f1911n) > 0) {
            j(i6).put(this.f1910m, 0, this.f1911n).flip();
            this.f1911n = 0;
        }
        return super.d();
    }

    @Override // s1.g
    public final void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        if (i6 != 0) {
            int min = Math.min(i6, this.f1909l);
            this.f1912o += min / this.f11987b.f11985d;
            this.f1909l -= min;
            byteBuffer.position(position + min);
            if (this.f1909l > 0) {
                return;
            }
            int i10 = i6 - min;
            int length = (this.f1911n + i10) - this.f1910m.length;
            ByteBuffer j = j(length);
            int i11 = u1.a0.i(length, 0, this.f1911n);
            j.put(this.f1910m, 0, i11);
            int i12 = u1.a0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            j.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f1911n - i11;
            this.f1911n = i14;
            byte[] bArr = this.f1910m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f1910m, this.f1911n, i13);
            this.f1911n += i13;
            j.flip();
        }
    }

    @Override // s1.h
    public final void h() {
        if (this.f1908k) {
            if (this.f1911n > 0) {
                this.f1912o += r0 / this.f11987b.f11985d;
            }
            this.f1911n = 0;
        }
    }

    @Override // s1.h
    public final void i() {
        this.f1910m = u1.a0.f12751b;
    }
}
