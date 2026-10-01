package q2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l extends a {
    public final HashMap E = new HashMap();
    public Handler F;
    public w1.a0 G;

    public abstract void A(Object obj, a aVar, r1.d1 d1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [q2.d0, q2.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, q2.h0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [f2.k, java.lang.Object] */
    public final void B(final Object obj, a aVar) {
        HashMap hashMap = this.E;
        u1.c.b(!hashMap.containsKey(obj));
        ?? r12 = new d0() { // from class: q2.i
            @Override // q2.d0
            public final void a(a aVar2, r1.d1 d1Var) {
                l.this.A(obj, aVar2, d1Var);
            }
        };
        j jVar = new j(this, obj);
        hashMap.put(obj, new k(aVar, r12, jVar));
        Handler handler = this.F;
        handler.getClass();
        aVar.getClass();
        b2.k kVar = aVar.f10830z;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) kVar.A;
        ?? obj2 = new Object();
        obj2.f10887a = handler;
        obj2.f10888b = jVar;
        copyOnWriteArrayList.add(obj2);
        Handler handler2 = this.F;
        handler2.getClass();
        f2.l lVar = aVar.A;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = lVar.f4677c;
        ?? obj3 = new Object();
        obj3.f4673a = handler2;
        obj3.f4674b = jVar;
        copyOnWriteArrayList2.add(obj3);
        w1.a0 a0Var = this.G;
        b2.m mVar = this.D;
        u1.c.h(mVar);
        aVar.m(r12, a0Var, mVar);
        if (this.f10829y.isEmpty()) {
            aVar.d(r12);
        }
    }

    @Override // q2.a
    public final void e() {
        for (k kVar : this.E.values()) {
            kVar.f10901a.d(kVar.f10902b);
        }
    }

    @Override // q2.a
    public final void g() {
        for (k kVar : this.E.values()) {
            kVar.f10901a.f(kVar.f10902b);
        }
    }

    @Override // q2.a
    public void l() {
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).f10901a.l();
        }
    }

    @Override // q2.a
    public void s() {
        HashMap hashMap = this.E;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f10901a;
            j jVar = kVar.f10903c;
            aVar.r(kVar.f10902b);
            aVar.u(jVar);
            aVar.t(jVar);
        }
        hashMap.clear();
    }

    public abstract c0 w(Object obj, c0 c0Var);

    public long x(long j, Object obj) {
        return j;
    }

    public int y(int i6, Object obj) {
        return i6;
    }
}
