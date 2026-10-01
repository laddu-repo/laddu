package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i1 implements i {

    /* renamed from: x, reason: collision with root package name */
    public final i f7961x;

    /* renamed from: y, reason: collision with root package name */
    public final ne.j f7962y;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(i iVar, ve.p pVar) {
        this.f7961x = iVar;
        this.f7962y = (ne.j) pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ne.c] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ne.j, ve.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ne.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kf.h1
            if (r0 == 0) goto L13
            r0 = r8
            kf.h1 r0 = (kf.h1) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            kf.h1 r0 = new kf.h1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f7957z
            int r1 = r0.B
            he.y r2 = he.y.f6101a
            r3 = 2
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            he.a.f(r8)
            return r2
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            lf.v r1 = r0.f7956y
            kf.i1 r4 = r0.f7955x
            he.a.f(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5c
        L3c:
            r8 = move-exception
            goto L76
        L3e:
            he.a.f(r8)
            lf.v r1 = new lf.v
            kf.i r8 = r7.f7961x
            le.h r6 = r0.getContext()
            r1.<init>(r8, r6)
            ne.j r8 = r7.f7962y     // Catch: java.lang.Throwable -> L3c
            r0.f7955x = r7     // Catch: java.lang.Throwable -> L3c
            r0.f7956y = r1     // Catch: java.lang.Throwable -> L3c
            r0.B = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r8.invoke(r1, r0)     // Catch: java.lang.Throwable -> L3c
            if (r8 != r5) goto L5b
            goto L74
        L5b:
            r4 = r7
        L5c:
            r1.releaseIntercepted()
            kf.i r8 = r4.f7961x
            boolean r1 = r8 instanceof kf.i1
            if (r1 == 0) goto L75
            kf.i1 r8 = (kf.i1) r8
            r1 = 0
            r0.f7955x = r1
            r0.f7956y = r1
            r0.B = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r5) goto L75
        L74:
            return r5
        L75:
            return r2
        L76:
            r1.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.i1.a(ne.c):java.lang.Object");
    }

    @Override // kf.i
    public final Object emit(Object obj, le.c cVar) {
        return this.f7961x.emit(obj, cVar);
    }
}
