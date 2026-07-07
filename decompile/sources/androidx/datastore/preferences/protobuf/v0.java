package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f864c;

    static {
        Class<?> cls;
        Class<?> cls2;
        r0 r0Var = r0.f848c;
        c1 c1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f862a = cls;
        try {
            r0 r0Var2 = r0.f848c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c1Var = (c1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f863b = c1Var;
        f864c = new c1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            iC0 += l.c0(((Integer) list.get(i)).intValue());
        }
        return iC0;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.a0(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.a0(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            iC0 += l.c0(((Integer) list.get(i)).intValue());
        }
        return iC0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            iC0 += l.c0(((Long) list.get(i)).longValue());
        }
        return iC0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iB0 += l.b0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iB0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iC0 += l.c0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iC0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i = 0; i < size; i++) {
            iB0 += l.b0(((Integer) list.get(i)).intValue());
        }
        return iB0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            iC0 += l.c0(((Long) list.get(i)).longValue());
        }
        return iC0;
    }

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
    public static void k(c1 c1Var, Object obj, Object obj2) {
        c1Var.getClass();
        v vVar = (v) obj;
        b1 b1Var = vVar.unknownFields;
        b1 b1Var2 = ((v) obj2).unknownFields;
        b1 b1Var3 = b1.f;
        if (!b1Var3.equals(b1Var2)) {
            if (b1Var3.equals(b1Var)) {
                int i = b1Var.f743a + b1Var2.f743a;
                int[] iArrCopyOf = Arrays.copyOf(b1Var.f744b, i);
                System.arraycopy(b1Var2.f744b, 0, iArrCopyOf, b1Var.f743a, b1Var2.f743a);
                Object[] objArrCopyOf = Arrays.copyOf(b1Var.f745c, i);
                System.arraycopy(b1Var2.f745c, 0, objArrCopyOf, b1Var.f743a, b1Var2.f743a);
                b1Var = new b1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                b1Var.getClass();
                if (!b1Var2.equals(b1Var3)) {
                    if (!b1Var.f747e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = b1Var.f743a + b1Var2.f743a;
                    b1Var.a(i10);
                    System.arraycopy(b1Var2.f744b, 0, b1Var.f744b, b1Var.f743a, b1Var2.f743a);
                    System.arraycopy(b1Var2.f745c, 0, b1Var.f745c, b1Var.f743a, b1Var2.f743a);
                    b1Var.f743a = i10;
                }
            }
        }
        vVar.unknownFields = b1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.h0(i, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = l.f;
            i11++;
        }
        lVar.v0(i11);
        while (i10 < list.size()) {
            lVar.f0(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void n(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                lVar.getClass();
                lVar.m0(i, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = l.f;
            i11 += 8;
        }
        lVar.v0(i11);
        while (i10 < list.size()) {
            lVar.n0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void o(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.o0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int iC0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iC0 += l.c0(((Integer) list.get(i11)).intValue());
        }
        lVar.v0(iC0);
        while (i10 < list.size()) {
            lVar.p0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void p(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.k0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = l.f;
            i11 += 4;
        }
        lVar.v0(i11);
        while (i10 < list.size()) {
            lVar.l0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.m0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = l.f;
            i11 += 8;
        }
        lVar.v0(i11);
        while (i10 < list.size()) {
            lVar.n0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void r(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                float fFloatValue = ((Float) list.get(i10)).floatValue();
                lVar.getClass();
                lVar.k0(i, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = l.f;
            i11 += 4;
        }
        lVar.v0(i11);
        while (i10 < list.size()) {
            lVar.l0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void s(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.o0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int iC0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iC0 += l.c0(((Integer) list.get(i11)).intValue());
        }
        lVar.v0(iC0);
        while (i10 < list.size()) {
            lVar.p0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.w0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int iC0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iC0 += l.c0(((Long) list.get(i11)).longValue());
        }
        lVar.v0(iC0);
        while (i10 < list.size()) {
            lVar.x0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.k0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = l.f;
            i11 += 4;
        }
        lVar.v0(i11);
        while (i10 < list.size()) {
            lVar.l0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void v(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.m0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = l.f;
            i11 += 8;
        }
        lVar.v0(i11);
        while (i10 < list.size()) {
            lVar.n0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void w(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                lVar.u0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int iB0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iB0 += l.b0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        lVar.v0(iB0);
        while (i10 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            lVar.v0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void x(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                lVar.w0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int iC0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iC0 += l.c0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        lVar.v0(iC0);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            lVar.x0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void y(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.u0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int iB0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iB0 += l.b0(((Integer) list.get(i11)).intValue());
        }
        lVar.v0(iB0);
        while (i10 < list.size()) {
            lVar.v0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void z(int i, List list, e0 e0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) e0Var.f759a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                lVar.w0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.t0(i, 2);
        int iC0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iC0 += l.c0(((Long) list.get(i11)).longValue());
        }
        lVar.v0(iC0);
        while (i10 < list.size()) {
            lVar.x0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static Object j(Object obj, int i, w wVar, Object obj2, c1 c1Var) {
        return obj2;
    }
}
