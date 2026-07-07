package gb;

import a8.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final int[] f5601x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5602y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5603z;

    public b(int i6, int i10, int[] iArr) {
        this.f5601x = iArr;
        this.f5602y = i6;
        this.f5603z = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (f.R(this.f5601x, ((Integer) obj).intValue(), this.f5602y, this.f5603z) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i6 = 0; i6 < size; i6++) {
                if (this.f5601x[this.f5602y + i6] != bVar.f5601x[bVar.f5602y + i6]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        jb.b.e(i6, size());
        return Integer.valueOf(this.f5601x[this.f5602y + i6]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = this.f5602y; i10 < this.f5603z; i10++) {
            i6 = (i6 * 31) + this.f5601x[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i6 = this.f5603z;
            int[] iArr = this.f5601x;
            int i10 = this.f5602y;
            int R = f.R(iArr, intValue, i10, i6);
            if (R >= 0) {
                return R - i10;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i6;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f5603z;
            while (true) {
                i10--;
                i6 = this.f5602y;
                if (i10 >= i6) {
                    if (this.f5601x[i10] == intValue) {
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        Integer num = (Integer) obj;
        jb.b.e(i6, size());
        int i10 = this.f5602y + i6;
        int[] iArr = this.f5601x;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5603z - this.f5602y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i6, int i10) {
        jb.b.h(i6, i10, size());
        if (i6 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f5602y;
        return new b(i6 + i11, i11 + i10, this.f5601x);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f5601x;
        int i6 = this.f5602y;
        sb2.append(iArr[i6]);
        while (true) {
            i6++;
            if (i6 < this.f5603z) {
                sb2.append(", ");
                sb2.append(iArr[i6]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
