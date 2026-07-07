package ie;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f6849a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6850b;

    public u(int i6, Object obj) {
        this.f6849a = i6;
        this.f6850b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f6849a == uVar.f6849a && kotlin.jvm.internal.k.a(this.f6850b, uVar.f6850b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = this.f6849a * 31;
        Object obj = this.f6850b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i6 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f6849a + ", value=" + this.f6850b + ')';
    }
}
