package c2;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements o2.k0, h2.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j1 f1758v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k1 f1759w;

    public h1(k1 k1Var, j1 j1Var) {
        this.f1759w = k1Var;
        this.f1758v = j1Var;
    }

    @Override // o2.k0
    public final void F(int i, o2.d0 d0Var, o2.u uVar, o2.z zVar) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new e1(this, pairA, uVar, zVar, 1));
        }
    }

    @Override // o2.k0
    public final void H(int i, o2.d0 d0Var, final o2.u uVar, final o2.z zVar, final int i10) {
        final Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new Runnable() { // from class: c2.f1
                @Override // java.lang.Runnable
                public final void run() {
                    d2.f fVar = (d2.f) this.f1728v.f1759w.i;
                    Pair pair = pairA;
                    fVar.H(((Integer) pair.first).intValue(), (o2.d0) pair.second, uVar, zVar, i10);
                }
            });
        }
    }

    @Override // h2.l
    public final void M(int i, o2.d0 d0Var) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new d1(this, pairA, 2));
        }
    }

    public final Pair a(int i, o2.d0 d0Var) {
        o2.d0 d0VarA;
        j1 j1Var = this.f1758v;
        o2.d0 d0Var2 = null;
        if (d0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= j1Var.f1809c.size()) {
                    d0VarA = null;
                    break;
                }
                if (((o2.d0) j1Var.f1809c.get(i10)).f9407d == d0Var.f9407d) {
                    Object obj = d0Var.f9404a;
                    Object obj2 = j1Var.f1808b;
                    int i11 = q1.f1893k;
                    d0VarA = d0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (d0VarA == null) {
                return null;
            }
            d0Var2 = d0VarA;
        }
        return Pair.create(Integer.valueOf(i + j1Var.f1810d), d0Var2);
    }

    @Override // o2.k0
    public final void d(int i, o2.d0 d0Var, o2.u uVar, o2.z zVar) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new e1(this, pairA, uVar, zVar, 0));
        }
    }

    @Override // o2.k0
    public final void f(int i, o2.d0 d0Var, o2.z zVar) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new c1(this, pairA, zVar, 0));
        }
    }

    @Override // o2.k0
    public final void h(int i, o2.d0 d0Var, o2.z zVar) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new c1(this, pairA, zVar, 1));
        }
    }

    @Override // h2.l
    public final void i(int i, o2.d0 d0Var, Exception exc) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new androidx.emoji2.text.n(this, pairA, exc, 3));
        }
    }

    @Override // h2.l
    public final void k(int i, o2.d0 d0Var) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new d1(this, pairA, 1));
        }
    }

    @Override // h2.l
    public final void l(int i, o2.d0 d0Var, int i10) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new c.h(this, pairA, i10, 2));
        }
    }

    @Override // o2.k0
    public final void r(int i, o2.d0 d0Var, final o2.u uVar, final o2.z zVar, final IOException iOException, final boolean z2) {
        final Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new Runnable() { // from class: c2.g1
                @Override // java.lang.Runnable
                public final void run() {
                    d2.f fVar = (d2.f) this.f1744v.f1759w.i;
                    Pair pair = pairA;
                    fVar.r(((Integer) pair.first).intValue(), (o2.d0) pair.second, uVar, zVar, iOException, z2);
                }
            });
        }
    }

    @Override // h2.l
    public final void v(int i, o2.d0 d0Var) {
        Pair pairA = a(i, d0Var);
        if (pairA != null) {
            ((w1.x) this.f1759w.f1829j).c(new d1(this, pairA, 0));
        }
    }
}
