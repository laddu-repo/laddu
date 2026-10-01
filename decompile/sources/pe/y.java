package pe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final re.t f10602a = new re.t(0, "NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final re.t f10603b = new re.t(0, "PENDING");

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(pe.a0 r4, d1.q r5, java.lang.Throwable r6, ud.c r7) {
        /*
            boolean r0 = r7 instanceof pe.f
            if (r0 == 0) goto L13
            r0 = r7
            pe.f r0 = (pe.f) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            pe.f r0 = new pe.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10565z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.f10564y
            fa.b.z(r7)     // Catch: java.lang.Throwable -> L27
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
            fa.b.z(r7)
            r0.f10564y = r6     // Catch: java.lang.Throwable -> L27
            r0.A = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.h(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            td.a r5 = td.a.f12544v
            if (r4 != r5) goto L41
            return r5
        L41:
            od.l r4 = od.l.f10126a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            com.bumptech.glide.e.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.y.a(pe.a0, d1.q, java.lang.Throwable, ud.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r6.x().equals(r5) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable b(pe.c r4, pe.d r5, ud.c r6) {
        /*
            boolean r0 = r6 instanceof pe.k
            if (r0 == 0) goto L13
            r0 = r6
            pe.k r0 = (pe.k) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            pe.k r0 = new pe.k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10575z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            de.p r4 = r0.f10574y
            fa.b.z(r6)     // Catch: java.lang.Throwable -> L27
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
            fa.b.z(r6)
            de.p r6 = new de.p
            r6.<init>()
            pe.m r1 = new pe.m     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f10574y = r6     // Catch: java.lang.Throwable -> L4d
            r0.A = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.g(r1, r0)     // Catch: java.lang.Throwable -> L4d
            td.a r5 = td.a.f12544v
            if (r4 != r5) goto L4b
            return r5
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f4522v
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L8d
        L5b:
            sd.h r6 = r0.f12977w
            de.i.b(r6)
            me.t r0 = me.t.f8732w
            sd.f r6 = r6.A(r0)
            me.v0 r6 = (me.v0) r6
            if (r6 == 0) goto L8e
            me.d1 r6 = (me.d1) r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = me.d1.f8687v
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof me.p
            if (r1 != 0) goto L82
            boolean r1 = r0 instanceof me.c1
            if (r1 == 0) goto L8e
            me.c1 r0 = (me.c1) r0
            boolean r0 = r0.e()
            if (r0 == 0) goto L8e
        L82:
            java.util.concurrent.CancellationException r6 = r6.x()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L8d
            goto L8e
        L8d:
            throw r5
        L8e:
            if (r4 != 0) goto L91
            return r5
        L91:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L99
            com.bumptech.glide.e.a(r4, r5)
            throw r4
        L99:
            com.bumptech.glide.e.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.y.b(pe.c, pe.d, ud.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r1.j(r11, r0) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(pe.d r8, oe.p r9, boolean r10, ud.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.y.c(pe.d, oe.p, boolean, ud.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(pe.c r5, ud.c r6) {
        /*
            re.t r0 = qe.b.f11014b
            boolean r1 = r6 instanceof pe.s
            if (r1 == 0) goto L15
            r1 = r6
            pe.s r1 = (pe.s) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            pe.s r1 = new pe.s
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.A
            int r2 = r1.B
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            pe.r r5 = r1.f10594z
            de.p r1 = r1.f10593y
            fa.b.z(r6)     // Catch: qe.a -> L2b
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
            fa.b.z(r6)
            de.p r6 = new de.p
            r6.<init>()
            r6.f4522v = r0
            pe.r r2 = new pe.r
            r4 = 0
            r2.<init>(r6, r4)
            r1.f10593y = r6     // Catch: qe.a -> L56
            r1.f10594z = r2     // Catch: qe.a -> L56
            r1.B = r3     // Catch: qe.a -> L56
            java.lang.Object r5 = r5.g(r2, r1)     // Catch: qe.a -> L56
            td.a r1 = td.a.f12544v
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
            java.lang.Object r2 = r6.f11012v
            if (r2 != r5) goto L6b
        L5e:
            java.lang.Object r5 = r1.f4522v
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
        throw new UnsupportedOperationException("Method not decompiled: pe.y.d(pe.c, ud.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(pe.c r4, ud.c r5) {
        /*
            boolean r0 = r5 instanceof pe.t
            if (r0 == 0) goto L13
            r0 = r5
            pe.t r0 = (pe.t) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            pe.t r0 = new pe.t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            pe.r r4 = r0.f10596z
            de.p r0 = r0.f10595y
            fa.b.z(r5)     // Catch: qe.a -> L29
            goto L5a
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            fa.b.z(r5)
            de.p r5 = new de.p
            r5.<init>()
            pe.r r1 = new pe.r
            r3 = 1
            r1.<init>(r5, r3)
            r0.f10595y = r5     // Catch: qe.a -> L52
            r0.f10596z = r1     // Catch: qe.a -> L52
            r0.B = r2     // Catch: qe.a -> L52
            java.lang.Object r4 = r4.g(r1, r0)     // Catch: qe.a -> L52
            td.a r0 = td.a.f12544v
            if (r4 != r0) goto L50
            return r0
        L50:
            r0 = r5
            goto L5a
        L52:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L56:
            java.lang.Object r1 = r5.f11012v
            if (r1 != r4) goto L5d
        L5a:
            java.lang.Object r4 = r0.f4522v
            return r4
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.y.e(pe.c, ud.c):java.lang.Object");
    }
}
