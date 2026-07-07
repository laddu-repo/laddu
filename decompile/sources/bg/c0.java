package bg;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 implements Comparable {

    /* renamed from: y, reason: collision with root package name */
    public static final String f1692y;

    /* renamed from: x, reason: collision with root package name */
    public final n f1693x;

    static {
        String separator = File.separator;
        kotlin.jvm.internal.k.d(separator, "separator");
        f1692y = separator;
    }

    public c0(n bytes) {
        kotlin.jvm.internal.k.e(bytes, "bytes");
        this.f1693x = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a10 = cg.c.a(this);
        n nVar = this.f1693x;
        if (a10 == -1) {
            a10 = 0;
        } else if (a10 < nVar.d() && nVar.i(a10) == 92) {
            a10++;
        }
        int d10 = nVar.d();
        int i6 = a10;
        while (a10 < d10) {
            if (nVar.i(a10) == 47 || nVar.i(a10) == 92) {
                arrayList.add(nVar.n(i6, a10));
                i6 = a10 + 1;
            }
            a10++;
        }
        if (i6 < nVar.d()) {
            arrayList.add(nVar.n(i6, nVar.d()));
        }
        return arrayList;
    }

    public final c0 b() {
        n nVar = cg.c.f2093d;
        n nVar2 = this.f1693x;
        if (!kotlin.jvm.internal.k.a(nVar2, nVar)) {
            n nVar3 = cg.c.f2090a;
            if (!kotlin.jvm.internal.k.a(nVar2, nVar3)) {
                n prefix = cg.c.f2091b;
                if (!kotlin.jvm.internal.k.a(nVar2, prefix)) {
                    n suffix = cg.c.f2094e;
                    nVar2.getClass();
                    kotlin.jvm.internal.k.e(suffix, "suffix");
                    int d10 = nVar2.d();
                    byte[] bArr = suffix.f1728x;
                    if (!nVar2.l(d10 - bArr.length, suffix, bArr.length) || (nVar2.d() != 2 && !nVar2.l(nVar2.d() - 3, nVar3, 1) && !nVar2.l(nVar2.d() - 3, prefix, 1))) {
                        int k8 = n.k(nVar2, nVar3);
                        if (k8 == -1) {
                            k8 = n.k(nVar2, prefix);
                        }
                        if (k8 == 2 && f() != null) {
                            if (nVar2.d() != 3) {
                                return new c0(n.o(nVar2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k8 == 1) {
                            kotlin.jvm.internal.k.e(prefix, "prefix");
                            if (nVar2.l(0, prefix, prefix.d())) {
                                return null;
                            }
                        }
                        if (k8 == -1 && f() != null) {
                            if (nVar2.d() != 2) {
                                return new c0(n.o(nVar2, 0, 2, 1));
                            }
                            return null;
                        }
                        if (k8 == -1) {
                            return new c0(nVar);
                        }
                        if (k8 == 0) {
                            return new c0(n.o(nVar2, 0, 1, 1));
                        }
                        return new c0(n.o(nVar2, 0, k8, 1));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, bg.k] */
    public final c0 c(c0 other) {
        c0 c0Var;
        kotlin.jvm.internal.k.e(other, "other");
        n nVar = other.f1693x;
        int a10 = cg.c.a(this);
        n nVar2 = this.f1693x;
        c0 c0Var2 = null;
        if (a10 == -1) {
            c0Var = null;
        } else {
            c0Var = new c0(nVar2.n(0, a10));
        }
        int a11 = cg.c.a(other);
        if (a11 != -1) {
            c0Var2 = new c0(nVar.n(0, a11));
        }
        if (kotlin.jvm.internal.k.a(c0Var, c0Var2)) {
            ArrayList a12 = a();
            ArrayList a13 = other.a();
            int min = Math.min(a12.size(), a13.size());
            int i6 = 0;
            while (i6 < min && kotlin.jvm.internal.k.a(a12.get(i6), a13.get(i6))) {
                i6++;
            }
            if (i6 == min && nVar2.d() == nVar.d()) {
                return zb.d.t(".");
            }
            if (a13.subList(i6, a13.size()).indexOf(cg.c.f2094e) == -1) {
                ?? obj = new Object();
                n c10 = cg.c.c(other);
                if (c10 == null && (c10 = cg.c.c(this)) == null) {
                    c10 = cg.c.f(f1692y);
                }
                int size = a13.size();
                for (int i10 = i6; i10 < size; i10++) {
                    obj.k0(cg.c.f2094e);
                    obj.k0(c10);
                }
                int size2 = a12.size();
                while (i6 < size2) {
                    obj.k0((n) a12.get(i6));
                    obj.k0(c10);
                    i6++;
                }
                return cg.c.d(obj, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c0 other = (c0) obj;
        kotlin.jvm.internal.k.e(other, "other");
        return this.f1693x.compareTo(other.f1693x);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bg.k] */
    public final c0 d(String child) {
        kotlin.jvm.internal.k.e(child, "child");
        ?? obj = new Object();
        obj.s0(child);
        return cg.c.b(this, cg.c.d(obj, false), false);
    }

    public final Path e() {
        Path path;
        path = Paths.get(this.f1693x.q(), new String[0]);
        kotlin.jvm.internal.k.d(path, "get(...)");
        return path;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c0) && kotlin.jvm.internal.k.a(((c0) obj).f1693x, this.f1693x)) {
            return true;
        }
        return false;
    }

    public final Character f() {
        n nVar = cg.c.f2090a;
        n nVar2 = this.f1693x;
        if (n.g(nVar2, nVar) == -1 && nVar2.d() >= 2 && nVar2.i(1) == 58) {
            char i6 = (char) nVar2.i(0);
            if (('a' <= i6 && i6 < '{') || ('A' <= i6 && i6 < '[')) {
                return Character.valueOf(i6);
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        return this.f1693x.hashCode();
    }

    public final File toFile() {
        return new File(this.f1693x.q());
    }

    public final String toString() {
        return this.f1693x.q();
    }
}
