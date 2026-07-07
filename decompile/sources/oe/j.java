package oe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f10160b = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10161a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return de.i.a(this.f10161a, ((j) obj).f10161a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10161a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10161a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
