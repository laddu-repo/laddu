package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ud.h implements ce.l {
    public int A;
    public final /* synthetic */ e0 B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Throwable f3959z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, sd.c cVar) {
        super(1, cVar);
        this.B = e0Var;
    }

    @Override // ce.l
    public final Object a(Object obj) {
        return new x(this.B, (sd.c) obj).o(od.l.f10126a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r6 != r4) goto L22;
     */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A
            d1.e0 r1 = r5.B
            r2 = 2
            r3 = 1
            td.a r4 = td.a.f12544v
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            java.lang.Throwable r0 = r5.f3959z
            fa.b.z(r6)
            goto L41
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            fa.b.z(r6)     // Catch: java.lang.Throwable -> L20
            goto L2f
        L20:
            r6 = move-exception
            r0 = r6
            goto L32
        L23:
            fa.b.z(r6)
            r5.A = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r6 = d1.e0.g(r1, r3, r5)     // Catch: java.lang.Throwable -> L20
            if (r6 != r4) goto L2f
            goto L40
        L2f:
            d1.i1 r6 = (d1.i1) r6     // Catch: java.lang.Throwable -> L20
            goto L4d
        L32:
            d1.p0 r6 = r1.h()
            r5.f3959z = r0
            r5.A = r2
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r4) goto L41
        L40:
            return r4
        L41:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            d1.a1 r1 = new d1.a1
            r1.<init>(r0, r6)
            r6 = r1
        L4d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            od.f r1 = new od.f
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.x.o(java.lang.Object):java.lang.Object");
    }
}
