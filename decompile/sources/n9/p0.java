package n9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f9428b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f9429c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f9430d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final k7.d f9431a;

    public p0(k7.d dVar) {
        this.f9431a = dVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        w8.x.g(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8.x.b(z10);
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (Objects.equals(str, strArr[i6])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i6];
                        if (str2 == null) {
                            str2 = strArr2[i6] + "(" + strArr[i6] + ")";
                            strArr3[i6] = str2;
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
        if (!this.f9431a.V()) {
            return str;
        }
        return g(str, a2.f9159c, a2.f9157a, f9428b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f9431a.V()) {
            return str;
        }
        return g(str, a2.f9162f, a2.f9161e, f9429c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f9431a.V()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return h8.c.m("experiment_id(", str, ")");
        }
        return g(str, a2.j, a2.f9165i, f9430d);
    }

    public final String d(v vVar) {
        String e10;
        k7.d dVar = this.f9431a;
        if (!dVar.V()) {
            return vVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(vVar.f9502z);
        sb2.append(",name=");
        sb2.append(a(vVar.f9500x));
        sb2.append(",params=");
        u uVar = vVar.f9501y;
        if (uVar == null) {
            e10 = null;
        } else if (!dVar.V()) {
            e10 = uVar.f9492x.toString();
        } else {
            e10 = e(uVar.d());
        }
        sb2.append(e10);
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f9431a.V()) {
            return bundle.toString();
        }
        StringBuilder b10 = y.e.b("Bundle[{");
        for (String str : bundle.keySet()) {
            if (b10.length() != 8) {
                b10.append(", ");
            }
            b10.append(b(str));
            b10.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = f((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = f(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            b10.append(valueOf);
        }
        b10.append("}]");
        return b10.toString();
    }

    public final String f(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder b10 = y.e.b("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = e((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (b10.length() != 1) {
                    b10.append(", ");
                }
                b10.append(valueOf);
            }
        }
        b10.append("]");
        return b10.toString();
    }
}
