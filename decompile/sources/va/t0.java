package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1 f13520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13521e;

    public t0(String str, String str2, List list, x1 x1Var, int i) {
        this.f13517a = str;
        this.f13518b = str2;
        this.f13519c = list;
        this.f13520d = x1Var;
        this.f13521e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        x1 x1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            x1 x1Var2 = t0Var.f13520d;
            String str2 = t0Var.f13518b;
            if (this.f13517a.equals(t0Var.f13517a) && ((str = this.f13518b) != null ? str.equals(str2) : str2 == null) && this.f13519c.equals(t0Var.f13519c) && ((x1Var = this.f13520d) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && this.f13521e == t0Var.f13521e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13517a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13518b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f13519c.hashCode()) * 1000003;
        x1 x1Var = this.f13520d;
        return ((iHashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.f13521e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f13517a);
        sb2.append(", reason=");
        sb2.append(this.f13518b);
        sb2.append(", frames=");
        sb2.append(this.f13519c);
        sb2.append(", causedBy=");
        sb2.append(this.f13520d);
        sb2.append(", overflowCount=");
        return j4.a.l(this.f13521e, "}", sb2);
    }
}
