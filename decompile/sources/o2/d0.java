package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9408e;

    public d0(Object obj) {
        this(-1L, obj);
    }

    public final d0 a(Object obj) {
        if (this.f9404a.equals(obj)) {
            return this;
        }
        return new d0(obj, this.f9405b, this.f9406c, this.f9407d, this.f9408e);
    }

    public final boolean b() {
        return this.f9405b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f9404a.equals(d0Var.f9404a) && this.f9405b == d0Var.f9405b && this.f9406c == d0Var.f9406c && this.f9407d == d0Var.f9407d && this.f9408e == d0Var.f9408e;
    }

    public final int hashCode() {
        return ((((((((this.f9404a.hashCode() + 527) * 31) + this.f9405b) * 31) + this.f9406c) * 31) + ((int) this.f9407d)) * 31) + this.f9408e;
    }

    public d0(long j8, Object obj) {
        this(obj, -1, -1, j8, -1);
    }

    public d0(Object obj, long j8, int i) {
        this(obj, -1, -1, j8, i);
    }

    public d0(Object obj, int i, int i10, long j8, int i11) {
        this.f9404a = obj;
        this.f9405b = i;
        this.f9406c = i10;
        this.f9407d = j8;
        this.f9408e = i11;
    }
}
