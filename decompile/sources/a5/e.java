package a5;

import ne.j;
import ve.l;
import ve.p;
import x4.f0;
import x4.g0;
import z4.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements g0, s {

    /* renamed from: a, reason: collision with root package name */
    public final a f575a;

    public e(a aVar) {
        this.f575a = aVar;
    }

    @Override // x4.g0
    public final Object a(f0 f0Var, p pVar, j jVar) {
        return e(f0Var, pVar, jVar);
    }

    @Override // x4.o
    public final Object b(String str, l lVar, ne.c cVar) {
        h d02 = this.f575a.d0(str);
        try {
            Object invoke = lVar.invoke(d02);
            c9.a.c(d02, null);
            return invoke;
        } finally {
        }
    }

    @Override // z4.s
    public final g5.a c() {
        return this.f575a;
    }

    @Override // x4.g0
    public final Object d(j jVar) {
        return Boolean.valueOf(this.f575a.f568x.U());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(x4.f0 r5, ve.p r6, ne.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof a5.d
            if (r0 == 0) goto L13
            r0 = r7
            a5.d r0 = (a5.d) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            a5.d r0 = new a5.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f574z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            h5.b r5 = r0.f573y
            a5.e r6 = r0.f572x
            he.a.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L72
        L29:
            r7 = move-exception
            goto L87
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            he.a.f(r7)
            a5.a r7 = r4.f575a
            h5.b r7 = r7.f568x
            r7.U()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L56
            if (r5 == r2) goto L52
            r1 = 2
            if (r5 != r1) goto L4c
            r7.e()
            goto L59
        L4c:
            a2.x0 r5 = new a2.x0
            r5.<init>()
            throw r5
        L52:
            r7.C()
            goto L59
        L56:
            r7.q()
        L59:
            a5.c r5 = new a5.c     // Catch: java.lang.Throwable -> L82
            r1 = 0
            r5.<init>(r4, r1)     // Catch: java.lang.Throwable -> L82
            r0.f572x = r4     // Catch: java.lang.Throwable -> L82
            r0.f573y = r7     // Catch: java.lang.Throwable -> L82
            r0.B = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L82
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L6e
            return r6
        L6e:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L72:
            r5.B()     // Catch: java.lang.Throwable -> L29
            r5.J()
            boolean r5 = r5.U()
            if (r5 != 0) goto L81
            r6.getClass()
        L81:
            return r7
        L82:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L87:
            r5.J()
            boolean r5 = r5.U()
            if (r5 != 0) goto L93
            r6.getClass()
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.e.e(x4.f0, ve.p, ne.c):java.lang.Object");
    }
}
