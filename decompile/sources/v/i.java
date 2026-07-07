package v;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Cloneable {
    public /* synthetic */ int A;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f13160x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ long[] f13161y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object[] f13162z;

    public i(int i6) {
        if (i6 == 0) {
            this.f13161y = w.a.f13509b;
            this.f13162z = w.a.f13510c;
            return;
        }
        int i10 = i6 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f13161y = new long[i13];
        this.f13162z = new Object[i13];
    }

    public final void a(long j, Long l10) {
        int i6 = this.A;
        if (i6 != 0 && j <= this.f13161y[i6 - 1]) {
            h(j, l10);
            return;
        }
        if (this.f13160x) {
            long[] jArr = this.f13161y;
            if (i6 >= jArr.length) {
                Object[] objArr = this.f13162z;
                int i10 = 0;
                for (int i11 = 0; i11 < i6; i11++) {
                    Object obj = objArr[i11];
                    if (obj != j.f13163a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f13160x = false;
                this.A = i10;
            }
        }
        int i12 = this.A;
        if (i12 >= this.f13161y.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] copyOf = Arrays.copyOf(this.f13161y, i16);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
            this.f13161y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f13162z, i16);
            kotlin.jvm.internal.k.d(copyOf2, "copyOf(this, newSize)");
            this.f13162z = copyOf2;
        }
        this.f13161y[i12] = j;
        this.f13162z[i12] = l10;
        this.A = i12 + 1;
    }

    public final void b() {
        int i6 = this.A;
        Object[] objArr = this.f13162z;
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = null;
        }
        this.A = 0;
        this.f13160x = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.k.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        i iVar = (i) clone;
        iVar.f13161y = (long[]) this.f13161y.clone();
        iVar.f13162z = (Object[]) this.f13162z.clone();
        return iVar;
    }

    public final Object d(long j) {
        Object obj;
        int b10 = w.a.b(this.f13161y, this.A, j);
        if (b10 >= 0 && (obj = this.f13162z[b10]) != j.f13163a) {
            return obj;
        }
        return null;
    }

    public final Object e(long j) {
        Object obj;
        int b10 = w.a.b(this.f13161y, this.A, j);
        if (b10 < 0 || (obj = this.f13162z[b10]) == j.f13163a) {
            return -1L;
        }
        return obj;
    }

    public final int f(long j) {
        if (this.f13160x) {
            int i6 = this.A;
            long[] jArr = this.f13161y;
            Object[] objArr = this.f13162z;
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                Object obj = objArr[i11];
                if (obj != j.f13163a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f13160x = false;
            this.A = i10;
        }
        return w.a.b(this.f13161y, this.A, j);
    }

    public final long g(int i6) {
        int i10;
        if (i6 >= 0 && i6 < (i10 = this.A)) {
            if (this.f13160x) {
                long[] jArr = this.f13161y;
                Object[] objArr = this.f13162z;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != j.f13163a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f13160x = false;
                this.A = i11;
            }
            return this.f13161y[i6];
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final void h(long j, Object obj) {
        Object obj2 = j.f13163a;
        int b10 = w.a.b(this.f13161y, this.A, j);
        if (b10 >= 0) {
            this.f13162z[b10] = obj;
            return;
        }
        int i6 = ~b10;
        int i10 = this.A;
        if (i6 < i10) {
            Object[] objArr = this.f13162z;
            if (objArr[i6] == obj2) {
                this.f13161y[i6] = j;
                objArr[i6] = obj;
                return;
            }
        }
        if (this.f13160x) {
            long[] jArr = this.f13161y;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f13162z;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f13160x = false;
                this.A = i11;
                i6 = ~w.a.b(this.f13161y, i11, j);
            }
        }
        int i13 = this.A;
        if (i13 >= this.f13161y.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f13161y, i17);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
            this.f13161y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f13162z, i17);
            kotlin.jvm.internal.k.d(copyOf2, "copyOf(this, newSize)");
            this.f13162z = copyOf2;
        }
        int i18 = this.A - i6;
        if (i18 != 0) {
            long[] jArr2 = this.f13161y;
            int i19 = i6 + 1;
            kotlin.jvm.internal.k.e(jArr2, "<this>");
            System.arraycopy(jArr2, i6, jArr2, i19, i18);
            Object[] objArr3 = this.f13162z;
            ie.i.d0(i19, i6, this.A, objArr3, objArr3);
        }
        this.f13161y[i6] = j;
        this.f13162z[i6] = obj;
        this.A++;
    }

    public final int i() {
        if (this.f13160x) {
            int i6 = this.A;
            long[] jArr = this.f13161y;
            Object[] objArr = this.f13162z;
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                Object obj = objArr[i11];
                if (obj != j.f13163a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f13160x = false;
            this.A = i10;
        }
        return this.A;
    }

    public final Object j(int i6) {
        int i10;
        if (i6 >= 0 && i6 < (i10 = this.A)) {
            if (this.f13160x) {
                long[] jArr = this.f13161y;
                Object[] objArr = this.f13162z;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != j.f13163a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f13160x = false;
                this.A = i11;
            }
            return this.f13162z[i6];
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.A * 28);
        sb2.append('{');
        int i6 = this.A;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
            sb2.append('=');
            Object j = j(i10);
            if (j != sb2) {
                sb2.append(j);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public i() {
        this(10);
    }
}
