package ed;

import android.os.Handler;
import e2.w;
import k8.k2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd.k f4891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad.g f4892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9.g f4893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd.a f4894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f4895e;
    public final k2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ab.f f4896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f4897h;

    public h(jd.k kVar, ad.g gVar, a9.g gVar2, hd.a aVar, Handler handler, k2 k2Var, ab.f fVar, w wVar) {
        de.i.e(handler, "uiHandler");
        de.i.e(wVar, "networkInfoProvider");
        this.f4891a = kVar;
        this.f4892b = gVar;
        this.f4893c = gVar2;
        this.f4894d = aVar;
        this.f4895e = handler;
        this.f = k2Var;
        this.f4896g = fVar;
        this.f4897h = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return de.i.a(this.f4891a, hVar.f4891a) && de.i.a(this.f4892b, hVar.f4892b) && de.i.a(this.f4893c, hVar.f4893c) && de.i.a(this.f4894d, hVar.f4894d) && de.i.a(this.f4895e, hVar.f4895e) && de.i.a(this.f, hVar.f) && de.i.a(this.f4896g, hVar.f4896g) && de.i.a(this.f4897h, hVar.f4897h);
    }

    public final int hashCode() {
        return this.f4897h.hashCode() + ((this.f4896g.hashCode() + ((this.f.hashCode() + ((this.f4895e.hashCode() + ((this.f4894d.hashCode() + ((this.f4893c.hashCode() + ((this.f4892b.hashCode() + 73373293) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Holder(handlerWrapper=" + this.f4891a + ", fetchDatabaseManagerWrapper=" + this.f4892b + ", downloadProvider=" + this.f4893c + ", groupInfoProvider=" + this.f4894d + ", uiHandler=" + this.f4895e + ", downloadManagerCoordinator=" + this.f + ", listenerCoordinator=" + this.f4896g + ", networkInfoProvider=" + this.f4897h + ")";
    }
}
