package bg;

import java.io.FileNotFoundException;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final x f1741a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bg.x] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f1741a = r02;
        String str = c0.f1692y;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.k.d(property, "getProperty(...)");
        zb.d.t(property);
        ClassLoader classLoader = cg.f.class.getClassLoader();
        kotlin.jvm.internal.k.d(classLoader, "getClassLoader(...)");
        new cg.f(classLoader);
    }

    public abstract j0 a(c0 c0Var);

    public abstract void b(c0 c0Var, c0 c0Var2);

    public abstract void c(c0 c0Var);

    public abstract void d(c0 c0Var);

    public final void e(c0 path) {
        kotlin.jvm.internal.k.e(path, "path");
        d(path);
    }

    public final boolean f(c0 path) {
        kotlin.jvm.internal.k.e(path, "path");
        if (i(path) != null) {
            return true;
        }
        return false;
    }

    public abstract List g(c0 c0Var);

    public final b0.e h(c0 path) {
        kotlin.jvm.internal.k.e(path, "path");
        b0.e i6 = i(path);
        if (i6 != null) {
            return i6;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract b0.e i(c0 c0Var);

    public abstract w j(c0 c0Var);

    public abstract j0 k(c0 c0Var);

    public abstract l0 l(c0 c0Var);
}
