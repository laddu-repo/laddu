package me;

import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends d1 implements m {
    public final Object a0(ud.h hVar) throws Throwable {
        Object obj;
        do {
            obj = d1.f8687v.get(this);
            if (!(obj instanceof s0)) {
                if (obj instanceof p) {
                    throw ((p) obj).f8723a;
                }
                return x.q(obj);
            }
        } while (W(obj) < 0);
        a1 a1Var = new a1(t1.h(hVar), this);
        a1Var.v();
        a1Var.x(new e(2, x.j(this, true, new j(3, a1Var))));
        return a1Var.u();
    }
}
