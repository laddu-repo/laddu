package bg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 extends q {

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f1737e;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f1738b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1739c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1740d;

    static {
        String str = c0.f1692y;
        f1737e = zb.d.t("/");
    }

    public p0(c0 c0Var, q qVar, LinkedHashMap linkedHashMap) {
        this.f1738b = c0Var;
        this.f1739c = qVar;
        this.f1740d = linkedHashMap;
    }

    @Override // bg.q
    public final j0 a(c0 file) {
        kotlin.jvm.internal.k.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bg.q
    public final void b(c0 source, c0 target) {
        kotlin.jvm.internal.k.e(source, "source");
        kotlin.jvm.internal.k.e(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bg.q
    public final void c(c0 c0Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // bg.q
    public final void d(c0 path) {
        kotlin.jvm.internal.k.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bg.q
    public final List g(c0 c0Var) {
        c0 c0Var2 = f1737e;
        c0Var2.getClass();
        cg.g gVar = (cg.g) this.f1740d.get(cg.c.b(c0Var2, c0Var, true));
        if (gVar != null) {
            return ie.j.Z(gVar.f2119q);
        }
        throw new IOException("not a directory: " + c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    @Override // bg.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b0.e i(bg.c0 r26) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.p0.i(bg.c0):b0.e");
    }

    @Override // bg.q
    public final w j(c0 c0Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // bg.q
    public final j0 k(c0 file) {
        kotlin.jvm.internal.k.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bg.q
    public final l0 l(c0 file) {
        Throwable th;
        f0 f0Var;
        kotlin.jvm.internal.k.e(file, "file");
        c0 c0Var = f1737e;
        c0Var.getClass();
        cg.g gVar = (cg.g) this.f1740d.get(cg.c.b(c0Var, file, true));
        if (gVar != null) {
            long j = gVar.f2109f;
            w j10 = this.f1739c.j(this.f1738b);
            try {
                f0Var = b.d(j10.d(gVar.f2111h));
                try {
                    j10.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (j10 != null) {
                    try {
                        j10.close();
                    } catch (Throwable th4) {
                        he.a.a(th3, th4);
                    }
                }
                th = th3;
                f0Var = null;
            }
            if (th == null) {
                kotlin.jvm.internal.k.e(f0Var, "<this>");
                cg.b.f(f0Var, null);
                if (gVar.f2110g == 0) {
                    return new cg.e(f0Var, j, true);
                }
                return new cg.e(new v(b.d(new cg.e(f0Var, gVar.f2108e, true)), new Inflater(true)), j, false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + file);
    }
}
