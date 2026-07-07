package ke;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he.c f7970b;

    public d(String str, he.c cVar) {
        this.f7969a = str;
        this.f7970b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return de.i.a(this.f7969a, dVar.f7969a) && de.i.a(this.f7970b, dVar.f7970b);
    }

    public final int hashCode() {
        return this.f7970b.hashCode() + (this.f7969a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f7969a + ", range=" + this.f7970b + ')';
    }
}
