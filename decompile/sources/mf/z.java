package mf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements le.g {

    /* renamed from: x, reason: collision with root package name */
    public final ThreadLocal f8886x;

    public z(ThreadLocal threadLocal) {
        this.f8886x = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && kotlin.jvm.internal.k.a(this.f8886x, ((z) obj).f8886x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8886x.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f8886x + ')';
    }
}
