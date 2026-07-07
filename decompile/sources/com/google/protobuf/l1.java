package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l1 extends b implements Internal.FloatList, RandomAccess, h3 {

    /* renamed from: z, reason: collision with root package name */
    public static final l1 f2979z = new l1(new float[0], 0, false);

    /* renamed from: x, reason: collision with root package name */
    public float[] f2980x;

    /* renamed from: y, reason: collision with root package name */
    public int f2981y;

    public l1(float[] fArr, int i6, boolean z10) {
        super(z10);
        this.f2980x = fArr;
        this.f2981y = i6;
    }

    public final void a(int i6) {
        if (i6 >= 0 && i6 < this.f2981y) {
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2981y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i10 = this.f2981y)) {
            float[] fArr = this.f2980x;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i6, fArr, i6 + 1, i10 - i6);
            } else {
                float[] fArr2 = new float[((i10 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i6);
                System.arraycopy(this.f2980x, i6, fArr2, i6 + 1, this.f2981y - i6);
                this.f2980x = fArr2;
            }
            this.f2980x[i6] = floatValue;
            this.f2981y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Index:", ", Size:");
        n10.append(this.f2981y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof l1)) {
            return super.addAll(collection);
        }
        l1 l1Var = (l1) collection;
        int i6 = l1Var.f2981y;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f2981y;
        if (Integer.MAX_VALUE - i10 >= i6) {
            int i11 = i10 + i6;
            float[] fArr = this.f2980x;
            if (i11 > fArr.length) {
                this.f2980x = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(l1Var.f2980x, 0, this.f2980x, this.f2981y, l1Var.f2981y);
            this.f2981y = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final void addFloat(float f3) {
        ensureIsMutable();
        int i6 = this.f2981y;
        float[] fArr = this.f2980x;
        if (i6 == fArr.length) {
            float[] fArr2 = new float[((i6 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i6);
            this.f2980x = fArr2;
        }
        float[] fArr3 = this.f2980x;
        int i10 = this.f2981y;
        this.f2981y = i10 + 1;
        fArr3[i10] = f3;
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
        if (!(obj instanceof l1)) {
            return super.equals(obj);
        }
        l1 l1Var = (l1) obj;
        if (this.f2981y != l1Var.f2981y) {
            return false;
        }
        float[] fArr = l1Var.f2980x;
        for (int i6 = 0; i6 < this.f2981y; i6++) {
            if (Float.floatToIntBits(this.f2980x[i6]) != Float.floatToIntBits(fArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return Float.valueOf(getFloat(i6));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float getFloat(int i6) {
        a(i6);
        return this.f2980x[i6];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f2981y; i10++) {
            i6 = (i6 * 31) + Float.floatToIntBits(this.f2980x[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i6 = this.f2981y;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f2980x[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        ensureIsMutable();
        a(i6);
        float[] fArr = this.f2980x;
        float f3 = fArr[i6];
        if (i6 < this.f2981y - 1) {
            System.arraycopy(fArr, i6 + 1, fArr, i6, (r2 - i6) - 1);
        }
        this.f2981y--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        ensureIsMutable();
        if (i10 >= i6) {
            float[] fArr = this.f2980x;
            System.arraycopy(fArr, i10, fArr, i6, this.f2981y - i10);
            this.f2981y -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        return Float.valueOf(setFloat(i6, ((Float) obj).floatValue()));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float setFloat(int i6, float f3) {
        ensureIsMutable();
        a(i6);
        float[] fArr = this.f2980x;
        float f10 = fArr[i6];
        fArr[i6] = f3;
        return f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2981y;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.f2981y) {
            return new l1(Arrays.copyOf(this.f2980x, i6), this.f2981y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
