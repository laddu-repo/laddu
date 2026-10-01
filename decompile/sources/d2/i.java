package d2;

import java.util.concurrent.atomic.AtomicLong;
import u1.a0;
import w8.x;
import y2.f0;
import y2.q;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements h, y2.p, q, s9.d {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3731x;

    /* renamed from: y, reason: collision with root package name */
    public long f3732y;

    /* renamed from: z, reason: collision with root package name */
    public Object f3733z;

    public /* synthetic */ i(long j, Object obj, int i6) {
        this.f3731x = i6;
        this.f3732y = j;
        this.f3733z = obj;
    }

    @Override // y2.q
    public f0 A(int i6, int i10) {
        return ((q) this.f3733z).A(i6, i10);
    }

    @Override // d2.h
    public long B() {
        return 0L;
    }

    @Override // y2.p
    public void C(byte[] bArr, int i6, int i10) {
        ((y2.p) this.f3733z).C(bArr, i6, i10);
    }

    public void D(int i6) {
        if (i6 >= 64) {
            i iVar = (i) this.f3733z;
            if (iVar != null) {
                iVar.D(i6 - 64);
                return;
            }
            return;
        }
        this.f3732y &= ~(1 << i6);
    }

    @Override // d2.h
    public long E(long j) {
        return ((y2.k) this.f3733z).f14917a;
    }

    @Override // d2.h
    public long F(long j, long j10) {
        return ((y2.k) this.f3733z).f14917a;
    }

    public int G(int i6) {
        i iVar = (i) this.f3733z;
        if (iVar == null) {
            if (i6 >= 64) {
                return Long.bitCount(this.f3732y);
            }
            return Long.bitCount(this.f3732y & ((1 << i6) - 1));
        }
        if (i6 < 64) {
            return Long.bitCount(this.f3732y & ((1 << i6) - 1));
        }
        return Long.bitCount(this.f3732y) + iVar.G(i6 - 64);
    }

    public void H() {
        if (((i) this.f3733z) == null) {
            this.f3733z = new i();
        }
    }

    public boolean I(int i6) {
        if (i6 >= 64) {
            H();
            return ((i) this.f3733z).I(i6 - 64);
        }
        if ((this.f3732y & (1 << i6)) != 0) {
            return true;
        }
        return false;
    }

    public void J(int i6, boolean z10) {
        boolean z11;
        if (i6 >= 64) {
            H();
            ((i) this.f3733z).J(i6 - 64, z10);
            return;
        }
        long j = this.f3732y;
        if ((Long.MIN_VALUE & j) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i6) - 1;
        this.f3732y = ((j & (~j10)) << 1) | (j & j10);
        if (z10) {
            M(i6);
        } else {
            D(i6);
        }
        if (!z11 && ((i) this.f3733z) == null) {
            return;
        }
        H();
        ((i) this.f3733z).J(0, z11);
    }

    public boolean K(int i6) {
        boolean z10;
        if (i6 >= 64) {
            H();
            return ((i) this.f3733z).K(i6 - 64);
        }
        long j = 1 << i6;
        long j10 = this.f3732y;
        if ((j10 & j) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j);
        this.f3732y = j11;
        long j12 = j - 1;
        this.f3732y = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        i iVar = (i) this.f3733z;
        if (iVar != null) {
            if (iVar.I(0)) {
                M(63);
            }
            ((i) this.f3733z).K(0);
        }
        return z10;
    }

    public void L() {
        this.f3732y = 0L;
        i iVar = (i) this.f3733z;
        if (iVar != null) {
            iVar.L();
        }
    }

    public void M(int i6) {
        if (i6 >= 64) {
            H();
            ((i) this.f3733z).M(i6 - 64);
        } else {
            this.f3732y |= 1 << i6;
        }
    }

    @Override // d2.h
    public long b(long j) {
        return ((y2.k) this.f3733z).f14921e[(int) j] - this.f3732y;
    }

    @Override // d2.h
    public long c(long j, long j10) {
        return ((y2.k) this.f3733z).f14920d[(int) j];
    }

    @Override // y2.p
    public boolean d(byte[] bArr, int i6, int i10, boolean z10) {
        return ((y2.p) this.f3733z).d(bArr, 0, i10, z10);
    }

    @Override // d2.h
    public long f(long j, long j10) {
        return 0L;
    }

    @Override // d2.h
    public long g(long j, long j10) {
        return -9223372036854775807L;
    }

    @Override // y2.p
    public long getLength() {
        return ((y2.p) this.f3733z).getLength() - this.f3732y;
    }

    @Override // y2.p
    public long getPosition() {
        return ((y2.p) this.f3733z).getPosition() - this.f3732y;
    }

    @Override // d2.h
    public e2.j h(long j) {
        return new e2.j(null, ((y2.k) this.f3733z).f14919c[(int) j], r1.f14918b[r8]);
    }

    @Override // y2.p
    public boolean j(int i6, boolean z10) {
        return ((y2.p) this.f3733z).j(i6, true);
    }

    @Override // y2.p
    public boolean k(byte[] bArr, int i6, int i10, boolean z10) {
        return ((y2.p) this.f3733z).k(bArr, i6, i10, z10);
    }

    @Override // y2.p
    public long l() {
        return ((y2.p) this.f3733z).l() - this.f3732y;
    }

    @Override // y2.q
    public void n(z zVar) {
        ((q) this.f3733z).n(new g3.d(this, zVar, zVar));
    }

    @Override // y2.p
    public void o(int i6) {
        ((y2.p) this.f3733z).o(i6);
    }

    @Override // s9.d
    public /* synthetic */ void onFailure(Exception exc) {
        n9.j jVar = (n9.j) this.f3733z;
        ((AtomicLong) jVar.A).set(this.f3732y);
    }

    @Override // y2.p
    public int p(int i6) {
        return ((y2.p) this.f3733z).p(i6);
    }

    @Override // y2.p
    public int r(byte[] bArr, int i6, int i10) {
        return ((y2.p) this.f3733z).r(bArr, i6, i10);
    }

    @Override // r1.i
    public int read(byte[] bArr, int i6, int i10) {
        return ((y2.p) this.f3733z).read(bArr, i6, i10);
    }

    @Override // y2.p
    public void readFully(byte[] bArr, int i6, int i10) {
        ((y2.p) this.f3733z).readFully(bArr, i6, i10);
    }

    @Override // d2.h
    public long s(long j, long j10) {
        y2.k kVar = (y2.k) this.f3733z;
        return a0.e(kVar.f14921e, j + this.f3732y, true);
    }

    @Override // y2.q
    public void t() {
        ((q) this.f3733z).t();
    }

    public String toString() {
        switch (this.f3731x) {
            case 7:
                if (((i) this.f3733z) == null) {
                    return Long.toBinaryString(this.f3732y);
                }
                return ((i) this.f3733z).toString() + "xx" + Long.toBinaryString(this.f3732y);
            default:
                return super.toString();
        }
    }

    @Override // y2.p
    public void v() {
        ((y2.p) this.f3733z).v();
    }

    @Override // y2.p
    public void w(int i6) {
        ((y2.p) this.f3733z).w(i6);
    }

    @Override // d2.h
    public boolean x() {
        return true;
    }

    public /* synthetic */ i(Object obj, long j, int i6) {
        this.f3731x = i6;
        this.f3733z = obj;
        this.f3732y = j;
    }

    public i(a9.a aVar) {
        this.f3731x = 6;
        x.g(aVar);
        this.f3733z = aVar;
    }

    public i(y2.p pVar, long j) {
        this.f3731x = 2;
        this.f3733z = pVar;
        u1.c.b(pVar.getPosition() >= j);
        this.f3732y = j;
    }

    public i() {
        this.f3731x = 7;
        this.f3732y = 0L;
    }
}
