package d4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.g0 f4174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4178e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4180h;

    public m(w2.g0 g0Var) {
        this.f4174a = g0Var;
    }

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f4176c) {
            int i11 = this.f;
            int i12 = (i + 1) - i11;
            if (i12 >= i10) {
                this.f = (i10 - i) + i11;
            } else {
                this.f4177d = ((bArr[i12] & 192) >> 6) == 0;
                this.f4176c = false;
            }
        }
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
    public final void b(int i, long j8, boolean z2) {
        w1.a.j(this.f4180h != -9223372036854775807L);
        if (this.f4178e == 182 && z2 && this.f4175b) {
            this.f4174a.a(this.f4180h, this.f4177d ? 1 : 0, (int) (j8 - this.f4179g), i, null);
        }
        if (this.f4178e != 179) {
            this.f4179g = j8;
        }
    }
}
