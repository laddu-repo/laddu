package r4;

import java.util.concurrent.atomic.AtomicInteger;
import p4.c0;
import p4.d0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements d0, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.h f11202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4.a f11203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f11204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0 f11205d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(ce.p pVar, v4.a aVar) {
        de.i.e(aVar, "delegate");
        this.f11202a = (de.h) pVar;
        this.f11203b = aVar;
        this.f11204c = new AtomicInteger(0);
    }

    @Override // r4.a0
    public final v4.a a() {
        return this.f11203b;
    }

    @Override // p4.d0
    public final Boolean b(sd.c cVar) {
        return Boolean.valueOf(this.f11205d != null || this.f11203b.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [ce.p, de.h] */
    @Override // p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r6, ce.l r7, ud.c r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r4.k
            if (r0 == 0) goto L13
            r0 = r8
            r4.k r0 = (r4.k) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            r4.k r0 = new r4.k
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.A
            int r1 = r0.C
            r2 = 2
            r3 = 1
            td.a r4 = td.a.f12544v
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            fa.b.z(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ce.l r7 = r0.f11199z
            java.lang.String r6 = r0.f11198y
            fa.b.z(r8)
            goto L4a
        L3a:
            fa.b.z(r8)
            r0.f11198y = r6
            r0.f11199z = r7
            r0.C = r3
            java.lang.Boolean r8 = r5.b(r0)
            if (r8 != r4) goto L4a
            goto L66
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L68
            r4.l r8 = new r4.l
            r8.<init>(r5, r6, r7, r1)
            r0.f11198y = r1
            r0.f11199z = r1
            r0.C = r2
            de.h r6 = r5.f11202a
            java.lang.Object r6 = r6.i(r8, r0)
            if (r6 != r4) goto L67
        L66:
            return r4
        L67:
            return r6
        L68:
            v4.a r8 = r5.f11203b
            v4.c r6 = r8.j0(r6)
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L76
            b8.h.h(r6, r1)
            return r7
        L76:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L78
        L78:
            r8 = move-exception
            b8.h.h(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.n.c(java.lang.String, ce.l, ud.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ce.p, de.h] */
    @Override // p4.d0
    public final Object d(c0 c0Var, ce.p pVar, ud.h hVar) {
        return this.f11202a.i(new m(this, c0Var, pVar, null), hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p4.c0 r8, ce.p r9, ud.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof r4.j
            if (r0 == 0) goto L13
            r0 = r10
            r4.j r0 = (r4.j) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            r4.j r0 = new r4.j
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f11197z
            int r1 = r0.B
            java.lang.String r2 = "ROLLBACK TRANSACTION"
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r4 = r7.f11204c
            r5 = 1
            v4.a r6 = r7.f11203b
            if (r1 == 0) goto L38
            if (r1 != r5) goto L30
            int r5 = r0.f11196y
            fa.b.z(r10)     // Catch: java.lang.Throwable -> L2e
            goto L78
        L2e:
            r8 = move-exception
            goto L8c
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            fa.b.z(r10)
            int r10 = r8.ordinal()
            if (r10 == 0) goto L58
            if (r10 == r5) goto L52
            r1 = 2
            if (r10 != r1) goto L4c
            java.lang.String r10 = "BEGIN EXCLUSIVE TRANSACTION"
            p4.v.x(r6, r10)
            goto L5d
        L4c:
            a5.d r8 = new a5.d
            r8.<init>()
            throw r8
        L52:
            java.lang.String r10 = "BEGIN IMMEDIATE TRANSACTION"
            p4.v.x(r6, r10)
            goto L5d
        L58:
            java.lang.String r10 = "BEGIN DEFERRED TRANSACTION"
            p4.v.x(r6, r10)
        L5d:
            int r10 = r4.incrementAndGet()
            if (r10 <= 0) goto L65
            r7.f11205d = r8
        L65:
            r4.i r8 = new r4.i     // Catch: java.lang.Throwable -> L2e
            r10 = 0
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> L2e
            r0.f11196y = r5     // Catch: java.lang.Throwable -> L2e
            r0.B = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r9.i(r8, r0)     // Catch: java.lang.Throwable -> L2e
            td.a r8 = td.a.f12544v
            if (r10 != r8) goto L78
            return r8
        L78:
            int r8 = r4.decrementAndGet()
            if (r8 != 0) goto L80
            r7.f11205d = r3
        L80:
            if (r5 == 0) goto L88
            java.lang.String r8 = "END TRANSACTION"
            p4.v.x(r6, r8)
            return r10
        L88:
            p4.v.x(r6, r2)
            return r10
        L8c:
            throw r8     // Catch: java.lang.Throwable -> L8d
        L8d:
            r9 = move-exception
            int r10 = r4.decrementAndGet()     // Catch: android.database.SQLException -> L97
            if (r10 != 0) goto L99
            r7.f11205d = r3     // Catch: android.database.SQLException -> L97
            goto L99
        L97:
            r10 = move-exception
            goto L9d
        L99:
            p4.v.x(r6, r2)     // Catch: android.database.SQLException -> L97
            goto La0
        L9d:
            com.bumptech.glide.e.a(r8, r10)
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.n.e(p4.c0, ce.p, ud.c):java.lang.Object");
    }
}
