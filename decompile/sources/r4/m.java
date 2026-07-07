package r4;

import p4.c0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ud.h implements ce.l {
    public final /* synthetic */ n A;
    public final /* synthetic */ c0 B;
    public final /* synthetic */ ud.h C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11201z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(n nVar, c0 c0Var, ce.p pVar, sd.c cVar) {
        super(1, cVar);
        this.A = nVar;
        this.B = c0Var;
        this.C = (ud.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ce.p, ud.h] */
    @Override // ce.l
    public final Object a(Object obj) {
        c0 c0Var = this.B;
        ?? r22 = this.C;
        return new m(this.A, c0Var, r22, (sd.c) obj).o(od.l.f10126a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ce.p, ud.h] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ud.a
    public final Object o(Object obj) {
        int i = this.f11201z;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fa.b.z(obj);
            return obj;
        }
        fa.b.z(obj);
        this.f11201z = 1;
        Object objE = this.A.e(this.B, this.C, this);
        td.a aVar = td.a.f12544v;
        return objE == aVar ? aVar : objE;
    }
}
