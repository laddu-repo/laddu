package c2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f1932c = new r1(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1934b;

    public r1(int i, boolean z2) {
        this.f1933a = i;
        this.f1934b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r1.class != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.f1933a == r1Var.f1933a && this.f1934b == r1Var.f1934b;
    }

    public final int hashCode() {
        return (this.f1933a << 1) + (this.f1934b ? 1 : 0);
    }
}
