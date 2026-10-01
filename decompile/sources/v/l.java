package v;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: x, reason: collision with root package name */
    public int[] f13172x;

    /* renamed from: y, reason: collision with root package name */
    public Object[] f13173y;

    /* renamed from: z, reason: collision with root package name */
    public int f13174z;

    public l(int i6) {
        int[] iArr;
        Object[] objArr;
        if (i6 == 0) {
            iArr = w.a.f13508a;
        } else {
            iArr = new int[i6];
        }
        this.f13172x = iArr;
        if (i6 == 0) {
            objArr = w.a.f13510c;
        } else {
            objArr = new Object[i6 << 1];
        }
        this.f13173y = objArr;
    }

    public final int a(Object obj) {
        int i6 = this.f13174z * 2;
        Object[] objArr = this.f13173y;
        if (obj == null) {
            for (int i10 = 1; i10 < i6; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i6; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i6) {
        int i10 = this.f13174z;
        int[] iArr = this.f13172x;
        if (iArr.length < i6) {
            int[] copyOf = Arrays.copyOf(iArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
            this.f13172x = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f13173y, i6 * 2);
            kotlin.jvm.internal.k.d(copyOf2, "copyOf(this, newSize)");
            this.f13173y = copyOf2;
        }
        if (this.f13174z == i10) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i6, Object obj) {
        int i10 = this.f13174z;
        if (i10 == 0) {
            return -1;
        }
        int a10 = w.a.a(i10, i6, this.f13172x);
        if (a10 < 0 || kotlin.jvm.internal.k.a(obj, this.f13173y[a10 << 1])) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f13172x[i11] == i6) {
            if (kotlin.jvm.internal.k.a(obj, this.f13173y[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f13172x[i12] == i6; i12--) {
            if (kotlin.jvm.internal.k.a(obj, this.f13173y[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f13174z > 0) {
            this.f13172x = w.a.f13508a;
            this.f13173y = w.a.f13510c;
            this.f13174z = 0;
        }
        if (this.f13174z <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i6 = this.f13174z;
        if (i6 == 0) {
            return -1;
        }
        int a10 = w.a.a(i6, 0, this.f13172x);
        if (a10 < 0 || this.f13173y[a10 << 1] == null) {
            return a10;
        }
        int i10 = a10 + 1;
        while (i10 < i6 && this.f13172x[i10] == 0) {
            if (this.f13173y[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a10 - 1; i11 >= 0 && this.f13172x[i11] == 0; i11--) {
            if (this.f13173y[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof l) {
                int i6 = this.f13174z;
                if (i6 != ((l) obj).f13174z) {
                    return false;
                }
                l lVar = (l) obj;
                for (int i10 = 0; i10 < i6; i10++) {
                    Object f3 = f(i10);
                    Object i11 = i(i10);
                    Object obj2 = lVar.get(f3);
                    if (i11 == null) {
                        if (obj2 != null || !lVar.containsKey(f3)) {
                            return false;
                        }
                    } else if (!i11.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f13174z != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f13174z;
            for (int i13 = 0; i13 < i12; i13++) {
                Object f10 = f(i13);
                Object i14 = i(i13);
                Object obj3 = ((Map) obj).get(f10);
                if (i14 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f10)) {
                        return false;
                    }
                } else if (!i14.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i6) {
        if (i6 >= 0 && i6 < this.f13174z) {
            return this.f13173y[i6 << 1];
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object g(int i6) {
        int i10;
        if (i6 >= 0 && i6 < (i10 = this.f13174z)) {
            Object[] objArr = this.f13173y;
            int i11 = i6 << 1;
            Object obj = objArr[i11 + 1];
            if (i10 <= 1) {
                clear();
                return obj;
            }
            int i12 = i10 - 1;
            int[] iArr = this.f13172x;
            int i13 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i13 = i10 + (i10 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i13);
                kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
                this.f13172x = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f13173y, i13 << 1);
                kotlin.jvm.internal.k.d(copyOf2, "copyOf(this, newSize)");
                this.f13173y = copyOf2;
                if (i10 == this.f13174z) {
                    if (i6 > 0) {
                        ie.i.c0(0, 0, i6, iArr, this.f13172x);
                        ie.i.d0(0, 0, i11, objArr, this.f13173y);
                    }
                    if (i6 < i12) {
                        int i14 = i6 + 1;
                        ie.i.c0(i6, i14, i10, iArr, this.f13172x);
                        ie.i.d0(i11, i14 << 1, i10 << 1, objArr, this.f13173y);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i6 < i12) {
                    int i15 = i6 + 1;
                    ie.i.c0(i6, i15, i10, iArr, iArr);
                    Object[] objArr2 = this.f13173y;
                    ie.i.d0(i11, i15 << 1, i10 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f13173y;
                int i16 = i12 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            }
            if (i10 == this.f13174z) {
                this.f13174z = i12;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object get(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f13173y[(d10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f13173y[(d10 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i6, Object obj) {
        if (i6 >= 0 && i6 < this.f13174z) {
            int i10 = (i6 << 1) + 1;
            Object[] objArr = this.f13173y;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int hashCode() {
        int i6;
        int[] iArr = this.f13172x;
        Object[] objArr = this.f13173y;
        int i10 = this.f13174z;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj != null) {
                i6 = obj.hashCode();
            } else {
                i6 = 0;
            }
            i13 += i6 ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final Object i(int i6) {
        if (i6 >= 0 && i6 < this.f13174z) {
            return this.f13173y[(i6 << 1) + 1];
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean isEmpty() {
        if (this.f13174z <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i6;
        int e10;
        int i10 = this.f13174z;
        if (obj != null) {
            i6 = obj.hashCode();
        } else {
            i6 = 0;
        }
        if (obj != null) {
            e10 = c(i6, obj);
        } else {
            e10 = e();
        }
        if (e10 >= 0) {
            int i11 = (e10 << 1) + 1;
            Object[] objArr = this.f13173y;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~e10;
        int[] iArr = this.f13172x;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
            this.f13172x = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f13173y, i13 << 1);
            kotlin.jvm.internal.k.d(copyOf2, "copyOf(this, newSize)");
            this.f13173y = copyOf2;
            if (i10 != this.f13174z) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f13172x;
            int i14 = i12 + 1;
            ie.i.c0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f13173y;
            ie.i.d0(i14 << 1, i12 << 1, this.f13174z << 1, objArr2, objArr2);
        }
        int i15 = this.f13174z;
        if (i10 == i15) {
            int[] iArr3 = this.f13172x;
            if (i12 < iArr3.length) {
                iArr3[i12] = i6;
                Object[] objArr3 = this.f13173y;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f13174z = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return g(d10);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return h(d10, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f13174z;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13174z * 28);
        sb2.append('{');
        int i6 = this.f13174z;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object f3 = f(i10);
            if (f3 != sb2) {
                sb2.append(f3);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != sb2) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 < 0 || !kotlin.jvm.internal.k.a(obj2, i(d10))) {
            return false;
        }
        g(d10);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d10 = d(obj);
        if (d10 < 0 || !kotlin.jvm.internal.k.a(obj2, i(d10))) {
            return false;
        }
        h(d10, obj3);
        return true;
    }
}
