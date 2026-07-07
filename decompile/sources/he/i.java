package he;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Object f6076x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f6077y;

    public i(Object obj, Object obj2) {
        this.f6076x = obj;
        this.f6077y = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (kotlin.jvm.internal.k.a(this.f6076x, iVar.f6076x) && kotlin.jvm.internal.k.a(this.f6077y, iVar.f6077y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        Object obj = this.f6076x;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f6077y;
        if (obj2 != null) {
            i6 = obj2.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        return "(" + this.f6076x + ", " + this.f6077y + ')';
    }
}
