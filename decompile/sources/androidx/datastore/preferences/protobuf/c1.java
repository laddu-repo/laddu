package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static b1 a(Object obj) {
        v vVar = (v) obj;
        b1 b1Var = vVar.unknownFields;
        if (b1Var != b1.f) {
            return b1Var;
        }
        b1 b1Var2 = new b1(0, new int[8], new Object[8], true);
        vVar.unknownFields = b1Var2;
        return b1Var2;
    }

    public static boolean b(int i, k kVar, Object obj) throws z {
        j jVar = (j) kVar.f798d;
        int i10 = kVar.f795a;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            kVar.w(0);
            ((b1) obj).c(i11 << 3, Long.valueOf(jVar.n()));
            return true;
        }
        if (i12 == 1) {
            kVar.w(1);
            ((b1) obj).c((i11 << 3) | 1, Long.valueOf(jVar.k()));
            return true;
        }
        if (i12 == 2) {
            ((b1) obj).c((i11 << 3) | 2, kVar.e());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw z.b();
            }
            kVar.w(5);
            ((b1) obj).c(5 | (i11 << 3), Integer.valueOf(jVar.j()));
            return true;
        }
        b1 b1Var = new b1(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i + 1;
        if (i15 >= 100) {
            throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.a() != Integer.MAX_VALUE && b(i15, kVar, b1Var)) {
        }
        if (i14 != kVar.f795a) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
        if (b1Var.f747e) {
            b1Var.f747e = false;
        }
        ((b1) obj).c(i13 | 3, b1Var);
        return true;
    }
}
