package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9531b;

    public t0(int i, boolean z2) {
        this.f9530a = i;
        this.f9531b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f9530a == t0Var.f9530a && this.f9531b == t0Var.f9531b;
    }

    public final int hashCode() {
        return (this.f9530a * 31) + (this.f9531b ? 1 : 0);
    }
}
