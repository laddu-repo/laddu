package af;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a implements Iterable, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final int f709x;

    /* renamed from: y, reason: collision with root package name */
    public final int f710y;

    /* renamed from: z, reason: collision with root package name */
    public final int f711z;

    public a(int i6, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f709x = i6;
                this.f710y = a.a.l(i6, i10, i11);
                this.f711z = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f709x == aVar.f709x && this.f710y == aVar.f710y && this.f711z == aVar.f711z) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f709x * 31) + this.f710y) * 31) + this.f711z;
    }

    public boolean isEmpty() {
        int i6 = this.f711z;
        int i10 = this.f710y;
        int i11 = this.f709x;
        if (i6 > 0) {
            if (i11 <= i10) {
                return false;
            }
            return true;
        }
        if (i11 >= i10) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f709x, this.f710y, this.f711z);
    }

    public String toString() {
        StringBuilder sb2;
        int i6 = this.f710y;
        int i10 = this.f709x;
        int i11 = this.f711z;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i6);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i6);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
