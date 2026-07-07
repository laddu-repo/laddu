package y9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends y0 implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Comparator[] f14633v;

    public y(o oVar, o oVar2) {
        this.f14633v = new Comparator[]{oVar, oVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f14633v;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return Arrays.equals(this.f14633v, ((y) obj).f14633v);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14633v);
    }

    public final String toString() {
        return j4.a.n(new StringBuilder("Ordering.compound("), Arrays.toString(this.f14633v), ")");
    }
}
