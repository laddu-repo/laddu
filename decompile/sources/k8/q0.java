package k8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f7705b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f7706c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f7707d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f7708a;

    public q0(g2 g2Var) {
        this.f7708a = g2Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        t7.y.g(atomicReference);
        t7.y.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f7708a.R() ? str : g(str, e2.f, e2.f7460a, f7705b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f7708a.R() ? str : g(str, e2.i, e2.f7466h, f7706c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f7708a.R() ? str : str.startsWith("_exp_") ? d0.d.l("experiment_id(", str, ")") : g(str, e2.f7470m, e2.f7469l, f7707d);
    }

    public final String d(v vVar) {
        g2 g2Var = this.f7708a;
        if (!g2Var.R()) {
            return vVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(vVar.f7793x);
        sb2.append(",name=");
        sb2.append(a(vVar.f7791v));
        sb2.append(",params=");
        u uVar = vVar.f7792w;
        sb2.append(uVar == null ? null : !g2Var.R() ? uVar.f7778v.toString() : e(uVar.d()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f7708a.R()) {
            return bundle.toString();
        }
        StringBuilder sbB = y.e.b("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbB.length() != 8) {
                sbB.append(", ");
            }
            sbB.append(b(str));
            sbB.append("=");
            Object obj = bundle.get(str);
            sbB.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbB.append("}]");
        return sbB.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbB = y.e.b("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbB.length() != 1) {
                    sbB.append(", ");
                }
                sbB.append(strE);
            }
        }
        sbB.append("]");
        return sbB.toString();
    }
}
