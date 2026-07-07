package c6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements w6.b {
    public static final o9.f R = new o9.f(7);
    public final r A;
    public final f6.d B;
    public final f6.d C;
    public final f6.d D;
    public s F;
    public boolean G;
    public boolean H;
    public b0 I;
    public int J;
    public boolean K;
    public w L;
    public boolean M;
    public u N;
    public j O;
    public volatile boolean P;
    public boolean Q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f2228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s0.c f2229y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p f2226v = new p(new ArrayList(2));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w6.e f2227w = new w6.e();
    public final AtomicInteger E = new AtomicInteger();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o9.f f2230z = R;

    public q(f6.d dVar, f6.d dVar2, f6.d dVar3, f6.d dVar4, m mVar, m mVar2, hd.a aVar) {
        this.B = dVar;
        this.C = dVar2;
        this.D = dVar4;
        this.A = mVar;
        this.f2228x = mVar2;
        this.f2229y = aVar;
    }

    public final synchronized void a(r6.h hVar, Executor executor) {
        try {
            this.f2227w.a();
            this.f2226v.f2225v.add(new o(hVar, executor));
            if (this.K) {
                e(1);
                executor.execute(new n(this, hVar, 1));
            } else if (this.M) {
                e(1);
                executor.execute(new n(this, hVar, 0));
            } else {
                v6.f.a("Cannot add callbacks to a cancelled EngineJob", !this.P);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.P = true;
        j jVar = this.O;
        jVar.X = true;
        g gVar = jVar.V;
        if (gVar != null) {
            gVar.cancel();
        }
        r rVar = this.A;
        s sVar = this.F;
        m mVar = (m) rVar;
        synchronized (mVar) {
            HashMap map = mVar.f2214a.f2250a;
            if (equals(map.get(sVar))) {
                map.remove(sVar);
            }
        }
    }

    @Override // w6.b
    public final w6.e c() {
        return this.f2227w;
    }

    public final void d() {
        u uVar;
        synchronized (this) {
            try {
                this.f2227w.a();
                v6.f.a("Not yet complete!", f());
                int iDecrementAndGet = this.E.decrementAndGet();
                v6.f.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    uVar = this.N;
                    i();
                } else {
                    uVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (uVar != null) {
            uVar.c();
        }
    }

    public final synchronized void e(int i) {
        u uVar;
        v6.f.a("Not yet complete!", f());
        if (this.E.getAndAdd(i) == 0 && (uVar = this.N) != null) {
            uVar.a();
        }
    }

    public final boolean f() {
        return this.M || this.K || this.P;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f2227w.a();
                if (this.P) {
                    i();
                    return;
                }
                if (this.f2226v.f2225v.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.M) {
                    throw new IllegalStateException("Already failed once");
                }
                this.M = true;
                s sVar = this.F;
                p pVar = this.f2226v;
                pVar.getClass();
                ArrayList arrayList = new ArrayList(pVar.f2225v);
                e(arrayList.size() + 1);
                ((m) this.A).e(this, sVar, null);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    o oVar = (o) obj;
                    oVar.f2224b.execute(new n(this, oVar.f2223a, 0));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.f2227w.a();
                if (this.P) {
                    this.I.e();
                    i();
                    return;
                }
                if (this.f2226v.f2225v.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.K) {
                    throw new IllegalStateException("Already have resource");
                }
                o9.f fVar = this.f2230z;
                b0 b0Var = this.I;
                boolean z2 = this.G;
                s sVar = this.F;
                t tVar = this.f2228x;
                fVar.getClass();
                this.N = new u(b0Var, z2, true, sVar, tVar);
                this.K = true;
                p pVar = this.f2226v;
                pVar.getClass();
                ArrayList arrayList = new ArrayList(pVar.f2225v);
                e(arrayList.size() + 1);
                ((m) this.A).e(this, this.F, this.N);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    o oVar = (o) obj;
                    oVar.f2224b.execute(new n(this, oVar.f2223a, 1));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.F == null) {
            throw new IllegalArgumentException();
        }
        this.f2226v.f2225v.clear();
        this.F = null;
        this.N = null;
        this.I = null;
        this.M = false;
        this.P = false;
        this.K = false;
        this.Q = false;
        this.O.m();
        this.O = null;
        this.L = null;
        this.J = 0;
        this.f2229y.e(this);
    }

    public final synchronized void j(r6.h hVar) {
        try {
            this.f2227w.a();
            this.f2226v.f2225v.remove(new o(hVar, v6.f.f13222b));
            if (this.f2226v.f2225v.isEmpty()) {
                b();
                if (this.K || this.M) {
                    if (this.E.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(j jVar) {
        this.O = jVar;
        int iH = jVar.h(1);
        ((iH == 2 || iH == 3) ? this.B : this.H ? this.D : this.C).execute(jVar);
    }
}
