package g3;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import mc.i;
import y2.b0;
import y2.f0;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5402a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5403b;

    public a(int i6) {
        if ((i6 & 1) != 0) {
            this.f5403b = new b0("image/jpeg", 65496, 2);
        } else {
            this.f5403b = new b();
        }
    }

    @Override // y2.o
    public final void a() {
        switch (this.f5402a) {
            case 0:
                ((o) this.f5403b).a();
                return;
            default:
                return;
        }
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        switch (this.f5402a) {
            case 0:
                ((o) this.f5403b).c(j, j10);
                return;
            default:
                return;
        }
    }

    @Override // y2.o
    public final o d() {
        int i6 = this.f5402a;
        return this;
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        switch (this.f5402a) {
            case 0:
                return ((o) this.f5403b).f(pVar);
            default:
                return true;
        }
    }

    @Override // y2.o
    public final List h() {
        switch (this.f5402a) {
            case 0:
            default:
                i0 i0Var = k0.f4008y;
                return c1.B;
        }
    }

    @Override // y2.o
    public final int i(p pVar, i iVar) {
        switch (this.f5402a) {
            case 0:
                return ((o) this.f5403b).i(pVar, iVar);
            default:
                if (pVar.p(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override // y2.o
    public final void l(q qVar) {
        switch (this.f5402a) {
            case 0:
                ((o) this.f5403b).l(qVar);
                return;
            default:
                f0 A = qVar.A(0, 3);
                qVar.n(new a3.b(-9223372036854775807L));
                qVar.t();
                r1.q qVar2 = (r1.q) this.f5403b;
                r1.p a10 = qVar2.a();
                a10.f11611m = r1.k0.p("text/x-unknown");
                a10.j = qVar2.f11670n;
                r4.a.v(a10, A);
                return;
        }
    }

    public a(r1.q qVar) {
        this.f5403b = qVar;
    }

    private final void b() {
    }

    private final void e(long j, long j10) {
    }
}
