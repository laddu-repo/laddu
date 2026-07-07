package com.google.android.gms.internal.measurement;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya f2692a;

    public hc(ya yaVar) {
        this.f2692a = yaVar;
    }

    public static da.a b(o8.o oVar) {
        eb ebVar = new eb();
        ebVar.C = oVar;
        p6 p6Var = new p6(10, ebVar);
        da.f0 f0Var = da.f0.f4407v;
        oVar.b(f0Var, p6Var);
        return da.o0.a(ebVar, r7.d.class, gc.f2662b, f0Var);
    }

    public final da.a a(f6 f6Var) throws Throwable {
        String string;
        ya yaVar = this.f2692a;
        String simpleName = ab.class.getSimpleName();
        Looper looper = yaVar.f11351g;
        t7.y.h(looper, "Looper must not be null");
        q7.h hVar = new q7.h();
        hVar.f10916v = new a7.s(looper);
        t7.y.d(simpleName);
        hVar.f10917w = new s7.f(f6Var, simpleName);
        String strB = x7.b.b();
        if (strB == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strB.length() + 1;
            int iIdentityHashCode = System.identityHashCode(ab.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb2.append(strB);
            sb2.append("|");
            sb2.append(iIdentityHashCode);
            string = sb2.toString();
        }
        a7.j jVar = new a7.j(yaVar, string, hVar);
        f1 f1Var = f1.f2630z;
        le leVar = new le();
        leVar.f2865d = hVar;
        leVar.f2863b = jVar;
        leVar.f2864c = f1Var;
        leVar.f2866e = new q7.d[]{h.f2670b};
        leVar.f2862a = false;
        s7.f fVar = (s7.f) ((q7.h) leVar.f2865d).f10917w;
        t7.y.h(fVar, "Key must not be null");
        q7.h hVar2 = (q7.h) leVar.f2865d;
        c2.b bVar = new c2.b(leVar, hVar2, (q7.d[]) leVar.f2866e, leVar.f2862a);
        k8.g2 g2Var = new k8.g2(leVar, fVar);
        t7.y.h((s7.f) hVar2.f10917w, "Listener has already been released.");
        s7.d dVar = yaVar.f11353j;
        dVar.getClass();
        o8.h hVar3 = new o8.h();
        s7.p pVar = new s7.p(new s7.s(new s7.q(bVar, g2Var), hVar3), dVar.D.get(), yaVar);
        t6 t6Var = dVar.H;
        t6Var.sendMessage(t6Var.obtainMessage(8, pVar));
        return b(hVar3.f9963a);
    }
}
