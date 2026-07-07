package k8;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends y1 {
    public String A;
    public final t0 B;
    public final t0 C;
    public final t0 D;
    public final t0 E;
    public final t0 F;
    public final t0 G;
    public final t0 H;
    public final t0 I;
    public final t0 J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public char f7796y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f7797z;

    public v0(p1 p1Var) {
        super(p1Var);
        this.f7796y = (char) 0;
        this.f7797z = -1L;
        this.B = new t0(this, 6, false, false);
        this.C = new t0(this, 6, true, false);
        this.D = new t0(this, 6, false, true);
        this.E = new t0(this, 5, false, false);
        this.F = new t0(this, 5, true, false);
        this.G = new t0(this, 5, false, true);
        this.H = new t0(this, 4, false, false);
        this.I = new t0(this, 3, false, false);
        this.J = new t0(this, 2, false, false);
    }

    public static u0 L(String str) {
        if (str == null) {
            return null;
        }
        return new u0(str);
    }

    public static String O(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String strP = P(obj, z2);
        String strP2 = P(obj2, z2);
        String strP3 = P(obj3, z2);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strP)) {
            sb2.append(str2);
            sb2.append(strP);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strP2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strP2);
        }
        if (!TextUtils.isEmpty(strP3)) {
            sb2.append(str3);
            sb2.append(strP3);
        }
        return sb2.toString();
    }

    public static String P(Object obj, boolean z2) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z2) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof u0 ? ((u0) obj).f7779a : z2 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z2 ? th.getClass().getName() : th.toString());
        String canonicalName = p1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb3.toString();
    }

    @Override // k8.y1
    public final boolean E() {
        return false;
    }

    public final t0 H() {
        return this.B;
    }

    public final t0 I() {
        return this.E;
    }

    public final t0 J() {
        return this.I;
    }

    public final t0 K() {
        return this.J;
    }

    public final void M(int i, boolean z2, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z2 && Log.isLoggable(N(), i)) {
            Log.println(i, N(), O(false, str, obj, obj2, obj3));
        }
        if (z10 || i < 5) {
            return;
        }
        t7.y.g(str);
        n1 n1Var = ((p1) this.f2053w).B;
        if (n1Var == null) {
            Log.println(6, N(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!n1Var.f7851x) {
                Log.println(6, N(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            n1Var.M(new s0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String N() {
        String str;
        synchronized (this) {
            try {
                if (this.A == null) {
                    ((p1) ((p1) this.f2053w).f7695y.f2053w).getClass();
                    this.A = "FA";
                }
                t7.y.g(this.A);
                str = this.A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
