package o2;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k0, h2.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f9461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b3.a f9462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h2.k f9463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f9464y;

    public j(l lVar, Object obj) {
        this.f9464y = lVar;
        this.f9462w = lVar.a(null);
        this.f9463x = new h2.k(lVar.f9369d.f6097c, 0, null);
        this.f9461v = obj;
    }

    @Override // o2.k0
    public final void F(int i, d0 d0Var, u uVar, z zVar) {
        if (a(i, d0Var)) {
            b3.a aVar = this.f9462w;
            z zVarB = b(zVar, d0Var);
            aVar.getClass();
            aVar.d(new g0(aVar, uVar, zVarB, 0));
        }
    }

    @Override // o2.k0
    public final void H(int i, d0 d0Var, u uVar, z zVar, int i10) {
        if (a(i, d0Var)) {
            b3.a aVar = this.f9462w;
            z zVarB = b(zVar, d0Var);
            aVar.getClass();
            aVar.d(new f0(aVar, uVar, zVarB, i10));
        }
    }

    @Override // h2.l
    public final void M(int i, d0 d0Var) {
        if (a(i, d0Var)) {
            this.f9463x.b();
        }
    }

    public final boolean a(int i, d0 d0Var) {
        d0 d0VarT;
        Object obj = this.f9461v;
        l lVar = this.f9464y;
        if (d0Var != null) {
            d0VarT = lVar.t(obj, d0Var);
            if (d0VarT == null) {
                return false;
            }
        } else {
            d0VarT = null;
        }
        int iV = lVar.v(i, obj);
        b3.a aVar = this.f9462w;
        if (aVar.f1528w != iV || !Objects.equals((d0) aVar.f1529x, d0VarT)) {
            this.f9462w = new b3.a((CopyOnWriteArrayList) lVar.f9368c.f1530y, iV, d0VarT);
        }
        h2.k kVar = this.f9463x;
        if (kVar.f6095a == iV && Objects.equals(kVar.f6096b, d0VarT)) {
            return true;
        }
        this.f9463x = new h2.k(lVar.f9369d.f6097c, iV, d0VarT);
        return true;
    }

    public final z b(z zVar, d0 d0Var) {
        long j8 = zVar.f;
        l lVar = this.f9464y;
        Object obj = this.f9461v;
        long jU = lVar.u(j8, obj);
        long j9 = zVar.f9595g;
        long jU2 = lVar.u(j9, obj);
        return (jU == j8 && jU2 == j9) ? zVar : new z(zVar.f9590a, zVar.f9591b, zVar.f9592c, zVar.f9593d, zVar.f9594e, jU, jU2);
    }

    @Override // o2.k0
    public final void d(int i, d0 d0Var, u uVar, z zVar) {
        if (a(i, d0Var)) {
            b3.a aVar = this.f9462w;
            z zVarB = b(zVar, d0Var);
            aVar.getClass();
            aVar.d(new g0(aVar, uVar, zVarB, 1));
        }
    }

    @Override // o2.k0
    public final void f(int i, d0 d0Var, z zVar) {
        if (a(i, d0Var)) {
            b3.a aVar = this.f9462w;
            z zVarB = b(zVar, d0Var);
            d0 d0Var2 = (d0) aVar.f1529x;
            d0Var2.getClass();
            aVar.d(new ed.d(aVar, d0Var2, zVarB, 5));
        }
    }

    @Override // o2.k0
    public final void h(int i, d0 d0Var, z zVar) {
        if (a(i, d0Var)) {
            b3.a aVar = this.f9462w;
            z zVarB = b(zVar, d0Var);
            aVar.getClass();
            aVar.d(new androidx.fragment.app.e(11, aVar, zVarB));
        }
    }

    @Override // h2.l
    public final void i(int i, d0 d0Var, Exception exc) {
        if (a(i, d0Var)) {
            this.f9463x.d(exc);
        }
    }

    @Override // h2.l
    public final void k(int i, d0 d0Var) {
        if (a(i, d0Var)) {
            this.f9463x.e();
        }
    }

    @Override // h2.l
    public final void l(int i, d0 d0Var, int i10) {
        if (a(i, d0Var)) {
            this.f9463x.c(i10);
        }
    }

    @Override // o2.k0
    public final void r(int i, d0 d0Var, u uVar, z zVar, IOException iOException, boolean z2) {
        if (a(i, d0Var)) {
            b3.a aVar = this.f9462w;
            z zVarB = b(zVar, d0Var);
            aVar.getClass();
            aVar.d(new h0(aVar, uVar, zVarB, iOException, z2));
        }
    }

    @Override // h2.l
    public final void v(int i, d0 d0Var) {
        if (a(i, d0Var)) {
            this.f9463x.a();
        }
    }
}
