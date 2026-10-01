package me;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends te.i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8686x;

    public d0(int i) {
        super(false, 0L);
        this.f8686x = i;
    }

    public abstract sd.c d();

    public Throwable h(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar.f8723a;
        }
        return null;
    }

    public final void j(Throwable th) {
        x.i(new be.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().f());
    }

    public abstract Object l();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            sd.c cVarD = d();
            de.i.c(cVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            re.f fVar = (re.f) cVarD;
            ud.c cVar = fVar.f11380z;
            Object obj = fVar.B;
            sd.h hVarF = cVar.f();
            Object objL = re.a.l(hVarF, obj);
            v0 v0Var = null;
            o1 o1VarR = objL != re.a.f11371d ? x.r(cVar, hVarF, objL) : null;
            try {
                sd.h hVarF2 = cVar.f();
                Object objL2 = l();
                Throwable thH = h(objL2);
                if (thH == null) {
                    int i = this.f8686x;
                    boolean z2 = true;
                    if (i != 1 && i != 2) {
                        z2 = false;
                    }
                    if (z2) {
                        v0Var = (v0) hVarF2.A(t.f8732w);
                    }
                }
                if (v0Var != null && !v0Var.a()) {
                    CancellationException cancellationExceptionX = ((d1) v0Var).x();
                    b(cancellationExceptionX);
                    cVar.g(fa.b.i(cancellationExceptionX));
                } else if (thH != null) {
                    cVar.g(fa.b.i(thH));
                } else {
                    cVar.g(i(objL2));
                }
                if (o1VarR != null && !o1VarR.e0()) {
                    return;
                }
                re.a.g(hVarF, objL);
            } catch (Throwable th) {
                if (o1VarR == null || o1VarR.e0()) {
                    re.a.g(hVarF, objL);
                }
                throw th;
            }
        } catch (Throwable th2) {
            j(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object i(Object obj) {
        return obj;
    }
}
