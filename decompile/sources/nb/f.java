package nb;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f9085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.h f9086b;

    public f(j jVar, o8.h hVar) {
        this.f9085a = jVar;
        this.f9086b = hVar;
    }

    @Override // nb.i
    public final boolean a(ob.b bVar) {
        if (bVar.f10096b != 4 || this.f9085a.a(bVar)) {
            return false;
        }
        String str = bVar.f10097c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        long j8 = bVar.f10099e;
        long j9 = bVar.f;
        byte b9 = (byte) (((byte) 1) | 2);
        if (b9 == 3) {
            this.f9086b.a(new a(j8, j9, str));
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b9 & 1) == 0) {
            sb2.append(" tokenExpirationTimestamp");
        }
        if ((b9 & 2) == 0) {
            sb2.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }

    @Override // nb.i
    public final boolean b(Exception exc) {
        this.f9086b.b(exc);
        return true;
    }
}
