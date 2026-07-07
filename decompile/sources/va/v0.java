package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13534c;

    public v0(String str, int i, List list) {
        this.f13532a = str;
        this.f13533b = i;
        this.f13534c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.f13532a.equals(v0Var.f13532a) && this.f13533b == v0Var.f13533b && this.f13534c.equals(v0Var.f13534c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13532a.hashCode() ^ 1000003) * 1000003) ^ this.f13533b) * 1000003) ^ this.f13534c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f13532a + ", importance=" + this.f13533b + ", frames=" + this.f13534c + "}";
    }
}
