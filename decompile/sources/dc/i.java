package dc;

import d1.c1;
import d1.k1;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f4485a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f4486b = new h(null, null, null, null, null);

    @Override // d1.c1
    public final /* bridge */ /* synthetic */ Object a() {
        return f4486b;
    }

    @Override // d1.c1
    public final void b(Object obj, k1 k1Var) throws IOException {
        byte[] bytes = bf.b.f1615d.b(h.Companion.serializer(), (h) obj).getBytes(ke.a.f7954a);
        de.i.d(bytes, "getBytes(...)");
        k1Var.write(bytes);
    }

    @Override // d1.c1
    public final Object c(FileInputStream fileInputStream) throws d1.c {
        try {
            bf.b bVar = bf.b.f1615d;
            String str = new String(qf.g.E(fileInputStream), ke.a.f7954a);
            bVar.getClass();
            return (h) bVar.a(h.Companion.serializer(), str);
        } catch (Exception e7) {
            throw new d1.c("Cannot parse session configs", e7);
        }
    }
}
