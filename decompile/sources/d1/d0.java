package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ud.h implements ce.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ de.o C;
    public final /* synthetic */ e0 D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ boolean F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public de.o f3859z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(de.o oVar, e0 e0Var, Object obj, boolean z2, sd.c cVar) {
        super(2, cVar);
        this.C = oVar;
        this.D = e0Var;
        this.E = obj;
        this.F = z2;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        return ((d0) l((n0) obj, (sd.c) obj2)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        d0 d0Var = new d0(this.C, this.D, this.E, this.F, cVar);
        d0Var.B = obj;
        return d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A
            java.lang.Object r1 = r7.E
            d1.e0 r2 = r7.D
            de.o r3 = r7.C
            r4 = 2
            r5 = 1
            td.a r6 = td.a.f12544v
            if (r0 == 0) goto L28
            if (r0 == r5) goto L1e
            if (r0 != r4) goto L16
            fa.b.z(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            de.o r0 = r7.f3859z
            java.lang.Object r5 = r7.B
            d1.n0 r5 = (d1.n0) r5
            fa.b.z(r8)
            goto L43
        L28:
            fa.b.z(r8)
            java.lang.Object r8 = r7.B
            d1.n0 r8 = (d1.n0) r8
            d1.p0 r0 = r2.h()
            r7.B = r8
            r7.f3859z = r3
            r7.A = r5
            java.lang.Object r0 = r0.e(r7)
            if (r0 != r6) goto L40
            goto L58
        L40:
            r5 = r8
            r8 = r0
            r0 = r3
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f4521v = r8
            r8 = 0
            r7.B = r8
            r7.f3859z = r8
            r7.A = r4
            java.lang.Object r8 = r5.b(r1, r7)
            if (r8 != r6) goto L59
        L58:
            return r6
        L59:
            boolean r8 = r7.F
            if (r8 == 0) goto L71
            s5.d r8 = r2.f3870h
            d1.d r0 = new d1.d
            if (r1 == 0) goto L68
            int r2 = r1.hashCode()
            goto L69
        L68:
            r2 = 0
        L69:
            int r3 = r3.f4521v
            r0.<init>(r2, r3, r1)
            r8.A(r0)
        L71:
            od.l r8 = od.l.f10126a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.d0.o(java.lang.Object):java.lang.Object");
    }
}
