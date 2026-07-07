package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends b implements RandomAccess {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s0 f853y = new s0(new Object[0], 0, false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f855x;

    public s0(Object[] objArr, int i, boolean z2) {
        this.f742v = z2;
        this.f854w = objArr;
        this.f855x = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f855x;
        Object[] objArr = this.f854w;
        if (i == objArr.length) {
            this.f854w = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f854w;
        int i10 = this.f855x;
        this.f855x = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f855x) {
            StringBuilder sbO = d0.d.o(i, "Index:", ", Size:");
            sbO.append(this.f855x);
            throw new IndexOutOfBoundsException(sbO.toString());
        }
    }

    public final s0 c(int i) {
        if (i >= this.f855x) {
            return new s0(Arrays.copyOf(this.f854w, i), this.f855x, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f854w[i];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f854w;
        Object obj = objArr[i];
        if (i < this.f855x - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f855x--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.f854w;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f855x;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i >= 0 && i <= (i10 = this.f855x)) {
            Object[] objArr = this.f854w;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f854w, i, objArr2, i + 1, this.f855x - i);
                this.f854w = objArr2;
            }
            this.f854w[i] = obj;
            this.f855x++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbO = d0.d.o(i, "Index:", ", Size:");
        sbO.append(this.f855x);
        throw new IndexOutOfBoundsException(sbO.toString());
    }
}
