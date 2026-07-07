package nb;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.h f9087a;

    public g(o8.h hVar) {
        this.f9087a = hVar;
    }

    @Override // nb.i
    public final boolean a(ob.b bVar) {
        int i = bVar.f10096b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f9087a.c(bVar.f10095a);
        return true;
    }

    @Override // nb.i
    public final boolean b(Exception exc) {
        return false;
    }
}
