package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7944x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f7945y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f7946z;

    public f(g gVar, kotlin.jvm.internal.w wVar, i iVar) {
        this.f7946z = wVar;
        this.f7945y = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    @Override // kf.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, le.c r7) {
        /*
            r5 = this;
            int r0 = r5.f7944x
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof kf.x
            if (r0 == 0) goto L18
            r0 = r7
            kf.x r0 = (kf.x) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.A = r1
            goto L1d
        L18:
            kf.x r0 = new kf.x
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f8031y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            kf.f r6 = r0.f8030x
            he.a.f(r7)     // Catch: java.lang.Throwable -> L2c
            goto L48
        L2c:
            r7 = move-exception
            goto L4d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            he.a.f(r7)
            kf.i r7 = r5.f7945y     // Catch: java.lang.Throwable -> L4b
            r0.f8030x = r5     // Catch: java.lang.Throwable -> L4b
            r0.A = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r6 = r7.emit(r6, r0)     // Catch: java.lang.Throwable -> L4b
            me.a r7 = me.a.f8833x
            if (r6 != r7) goto L48
            goto L4a
        L48:
            he.y r7 = he.y.f6101a
        L4a:
            return r7
        L4b:
            r7 = move-exception
            r6 = r5
        L4d:
            kotlin.jvm.internal.w r6 = r6.f7946z
            r6.f8055x = r7
            throw r7
        L52:
            boolean r0 = r7 instanceof kf.e
            if (r0 == 0) goto L65
            r0 = r7
            kf.e r0 = (kf.e) r0
            int r1 = r0.f7938z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f7938z = r1
            goto L6a
        L65:
            kf.e r0 = new kf.e
            r0.<init>(r5, r7)
        L6a:
            java.lang.Object r7 = r0.f7936x
            int r1 = r0.f7938z
            he.y r2 = he.y.f6101a
            r3 = 1
            if (r1 == 0) goto L81
            if (r1 != r3) goto L79
            he.a.f(r7)
            goto La1
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L81:
            he.a.f(r7)
            kotlin.jvm.internal.w r7 = r5.f7946z
            java.lang.Object r1 = r7.f8055x
            h5.a r4 = lf.c.f8363b
            if (r1 == r4) goto L92
            boolean r1 = kotlin.jvm.internal.k.a(r1, r6)
            if (r1 != 0) goto La1
        L92:
            r7.f8055x = r6
            r0.f7938z = r3
            kf.i r7 = r5.f7945y
            java.lang.Object r6 = r7.emit(r6, r0)
            me.a r7 = me.a.f8833x
            if (r6 != r7) goto La1
            r2 = r7
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.emit(java.lang.Object, le.c):java.lang.Object");
    }

    public f(i iVar, kotlin.jvm.internal.w wVar) {
        this.f7945y = iVar;
        this.f7946z = wVar;
    }
}
