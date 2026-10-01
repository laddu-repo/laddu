package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements h {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f8008x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ve.q f8009y;

    public s(u uVar, ve.q qVar) {
        this.f8008x = uVar;
        this.f8009y = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kf.i r9, le.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kf.r
            if (r0 == 0) goto L13
            r0 = r10
            kf.r r0 = (kf.r) r0
            int r1 = r0.f8006y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8006y = r1
            goto L18
        L13:
            kf.r r0 = new kf.r
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f8005x
            int r1 = r0.f8006y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            me.a r6 = me.a.f8833x
            if (r1 == 0) goto L50
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r0.A
            lf.v r9 = (lf.v) r9
            he.a.f(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.A
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            he.a.f(r10)
            goto La0
        L44:
            kf.i r9 = r0.B
            java.lang.Object r1 = r0.A
            kf.s r1 = (kf.s) r1
            he.a.f(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            he.a.f(r10)
            kf.u r10 = r8.f8008x     // Catch: java.lang.Throwable -> L8a
            r0.A = r8     // Catch: java.lang.Throwable -> L8a
            r0.B = r9     // Catch: java.lang.Throwable -> L8a
            r0.f8006y = r4     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r6) goto L62
            goto L9f
        L62:
            r1 = r8
        L63:
            lf.v r10 = new lf.v
            le.h r3 = r0.getContext()
            r10.<init>(r9, r3)
            ve.q r9 = r1.f8009y     // Catch: java.lang.Throwable -> L82
            r0.A = r10     // Catch: java.lang.Throwable -> L82
            r0.B = r5     // Catch: java.lang.Throwable -> L82
            r0.f8006y = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r6) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            he.y r9 = he.y.f6101a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r1 = r8
        L8c:
            kf.k1 r10 = new kf.k1
            r10.<init>(r9)
            ve.q r1 = r1.f8009y
            r0.A = r9
            r0.B = r5
            r0.f8006y = r3
            java.lang.Object r10 = kf.y0.e(r10, r1, r9, r0)
            if (r10 != r6) goto La0
        L9f:
            return r6
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.s.collect(kf.i, le.c):java.lang.Object");
    }
}
