package z6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f14801a;

    public r(q qVar) {
        this.f14801a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f14801a.equals(((r) ((d0) obj)).f14801a);
    }

    public final int hashCode() {
        return this.f14801a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f14801a + "}";
    }
}
