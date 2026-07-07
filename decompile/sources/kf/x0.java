package kf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class x0 extends lf.b implements q0, h, lf.r {
    public final int B;
    public final int C;
    public final jf.a D;
    public Object[] E;
    public long F;
    public long G;
    public int H;
    public int I;

    public x0(int i6, int i10, jf.a aVar) {
        this.B = i6;
        this.C = i10;
        this.D = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:38|39|(3:41|42|43)(1:44))(4:18|(1:23)|32|(2:34|35)(1:36))|37))(4:50|51|52|53)|29|30)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|37)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        throw r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(kf.x0 r8, kf.i r9, le.c r10) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.x0.h(kf.x0, kf.i, le.c):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lf.d, java.lang.Object, kf.z0] */
    @Override // lf.b
    public final lf.d b() {
        ?? obj = new Object();
        obj.f8042a = -1L;
        return obj;
    }

    @Override // lf.b
    public final lf.d[] c() {
        return new z0[2];
    }

    @Override // kf.h
    public final Object collect(i iVar, le.c cVar) {
        h(this, iVar, cVar);
        return me.a.f8833x;
    }

    @Override // kf.q0, kf.i
    public final Object emit(Object obj, le.c cVar) {
        Throwable th;
        le.c[] k8;
        v0 v0Var;
        if (m(obj)) {
            return he.y.f6101a;
        }
        gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        le.c[] cVarArr = lf.c.f8362a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        kVar.resumeWith(he.y.f6101a);
                        k8 = k(cVarArr);
                        v0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        v0 v0Var2 = new v0(this, n() + this.H + this.I, obj, kVar);
                        j(v0Var2);
                        this.I++;
                        if (this.C == 0) {
                            cVarArr = k(cVarArr);
                        }
                        k8 = cVarArr;
                        v0Var = v0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (v0Var != null) {
                    kVar.v(new gf.h(v0Var, 2));
                }
                for (le.c cVar2 : k8) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(he.y.f6101a);
                    }
                }
                Object r10 = kVar.r();
                me.a aVar = me.a.f8833x;
                if (r10 != aVar) {
                    r10 = he.y.f6101a;
                }
                if (r10 == aVar) {
                    return r10;
                }
                return he.y.f6101a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object f(z0 z0Var, w0 w0Var) {
        gf.k kVar = new gf.k(1, a8.c.i(w0Var));
        kVar.s();
        synchronized (this) {
            try {
                if (q(z0Var) < 0) {
                    z0Var.f8043b = kVar;
                } else {
                    kVar.resumeWith(he.y.f6101a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object r10 = kVar.r();
        if (r10 == me.a.f8833x) {
            return r10;
        }
        return he.y.f6101a;
    }

    public final void g() {
        if (this.C != 0 || this.I > 1) {
            Object[] objArr = this.E;
            kotlin.jvm.internal.k.b(objArr);
            while (this.I > 0) {
                long n10 = n();
                int i6 = this.H;
                int i10 = this.I;
                if (objArr[(objArr.length - 1) & ((int) ((n10 + (i6 + i10)) - 1))] == y0.f8036a) {
                    this.I = i10 - 1;
                    y0.f(objArr, n() + this.H + this.I, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void i() {
        lf.d[] dVarArr;
        Object[] objArr = this.E;
        kotlin.jvm.internal.k.b(objArr);
        y0.f(objArr, n(), null);
        this.H--;
        long n10 = n() + 1;
        if (this.F < n10) {
            this.F = n10;
        }
        if (this.G < n10) {
            if (this.f8360y != 0 && (dVarArr = this.f8359x) != null) {
                for (lf.d dVar : dVarArr) {
                    if (dVar != null) {
                        z0 z0Var = (z0) dVar;
                        long j = z0Var.f8042a;
                        if (j >= 0 && j < n10) {
                            z0Var.f8042a = n10;
                        }
                    }
                }
            }
            this.G = n10;
        }
    }

    public final void j(Object obj) {
        int i6 = this.H + this.I;
        Object[] objArr = this.E;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i6 >= objArr.length) {
            objArr = o(objArr, i6, objArr.length * 2);
        }
        y0.f(objArr, n() + i6, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final le.c[] k(le.c[] cVarArr) {
        lf.d[] dVarArr;
        z0 z0Var;
        gf.k kVar;
        int length = cVarArr.length;
        if (this.f8360y != 0 && (dVarArr = this.f8359x) != null) {
            int length2 = dVarArr.length;
            int i6 = 0;
            cVarArr = cVarArr;
            while (i6 < length2) {
                lf.d dVar = dVarArr[i6];
                if (dVar != null && (kVar = (z0Var = (z0) dVar).f8043b) != null && q(z0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = kVar;
                    z0Var.f8043b = null;
                    length++;
                }
                i6++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    @Override // kf.q0
    public final void l() {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                t(n() + this.H, this.G, n() + this.H, n() + this.H + this.I);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // kf.q0
    public final boolean m(Object obj) {
        int i6;
        boolean z10;
        le.c[] cVarArr = lf.c.f8362a;
        synchronized (this) {
            if (p(obj)) {
                cVarArr = k(cVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (le.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(he.y.f6101a);
            }
        }
        return z10;
    }

    public final long n() {
        return Math.min(this.G, this.F);
    }

    public final Object[] o(Object[] objArr, int i6, int i10) {
        if (i10 > 0) {
            Object[] objArr2 = new Object[i10];
            this.E = objArr2;
            if (objArr != null) {
                long n10 = n();
                for (int i11 = 0; i11 < i6; i11++) {
                    long j = i11 + n10;
                    y0.f(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r1 != 2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f8360y
            int r2 = r12.B
            r9 = 1
            if (r1 != 0) goto L22
            if (r2 != 0) goto La
            goto L76
        La:
            r12.j(r13)
            int r1 = r12.H
            int r1 = r1 + r9
            r12.H = r1
            if (r1 <= r2) goto L17
            r12.i()
        L17:
            long r1 = r12.n()
            int r3 = r12.H
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.G = r1
            return r9
        L22:
            int r1 = r12.H
            int r3 = r12.C
            if (r1 < r3) goto L3e
            long r4 = r12.G
            long r6 = r12.F
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L3e
            jf.a r1 = r12.D
            int r1 = r1.ordinal()
            if (r1 == 0) goto L3c
            r4 = 2
            if (r1 == r4) goto L76
            goto L3e
        L3c:
            r1 = 0
            return r1
        L3e:
            r12.j(r13)
            int r1 = r12.H
            int r1 = r1 + r9
            r12.H = r1
            if (r1 <= r3) goto L4b
            r12.i()
        L4b:
            long r3 = r12.n()
            int r1 = r12.H
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.F
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L76
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.G
            long r5 = r12.n()
            int r7 = r12.H
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.n()
            int r10 = r12.H
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.I
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.t(r1, r3, r5, r7)
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.x0.p(java.lang.Object):boolean");
    }

    public final long q(z0 z0Var) {
        long j = z0Var.f8042a;
        if (j >= n() + this.H) {
            if (this.C > 0 || j > n() || this.I == 0) {
                return -1L;
            }
            return j;
        }
        return j;
    }

    @Override // lf.r
    public final h r(le.h hVar, int i6, jf.a aVar) {
        return y0.o(this, hVar, i6, aVar);
    }

    public final Object s(z0 z0Var) {
        Object obj;
        le.c[] cVarArr = lf.c.f8362a;
        synchronized (this) {
            try {
                long q9 = q(z0Var);
                if (q9 < 0) {
                    obj = y0.f8036a;
                } else {
                    long j = z0Var.f8042a;
                    Object[] objArr = this.E;
                    kotlin.jvm.internal.k.b(objArr);
                    Object obj2 = objArr[((int) q9) & (objArr.length - 1)];
                    if (obj2 instanceof v0) {
                        obj2 = ((v0) obj2).f8023z;
                    }
                    z0Var.f8042a = q9 + 1;
                    Object obj3 = obj2;
                    cVarArr = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (le.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(he.y.f6101a);
            }
        }
        return obj;
    }

    public final void t(long j, long j10, long j11, long j12) {
        long min = Math.min(j10, j);
        for (long n10 = n(); n10 < min; n10++) {
            Object[] objArr = this.E;
            kotlin.jvm.internal.k.b(objArr);
            y0.f(objArr, n10, null);
        }
        this.F = j;
        this.G = j10;
        this.H = (int) (j11 - min);
        this.I = (int) (j12 - j11);
    }

    public final le.c[] u(long j) {
        int i6;
        long j10;
        long j11;
        long j12;
        le.c[] cVarArr;
        long j13;
        le.c[] cVarArr2;
        lf.d[] dVarArr;
        h5.a aVar = y0.f8036a;
        le.c[] cVarArr3 = lf.c.f8362a;
        if (j <= this.G) {
            long n10 = n();
            long j14 = this.H + n10;
            int i10 = this.C;
            if (i10 == 0 && this.I > 0) {
                j14++;
            }
            int i11 = 0;
            if (this.f8360y != 0 && (dVarArr = this.f8359x) != null) {
                for (lf.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j15 = ((z0) dVar).f8042a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.G) {
                long n11 = n() + this.H;
                if (this.f8360y > 0) {
                    i6 = Math.min(this.I, i10 - ((int) (n11 - j14)));
                } else {
                    i6 = this.I;
                }
                long j16 = this.I + n11;
                if (i6 > 0) {
                    j12 = 1;
                    Object[] objArr = this.E;
                    kotlin.jvm.internal.k.b(objArr);
                    j10 = n10;
                    le.c[] cVarArr4 = new le.c[i6];
                    long j17 = n11;
                    while (true) {
                        if (n11 < j16) {
                            cVarArr2 = cVarArr4;
                            Object obj = objArr[(objArr.length - 1) & ((int) n11)];
                            if (obj != aVar) {
                                kotlin.jvm.internal.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                                v0 v0Var = (v0) obj;
                                int i12 = i11 + 1;
                                j11 = j14;
                                cVarArr2[i11] = v0Var.A;
                                y0.f(objArr, n11, aVar);
                                y0.f(objArr, j17, v0Var.f8023z);
                                j17++;
                                if (i12 >= i6) {
                                    break;
                                }
                                i11 = i12;
                            } else {
                                j11 = j14;
                            }
                            n11++;
                            cVarArr4 = cVarArr2;
                            j14 = j11;
                        } else {
                            cVarArr2 = cVarArr4;
                            j11 = j14;
                            break;
                        }
                    }
                    n11 = j17;
                    cVarArr = cVarArr2;
                } else {
                    j10 = n10;
                    j11 = j14;
                    j12 = 1;
                    cVarArr = cVarArr3;
                }
                int i13 = (int) (n11 - j10);
                if (this.f8360y == 0) {
                    j13 = n11;
                } else {
                    j13 = j11;
                }
                long max = Math.max(this.F, n11 - Math.min(this.B, i13));
                if (i10 == 0 && max < j16) {
                    Object[] objArr2 = this.E;
                    kotlin.jvm.internal.k.b(objArr2);
                    if (kotlin.jvm.internal.k.a(objArr2[((int) max) & (objArr2.length - 1)], aVar)) {
                        n11 += j12;
                        max += j12;
                    }
                }
                t(max, j13, n11, j16);
                g();
                if (cVarArr.length == 0) {
                    return cVarArr;
                }
                return k(cVarArr);
            }
        }
        return cVarArr3;
    }
}
