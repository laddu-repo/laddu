package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends d {
    public final ve.p B;

    public c(ve.p pVar, le.h hVar, int i6, jf.a aVar) {
        super(pVar, hVar, i6, aVar);
        this.B = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kf.d, lf.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(jf.v r5, le.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kf.b
            if (r0 == 0) goto L13
            r0 = r6
            kf.b r0 = (kf.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            kf.b r0 = new kf.b
            ne.c r6 = (ne.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f7920y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            jf.v r5 = r0.f7919x
            he.a.f(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            he.a.f(r6)
            r0.f7919x = r5
            r0.A = r2
            java.lang.Object r6 = super.a(r5, r0)
            me.a r0 = me.a.f8833x
            if (r6 != r0) goto L41
            return r0
        L41:
            jf.u r5 = (jf.u) r5
            jf.h r5 = r5.A
            boolean r5 = r5.x()
            if (r5 == 0) goto L4e
            he.y r5 = he.y.f6101a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.c.a(jf.v, le.c):java.lang.Object");
    }

    @Override // kf.d, lf.e
    public final lf.e b(le.h hVar, int i6, jf.a aVar) {
        return new c(this.B, hVar, i6, aVar);
    }
}
