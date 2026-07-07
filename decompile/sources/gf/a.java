package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a extends t1 implements le.c, c0 {

    /* renamed from: z, reason: collision with root package name */
    public final le.h f5647z;

    public a(le.h hVar, boolean z10) {
        super(z10);
        H((j1) hVar.get(i1.f5682x));
        this.f5647z = hVar.plus(this);
    }

    @Override // gf.t1
    public final void G(a2.x0 x0Var) {
        f0.s(this.f5647z, x0Var);
    }

    @Override // gf.t1
    public final void P(Object obj) {
        boolean z10;
        if (obj instanceof t) {
            t tVar = (t) obj;
            Throwable th = tVar.f5710a;
            if (t.f5709b.get(tVar) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            W(th, z10);
            return;
        }
        X(obj);
    }

    public final void Y(d0 d0Var, a aVar, ve.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            le.h hVar = this.f5647z;
                            Object m9 = mf.a.m(hVar, null);
                            try {
                                if (!(pVar instanceof ne.a)) {
                                    invoke = a8.c.u(pVar, aVar, this);
                                } else {
                                    kotlin.jvm.internal.z.c(2, pVar);
                                    invoke = pVar.invoke(aVar, this);
                                }
                                mf.a.g(hVar, m9);
                                if (invoke != me.a.f8833x) {
                                    resumeWith(invoke);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                mf.a.g(hVar, m9);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            resumeWith(he.a.b(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                a8.c.i(a8.c.e(aVar, this, pVar)).resumeWith(he.y.f6101a);
                return;
            }
            return;
        }
        android.support.v4.media.session.b.t(pVar, aVar, this);
    }

    @Override // le.c
    public final le.h getContext() {
        return this.f5647z;
    }

    @Override // gf.c0
    public final le.h getCoroutineContext() {
        return this.f5647z;
    }

    @Override // le.c
    public final void resumeWith(Object obj) {
        Throwable a10 = he.k.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        Object L = L(obj);
        if (L == f0.f5669e) {
            return;
        }
        o(L);
    }

    @Override // gf.t1
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void X(Object obj) {
    }

    public void W(Throwable th, boolean z10) {
    }
}
