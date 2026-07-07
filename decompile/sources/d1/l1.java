package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements sd.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l1 f3915v = new l1();

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r0 != r1) goto L36;
     */
    /* JADX WARN: Path cross not found for [B:33:0x009a, B:27:0x0075], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.io.FileOutputStream r11, ud.c r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof d1.r0
            if (r0 == 0) goto L13
            r0 = r12
            d1.r0 r0 = (d1.r0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            d1.r0 r0 = new d1.r0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r3 = r0.f3934z
            java.io.FileOutputStream r11 = r0.f3933y
            fa.b.z(r12)
            r12 = r0
            goto La0
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            fa.b.z(r12)
            r3 = 10
            r12 = r0
        L39:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
        */
        //  java.lang.String r1 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto La5
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L56
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L56
            de.i.d(r0, r1)     // Catch: java.io.IOException -> L56
            goto Lb8
        L56:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto La4
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = ke.h.E(r1, r5, r6)
            if (r1 != r2) goto La4
            r12.f3933y = r11
            r12.f3934z = r3
            r12.B = r2
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            td.a r1 = td.a.f12544v
            if (r0 > 0) goto L75
            goto L9a
        L75:
            me.h r0 = new me.h
            sd.c r5 = va.t1.h(r12)
            r0.<init>(r2, r5)
            r0.v()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L93
            sd.h r5 = r0.f8697z
            me.b0 r5 = me.x.f(r5)
            r5.D(r3, r0)
        L93:
            java.lang.Object r0 = r0.u()
            if (r0 != r1) goto L9a
            goto L9c
        L9a:
            od.l r0 = od.l.f10126a
        L9c:
            if (r0 != r1) goto La0
            r0 = r1
            goto Lb8
        La0:
            r0 = 2
            long r0 = (long) r0
            long r3 = r3 * r0
            goto L39
        La4:
            throw r0
        La5:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
            de.i.d(r0, r1)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.l1.a(java.io.FileOutputStream, ud.c):java.lang.Object");
    }
}
