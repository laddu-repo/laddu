package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n5 extends w4 implements RandomAccess, q5, j6 {
    public static final int[] A;
    public static final n5 B;

    /* renamed from: y, reason: collision with root package name */
    public int[] f2362y;

    /* renamed from: z, reason: collision with root package name */
    public int f2363z;

    static {
        int[] iArr = new int[0];
        A = iArr;
        B = new n5(iArr, 0, false);
    }

    public n5(int[] iArr, int i6, boolean z10) {
        super(z10);
        this.f2362y = iArr;
        this.f2363z = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i6 >= 0 && i6 <= (i10 = this.f2363z)) {
            int i11 = i6 + 1;
            int[] iArr = this.f2362y;
            int length = iArr.length;
            if (i10 < length) {
                System.arraycopy(iArr, i6, iArr, i11, i10 - i6);
            } else {
                int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.f2362y, 0, iArr2, 0, i6);
                System.arraycopy(this.f2362y, i6, iArr2, i11, this.f2363z - i6);
                this.f2362y = iArr2;
            }
            this.f2362y[i6] = intValue;
            this.f2363z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(y4.a(this.f2363z, i6, (byte) 13, "Index:", ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = t5.f2444a;
        collection.getClass();
        if (!(collection instanceof n5)) {
            return super.addAll(collection);
        }
        n5 n5Var = (n5) collection;
        int i6 = n5Var.f2363z;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f2363z;
        if (Integer.MAX_VALUE - i10 >= i6) {
            int i11 = i10 + i6;
            int[] iArr = this.f2362y;
            if (i11 > iArr.length) {
                this.f2362y = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(n5Var.f2362y, 0, this.f2362y, this.f2363z, n5Var.f2363z);
            this.f2363z = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.measurement.s5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n5 i(int i6) {
        int[] copyOf;
        if (i6 >= this.f2363z) {
            if (i6 == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.f2362y, i6);
            }
            return new n5(copyOf, this.f2363z, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i6) {
        e(i6);
        return this.f2362y[i6];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i6) {
        a();
        int i10 = this.f2363z;
        int length = this.f2362y.length;
        if (i10 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2362y, 0, iArr, 0, this.f2363z);
            this.f2362y = iArr;
        }
        int[] iArr2 = this.f2362y;
        int i11 = this.f2363z;
        this.f2363z = i11 + 1;
        iArr2[i11] = i6;
    }

    public final void e(int i6) {
        if (i6 >= 0 && i6 < this.f2363z) {
        } else {
            throw new IndexOutOfBoundsException(y4.a(this.f2363z, i6, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return super.equals(obj);
        }
        n5 n5Var = (n5) obj;
        if (this.f2363z != n5Var.f2363z) {
            return false;
        }
        int[] iArr = n5Var.f2362y;
        for (int i6 = 0; i6 < this.f2363z; i6++) {
            if (this.f2362y[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        e(i6);
        return Integer.valueOf(this.f2362y[i6]);
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f2363z; i10++) {
            i6 = (i6 * 31) + this.f2362y[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i6 = this.f2363z;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f2362y[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        a();
        e(i6);
        int[] iArr = this.f2362y;
        int i10 = iArr[i6];
        if (i6 < this.f2363z - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (r2 - i6) - 1);
        }
        this.f2363z--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        a();
        if (i10 >= i6) {
            int[] iArr = this.f2362y;
            System.arraycopy(iArr, i10, iArr, i6, this.f2363z - i10);
            this.f2363z -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        e(i6);
        int[] iArr = this.f2362y;
        int i10 = iArr[i6];
        iArr[i6] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2363z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
