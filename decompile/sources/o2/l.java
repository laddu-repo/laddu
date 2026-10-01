package o2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f9475h = new HashMap();
    public Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y1.z f9476j;

    @Override // o2.a
    public final void d() {
        for (k kVar : this.f9475h.values()) {
            kVar.f9471a.c(kVar.f9472b);
        }
    }

    @Override // o2.a
    public final void f() {
        for (k kVar : this.f9475h.values()) {
            kVar.f9471a.e(kVar.f9472b);
        }
    }

    @Override // o2.a
    public void j() {
        Iterator it = this.f9475h.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).f9471a.j();
        }
    }

    @Override // o2.a
    public void p() {
        HashMap map = this.f9475h;
        for (k kVar : map.values()) {
            a aVar = kVar.f9471a;
            j jVar = kVar.f9473c;
            aVar.o(kVar.f9472b);
            aVar.r(jVar);
            aVar.q(jVar);
        }
        map.clear();
    }

    public abstract d0 t(Object obj, d0 d0Var);

    public abstract void w(Object obj, a aVar, t1.s0 s0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o2.e0, o2.i] */
    public final void x(final Object obj, a aVar) {
        HashMap map = this.f9475h;
        w1.a.d(!map.containsKey(obj));
        ?? r12 = new e0() { // from class: o2.i
            @Override // o2.e0
            public final void a(a aVar2, t1.s0 s0Var) {
                this.f9453a.w(obj, aVar2, s0Var);
            }
        };
        j jVar = new j(this, obj);
        map.put(obj, new k(aVar, r12, jVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        b3.a aVar2 = aVar.f9368c;
        aVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar2.f1530y;
        j0 j0Var = new j0();
        j0Var.f9465a = handler;
        j0Var.f9466b = jVar;
        copyOnWriteArrayList.add(j0Var);
        Handler handler2 = this.i;
        handler2.getClass();
        h2.k kVar = aVar.f9369d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = kVar.f6097c;
        h2.j jVar2 = new h2.j();
        jVar2.f6093a = handler2;
        jVar2.f6094b = jVar;
        copyOnWriteArrayList2.add(jVar2);
        y1.z zVar = this.f9476j;
        d2.l lVar = this.f9371g;
        w1.a.k(lVar);
        aVar.k(r12, zVar, lVar);
        if (this.f9367b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public long u(long j8, Object obj) {
        return j8;
    }

    public int v(int i, Object obj) {
        return i;
    }
}
