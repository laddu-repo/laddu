package a6;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6.c f161b = new v6.c(0);

    @Override // a6.f
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            v6.c cVar = this.f161b;
            if (i >= cVar.f13021x) {
                return;
            }
            h hVar = (h) cVar.f(i);
            Object objJ = this.f161b.j(i);
            g gVar = hVar.f158b;
            if (hVar.f160d == null) {
                hVar.f160d = hVar.f159c.getBytes(f.f155a);
            }
            gVar.g(hVar.f160d, objJ, messageDigest);
            i++;
        }
    }

    public final Object c(h hVar) {
        v6.c cVar = this.f161b;
        return cVar.containsKey(hVar) ? cVar.get(hVar) : hVar.f157a;
    }

    @Override // a6.f
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f161b.equals(((i) obj).f161b);
        }
        return false;
    }

    @Override // a6.f
    public final int hashCode() {
        return this.f161b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f161b + '}';
    }
}
