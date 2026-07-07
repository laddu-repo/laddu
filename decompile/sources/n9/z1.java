package n9;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: c, reason: collision with root package name */
    public static final z1 f9569c = new z1(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f9570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9571b;

    public z1(int i6) {
        EnumMap enumMap = new EnumMap(y1.class);
        this.f9570a = enumMap;
        y1 y1Var = y1.AD_STORAGE;
        w1 w1Var = w1.UNINITIALIZED;
        enumMap.put((EnumMap) y1Var, (y1) w1Var);
        enumMap.put((EnumMap) y1.ANALYTICS_STORAGE, (y1) w1Var);
        this.f9571b = i6;
    }

    public static String a(int i6) {
        if (i6 != -30) {
            if (i6 != -20) {
                if (i6 != -10) {
                    if (i6 != 0) {
                        if (i6 != 30) {
                            if (i6 != 90) {
                                if (i6 != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static z1 b(int i6, Bundle bundle) {
        if (bundle == null) {
            return new z1(i6);
        }
        EnumMap enumMap = new EnumMap(y1.class);
        for (y1 y1Var : x1.STORAGE.f9528x) {
            enumMap.put((EnumMap) y1Var, (y1) d(bundle.getString(y1Var.f9536x)));
        }
        return new z1(enumMap, i6);
    }

    public static z1 c(int i6, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(y1.class);
        y1[] y1VarArr = x1.STORAGE.f9528x;
        for (int i10 = 0; i10 < y1VarArr.length; i10++) {
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str2 = str;
            }
            y1 y1Var = y1VarArr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put((EnumMap) y1Var, (y1) e(str2.charAt(i11)));
            } else {
                enumMap.put((EnumMap) y1Var, (y1) w1.UNINITIALIZED);
            }
        }
        return new z1(enumMap, i6);
    }

    public static w1 d(String str) {
        w1 w1Var = w1.UNINITIALIZED;
        if (str == null) {
            return w1Var;
        }
        if (str.equals("granted")) {
            return w1.GRANTED;
        }
        if (str.equals("denied")) {
            return w1.DENIED;
        }
        return w1Var;
    }

    public static w1 e(char c10) {
        if (c10 != '+') {
            if (c10 != '0') {
                if (c10 != '1') {
                    return w1.UNINITIALIZED;
                }
                return w1.GRANTED;
            }
            return w1.DENIED;
        }
        return w1.POLICY;
    }

    public static char h(w1 w1Var) {
        if (w1Var != null) {
            int ordinal = w1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static boolean l(int i6, int i10) {
        int i11 = -30;
        if (i6 == -20) {
            if (i10 != -30) {
                i6 = -20;
            } else {
                return true;
            }
        }
        if (i6 == -30) {
            if (i10 == -20) {
                return true;
            }
        } else {
            i11 = i6;
        }
        if (i11 != i10 && i6 >= i10) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        for (y1 y1Var : x1.STORAGE.f9528x) {
            if (this.f9570a.get(y1Var) != z1Var.f9570a.get(y1Var)) {
                return false;
            }
        }
        if (this.f9571b != z1Var.f9571b) {
            return false;
        }
        return true;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (y1 y1Var : x1.STORAGE.f9528x) {
            w1 w1Var = (w1) this.f9570a.get(y1Var);
            char c10 = '-';
            if (w1Var != null && (ordinal = w1Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c10 = '0';
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (y1 y1Var : x1.STORAGE.f9528x) {
            sb2.append(h((w1) this.f9570a.get(y1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f9570a.values().iterator();
        int i6 = this.f9571b * 17;
        while (it.hasNext()) {
            i6 = (i6 * 31) + ((w1) it.next()).hashCode();
        }
        return i6;
    }

    public final boolean i(y1 y1Var) {
        if (((w1) this.f9570a.get(y1Var)) == w1.DENIED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.z1 j(n9.z1 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<n9.y1> r1 = n9.y1.class
            r0.<init>(r1)
            n9.x1 r1 = n9.x1.STORAGE
            n9.y1[] r1 = r1.f9528x
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f9570a
            java.lang.Object r5 = r5.get(r4)
            n9.w1 r5 = (n9.w1) r5
            java.util.EnumMap r6 = r9.f9570a
            java.lang.Object r6 = r6.get(r4)
            n9.w1 r6 = (n9.w1) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            n9.w1 r7 = n9.w1.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            n9.w1 r7 = n9.w1.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            n9.w1 r7 = n9.w1.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            n9.w1 r5 = n9.w1.GRANTED
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
            n9.z1 r9 = new n9.z1
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.z1.j(n9.z1):n9.z1");
    }

    public final z1 k(z1 z1Var) {
        EnumMap enumMap = new EnumMap(y1.class);
        for (y1 y1Var : x1.STORAGE.f9528x) {
            w1 w1Var = (w1) this.f9570a.get(y1Var);
            if (w1Var == w1.UNINITIALIZED) {
                w1Var = (w1) z1Var.f9570a.get(y1Var);
            }
            if (w1Var != null) {
                enumMap.put((EnumMap) y1Var, (y1) w1Var);
            }
        }
        return new z1(enumMap, this.f9571b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f9571b));
        for (y1 y1Var : x1.STORAGE.f9528x) {
            sb2.append(",");
            sb2.append(y1Var.f9536x);
            sb2.append("=");
            w1 w1Var = (w1) this.f9570a.get(y1Var);
            if (w1Var == null) {
                w1Var = w1.UNINITIALIZED;
            }
            sb2.append(w1Var);
        }
        return sb2.toString();
    }

    public z1(EnumMap enumMap, int i6) {
        EnumMap enumMap2 = new EnumMap(y1.class);
        this.f9570a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f9571b = i6;
    }
}
