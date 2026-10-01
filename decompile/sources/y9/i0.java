package y9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends a0 implements Set {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f14562x = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient f0 f14563w;

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            p4.v.i("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static i0 j(int i, Object... objArr) {
        if (i == 0) {
            return f1.E;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new m1(obj);
        }
        int i10 = i(i);
        Object[] objArr2 = new Object[i10];
        int i11 = i10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(d0.d.h(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iU = p.u(iHashCode);
            while (true) {
                int i15 = iU & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iU++;
            }
        }
        Arrays.fill(objArr, i13, i, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new m1(obj4);
        }
        if (i(i13) < i10 / 2) {
            return j(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new f1(i12, i11, i13, objArr, objArr2);
    }

    public static i0 k(Collection collection) {
        if ((collection instanceof i0) && !(collection instanceof SortedSet)) {
            i0 i0Var = (i0) collection;
            if (!i0Var.f()) {
                return i0Var;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    @Override // y9.a0
    public f0 a() {
        f0 f0Var = this.f14563w;
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0VarL = l();
        this.f14563w = f0VarL;
        return f0VarL;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof i0) && (this instanceof f1) && (((i0) obj) instanceof f1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return p.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p.n(this);
    }

    public f0 l() {
        Object[] array = toArray(a0.f14521v);
        c0 c0Var = f0.f14553w;
        return f0.i(array.length, array);
    }
}
