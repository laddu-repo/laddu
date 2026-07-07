package cb;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements l, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Object f2018x;

    public o(Object obj) {
        this.f2018x = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return e9.f.c(this.f2018x, ((o) obj).f2018x);
        }
        return false;
    }

    @Override // cb.l
    public final Object get() {
        return this.f2018x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2018x});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f2018x + ")";
    }
}
