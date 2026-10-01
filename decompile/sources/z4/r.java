package z4;

import java.util.concurrent.atomic.AtomicBoolean;
import x4.f0;
import x4.g0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements g0, s {

    /* renamed from: a, reason: collision with root package name */
    public final g f15212a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15213b;

    /* renamed from: c, reason: collision with root package name */
    public final ie.h f15214c = new ie.h();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15215d = new AtomicBoolean(false);

    public r(g gVar, boolean z10) {
        this.f15212a = gVar;
        this.f15213b = z10;
    }

    @Override // x4.g0
    public final Object a(f0 f0Var, ve.p pVar, ne.j jVar) {
        if (!this.f15215d.get()) {
            a aVar = (a) jVar.getContext().get(a.f15163y);
            if (aVar != null && aVar.f15164x == this) {
                return g(f0Var, pVar, jVar);
            }
            a8.d.m(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        a8.d.m(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // x4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, ve.l r7, ne.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z4.q
            if (r0 == 0) goto L13
            r0 = r8
            z4.q r0 = (z4.q) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            z4.q r0 = new z4.q
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.B
            int r1 = r0.D
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            z4.g r6 = r0.A
            ve.l r7 = r0.f15211z
            java.lang.String r1 = r0.f15210y
            z4.r r0 = r0.f15209x
            he.a.f(r8)
            r8 = r6
            r6 = r1
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            he.a.f(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.f15215d
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L98
            le.h r8 = r0.getContext()
            ob.a r4 = z4.a.f15163y
            le.f r8 = r8.get(r4)
            z4.a r8 = (z4.a) r8
            if (r8 == 0) goto L92
            z4.r r8 = r8.f15164x
            if (r8 != r5) goto L92
            r0.f15209x = r5
            r0.f15210y = r6
            r0.f15211z = r7
            z4.g r8 = r5.f15212a
            r0.A = r8
            r0.D = r2
            qf.a r1 = r8.f15177y
            java.lang.Object r0 = r1.d(r0)
            me.a r1 = me.a.f8833x
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r5
        L6f:
            z4.l r1 = new z4.l     // Catch: java.lang.Throwable -> L85
            z4.g r2 = r0.f15212a     // Catch: java.lang.Throwable -> L85
            g5.c r6 = r2.d0(r6)     // Catch: java.lang.Throwable -> L85
            r1.<init>(r0, r6)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r6 = r7.invoke(r1)     // Catch: java.lang.Throwable -> L87
            c9.a.c(r1, r3)     // Catch: java.lang.Throwable -> L85
            r8.f(r3)
            return r6
        L85:
            r6 = move-exception
            goto L8e
        L87:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L89
        L89:
            r7 = move-exception
            c9.a.c(r1, r6)     // Catch: java.lang.Throwable -> L85
            throw r7     // Catch: java.lang.Throwable -> L85
        L8e:
            r8.f(r3)
            throw r6
        L92:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            a8.d.m(r1, r6)
            throw r3
        L98:
            java.lang.String r6 = "Connection is recycled"
            a8.d.m(r1, r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.b(java.lang.String, ve.l, ne.c):java.lang.Object");
    }

    @Override // z4.s
    public final g5.a c() {
        return this.f15212a;
    }

    @Override // x4.g0
    public final Object d(ne.j jVar) {
        if (!this.f15215d.get()) {
            a aVar = (a) jVar.getContext().get(a.f15163y);
            if (aVar != null && aVar.f15164x == this) {
                return Boolean.valueOf(!this.f15214c.isEmpty());
            }
            a8.d.m(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        a8.d.m(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:14:0x005d, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:14:0x005d, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(x4.f0 r8, ne.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof z4.n
            if (r1 == 0) goto L15
            r1 = r9
            z4.n r1 = (z4.n) r1
            int r2 = r1.C
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.C = r2
            goto L1a
        L15:
            z4.n r1 = new z4.n
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.A
            int r2 = r1.C
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            z4.g r8 = r1.f15202z
            x4.f0 r2 = r1.f15201y
            z4.r r1 = r1.f15200x
            he.a.f(r9)
            r9 = r8
            r8 = r2
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            he.a.f(r9)
            r1.f15200x = r7
            r1.f15201y = r8
            z4.g r9 = r7.f15212a
            r1.f15202z = r9
            r1.C = r3
            qf.a r2 = r9.f15177y
            java.lang.Object r1 = r2.d(r1)
            me.a r2 = me.a.f8833x
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            ie.h r4 = r1.f15214c     // Catch: java.lang.Throwable -> L6e
            z4.g r1 = r1.f15212a     // Catch: java.lang.Throwable -> L6e
            int r5 = r4.f6844z     // Catch: java.lang.Throwable -> L6e
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L82
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L7c
            if (r8 == r3) goto L76
            r0 = 2
            if (r8 != r0) goto L70
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            a8.d.d(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L6e:
            r8 = move-exception
            goto La4
        L70:
            a2.x0 r8 = new a2.x0     // Catch: java.lang.Throwable -> L6e
            r8.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r8     // Catch: java.lang.Throwable -> L6e
        L76:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            a8.d.d(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L7c:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            a8.d.d(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L82:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6e
            a8.d.d(r1, r8)     // Catch: java.lang.Throwable -> L6e
        L96:
            z4.m r8 = new z4.m     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            r4.addLast(r8)     // Catch: java.lang.Throwable -> L6e
            he.y r8 = he.y.f6101a     // Catch: java.lang.Throwable -> L6e
            r9.f(r2)
            return r8
        La4:
            r9.f(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.e(x4.f0, ne.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:12:0x0051, B:14:0x005b, B:16:0x0065, B:18:0x006e, B:19:0x00ab, B:23:0x0076, B:24:0x008b, B:26:0x0091, B:27:0x0097, B:28:0x00b1, B:29:0x00b8), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #0 {all -> 0x0074, blocks: (B:12:0x0051, B:14:0x005b, B:16:0x0065, B:18:0x006e, B:19:0x00ab, B:23:0x0076, B:24:0x008b, B:26:0x0091, B:27:0x0097, B:28:0x00b1, B:29:0x00b8), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r8, ne.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof z4.o
            if (r2 == 0) goto L17
            r2 = r9
            z4.o r2 = (z4.o) r2
            int r3 = r2.C
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.C = r3
            goto L1c
        L17:
            z4.o r2 = new z4.o
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.A
            int r3 = r2.C
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            boolean r8 = r2.f15205z
            z4.g r3 = r2.f15204y
            z4.r r2 = r2.f15203x
            he.a.f(r9)
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            he.a.f(r9)
            r2.f15203x = r7
            z4.g r3 = r7.f15212a
            r2.f15204y = r3
            r2.f15205z = r8
            r2.C = r4
            qf.a r9 = r3.f15177y
            java.lang.Object r9 = r9.d(r2)
            me.a r2 = me.a.f8833x
            if (r9 != r2) goto L4f
            return r2
        L4f:
            r2 = r7
        L50:
            r9 = 0
            ie.h r4 = r2.f15214c     // Catch: java.lang.Throwable -> L74
            z4.g r2 = r2.f15212a     // Catch: java.lang.Throwable -> L74
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto Lb1
            java.lang.Object r5 = ie.p.B(r4)     // Catch: java.lang.Throwable -> L74
            z4.m r5 = (z4.m) r5     // Catch: java.lang.Throwable -> L74
            r6 = 39
            if (r8 == 0) goto L8b
            r5.getClass()     // Catch: java.lang.Throwable -> L74
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L76
            java.lang.String r8 = "END TRANSACTION"
            a8.d.d(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L74:
            r8 = move-exception
            goto Lb9
        L76:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.f15199a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            a8.d.d(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L8b:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L97
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            a8.d.d(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L97:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.f15199a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            a8.d.d(r2, r8)     // Catch: java.lang.Throwable -> L74
        Lab:
            he.y r8 = he.y.f6101a     // Catch: java.lang.Throwable -> L74
            r3.f(r9)
            return r8
        Lb1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r8     // Catch: java.lang.Throwable -> L74
        Lb9:
            r3.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.f(boolean, ne.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(x4.f0 r10, ve.p r11, ne.c r12) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.g(x4.f0, ve.p, ne.c):java.lang.Object");
    }
}
