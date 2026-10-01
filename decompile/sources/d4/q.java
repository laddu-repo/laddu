package d4;

import c2.o0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f4222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4224c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4227g;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w2.g0 f4229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f4230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4231l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4233n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f4228h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f4225d = new o0(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f4226e = new o0(8);
    public final o0 f = new o0(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4232m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1.t f4234o = new w1.t();

    public q(d0 d0Var, boolean z2, boolean z10) {
        this.f4222a = d0Var;
        this.f4223b = z2;
        this.f4224c = z10;
    }

    @Override // d4.i
    public final void a() {
        this.f4227g = 0L;
        this.f4233n = false;
        this.f4232m = -9223372036854775807L;
        x1.o.a(this.f4228h);
        this.f4225d.g();
        this.f4226e.g();
        this.f.g();
        this.f4222a.f4077d.v(0);
        p pVar = this.f4230k;
        if (pVar != null) {
            pVar.f4213k = false;
            pVar.f4217o = false;
            o oVar = pVar.f4216n;
            oVar.f4192b = false;
            oVar.f4191a = false;
        }
    }

    @Override // d4.i
    public final void b(w1.t tVar) {
        int i;
        w1.a.k(this.f4229j);
        int i10 = w1.b0.f13686a;
        int i11 = tVar.f13739b;
        int i12 = tVar.f13740c;
        byte[] bArr = tVar.f13738a;
        this.f4227g += (long) tVar.a();
        this.f4229j.d(tVar.a(), tVar);
        while (true) {
            int iB = x1.o.b(bArr, i11, i12, this.f4228h);
            if (iB == i12) {
                g(bArr, i11, i12);
                return;
            }
            int i13 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i14 = iB - i11;
            if (i14 > 0) {
                g(bArr, i11, iB);
            }
            int i15 = i12 - iB;
            long j8 = this.f4227g - ((long) i15);
            f(i15, i14 < 0 ? -i14 : 0, j8, this.f4232m);
            h(i13, j8, this.f4232m);
            i11 = iB + i;
        }
    }

    @Override // d4.i
    public final void c(boolean z2) {
        w1.a.k(this.f4229j);
        int i = w1.b0.f13686a;
        if (z2) {
            this.f4222a.f4077d.v(0);
            f(0, 0, this.f4227g, this.f4232m);
            h(9, this.f4227g, this.f4232m);
            f(0, 0, this.f4227g, this.f4232m);
        }
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4232m = j8;
        this.f4233n = ((i & 2) != 0) | this.f4233n;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.i = g0Var.f4141e;
        g0Var.b();
        w2.g0 g0VarR = qVar.r(g0Var.f4140d, 2);
        this.f4229j = g0VarR;
        this.f4230k = new p(g0VarR, this.f4223b, this.f4224c);
        this.f4222a.b(qVar, g0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r26, int r27, long r28, long r30) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.q.f(int, int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.q.g(byte[], int, int):void");
    }

    public final void h(int i, long j8, long j9) {
        if (!this.f4231l || this.f4230k.f4207c) {
            this.f4225d.h(i);
            this.f4226e.h(i);
        }
        this.f.h(i);
        p pVar = this.f4230k;
        boolean z2 = this.f4233n;
        pVar.i = i;
        pVar.f4214l = j9;
        pVar.f4212j = j8;
        pVar.f4221s = z2;
        if (!pVar.f4206b || i != 1) {
            if (!pVar.f4207c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        o oVar = pVar.f4215m;
        pVar.f4215m = pVar.f4216n;
        pVar.f4216n = oVar;
        oVar.f4192b = false;
        oVar.f4191a = false;
        pVar.f4211h = 0;
        pVar.f4213k = true;
    }
}
