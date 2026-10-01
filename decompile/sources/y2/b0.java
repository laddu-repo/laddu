package y2;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f14858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14860c;

    /* renamed from: d, reason: collision with root package name */
    public int f14861d;

    /* renamed from: e, reason: collision with root package name */
    public int f14862e;

    /* renamed from: f, reason: collision with root package name */
    public q f14863f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f14864g;

    public b0(String str, int i6, int i10) {
        this.f14858a = i6;
        this.f14859b = i10;
        this.f14860c = str;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        if (j != 0 && this.f14862e != 1) {
            return;
        }
        this.f14862e = 1;
        this.f14861d = 0;
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        boolean z10;
        int i6 = this.f14859b;
        int i10 = this.f14858a;
        if (i10 != -1 && i6 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        u1.t tVar = new u1.t(i6);
        ((l) pVar).k(tVar.f12811a, 0, i6, false);
        if (tVar.E() == i10) {
            return true;
        }
        return false;
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    @Override // y2.o
    public final int i(p pVar, mc.i iVar) {
        int i6 = this.f14862e;
        if (i6 != 1) {
            if (i6 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        f0 f0Var = this.f14864g;
        f0Var.getClass();
        int e10 = f0Var.e(pVar, 1024, true);
        if (e10 == -1) {
            this.f14862e = 2;
            this.f14864g.c(0L, 1, this.f14861d, 0, null);
            this.f14861d = 0;
            return 0;
        }
        this.f14861d += e10;
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [y2.z, java.lang.Object] */
    @Override // y2.o
    public final void l(q qVar) {
        this.f14863f = qVar;
        f0 A = qVar.A(1024, 4);
        this.f14864g = A;
        r1.p pVar = new r1.p();
        String str = this.f14860c;
        pVar.f11610l = r1.k0.p(str);
        pVar.f11611m = r1.k0.p(str);
        r4.a.v(pVar, A);
        this.f14863f.t();
        this.f14863f.n(new Object());
        this.f14862e = 1;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
