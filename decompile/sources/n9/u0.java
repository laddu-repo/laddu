package n9;

import android.text.TextUtils;
import android.util.Log;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 extends u1 {
    public char A;
    public long B;
    public String C;
    public final s0 D;
    public final s0 E;
    public final s0 F;
    public final s0 G;
    public final s0 H;
    public final s0 I;
    public final s0 J;
    public final s0 K;
    public final s0 L;

    public u0(n1 n1Var) {
        super(n1Var);
        this.A = (char) 0;
        this.B = -1L;
        this.D = new s0(this, 6, false, false);
        this.E = new s0(this, 6, true, false);
        this.F = new s0(this, 6, false, true);
        this.G = new s0(this, 5, false, false);
        this.H = new s0(this, 5, true, false);
        this.I = new s0(this, 5, false, true);
        this.J = new s0(this, 4, false, false);
        this.K = new s0(this, 3, false, false);
        this.L = new s0(this, 2, false, false);
    }

    public static t0 l1(String str) {
        if (str == null) {
            return null;
        }
        return new t0(str);
    }

    public static String o1(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String p12 = p1(obj, z10);
        String p13 = p1(obj2, z10);
        String p14 = p1(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(p12)) {
            sb2.append(str2);
            sb2.append(p12);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(p13)) {
            sb2.append(str2);
            sb2.append(p13);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(p14)) {
            sb2.append(str3);
            sb2.append(p14);
        }
        return sb2.toString();
    }

    public static String p1(Object obj, boolean z10) {
        String th;
        int lastIndexOf;
        String substring;
        String className;
        int lastIndexOf2;
        String substring2;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (obj == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            if (charAt == '-') {
                str = "-";
            }
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z10) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb3 = new StringBuilder(th);
            String canonicalName = n1.class.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) {
                substring = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                substring = canonicalName.substring(0, lastIndexOf);
            }
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length2 = stackTrace.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i6];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    if (TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) {
                        substring2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        substring2 = className.substring(0, lastIndexOf2);
                    }
                    if (substring2.equals(substring)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                }
                i6++;
            }
            return sb3.toString();
        }
        if (obj instanceof t0) {
            return ((t0) obj).f9482a;
        }
        if (z10) {
            return "-";
        }
        return obj.toString();
    }

    @Override // n9.u1
    public final boolean e1() {
        return false;
    }

    public final s0 h1() {
        return this.D;
    }

    public final s0 i1() {
        return this.G;
    }

    public final s0 j1() {
        return this.K;
    }

    public final s0 k1() {
        return this.L;
    }

    public final void m1(int i6, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        int i10;
        if (!z10 && Log.isLoggable(n1(), i6)) {
            Log.println(i6, n1(), o1(false, str, obj, obj2, obj3));
        }
        if (!z11 && i6 >= 5) {
            w8.x.g(str);
            l1 l1Var = ((n1) this.f4301y).D;
            if (l1Var == null) {
                Log.println(6, n1(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!l1Var.f9493z) {
                Log.println(6, n1(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i6 >= 9) {
                i10 = 8;
            } else {
                i10 = i6;
            }
            l1Var.m1(new r0(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String n1() {
        String str;
        synchronized (this) {
            try {
                if (this.C == null) {
                    ((n1) ((n1) this.f4301y).A.f4301y).getClass();
                    this.C = "FA";
                }
                w8.x.g(this.C);
                str = this.C;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
