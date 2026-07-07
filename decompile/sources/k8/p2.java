package k8;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7697v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f7698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u2 f7699x;

    public /* synthetic */ p2(u2 u2Var, Bundle bundle, int i) {
        this.f7697v = i;
        this.f7698w = bundle;
        this.f7699x = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7697v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                u2 u2Var = this.f7699x;
                u2Var.D();
                u2Var.E();
                Bundle bundle = this.f7698w;
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                t7.y.d(string);
                t7.y.d(string2);
                t7.y.g(bundle.get("value"));
                p1 p1Var = (p1) u2Var.f2053w;
                if (!p1Var.b()) {
                    v0 v0Var = p1Var.A;
                    p1.l(v0Var);
                    v0Var.J.a("Conditional property not set since app measurement is disabled");
                } else {
                    q4 q4Var = new q4(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        t4 t4Var = p1Var.D;
                        p1.j(t4Var);
                        bundle.getString("app_id");
                        v vVarL0 = t4Var.l0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        p1.j(t4Var);
                        bundle.getString("app_id");
                        v vVarL02 = t4Var.l0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        p1Var.o().W(new e(bundle.getString("app_id"), string2, q4Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), vVarL02, bundle.getLong("trigger_timeout"), vVarL0, bundle.getLong("time_to_live"), t4Var.l0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                u2 u2Var2 = this.f7699x;
                u2Var2.D();
                u2Var2.E();
                Bundle bundle2 = this.f7698w;
                String string3 = bundle2.getString("name");
                t7.y.d(string3);
                p1 p1Var2 = (p1) u2Var2.f2053w;
                if (!p1Var2.b()) {
                    v0 v0Var2 = p1Var2.A;
                    p1.l(v0Var2);
                    v0Var2.J.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    q4 q4Var2 = new q4(0L, null, string3, "");
                    try {
                        t4 t4Var2 = p1Var2.D;
                        p1.j(t4Var2);
                        bundle2.getString("app_id");
                        p1Var2.o().W(new e(bundle2.getString("app_id"), "", q4Var2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), t4Var2.l0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                u2 u2Var3 = this.f7699x;
                s5.c cVar = u2Var3.R;
                p1 p1Var3 = (p1) u2Var3.f2053w;
                Bundle bundle3 = this.f7698w;
                if (!bundle3.isEmpty()) {
                    d1 d1Var = p1Var3.f7696z;
                    t4 t4Var3 = p1Var3.D;
                    g gVar = p1Var3.f7695y;
                    v0 v0Var3 = p1Var3.A;
                    p1.j(d1Var);
                    Bundle bundle4 = new Bundle(d1Var.U.I());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            p1.j(t4Var3);
                            if (t4.Q0(obj)) {
                                t4.V(cVar, null, 27, null, null, 0);
                            }
                            p1.l(v0Var3);
                            v0Var3.G.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (t4.i0(str)) {
                            p1.l(v0Var3);
                            v0Var3.G.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            p1.j(t4Var3);
                            gVar.getClass();
                            if (t4Var3.H("param", str, 500, obj)) {
                                t4Var3.U(bundle4, str, obj);
                            }
                        }
                    }
                    p1.j(t4Var3);
                    t4 t4Var4 = ((p1) gVar.f2053w).D;
                    p1.j(t4Var4);
                    int i = t4Var4.o0(201500000) ? 100 : 25;
                    if (bundle4.size() > i) {
                        int i10 = 0;
                        for (String str2 : new TreeSet(bundle4.keySet())) {
                            i10++;
                            if (i10 > i) {
                                bundle4.remove(str2);
                            }
                        }
                        p1.j(t4Var3);
                        t4.V(cVar, null, 26, null, null, 0);
                        p1.l(v0Var3);
                        v0Var3.G.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                d1 d1Var2 = p1Var3.f7696z;
                p1.j(d1Var2);
                d1Var2.U.J(bundle3);
                p1Var3.o().I(bundle3);
                break;
        }
    }
}
