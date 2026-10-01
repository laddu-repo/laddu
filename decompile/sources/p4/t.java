package p4;

import me.v0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t extends de.h implements ce.a {
    @Override // ce.a
    public final Object b() {
        u uVar = (u) this.f4506w;
        re.c cVar = uVar.f10355a;
        if (cVar == null) {
            de.i.i("coroutineScope");
            throw null;
        }
        v0 v0Var = (v0) cVar.f11376v.A(me.t.f8732w);
        if (v0Var == null) {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + cVar).toString());
        }
        v0Var.i(null);
        uVar.i();
        b0.e eVar = uVar.f10358d;
        if (eVar == null) {
            de.i.i("connectionManager");
            throw null;
        }
        ((r4.b) eVar.f).close();
        w4.c cVar2 = (w4.c) eVar.f1453g;
        if (cVar2 != null) {
            cVar2.close();
        }
        return od.l.f10126a;
    }
}
