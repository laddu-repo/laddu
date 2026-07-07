package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13350a;

    public g1(List list) {
        this.f13350a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.f13350a.equals(((g1) ((i2) obj)).f13350a);
    }

    public final int hashCode() {
        return this.f13350a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f13350a + "}";
    }
}
