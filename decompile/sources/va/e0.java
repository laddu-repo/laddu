package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13329c;

    public e0(String str, String str2, String str3) {
        this.f13327a = str;
        this.f13328b = str2;
        this.f13329c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            e0 e0Var = (e0) ((o1) obj);
            if (this.f13327a.equals(e0Var.f13327a) && this.f13328b.equals(e0Var.f13328b) && this.f13329c.equals(e0Var.f13329c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13327a.hashCode() ^ 1000003) * 1000003) ^ this.f13328b.hashCode()) * 1000003) ^ this.f13329c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f13327a);
        sb2.append(", libraryName=");
        sb2.append(this.f13328b);
        sb2.append(", buildId=");
        return j4.a.n(sb2, this.f13329c, "}");
    }
}
