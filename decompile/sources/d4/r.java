package d4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.g0 f4235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4239e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4241h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4245m;

    public r(w2.g0 g0Var) {
        this.f4235a = g0Var;
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
    public final void a(int i) {
        long j8 = this.f4244l;
        if (j8 != -9223372036854775807L) {
            long j9 = this.f4236b;
            long j10 = this.f4243k;
            if (j9 == j10) {
                return;
            }
            int i10 = (int) (j9 - j10);
            this.f4235a.a(j8, this.f4245m ? 1 : 0, i10, i, null);
        }
    }
}
