package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a */
    public static final h5.a f8036a = new h5.a("NO_VALUE", 1);

    /* renamed from: b */
    public static final h5.a f8037b = new h5.a("NONE", 1);

    /* renamed from: c */
    public static final h5.a f8038c = new h5.a("PENDING", 1);

    public static final x0 a(int i6, int i10, jf.a aVar) {
        if (i6 >= 0) {
            if (i10 >= 0) {
                if (i6 <= 0 && i10 <= 0 && aVar != jf.a.f7436x) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
                }
                int i11 = i10 + i6;
                if (i11 < 0) {
                    i11 = Integer.MAX_VALUE;
                }
                return new x0(i6, i11, aVar);
            }
            throw new IllegalArgumentException(h8.c.i(i10, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        throw new IllegalArgumentException(h8.c.i(i6, "replay cannot be negative, but was ").toString());
    }

    public static /* synthetic */ x0 b(int i6, int i10) {
        jf.a aVar;
        int i11 = 0;
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        if ((i10 & 2) == 0) {
            i11 = 64;
        }
        if ((i10 & 4) != 0) {
            aVar = jf.a.f7436x;
        } else {
            aVar = jf.a.f7437y;
        }
        return a(i6, i11, aVar);
    }

    public static final f1 c(Object obj) {
        if (obj == null) {
            obj = lf.c.f8363b;
        }
        return new f1(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(kf.i r4, java.lang.Object r5, java.lang.Object r6, ne.c r7) {
        /*
            boolean r0 = r7 instanceof kf.a0
            if (r0 == 0) goto L13
            r0 = r7
            kf.a0 r0 = (kf.a0) r0
            int r1 = r0.f7916z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7916z = r1
            goto L18
        L13:
            kf.a0 r0 = new kf.a0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7915y
            int r1 = r0.f7916z
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            java.lang.Object r6 = r0.f7914x
            he.a.f(r7)
            goto L3f
        L2f:
            he.a.f(r7)
            r0.f7914x = r6
            r0.f7916z = r2
            java.lang.Object r4 = r4.emit(r5, r0)
            me.a r5 = me.a.f8833x
            if (r4 != r5) goto L3f
            return
        L3f:
            lf.a r4 = new lf.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.d(kf.i, java.lang.Object, java.lang.Object, ne.c):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(kf.k1 r4, ve.q r5, java.lang.Throwable r6, ne.c r7) {
        /*
            boolean r0 = r7 instanceof kf.q
            if (r0 == 0) goto L13
            r0 = r7
            kf.q r0 = (kf.q) r0
            int r1 = r0.f8004z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8004z = r1
            goto L18
        L13:
            kf.q r0 = new kf.q
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8003y
            int r1 = r0.f8004z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.f8002x
            he.a.f(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r4 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            he.a.f(r7)
            r0.f8002x = r6     // Catch: java.lang.Throwable -> L27
            r0.f8004z = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            me.a r5 = me.a.f8833x
            if (r4 != r5) goto L41
            return r5
        L41:
            he.y r4 = he.y.f6101a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            he.a.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.e(kf.k1, ve.q, java.lang.Throwable, ne.c):java.lang.Object");
    }

    public static final void f(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }

    public static h g(h hVar, int i6) {
        jf.a aVar;
        int i10;
        if (i6 < 0 && i6 != -2 && i6 != -1) {
            throw new IllegalArgumentException(h8.c.i(i6, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i6 == -1) {
            aVar = jf.a.f7437y;
            i10 = 0;
        } else {
            aVar = jf.a.f7436x;
            i10 = i6;
        }
        jf.a aVar2 = aVar;
        if (hVar instanceof lf.r) {
            return lf.c.a((lf.r) hVar, null, i10, aVar2, 1);
        }
        return new lf.g(hVar, null, i10, aVar2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable h(kf.h r4, kf.i r5, ne.c r6) {
        /*
            boolean r0 = r6 instanceof kf.w
            if (r0 == 0) goto L13
            r0 = r6
            kf.w r0 = (kf.w) r0
            int r1 = r0.f8026z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8026z = r1
            goto L18
        L13:
            kf.w r0 = new kf.w
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8025y
            int r1 = r0.f8026z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.jvm.internal.w r4 = r0.f8024x
            he.a.f(r6)     // Catch: java.lang.Throwable -> L27
            goto L4b
        L27:
            r5 = move-exception
            goto L4f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            he.a.f(r6)
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            kf.f r1 = new kf.f     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f8024x = r6     // Catch: java.lang.Throwable -> L4d
            r0.f8026z = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.collect(r1, r0)     // Catch: java.lang.Throwable -> L4d
            me.a r5 = me.a.f8833x
            if (r4 != r5) goto L4b
            return r5
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f8055x
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7d
        L5b:
            le.h r6 = r0.getContext()
            gf.i1 r0 = gf.i1.f5682x
            le.f r6 = r6.get(r0)
            gf.j1 r6 = (gf.j1) r6
            if (r6 == 0) goto L7e
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r6 = r6.m()
            if (r6 == 0) goto L7e
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            throw r5
        L7e:
            if (r4 != 0) goto L81
            return r5
        L81:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L89
            he.a.a(r4, r5)
            throw r4
        L89:
            he.a.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.h(kf.h, kf.i, ne.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5 == 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final s8.n i(kf.h r7, int r8) {
        /*
            jf.k r0 = jf.l.f7473k
            r0.getClass()
            int r0 = jf.k.f7472b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof lf.e
            jf.a r2 = jf.a.f7436x
            if (r1 == 0) goto L3b
            r1 = r7
            lf.e r1 = (lf.e) r1
            jf.a r3 = r1.f8368z
            kf.h r4 = r1.c()
            if (r4 == 0) goto L3b
            s8.n r7 = new s8.n
            int r5 = r1.f8367y
            r6 = -3
            if (r5 == r6) goto L2b
            r6 = -2
            if (r5 == r6) goto L2b
            if (r5 == 0) goto L2b
            r0 = r5
            goto L35
        L2b:
            r6 = 0
            if (r3 != r2) goto L32
            if (r5 != 0) goto L35
        L30:
            r0 = 0
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            le.h r8 = r1.f8366x
            r7.<init>(r4, r0, r3, r8)
            return r7
        L3b:
            s8.n r8 = new s8.n
            le.i r1 = le.i.f8353x
            r8.<init>(r7, r0, r2, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.i(kf.h, int):s8.n");
    }

    public static final h j(h hVar) {
        if (hVar instanceof d1) {
            return hVar;
        }
        if (hVar instanceof g) {
            return hVar;
        }
        return new g(hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r11 == r5) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0057, B:20:0x006c, B:22:0x0074, B:24:0x007a, B:26:0x0080, B:28:0x0091, B:29:0x0099, B:30:0x009a, B:31:0x00a1, B:39:0x0048, B:42:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v1, types: [ne.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(kf.i r8, jf.x r9, boolean r10, ne.c r11) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.k(kf.i, jf.x, boolean, ne.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(kf.h r5, le.c r6) {
        /*
            h5.a r0 = lf.c.f8363b
            boolean r1 = r6 instanceof kf.k0
            if (r1 == 0) goto L15
            r1 = r6
            kf.k0 r1 = (kf.k0) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            kf.k0 r1 = new kf.k0
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.f7975z
            int r2 = r1.A
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kf.h0 r5 = r1.f7974y
            kotlin.jvm.internal.w r1 = r1.f7973x
            he.a.f(r6)     // Catch: lf.a -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            he.a.f(r6)
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            r6.f8055x = r0
            kf.h0 r2 = new kf.h0
            r4 = 0
            r2.<init>(r6, r4)
            r1.f7973x = r6     // Catch: lf.a -> L56
            r1.f7974y = r2     // Catch: lf.a -> L56
            r1.A = r3     // Catch: lf.a -> L56
            java.lang.Object r5 = r5.collect(r2, r1)     // Catch: lf.a -> L56
            me.a r1 = me.a.f8833x
            if (r5 != r1) goto L54
            return r1
        L54:
            r1 = r6
            goto L5e
        L56:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L5a:
            java.lang.Object r2 = r6.f8356x
            if (r2 != r5) goto L6b
        L5e:
            java.lang.Object r5 = r1.f8055x
            if (r5 == r0) goto L63
            return r5
        L63:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.l(kf.h, le.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(kf.h r5, ve.p r6, ne.c r7) {
        /*
            h5.a r0 = lf.c.f8363b
            boolean r1 = r7 instanceof kf.l0
            if (r1 == 0) goto L15
            r1 = r7
            kf.l0 r1 = (kf.l0) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            kf.l0 r1 = new kf.l0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.A
            int r2 = r1.B
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kf.j0 r5 = r1.f7979z
            kotlin.jvm.internal.w r6 = r1.f7978y
            ne.j r1 = r1.f7977x
            ve.p r1 = (ve.p) r1
            he.a.f(r7)     // Catch: lf.a -> L2f
            goto L69
        L2f:
            r7 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            he.a.f(r7)
            kotlin.jvm.internal.w r7 = new kotlin.jvm.internal.w
            r7.<init>()
            r7.f8055x = r0
            kf.j0 r2 = new kf.j0
            r4 = 0
            r2.<init>(r4, r6, r7)
            r4 = r6
            ne.j r4 = (ne.j) r4     // Catch: lf.a -> L60
            r1.f7977x = r4     // Catch: lf.a -> L60
            r1.f7978y = r7     // Catch: lf.a -> L60
            r1.f7979z = r2     // Catch: lf.a -> L60
            r1.B = r3     // Catch: lf.a -> L60
            java.lang.Object r5 = r5.collect(r2, r1)     // Catch: lf.a -> L60
            me.a r1 = me.a.f8833x
            if (r5 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r7
            goto L69
        L60:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L65:
            java.lang.Object r2 = r7.f8356x
            if (r2 != r5) goto L82
        L69:
            java.lang.Object r5 = r6.f8055x
            if (r5 == r0) goto L6e
            return r5
        L6e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.m(kf.h, ve.p, ne.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h n(androidx.lifecycle.j1 j1Var, le.h hVar) {
        if (hVar.get(gf.i1.f5682x) == null) {
            if (hVar.equals(le.i.f8353x)) {
                return j1Var;
            }
            if (j1Var instanceof lf.r) {
                return lf.c.a((lf.r) j1Var, hVar, 0, null, 6);
            }
            return new lf.g(j1Var, hVar, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + hVar).toString());
    }

    public static final h o(u0 u0Var, le.h hVar, int i6, jf.a aVar) {
        if ((i6 == 0 || i6 == -3) && aVar == jf.a.f7436x) {
            return u0Var;
        }
        return new lf.f(u0Var, hVar, i6, aVar);
    }

    public static final void p(h hVar, gf.c0 c0Var) {
        gf.f0.w(c0Var, null, new androidx.lifecycle.b(hVar, null, 1), 3);
    }

    public static final s0 q(h hVar, gf.c0 c0Var, int i6) {
        gf.d0 d0Var;
        s8.n i10 = i(hVar, i6);
        x0 a10 = a(i6, i10.f12259a, (jf.a) i10.f12261c);
        le.h hVar2 = (le.h) i10.f12262d;
        h hVar3 = (h) i10.f12260b;
        j jVar = b1.f7925a;
        if (jVar.equals(jVar)) {
            d0Var = gf.d0.f5655x;
        } else {
            d0Var = gf.d0.A;
        }
        gf.f0.v(c0Var, hVar2, d0Var, new n(jVar, hVar3, a10, f8036a, (le.c) null));
        return new s0(a10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r(kf.h r5, ne.c r6) {
        /*
            h5.a r0 = lf.c.f8363b
            boolean r1 = r6 instanceof kf.m0
            if (r1 == 0) goto L15
            r1 = r6
            kf.m0 r1 = (kf.m0) r1
            int r2 = r1.f7985z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f7985z = r2
            goto L1a
        L15:
            kf.m0 r1 = new kf.m0
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.f7984y
            int r2 = r1.f7985z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.w r5 = r1.f7983x
            he.a.f(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            he.a.f(r6)
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            r6.f8055x = r0
            kf.h0 r2 = new kf.h0
            r4 = 1
            r2.<init>(r6, r4)
            r1.f7983x = r6
            r1.f7985z = r3
            java.lang.Object r5 = r5.collect(r2, r1)
            me.a r1 = me.a.f8833x
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            java.lang.Object r5 = r5.f8055x
            if (r5 == r0) goto L54
            return r5
        L54:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Flow is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y0.r(kf.h, ne.c):java.lang.Object");
    }
}
