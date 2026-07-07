package k8;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f7439c = new d2(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f7440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7441b;

    public d2(int i) {
        EnumMap enumMap = new EnumMap(c2.class);
        this.f7440a = enumMap;
        c2 c2Var = c2.f7422w;
        a2 a2Var = a2.f7373w;
        enumMap.put(c2Var, a2Var);
        enumMap.put(c2.f7423x, a2Var);
        this.f7441b = i;
    }

    public static String a(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static d2 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new d2(i);
        }
        EnumMap enumMap = new EnumMap(c2.class);
        for (c2 c2Var : b2.STORAGE.f7402v) {
            enumMap.put(c2Var, d(bundle.getString(c2Var.f7426v)));
        }
        return new d2(enumMap, i);
    }

    public static d2 c(int i, String str) {
        EnumMap enumMap = new EnumMap(c2.class);
        c2[] c2VarArr = b2.STORAGE.f7402v;
        for (int i10 = 0; i10 < c2VarArr.length; i10++) {
            String str2 = str == null ? "" : str;
            c2 c2Var = c2VarArr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put(c2Var, e(str2.charAt(i11)));
            } else {
                enumMap.put(c2Var, a2.f7373w);
            }
        }
        return new d2(enumMap, i);
    }

    public static a2 d(String str) {
        a2 a2Var = a2.f7373w;
        return str == null ? a2Var : str.equals("granted") ? a2.f7376z : str.equals("denied") ? a2.f7375y : a2Var;
    }

    public static a2 e(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? a2.f7373w : a2.f7376z : a2.f7375y : a2.f7374x;
    }

    public static char h(a2 a2Var) {
        if (a2Var == null) {
            return '-';
        }
        int iOrdinal = a2Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i10) {
        int i11 = -30;
        if (i == -20) {
            if (i10 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i11 = i;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i < i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        for (c2 c2Var : b2.STORAGE.f7402v) {
            if (this.f7440a.get(c2Var) != d2Var.f7440a.get(c2Var)) {
                return false;
            }
        }
        return this.f7441b == d2Var.f7441b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            k8.b2 r1 = k8.b2.STORAGE
            k8.c2[] r1 = r1.f7402v
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f7440a
            java.lang.Object r4 = r5.get(r4)
            k8.a2 r4 = (k8.a2) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.d2.f():java.lang.String");
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (c2 c2Var : b2.STORAGE.f7402v) {
            sb2.append(h((a2) this.f7440a.get(c2Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f7440a.values().iterator();
        int iHashCode = this.f7441b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((a2) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(c2 c2Var) {
        return ((a2) this.f7440a.get(c2Var)) != a2.f7375y;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.d2 j(k8.d2 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<k8.c2> r1 = k8.c2.class
            r0.<init>(r1)
            k8.b2 r1 = k8.b2.STORAGE
            k8.c2[] r1 = r1.f7402v
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f7440a
            java.lang.Object r5 = r5.get(r4)
            k8.a2 r5 = (k8.a2) r5
            java.util.EnumMap r6 = r9.f7440a
            java.lang.Object r6 = r6.get(r4)
            k8.a2 r6 = (k8.a2) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            k8.a2 r7 = k8.a2.f7373w
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            k8.a2 r7 = k8.a2.f7374x
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            k8.a2 r7 = k8.a2.f7375y
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            k8.a2 r5 = k8.a2.f7376z
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            k8.d2 r9 = new k8.d2
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.d2.j(k8.d2):k8.d2");
    }

    public final d2 k(d2 d2Var) {
        EnumMap enumMap = new EnumMap(c2.class);
        for (c2 c2Var : b2.STORAGE.f7402v) {
            a2 a2Var = (a2) this.f7440a.get(c2Var);
            if (a2Var == a2.f7373w) {
                a2Var = (a2) d2Var.f7440a.get(c2Var);
            }
            if (a2Var != null) {
                enumMap.put(c2Var, a2Var);
            }
        }
        return new d2(enumMap, this.f7441b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f7441b));
        for (c2 c2Var : b2.STORAGE.f7402v) {
            sb2.append(",");
            sb2.append(c2Var.f7426v);
            sb2.append("=");
            a2 a2Var = (a2) this.f7440a.get(c2Var);
            if (a2Var == null) {
                a2Var = a2.f7373w;
            }
            sb2.append(a2Var);
        }
        return sb2.toString();
    }

    public d2(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(c2.class);
        this.f7440a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f7441b = i;
    }
}
