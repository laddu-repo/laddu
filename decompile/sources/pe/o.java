package pe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10583v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f10584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f10585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ud.h f10586y;

    public o(de.n nVar, d dVar, d1.p pVar) {
        this.f10584w = nVar;
        this.f10585x = dVar;
        this.f10586y = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // pe.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r8, sd.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.f10583v
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f10584w
            sd.h r0 = (sd.h) r0
            ud.h r1 = r7.f10586y
            ac.o r1 = (ac.o) r1
            java.lang.Object r2 = r7.f10585x
            java.lang.Object r8 = qe.b.a(r0, r8, r2, r1, r9)
            td.a r9 = td.a.f12544v
            if (r8 != r9) goto L18
            goto L1a
        L18:
            od.l r8 = od.l.f10126a
        L1a:
            return r8
        L1b:
            boolean r0 = r9 instanceof pe.n
            if (r0 == 0) goto L2e
            r0 = r9
            pe.n r0 = (pe.n) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2e
            int r1 = r1 - r2
            r0.C = r1
            goto L33
        L2e:
            pe.n r0 = new pe.n
            r0.<init>(r7, r9)
        L33:
            java.lang.Object r9 = r0.A
            int r1 = r0.C
            r2 = 3
            r3 = 2
            od.l r4 = od.l.f10126a
            r5 = 1
            td.a r6 = td.a.f12544v
            if (r1 == 0) goto L5a
            if (r1 == r5) goto L46
            if (r1 == r3) goto L52
            if (r1 != r2) goto L4a
        L46:
            fa.b.z(r9)
            goto La4
        L4a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L52:
            java.lang.Object r8 = r0.f10582z
            pe.o r1 = r0.f10581y
            fa.b.z(r9)
            goto L84
        L5a:
            fa.b.z(r9)
            java.lang.Object r9 = r7.f10584w
            de.n r9 = (de.n) r9
            boolean r9 = r9.f4520v
            if (r9 == 0) goto L72
            java.lang.Object r9 = r7.f10585x
            pe.d r9 = (pe.d) r9
            r0.C = r5
            java.lang.Object r8 = r9.j(r8, r0)
            if (r8 != r6) goto La4
            goto La3
        L72:
            ud.h r9 = r7.f10586y
            d1.p r9 = (d1.p) r9
            r0.f10581y = r7
            r0.f10582z = r8
            r0.C = r3
            java.lang.Object r9 = r9.i(r8, r0)
            if (r9 != r6) goto L83
            goto La3
        L83:
            r1 = r7
        L84:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto La4
            java.lang.Object r9 = r1.f10584w
            de.n r9 = (de.n) r9
            r9.f4520v = r5
            java.lang.Object r9 = r1.f10585x
            pe.d r9 = (pe.d) r9
            r1 = 0
            r0.f10581y = r1
            r0.f10582z = r1
            r0.C = r2
            java.lang.Object r8 = r9.j(r8, r0)
            if (r8 != r6) goto La4
        La3:
            r4 = r6
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.o.j(java.lang.Object, sd.c):java.lang.Object");
    }

    public o(d dVar, sd.h hVar) {
        this.f10584w = hVar;
        this.f10585x = re.a.k(hVar);
        this.f10586y = new ac.o(dVar, (sd.c) null, 15);
    }
}
