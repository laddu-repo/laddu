package db;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends a1 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final cb.e f4030x;

    /* renamed from: y, reason: collision with root package name */
    public final a1 f4031y;

    public q(cb.e eVar, a1 a1Var) {
        this.f4030x = eVar;
        this.f4031y = a1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        cb.e eVar = this.f4030x;
        return this.f4031y.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f4030x.equals(qVar.f4030x) && this.f4031y.equals(qVar.f4031y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4030x, this.f4031y});
    }

    public final String toString() {
        return this.f4031y + ".onResultOf(" + this.f4030x + ")";
    }
}
