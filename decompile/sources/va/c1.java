package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13300a;

    public c1(String str) {
        this.f13300a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.f13300a.equals(((c1) ((f2) obj)).f13300a);
    }

    public final int hashCode() {
        return this.f13300a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return j4.a.n(new StringBuilder("Log{content="), this.f13300a, "}");
    }
}
