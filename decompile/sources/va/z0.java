package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13565d;

    public z0(String str, int i, int i10, boolean z2) {
        this.f13562a = str;
        this.f13563b = i;
        this.f13564c = i10;
        this.f13565d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            z0 z0Var = (z0) ((c2) obj);
            if (this.f13562a.equals(z0Var.f13562a) && this.f13563b == z0Var.f13563b && this.f13564c == z0Var.f13564c && this.f13565d == z0Var.f13565d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13562a.hashCode() ^ 1000003) * 1000003) ^ this.f13563b) * 1000003) ^ this.f13564c) * 1000003) ^ (this.f13565d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f13562a + ", pid=" + this.f13563b + ", importance=" + this.f13564c + ", defaultProcess=" + this.f13565d + "}";
    }
}
