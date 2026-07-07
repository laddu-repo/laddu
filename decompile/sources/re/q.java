package re;

import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class q extends me.a implements ud.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sd.c f11398y;

    public q(sd.c cVar, sd.h hVar) {
        super(hVar, true);
        this.f11398y = cVar;
    }

    @Override // me.d1
    public final boolean M() {
        return true;
    }

    @Override // ud.d
    public final ud.d c() {
        sd.c cVar = this.f11398y;
        if (cVar instanceof ud.d) {
            return (ud.d) cVar;
        }
        return null;
    }

    @Override // me.d1
    public void j(Object obj) {
        a.h(me.x.m(obj), t1.h(this.f11398y));
    }

    @Override // me.d1
    public void o(Object obj) {
        this.f11398y.g(me.x.m(obj));
    }
}
