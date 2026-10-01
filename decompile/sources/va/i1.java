package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13381d;

    public i1(int i, String str, String str2, boolean z2) {
        this.f13378a = i;
        this.f13379b = str;
        this.f13380c = str2;
        this.f13381d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            i1 i1Var = (i1) ((k2) obj);
            if (this.f13378a == i1Var.f13378a && this.f13379b.equals(i1Var.f13379b) && this.f13380c.equals(i1Var.f13380c) && this.f13381d == i1Var.f13381d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13378a ^ 1000003) * 1000003) ^ this.f13379b.hashCode()) * 1000003) ^ this.f13380c.hashCode()) * 1000003) ^ (this.f13381d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f13378a + ", version=" + this.f13379b + ", buildVersion=" + this.f13380c + ", jailbroken=" + this.f13381d + "}";
    }
}
