package d1;

import java.util.concurrent.atomic.AtomicInteger;
import k8.g2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.c f3886a = new ue.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9.g f3887b = new a9.g(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f3888c = new g2(new g1(2, null));

    public h1(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d1.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ce.l r8, ud.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d1.e1
            if (r0 == 0) goto L13
            r0 = r9
            d1.e1 r0 = (d1.e1) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            d1.e1 r0 = new d1.e1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.A
            int r1 = r0.C
            r2 = 2
            r3 = 1
            r4 = 0
            td.a r5 = td.a.f12544v
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r8 = r0.f3874y
            ue.a r8 = (ue.a) r8
            fa.b.z(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ue.c r8 = r0.f3875z
            java.lang.Object r1 = r0.f3874y
            ce.l r1 = (ce.l) r1
            fa.b.z(r9)
            r9 = r8
            r8 = r1
            goto L57
        L45:
            fa.b.z(r9)
            r0.f3874y = r8
            ue.c r9 = r7.f3886a
            r0.f3875z = r9
            r0.C = r3
            java.lang.Object r1 = r9.a(r0)
            if (r1 != r5) goto L57
            goto L63
        L57:
            r0.f3874y = r9     // Catch: java.lang.Throwable -> L6b
            r0.f3875z = r4     // Catch: java.lang.Throwable -> L6b
            r0.C = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 != r5) goto L64
        L63:
            return r5
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            r8.i(r4)
            return r9
        L6b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            r8.i(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.h1.a(ce.l, ud.c):java.lang.Object");
    }

    @Override // d1.p0
    public final Object b(ud.c cVar) {
        return new Integer(((AtomicInteger) this.f3887b.f273w).get());
    }

    @Override // d1.p0
    public final pe.c c() {
        return this.f3888c;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d1.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ce.p r6, ud.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d1.f1
            if (r0 == 0) goto L13
            r0 = r7
            d1.f1 r0 = (d1.f1) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            d1.f1 r0 = new d1.f1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.A
            int r1 = r0.C
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            boolean r6 = r0.f3880z
            ue.c r0 = r0.f3879y
            fa.b.z(r7)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r7 = move-exception
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            fa.b.z(r7)
            ue.c r7 = r5.f3886a
            boolean r1 = r7.e()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L59
            r0.f3879y = r7     // Catch: java.lang.Throwable -> L59
            r0.f3880z = r1     // Catch: java.lang.Throwable -> L59
            r0.C = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.i(r4, r0)     // Catch: java.lang.Throwable -> L59
            td.a r0 = td.a.f12544v
            if (r6 != r0) goto L50
            return r0
        L50:
            r0 = r7
            r7 = r6
            r6 = r1
        L53:
            if (r6 == 0) goto L58
            r0.i(r3)
        L58:
            return r7
        L59:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r1
        L5d:
            if (r6 == 0) goto L62
            r0.i(r3)
        L62:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.h1.d(ce.p, ud.c):java.lang.Object");
    }

    @Override // d1.p0
    public final Object e(d0 d0Var) {
        return new Integer(((AtomicInteger) this.f3887b.f273w).incrementAndGet());
    }
}
