package db;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p0 extends f0 implements Set {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f4027z = 0;

    /* renamed from: y, reason: collision with root package name */
    public transient k0 f4028y;

    public static int h(int i6) {
        int max = Math.max(i6, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        jb.b.d("collection too large", z10);
        return 1073741824;
    }

    public static p0 j(int i6, Object... objArr) {
        if (i6 != 0) {
            if (i6 != 1) {
                int h4 = h(i6);
                Object[] objArr2 = new Object[h4];
                int i10 = h4 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i6; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int s = r.s(hashCode);
                        while (true) {
                            int i14 = s & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            s++;
                        }
                    } else {
                        throw new NullPointerException(h8.c.i(i13, "at index "));
                    }
                }
                Arrays.fill(objArr, i12, i6, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new o1(obj3);
                }
                if (h(i12) < h4 / 2) {
                    return j(i12, objArr);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new i1(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o1(obj4);
        }
        return i1.G;
    }

    public static p0 k(Collection collection) {
        if ((collection instanceof p0) && !(collection instanceof SortedSet)) {
            p0 p0Var = (p0) collection;
            if (!p0Var.f()) {
                return p0Var;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static void m(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        boolean z10;
        if (objArr.length <= 2147483641) {
            z10 = true;
        } else {
            z10 = false;
        }
        jb.b.d("the total number of elements must fit in an int", z10);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        j(length, objArr2);
    }

    @Override // db.f0
    public k0 a() {
        k0 k0Var = this.f4028y;
        if (k0Var == null) {
            k0 l10 = l();
            this.f4028y = l10;
            return l10;
        }
        return k0Var;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p0) && (this instanceof i1) && (((p0) obj) instanceof i1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r.m(this);
    }

    public k0 l() {
        Object[] array = toArray(f0.f3998x);
        i0 i0Var = k0.f4008y;
        return k0.h(array.length, array);
    }
}
