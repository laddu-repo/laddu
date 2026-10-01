package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends b implements Internal.DoubleList, RandomAccess, h3 {

    /* renamed from: z, reason: collision with root package name */
    public static final m0 f2984z = new m0(new double[0], 0, false);

    /* renamed from: x, reason: collision with root package name */
    public double[] f2985x;

    /* renamed from: y, reason: collision with root package name */
    public int f2986y;

    public m0(double[] dArr, int i6, boolean z10) {
        super(z10);
        this.f2985x = dArr;
        this.f2986y = i6;
    }

    public final void a(int i6) {
        if (i6 >= 0 && i6 < this.f2986y) {
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2986y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i10 = this.f2986y)) {
            double[] dArr = this.f2985x;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i6, dArr, i6 + 1, i10 - i6);
            } else {
                double[] dArr2 = new double[((i10 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i6);
                System.arraycopy(this.f2985x, i6, dArr2, i6 + 1, this.f2986y - i6);
                this.f2985x = dArr2;
            }
            this.f2985x[i6] = doubleValue;
            this.f2986y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2986y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof m0)) {
            return super.addAll(collection);
        }
        m0 m0Var = (m0) collection;
        int i6 = m0Var.f2986y;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f2986y;
        if (Integer.MAX_VALUE - i10 >= i6) {
            int i11 = i10 + i6;
            double[] dArr = this.f2985x;
            if (i11 > dArr.length) {
                this.f2985x = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(m0Var.f2985x, 0, this.f2985x, this.f2986y, m0Var.f2986y);
            this.f2986y = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final void addDouble(double d10) {
        ensureIsMutable();
        int i6 = this.f2986y;
        double[] dArr = this.f2985x;
        if (i6 == dArr.length) {
            double[] dArr2 = new double[((i6 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i6);
            this.f2985x = dArr2;
        }
        double[] dArr3 = this.f2985x;
        int i10 = this.f2986y;
        this.f2986y = i10 + 1;
        dArr3[i10] = d10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return super.equals(obj);
        }
        m0 m0Var = (m0) obj;
        if (this.f2986y != m0Var.f2986y) {
            return false;
        }
        double[] dArr = m0Var.f2985x;
        for (int i6 = 0; i6 < this.f2986y; i6++) {
            if (Double.doubleToLongBits(this.f2985x[i6]) != Double.doubleToLongBits(dArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return Double.valueOf(getDouble(i6));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double getDouble(int i6) {
        a(i6);
        return this.f2985x[i6];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f2986y; i10++) {
            i6 = (i6 * 31) + Internal.hashLong(Double.doubleToLongBits(this.f2985x[i10]));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i6 = this.f2986y;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f2985x[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        ensureIsMutable();
        a(i6);
        double[] dArr = this.f2985x;
        double d10 = dArr[i6];
        if (i6 < this.f2986y - 1) {
            System.arraycopy(dArr, i6 + 1, dArr, i6, (r3 - i6) - 1);
        }
        this.f2986y--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        ensureIsMutable();
        if (i10 >= i6) {
            double[] dArr = this.f2985x;
            System.arraycopy(dArr, i10, dArr, i6, this.f2986y - i10);
            this.f2986y -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        return Double.valueOf(setDouble(i6, ((Double) obj).doubleValue()));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double setDouble(int i6, double d10) {
        ensureIsMutable();
        a(i6);
        double[] dArr = this.f2985x;
        double d11 = dArr[i6];
        dArr[i6] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2986y;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.f2986y) {
            return new m0(Arrays.copyOf(this.f2985x, i6), this.f2986y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
