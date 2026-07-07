package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13349b;

    public g0(String str, List list) {
        this.f13348a = list;
        this.f13349b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            g0 g0Var = (g0) ((s1) obj);
            String str2 = g0Var.f13349b;
            if (this.f13348a.equals(g0Var.f13348a) && ((str = this.f13349b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13348a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13349b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f13348a);
        sb2.append(", orgId=");
        return j4.a.n(sb2, this.f13349b, "}");
    }
}
