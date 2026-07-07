package db;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends a1 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Comparator[] f3983x;

    public a0(q qVar, q qVar2) {
        this.f3983x = new Comparator[]{qVar, qVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i6 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f3983x;
            if (i6 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i6].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i6++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return Arrays.equals(this.f3983x, ((a0) obj).f3983x);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3983x);
    }

    public final String toString() {
        return r4.a.o(new StringBuilder("Ordering.compound("), Arrays.toString(this.f3983x), ")");
    }
}
