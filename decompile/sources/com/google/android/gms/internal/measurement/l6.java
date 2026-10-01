package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l6 extends w4 implements RandomAccess {
    public static final Object[] A;
    public static final l6 B;

    /* renamed from: y, reason: collision with root package name */
    public Object[] f2338y;

    /* renamed from: z, reason: collision with root package name */
    public int f2339z;

    static {
        Object[] objArr = new Object[0];
        A = objArr;
        B = new l6(objArr, 0, false);
    }

    public l6(Object[] objArr, int i6, boolean z10) {
        super(z10);
        this.f2338y = objArr;
        this.f2339z = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        a();
        if (i6 >= 0 && i6 <= (i10 = this.f2339z)) {
            int i11 = i6 + 1;
            Object[] objArr = this.f2338y;
            int length = objArr.length;
            if (i10 < length) {
                System.arraycopy(objArr, i6, objArr, i11, i10 - i6);
            } else {
                Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.f2338y, 0, objArr2, 0, i6);
                System.arraycopy(this.f2338y, i6, objArr2, i11, this.f2339z - i6);
                this.f2338y = objArr2;
            }
            this.f2338y[i6] = obj;
            this.f2339z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(y4.a(this.f2339z, i6, (byte) 13, "Index:", ", Size:"));
    }

    public final void b(int i6) {
        if (i6 >= 0 && i6 < this.f2339z) {
        } else {
            throw new IndexOutOfBoundsException(y4.a(this.f2339z, i6, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        b(i6);
        return this.f2338y[i6];
    }

    @Override // com.google.android.gms.internal.measurement.s5
    public final /* bridge */ /* synthetic */ s5 i(int i6) {
        Object[] copyOf;
        if (i6 >= this.f2339z) {
            if (i6 == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.f2338y, i6);
            }
            return new l6(copyOf, this.f2339z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.w4, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        a();
        b(i6);
        Object[] objArr = this.f2338y;
        Object obj = objArr[i6];
        if (i6 < this.f2339z - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f2339z--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        a();
        b(i6);
        Object[] objArr = this.f2338y;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2339z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i6 = this.f2339z;
        int length = this.f2338y.length;
        if (i6 == length) {
            this.f2338y = Arrays.copyOf(this.f2338y, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f2338y;
        int i10 = this.f2339z;
        this.f2339z = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
