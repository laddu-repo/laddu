package d4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f4078x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4079a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4083e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w2.g0 f4085h;
    public w2.g0 i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4090n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4094r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4096t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w2.g0 f4098v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f4099w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.f f4080b = new u3.f(7, new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f4081c = new w1.t(Arrays.copyOf(f4078x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4091o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4092p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4095s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4097u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4086j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4087k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4088l = 256;

    public e(int i, String str, String str2, boolean z2) {
        this.f4079a = z2;
        this.f4082d = str;
        this.f4083e = i;
        this.f = str2;
    }

    @Override // d4.i
    public final void a() {
        this.f4097u = -9223372036854775807L;
        this.f4090n = false;
        this.f4086j = 0;
        this.f4087k = 0;
        this.f4088l = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
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
    @Override // d4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w1.t r24) throws t1.g0 {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e.b(w1.t):void");
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4097u = j8;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f4084g = g0Var.f4141e;
        g0Var.b();
        w2.g0 g0VarR = qVar.r(g0Var.f4140d, 1);
        this.f4085h = g0VarR;
        this.f4098v = g0VarR;
        if (!this.f4079a) {
            this.i = new w2.n();
            return;
        }
        g0Var.a();
        g0Var.b();
        w2.g0 g0VarR2 = qVar.r(g0Var.f4140d, 5);
        this.i = g0VarR2;
        t1.n nVar = new t1.n();
        g0Var.b();
        nVar.f12026a = g0Var.f4141e;
        nVar.f12035l = t1.f0.p(this.f);
        nVar.f12036m = t1.f0.p("application/id3");
        d0.d.r(nVar, g0VarR2);
    }

    @Override // d4.i
    public final void c(boolean z2) {
    }
}
