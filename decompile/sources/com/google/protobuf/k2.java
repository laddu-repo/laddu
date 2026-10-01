package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k2 extends b implements Internal.LongList, RandomAccess, h3 {

    /* renamed from: z, reason: collision with root package name */
    public static final k2 f2968z = new k2(new long[0], 0, false);

    /* renamed from: x, reason: collision with root package name */
    public long[] f2969x;

    /* renamed from: y, reason: collision with root package name */
    public int f2970y;

    public k2() {
        this(new long[10], 0, true);
    }

    public final void a(int i6) {
        if (i6 >= 0 && i6 < this.f2970y) {
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2970y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i10 = this.f2970y)) {
            long[] jArr = this.f2969x;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i6, jArr, i6 + 1, i10 - i6);
            } else {
                long[] jArr2 = new long[((i10 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i6);
                System.arraycopy(this.f2969x, i6, jArr2, i6 + 1, this.f2970y - i6);
                this.f2969x = jArr2;
            }
            this.f2969x[i6] = longValue;
            this.f2970y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2970y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof k2)) {
            return super.addAll(collection);
        }
        k2 k2Var = (k2) collection;
        int i6 = k2Var.f2970y;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f2970y;
        if (Integer.MAX_VALUE - i10 >= i6) {
            int i11 = i10 + i6;
            long[] jArr = this.f2969x;
            if (i11 > jArr.length) {
                this.f2969x = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(k2Var.f2969x, 0, this.f2969x, this.f2970y, k2Var.f2970y);
            this.f2970y = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.LongList
    public final void addLong(long j) {
        ensureIsMutable();
        int i6 = this.f2970y;
        long[] jArr = this.f2969x;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[((i6 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i6);
            this.f2969x = jArr2;
        }
        long[] jArr3 = this.f2969x;
        int i10 = this.f2970y;
        this.f2970y = i10 + 1;
        jArr3[i10] = j;
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
        if (!(obj instanceof k2)) {
            return super.equals(obj);
        }
        k2 k2Var = (k2) obj;
        if (this.f2970y != k2Var.f2970y) {
            return false;
        }
        long[] jArr = k2Var.f2969x;
        for (int i6 = 0; i6 < this.f2970y; i6++) {
            if (this.f2969x[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return Long.valueOf(getLong(i6));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long getLong(int i6) {
        a(i6);
        return this.f2969x[i6];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f2970y; i10++) {
            i6 = (i6 * 31) + Internal.hashLong(this.f2969x[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i6 = this.f2970y;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f2969x[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        ensureIsMutable();
        a(i6);
        long[] jArr = this.f2969x;
        long j = jArr[i6];
        if (i6 < this.f2970y - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (r3 - i6) - 1);
        }
        this.f2970y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        ensureIsMutable();
        if (i10 >= i6) {
            long[] jArr = this.f2969x;
            System.arraycopy(jArr, i10, jArr, i6, this.f2970y - i10);
            this.f2970y -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        return Long.valueOf(setLong(i6, ((Long) obj).longValue()));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long setLong(int i6, long j) {
        ensureIsMutable();
        a(i6);
        long[] jArr = this.f2969x;
        long j10 = jArr[i6];
        jArr[i6] = j;
        return j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2970y;
    }

    public k2(long[] jArr, int i6, boolean z10) {
        super(z10);
        this.f2969x = jArr;
        this.f2970y = i6;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.f2970y) {
            return new k2(Arrays.copyOf(this.f2969x, i6), this.f2970y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
