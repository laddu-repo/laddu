package c6;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements a6.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e2.a0 f2160j = new e2.a0(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6.f f2161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.f f2162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a6.f f2163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2164e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f2165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a6.i f2166h;
    public final a6.m i;

    public d0(d6.f fVar, a6.f fVar2, a6.f fVar3, int i, int i10, a6.m mVar, Class cls, a6.i iVar) {
        this.f2161b = fVar;
        this.f2162c = fVar2;
        this.f2163d = fVar3;
        this.f2164e = i;
        this.f = i10;
        this.i = mVar;
        this.f2165g = cls;
        this.f2166h = iVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a6.f
    public final void a(MessageDigest messageDigest) {
        Object objF;
        d6.f fVar = this.f2161b;
        synchronized (fVar) {
            d6.e eVar = fVar.f4345b;
            d6.h hVarE = (d6.h) ((ArrayDeque) eVar.f2053w).poll();
            if (hVarE == null) {
                hVarE = eVar.E();
            }
            d6.d dVar = (d6.d) hVarE;
            dVar.f4341b = 8;
            dVar.f4342c = byte[].class;
            objF = fVar.f(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.f2164e).putInt(this.f).array();
        this.f2163d.a(messageDigest);
        this.f2162c.a(messageDigest);
        messageDigest.update(bArr);
        a6.m mVar = this.i;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.f2166h.a(messageDigest);
        e2.a0 a0Var = f2160j;
        Class cls = this.f2165g;
        byte[] bytes = (byte[]) a0Var.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a6.f.f155a);
            a0Var.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f2161b.h(bArr);
    }

    @Override // a6.f
    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f == d0Var.f && this.f2164e == d0Var.f2164e && v6.m.b(this.i, d0Var.i) && this.f2165g.equals(d0Var.f2165g) && this.f2162c.equals(d0Var.f2162c) && this.f2163d.equals(d0Var.f2163d) && this.f2166h.equals(d0Var.f2166h)) {
                return true;
            }
        }
        return false;
    }

    @Override // a6.f
    public final int hashCode() {
        int iHashCode = ((((this.f2163d.hashCode() + (this.f2162c.hashCode() * 31)) * 31) + this.f2164e) * 31) + this.f;
        a6.m mVar = this.i;
        if (mVar != null) {
            iHashCode = (iHashCode * 31) + mVar.hashCode();
        }
        return this.f2166h.f161b.hashCode() + ((this.f2165g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f2162c + ", signature=" + this.f2163d + ", width=" + this.f2164e + ", height=" + this.f + ", decodedResourceClass=" + this.f2165g + ", transformation='" + this.i + "', options=" + this.f2166h + '}';
    }
}
