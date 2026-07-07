package c6;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r, t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f2213h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f2214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f2215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6.e f2216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ya.c f2217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f2218e;
    public final b3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a7.j f2219g;

    public m(e6.e eVar, a9.g gVar, f6.d dVar, f6.d dVar2, f6.d dVar3, f6.d dVar4) throws Throwable {
        this.f2216c = eVar;
        q7.h hVar = new q7.h(gVar);
        a7.j jVar = new a7.j(8);
        this.f2219g = jVar;
        synchronized (this) {
            try {
                try {
                    synchronized (jVar) {
                        try {
                            jVar.f204y = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.f2215b = new oa.b(7);
                    this.f2214a = new y(0);
                    this.f2217d = new ya.c(dVar, dVar2, dVar3, dVar4, this, this);
                    this.f = new b3.a(hVar);
                    this.f2218e = new f0(0);
                    eVar.f4852d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void d(String str, long j8, s sVar) {
        Log.v("Engine", str + " in " + v6.h.a(j8) + "ms, key: " + sVar);
    }

    public static void g(b0 b0Var) {
        if (!(b0Var instanceof u)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((u) b0Var).c();
    }

    public final a7.j a(com.bumptech.glide.g gVar, Object obj, a6.f fVar, int i, int i10, Class cls, Class cls2, com.bumptech.glide.h hVar, l lVar, v6.c cVar, boolean z2, boolean z10, a6.i iVar, boolean z11, boolean z12, r6.h hVar2, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f2213h) {
            int i11 = v6.h.f13224b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f2215b.getClass();
        s sVar = new s(obj, fVar, i, i10, cVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                u uVarC = c(sVar, z11, jElapsedRealtimeNanos);
                if (uVarC == null) {
                    return h(gVar, obj, fVar, i, i10, cls, cls2, hVar, lVar, cVar, z2, z10, iVar, z11, z12, hVar2, executor, sVar, jElapsedRealtimeNanos);
                }
                hVar2.k(uVarC, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final u b(s sVar) throws Throwable {
        u uVar;
        Object obj;
        m mVar;
        s sVar2;
        e6.e eVar = this.f2216c;
        synchronized (eVar) {
            try {
                v6.i iVar = (v6.i) ((LinkedHashMap) eVar.f4549c).remove(sVar);
                uVar = null;
                if (iVar == null) {
                    obj = null;
                } else {
                    eVar.f4548b -= (long) iVar.f13226b;
                    obj = iVar.f13225a;
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        b0 b0Var = (b0) obj;
        if (b0Var == null) {
            mVar = this;
            sVar2 = sVar;
        } else if (b0Var instanceof u) {
            uVar = (u) b0Var;
            mVar = this;
            sVar2 = sVar;
        } else {
            mVar = this;
            sVar2 = sVar;
            uVar = new u(b0Var, true, true, sVar2, mVar);
        }
        if (uVar != null) {
            uVar.a();
            mVar.f2219g.i(sVar2, uVar);
        }
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u c(s sVar, boolean z2, long j8) throws Throwable {
        u uVar;
        if (z2) {
            a7.j jVar = this.f2219g;
            synchronized (jVar) {
                b bVar = (b) ((HashMap) jVar.f202w).get(sVar);
                if (bVar == null) {
                    uVar = null;
                } else {
                    uVar = (u) bVar.get();
                    if (uVar == null) {
                        jVar.m(bVar);
                    }
                }
            }
            if (uVar != null) {
                uVar.a();
            }
            if (uVar != null) {
                if (f2213h) {
                    d("Loaded resource from active resources", j8, sVar);
                }
                return uVar;
            }
            u uVarB = b(sVar);
            if (uVarB != null) {
                if (f2213h) {
                    d("Loaded resource from cache", j8, sVar);
                }
                return uVarB;
            }
        }
        return null;
    }

    public final synchronized void e(q qVar, s sVar, u uVar) {
        if (uVar != null) {
            try {
                if (uVar.f2238v) {
                    this.f2219g.i(sVar, uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map = this.f2214a.f2250a;
        if (qVar.equals(map.get(sVar))) {
            map.remove(sVar);
        }
    }

    public final void f(a6.f fVar, u uVar) {
        a7.j jVar = this.f2219g;
        synchronized (jVar) {
            b bVar = (b) ((HashMap) jVar.f202w).remove(fVar);
            if (bVar != null) {
                bVar.f2149c = null;
                bVar.clear();
            }
        }
        if (uVar.f2238v) {
        } else {
            this.f2218e.l(uVar, false);
        }
    }

    public final a7.j h(com.bumptech.glide.g gVar, Object obj, a6.f fVar, int i, int i10, Class cls, Class cls2, com.bumptech.glide.h hVar, l lVar, Map map, boolean z2, boolean z10, a6.i iVar, boolean z11, boolean z12, r6.h hVar2, Executor executor, s sVar, long j8) {
        q qVar = (q) this.f2214a.f2250a.get(sVar);
        if (qVar != null) {
            qVar.a(hVar2, executor);
            if (f2213h) {
                d("Added to existing load", j8, sVar);
            }
            return new a7.j(this, hVar2, qVar);
        }
        q qVar2 = (q) ((hd.a) this.f2217d.B).k();
        synchronized (qVar2) {
            qVar2.F = sVar;
            qVar2.G = z11;
            qVar2.H = z12;
        }
        b3.a aVar = this.f;
        j jVar = (j) ((hd.a) aVar.f1530y).k();
        int i11 = aVar.f1528w;
        aVar.f1528w = i11 + 1;
        h hVar3 = jVar.f2199v;
        q7.h hVar4 = jVar.f2202y;
        hVar3.f2179c = gVar;
        hVar3.f2180d = obj;
        hVar3.f2188n = fVar;
        hVar3.f2181e = i;
        hVar3.f = i10;
        hVar3.f2190p = lVar;
        hVar3.f2182g = cls;
        hVar3.f2183h = hVar4;
        hVar3.f2185k = cls2;
        hVar3.f2189o = hVar;
        hVar3.i = iVar;
        hVar3.f2184j = map;
        hVar3.f2191q = z2;
        hVar3.f2192r = z10;
        jVar.C = gVar;
        jVar.D = fVar;
        jVar.E = hVar;
        jVar.F = sVar;
        jVar.G = i;
        jVar.H = i10;
        jVar.I = lVar;
        jVar.J = iVar;
        jVar.K = qVar2;
        jVar.L = i11;
        jVar.f2197a0 = 1;
        jVar.N = obj;
        jVar.O = gVar.f2359h;
        jVar.P = a2.c.m(iVar.c(j.f2196c0));
        y yVar = this.f2214a;
        yVar.getClass();
        yVar.f2250a.put(sVar, qVar2);
        qVar2.a(hVar2, executor);
        qVar2.k(jVar);
        if (f2213h) {
            d("Started new load", j8, sVar);
        }
        return new a7.j(this, hVar2, qVar2);
    }
}
