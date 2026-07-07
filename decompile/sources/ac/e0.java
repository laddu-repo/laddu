package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f350b;

    public /* synthetic */ e0(int i, int i10, String str) {
        if (3 != (i & 3)) {
            af.k.a(i, 3, c0.f334a.d());
            throw null;
        }
        this.f349a = i10;
        this.f350b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f349a == e0Var.f349a && de.i.a(this.f350b, e0Var.f350b);
    }

    public final int hashCode() {
        return this.f350b.hashCode() + (this.f349a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f349a + ", uuid=" + this.f350b + ')';
    }

    public e0(int i, String str) {
        de.i.e(str, "uuid");
        this.f349a = i;
        this.f350b = str;
    }
}
