package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.u f3055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a7.h f3056c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb f3058e;
    public final mb f = new mb(new f6(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3059g = new Object();
    public List i = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sc.b f3057d = new sc.b(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mg f3060h = new mg();

    public rf(a7.h hVar, da.u uVar) {
        this.f3056c = hVar;
        this.f3055b = uVar;
        this.f3054a = (String) hVar.f184a;
        this.f3058e = new mb(new uf(hVar, 1));
        a(new od(4, this));
    }

    public final void a(da.b0 b0Var) {
        synchronized (this.f3059g) {
            this.i.add(b0Var);
        }
    }

    public final da.v b(rd rdVar, da.v0 v0Var) throws Throwable {
        da.k kVarW;
        sc.b bVar;
        da.f0 f0Var;
        be beVarB = zg.b(new od(3, rdVar));
        va.t1 t1Var = bh.f2520a;
        p4.v.n(t1Var, "ticker");
        t1Var.k();
        rg rgVarH = this.f3060h.h("Update ".concat(String.valueOf(this.f3054a)));
        try {
            kVarW = this.f.w();
            bVar = this.f3057d;
            p6 p6Var = new p6(16, kVarW);
            f0Var = da.f0.f4407v;
            bVar.f0(p6Var, f0Var);
        } catch (Throwable th) {
            th = th;
        }
        try {
            ListenableFuture listenableFutureF0 = bVar.f0(zg.a(new z7(this, kVarW, beVarB, v0Var, 3)), f0Var);
            da.o0.propagateCancellation(listenableFutureF0, kVarW);
            da.o0.e(this.f3055b);
            x9.g gVar = new x9.g();
            int i = da.w.F;
            da.v vVar = new da.v(listenableFutureF0, gVar);
            listenableFutureF0.f(vVar, va.t1.l(f0Var, vVar));
            rgVarH.a(vVar);
            rgVarH.close();
            return vVar;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                rgVarH.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
