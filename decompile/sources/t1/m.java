package t1;

import android.os.Build;
import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f12018a;

    public m(SparseBooleanArray sparseBooleanArray) {
        this.f12018a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f12018a;
        w1.a.g(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        SparseBooleanArray sparseBooleanArray = mVar.f12018a;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f12018a;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
            if (a(i10) != mVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f12018a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
