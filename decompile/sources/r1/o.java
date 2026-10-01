package r1;

import android.os.Build;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f11592a;

    public o(SparseBooleanArray sparseBooleanArray) {
        this.f11592a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i6 : iArr) {
            if (this.f11592a.get(i6)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i6) {
        SparseBooleanArray sparseBooleanArray = this.f11592a;
        u1.c.c(i6, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        SparseBooleanArray sparseBooleanArray = oVar.f11592a;
        int i6 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f11592a;
        if (i6 < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
                if (b(i10) != oVar.b(i10)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i6 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f11592a;
        if (i6 < 24) {
            int size = sparseBooleanArray.size();
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                size = (size * 31) + b(i10);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
