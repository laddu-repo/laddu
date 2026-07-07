package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends ne.j implements ve.p {
    public int A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ l[] E;
    public final /* synthetic */ p0 F;
    public final /* synthetic */ g0 G;

    /* renamed from: x, reason: collision with root package name */
    public l[] f14616x;

    /* renamed from: y, reason: collision with root package name */
    public p0 f14617y;

    /* renamed from: z, reason: collision with root package name */
    public g0 f14618z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l[] lVarArr, p0 p0Var, g0 g0Var, le.c cVar) {
        super(2, cVar);
        this.E = lVarArr;
        this.F = p0Var;
        this.G = g0Var;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        return new o0(this.E, this.F, this.G, cVar);
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((a5.c) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (x4.p0.c(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0076). Please report as a decompilation issue!!! */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.D
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.C
            int r3 = r10.B
            int r4 = r10.A
            x4.g0 r5 = r10.f14618z
            x4.p0 r6 = r10.f14617y
            x4.l[] r7 = r10.f14616x
            he.a.f(r11)
            goto L58
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            he.a.f(r11)
            x4.l[] r11 = r10.E
            int r0 = r11.length
            r3 = 0
            x4.p0 r4 = r10.F
            x4.g0 r5 = r10.G
            r7 = r11
            r6 = r4
            r11 = 0
        L30:
            if (r3 >= r0) goto L78
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L75
            me.a r9 = me.a.f8833x
            if (r4 == r2) goto L60
            if (r4 != r1) goto L5a
            r10.f14616x = r7
            r10.f14617y = r6
            r10.f14618z = r5
            r10.A = r8
            r10.B = r3
            r10.C = r0
            r10.D = r1
            java.lang.Object r11 = x4.p0.d(r6, r5, r11, r10)
            if (r11 != r9) goto L57
            goto L74
        L57:
            r4 = r8
        L58:
            r11 = r4
            goto L76
        L5a:
            a2.x0 r11 = new a2.x0
            r11.<init>()
            throw r11
        L60:
            r10.f14616x = r7
            r10.f14617y = r6
            r10.f14618z = r5
            r10.A = r8
            r10.B = r3
            r10.C = r0
            r10.D = r2
            java.lang.Object r11 = x4.p0.c(r6, r5, r11, r10)
            if (r11 != r9) goto L57
        L74:
            return r9
        L75:
            r11 = r8
        L76:
            int r3 = r3 + r2
            goto L30
        L78:
            he.y r11 = he.y.f6101a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
