package ma;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f8568b;

    public s(Class cls, Class cls2) {
        this.f8567a = cls;
        this.f8568b = cls2;
    }

    public static s a(Class cls) {
        return new s(r.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f8568b.equals(sVar.f8568b)) {
            return this.f8567a.equals(sVar.f8567a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8567a.hashCode() + (this.f8568b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f8568b;
        Class cls2 = this.f8567a;
        if (cls2 == r.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
