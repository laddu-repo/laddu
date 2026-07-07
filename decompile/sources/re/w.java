package re;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w implements sd.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ThreadLocal f11408v;

    public w(ThreadLocal threadLocal) {
        this.f11408v = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && de.i.a(this.f11408v, ((w) obj).f11408v);
    }

    public final int hashCode() {
        return this.f11408v.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f11408v + ')';
    }
}
