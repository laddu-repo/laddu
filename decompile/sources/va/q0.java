package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f13485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f13488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f13489e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13490g;

    public q0(r0 r0Var, List list, List list2, Boolean bool, c2 c2Var, List list3, int i) {
        this.f13485a = r0Var;
        this.f13486b = list;
        this.f13487c = list2;
        this.f13488d = bool;
        this.f13489e = c2Var;
        this.f = list3;
        this.f13490g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        q0 q0Var = (q0) ((d2) obj);
        List list = q0Var.f;
        c2 c2Var = q0Var.f13489e;
        Boolean bool = q0Var.f13488d;
        List list2 = q0Var.f13487c;
        List list3 = q0Var.f13486b;
        if (!this.f13485a.equals(q0Var.f13485a)) {
            return false;
        }
        List list4 = this.f13486b;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.f13487c;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.f13488d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        c2 c2Var2 = this.f13489e;
        if (c2Var2 == null) {
            if (c2Var != null) {
                return false;
            }
        } else if (!c2Var2.equals(c2Var)) {
            return false;
        }
        List list6 = this.f;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.f13490g == q0Var.f13490g;
    }

    public final int hashCode() {
        int iHashCode = (this.f13485a.hashCode() ^ 1000003) * 1000003;
        List list = this.f13486b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f13487c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f13488d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        c2 c2Var = this.f13489e;
        int iHashCode5 = (iHashCode4 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        List list3 = this.f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f13490g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f13485a);
        sb2.append(", customAttributes=");
        sb2.append(this.f13486b);
        sb2.append(", internalKeys=");
        sb2.append(this.f13487c);
        sb2.append(", background=");
        sb2.append(this.f13488d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f13489e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f);
        sb2.append(", uiOrientation=");
        return j4.a.l(this.f13490g, "}", sb2);
    }
}
