package v;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements Cloneable {
    public /* synthetic */ int A;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f13175x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ int[] f13176y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object[] f13177z;

    public m(int i6) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f13176y = new int[i13];
        this.f13177z = new Object[i13];
    }

    public final void a(int i6, Object obj) {
        int i10 = this.A;
        if (i10 != 0 && i6 <= this.f13176y[i10 - 1]) {
            e(i6, obj);
            return;
        }
        if (this.f13175x && i10 >= this.f13176y.length) {
            j.a(this);
        }
        int i11 = this.A;
        if (i11 >= this.f13176y.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f13176y, i15);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
            this.f13176y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f13177z, i15);
            kotlin.jvm.internal.k.d(copyOf2, "copyOf(this, newSize)");
            this.f13177z = copyOf2;
        }
        this.f13176y[i11] = i6;
        this.f13177z[i11] = obj;
        this.A = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.k.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        m mVar = (m) clone;
        mVar.f13176y = (int[]) this.f13176y.clone();
        mVar.f13177z = (Object[]) this.f13177z.clone();
        return mVar;
    }

    public final Object c(int i6) {
        Object obj;
        int a10 = w.a.a(this.A, i6, this.f13176y);
        if (a10 >= 0 && (obj = this.f13177z[a10]) != j.f13164b) {
            return obj;
        }
        return null;
    }

    public final int d(int i6) {
        if (this.f13175x) {
            j.a(this);
        }
        return this.f13176y[i6];
    }

    public final void e(int i6, Object obj) {
        int a10 = w.a.a(this.A, i6, this.f13176y);
        if (a10 >= 0) {
            this.f13177z[a10] = obj;
            return;
        }
        int i10 = ~a10;
        int i11 = this.A;
        if (i10 < i11) {
            Object[] objArr = this.f13177z;
            if (objArr[i10] == j.f13164b) {
                this.f13176y[i10] = i6;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f13175x && i11 >= this.f13176y.length) {
            j.a(this);
            i10 = ~w.a.a(this.A, i6, this.f13176y);
        }
        int i12 = this.A;
        if (i12 >= this.f13176y.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f13176y, i16);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
            this.f13176y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f13177z, i16);
            kotlin.jvm.internal.k.d(copyOf2, "copyOf(this, newSize)");
            this.f13177z = copyOf2;
        }
        int i17 = this.A;
        if (i17 - i10 != 0) {
            int[] iArr = this.f13176y;
            int i18 = i10 + 1;
            ie.i.c0(i18, i10, i17, iArr, iArr);
            Object[] objArr2 = this.f13177z;
            ie.i.d0(i18, i10, this.A, objArr2, objArr2);
        }
        this.f13176y[i10] = i6;
        this.f13177z[i10] = obj;
        this.A++;
    }

    public final int f() {
        if (this.f13175x) {
            j.a(this);
        }
        return this.A;
    }

    public final Object g(int i6) {
        if (this.f13175x) {
            j.a(this);
        }
        return this.f13177z[i6];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.A * 28);
        sb2.append('{');
        int i6 = this.A;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object g10 = g(i10);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "buffer.toString()");
        return sb3;
    }
}
