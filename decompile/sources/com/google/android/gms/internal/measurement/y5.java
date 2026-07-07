package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y5 extends w4 implements RandomAccess, r5, j6 {
    public static final long[] A;
    public static final y5 B;

    /* renamed from: y, reason: collision with root package name */
    public long[] f2530y;

    /* renamed from: z, reason: collision with root package name */
    public int f2531z;

    static {
        long[] jArr = new long[0];
        A = jArr;
        B = new y5(jArr, 0, false);
    }

    public y5(long[] jArr, int i6, boolean z10) {
        super(z10);
        this.f2530y = jArr;
        this.f2531z = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        a();
        if (i6 >= 0 && i6 <= (i10 = this.f2531z)) {
            int i11 = i6 + 1;
            long[] jArr = this.f2530y;
            int length = jArr.length;
            if (i10 < length) {
                System.arraycopy(jArr, i6, jArr, i11, i10 - i6);
            } else {
                long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.f2530y, 0, jArr2, 0, i6);
                System.arraycopy(this.f2530y, i6, jArr2, i11, this.f2531z - i6);
                this.f2530y = jArr2;
            }
            this.f2530y[i6] = longValue;
            this.f2531z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(y4.a(this.f2531z, i6, (byte) 13, "Index:", ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = t5.f2444a;
        collection.getClass();
        if (!(collection instanceof y5)) {
            return super.addAll(collection);
        }
        y5 y5Var = (y5) collection;
        int i6 = y5Var.f2531z;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f2531z;
        if (Integer.MAX_VALUE - i10 >= i6) {
            int i11 = i10 + i6;
            long[] jArr = this.f2530y;
            if (i11 > jArr.length) {
                this.f2530y = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(y5Var.f2530y, 0, this.f2530y, this.f2531z, y5Var.f2531z);
            this.f2531z = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i6) {
        e(i6);
        return this.f2530y[i6];
    }

    @Override // com.google.android.gms.internal.measurement.s5
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final y5 i(int i6) {
        long[] copyOf;
        if (i6 >= this.f2531z) {
            if (i6 == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.f2530y, i6);
            }
            return new y5(copyOf, this.f2531z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(long j) {
        a();
        int i6 = this.f2531z;
        int length = this.f2530y.length;
        if (i6 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2530y, 0, jArr, 0, this.f2531z);
            this.f2530y = jArr;
        }
        long[] jArr2 = this.f2530y;
        int i10 = this.f2531z;
        this.f2531z = i10 + 1;
        jArr2[i10] = j;
    }

    public final void e(int i6) {
        if (i6 >= 0 && i6 < this.f2531z) {
        } else {
            throw new IndexOutOfBoundsException(y4.a(this.f2531z, i6, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return super.equals(obj);
        }
        y5 y5Var = (y5) obj;
        if (this.f2531z != y5Var.f2531z) {
            return false;
        }
        long[] jArr = y5Var.f2530y;
        for (int i6 = 0; i6 < this.f2531z; i6++) {
            if (this.f2530y[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        e(i6);
        return Long.valueOf(this.f2530y[i6]);
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f2531z; i10++) {
            long j = this.f2530y[i10];
            Charset charset = t5.f2444a;
            i6 = (i6 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i6 = this.f2531z;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f2530y[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        a();
        e(i6);
        long[] jArr = this.f2530y;
        long j = jArr[i6];
        if (i6 < this.f2531z - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (r3 - i6) - 1);
        }
        this.f2531z--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        a();
        if (i10 >= i6) {
            long[] jArr = this.f2530y;
            System.arraycopy(jArr, i10, jArr, i6, this.f2531z - i10);
            this.f2531z -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        e(i6);
        long[] jArr = this.f2530y;
        long j = jArr[i6];
        jArr[i6] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2531z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
