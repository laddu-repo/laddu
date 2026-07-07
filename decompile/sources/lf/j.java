package lf;

import gf.c0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements kf.i {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8375x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f8376y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kf.i f8377z;

    public j(kotlin.jvm.internal.w wVar, c0 c0Var, k kVar, kf.i iVar) {
        this.f8376y = wVar;
        this.A = c0Var;
        this.B = kVar;
        this.f8377z = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r5.emit(r15, r1) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r5.emit(r15, r1) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int[] r14, le.c r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.A
            java.lang.String[] r0 = (java.lang.String[]) r0
            boolean r1 = r15 instanceof x4.i0
            if (r1 == 0) goto L17
            r1 = r15
            x4.i0 r1 = (x4.i0) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.B = r2
            goto L1c
        L17:
            x4.i0 r1 = new x4.i0
            r1.<init>(r13, r15)
        L1c:
            java.lang.Object r15 = r1.f14588z
            int r2 = r1.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            int[] r14 = r1.f14587y
            lf.j r0 = r1.f14586x
            he.a.f(r15)
            goto L9e
        L39:
            he.a.f(r15)
            kotlin.jvm.internal.w r15 = r13.f8376y
            java.lang.Object r2 = r15.f8055x
            kf.i r5 = r13.f8377z
            me.a r6 = me.a.f8833x
            if (r2 != 0) goto L57
            java.util.Set r15 = ie.i.s0(r0)
            r1.f14586x = r13
            r1.f14587y = r14
            r1.B = r4
            java.lang.Object r15 = r5.emit(r15, r1)
            if (r15 != r6) goto L9d
            goto L9c
        L57:
            java.lang.Object r2 = r13.B
            int[] r2 = (int[]) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = 0
        L63:
            if (r8 >= r7) goto L86
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r15.f8055x
            if (r12 == 0) goto L7e
            int[] r12 = (int[]) r12
            r9 = r2[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L7a
            r4.add(r10)
        L7a:
            int r8 = r8 + 1
            r9 = r11
            goto L63
        L7e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L86:
            boolean r15 = r4.isEmpty()
            if (r15 != 0) goto L9d
            java.util.Set r15 = ie.j.c0(r4)
            r1.f14586x = r13
            r1.f14587y = r14
            r1.B = r3
            java.lang.Object r15 = r5.emit(r15, r1)
            if (r15 != r6) goto L9d
        L9c:
            return r6
        L9d:
            r0 = r13
        L9e:
            kotlin.jvm.internal.w r15 = r0.f8376y
            r15.f8055x = r14
            he.y r14 = he.y.f6101a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.j.a(int[], le.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    @Override // kf.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, le.c r8) {
        /*
            r6 = this;
            int r0 = r6.f8375x
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            int[] r7 = (int[]) r7
            java.lang.Object r7 = r6.a(r7, r8)
            return r7
        Lc:
            boolean r0 = r8 instanceof lf.i
            if (r0 == 0) goto L1f
            r0 = r8
            lf.i r0 = (lf.i) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L1f
            int r1 = r1 - r2
            r0.B = r1
            goto L24
        L1f:
            lf.i r0 = new lf.i
            r0.<init>(r6, r8)
        L24:
            java.lang.Object r8 = r0.f8374z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r7 = r0.f8373y
            lf.j r0 = r0.f8372x
            he.a.f(r8)
            goto L62
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            he.a.f(r8)
            kotlin.jvm.internal.w r8 = r6.f8376y
            java.lang.Object r8 = r8.f8055x
            gf.j1 r8 = (gf.j1) r8
            if (r8 == 0) goto L61
            lf.l r1 = new lf.l
            java.lang.String r3 = "Child of the scoped flow was cancelled"
            r1.<init>(r3)
            r8.d(r1)
            r0.f8372x = r6
            r0.f8373y = r7
            r0.B = r2
            java.lang.Object r8 = r8.l(r0)
            me.a r0 = me.a.f8833x
            if (r8 != r0) goto L61
            goto L7c
        L61:
            r0 = r6
        L62:
            kotlin.jvm.internal.w r8 = r0.f8376y
            java.lang.Object r1 = r0.A
            gf.c0 r1 = (gf.c0) r1
            lf.h r3 = new lf.h
            java.lang.Object r4 = r0.B
            lf.k r4 = (lf.k) r4
            kf.i r0 = r0.f8377z
            r5 = 0
            r3.<init>(r4, r0, r7, r5)
            gf.a2 r7 = gf.f0.w(r1, r5, r3, r2)
            r8.f8055x = r7
            he.y r0 = he.y.f6101a
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.j.emit(java.lang.Object, le.c):java.lang.Object");
    }

    public j(kotlin.jvm.internal.w wVar, kf.i iVar, String[] strArr, int[] iArr) {
        this.f8376y = wVar;
        this.f8377z = iVar;
        this.A = strArr;
        this.B = iArr;
    }
}
