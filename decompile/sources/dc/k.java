package dc;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4490b;

    public k(p pVar, p pVar2) {
        de.i.e(pVar, "localOverrideSettings");
        de.i.e(pVar2, "remoteSettings");
        this.f4489a = pVar;
        this.f4490b = pVar2;
    }

    public final double a() {
        Double dC = this.f4489a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f4490b.c();
        if (dC2 != null) {
            double dDoubleValue2 = dC2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r5.f4490b.b(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ud.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof dc.j
            if (r0 == 0) goto L13
            r0 = r6
            dc.j r0 = (dc.j) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            dc.j r0 = new dc.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4487y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            td.a r4 = td.a.f12544v
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            fa.b.z(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            fa.b.z(r6)
            goto L44
        L36:
            fa.b.z(r6)
            r0.A = r3
            dc.p r6 = r5.f4489a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L44
            goto L4e
        L44:
            r0.A = r2
            dc.p r6 = r5.f4490b
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L4f
        L4e:
            return r4
        L4f:
            od.l r6 = od.l.f10126a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.k.b(ud.c):java.lang.Object");
    }
}
