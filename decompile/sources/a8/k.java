package a8;

import bf.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final p f628a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (!kotlin.jvm.internal.k.a(this.f628a, ((k) obj).f628a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f628a.hashCode();
    }

    public final String toString() {
        return "RequestKType(value=" + this.f628a + ')';
    }
}
