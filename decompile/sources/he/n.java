package he;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Object f6086x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f6087y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f6088z;

    public n(Object obj, Object obj2, Object obj3) {
        this.f6086x = obj;
        this.f6087y = obj2;
        this.f6088z = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (kotlin.jvm.internal.k.a(this.f6086x, nVar.f6086x) && kotlin.jvm.internal.k.a(this.f6087y, nVar.f6087y) && kotlin.jvm.internal.k.a(this.f6088z, nVar.f6088z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i6 = 0;
        Object obj = this.f6086x;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f6087y;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Object obj3 = this.f6088z;
        if (obj3 != null) {
            i6 = obj3.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        return "(" + this.f6086x + ", " + this.f6087y + ", " + this.f6088z + ')';
    }
}
