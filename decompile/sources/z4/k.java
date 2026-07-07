package z4;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f15188a;

    /* renamed from: b, reason: collision with root package name */
    public final ve.a f15189b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f15190c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f15191d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15192e;

    /* renamed from: f, reason: collision with root package name */
    public final g[] f15193f;

    /* renamed from: g, reason: collision with root package name */
    public final qf.i f15194g;

    /* renamed from: h, reason: collision with root package name */
    public final v.g f15195h;

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, v.g] */
    public k(int i6, ve.a aVar) {
        this.f15188a = i6;
        this.f15189b = aVar;
        this.f15193f = new g[i6];
        int i10 = qf.j.f11221a;
        this.f15194g = new qf.i(i6);
        ?? obj = new Object();
        if (i6 >= 1) {
            if (i6 <= 1073741824) {
                i6 = Integer.bitCount(i6) != 1 ? Integer.highestOneBit(i6 - 1) << 1 : i6;
                obj.f13154c = i6 - 1;
                obj.f13155d = new Object[i6];
                this.f15195h = obj;
                return;
            }
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        throw new IllegalArgumentException("capacity must be >= 1");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:13:0x0049, B:15:0x004e, B:17:0x0054, B:20:0x005b, B:21:0x0075, B:23:0x007b, B:27:0x0093, B:28:0x0098, B:29:0x0099, B:30:0x00a0), top: B:12:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:13:0x0049, B:15:0x004e, B:17:0x0054, B:20:0x005b, B:21:0x0075, B:23:0x007b, B:27:0x0093, B:28:0x0098, B:29:0x0099, B:30:0x00a0), top: B:12:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ne.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof z4.i
            if (r0 == 0) goto L13
            r0 = r9
            z4.i r0 = (z4.i) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            z4.i r0 = new z4.i
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f15183y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            z4.k r0 = r0.f15182x
            he.a.f(r9)
            goto L42
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            he.a.f(r9)
            r0.f15182x = r8
            r0.A = r2
            qf.i r9 = r8.f15194g
            java.lang.Object r9 = r9.a(r0)
            me.a r0 = me.a.f8833x
            if (r9 != r0) goto L41
            return r0
        L41:
            r0 = r8
        L42:
            java.util.concurrent.locks.ReentrantLock r9 = r0.f15190c     // Catch: java.lang.Throwable -> L8f
            v.g r1 = r0.f15195h     // Catch: java.lang.Throwable -> L8f
            r9.lock()     // Catch: java.lang.Throwable -> L8f
            boolean r3 = r0.f15192e     // Catch: java.lang.Throwable -> L91
            r4 = 0
            if (r3 != 0) goto L99
            int r3 = r1.f13152a     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f13153b     // Catch: java.lang.Throwable -> L91
            if (r3 != r5) goto L75
            int r3 = r0.f15191d     // Catch: java.lang.Throwable -> L91
            int r5 = r0.f15188a     // Catch: java.lang.Throwable -> L91
            if (r3 < r5) goto L5b
            goto L75
        L5b:
            z4.g r3 = new z4.g     // Catch: java.lang.Throwable -> L91
            ve.a r5 = r0.f15189b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L91
            g5.a r5 = (g5.a) r5     // Catch: java.lang.Throwable -> L91
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L91
            z4.g[] r5 = r0.f15193f     // Catch: java.lang.Throwable -> L91
            int r6 = r0.f15191d     // Catch: java.lang.Throwable -> L91
            int r7 = r6 + 1
            r0.f15191d = r7     // Catch: java.lang.Throwable -> L91
            r5[r6] = r3     // Catch: java.lang.Throwable -> L91
            r1.a(r3)     // Catch: java.lang.Throwable -> L91
        L75:
            int r3 = r1.f13152a     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f13153b     // Catch: java.lang.Throwable -> L91
            if (r3 == r5) goto L93
            java.lang.Object r5 = r1.f13155d     // Catch: java.lang.Throwable -> L91
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L91
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L91
            r5[r3] = r4     // Catch: java.lang.Throwable -> L91
            int r3 = r3 + r2
            int r2 = r1.f13154c     // Catch: java.lang.Throwable -> L91
            r2 = r2 & r3
            r1.f13152a = r2     // Catch: java.lang.Throwable -> L91
            z4.g r6 = (z4.g) r6     // Catch: java.lang.Throwable -> L91
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            return r6
        L8f:
            r9 = move-exception
            goto La5
        L91:
            r1 = move-exception
            goto La1
        L93:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            throw r1     // Catch: java.lang.Throwable -> L91
        L99:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            a8.d.m(r2, r1)     // Catch: java.lang.Throwable -> L91
            throw r4     // Catch: java.lang.Throwable -> L91
        La1:
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            throw r1     // Catch: java.lang.Throwable -> L8f
        La5:
            qf.i r0 = r0.f15194g
            r0.c()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.k.a(ne.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:13|14|(1:(1:34)(2:31|(1:33)))(1:16)|17|18|19|20|21|(1:23)(11:25|12|13|14|(0)(0)|17|18|19|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        r12 = r12;
        r11 = r11;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:14:0x0072, B:16:0x0076, B:31:0x007e, B:34:0x0085), top: B:13:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ve.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:12:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r9, z4.d r11, ne.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof z4.j
            if (r0 == 0) goto L13
            r0 = r12
            z4.j r0 = (z4.j) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            z4.j r0 = new z4.j
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.B
            int r1 = r0.D
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            long r9 = r0.A
            kotlin.jvm.internal.w r11 = r0.f15187z
            ve.a r1 = r0.f15186y
            z4.k r4 = r0.f15185x
            he.a.f(r12)     // Catch: java.lang.Throwable -> L2e
            goto L61
        L2e:
            r12 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            he.a.f(r12)
            r4 = r8
        L3c:
            kotlin.jvm.internal.w r12 = new kotlin.jvm.internal.w
            r12.<init>()
            dd.c r1 = new dd.c     // Catch: java.lang.Throwable -> L6b
            r5 = 13
            r1.<init>(r12, r4, r3, r5)     // Catch: java.lang.Throwable -> L6b
            r0.f15185x = r4     // Catch: java.lang.Throwable -> L6b
            r0.f15186y = r11     // Catch: java.lang.Throwable -> L6b
            r0.f15187z = r12     // Catch: java.lang.Throwable -> L6b
            r0.A = r9     // Catch: java.lang.Throwable -> L6b
            r0.D = r2     // Catch: java.lang.Throwable -> L6b
            long r5 = gf.f0.G(r9)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = gf.f0.K(r5, r1, r0)     // Catch: java.lang.Throwable -> L6b
            me.a r5 = me.a.f8833x
            if (r1 != r5) goto L5f
            return r5
        L5f:
            r1 = r11
            r11 = r12
        L61:
            r12 = r11
            r11 = r1
            r1 = r0
            r0 = r3
            goto L72
        L66:
            r7 = r1
            r1 = r11
            r11 = r12
            r12 = r7
            goto L6d
        L6b:
            r1 = move-exception
            goto L66
        L6d:
            r7 = r12
            r12 = r11
            r11 = r1
            r1 = r0
            r0 = r7
        L72:
            boolean r5 = r0 instanceof gf.f2     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L7c
            r11.invoke()     // Catch: java.lang.Throwable -> L7a
            goto L83
        L7a:
            r9 = move-exception
            goto L86
        L7c:
            if (r0 != 0) goto L85
            java.lang.Object r12 = r12.f8055x     // Catch: java.lang.Throwable -> L7a
            if (r12 == 0) goto L83
            return r12
        L83:
            r0 = r1
            goto L3c
        L85:
            throw r0     // Catch: java.lang.Throwable -> L7a
        L86:
            java.lang.Object r10 = r12.f8055x
            z4.g r10 = (z4.g) r10
            if (r10 == 0) goto L8f
            r4.e(r10)
        L8f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.k.b(long, z4.d, ne.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f15190c;
        reentrantLock.lock();
        try {
            this.f15192e = true;
            for (g gVar : this.f15193f) {
                if (gVar != null) {
                    gVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        String str;
        v.g gVar = this.f15195h;
        ReentrantLock reentrantLock = this.f15190c;
        reentrantLock.lock();
        try {
            je.c h4 = a8.g.h();
            int i6 = (gVar.f13153b - gVar.f13152a) & gVar.f13154c;
            for (int i10 = 0; i10 < i6; i10++) {
                if (i10 >= 0) {
                    int i11 = gVar.f13153b;
                    int i12 = gVar.f13152a;
                    int i13 = gVar.f13154c;
                    if (i10 < ((i11 - i12) & i13)) {
                        Object obj = ((Object[]) gVar.f13155d)[(i12 + i10) & i13];
                        kotlin.jvm.internal.k.b(obj);
                        h4.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            je.c c10 = a8.g.c(h4);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f15188a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            qf.i iVar = this.f15194g;
            iVar.getClass();
            sb3.append(Math.max(qf.i.D.get(iVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + c10.a() + ")[" + ie.j.L(c10, null, null, null, null, 63) + "], ");
            sb2.append(")");
            sb2.append('\n');
            int i14 = 0;
            for (g gVar2 : this.f15193f) {
                i14++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i14);
                sb4.append("] - ");
                if (gVar2 != null) {
                    str = gVar2.f15176x.toString();
                } else {
                    str = null;
                }
                sb4.append(str);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (gVar2 != null) {
                    gVar2.l(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(g connection) {
        kotlin.jvm.internal.k.e(connection, "connection");
        ReentrantLock reentrantLock = this.f15190c;
        reentrantLock.lock();
        try {
            this.f15195h.a(connection);
            reentrantLock.unlock();
            this.f15194g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
