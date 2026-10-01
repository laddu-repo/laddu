package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s1 extends b implements Internal.IntList, RandomAccess, h3 {

    /* renamed from: z, reason: collision with root package name */
    public static final s1 f3040z = new s1(new int[0], 0, false);

    /* renamed from: x, reason: collision with root package name */
    public int[] f3041x;

    /* renamed from: y, reason: collision with root package name */
    public int f3042y;

    public s1() {
        this(new int[10], 0, true);
    }

    public final void a(int i6) {
        if (i6 >= 0 && i6 < this.f3042y) {
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f3042y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i10 = this.f3042y)) {
            int[] iArr = this.f3041x;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i6, iArr, i6 + 1, i10 - i6);
            } else {
                int[] iArr2 = new int[((i10 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i6);
                System.arraycopy(this.f3041x, i6, iArr2, i6 + 1, this.f3042y - i6);
                this.f3041x = iArr2;
            }
            this.f3041x[i6] = intValue;
            this.f3042y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f3042y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof s1)) {
            return super.addAll(collection);
        }
        s1 s1Var = (s1) collection;
        int i6 = s1Var.f3042y;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f3042y;
        if (Integer.MAX_VALUE - i10 >= i6) {
            int i11 = i10 + i6;
            int[] iArr = this.f3041x;
            if (i11 > iArr.length) {
                this.f3041x = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(s1Var.f3041x, 0, this.f3041x, this.f3042y, s1Var.f3042y);
            this.f3042y = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.IntList
    public final void addInt(int i6) {
        ensureIsMutable();
        int i10 = this.f3042y;
        int[] iArr = this.f3041x;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f3041x = iArr2;
        }
        int[] iArr3 = this.f3041x;
        int i11 = this.f3042y;
        this.f3042y = i11 + 1;
        iArr3[i11] = i6;
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
        if (!(obj instanceof s1)) {
            return super.equals(obj);
        }
        s1 s1Var = (s1) obj;
        if (this.f3042y != s1Var.f3042y) {
            return false;
        }
        int[] iArr = s1Var.f3041x;
        for (int i6 = 0; i6 < this.f3042y; i6++) {
            if (this.f3041x[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return Integer.valueOf(getInt(i6));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int getInt(int i6) {
        a(i6);
        return this.f3041x[i6];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f3042y; i10++) {
            i6 = (i6 * 31) + this.f3041x[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i6 = this.f3042y;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f3041x[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        ensureIsMutable();
        a(i6);
        int[] iArr = this.f3041x;
        int i10 = iArr[i6];
        if (i6 < this.f3042y - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (r2 - i6) - 1);
        }
        this.f3042y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        ensureIsMutable();
        if (i10 >= i6) {
            int[] iArr = this.f3041x;
            System.arraycopy(iArr, i10, iArr, i6, this.f3042y - i10);
            this.f3042y -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        return Integer.valueOf(setInt(i6, ((Integer) obj).intValue()));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int setInt(int i6, int i10) {
        ensureIsMutable();
        a(i6);
        int[] iArr = this.f3041x;
        int i11 = iArr[i6];
        iArr[i6] = i10;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3042y;
    }

    public s1(int[] iArr, int i6, boolean z10) {
        super(z10);
        this.f3041x = iArr;
        this.f3042y = i6;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.f3042y) {
            return new s1(Arrays.copyOf(this.f3041x, i6), this.f3042y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
