package p4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ud.h implements ce.p {
    public l0 A;
    public d0 B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final /* synthetic */ j[] G;
    public final /* synthetic */ l0 H;
    public final /* synthetic */ d0 I;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j[] f10324z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j[] jVarArr, l0 l0Var, d0 d0Var, sd.c cVar) {
        super(2, cVar);
        this.G = jVarArr;
        this.H = l0Var;
        this.I = d0Var;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        return ((k0) l((r4.i) obj, (sd.c) obj2)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        return new k0(this.G, this.H, this.I, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (p4.l0.c(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0075 -> B:27:0x0076). Please report as a decompilation issue!!! */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.F
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.E
            int r3 = r10.D
            int r4 = r10.C
            p4.d0 r5 = r10.B
            p4.l0 r6 = r10.A
            p4.j[] r7 = r10.f10324z
            fa.b.z(r11)
            goto L58
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            fa.b.z(r11)
            p4.j[] r11 = r10.G
            int r0 = r11.length
            r3 = 0
            p4.l0 r4 = r10.H
            p4.d0 r5 = r10.I
            r7 = r11
            r11 = r3
            r6 = r4
        L30:
            if (r3 >= r0) goto L78
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L75
            td.a r9 = td.a.f12544v
            if (r4 == r2) goto L60
            if (r4 != r1) goto L5a
            r10.f10324z = r7
            r10.A = r6
            r10.B = r5
            r10.C = r8
            r10.D = r3
            r10.E = r0
            r10.F = r1
            java.lang.Object r11 = p4.l0.d(r6, r5, r11, r10)
            if (r11 != r9) goto L57
            goto L74
        L57:
            r4 = r8
        L58:
            r11 = r4
            goto L76
        L5a:
            a5.d r11 = new a5.d
            r11.<init>()
            throw r11
        L60:
            r10.f10324z = r7
            r10.A = r6
            r10.B = r5
            r10.C = r8
            r10.D = r3
            r10.E = r0
            r10.F = r2
            java.lang.Object r11 = p4.l0.c(r6, r5, r11, r10)
            if (r11 != r9) goto L57
        L74:
            return r9
        L75:
            r11 = r8
        L76:
            int r3 = r3 + r2
            goto L30
        L78:
            od.l r11 = od.l.f10126a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.k0.o(java.lang.Object):java.lang.Object");
    }
}
