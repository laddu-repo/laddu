package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f13497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f13498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f13499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13500e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.f13496a = list;
        this.f13497b = t0Var;
        this.f13498c = p1Var;
        this.f13499d = u0Var;
        this.f13500e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        List list = this.f13496a;
        if (list == null) {
            if (((r0) b2Var).f13496a != null) {
                return false;
            }
        } else if (!list.equals(((r0) b2Var).f13496a)) {
            return false;
        }
        x1 x1Var = this.f13497b;
        if (x1Var == null) {
            if (((r0) b2Var).f13497b != null) {
                return false;
            }
        } else if (!x1Var.equals(((r0) b2Var).f13497b)) {
            return false;
        }
        p1 p1Var = this.f13498c;
        if (p1Var == null) {
            if (((r0) b2Var).f13498c != null) {
                return false;
            }
        } else if (!p1Var.equals(((r0) b2Var).f13498c)) {
            return false;
        }
        r0 r0Var = (r0) b2Var;
        return this.f13499d.equals(r0Var.f13499d) && this.f13500e.equals(r0Var.f13500e);
    }

    public final int hashCode() {
        List list = this.f13496a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.f13497b;
        int iHashCode2 = (iHashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.f13498c;
        return (((((p1Var != null ? p1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f13499d.hashCode()) * 1000003) ^ this.f13500e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f13496a + ", exception=" + this.f13497b + ", appExitInfo=" + this.f13498c + ", signal=" + this.f13499d + ", binaries=" + this.f13500e + "}";
    }
}
