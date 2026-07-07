package jf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7474a;

    public m(Throwable th) {
        this.f7474a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (kotlin.jvm.internal.k.a(this.f7474a, ((m) obj).f7474a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f7474a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // jf.n
    public final String toString() {
        return "Closed(" + this.f7474a + ')';
    }
}
