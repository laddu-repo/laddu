package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13428e;
    public final p2.c f;

    public l1(String str, String str2, String str3, String str4, int i, p2.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f13424a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f13425b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f13426c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f13427d = str4;
        this.f13428e = i;
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f13424a.equals(l1Var.f13424a) && this.f13425b.equals(l1Var.f13425b) && this.f13426c.equals(l1Var.f13426c) && this.f13427d.equals(l1Var.f13427d) && this.f13428e == l1Var.f13428e && this.f.equals(l1Var.f);
    }

    public final int hashCode() {
        return ((((((((((this.f13424a.hashCode() ^ 1000003) * 1000003) ^ this.f13425b.hashCode()) * 1000003) ^ this.f13426c.hashCode()) * 1000003) ^ this.f13427d.hashCode()) * 1000003) ^ this.f13428e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f13424a + ", versionCode=" + this.f13425b + ", versionName=" + this.f13426c + ", installUuid=" + this.f13427d + ", deliveryMechanism=" + this.f13428e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
