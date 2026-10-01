package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends b implements Internal.BooleanList, RandomAccess, h3 {

    /* renamed from: z, reason: collision with root package name */
    public static final j f2945z = new j(new boolean[0], 0, false);

    /* renamed from: x, reason: collision with root package name */
    public boolean[] f2946x;

    /* renamed from: y, reason: collision with root package name */
    public int f2947y;

    public j(boolean[] zArr, int i6, boolean z10) {
        super(z10);
        this.f2946x = zArr;
        this.f2947y = i6;
    }

    public final void a(int i6) {
        if (i6 >= 0 && i6 < this.f2947y) {
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2947y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i10 = this.f2947y)) {
            boolean[] zArr = this.f2946x;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i6, zArr, i6 + 1, i10 - i6);
            } else {
                boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i6);
                System.arraycopy(this.f2946x, i6, zArr2, i6 + 1, this.f2947y - i6);
                this.f2946x = zArr2;
            }
            this.f2946x[i6] = booleanValue;
            this.f2947y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2947y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i6 = jVar.f2947y;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f2947y;
        if (Integer.MAX_VALUE - i10 >= i6) {
            int i11 = i10 + i6;
            boolean[] zArr = this.f2946x;
            if (i11 > zArr.length) {
                this.f2946x = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(jVar.f2946x, 0, this.f2946x, this.f2947y, jVar.f2947y);
            this.f2947y = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z10) {
        ensureIsMutable();
        int i6 = this.f2947y;
        boolean[] zArr = this.f2946x;
        if (i6 == zArr.length) {
            boolean[] zArr2 = new boolean[((i6 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i6);
            this.f2946x = zArr2;
        }
        boolean[] zArr3 = this.f2946x;
        int i10 = this.f2947y;
        this.f2947y = i10 + 1;
        zArr3[i10] = z10;
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
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f2947y != jVar.f2947y) {
            return false;
        }
        boolean[] zArr = jVar.f2946x;
        for (int i6 = 0; i6 < this.f2947y; i6++) {
            if (this.f2946x[i6] != zArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return Boolean.valueOf(getBoolean(i6));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i6) {
        a(i6);
        return this.f2946x[i6];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f2947y; i10++) {
            i6 = (i6 * 31) + Internal.hashBoolean(this.f2946x[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i6 = this.f2947y;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f2946x[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        ensureIsMutable();
        a(i6);
        boolean[] zArr = this.f2946x;
        boolean z10 = zArr[i6];
        if (i6 < this.f2947y - 1) {
            System.arraycopy(zArr, i6 + 1, zArr, i6, (r2 - i6) - 1);
        }
        this.f2947y--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        ensureIsMutable();
        if (i10 >= i6) {
            boolean[] zArr = this.f2946x;
            System.arraycopy(zArr, i10, zArr, i6, this.f2947y - i10);
            this.f2947y -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        return Boolean.valueOf(setBoolean(i6, ((Boolean) obj).booleanValue()));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i6, boolean z10) {
        ensureIsMutable();
        a(i6);
        boolean[] zArr = this.f2946x;
        boolean z11 = zArr[i6];
        zArr[i6] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2947y;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
    public final Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.f2947y) {
            return new j(Arrays.copyOf(this.f2946x, i6), this.f2947y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
