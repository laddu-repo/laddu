package cg;

import bg.c0;
import bg.n;
import kotlin.jvm.internal.k;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2090a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f2091b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f2092c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f2093d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f2094e;

    static {
        n nVar = n.A;
        f2090a = l.u("/");
        f2091b = l.u("\\");
        f2092c = l.u("/\\");
        f2093d = l.u(".");
        f2094e = l.u("..");
    }

    public static final int a(c0 c0Var) {
        n nVar = c0Var.f1693x;
        if (nVar.d() != 0) {
            if (nVar.i(0) != 47) {
                if (nVar.i(0) == 92) {
                    if (nVar.d() > 2 && nVar.i(1) == 92) {
                        n other = f2091b;
                        k.e(other, "other");
                        int f3 = nVar.f(2, other.h());
                        if (f3 == -1) {
                            return nVar.d();
                        }
                        return f3;
                    }
                } else if (nVar.d() > 2 && nVar.i(1) == 58 && nVar.i(2) == 92) {
                    char i6 = (char) nVar.i(0);
                    if ('a' > i6 || i6 >= '{') {
                        if ('A' <= i6 && i6 < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bg.k] */
    public static final c0 b(c0 c0Var, c0 child, boolean z10) {
        k.e(child, "child");
        if (a(child) != -1 || child.f() != null) {
            return child;
        }
        n c10 = c(c0Var);
        if (c10 == null && (c10 = c(child)) == null) {
            c10 = f(c0.f1692y);
        }
        ?? obj = new Object();
        obj.k0(c0Var.f1693x);
        if (obj.f1726y > 0) {
            obj.k0(c10);
        }
        obj.k0(child.f1693x);
        return d(obj, z10);
    }

    public static final n c(c0 c0Var) {
        n nVar = c0Var.f1693x;
        n nVar2 = f2090a;
        if (n.g(nVar, nVar2) != -1) {
            return nVar2;
        }
        n nVar3 = c0Var.f1693x;
        n nVar4 = f2091b;
        if (n.g(nVar3, nVar4) != -1) {
            return nVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b A[EDGE_INSN: B:72:0x011b->B:73:0x011b BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bg.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final bg.c0 d(bg.k r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.c.d(bg.k, boolean):bg.c0");
    }

    public static final n e(byte b10) {
        if (b10 != 47) {
            if (b10 == 92) {
                return f2091b;
            }
            throw new IllegalArgumentException(h8.c.i(b10, "not a directory separator: "));
        }
        return f2090a;
    }

    public static final n f(String str) {
        if (k.a(str, "/")) {
            return f2090a;
        }
        if (k.a(str, "\\")) {
            return f2091b;
        }
        throw new IllegalArgumentException(r4.a.k("not a directory separator: ", str));
    }
}
