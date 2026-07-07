package d1;

import java.util.List;
import k8.g2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f3864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.d f3865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.v f3866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2 f3867d;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public me.a0 f3869g;
    public final sb.p i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sb.p f3873l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ue.c f3868e = new ue.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s5.d f3870h = new s5.d(10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final od.j f3871j = new od.j(new m(this, 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final od.j f3872k = new od.j(new m(this, 0));

    public e0(i0 i0Var, List list, s5.d dVar, me.v vVar) {
        this.f3864a = i0Var;
        this.f3865b = dVar;
        this.f3866c = vVar;
        sd.c cVar = null;
        this.f3867d = new g2(new cb.e(this, cVar, 1));
        this.i = new sb.p(this, list);
        this.f3873l = new sb.p(vVar, new b0(0, this), new ac.o(this, cVar, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(d1.e0 r4, ud.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof d1.s
            if (r0 == 0) goto L13
            r0 = r5
            d1.s r0 = (d1.s) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            d1.s r0 = new d1.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.A
            int r1 = r0.C
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            ue.c r4 = r0.f3936z
            d1.e0 r0 = r0.f3935y
            fa.b.z(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            fa.b.z(r5)
            ue.c r5 = r4.f3868e
            r0.f3935y = r4
            r0.f3936z = r5
            r0.C = r2
            java.lang.Object r0 = r5.a(r0)
            td.a r1 = td.a.f12544v
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            r4.f = r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5c
            me.a0 r1 = r4.f3869g     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            r1.i(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L62
        L5a:
            r4.f3869g = r0     // Catch: java.lang.Throwable -> L58
        L5c:
            r5.i(r0)
            od.l r4 = od.l.f10126a
            return r4
        L62:
            r5.i(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e0.c(d1.e0, ud.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(0)|8|(8:68|(1:(1:(2:18|19))(3:20|21|22))|13|14|62|(1:64)(1:65)|66|67)(5:23|73|24|(3:26|71|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:53|54))(2:55|(2:57|58)(2:59|60)))|50)|47|69|48) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v3, types: [ce.p, ud.h] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ce.p, ud.h] */
    /* JADX WARN: Type inference failed for: r9v0, types: [d1.e0] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [d1.e0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(d1.e0 r9, d1.q0 r10, ud.c r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e0.d(d1.e0, d1.q0, ud.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(d1.e0 r4, ud.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof d1.u
            if (r0 == 0) goto L13
            r0 = r5
            d1.u r0 = (d1.u) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            d1.u r0 = new d1.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.A
            int r1 = r0.C
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            ue.c r4 = r0.f3943z
            d1.e0 r0 = r0.f3942y
            fa.b.z(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            fa.b.z(r5)
            ue.c r5 = r4.f3868e
            r0.f3942y = r4
            r0.f3943z = r5
            r0.C = r2
            java.lang.Object r0 = r5.a(r0)
            td.a r1 = td.a.f12544v
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L5f
            int r1 = r1 + r2
            r4.f = r1     // Catch: java.lang.Throwable -> L5f
            if (r1 != r2) goto L61
            me.v r1 = r4.f3866c     // Catch: java.lang.Throwable -> L5f
            d1.n r2 = new d1.n     // Catch: java.lang.Throwable -> L5f
            r3 = 1
            r2.<init>(r4, r0, r3)     // Catch: java.lang.Throwable -> L5f
            r3 = 3
            me.a0 r1 = me.x.k(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r4.f3869g = r1     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r4 = move-exception
            goto L67
        L61:
            r5.i(r0)
            od.l r4 = od.l.f10126a
            return r4
        L67:
            r5.i(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e0.e(d1.e0, ud.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(d1.e0 r8, boolean r9, sd.c r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e0.f(d1.e0, boolean, sd.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: c -> 0x005f, TryCatch #1 {c -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:80:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140 A[Catch: all -> 0x016d, TryCatch #3 {all -> 0x016d, blocks: (B:61:0x012e, B:63:0x0140, B:64:0x0148), top: B:83:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148 A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #3 {all -> 0x016d, blocks: (B:61:0x012e, B:63:0x0140, B:64:0x0148), top: B:83:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(d1.e0 r9, boolean r10, ud.c r11) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e0.g(d1.e0, boolean, ud.c):java.lang.Object");
    }

    @Override // d1.h
    public final Object a(ce.p pVar, ud.c cVar) {
        m1 m1Var = (m1) cVar.f().A(l1.f3915v);
        if (m1Var != null) {
            m1Var.b(this);
        }
        return me.x.s(new m1(m1Var, this), new cb.e(this, pVar, (sd.c) null), cVar);
    }

    @Override // d1.h
    public final pe.c b() {
        return this.f3867d;
    }

    public final p0 h() {
        return (p0) this.f3872k.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.F(r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(ud.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof d1.v
            if (r0 == 0) goto L13
            r0 = r7
            d1.v r0 = (d1.v) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            d1.v r0 = new d1.v
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.A
            int r1 = r0.C
            r2 = 2
            r3 = 1
            td.a r4 = td.a.f12544v
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            int r1 = r0.f3947z
            d1.e0 r0 = r0.f3946y
            fa.b.z(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            d1.e0 r1 = r0.f3946y
            fa.b.z(r7)
            goto L51
        L3e:
            fa.b.z(r7)
            d1.p0 r7 = r6.h()
            r0.f3946y = r6
            r0.C = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r4) goto L50
            goto L65
        L50:
            r1 = r6
        L51:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            sb.p r3 = r1.i     // Catch: java.lang.Throwable -> L69
            r0.f3946y = r1     // Catch: java.lang.Throwable -> L69
            r0.f3947z = r7     // Catch: java.lang.Throwable -> L69
            r0.C = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r3.F(r0)     // Catch: java.lang.Throwable -> L69
            if (r7 != r4) goto L66
        L65:
            return r4
        L66:
            od.l r7 = od.l.f10126a
            return r7
        L69:
            r0 = move-exception
            r5 = r1
            r1 = r7
            r7 = r0
            r0 = r5
        L6e:
            s5.d r0 = r0.f3870h
            d1.a1 r2 = new d1.a1
            r2.<init>(r7, r1)
            r0.A(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e0.i(ud.c):java.lang.Object");
    }

    public final Object j(ud.c cVar) {
        return ((l0) this.f3871j.getValue()).a(new q(3, (sd.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r10, boolean r11, ud.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof d1.c0
            if (r0 == 0) goto L13
            r0 = r12
            d1.c0 r0 = (d1.c0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            d1.c0 r0 = new d1.c0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f3856z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            de.o r10 = r0.f3855y
            fa.b.z(r12)
            goto L56
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            fa.b.z(r12)
            de.o r4 = new de.o
            r4.<init>()
            od.j r12 = r9.f3871j
            java.lang.Object r12 = r12.getValue()
            d1.l0 r12 = (d1.l0) r12
            d1.d0 r3 = new d1.d0
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f3855y = r4
            r0.B = r2
            java.lang.Object r10 = r12.b(r3, r0)
            td.a r11 = td.a.f12544v
            if (r10 != r11) goto L55
            return r11
        L55:
            r10 = r4
        L56:
            int r10 = r10.f4521v
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e0.k(java.lang.Object, boolean, ud.c):java.lang.Object");
    }
}
