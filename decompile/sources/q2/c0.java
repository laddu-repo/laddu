package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10834a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10835b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10836c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10837d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10838e;

    public c0(Object obj) {
        this(-1L, obj);
    }

    public final c0 a(Object obj) {
        if (this.f10834a.equals(obj)) {
            return this;
        }
        return new c0(obj, this.f10835b, this.f10836c, this.f10837d, this.f10838e);
    }

    public final boolean b() {
        if (this.f10835b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f10834a.equals(c0Var.f10834a) && this.f10835b == c0Var.f10835b && this.f10836c == c0Var.f10836c && this.f10837d == c0Var.f10837d && this.f10838e == c0Var.f10838e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f10834a.hashCode() + 527) * 31) + this.f10835b) * 31) + this.f10836c) * 31) + ((int) this.f10837d)) * 31) + this.f10838e;
    }

    public c0(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public c0(Object obj, long j, int i6) {
        this(obj, -1, -1, j, i6);
    }

    public c0(Object obj, int i6, int i10, long j, int i11) {
        this.f10834a = obj;
        this.f10835b = i6;
        this.f10836c = i10;
        this.f10837d = j;
        this.f10838e = i11;
    }
}
