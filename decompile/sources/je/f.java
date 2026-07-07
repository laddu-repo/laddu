package je;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Map, Serializable, we.d {
    public static final f K;
    public int[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public g G;
    public h H;
    public g I;
    public boolean J;

    /* renamed from: x, reason: collision with root package name */
    public Object[] f7428x;

    /* renamed from: y, reason: collision with root package name */
    public Object[] f7429y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f7430z;

    static {
        f fVar = new f(0);
        fVar.J = true;
        K = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j = j(obj);
            int i6 = this.B * 2;
            int length = this.A.length / 2;
            if (i6 > length) {
                i6 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.A;
                int i11 = iArr[j];
                if (i11 <= 0) {
                    int i12 = this.C;
                    Object[] objArr = this.f7428x;
                    if (i12 >= objArr.length) {
                        g(1);
                    } else {
                        int i13 = i12 + 1;
                        this.C = i13;
                        objArr[i12] = obj;
                        this.f7430z[i12] = j;
                        iArr[j] = i13;
                        this.F++;
                        this.E++;
                        if (i10 > this.B) {
                            this.B = i10;
                        }
                        return i12;
                    }
                } else {
                    if (k.a(this.f7428x[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i6) {
                        k(this.A.length * 2);
                        break;
                    }
                    int i14 = j - 1;
                    if (j == 0) {
                        j = this.A.length - 1;
                    } else {
                        j = i14;
                    }
                }
            }
        }
    }

    public final f b() {
        c();
        this.J = true;
        if (this.F > 0) {
            return this;
        }
        f fVar = K;
        k.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (!this.J) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i6 = this.C - 1;
        if (i6 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f7430z;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.A[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i6) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        s1.c.u(this.f7428x, 0, this.C);
        Object[] objArr = this.f7429y;
        if (objArr != null) {
            s1.c.u(objArr, 0, this.C);
        }
        this.F = 0;
        this.C = 0;
        this.E++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (i(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void d(boolean z10) {
        int i6;
        Object[] objArr = this.f7429y;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = this.C;
            if (i10 >= i6) {
                break;
            }
            int[] iArr = this.f7430z;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f7428x;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z10) {
                    iArr[i11] = i12;
                    this.A[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        s1.c.u(this.f7428x, i11, i6);
        if (objArr != null) {
            s1.c.u(objArr, i11, this.C);
        }
        this.C = i11;
    }

    public final boolean e(Collection m9) {
        k.e(m9, "m");
        for (Object obj : m9) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.I;
        if (gVar == null) {
            g gVar2 = new g(this, 0);
            this.I = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.F != map.size() || !e(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        k.e(entry, "entry");
        int h4 = h(entry.getKey());
        if (h4 < 0) {
            return false;
        }
        Object[] objArr = this.f7429y;
        k.b(objArr);
        return k.a(objArr[h4], entry.getValue());
    }

    public final void g(int i6) {
        Object[] objArr;
        Object[] objArr2 = this.f7428x;
        int length = objArr2.length;
        int i10 = this.C;
        int i11 = length - i10;
        int i12 = i10 - this.F;
        int i13 = 1;
        if (i11 < i6 && i11 + i12 >= i6 && i12 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i14 = i10 + i6;
        if (i14 >= 0) {
            if (i14 > objArr2.length) {
                int length2 = objArr2.length;
                int i15 = length2 + (length2 >> 1);
                if (i15 - i14 < 0) {
                    i15 = i14;
                }
                if (i15 - 2147483639 > 0) {
                    if (i14 > 2147483639) {
                        i15 = Integer.MAX_VALUE;
                    } else {
                        i15 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i15);
                k.d(copyOf, "copyOf(...)");
                this.f7428x = copyOf;
                Object[] objArr3 = this.f7429y;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i15);
                    k.d(objArr, "copyOf(...)");
                } else {
                    objArr = null;
                }
                this.f7429y = objArr;
                int[] copyOf2 = Arrays.copyOf(this.f7430z, i15);
                k.d(copyOf2, "copyOf(...)");
                this.f7430z = copyOf2;
                if (i15 >= 1) {
                    i13 = i15;
                }
                int highestOneBit = Integer.highestOneBit(i13 * 3);
                if (highestOneBit > this.A.length) {
                    k(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h4 = h(obj);
        if (h4 < 0) {
            return null;
        }
        Object[] objArr = this.f7429y;
        k.b(objArr);
        return objArr[h4];
    }

    public final int h(Object obj) {
        int j = j(obj);
        int i6 = this.B;
        while (true) {
            int i10 = this.A[j];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (k.a(this.f7428x[i11], obj)) {
                    return i11;
                }
            }
            i6--;
            if (i6 < 0) {
                return -1;
            }
            int i12 = j - 1;
            if (j == 0) {
                j = this.A.length - 1;
            } else {
                j = i12;
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i6;
        int i10;
        d dVar = new d(this, 0);
        int i11 = 0;
        while (dVar.hasNext()) {
            int i12 = dVar.f4630x;
            f fVar = (f) dVar.A;
            if (i12 < fVar.C) {
                dVar.f4630x = i12 + 1;
                dVar.f4631y = i12;
                Object obj = fVar.f7428x[i12];
                if (obj != null) {
                    i6 = obj.hashCode();
                } else {
                    i6 = 0;
                }
                Object[] objArr = fVar.f7429y;
                k.b(objArr);
                Object obj2 = objArr[dVar.f4631y];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                } else {
                    i10 = 0;
                }
                dVar.e();
                i11 += i6 ^ i10;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i11;
    }

    public final int i(Object obj) {
        int i6 = this.C;
        while (true) {
            i6--;
            if (i6 < 0) {
                return -1;
            }
            if (this.f7430z[i6] >= 0) {
                Object[] objArr = this.f7429y;
                k.b(objArr);
                if (k.a(objArr[i6], obj)) {
                    return i6;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.F == 0) {
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        int i6;
        if (obj != null) {
            i6 = obj.hashCode();
        } else {
            i6 = 0;
        }
        return (i6 * (-1640531527)) >>> this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f7430z[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.E
            int r0 = r0 + 1
            r5.E = r0
            int r0 = r5.C
            int r1 = r5.F
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.A = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.D = r6
        L1c:
            int r6 = r5.C
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f7428x
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.B
        L2c:
            int[] r3 = r5.A
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f7430z
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.G;
        if (gVar == null) {
            g gVar2 = new g(this, 1);
            this.G = gVar2;
            return gVar2;
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f7428x
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.k.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f7429y
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f7430z
            r0 = r0[r12]
            int r1 = r11.B
            int r1 = r1 * 2
            int[] r2 = r11.A
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.A
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.B
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.A
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.A
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = 0
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f7428x
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.A
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f7430z
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.A
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f7430z
            r0[r12] = r6
            int r12 = r11.F
            int r12 = r12 + r6
            r11.F = r12
            int r12 = r11.E
            int r12 = r12 + 1
            r11.E = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.f.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a10 = a(obj);
        Object[] objArr = this.f7429y;
        if (objArr == null) {
            int length = this.f7428x.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f7429y = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        if (a10 < 0) {
            int i6 = (-a10) - 1;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        objArr[a10] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        k.e(from, "from");
        c();
        Set<Map.Entry> entrySet = from.entrySet();
        if (!entrySet.isEmpty()) {
            g(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a10 = a(entry.getKey());
                Object[] objArr = this.f7429y;
                if (objArr == null) {
                    int length = this.f7428x.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f7429y = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.");
                    }
                }
                if (a10 >= 0) {
                    objArr[a10] = entry.getValue();
                } else {
                    int i6 = (-a10) - 1;
                    if (!k.a(entry.getValue(), objArr[i6])) {
                        objArr[i6] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h4 = h(obj);
        if (h4 < 0) {
            return null;
        }
        Object[] objArr = this.f7429y;
        k.b(objArr);
        Object obj2 = objArr[h4];
        l(h4);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.F;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.F * 3) + 2);
        sb2.append("{");
        int i6 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i6 > 0) {
                sb2.append(", ");
            }
            int i10 = dVar.f4630x;
            f fVar = (f) dVar.A;
            if (i10 < fVar.C) {
                dVar.f4630x = i10 + 1;
                dVar.f4631y = i10;
                Object obj = fVar.f7428x[i10];
                if (obj == fVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = fVar.f7429y;
                k.b(objArr);
                Object obj2 = objArr[dVar.f4631y];
                if (obj2 == fVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                dVar.e();
                i6++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        k.d(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.H;
        if (hVar == null) {
            h hVar2 = new h(this);
            this.H = hVar2;
            return hVar2;
        }
        return hVar;
    }

    public f(int i6) {
        if (i6 >= 0) {
            Object[] objArr = new Object[i6];
            int[] iArr = new int[i6];
            int highestOneBit = Integer.highestOneBit((i6 < 1 ? 1 : i6) * 3);
            this.f7428x = objArr;
            this.f7429y = null;
            this.f7430z = iArr;
            this.A = new int[highestOneBit];
            this.B = 2;
            this.C = 0;
            this.D = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
