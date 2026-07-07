package a2;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o1 implements q2.i0, f2.m {

    /* renamed from: x, reason: collision with root package name */
    public final q1 f358x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1 f359y;

    public o1(r1 r1Var, q1 q1Var) {
        this.f359y = r1Var;
        this.f358x = q1Var;
    }

    @Override // f2.m
    public final void B(int i6, q2.c0 c0Var, int i10) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new l1(this, a10, i10, 0));
        }
    }

    @Override // f2.m
    public final void K(int i6, q2.c0 c0Var, Exception exc) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new e1(this, a10, exc, 1));
        }
    }

    @Override // q2.i0
    public final void L(int i6, q2.c0 c0Var, q2.u uVar, n2.g gVar) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new k1(this, a10, uVar, gVar, 0));
        }
    }

    @Override // q2.i0
    public final void M(int i6, q2.c0 c0Var, n2.g gVar) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new i1(this, a10, gVar, 1));
        }
    }

    public final Pair a(int i6, q2.c0 c0Var) {
        q2.c0 c0Var2;
        q1 q1Var = this.f358x;
        q2.c0 c0Var3 = null;
        if (c0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 < q1Var.f368c.size()) {
                    if (((q2.c0) q1Var.f368c.get(i10)).f10837d == c0Var.f10837d) {
                        Object obj = c0Var.f10834a;
                        Object obj2 = q1Var.f367b;
                        int i11 = x1.f489n;
                        c0Var2 = c0Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i10++;
                } else {
                    c0Var2 = null;
                    break;
                }
            }
            if (c0Var2 == null) {
                return null;
            }
            c0Var3 = c0Var2;
        }
        return Pair.create(Integer.valueOf(i6 + q1Var.f369d), c0Var3);
    }

    @Override // q2.i0
    public final void j(int i6, q2.c0 c0Var, final q2.u uVar, final n2.g gVar, final IOException iOException, final boolean z10) {
        final Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new Runnable() { // from class: a2.n1
                @Override // java.lang.Runnable
                public final void run() {
                    b2.f fVar = (b2.f) o1.this.f359y.f385i;
                    Pair pair = a10;
                    fVar.j(((Integer) pair.first).intValue(), (q2.c0) pair.second, uVar, gVar, iOException, z10);
                }
            });
        }
    }

    @Override // f2.m
    public final void l(int i6, q2.c0 c0Var) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new j1(this, a10, 1));
        }
    }

    @Override // f2.m
    public final void n(int i6, q2.c0 c0Var) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new j1(this, a10, 2));
        }
    }

    @Override // q2.i0
    public final void u(int i6, q2.c0 c0Var, q2.u uVar, n2.g gVar, int i10) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new m1(this, a10, uVar, gVar, i10));
        }
    }

    @Override // q2.i0
    public final void v(int i6, q2.c0 c0Var, q2.u uVar, n2.g gVar) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new k1(this, a10, uVar, gVar, 1));
        }
    }

    @Override // q2.i0
    public final void w(int i6, q2.c0 c0Var, n2.g gVar) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new i1(this, a10, gVar, 0));
        }
    }

    @Override // f2.m
    public final void z(int i6, q2.c0 c0Var) {
        Pair a10 = a(i6, c0Var);
        if (a10 != null) {
            ((u1.x) this.f359y.j).c(new j1(this, a10, 0));
        }
    }
}
