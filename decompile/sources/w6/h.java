package w6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f14134c;

    /* renamed from: a, reason: collision with root package name */
    public final e9.f f14135a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.f f14136b;

    static {
        b bVar = b.f14124k;
        f14134c = new h(bVar, bVar);
    }

    public h(e9.f fVar, e9.f fVar2) {
        this.f14135a = fVar;
        this.f14136b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.k.a(this.f14135a, hVar.f14135a) && kotlin.jvm.internal.k.a(this.f14136b, hVar.f14136b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14136b.hashCode() + (this.f14135a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f14135a + ", height=" + this.f14136b + ')';
    }
}
