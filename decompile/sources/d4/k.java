package d4;

import c2.o0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f4153r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w2.g0 f4155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f4156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1.t f4158e;
    public final o0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f4159g = new boolean[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f4160h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4168q;

    public k(d0 d0Var, String str) {
        this.f4156c = d0Var;
        this.f4157d = str;
        j jVar = new j();
        jVar.f4152d = new byte[128];
        this.f4160h = jVar;
        if (d0Var != null) {
            this.f = new o0(178);
            this.f4158e = new w1.t();
        } else {
            this.f = null;
            this.f4158e = null;
        }
        this.f4164m = -9223372036854775807L;
        this.f4166o = -9223372036854775807L;
    }

    @Override // d4.i
    public final void a() {
        x1.o.a(this.f4159g);
        j jVar = this.f4160h;
        jVar.f4149a = false;
        jVar.f4150b = 0;
        jVar.f4151c = 0;
        o0 o0Var = this.f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.i = 0L;
        this.f4161j = false;
        this.f4164m = -9223372036854775807L;
        this.f4166o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
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
    public final void b(w1.t r23) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k.b(w1.t):void");
    }

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
    public final void c(boolean z2) {
        w1.a.k(this.f4155b);
        if (z2) {
            boolean z10 = this.f4167p;
            this.f4155b.a(this.f4166o, z10 ? 1 : 0, (int) (this.i - this.f4165n), 0, null);
        }
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4164m = j8;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f4154a = g0Var.f4141e;
        g0Var.b();
        this.f4155b = qVar.r(g0Var.f4140d, 2);
        d0 d0Var = this.f4156c;
        if (d0Var != null) {
            d0Var.b(qVar, g0Var);
        }
    }
}
