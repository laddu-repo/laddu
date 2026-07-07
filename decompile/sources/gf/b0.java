package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends le.a {

    /* renamed from: y, reason: collision with root package name */
    public static final i1 f5650y = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final String f5651x;

    public b0(String str) {
        super(f5650y);
        this.f5651x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && kotlin.jvm.internal.k.a(this.f5651x, ((b0) obj).f5651x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5651x.hashCode();
    }

    public final String toString() {
        return r4.a.n(new StringBuilder("CoroutineName("), this.f5651x, ')');
    }
}
