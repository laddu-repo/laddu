package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f406d;

    public i0(String str, int i, int i10, boolean z2) {
        this.f403a = str;
        this.f404b = i;
        this.f405c = i10;
        this.f406d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return de.i.a(this.f403a, i0Var.f403a) && this.f404b == i0Var.f404b && this.f405c == i0Var.f405c && this.f406d == i0Var.f406d;
    }

    public final int hashCode() {
        return (((((this.f403a.hashCode() * 31) + this.f404b) * 31) + this.f405c) * 31) + (this.f406d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f403a + ", pid=" + this.f404b + ", importance=" + this.f405c + ", isDefaultProcess=" + this.f406d + ')';
    }
}
