package pe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s5.c f10568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d1.q f10569w;

    public h(s5.c cVar, d1.q qVar) {
        this.f10568v = cVar;
        this.f10569w = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(pe.d r9, ud.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof pe.g
            if (r0 == 0) goto L13
            r0 = r10
            pe.g r0 = (pe.g) r0
            int r1 = r0.f10567z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10567z = r1
            goto L18
        L13:
            pe.g r0 = new pe.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f10566y
            int r1 = r0.f10567z
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            td.a r6 = td.a.f12544v
            if (r1 == 0) goto L50
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r0.B
            qe.f r9 = (qe.f) r9
            fa.b.z(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r10 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.B
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            fa.b.z(r10)
            goto La1
        L44:
            pe.d r9 = r0.C
            java.lang.Object r1 = r0.B
            pe.h r1 = (pe.h) r1
            fa.b.z(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8d
        L50:
            fa.b.z(r10)
            s5.c r10 = r8.f10568v     // Catch: java.lang.Throwable -> L8b
            r0.B = r8     // Catch: java.lang.Throwable -> L8b
            r0.C = r9     // Catch: java.lang.Throwable -> L8b
            r0.f10567z = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r10.g(r9, r0)     // Catch: java.lang.Throwable -> L8b
            if (r10 != r6) goto L62
            goto La0
        L62:
            r1 = r8
        L63:
            qe.f r10 = new qe.f
            sd.h r3 = r0.f12977w
            de.i.b(r3)
            r10.<init>(r9, r3)
            d1.q r9 = r1.f10569w     // Catch: java.lang.Throwable -> L83
            r0.B = r10     // Catch: java.lang.Throwable -> L83
            r0.C = r5     // Catch: java.lang.Throwable -> L83
            r0.f10567z = r2     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.h(r10, r5, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 != r6) goto L7c
            goto La0
        L7c:
            r9 = r10
        L7d:
            r9.p()
            od.l r9 = od.l.f10126a
            return r9
        L83:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L87:
            r9.p()
            throw r10
        L8b:
            r9 = move-exception
            r1 = r8
        L8d:
            pe.a0 r10 = new pe.a0
            r10.<init>(r9)
            d1.q r1 = r1.f10569w
            r0.B = r9
            r0.C = r5
            r0.f10567z = r3
            java.lang.Object r10 = pe.y.a(r10, r1, r9, r0)
            if (r10 != r6) goto La1
        La0:
            return r6
        La1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.h.g(pe.d, ud.c):java.lang.Object");
    }
}
