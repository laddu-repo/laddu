package r4;

import androidx.lifecycle.f0;
import androidx.lifecycle.k1;
import androidx.lifecycle.n1;
import cf.m;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.t;
import f2.i;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import ic.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e;
import r1.p;
import w8.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static n A(j jVar, q qVar, s sVar, ArrayList arrayList) {
        String str = qVar.f2396x;
        if (jVar.d(str)) {
            n a10 = jVar.a(str);
            if (a10 instanceof h) {
                return ((h) a10).i(sVar, arrayList);
            }
            throw new IllegalArgumentException(k.c(str, " is not a function"));
        }
        if ("hasOwnProperty".equals(str)) {
            a8.a.w("hasOwnProperty", 1, arrayList);
            if (jVar.d(((t) sVar.f6782y).c(sVar, (n) arrayList.get(0)).f())) {
                return n.f2357f;
            }
            return n.f2358g;
        }
        throw new IllegalArgumentException(k("Object has no function ", str));
    }

    public static k1 a(n1 n1Var, e eVar, o1.e eVar2) {
        return n1Var.c(m.r(eVar), eVar2);
    }

    public static void b(f0 owner) {
        kotlin.jvm.internal.k.e(owner, "owner");
    }

    public static int c(int i6) {
        switch (i6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i6) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static int d(int i6, int i10, int i11, int i12) {
        return i6 | i10 | i11 | 128 | i12;
    }

    public static /* synthetic */ int e(int i6) {
        switch (i6) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static boolean f(int i6, boolean z10) {
        int i10 = i6 & 7;
        if (i10 != 4) {
            if (!z10 || i10 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int g(int i6, int i10, int i11) {
        return d5.G(i6) + i10 + i11;
    }

    public static int h(int i6, int i10, int i11, int i12) {
        return d5.G(i6) + i10 + i11 + i12;
    }

    public static ClassCastException i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String j(String str, long j) {
        return str + j;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(StringBuilder sb2, int i6, String str) {
        sb2.append(i6);
        sb2.append(str);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, long j, String str) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder p(int i6, int i10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i6);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap r(Class cls, xb.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map s(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public static void u(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void v(p pVar, y2.f0 f0Var) {
        f0Var.f(new r1.q(pVar));
    }

    public static /* synthetic */ boolean w(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String x(int i6) {
        switch (i6) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String y(int i6) {
        switch (i6) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static void z(i iVar, i iVar2) {
        if (iVar != iVar2) {
            if (iVar2 != null) {
                iVar2.c(null);
            }
            if (iVar != null) {
                iVar.d(null);
            }
        }
    }
}
