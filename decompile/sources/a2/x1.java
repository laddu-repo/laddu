package a2;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x1 extends r1.d1 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f489n = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f490e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.c1 f491f;

    /* renamed from: g, reason: collision with root package name */
    public final int f492g;

    /* renamed from: h, reason: collision with root package name */
    public final int f493h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f494i;
    public final int[] j;

    /* renamed from: k, reason: collision with root package name */
    public final r1.d1[] f495k;

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f496l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f497m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x1(java.util.ArrayList r8, q2.c1 r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1.d1[] r0 = new r1.d1[r0]
            int r1 = r8.size()
            r2 = 0
            r3 = 0
            r4 = 0
        Ld:
            if (r4 >= r1) goto L21
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            a2.g1 r5 = (a2.g1) r5
            int r6 = r3 + 1
            r1.d1 r5 = r5.b()
            r0[r3] = r5
            r3 = r6
            goto Ld
        L21:
            int r1 = r8.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r8.size()
            r4 = 0
        L2c:
            if (r4 >= r3) goto L40
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            a2.g1 r5 = (a2.g1) r5
            int r6 = r2 + 1
            java.lang.Object r5 = r5.a()
            r1[r2] = r5
            r2 = r6
            goto L2c
        L40:
            r7.<init>(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.x1.<init>(java.util.ArrayList, q2.c1):void");
    }

    @Override // r1.d1
    public final int a(boolean z10) {
        if (this.f490e != 0) {
            int i6 = 0;
            if (z10) {
                int[] iArr = this.f491f.f10840b;
                if (iArr.length > 0) {
                    i6 = iArr[0];
                } else {
                    i6 = -1;
                }
            }
            do {
                r1.d1[] d1VarArr = this.f495k;
                if (d1VarArr[i6].p()) {
                    i6 = q(i6, z10);
                } else {
                    return d1VarArr[i6].a(z10) + this.j[i6];
                }
            } while (i6 != -1);
        }
        return -1;
    }

    @Override // r1.d1
    public final int b(Object obj) {
        int intValue;
        int b10;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f497m.get(obj2);
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue != -1 && (b10 = this.f495k[intValue].b(obj3)) != -1) {
                return this.f494i[intValue] + b10;
            }
        }
        return -1;
    }

    @Override // r1.d1
    public final int c(boolean z10) {
        int i6;
        int i10 = this.f490e;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = this.f491f.f10840b;
                if (iArr.length > 0) {
                    i6 = iArr[iArr.length - 1];
                } else {
                    i6 = -1;
                }
            } else {
                i6 = i10 - 1;
            }
            do {
                r1.d1[] d1VarArr = this.f495k;
                if (d1VarArr[i6].p()) {
                    i6 = r(i6, z10);
                } else {
                    return d1VarArr[i6].c(z10) + this.j[i6];
                }
            } while (i6 != -1);
        }
        return -1;
    }

    @Override // r1.d1
    public final int e(boolean z10, int i6, int i10) {
        int[] iArr = this.j;
        int i11 = 0;
        int d10 = u1.a0.d(iArr, i6 + 1, false, false);
        int i12 = iArr[d10];
        r1.d1[] d1VarArr = this.f495k;
        r1.d1 d1Var = d1VarArr[d10];
        int i13 = i6 - i12;
        if (i10 != 2) {
            i11 = i10;
        }
        int e10 = d1Var.e(z10, i13, i11);
        if (e10 != -1) {
            return i12 + e10;
        }
        int q9 = q(d10, z10);
        while (q9 != -1 && d1VarArr[q9].p()) {
            q9 = q(q9, z10);
        }
        if (q9 != -1) {
            return d1VarArr[q9].a(z10) + iArr[q9];
        }
        if (i10 != 2) {
            return -1;
        }
        return a(z10);
    }

    @Override // r1.d1
    public final r1.a1 f(int i6, r1.a1 a1Var, boolean z10) {
        int[] iArr = this.f494i;
        int d10 = u1.a0.d(iArr, i6 + 1, false, false);
        int i10 = this.j[d10];
        this.f495k[d10].f(i6 - iArr[d10], a1Var, z10);
        a1Var.f11297c += i10;
        if (z10) {
            Object obj = this.f496l[d10];
            Object obj2 = a1Var.f11296b;
            obj2.getClass();
            a1Var.f11296b = Pair.create(obj, obj2);
        }
        return a1Var;
    }

    @Override // r1.d1
    public final r1.a1 g(Object obj, r1.a1 a1Var) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f497m.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i6 = this.j[intValue];
        this.f495k[intValue].g(obj3, a1Var);
        a1Var.f11297c += i6;
        a1Var.f11296b = obj;
        return a1Var;
    }

    @Override // r1.d1
    public final int h() {
        return this.f493h;
    }

    @Override // r1.d1
    public final int k(boolean z10, int i6, int i10) {
        int[] iArr = this.j;
        int i11 = 0;
        int d10 = u1.a0.d(iArr, i6 + 1, false, false);
        int i12 = iArr[d10];
        r1.d1[] d1VarArr = this.f495k;
        r1.d1 d1Var = d1VarArr[d10];
        int i13 = i6 - i12;
        if (i10 != 2) {
            i11 = i10;
        }
        int k8 = d1Var.k(z10, i13, i11);
        if (k8 != -1) {
            return i12 + k8;
        }
        int r10 = r(d10, z10);
        while (r10 != -1 && d1VarArr[r10].p()) {
            r10 = r(r10, z10);
        }
        if (r10 != -1) {
            return d1VarArr[r10].c(z10) + iArr[r10];
        }
        if (i10 != 2) {
            return -1;
        }
        return c(z10);
    }

    @Override // r1.d1
    public final Object l(int i6) {
        int[] iArr = this.f494i;
        int d10 = u1.a0.d(iArr, i6 + 1, false, false);
        return Pair.create(this.f496l[d10], this.f495k[d10].l(i6 - iArr[d10]));
    }

    @Override // r1.d1
    public final r1.c1 m(int i6, r1.c1 c1Var, long j) {
        int[] iArr = this.j;
        int d10 = u1.a0.d(iArr, i6 + 1, false, false);
        int i10 = iArr[d10];
        int i11 = this.f494i[d10];
        this.f495k[d10].m(i6 - i10, c1Var, j);
        Object obj = this.f496l[d10];
        if (!r1.c1.f11318q.equals(c1Var.f11327a)) {
            obj = Pair.create(obj, c1Var.f11327a);
        }
        c1Var.f11327a = obj;
        c1Var.f11339n += i11;
        c1Var.f11340o += i11;
        return c1Var;
    }

    @Override // r1.d1
    public final int o() {
        return this.f492g;
    }

    public final int q(int i6, boolean z10) {
        if (z10) {
            q2.c1 c1Var = this.f491f;
            int i10 = c1Var.f10841c[i6] + 1;
            int[] iArr = c1Var.f10840b;
            if (i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }
        if (i6 >= this.f490e - 1) {
            return -1;
        }
        return i6 + 1;
    }

    public final int r(int i6, boolean z10) {
        if (z10) {
            q2.c1 c1Var = this.f491f;
            int i10 = c1Var.f10841c[i6] - 1;
            if (i10 < 0) {
                return -1;
            }
            return c1Var.f10840b[i10];
        }
        if (i6 <= 0) {
            return -1;
        }
        return i6 - 1;
    }

    public x1(r1.d1[] d1VarArr, Object[] objArr, q2.c1 c1Var) {
        this.f491f = c1Var;
        this.f490e = c1Var.f10840b.length;
        int length = d1VarArr.length;
        this.f495k = d1VarArr;
        this.f494i = new int[length];
        this.j = new int[length];
        this.f496l = objArr;
        this.f497m = new HashMap();
        int length2 = d1VarArr.length;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i6 < length2) {
            r1.d1 d1Var = d1VarArr[i6];
            this.f495k[i12] = d1Var;
            this.j[i12] = i10;
            this.f494i[i12] = i11;
            i10 += d1Var.o();
            i11 += this.f495k[i12].h();
            this.f497m.put(objArr[i12], Integer.valueOf(i12));
            i6++;
            i12++;
        }
        this.f492g = i10;
        this.f493h = i11;
    }
}
