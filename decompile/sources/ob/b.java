package ob;

import android.os.Bundle;
import db.c1;
import db.e0;
import db.i0;
import db.k0;
import db.p0;
import db.r;
import n9.a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f10041a;

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f10042b;

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f10043c;

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f10044d;

    /* renamed from: e, reason: collision with root package name */
    public static final c1 f10045e;

    /* JADX WARN: Type inference failed for: r0v8, types: [db.e0, db.h0] */
    static {
        p0.m("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
        i0 i0Var = k0.f4008y;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        r.c(7, objArr);
        f10041a = k0.h(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        r.c(3, objArr2);
        f10042b = k0.h(3, objArr2);
        f10043c = k0.p("_r", "_dbg");
        ?? e0Var = new e0(4);
        e0Var.b(a2.f9165i);
        e0Var.b(a2.j);
        f10044d = e0Var.g();
        f10045e = k0.p("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, Bundle bundle) {
        if (!f10041a.contains(str)) {
            if (bundle != null) {
                c1 c1Var = f10043c;
                int i6 = c1Var.A;
                int i10 = 0;
                while (i10 < i6) {
                    boolean containsKey = bundle.containsKey((String) c1Var.get(i10));
                    i10++;
                    if (containsKey) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
            } else if (!f10044d.contains(str2)) {
                c1 c1Var = f10045e;
                int i6 = c1Var.A;
                int i10 = 0;
                while (i10 < i6) {
                    boolean matches = str2.matches((String) c1Var.get(i10));
                    i10++;
                    if (matches) {
                    }
                }
                return true;
            }
        } else if (str.equals("fcm") || str.equals("frc")) {
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f10042b.contains(str) && bundle != null) {
            c1 c1Var = f10043c;
            int i6 = c1Var.A;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    boolean containsKey = bundle.containsKey((String) c1Var.get(i10));
                    i10++;
                    if (containsKey) {
                        break;
                    }
                } else {
                    int hashCode = str.hashCode();
                    if (hashCode != 101200) {
                        if (hashCode != 101230) {
                            if (hashCode == 3142703 && str.equals("fiam")) {
                                bundle.putString("_cis", "fiam_integration");
                                return true;
                            }
                        } else if (str.equals("fdl")) {
                            bundle.putString("_cis", "fdl_integration");
                            return true;
                        }
                    } else if (str.equals("fcm")) {
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
