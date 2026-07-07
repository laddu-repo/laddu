package qe;

import od.l;
import oe.q;
import oe.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements pe.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f11021v;

    public i(q qVar) {
        this.f11021v = qVar;
    }

    @Override // pe.d
    public final Object j(Object obj, sd.c cVar) {
        Object objD = this.f11021v.d(obj, cVar);
        return objD == td.a.f12544v ? objD : l.f10126a;
    }
}
