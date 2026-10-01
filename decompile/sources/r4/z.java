package r4;

import k8.b0;
import p4.c0;
import p4.d0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z implements d0, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f11235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f11236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pd.h f11238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f11239e;

    public z(b0 b0Var, h hVar, boolean z2) {
        de.i.e(b0Var, "connectionElementKey");
        this.f11235a = b0Var;
        this.f11236b = hVar;
        this.f11237c = z2;
        this.f11238d = new pd.h();
    }

    @Override // r4.a0
    public final v4.a a() {
        return this.f11236b;
    }

    @Override // p4.d0
    public final Boolean b(sd.c cVar) {
        if (this.f11239e) {
            p4.v.P(21, "Connection is recycled");
            throw null;
        }
        sd.h hVar = ((ud.c) cVar).f12977w;
        de.i.b(hVar);
        a aVar = (a) hVar.A(this.f11235a);
        if (aVar != null && aVar.f11175w == this) {
            return Boolean.valueOf(!this.f11238d.isEmpty() || this.f11236b.f11189v.f());
        }
        p4.v.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, ce.l r8, ud.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof r4.y
            if (r0 == 0) goto L13
            r0 = r9
            r4.y r0 = (r4.y) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            r4.y r0 = new r4.y
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.B
            td.a r1 = td.a.f12544v
            int r2 = r0.D
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            r4.h r7 = r0.A
            ce.l r8 = r0.f11234z
            java.lang.String r0 = r0.f11233y
            fa.b.z(r9)
            r9 = r7
            r7 = r0
            goto L67
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            fa.b.z(r9)
            boolean r9 = r6.f11239e
            r2 = 21
            if (r9 != 0) goto L90
            sd.h r9 = r0.f12977w
            de.i.b(r9)
            k8.b0 r5 = r6.f11235a
            sd.f r9 = r9.A(r5)
            r4.a r9 = (r4.a) r9
            if (r9 == 0) goto L8a
            r4.z r9 = r9.f11175w
            if (r9 != r6) goto L8a
            r4.h r9 = r6.f11236b
            r0.f11233y = r7
            r0.f11234z = r8
            r0.A = r9
            r0.D = r3
            ue.a r2 = r9.f11190w
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            r4.t r0 = new r4.t     // Catch: java.lang.Throwable -> L7d
            r4.h r1 = r6.f11236b     // Catch: java.lang.Throwable -> L7d
            v4.c r7 = r1.j0(r7)     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r8.a(r0)     // Catch: java.lang.Throwable -> L7f
            b8.h.h(r0, r4)     // Catch: java.lang.Throwable -> L7d
            r9.i(r4)
            return r7
        L7d:
            r7 = move-exception
            goto L86
        L7f:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L81
        L81:
            r8 = move-exception
            b8.h.h(r0, r7)     // Catch: java.lang.Throwable -> L7d
            throw r8     // Catch: java.lang.Throwable -> L7d
        L86:
            r9.i(r4)
            throw r7
        L8a:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            p4.v.P(r2, r7)
            throw r4
        L90:
            java.lang.String r7 = "Connection is recycled"
            p4.v.P(r2, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.z.c(java.lang.String, ce.l, ud.c):java.lang.Object");
    }

    @Override // p4.d0
    public final Object d(c0 c0Var, ce.p pVar, ud.h hVar) {
        if (this.f11239e) {
            p4.v.P(21, "Connection is recycled");
            throw null;
        }
        sd.h hVar2 = hVar.f12977w;
        de.i.b(hVar2);
        a aVar = (a) hVar2.A(this.f11235a);
        if (aVar != null && aVar.f11175w == this) {
            return g(c0Var, pVar, hVar);
        }
        p4.v.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p4.c0 r8, ud.c r9) {
        /*
            r7 = this;
            pd.h r0 = r7.f11238d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof r4.v
            if (r2 == 0) goto L17
            r2 = r9
            r4.v r2 = (r4.v) r2
            int r3 = r2.C
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.C = r3
            goto L1c
        L17:
            r4.v r2 = new r4.v
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.A
            int r3 = r2.C
            r4 = 1
            r4.h r5 = r7.f11236b
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            r4.h r8 = r2.f11228z
            p4.c0 r2 = r2.f11227y
            fa.b.z(r9)
            r9 = r8
            r8 = r2
            goto L4e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            fa.b.z(r9)
            r2.f11227y = r8
            r2.f11228z = r5
            r2.C = r4
            ue.a r9 = r5.f11190w
            java.lang.Object r9 = r9.a(r2)
            td.a r2 = td.a.f12544v
            if (r9 != r2) goto L4d
            return r2
        L4d:
            r9 = r5
        L4e:
            r2 = 0
            int r3 = r0.f10549x     // Catch: java.lang.Throwable -> L68
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L7c
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L76
            if (r8 == r4) goto L70
            r1 = 2
            if (r8 != r1) goto L6a
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            p4.v.x(r5, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L68:
            r8 = move-exception
            goto L9e
        L6a:
            a5.d r8 = new a5.d     // Catch: java.lang.Throwable -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L68
            throw r8     // Catch: java.lang.Throwable -> L68
        L70:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            p4.v.x(r5, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L76:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            p4.v.x(r5, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L7c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r8.append(r3)     // Catch: java.lang.Throwable -> L68
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L68
            p4.v.x(r5, r8)     // Catch: java.lang.Throwable -> L68
        L90:
            r4.u r8 = new r4.u     // Catch: java.lang.Throwable -> L68
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L68
            r0.addLast(r8)     // Catch: java.lang.Throwable -> L68
            od.l r8 = od.l.f10126a     // Catch: java.lang.Throwable -> L68
            r9.i(r2)
            return r8
        L9e:
            r9.i(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.z.e(p4.c0, ud.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r8, ud.c r9) {
        /*
            r7 = this;
            pd.h r0 = r7.f11238d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r9 instanceof r4.w
            if (r3 == 0) goto L19
            r3 = r9
            r4.w r3 = (r4.w) r3
            int r4 = r3.C
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.C = r4
            goto L1e
        L19:
            r4.w r3 = new r4.w
            r3.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r3.A
            int r4 = r3.C
            r5 = 1
            r4.h r6 = r7.f11236b
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            boolean r8 = r3.f11229y
            r4.h r3 = r3.f11230z
            fa.b.z(r9)
            goto L4e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            fa.b.z(r9)
            r3.f11230z = r6
            r3.f11229y = r8
            r3.C = r5
            ue.a r9 = r6.f11190w
            java.lang.Object r9 = r9.a(r3)
            td.a r3 = td.a.f12544v
            if (r9 != r3) goto L4d
            return r3
        L4d:
            r3 = r6
        L4e:
            r9 = 0
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r4 != 0) goto Lab
            java.lang.Object r4 = pd.j.K(r0)     // Catch: java.lang.Throwable -> L6e
            r4.u r4 = (r4.u) r4     // Catch: java.lang.Throwable -> L6e
            r5 = 39
            if (r8 == 0) goto L85
            r4.getClass()     // Catch: java.lang.Throwable -> L6e
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L70
            java.lang.String r8 = "END TRANSACTION"
            p4.v.x(r6, r8)     // Catch: java.lang.Throwable -> L6e
            goto La5
        L6e:
            r8 = move-exception
            goto Lb3
        L70:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            int r0 = r4.f11226a     // Catch: java.lang.Throwable -> L6e
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6e
            p4.v.x(r6, r8)     // Catch: java.lang.Throwable -> L6e
            goto La5
        L85:
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L91
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            p4.v.x(r6, r8)     // Catch: java.lang.Throwable -> L6e
            goto La5
        L91:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6e
            int r0 = r4.f11226a     // Catch: java.lang.Throwable -> L6e
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6e
            p4.v.x(r6, r8)     // Catch: java.lang.Throwable -> L6e
        La5:
            od.l r8 = od.l.f10126a     // Catch: java.lang.Throwable -> L6e
            r3.i(r9)
            return r8
        Lab:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8     // Catch: java.lang.Throwable -> L6e
        Lb3:
            r3.i(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.z.f(boolean, ud.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (f(false, r0) != r7) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ce.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [ce.p] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, r4.z] */
    /* JADX WARN: Type inference failed for: r9v0, types: [p4.c0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [p4.c0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(p4.c0 r9, ce.p r10, ud.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof r4.x
            if (r0 == 0) goto L13
            r0 = r11
            r4.x r0 = (r4.x) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            r4.x r0 = new r4.x
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.B
            int r1 = r0.D
            r2 = 0
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            td.a r7 = td.a.f12544v
            if (r1 == 0) goto L5d
            if (r1 == r6) goto L54
            if (r1 == r5) goto L4b
            if (r1 == r4) goto L45
            r9 = 4
            if (r1 == r9) goto L45
            if (r1 == r3) goto L38
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Throwable r9 = r0.f11232z
            java.lang.Object r10 = r0.f11231y
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            fa.b.z(r11)     // Catch: android.database.SQLException -> L43
            goto La7
        L43:
            r11 = move-exception
            goto La2
        L45:
            java.lang.Object r9 = r0.f11231y
            fa.b.z(r11)
            return r9
        L4b:
            int r9 = r0.A
            fa.b.z(r11)     // Catch: java.lang.Throwable -> L51
            goto L84
        L51:
            r9 = move-exception
            r10 = r9
            goto L93
        L54:
            java.lang.Object r9 = r0.f11231y
            r10 = r9
            ce.p r10 = (ce.p) r10
            fa.b.z(r11)
            goto L6f
        L5d:
            fa.b.z(r11)
            if (r9 != 0) goto L64
            p4.c0 r9 = p4.c0.f10289v
        L64:
            r0.f11231y = r10
            r0.D = r6
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r7) goto L6f
            goto La1
        L6f:
            r4.i r9 = new r4.i     // Catch: java.lang.Throwable -> L51
            r11 = 1
            r9.<init>(r11, r8)     // Catch: java.lang.Throwable -> L51
            r11 = 0
            r0.f11231y = r11     // Catch: java.lang.Throwable -> L51
            r0.A = r6     // Catch: java.lang.Throwable -> L51
            r0.D = r5     // Catch: java.lang.Throwable -> L51
            java.lang.Object r11 = r10.i(r9, r0)     // Catch: java.lang.Throwable -> L51
            if (r11 != r7) goto L83
            goto La1
        L83:
            r9 = r6
        L84:
            if (r9 == 0) goto L87
            r2 = r6
        L87:
            r0.f11231y = r11
            r0.D = r4
            java.lang.Object r9 = r8.f(r2, r0)
            if (r9 != r7) goto L92
            goto La1
        L92:
            return r11
        L93:
            throw r10     // Catch: java.lang.Throwable -> L94
        L94:
            r9 = move-exception
            r0.f11231y = r10     // Catch: android.database.SQLException -> L43
            r0.f11232z = r9     // Catch: android.database.SQLException -> L43
            r0.D = r3     // Catch: android.database.SQLException -> L43
            java.lang.Object r10 = r8.f(r2, r0)     // Catch: android.database.SQLException -> L43
            if (r10 != r7) goto La7
        La1:
            return r7
        La2:
            if (r10 == 0) goto La8
            com.bumptech.glide.e.a(r10, r11)
        La7:
            throw r9
        La8:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.z.g(p4.c0, ce.p, ud.c):java.lang.Object");
    }
}
