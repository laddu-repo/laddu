package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends g0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6, ud.c r7) throws java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d1.m0
            if (r0 == 0) goto L13
            r0 = r7
            d1.m0 r0 = (d1.m0) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            d1.m0 r0 = new d1.m0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.A
            int r1 = r0.C
            od.l r2 = od.l.f10126a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            java.io.FileOutputStream r6 = r0.f3919z
            java.io.FileOutputStream r0 = r0.f3918y
            fa.b.z(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L6c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            fa.b.z(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f3884c
            boolean r7 = r7.get()
            if (r7 != 0) goto L72
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r1 = r5.f3882a
            r7.<init>(r1)
            d1.c1 r1 = r5.f3883b     // Catch: java.lang.Throwable -> L6a
            d1.k1 r4 = new d1.k1     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6a
            r0.f3918y = r7     // Catch: java.lang.Throwable -> L6a
            r0.f3919z = r7     // Catch: java.lang.Throwable -> L6a
            r0.C = r3     // Catch: java.lang.Throwable -> L6a
            r1.b(r6, r4)     // Catch: java.lang.Throwable -> L6a
            td.a r6 = td.a.f12544v
            if (r2 != r6) goto L5c
            return r6
        L5c:
            r6 = r7
            r0 = r6
        L5e:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L2b
            r6.sync()     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            u1.c.h(r0, r6)
            return r2
        L6a:
            r6 = move-exception
            r0 = r7
        L6c:
            throw r6     // Catch: java.lang.Throwable -> L6d
        L6d:
            r7 = move-exception
            u1.c.h(r0, r6)
            throw r7
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.n0.b(java.lang.Object, ud.c):java.lang.Object");
    }
}
