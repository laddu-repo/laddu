package cg;

import b1.v;
import bg.c0;
import bg.j0;
import bg.l0;
import bg.q;
import bg.w;
import bg.x;
import df.u;
import he.m;
import ie.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.k;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f2100e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f2101b;

    /* renamed from: c, reason: collision with root package name */
    public final q f2102c;

    /* renamed from: d, reason: collision with root package name */
    public final m f2103d;

    static {
        String str = c0.f1692y;
        f2100e = zb.d.t("/");
    }

    public f(ClassLoader classLoader) {
        x systemFileSystem = q.f1741a;
        k.e(systemFileSystem, "systemFileSystem");
        this.f2101b = classLoader;
        this.f2102c = systemFileSystem;
        this.f2103d = he.a.d(new v(this, 2));
    }

    @Override // bg.q
    public final j0 a(c0 file) {
        k.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // bg.q
    public final void b(c0 source, c0 target) {
        k.e(source, "source");
        k.e(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // bg.q
    public final void c(c0 c0Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // bg.q
    public final void d(c0 path) {
        k.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // bg.q
    public final List g(c0 c0Var) {
        c0 c0Var2 = f2100e;
        c0Var2.getClass();
        String q9 = c.b(c0Var2, c0Var, true).c(c0Var2).f1693x.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (he.i iVar : (List) this.f2103d.getValue()) {
            q qVar = (q) iVar.f6076x;
            c0 c0Var3 = (c0) iVar.f6077y;
            try {
                List g10 = qVar.g(c0Var3.d(q9));
                ArrayList arrayList = new ArrayList();
                for (Object obj : g10) {
                    if (l.o((c0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ie.l.x(arrayList, 10));
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    c0 c0Var4 = (c0) obj2;
                    k.e(c0Var4, "<this>");
                    arrayList2.add(c0Var2.d(u.E(df.m.X(c0Var4.f1693x.q(), c0Var3.f1693x.q()), '\\', '/')));
                }
                p.z(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return ie.j.Z(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + c0Var);
    }

    @Override // bg.q
    public final b0.e i(c0 path) {
        k.e(path, "path");
        if (l.o(path)) {
            c0 c0Var = f2100e;
            c0Var.getClass();
            String q9 = c.b(c0Var, path, true).c(c0Var).f1693x.q();
            for (he.i iVar : (List) this.f2103d.getValue()) {
                b0.e i6 = ((q) iVar.f6076x).i(((c0) iVar.f6077y).d(q9));
                if (i6 != null) {
                    return i6;
                }
            }
            return null;
        }
        return null;
    }

    @Override // bg.q
    public final w j(c0 c0Var) {
        if (l.o(c0Var)) {
            c0 c0Var2 = f2100e;
            c0Var2.getClass();
            String q9 = c.b(c0Var2, c0Var, true).c(c0Var2).f1693x.q();
            for (he.i iVar : (List) this.f2103d.getValue()) {
                try {
                    return ((q) iVar.f6076x).j(((c0) iVar.f6077y).d(q9));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + c0Var);
        }
        throw new FileNotFoundException("file not found: " + c0Var);
    }

    @Override // bg.q
    public final j0 k(c0 file) {
        k.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // bg.q
    public final l0 l(c0 file) {
        k.e(file, "file");
        if (l.o(file)) {
            c0 c0Var = f2100e;
            c0Var.getClass();
            URL resource = this.f2101b.getResource(c.b(c0Var, file, false).c(c0Var).f1693x.q());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                k.d(inputStream, "getInputStream(...)");
                return bg.b.l(inputStream);
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
