package n9;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i2 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9348x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Bundle f9349y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m2 f9350z;

    public /* synthetic */ i2(m2 m2Var, Bundle bundle, int i6) {
        this.f9348x = i6;
        this.f9349y = bundle;
        this.f9350z = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        int i6;
        switch (this.f9348x) {
            case 0:
                m2 m2Var = this.f9350z;
                m2Var.d1();
                m2Var.e1();
                Bundle bundle2 = this.f9349y;
                String string = bundle2.getString(MediationMetaData.KEY_NAME);
                String string2 = bundle2.getString("origin");
                w8.x.d(string);
                w8.x.d(string2);
                w8.x.g(bundle2.get("value"));
                n1 n1Var = (n1) m2Var.f4301y;
                if (!n1Var.a()) {
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.L.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                g4 g4Var = new g4(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                try {
                    j4 j4Var = n1Var.F;
                    n1.e(j4Var);
                    bundle2.getString("app_id");
                    v G1 = j4Var.G1(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                    n1.e(j4Var);
                    bundle2.getString("app_id");
                    v G12 = j4Var.G1(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                    bundle2.getString("app_id");
                    n1Var.j().w1(new e(bundle2.getString("app_id"), string2, g4Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), G12, bundle2.getLong("trigger_timeout"), G1, bundle2.getLong("time_to_live"), j4Var.G1(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                m2 m2Var2 = this.f9350z;
                m2Var2.d1();
                m2Var2.e1();
                Bundle bundle3 = this.f9349y;
                String string3 = bundle3.getString(MediationMetaData.KEY_NAME);
                w8.x.d(string3);
                n1 n1Var2 = (n1) m2Var2.f4301y;
                if (!n1Var2.a()) {
                    u0 u0Var2 = n1Var2.C;
                    n1.g(u0Var2);
                    u0Var2.L.a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                g4 g4Var2 = new g4(0L, null, string3, HttpUrl.FRAGMENT_ENCODE_SET);
                try {
                    j4 j4Var2 = n1Var2.F;
                    n1.e(j4Var2);
                    bundle3.getString("app_id");
                    n1Var2.j().w1(new e(bundle3.getString("app_id"), HttpUrl.FRAGMENT_ENCODE_SET, g4Var2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), j4Var2.G1(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), HttpUrl.FRAGMENT_ENCODE_SET, bundle3.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            default:
                m2 m2Var3 = this.f9350z;
                lc.c cVar = m2Var3.U;
                n1 n1Var3 = (n1) m2Var3.f4301y;
                Bundle bundle4 = this.f9349y;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    c1 c1Var = n1Var3.B;
                    j4 j4Var3 = n1Var3.F;
                    g gVar = n1Var3.A;
                    u0 u0Var3 = n1Var3.C;
                    n1.e(c1Var);
                    bundle = new Bundle(c1Var.W.C());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            n1.e(j4Var3);
                            if (j4.m2(obj)) {
                                j4.t1(cVar, null, 27, null, null, 0);
                            }
                            n1.g(u0Var3);
                            u0Var3.I.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (j4.C1(str)) {
                            n1.g(u0Var3);
                            u0Var3.I.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            n1.e(j4Var3);
                            gVar.getClass();
                            if (j4Var3.n2("param", str, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, obj)) {
                                j4Var3.s1(bundle, str, obj);
                            }
                        }
                    }
                    n1.e(j4Var3);
                    j4 j4Var4 = ((n1) gVar.f4301y).F;
                    n1.e(j4Var4);
                    if (j4Var4.J1(201500000)) {
                        i6 = 100;
                    } else {
                        i6 = 25;
                    }
                    if (bundle.size() > i6) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i10++;
                            if (i10 > i6) {
                                bundle.remove(str2);
                            }
                        }
                        n1.e(j4Var3);
                        j4.t1(cVar, null, 26, null, null, 0);
                        n1.g(u0Var3);
                        u0Var3.I.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                c1 c1Var2 = n1Var3.B;
                n1.e(c1Var2);
                c1Var2.W.E(bundle);
                if (!bundle4.isEmpty() || n1Var3.A.n1(null, e0.X0)) {
                    n1Var3.j().i1(bundle);
                    return;
                }
                return;
        }
    }
}
