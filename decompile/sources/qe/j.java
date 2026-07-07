package qe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements sd.c, ud.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final sd.c f11022v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sd.h f11023w;

    public j(sd.c cVar, sd.h hVar) {
        this.f11022v = cVar;
        this.f11023w = hVar;
    }

    @Override // ud.d
    public final ud.d c() {
        sd.c cVar = this.f11022v;
        if (cVar instanceof ud.d) {
            return (ud.d) cVar;
        }
        return null;
    }

    @Override // sd.c
    public final sd.h f() {
        return this.f11023w;
    }

    @Override // sd.c
    public final void g(Object obj) {
        this.f11022v.g(obj);
    }
}
