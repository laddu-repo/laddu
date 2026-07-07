package o8;

import java.util.Objects;
import k8.k4;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f9963a = new o();

    public h() {
    }

    public final void a(Object obj) {
        this.f9963a.l(obj);
    }

    public final boolean b(Exception exc) {
        o oVar = this.f9963a;
        oVar.getClass();
        y.h(exc, "Exception must not be null");
        synchronized (oVar.f9982a) {
            try {
                if (oVar.f9984c) {
                    return false;
                }
                oVar.f9984c = true;
                oVar.f = exc;
                oVar.f9983b.i(oVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        this.f9963a.m(obj);
    }

    public h(k4 k4Var) {
        ka.c cVar = new ka.c(this);
        k4Var.getClass();
        ka.c cVar2 = new ka.c();
        cVar2.f7872v = cVar;
        Objects.requireNonNull(k4Var);
        ((o) k4Var.f7607v).d(i.f9964a, cVar2);
    }
}
