package ac;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements d1.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f432a;

    public n0(x0 x0Var) {
        de.i.e(x0Var, "sessionGenerator");
        this.f432a = x0Var;
    }

    @Override // d1.c1
    public final Object a() {
        return new m0(this.f432a.a(null), null, null);
    }

    @Override // d1.c1
    public final void b(Object obj, d1.k1 k1Var) throws IOException {
        byte[] bytes = bf.b.f1615d.b(m0.Companion.serializer(), (m0) obj).getBytes(ke.a.f7954a);
        de.i.d(bytes, "getBytes(...)");
        k1Var.write(bytes);
    }

    @Override // d1.c1
    public final Object c(FileInputStream fileInputStream) throws d1.c {
        try {
            bf.b bVar = bf.b.f1615d;
            String str = new String(qf.g.E(fileInputStream), ke.a.f7954a);
            bVar.getClass();
            return (m0) bVar.a(m0.Companion.serializer(), str);
        } catch (Exception e7) {
            throw new d1.c("Cannot parse session data", e7);
        }
    }
}
