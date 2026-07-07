package f4;

import db.c1;
import db.k0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements y2.o {

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f4730c;

    /* renamed from: d, reason: collision with root package name */
    public final u1.s f4731d;

    /* renamed from: e, reason: collision with root package name */
    public y2.q f4732e;

    /* renamed from: f, reason: collision with root package name */
    public long f4733f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4735h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4736i;

    /* renamed from: a, reason: collision with root package name */
    public final e f4728a = new e(0, null, "audio/mp4a-latm", true);

    /* renamed from: b, reason: collision with root package name */
    public final u1.t f4729b = new u1.t(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f4734g = -1;

    public d(int i6) {
        u1.t tVar = new u1.t(10);
        this.f4730c = tVar;
        byte[] bArr = tVar.f12811a;
        this.f4731d = new u1.s(bArr.length, bArr);
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        this.f4735h = false;
        this.f4728a.c();
        this.f4733f = j10;
    }

    @Override // y2.o
    public final boolean f(y2.p pVar) {
        int i6 = 0;
        while (true) {
            u1.t tVar = this.f4730c;
            pVar.C(tVar.f12811a, 0, 10);
            tVar.K(0);
            if (tVar.B() != 4801587) {
                break;
            }
            tVar.L(3);
            int x10 = tVar.x();
            i6 += x10 + 10;
            pVar.o(x10);
        }
        pVar.v();
        pVar.o(i6);
        if (this.f4734g == -1) {
            this.f4734g = i6;
        }
        int i10 = i6;
        int i11 = 0;
        int i12 = 0;
        do {
            u1.t tVar2 = this.f4730c;
            y2.l lVar = (y2.l) pVar;
            lVar.k(tVar2.f12811a, 0, 2, false);
            tVar2.K(0);
            if ((tVar2.E() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.k(tVar2.f12811a, 0, 4, false);
                u1.s sVar = this.f4731d;
                sVar.q(14);
                int i13 = sVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.C = 0;
                    lVar.b(i10, false);
                } else {
                    lVar.b(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.C = 0;
                lVar.b(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i6 < 8192);
        return false;
    }

    @Override // y2.o
    public final List h() {
        db.i0 i0Var = k0.f4008y;
        return c1.B;
    }

    @Override // y2.o
    public final int i(y2.p pVar, mc.i iVar) {
        boolean z10;
        u1.c.h(this.f4732e);
        pVar.getLength();
        u1.t tVar = this.f4729b;
        int read = pVar.read(tVar.f12811a, 0, 2048);
        if (read == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f4736i) {
            this.f4732e.n(new a3.b(-9223372036854775807L));
            this.f4736i = true;
        }
        if (z10) {
            return -1;
        }
        tVar.K(0);
        tVar.J(read);
        boolean z11 = this.f4735h;
        e eVar = this.f4728a;
        if (!z11) {
            eVar.f4760u = this.f4733f;
            this.f4735h = true;
        }
        eVar.a(tVar);
        return 0;
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        this.f4732e = qVar;
        this.f4728a.f(qVar, new h0(0, 1));
        qVar.t();
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
