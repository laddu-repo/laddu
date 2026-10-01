package qb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11183a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f11184b;

    public p(Class cls, Class cls2) {
        this.f11183a = cls;
        this.f11184b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f11184b.equals(pVar.f11184b)) {
            return false;
        }
        return this.f11183a.equals(pVar.f11183a);
    }

    public final int hashCode() {
        return this.f11183a.hashCode() + (this.f11184b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f11184b;
        Class cls2 = this.f11183a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
