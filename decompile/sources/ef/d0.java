package ef;

import java.io.Closeable;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c0 f4963v;

    static {
        vf.f fVar = vf.f.f13604y;
        de.i.e(fVar, "<this>");
        vf.c cVar = new vf.c();
        cVar.n0(fVar);
        f4963v = new c0(fVar.f13605v.length, cVar);
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ff.d.b(l());
    }

    public abstract u i();

    public abstract vf.e l();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final String m() {
        Charset charsetA;
        vf.e eVarL = l();
        String th = null;
        try {
            u uVarI = i();
            if (uVarI == null || (charsetA = u.a(uVarI)) == null) {
                charsetA = ke.a.f7954a;
            }
            String strI0 = eVarL.i0(ff.f.e(eVarL, charsetA));
            try {
                eVarL.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = strI0;
        } catch (Throwable th3) {
            th = th3;
            if (eVarL != null) {
                try {
                    eVarL.close();
                } catch (Throwable th4) {
                    com.bumptech.glide.e.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
