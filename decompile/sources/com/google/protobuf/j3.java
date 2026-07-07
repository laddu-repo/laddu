package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j3 extends b implements RandomAccess {

    /* renamed from: z, reason: collision with root package name */
    public static final j3 f2958z = new j3(new Object[0], 0, false);

    /* renamed from: x, reason: collision with root package name */
    public Object[] f2959x;

    /* renamed from: y, reason: collision with root package name */
    public int f2960y;

    public j3(Object[] objArr, int i6, boolean z10) {
        super(z10);
        this.f2959x = objArr;
        this.f2960y = i6;
    }

    public final void a(int i6) {
        if (i6 >= 0 && i6 < this.f2960y) {
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2960y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i6 = this.f2960y;
        Object[] objArr = this.f2959x;
        if (i6 == objArr.length) {
            this.f2959x = Arrays.copyOf(objArr, ((i6 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2959x;
        int i10 = this.f2960y;
        this.f2960y = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        a(i6);
        return this.f2959x[i6];
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i6) {
        if (i6 >= this.f2960y) {
            return new j3(Arrays.copyOf(this.f2959x, i6), this.f2960y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        ensureIsMutable();
        a(i6);
        Object[] objArr = this.f2959x;
        Object obj = objArr[i6];
        if (i6 < this.f2960y - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f2960y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        ensureIsMutable();
        a(i6);
        Object[] objArr = this.f2959x;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2960y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i10 = this.f2960y)) {
            Object[] objArr = this.f2959x;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i6, objArr, i6 + 1, i10 - i6);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i6);
                System.arraycopy(this.f2959x, i6, objArr2, i6 + 1, this.f2960y - i6);
                this.f2959x = objArr2;
            }
            this.f2959x[i6] = obj;
            this.f2960y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2960y);
        throw new IndexOutOfBoundsException(n10.toString());
    }
}
