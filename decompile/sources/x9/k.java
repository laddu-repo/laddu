package x9;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14293v;

    public k(Object obj) {
        this.f14293v = obj;
    }

    @Override // x9.h
    public final Object a() {
        return this.f14293v;
    }

    @Override // x9.h
    public final boolean b() {
        return true;
    }

    @Override // x9.h
    public final Object c() {
        return this.f14293v;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f14293v.equals(((k) obj).f14293v);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14293v.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f14293v + ")";
    }
}
